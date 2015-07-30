package com.selectica.Base.navfilter.dashboard;

import com.mysema.query.JoinType;
import com.mysema.query.sql.RelationalPathBase;
import com.mysema.query.types.path.NumberPath;
import com.selectica.Base.querydsl.*;
import com.selectica.accountmanagement.PreferenceDoesNotExistException;
import com.selectica.accountmanagement.PreferencesManager;
import com.selectica.accountmanagement.UserEntity;
import com.selectica.db.structure.querydsl.JoinTable;
import com.selectica.error.BaseException;
import com.selectica.expression.FQNodeEvaluator;
import com.selectica.mcp.sql.query.QModelType;
import com.selectica.mcp.sql.query.QModelTypeFactory;
import com.selectica.mcp.sql.query.StaticSQLQueryMCPExpression;
import com.selectica.spring.domain.querydsl.QSBobject;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by vshilkin on 08.07.2015.
 */
public class AlertsFilter extends StaticSQLQueryMCPExpression {

    private static final String ALERT_EXTENSION_PREFERENCES = "ReqPreferencesInfo/dashboardAlertExtension";


    @Override
    public List<QModelType> evaluateExpression(FQNodeEvaluator ec) throws BaseException {
        UserEntity user = ec.getUser();
        List<QModelType> qModelFilterTypes = new ArrayList<QModelType>();

        DateTime now = DateTime.now();
        DateTime todayStart = now.withDayOfMonth(1).withTimeAtStartOfDay();

        int extension = getPreferencesInfoDashboardAlertExtension(user);
        DateTime extensionStart = todayStart.plusDays(extension).withTimeAtStartOfDay();

        Date today = now.toDate();
        Date extensionStartDate = todayStart.toDate();
        Date extensionEndDate = extensionStart.toDate();

        qModelFilterTypes.add(buildQModel(QDCndadetails.dCndadetails, QDCndadetails.dCndadetails.sysId, today, extensionStartDate, extensionEndDate));
        qModelFilterTypes.add(buildQModel(QDCpdetails.dCpdetails, QDCpdetails.dCpdetails.sysId, today, extensionStartDate, extensionEndDate));
        qModelFilterTypes.add(buildQModel(QDCsdetails.dCsdetails, QDCsdetails.dCsdetails.sysId, today, extensionStartDate, extensionEndDate));
        qModelFilterTypes.add(buildQModel(QDCgendetails.dCgendetails, QDCgendetails.dCgendetails.sysId, today, extensionStartDate, extensionEndDate));
        qModelFilterTypes.add(buildQModel(QDCfr1details.dCfr1details, QDCfr1details.dCfr1details.sysId, today, extensionStartDate, extensionEndDate));
        qModelFilterTypes.add(buildQModel(QDRrepdetails.dRrepdetails, QDRrepdetails.dRrepdetails.sysId, today, extensionStartDate, extensionEndDate));

        return qModelFilterTypes;
    }

    private QModelType buildQModel(RelationalPathBase joinTable, NumberPath<Integer> sysColumn, Date today, Date extensionStartDate, Date extensionEndDate) {
        JoinTable[] joinTables = new JoinTable[]{
                new JoinTable(JoinType.INNERJOIN, joinTable, sysColumn.eq(QSBobject.sBobject.id)),
                new JoinTable(JoinType.INNERJOIN, QDReminder.dReminder,
                        sysColumn.eq(QDReminder.dReminder.sysBobjectid)
                                .and(QDReminder.dReminder.notificationdate.loe(today))
                                .and(QDReminder.dReminder.resolvedeventdate.goe(extensionStartDate))
                                .and(QDReminder.dReminder.resolvedeventdate.loe(extensionEndDate))
                )
        };
        return QModelTypeFactory.buildQModelType(QSBobject.sBobject, joinTables, null, QSBobject.sBobject.id, null);
    }


    private int getPreferencesInfoDashboardAlertExtension(UserEntity uEntity) {
        try {
            return PreferencesManager.getInstance().getPreferenceIntValue(uEntity, ALERT_EXTENSION_PREFERENCES);
        } catch (PreferenceDoesNotExistException e) {
            return 0;
        }
    }

}

