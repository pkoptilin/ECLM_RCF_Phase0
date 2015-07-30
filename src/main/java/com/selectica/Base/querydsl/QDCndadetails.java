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
 * QDCndadetails is a Querydsl query type for QDCndadetails
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDCndadetails extends com.mysema.query.sql.RelationalPathBase<QDCndadetails> {

    private static final long serialVersionUID = 1966991655;

    public static final QDCndadetails dCndadetails = new QDCndadetails("D_CNDADETAILS");

    public final NumberPath<Integer> addedclauses = createNumber("addedclauses", Integer.class);

    public final NumberPath<Integer> agrtype = createNumber("agrtype", Integer.class);

    public final NumberPath<Integer> bussunit = createNumber("bussunit", Integer.class);

    public final NumberPath<Integer> changedclauses = createNumber("changedclauses", Integer.class);

    public final NumberPath<Integer> confterm = createNumber("confterm", Integer.class);

    public final StringPath contractname = createString("contractname");

    public final NumberPath<Integer> contractstatus = createNumber("contractstatus", Integer.class);

    public final StringPath cpadr1 = createString("cpadr1");

    public final StringPath cpadr2 = createString("cpadr2");

    public final StringPath cpcity = createString("cpcity");

    public final StringPath cpctry = createString("cpctry");

    public final NumberPath<Integer> cpname = createNumber("cpname", Integer.class);

    public final StringPath cpnamendacpnamelist = createString("cpnamendacpnamelist");

    public final StringPath cpstate = createString("cpstate");

    public final StringPath cpzip = createString("cpzip");

    public final DateTimePath<java.util.Date> enddate = createDateTime("enddate", java.util.Date.class);

    public final NumberPath<Integer> entity = createNumber("entity", Integer.class);

    public final NumberPath<Integer> entitytype = createNumber("entitytype", Integer.class);

    public final NumberPath<Integer> evclauses = createNumber("evclauses", Integer.class);

    public final NumberPath<Integer> govlaw = createNumber("govlaw", Integer.class);

    public final StringPath infdisc = createString("infdisc");

    public final NumberPath<Integer> isstandardcontract = createNumber("isstandardcontract", Integer.class);

    public final DateTimePath<java.util.Date> lastnotificationdate = createDateTime("lastnotificationdate", java.util.Date.class);

//    public final StringPath name = createString("name");

    public final NumberPath<Integer> removedclauses = createNumber("removedclauses", Integer.class);

    public final DateTimePath<java.util.Date> reqdate = createDateTime("reqdate", java.util.Date.class);

    public final NumberPath<Integer> requestor = createNumber("requestor", Integer.class);

    public final DateTimePath<java.util.Date> startdate = createDateTime("startdate", java.util.Date.class);

    public final NumberPath<Integer> sysId = createNumber("sysId", Integer.class);

    public final NumberPath<Integer> term = createNumber("term", Integer.class);

    public final NumberPath<Integer> termtype = createNumber("termtype", Integer.class);

    public final NumberPath<Integer> thirdparty1 = createNumber("thirdparty1", Integer.class);

    public final NumberPath<Integer> usedclauses = createNumber("usedclauses", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QDCndadetails> dCndadetails13Pk = createPrimaryKey(sysId);

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dCndadetail13AddedclausesFk = createForeignKey(addedclauses, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCndadetails13AgrtypeFk = createForeignKey(agrtype, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCndadetails13Thirdparty1Fk = createForeignKey(thirdparty1, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dCndadetails13SysIdFk = createForeignKey(sysId, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dCndadetails13CpnameFk = createForeignKey(cpname, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCnda13IsstandardcontractFk = createForeignKey(isstandardcontract, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dCndadeta13ChangedclausesFk = createForeignKey(changedclauses, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCndadeta13ContractstatusFk = createForeignKey(contractstatus, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCndadetails13EntityFk = createForeignKey(entity, "ID");

    public final com.mysema.query.sql.ForeignKey<QSPoContact> dCndadetails13RequestorFk = createForeignKey(requestor, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dCndadetails13UsedclausesFk = createForeignKey(usedclauses, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCndadetails13GovlawFk = createForeignKey(govlaw, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCndadetails13TermtypeFk = createForeignKey(termtype, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dCndadetails13EvclausesFk = createForeignKey(evclauses, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCndadetails13EntitytypeFk = createForeignKey(entitytype, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dCndadeta13RemovedclausesFk = createForeignKey(removedclauses, "ID");

    public final com.mysema.query.sql.ForeignKey<QSGroups> dCndadetails13BussunitFk = createForeignKey(bussunit, "GROUP_ID");

    public QDCndadetails(String variable) {
        super(QDCndadetails.class, forVariable(variable), "VZAKHARCHENKO", "D_CNDADETAILS");
        addMetadata();
    }

    public QDCndadetails(String variable, String schema, String table) {
        super(QDCndadetails.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDCndadetails(Path<? extends QDCndadetails> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_CNDADETAILS");
        addMetadata();
    }

    public QDCndadetails(PathMetadata<?> metadata) {
        super(QDCndadetails.class, metadata, "VZAKHARCHENKO", "D_CNDADETAILS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(addedclauses, ColumnMetadata.named("ADDEDCLAUSES").withIndex(6).ofType(Types.DECIMAL).withSize(18));
        addMetadata(agrtype, ColumnMetadata.named("AGRTYPE").withIndex(11).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(bussunit, ColumnMetadata.named("BUSSUNIT").withIndex(10).ofType(Types.DECIMAL).withSize(18));
        addMetadata(changedclauses, ColumnMetadata.named("CHANGEDCLAUSES").withIndex(2).ofType(Types.DECIMAL).withSize(18));
        addMetadata(confterm, ColumnMetadata.named("CONFTERM").withIndex(30).ofType(Types.DECIMAL).withSize(18));
        addMetadata(contractname, ColumnMetadata.named("CONTRACTNAME").withIndex(7).ofType(Types.VARCHAR).withSize(64));
        addMetadata(contractstatus, ColumnMetadata.named("CONTRACTSTATUS").withIndex(8).ofType(Types.DECIMAL).withSize(18));
        addMetadata(cpadr1, ColumnMetadata.named("CPADR1").withIndex(18).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpadr2, ColumnMetadata.named("CPADR2").withIndex(19).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpcity, ColumnMetadata.named("CPCITY").withIndex(20).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpctry, ColumnMetadata.named("CPCTRY").withIndex(23).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpname, ColumnMetadata.named("CPNAME").withIndex(15).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(cpnamendacpnamelist, ColumnMetadata.named("CPNAMENDACPNAMELIST").withIndex(16).ofType(Types.VARCHAR).withSize(64).notNull());
        addMetadata(cpstate, ColumnMetadata.named("CPSTATE").withIndex(21).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpzip, ColumnMetadata.named("CPZIP").withIndex(22).ofType(Types.VARCHAR).withSize(255));
        addMetadata(enddate, ColumnMetadata.named("ENDDATE").withIndex(28).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(entity, ColumnMetadata.named("ENTITY").withIndex(14).ofType(Types.DECIMAL).withSize(18));
        addMetadata(entitytype, ColumnMetadata.named("ENTITYTYPE").withIndex(17).ofType(Types.DECIMAL).withSize(18));
        addMetadata(evclauses, ColumnMetadata.named("EVCLAUSES").withIndex(4).ofType(Types.DECIMAL).withSize(18));
        addMetadata(govlaw, ColumnMetadata.named("GOVLAW").withIndex(24).ofType(Types.DECIMAL).withSize(18));
        addMetadata(infdisc, ColumnMetadata.named("INFDISC").withIndex(31).ofType(Types.CLOB).withSize(4000));
        addMetadata(isstandardcontract, ColumnMetadata.named("ISSTANDARDCONTRACT").withIndex(9).ofType(Types.DECIMAL).withSize(18));
        addMetadata(lastnotificationdate, ColumnMetadata.named("LASTNOTIFICATIONDATE").withIndex(29).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
//        addMetadata(name, ColumnMetadata.named("NAME").withIndex(1).ofType(Types.VARCHAR).withSize(255));
        addMetadata(removedclauses, ColumnMetadata.named("REMOVEDCLAUSES").withIndex(5).ofType(Types.DECIMAL).withSize(18));
        addMetadata(reqdate, ColumnMetadata.named("REQDATE").withIndex(13).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(requestor, ColumnMetadata.named("REQUESTOR").withIndex(12).ofType(Types.DECIMAL).withSize(18));
        addMetadata(startdate, ColumnMetadata.named("STARTDATE").withIndex(25).ofType(Types.TIMESTAMP).withSize(11).withDigits(6).notNull());
        addMetadata(sysId, ColumnMetadata.named("SYS_ID").withIndex(33).ofType(Types.DECIMAL).withSize(7).notNull());
        addMetadata(term, ColumnMetadata.named("TERM").withIndex(27).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(termtype, ColumnMetadata.named("TERMTYPE").withIndex(26).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(thirdparty1, ColumnMetadata.named("THIRDPARTY1").withIndex(32).ofType(Types.DECIMAL).withSize(18));
        addMetadata(usedclauses, ColumnMetadata.named("USEDCLAUSES").withIndex(3).ofType(Types.DECIMAL).withSize(18));
    }

}

