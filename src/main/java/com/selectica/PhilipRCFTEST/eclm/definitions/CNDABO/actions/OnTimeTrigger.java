package com.selectica.PhilipRCFTEST.eclm.definitions.CNDABO.actions;

import com.selectica.PhilipRCFTEST.stubs.CNDADetails;
import com.selectica.System.stubs.ContractStats;
import com.selectica.config.Config;
import com.selectica.rcfscripts.AbstractBOWriteScript;
import com.selectica.rcfutils.RCFBundleWrapper;
import com.selectica.rcfutils.RCFServiceAPI;
import com.selectica.rcfutils.RCFUserWrapper;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Minutes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by vshilkin on 22/01/2015.
 */
public class OnTimeTrigger extends AbstractBOWriteScript<Boolean> {

    public static Logger logger = LoggerFactory.getLogger(OnTimeTrigger.class);
    public static final String NOTIFICATION_START_DAY = "NOTIFICATION_START_DAY";
    public static final String NOTIFICATION_FREQUENCY = "NOTIFICATION_FREQUENCY";

    @Override
    public Boolean process() throws Exception {
        sendEndContractNotification();
        updateManageStageStat();
        return true;
    }


    private void sendEndContractNotification() throws Exception {
        RCFBundleWrapper currentBundleWrapper = getHelper().getCurrentBundleWrapper();
        String currentTask = currentBundleWrapper.getActiveTaskName();
        if (!"Manage".equals(currentTask)) {
            return;
        }

        CNDADetails info = getHelper().getInfoComponentStub();
        DateTime endDate;
        String name = info.getName();

        DateTime lastNotificationDate;
        int startNotificationDay, notificationFrequency;
        startNotificationDay = Config.getIntProperty(NOTIFICATION_START_DAY);
        if (startNotificationDay <= 0 || startNotificationDay > 365) {
            startNotificationDay = 30;
        }
        notificationFrequency = Config.getIntProperty(NOTIFICATION_FREQUENCY);
        if (notificationFrequency <= 0 || notificationFrequency > startNotificationDay) {
            notificationFrequency = 5;
        }

        if (info.getEndDate() != null) {
            endDate = new DateTime(info.getEndDate().getTime()).withTimeAtStartOfDay();//end date with start of the day time
        } else {
            return;
        }

        DateTime now = DateTime.now();
        if (now.compareTo(endDate) > 0) {//contract already expired
            logger.debug(name + ": contract already expired");
            return;
        }

        if (info.getLastNotificationDate() != null) {
            lastNotificationDate = new DateTime(info.getLastNotificationDate().getTime()).withTimeAtStartOfDay();//end date with start of the day time
        } else {
            lastNotificationDate = new DateTime().withYear(1970);
        }

        Days notifyDays = Days.daysBetween(now, endDate);
        if (notifyDays.getDays() > startNotificationDay) {
            logger.debug(name + ": notify period has not came yet");
            return;
        }
        Days days = Days.daysBetween(lastNotificationDate, DateTime.now());

        if (days.getDays() >= notificationFrequency) {
            RCFUserWrapper rcfUserWrapper = getHelper().getRCFUserWrapper();
            boolean result = RCFServiceAPI.getInstance().sendEmail(rcfUserWrapper, "Contract_Expiration_Reminder", currentBundleWrapper, currentBundleWrapper.getOwnerEmail());
            if (result) {
                info.setLastNotificationDate(new Date(now.getMillis()));
                getHelper().saveComponent(info);
                logger.info("Send end contract notification letter for " + name);
            }
        }
        logger.debug(name + ": days since last notification " + days.getDays() + ". Notification frequency = " + notificationFrequency);
    }

    private void updateManageStageStat() throws Exception {
        String currentTask = getHelper().getCurrentBundleWrapper().getActiveTaskName();
        if (!"Manage".equals(currentTask)) {
            return;
        }
        CNDADetails info = getHelper().getInfoComponentStub();
        String name = info.getName();
        if (logger.isDebugEnabled()) {
            logger.debug("Process contract " + name);
        }

        ContractStats contractStats = getHelper().getComponentStub("ReqContractStats");
        if (contractStats == null) {
            logger.debug(name + ": no 'ReqContractStats' records!");
            return;
        }

        DateTime now = DateTime.now();
        DateTime manageStartDate = new DateTime(contractStats.getLastManageStartTime().getTime()).withTimeAtStartOfDay();//end date with start of the day time

        int minutes = Minutes.minutesBetween(manageStartDate, now).getMinutes();
        double tm = (double) minutes / (60 * 24);

        contractStats.setElapsedManageTime(tm);

        double req = getDoubleValue(contractStats.getElapsedRequestTime());
        double ass = getDoubleValue(contractStats.getElapsedAssembleTime());
        double col = getDoubleValue(contractStats.getElapsedCollaborateTime());
        double neg = getDoubleValue(contractStats.getElapsedNegotiateTime());
        double exe = getDoubleValue(contractStats.getElapsedExecuteTime());

        contractStats.setElapsedContractCycleTime(req + ass + col + neg + exe + tm);

        getHelper().saveComponent(contractStats);
        logger.debug("... OK");

    }

    private double getDoubleValue(Double bigValue) {
        if (bigValue == null) {
            return 0d;
        }
        return bigValue;
    }
}
