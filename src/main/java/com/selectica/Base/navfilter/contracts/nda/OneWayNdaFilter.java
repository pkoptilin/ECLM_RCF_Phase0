package com.selectica.Base.navfilter.contracts.nda;

import com.selectica.Base.querydsl.QDCndadetails;
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
public class OneWayNdaFilter extends StaticSQLQueryMCPExpression {
    /*
                                    <![CDATA[
                                result = thisBundle.getInfoValueObject("agrType") == 'One Way NDA';
                                ]]>

     */

    @Override
    public List<QModelType> evaluateExpression(FQNodeEvaluator ec) throws BaseException {
        List<QModelType> qModelFilterTypes = new ArrayList<QModelType>();

        QModelType modelType = RCFSQLHelper.buildDictionaryQModelType(QDCndadetails.dCndadetails, QDCndadetails.dCndadetails.sysId,
                new DictionaryFilterParam(QDCndadetails.dCndadetails.agrtype, "One Way NDA")
        );
        qModelFilterTypes.add(modelType);

        return qModelFilterTypes;
    }
}
