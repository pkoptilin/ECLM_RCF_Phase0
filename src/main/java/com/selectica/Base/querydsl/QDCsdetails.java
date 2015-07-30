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
 * QDCsdetails is a Querydsl query type for QDCsdetails
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDCsdetails extends com.mysema.query.sql.RelationalPathBase<QDCsdetails> {

    private static final long serialVersionUID = -1822882529;

    public static final QDCsdetails dCsdetails = new QDCsdetails("D_CSDETAILS");

    public final NumberPath<Integer> addedclauses = createNumber("addedclauses", Integer.class);

    public final NumberPath<Integer> addlvendors = createNumber("addlvendors", Integer.class);

    public final NumberPath<Integer> agrcat = createNumber("agrcat", Integer.class);

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

    public final StringPath cpnamescpnamelist = createString("cpnamescpnamelist");

    public final StringPath cpstate = createString("cpstate");

    public final StringPath cpzip = createString("cpzip");

    public final StringPath descps = createString("descps");

    public final DateTimePath<java.util.Date> enddate = createDateTime("enddate", java.util.Date.class);

    public final NumberPath<Integer> entity = createNumber("entity", Integer.class);

    public final NumberPath<Integer> entitytype = createNumber("entitytype", Integer.class);

    public final NumberPath<Integer> evclauses = createNumber("evclauses", Integer.class);

    public final NumberPath<Integer> govlaw = createNumber("govlaw", Integer.class);

    public final NumberPath<Integer> intcollreq = createNumber("intcollreq", Integer.class);

    public final DateTimePath<java.util.Date> lastnotificationdate = createDateTime("lastnotificationdate", java.util.Date.class);

//    public final StringPath name = createString("name");

    public final NumberPath<Double> prdtotal = createNumber("prdtotal", Double.class);

    public final NumberPath<Integer> removedclauses = createNumber("removedclauses", Integer.class);

    public final StringPath renewed = createString("renewed");

    public final DateTimePath<java.util.Date> rennoticedate = createDateTime("rennoticedate", java.util.Date.class);

    public final NumberPath<Integer> rennoticeper = createNumber("rennoticeper", Integer.class);

    public final DateTimePath<java.util.Date> reqdate = createDateTime("reqdate", java.util.Date.class);

    public final NumberPath<Integer> requestor = createNumber("requestor", Integer.class);

    public final NumberPath<Double> sertotal = createNumber("sertotal", Double.class);

    public final DateTimePath<java.util.Date> startdate = createDateTime("startdate", java.util.Date.class);

    public final NumberPath<Integer> sysId = createNumber("sysId", Integer.class);

    public final NumberPath<Integer> term = createNumber("term", Integer.class);

    public final StringPath termcomm = createString("termcomm");

    public final NumberPath<Integer> termnotice = createNumber("termnotice", Integer.class);

    public final DateTimePath<java.util.Date> termnoticedate = createDateTime("termnoticedate", java.util.Date.class);

    public final NumberPath<Integer> termtype = createNumber("termtype", Integer.class);

    public final NumberPath<Integer> termwocause = createNumber("termwocause", Integer.class);

    public final NumberPath<Integer> thirdparty1 = createNumber("thirdparty1", Integer.class);

    public final NumberPath<Double> totalamt = createNumber("totalamt", Double.class);

    public final NumberPath<Integer> usedclauses = createNumber("usedclauses", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QDCsdetails> dCsdetails11Pk = createPrimaryKey(sysId);

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dCsdetails11EvclausesFk = createForeignKey(evclauses, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCsdetails11GovlawFk = createForeignKey(govlaw, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictMultiValue> dCsdetails11AgrcatFk = createForeignKey(agrcat, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCsdetails11Thirdparty1Fk = createForeignKey(thirdparty1, "ID");

    public final com.mysema.query.sql.ForeignKey<QSPoContact> dCsdetails11RequestorFk = createForeignKey(requestor, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dCsdetails11CpnameFk = createForeignKey(cpname, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCsdetails11AddlvendorsFk = createForeignKey(addlvendors, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCsdetails11AutorenewalFk = createForeignKey(autorenewal, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dCsdetails11AddedclausesFk = createForeignKey(addedclauses, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCsdetails11TermtypeFk = createForeignKey(termtype, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCsdetails11EntitytypeFk = createForeignKey(entitytype, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dCsdetails11SysIdFk = createForeignKey(sysId, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dCsdetail11RemovedclausesFk = createForeignKey(removedclauses, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCsdetails11EntityFk = createForeignKey(entity, "ID");

    public final com.mysema.query.sql.ForeignKey<QSGroups> dCsdetails11BussunitFk = createForeignKey(bussunit, "GROUP_ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCsdetail11ContractstatusFk = createForeignKey(contractstatus, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dCsdetail11ChangedclausesFk = createForeignKey(changedclauses, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCsdetails11AgrtypeFk = createForeignKey(agrtype, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dCsdetails11UsedclausesFk = createForeignKey(usedclauses, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCsdetails11TermwocauseFk = createForeignKey(termwocause, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCsdetails11IntcollreqFk = createForeignKey(intcollreq, "ID");

    public QDCsdetails(String variable) {
        super(QDCsdetails.class, forVariable(variable), "VZAKHARCHENKO", "D_CSDETAILS");
        addMetadata();
    }

    public QDCsdetails(String variable, String schema, String table) {
        super(QDCsdetails.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDCsdetails(Path<? extends QDCsdetails> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_CSDETAILS");
        addMetadata();
    }

    public QDCsdetails(PathMetadata<?> metadata) {
        super(QDCsdetails.class, metadata, "VZAKHARCHENKO", "D_CSDETAILS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(addedclauses, ColumnMetadata.named("ADDEDCLAUSES").withIndex(6).ofType(Types.DECIMAL).withSize(18));
        addMetadata(addlvendors, ColumnMetadata.named("ADDLVENDORS").withIndex(24).ofType(Types.DECIMAL).withSize(18));
        addMetadata(agrcat, ColumnMetadata.named("AGRCAT").withIndex(11).ofType(Types.DECIMAL).withSize(18));
        addMetadata(agrtype, ColumnMetadata.named("AGRTYPE").withIndex(10).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(autorenewal, ColumnMetadata.named("AUTORENEWAL").withIndex(31).ofType(Types.DECIMAL).withSize(18));
        addMetadata(autorenewalterm, ColumnMetadata.named("AUTORENEWALTERM").withIndex(32).ofType(Types.DECIMAL).withSize(18));
        addMetadata(bussunit, ColumnMetadata.named("BUSSUNIT").withIndex(9).ofType(Types.DECIMAL).withSize(18));
        addMetadata(changedclauses, ColumnMetadata.named("CHANGEDCLAUSES").withIndex(2).ofType(Types.DECIMAL).withSize(18));
        addMetadata(contractname, ColumnMetadata.named("CONTRACTNAME").withIndex(7).ofType(Types.VARCHAR).withSize(64));
        addMetadata(contractstatus, ColumnMetadata.named("CONTRACTSTATUS").withIndex(8).ofType(Types.DECIMAL).withSize(18));
        addMetadata(cpadr1, ColumnMetadata.named("CPADR1").withIndex(18).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpadr2, ColumnMetadata.named("CPADR2").withIndex(19).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpcity, ColumnMetadata.named("CPCITY").withIndex(20).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpctry, ColumnMetadata.named("CPCTRY").withIndex(23).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpname, ColumnMetadata.named("CPNAME").withIndex(15).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(cpnamescpnamelist, ColumnMetadata.named("CPNAMESCPNAMELIST").withIndex(16).ofType(Types.VARCHAR).withSize(64).notNull());
        addMetadata(cpstate, ColumnMetadata.named("CPSTATE").withIndex(21).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpzip, ColumnMetadata.named("CPZIP").withIndex(22).ofType(Types.VARCHAR).withSize(255));
        addMetadata(descps, ColumnMetadata.named("DESCPS").withIndex(40).ofType(Types.CLOB).withSize(4000));
        addMetadata(enddate, ColumnMetadata.named("ENDDATE").withIndex(29).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(entity, ColumnMetadata.named("ENTITY").withIndex(14).ofType(Types.DECIMAL).withSize(18));
        addMetadata(entitytype, ColumnMetadata.named("ENTITYTYPE").withIndex(17).ofType(Types.DECIMAL).withSize(18));
        addMetadata(evclauses, ColumnMetadata.named("EVCLAUSES").withIndex(4).ofType(Types.DECIMAL).withSize(18));
        addMetadata(govlaw, ColumnMetadata.named("GOVLAW").withIndex(25).ofType(Types.DECIMAL).withSize(18));
        addMetadata(intcollreq, ColumnMetadata.named("INTCOLLREQ").withIndex(45).ofType(Types.DECIMAL).withSize(18));
        addMetadata(lastnotificationdate, ColumnMetadata.named("LASTNOTIFICATIONDATE").withIndex(30).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
//        addMetadata(name, ColumnMetadata.named("NAME").withIndex(1).ofType(Types.VARCHAR).withSize(255));
        addMetadata(prdtotal, ColumnMetadata.named("PRDTOTAL").withIndex(41).ofType(Types.DECIMAL).withSize(15).withDigits(2));
        addMetadata(removedclauses, ColumnMetadata.named("REMOVEDCLAUSES").withIndex(5).ofType(Types.DECIMAL).withSize(18));
        addMetadata(renewed, ColumnMetadata.named("RENEWED").withIndex(35).ofType(Types.VARCHAR).withSize(255));
        addMetadata(rennoticedate, ColumnMetadata.named("RENNOTICEDATE").withIndex(34).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(rennoticeper, ColumnMetadata.named("RENNOTICEPER").withIndex(33).ofType(Types.DECIMAL).withSize(18));
        addMetadata(reqdate, ColumnMetadata.named("REQDATE").withIndex(13).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(requestor, ColumnMetadata.named("REQUESTOR").withIndex(12).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sertotal, ColumnMetadata.named("SERTOTAL").withIndex(42).ofType(Types.DECIMAL).withSize(15).withDigits(2));
        addMetadata(startdate, ColumnMetadata.named("STARTDATE").withIndex(26).ofType(Types.TIMESTAMP).withSize(11).withDigits(6).notNull());
        addMetadata(sysId, ColumnMetadata.named("SYS_ID").withIndex(46).ofType(Types.DECIMAL).withSize(7).notNull());
        addMetadata(term, ColumnMetadata.named("TERM").withIndex(28).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(termcomm, ColumnMetadata.named("TERMCOMM").withIndex(39).ofType(Types.CLOB).withSize(4000));
        addMetadata(termnotice, ColumnMetadata.named("TERMNOTICE").withIndex(37).ofType(Types.DECIMAL).withSize(18));
        addMetadata(termnoticedate, ColumnMetadata.named("TERMNOTICEDATE").withIndex(38).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(termtype, ColumnMetadata.named("TERMTYPE").withIndex(27).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(termwocause, ColumnMetadata.named("TERMWOCAUSE").withIndex(36).ofType(Types.DECIMAL).withSize(18));
        addMetadata(thirdparty1, ColumnMetadata.named("THIRDPARTY1").withIndex(44).ofType(Types.DECIMAL).withSize(18));
        addMetadata(totalamt, ColumnMetadata.named("TOTALAMT").withIndex(43).ofType(Types.DECIMAL).withSize(15).withDigits(2));
        addMetadata(usedclauses, ColumnMetadata.named("USEDCLAUSES").withIndex(3).ofType(Types.DECIMAL).withSize(18));
    }

}

