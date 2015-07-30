package com.selectica.Base.navfilter.dashboard;

import com.mysema.query.JoinType;
import com.mysema.query.sql.RelationalPathBase;
import com.mysema.query.types.path.DateTimePath;
import com.mysema.query.types.path.NumberPath;
import com.selectica.Base.querydsl.*;
import com.selectica.db.structure.querydsl.JoinTable;
import com.selectica.error.BaseException;
import com.selectica.expression.FQNodeEvaluator;
import com.selectica.mcp.sql.query.QModelType;
import com.selectica.mcp.sql.query.QModelTypeFactory;
import com.selectica.mcp.sql.query.StaticSQLQueryMCPExpression;
import com.selectica.spring.domain.querydsl.QSBobject;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by vshilkin on 06.07.2015.
 */
public class ExpiringTodayContractsFilter extends StaticSQLQueryMCPExpression {

    @Override
    public List<QModelType> evaluateExpression(FQNodeEvaluator ec) throws BaseException {
        List<QModelType> qModelFilterTypes = new ArrayList<QModelType>();

        DateTime now = DateTime.now();
        DateTime todayStart = now.withTimeAtStartOfDay();
        DateTime tomorrowStart = now.plusDays(1).withTimeAtStartOfDay();

        Date min = todayStart.toDate();
        Date max = tomorrowStart.toDate();

        qModelFilterTypes.add(buildQModel(QDCndadetails.dCndadetails, QDCndadetails.dCndadetails.sysId, QDCndadetails.dCndadetails.enddate, min, max));
        qModelFilterTypes.add(buildQModel(QDCpdetails.dCpdetails, QDCpdetails.dCpdetails.sysId, QDCpdetails.dCpdetails.enddate, min, max));
        qModelFilterTypes.add(buildQModel(QDCsdetails.dCsdetails, QDCsdetails.dCsdetails.sysId, QDCsdetails.dCsdetails.enddate, min, max));
        qModelFilterTypes.add(buildQModel(QDCgendetails.dCgendetails, QDCgendetails.dCgendetails.sysId, QDCgendetails.dCgendetails.enddate, min, max));
        qModelFilterTypes.add(buildQModel(QDCfr1details.dCfr1details, QDCfr1details.dCfr1details.sysId, QDCfr1details.dCfr1details.enddate, min, max));
        qModelFilterTypes.add(buildQModel(QDRrepdetails.dRrepdetails, QDRrepdetails.dRrepdetails.sysId, QDRrepdetails.dRrepdetails.enddate, min, max));

        return qModelFilterTypes;
    }

    private QModelType buildQModel(RelationalPathBase joinTable, NumberPath<Integer> sysColumn, DateTimePath<Date> endDateColumn, Date min, Date max) {
        JoinTable[] joinTables = new JoinTable[]{
                new JoinTable(JoinType.INNERJOIN, joinTable, sysColumn.eq(QSBobject.sBobject.id))
        };
        return QModelTypeFactory.buildQModelType(QSBobject.sBobject, joinTables,
                endDateColumn.goe(min).and(endDateColumn.loe(max)), QSBobject.sBobject.id, null);
    }
}
