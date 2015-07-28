package com.selectica.PhilipRCFTEST.eclm.definitions.CSalesBO.conditions;

import com.selectica.PhilipRCFTEST.stubs.CSDetails;
import com.selectica.rcfscripts.AbstractBOReadScript;

/**
 * Created by vshilkin on 08/01/2015.
 */
public class NeedCollIntCondition extends AbstractBOReadScript<Boolean> {
    /*
                <![CDATA[
                result = thisBundle.getInfoValueObject("intCollReq") == 'yes'
                ]]>
     */
    @Override
    public Boolean process() throws Exception {
        CSDetails info = getHelper().getInfoComponentStub();
        return info.getIntCollReq() != null && info.getIntCollReq().equals("yes");
    }
}

