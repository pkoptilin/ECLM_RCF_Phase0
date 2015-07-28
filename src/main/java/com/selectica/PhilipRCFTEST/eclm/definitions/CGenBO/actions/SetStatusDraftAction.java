package com.selectica.PhilipRCFTEST.eclm.definitions.CGenBO.actions;

import com.selectica.PhilipRCFTEST.eclm.definitions.ContractStatus;
import com.selectica.PhilipRCFTEST.stubs.CGenDetails;
import com.selectica.rcfscripts.AbstractBOWriteScript;

/**
 * Created by vshilkin on 08/01/2015.
 */
public class SetStatusDraftAction extends AbstractBOWriteScript<Boolean> {
    /*
                thisComponent.setValue("CGenData/ReqCGenDetails/contractStatus","Draft");
                thisComponent.save();
     */
    @Override
    public Boolean process() throws Exception {
        CGenDetails info = getHelper().getInfoComponentStub();
        info.setContractStatus(ContractStatus.DRAFT.getStatus());
        return getHelper().saveComponent(info);
    }
}
