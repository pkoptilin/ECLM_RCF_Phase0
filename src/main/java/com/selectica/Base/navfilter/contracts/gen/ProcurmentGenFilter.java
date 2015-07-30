package com.selectica.Base.navfilter.contracts.gen;

import com.selectica.Base.querydsl.QDCgendetails;
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
public class ProcurmentGenFilter extends StaticSQLQueryMCPExpression {
    /*
                                <![CDATA[
                                result = thisBundle.getInfoValueObject("agrType") == 'Procurement';
                                ]]>
     */

    @Override
    public List<QModelType> evaluateExpression(FQNodeEvaluator ec) throws BaseException {
        List<QModelType> qModelFilterTypes = new ArrayList<QModelType>();

        QModelType modelType = RCFSQLHelper.buildDictionaryQModelType(QDCgendetails.dCgendetails, QDCgendetails.dCgendetails.sysId,
                new DictionaryFilterParam(QDCgendetails.dCgendetails.agrtype, "Procurement")
        );
        qModelFilterTypes.add(modelType);

        return qModelFilterTypes;
    }
}

