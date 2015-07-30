package com.selectica.Base.querydsl;

import com.mysema.query.sql.ColumnMetadata;
import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.DateTimePath;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.StringPath;
import com.selectica.spring.domain.querydsl.*;

import javax.annotation.Generated;
import java.sql.Types;

import static com.mysema.query.types.PathMetadataFactory.forVariable;


/**
 * QDCfr1details is a Querydsl query type for QDCfr1details
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDCfr1details extends com.mysema.query.sql.RelationalPathBase<QDCfr1details> {

    private static final long serialVersionUID = 1954023533;

    public static final QDCfr1details dCfr1details = new QDCfr1details("D_CFR1DETAILS");

    public final NumberPath<Integer> addedclauses = createNumber("addedclauses", Integer.class);

    public final NumberPath<Integer> agrtype = createNumber("agrtype", Integer.class);

    public final NumberPath<Integer> autorenewal = createNumber("autorenewal", Integer.class);

    public final NumberPath<Integer> autorenewalterm = createNumber("autorenewalterm", Integer.class);

    public final NumberPath<Integer> bussunit = createNumber("bussunit", Integer.class);

    public final NumberPath<Integer> changedclauses = createNumber("changedclauses", Integer.class);

    public final StringPath contractname = createString("contractname");

    public final NumberPath<Integer> contractstatus = createNumber("contractstatus", Integer.class);

    public final StringPath cpadr1 = createString("cpadr1");

    public final StringPath cpadr2 = createString("cpadr2");

    public final StringPath cpcity = createString("cpcity");

    public final StringPath cpctry = createString("cpctry");

    public final NumberPath<Integer> cpname = createNumber("cpname", Integer.class);

    public final StringPath cpnamefr1cpnamelist = createString("cpnamefr1cpnamelist");

    public final StringPath cpstate = createString("cpstate");

    public final StringPath cpzip = createString("cpzip");

    public final DateTimePath<java.util.Date> enddate = createDateTime("enddate", java.util.Date.class);

    public final NumberPath<Integer> entity = createNumber("entity", Integer.class);

    public final NumberPath<Integer> entitytype = createNumber("entitytype", Integer.class);

    public final NumberPath<Integer> evclauses = createNumber("evclauses", Integer.class);

    public final NumberPath<Integer> govlaw = createNumber("govlaw", Integer.class);

    public final NumberPath<Integer> intcollreq = createNumber("intcollreq", Integer.class);

    public final DateTimePath<java.util.Date> lastnotificationdate = createDateTime("lastnotificationdate", java.util.Date.class);

//    public final StringPath name = createString("name");

    public final NumberPath<Integer> removedclauses = createNumber("removedclauses", Integer.class);

    public final StringPath renewed = createString("renewed");

    public final DateTimePath<java.util.Date> rennoticedate = createDateTime("rennoticedate", java.util.Date.class);

    public final NumberPath<Integer> rennoticeper = createNumber("rennoticeper", Integer.class);

    public final DateTimePath<java.util.Date> reqdate = createDateTime("reqdate", java.util.Date.class);

    public final NumberPath<Integer> requestor = createNumber("requestor", Integer.class);

    public final DateTimePath<java.util.Date> startdate = createDateTime("startdate", java.util.Date.class);

    public final NumberPath<Integer> sysId = createNumber("sysId", Integer.class);

    public final NumberPath<Integer> term = createNumber("term", Integer.class);

    public final NumberPath<Integer> termtype = createNumber("termtype", Integer.class);

    public final NumberPath<Integer> thirdparty1 = createNumber("thirdparty1", Integer.class);

    public final NumberPath<Integer> usedclauses = createNumber("usedclauses", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QDCfr1details> dCfr1details13Pk = createPrimaryKey(sysId);

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCfr1details13IntcollreqFk = createForeignKey(intcollreq, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCfr1details13AutorenewalFk = createForeignKey(autorenewal, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dCfr1details13CpnameFk = createForeignKey(cpname, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dCfr1details13EvclausesFk = createForeignKey(evclauses, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dCfr1details13SysIdFk = createForeignKey(sysId, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dCfr1detail13AddedclausesFk = createForeignKey(addedclauses, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCfr1details13EntityFk = createForeignKey(entity, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dCfr1deta13ChangedclausesFk = createForeignKey(changedclauses, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dCfr1deta13RemovedclausesFk = createForeignKey(removedclauses, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCfr1details13EntitytypeFk = createForeignKey(entitytype, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCfr1deta13ContractstatusFk = createForeignKey(contractstatus, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCfr1details13TermtypeFk = createForeignKey(termtype, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCfr1details13AgrtypeFk = createForeignKey(agrtype, "ID");

    public final com.mysema.query.sql.ForeignKey<QSGroups> dCfr1details13BussunitFk = createForeignKey(bussunit, "GROUP_ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCfr1details13GovlawFk = createForeignKey(govlaw, "ID");

    public final com.mysema.query.sql.ForeignKey<QSPoContact> dCfr1details13RequestorFk = createForeignKey(requestor, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCfr1details13Thirdparty1Fk = createForeignKey(thirdparty1, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dCfr1details13UsedclausesFk = createForeignKey(usedclauses, "ID");

    public QDCfr1details(String variable) {
        super(QDCfr1details.class, forVariable(variable), "VZAKHARCHENKO", "D_CFR1DETAILS");
        addMetadata();
    }

    public QDCfr1details(String variable, String schema, String table) {
        super(QDCfr1details.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDCfr1details(Path<? extends QDCfr1details> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_CFR1DETAILS");
        addMetadata();
    }

    public QDCfr1details(PathMetadata<?> metadata) {
        super(QDCfr1details.class, metadata, "VZAKHARCHENKO", "D_CFR1DETAILS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(addedclauses, ColumnMetadata.named("ADDEDCLAUSES").withIndex(6).ofType(Types.DECIMAL).withSize(18));
        addMetadata(agrtype, ColumnMetadata.named("AGRTYPE").withIndex(10).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(autorenewal, ColumnMetadata.named("AUTORENEWAL").withIndex(29).ofType(Types.DECIMAL).withSize(18));
        addMetadata(autorenewalterm, ColumnMetadata.named("AUTORENEWALTERM").withIndex(30).ofType(Types.DECIMAL).withSize(18));
        addMetadata(bussunit, ColumnMetadata.named("BUSSUNIT").withIndex(9).ofType(Types.DECIMAL).withSize(18));
        addMetadata(changedclauses, ColumnMetadata.named("CHANGEDCLAUSES").withIndex(2).ofType(Types.DECIMAL).withSize(18));
        addMetadata(contractname, ColumnMetadata.named("CONTRACTNAME").withIndex(7).ofType(Types.VARCHAR).withSize(64));
        addMetadata(contractstatus, ColumnMetadata.named("CONTRACTSTATUS").withIndex(8).ofType(Types.DECIMAL).withSize(18));
        addMetadata(cpadr1, ColumnMetadata.named("CPADR1").withIndex(17).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpadr2, ColumnMetadata.named("CPADR2").withIndex(18).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpcity, ColumnMetadata.named("CPCITY").withIndex(19).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpctry, ColumnMetadata.named("CPCTRY").withIndex(22).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpname, ColumnMetadata.named("CPNAME").withIndex(14).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(cpnamefr1cpnamelist, ColumnMetadata.named("CPNAMEFR1CPNAMELIST").withIndex(15).ofType(Types.VARCHAR).withSize(64).notNull());
        addMetadata(cpstate, ColumnMetadata.named("CPSTATE").withIndex(20).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpzip, ColumnMetadata.named("CPZIP").withIndex(21).ofType(Types.VARCHAR).withSize(255));
        addMetadata(enddate, ColumnMetadata.named("ENDDATE").withIndex(27).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(entity, ColumnMetadata.named("ENTITY").withIndex(13).ofType(Types.DECIMAL).withSize(18));
        addMetadata(entitytype, ColumnMetadata.named("ENTITYTYPE").withIndex(16).ofType(Types.DECIMAL).withSize(18));
        addMetadata(evclauses, ColumnMetadata.named("EVCLAUSES").withIndex(4).ofType(Types.DECIMAL).withSize(18));
        addMetadata(govlaw, ColumnMetadata.named("GOVLAW").withIndex(23).ofType(Types.DECIMAL).withSize(18));
        addMetadata(intcollreq, ColumnMetadata.named("INTCOLLREQ").withIndex(35).ofType(Types.DECIMAL).withSize(18));
        addMetadata(lastnotificationdate, ColumnMetadata.named("LASTNOTIFICATIONDATE").withIndex(28).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
//        addMetadata(name, ColumnMetadata.named("NAME").withIndex(1).ofType(Types.VARCHAR).withSize(255));
        addMetadata(removedclauses, ColumnMetadata.named("REMOVEDCLAUSES").withIndex(5).ofType(Types.DECIMAL).withSize(18));
        addMetadata(renewed, ColumnMetadata.named("RENEWED").withIndex(33).ofType(Types.VARCHAR).withSize(255));
        addMetadata(rennoticedate, ColumnMetadata.named("RENNOTICEDATE").withIndex(32).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(rennoticeper, ColumnMetadata.named("RENNOTICEPER").withIndex(31).ofType(Types.DECIMAL).withSize(18));
        addMetadata(reqdate, ColumnMetadata.named("REQDATE").withIndex(12).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(requestor, ColumnMetadata.named("REQUESTOR").withIndex(11).ofType(Types.DECIMAL).withSize(18));
        addMetadata(startdate, ColumnMetadata.named("STARTDATE").withIndex(24).ofType(Types.TIMESTAMP).withSize(11).withDigits(6).notNull());
        addMetadata(sysId, ColumnMetadata.named("SYS_ID").withIndex(36).ofType(Types.DECIMAL).withSize(7).notNull());
        addMetadata(term, ColumnMetadata.named("TERM").withIndex(26).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(termtype, ColumnMetadata.named("TERMTYPE").withIndex(25).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(thirdparty1, ColumnMetadata.named("THIRDPARTY1").withIndex(34).ofType(Types.DECIMAL).withSize(18));
        addMetadata(usedclauses, ColumnMetadata.named("USEDCLAUSES").withIndex(3).ofType(Types.DECIMAL).withSize(18));
    }

}

