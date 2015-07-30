package com.selectica.Base.navfilter.dashboard;

import com.mysema.query.types.expr.BooleanExpression;
import com.selectica.error.BaseException;
import com.selectica.expression.FQNodeEvaluator;
import com.selectica.mcp.sql.query.QModelType;
import com.selectica.mcp.sql.query.QModelTypeFactory;
import com.selectica.mcp.sql.query.StaticSQLQueryMCPExpression;
import com.selectica.spring.domain.querydsl.QSBobject;
import com.selectica.wf.WFEventType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vshilkin on 07.07.2015.
 */
public class MyOpenTasksFilter extends StaticSQLQueryMCPExpression {

    /*
                                <![CDATA[
                            var taskName = thisBundle.getValue("activeTaskName");
                            var currTask = thisBundle.getCurrentTask();
                            var nonContrCond = true;
                            if (!thisBundle.isContract()) {
                                nonContrCond = currTask.isAPartOfApproval();
                            }
                            result = taskName != 'Complete' && taskName != 'Manage' && nonContrCond;
                            ]]>

     */

    @Override
    public List<QModelType> evaluateExpression(FQNodeEvaluator ec) throws BaseException {

        ec.overridePermissionEvents(
                WFEventType.TASK_COMPONENT_ADD_TAG,
                WFEventType.TASK_APPROVED_TAG,
                WFEventType.TASK_COMPLETED_TAG,
                WFEventType.TASK_RMI_ANSWER_TAG,
                WFEventType.TASK_RMI_CANCEL_TAG);

        List<QModelType> qModelTypes = new ArrayList<QModelType>();
        BooleanExpression expression = QSBobject.sBobject.stage.ne("Manage").and(QSBobject.sBobject.usageType.eq("Contract").or(QSBobject.sBobject.approvalFlag.eq("Y")));

        QModelType e = QModelTypeFactory.buildQModelType(QSBobject.sBobject,
                null, expression, QSBobject.sBobject.id, null);
        qModelTypes.add(e);
        return qModelTypes;
    }
}
