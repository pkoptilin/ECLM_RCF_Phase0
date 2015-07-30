package com.selectica.rcfdfs.eclm.definitions.RREPBO.RRepDetails.scripts;

import com.selectica.rcfscripts.AbstractDataWriteScript;

/**
 * Created by vshilkin on 21/01/2015.
 */
public class BundleDefPathForCreateScript extends AbstractDataWriteScript<String> {
    /*
            <![CDATA[
            result = "BundleDef:/DCPBO/";
            ]]>
     */
    @Override
    public String process() throws Exception {
        return "BundleDef:/DCPBO/";
    }
}
