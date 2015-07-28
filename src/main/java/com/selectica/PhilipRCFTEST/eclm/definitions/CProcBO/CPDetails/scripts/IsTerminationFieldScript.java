package com.selectica.PhilipRCFTEST.eclm.definitions.CProcBO.CPDetails.scripts;

import com.selectica.PhilipRCFTEST.stubs.CPDetails;
import com.selectica.rcfscripts.AbstractDataReadScript;

/**
 * Created by vshilkin on 24/12/2014.
 */
public class IsTerminationFieldScript extends AbstractDataReadScript<Boolean> {
    /*
            result = thisComponent.getParameterValueObject("termwoCause") == 'yes';
     */
    @Override
    public Boolean process() throws Exception {
        CPDetails details = getHelper().getCurrentComponentStub();
        return details.getTermwoCause().equals("yes");
    }
}

