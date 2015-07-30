package com.selectica.Base.navfilter.clauses.fr1;

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
public class AllFr1ClausesFilter extends StaticSQLQueryMCPExpression {
    /*
                                <![CDATA[
                                result = thisBundle.getInfoValueObject("ContractTypeRef") == 'CFR1BO';
                                ]]>
     */

    @Override
    public List<QModelType> evaluateExpression(FQNodeEvaluator ec) throws BaseException {
        List<QModelType> qModelFilterTypes = new ArrayList<QModelType>();

        QModelType modelType = RCFSQLHelper.buildDictionaryQModelType(QDClauseattributes.dClauseattributes, QDClauseattributes.dClauseattributes.sysId,
                new DictionaryFilterParam(QDClauseattributes.dClauseattributes.contracttyperef, "CFR1BO")
        );
        qModelFilterTypes.add(modelType);

        return qModelFilterTypes;
    }
}

