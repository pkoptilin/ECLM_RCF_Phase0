package com.selectica.Base.navfilter.contracts.sales;

import com.selectica.Base.querydsl.QDCsdetails;
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
public class WorkOrderSalesFilter extends StaticSQLQueryMCPExpression {
    /*
                                <![CDATA[
                                var agrType = thisBundle.getInfoValueObject("agrType");
                                result = agrType == 'Work Order';
                                ]]>

     */

    @Override
    public List<QModelType> evaluateExpression(FQNodeEvaluator ec) throws BaseException {
        List<QModelType> qModelFilterTypes = new ArrayList<QModelType>();

        QModelType modelType = RCFSQLHelper.buildDictionaryQModelType(QDCsdetails.dCsdetails, QDCsdetails.dCsdetails.sysId,
                new DictionaryFilterParam(QDCsdetails.dCsdetails.agrtype, "Work Order")
        );
        qModelFilterTypes.add(modelType);

        return qModelFilterTypes;
    }
}

