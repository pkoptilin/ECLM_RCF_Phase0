package com.selectica.Base.querydsl;

import com.mysema.query.sql.ColumnMetadata;
import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.DateTimePath;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.StringPath;
import com.selectica.spring.domain.querydsl.QSBobject;
import com.selectica.spring.domain.querydsl.QSDictValue;

import javax.annotation.Generated;
import java.sql.Types;

import static com.mysema.query.types.PathMetadataFactory.forVariable;


/**
 * QDSignature is a Querydsl query type for QDSignature
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDSignature extends com.mysema.query.sql.RelationalPathBase<QDSignature> {

    private static final long serialVersionUID = 1977587205;

    public static final QDSignature dSignature = new QDSignature("D_SIGNATURE");

    public final StringPath cancellink = createString("cancellink");

    public final StringPath ccreceiveremail = createString("ccreceiveremail");

    public final StringPath ccreceivername = createString("ccreceivername");

    public final DateTimePath<java.util.Date> cpprimsigndate = createDateTime("cpprimsigndate", java.util.Date.class);

    public final StringPath cpprimsignor = createString("cpprimsignor");

    public final StringPath cpprimsignoremail = createString("cpprimsignoremail");

    public final StringPath cpprimsignortitle = createString("cpprimsignortitle");

    public final DateTimePath<java.util.Date> cpsecsigndate = createDateTime("cpsecsigndate", java.util.Date.class);

    public final StringPath cpsecsignor = createString("cpsecsignor");

    public final StringPath cpsecsignoremail = createString("cpsecsignoremail");

    public final StringPath cpsecsignortitle = createString("cpsecsignortitle");

    public final NumberPath<Integer> docstatus = createNumber("docstatus", Integer.class);

    public final StringPath documents = createString("documents");

    public final StringPath esigndocdetails = createString("esigndocdetails");

    public final StringPath esigndockey = createString("esigndockey");

    public final DateTimePath<java.util.Date> intsecsigndate = createDateTime("intsecsigndate", java.util.Date.class);

    public final StringPath intsecsignor = createString("intsecsignor");

    public final StringPath intsecsignoremail = createString("intsecsignoremail");

    public final StringPath intsecsignortitle = createString("intsecsignortitle");

    public final DateTimePath<java.util.Date> intsigndate = createDateTime("intsigndate", java.util.Date.class);

    public final StringPath intsignor = createString("intsignor");

    public final StringPath intsignoremail = createString("intsignoremail");

    public final StringPath intsignortitle = createString("intsignortitle");

    public final DateTimePath<java.util.Date> lastupdatedate = createDateTime("lastupdatedate", java.util.Date.class);

    public final NumberPath<Integer> sysBobjectid = createNumber("sysBobjectid", Integer.class);

    public final DateTimePath<java.util.Date> sysCreatedtm = createDateTime("sysCreatedtm", java.util.Date.class);

    public final StringPath sysCreateevent = createString("sysCreateevent");

    public final NumberPath<Integer> sysCuserid = createNumber("sysCuserid", Integer.class);

    public final NumberPath<Integer> sysDataexmversion = createNumber("sysDataexmversion", Integer.class);

    public final StringPath sysDatedefpath = createString("sysDatedefpath");

    public final NumberPath<Integer> sysId = createNumber("sysId", Integer.class);

    public final DateTimePath<java.util.Date> sysModifydtm = createDateTime("sysModifydtm", java.util.Date.class);

    public final NumberPath<Integer> sysMuserid = createNumber("sysMuserid", Integer.class);

    public final NumberPath<Integer> sysParentid = createNumber("sysParentid", Integer.class);

    public final StringPath sysParenttablename = createString("sysParenttablename");

    public final NumberPath<Integer> sysSource = createNumber("sysSource", Integer.class);

    public final NumberPath<Integer> sysStatus = createNumber("sysStatus", Integer.class);

    public final StringPath taggerviewlink = createString("taggerviewlink");

    public final StringPath update = createString("update");

    public final StringPath updatestatus = createString("updatestatus");

    public final NumberPath<Integer> useesig = createNumber("useesig", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QDSignature> dSignature11Pk = createPrimaryKey(sysId);

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dSignature11DocstatusFk = createForeignKey(docstatus, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dSignature11SysBobjectidFk = createForeignKey(sysBobjectid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dSignature11UseesigFk = createForeignKey(useesig, "ID");

//    public final com.mysema.query.sql.ForeignKey<QSBobject> dSignature11SysParentidFk = createForeignKey(sysParentid, "ID");

    public QDSignature(String variable) {
        super(QDSignature.class, forVariable(variable), "VZAKHARCHENKO", "D_SIGNATURE");
        addMetadata();
    }

    public QDSignature(String variable, String schema, String table) {
        super(QDSignature.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDSignature(Path<? extends QDSignature> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_SIGNATURE");
        addMetadata();
    }

    public QDSignature(PathMetadata<?> metadata) {
        super(QDSignature.class, metadata, "VZAKHARCHENKO", "D_SIGNATURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cancellink, ColumnMetadata.named("CANCELLINK").withIndex(5).ofType(Types.VARCHAR).withSize(256));
        addMetadata(ccreceiveremail, ColumnMetadata.named("CCRECEIVEREMAIL").withIndex(28).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(ccreceivername, ColumnMetadata.named("CCRECEIVERNAME").withIndex(27).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpprimsigndate, ColumnMetadata.named("CPPRIMSIGNDATE").withIndex(11).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(cpprimsignor, ColumnMetadata.named("CPPRIMSIGNOR").withIndex(8).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpprimsignoremail, ColumnMetadata.named("CPPRIMSIGNOREMAIL").withIndex(9).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(cpprimsignortitle, ColumnMetadata.named("CPPRIMSIGNORTITLE").withIndex(10).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpsecsigndate, ColumnMetadata.named("CPSECSIGNDATE").withIndex(15).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(cpsecsignor, ColumnMetadata.named("CPSECSIGNOR").withIndex(12).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpsecsignoremail, ColumnMetadata.named("CPSECSIGNOREMAIL").withIndex(13).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(cpsecsignortitle, ColumnMetadata.named("CPSECSIGNORTITLE").withIndex(14).ofType(Types.VARCHAR).withSize(255));
        addMetadata(docstatus, ColumnMetadata.named("DOCSTATUS").withIndex(7).ofType(Types.DECIMAL).withSize(18));
        addMetadata(documents, ColumnMetadata.named("DOCUMENTS").withIndex(1).ofType(Types.CLOB).withSize(4000));
        addMetadata(esigndocdetails, ColumnMetadata.named("ESIGNDOCDETAILS").withIndex(25).ofType(Types.CLOB).withSize(4000));
        addMetadata(esigndockey, ColumnMetadata.named("ESIGNDOCKEY").withIndex(24).ofType(Types.VARCHAR).withSize(255));
        addMetadata(intsecsigndate, ColumnMetadata.named("INTSECSIGNDATE").withIndex(23).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(intsecsignor, ColumnMetadata.named("INTSECSIGNOR").withIndex(20).ofType(Types.VARCHAR).withSize(255));
        addMetadata(intsecsignoremail, ColumnMetadata.named("INTSECSIGNOREMAIL").withIndex(21).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(intsecsignortitle, ColumnMetadata.named("INTSECSIGNORTITLE").withIndex(22).ofType(Types.VARCHAR).withSize(255));
        addMetadata(intsigndate, ColumnMetadata.named("INTSIGNDATE").withIndex(19).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(intsignor, ColumnMetadata.named("INTSIGNOR").withIndex(16).ofType(Types.VARCHAR).withSize(255));
        addMetadata(intsignoremail, ColumnMetadata.named("INTSIGNOREMAIL").withIndex(17).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(intsignortitle, ColumnMetadata.named("INTSIGNORTITLE").withIndex(18).ofType(Types.VARCHAR).withSize(255));
        addMetadata(lastupdatedate, ColumnMetadata.named("LASTUPDATEDATE").withIndex(26).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysBobjectid, ColumnMetadata.named("SYS_BOBJECTID").withIndex(30).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysCreatedtm, ColumnMetadata.named("SYS_CREATEDTM").withIndex(38).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysCreateevent, ColumnMetadata.named("SYS_CREATEEVENT").withIndex(36).ofType(Types.VARCHAR).withSize(32));
        addMetadata(sysCuserid, ColumnMetadata.named("SYS_CUSERID").withIndex(39).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDataexmversion, ColumnMetadata.named("SYS_DATAEXMVERSION").withIndex(34).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDatedefpath, ColumnMetadata.named("SYS_DATEDEFPATH").withIndex(33).ofType(Types.VARCHAR).withSize(200));
        addMetadata(sysId, ColumnMetadata.named("SYS_ID").withIndex(29).ofType(Types.DECIMAL).withSize(7).notNull());
        addMetadata(sysModifydtm, ColumnMetadata.named("SYS_MODIFYDTM").withIndex(40).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysMuserid, ColumnMetadata.named("SYS_MUSERID").withIndex(41).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysParentid, ColumnMetadata.named("SYS_PARENTID").withIndex(31).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysParenttablename, ColumnMetadata.named("SYS_PARENTTABLENAME").withIndex(32).ofType(Types.VARCHAR).withSize(32).notNull());
        addMetadata(sysSource, ColumnMetadata.named("SYS_SOURCE").withIndex(35).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysStatus, ColumnMetadata.named("SYS_STATUS").withIndex(37).ofType(Types.DECIMAL).withSize(18));
        addMetadata(taggerviewlink, ColumnMetadata.named("TAGGERVIEWLINK").withIndex(4).ofType(Types.VARCHAR).withSize(256));
        addMetadata(update, ColumnMetadata.named("UPDATE").withIndex(3).ofType(Types.VARCHAR).withSize(256));
        addMetadata(updatestatus, ColumnMetadata.named("UPDATESTATUS").withIndex(6).ofType(Types.VARCHAR).withSize(255));
        addMetadata(useesig, ColumnMetadata.named("USEESIG").withIndex(2).ofType(Types.DECIMAL).withSize(18));
    }

}

