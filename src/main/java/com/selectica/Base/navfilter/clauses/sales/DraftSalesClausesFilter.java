package com.selectica.Base.navfilter.clauses.sales;

import com.selectica.System.querydsl.QDClauseattributes;
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
public class DraftSalesClausesFilter extends StaticSQLQueryMCPExpression {
    /*
                                <![CDATA[
                                result = thisBundle.getInfoValueObject("ClauseStatus") == 'draft' && thisBundle.getInfoValueObject("ContractTypeRef") == 'CSalesBO';
                                ]]>
     */

    @Override
    public List<QModelType> evaluateExpression(FQNodeEvaluator ec) throws BaseException {
        List<QModelType> qModelFilterTypes = new ArrayList<QModelType>();

        QModelType modelType = RCFSQLHelper.buildDictionaryQModelType(QDClauseattributes.dClauseattributes, QDClauseattributes.dClauseattributes.sysId,
                new DictionaryFilterParam(QDClauseattributes.dClauseattributes.contracttyperef, "CSalesBO"),
                new DictionaryFilterParam(QDClauseattributes.dClauseattributes.clausestatus, "draft")
        );
        qModelFilterTypes.add(modelType);

        return qModelFilterTypes;
    }
}

