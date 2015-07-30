package com.selectica.Base.navfilter.contracts.proc;

import com.selectica.Base.querydsl.QDCpdetails;
import com.selectica.error.BaseException;
import com.selectica.expression.FQNodeEvaluator;
import com.selectica.mcp.sql.query.QModelType;
import com.selectica.mcp.sql.query.StaticSQLQueryMCPExpression;
import com.selectica.rcfutils.DictionaryFilterParam;
import com.selectica.rcfutils.RCFSQLHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vshilkin on 06.07.2015.
 */
public class MasterProcFilter extends StaticSQLQueryMCPExpression {
    /*
                                <![CDATA[
                                var agrType = thisBundle.getInfoValueObject("agrType");
                                result = agrType == 'Master';
                                ]]>

     */

    @Override
    public List<QModelType> evaluateExpression(FQNodeEvaluator ec) throws BaseException {
        List<QModelType> qModelFilterTypes = new ArrayList<QModelType>();

        QModelType modelType = RCFSQLHelper.buildDictionaryQModelType(QDCpdetails.dCpdetails, QDCpdetails.dCpdetails.sysId,
                new DictionaryFilterParam(QDCpdetails.dCpdetails.agrtype, "Master")
        );
        qModelFilterTypes.add(modelType);

        return qModelFilterTypes;
    }
}
