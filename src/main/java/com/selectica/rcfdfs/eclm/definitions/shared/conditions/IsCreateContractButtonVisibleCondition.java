package com.selectica.rcfdfs.eclm.definitions.shared.conditions;

import com.selectica.rcfdfs.stubs.DirectoryInfoComponent;
import com.selectica.rcfscripts.AbstractBOReadScript;

/**
 * Created by vshilkin on 24/12/2014.
 */
public class IsCreateContractButtonVisibleCondition extends AbstractBOReadScript<Boolean> {

    @Override
    public Boolean process() throws Exception {
        DirectoryInfoComponent info = getHelper().getInfoComponentStub();
        String status = info.getDirStatus();
        return "Active".equals(status);
    }
}
