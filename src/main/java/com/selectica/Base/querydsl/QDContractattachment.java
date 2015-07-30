package com.selectica.Base.querydsl;

import com.mysema.query.sql.ColumnMetadata;
import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.DateTimePath;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.StringPath;
import com.selectica.spring.domain.querydsl.QSBobject;
import com.selectica.spring.domain.querydsl.QSDictValue;
import com.selectica.spring.domain.querydsl.QSPoContact;

import javax.annotation.Generated;
import java.sql.Types;

import static com.mysema.query.types.PathMetadataFactory.forVariable;


/**
 * QDContractattachment is a Querydsl query type for QDContractattachment
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDContractattachment extends com.mysema.query.sql.RelationalPathBase<QDContractattachment> {

    private static final long serialVersionUID = 2030134536;

    public static final QDContractattachment dContractattachment = new QDContractattachment("D_CONTRACTATTACHMENT");

    public final StringPath boilerplateused = createString("boilerplateused");

    public final StringPath category = createString("category");

    public final NumberPath<Integer> checkedoutby = createNumber("checkedoutby", Integer.class);

    public final StringPath comment = createString("comment");

    public final NumberPath<Integer> documentstate = createNumber("documentstate", Integer.class);

    public final StringPath extfilename = createString("extfilename");

    public final StringPath filename = createString("filename");

    public final NumberPath<Integer> filesize = createNumber("filesize", Integer.class);

    public final NumberPath<Integer> fileversion = createNumber("fileversion", Integer.class);

    public final StringPath inboundfilemodifydate = createString("inboundfilemodifydate");

    public final NumberPath<Integer> modifiedby = createNumber("modifiedby", Integer.class);

    public final DateTimePath<java.util.Date> modifydate = createDateTime("modifydate", java.util.Date.class);

    public final StringPath serverfilename = createString("serverfilename");

    public final StringPath serverid = createString("serverid");

    public final StringPath sysautogenerated = createString("sysautogenerated");

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

    public final StringPath tempserverfilename = createString("tempserverfilename");

    public final StringPath type = createString("type");

    public final StringPath uploadedby = createString("uploadedby");

    public final com.mysema.query.sql.PrimaryKey<QDContractattachment> dContractattachment20Pk = createPrimaryKey(sysId);

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dContracta20DocumentstateFk = createForeignKey(documentstate, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dContracta20SysBobjectidFk = createForeignKey(sysBobjectid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSPoContact> dContractatta20ModifiedbyFk = createForeignKey(modifiedby, "ID");

//    public final com.mysema.query.sql.ForeignKey<QSBobject> dContractat20SysParentidFk = createForeignKey(sysParentid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSPoContact> dContractat20CheckedoutbyFk = createForeignKey(checkedoutby, "ID");

    public QDContractattachment(String variable) {
        super(QDContractattachment.class, forVariable(variable), "VZAKHARCHENKO", "D_CONTRACTATTACHMENT");
        addMetadata();
    }

    public QDContractattachment(String variable, String schema, String table) {
        super(QDContractattachment.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDContractattachment(Path<? extends QDContractattachment> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_CONTRACTATTACHMENT");
        addMetadata();
    }

    public QDContractattachment(PathMetadata<?> metadata) {
        super(QDContractattachment.class, metadata, "VZAKHARCHENKO", "D_CONTRACTATTACHMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(boilerplateused, ColumnMetadata.named("BOILERPLATEUSED").withIndex(17).ofType(Types.VARCHAR).withSize(255));
        addMetadata(category, ColumnMetadata.named("CATEGORY").withIndex(9).ofType(Types.VARCHAR).withSize(500));
        addMetadata(checkedoutby, ColumnMetadata.named("CHECKEDOUTBY").withIndex(6).ofType(Types.DECIMAL).withSize(18));
        addMetadata(comment, ColumnMetadata.named("COMMENT").withIndex(8).ofType(Types.CLOB).withSize(4000));
        addMetadata(documentstate, ColumnMetadata.named("DOCUMENTSTATE").withIndex(16).ofType(Types.DECIMAL).withSize(18));
        addMetadata(extfilename, ColumnMetadata.named("EXTFILENAME").withIndex(14).ofType(Types.VARCHAR).withSize(255));
        addMetadata(filename, ColumnMetadata.named("FILENAME").withIndex(5).ofType(Types.VARCHAR).withSize(500));
        addMetadata(filesize, ColumnMetadata.named("FILESIZE").withIndex(4).ofType(Types.DECIMAL).withSize(18));
        addMetadata(fileversion, ColumnMetadata.named("FILEVERSION").withIndex(1).ofType(Types.DECIMAL).withSize(18));
        addMetadata(inboundfilemodifydate, ColumnMetadata.named("INBOUNDFILEMODIFYDATE").withIndex(13).ofType(Types.VARCHAR).withSize(500));
        addMetadata(modifiedby, ColumnMetadata.named("MODIFIEDBY").withIndex(2).ofType(Types.DECIMAL).withSize(18));
        addMetadata(modifydate, ColumnMetadata.named("MODIFYDATE").withIndex(3).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(serverfilename, ColumnMetadata.named("SERVERFILENAME").withIndex(10).ofType(Types.VARCHAR).withSize(500));
        addMetadata(serverid, ColumnMetadata.named("SERVERID").withIndex(12).ofType(Types.VARCHAR).withSize(500));
        addMetadata(sysautogenerated, ColumnMetadata.named("SYSAUTOGENERATED").withIndex(18).ofType(Types.VARCHAR).withSize(1));
        addMetadata(sysBobjectid, ColumnMetadata.named("SYS_BOBJECTID").withIndex(20).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysCreatedtm, ColumnMetadata.named("SYS_CREATEDTM").withIndex(28).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysCreateevent, ColumnMetadata.named("SYS_CREATEEVENT").withIndex(26).ofType(Types.VARCHAR).withSize(32));
        addMetadata(sysCuserid, ColumnMetadata.named("SYS_CUSERID").withIndex(29).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDataexmversion, ColumnMetadata.named("SYS_DATAEXMVERSION").withIndex(24).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDatedefpath, ColumnMetadata.named("SYS_DATEDEFPATH").withIndex(23).ofType(Types.VARCHAR).withSize(200));
        addMetadata(sysId, ColumnMetadata.named("SYS_ID").withIndex(19).ofType(Types.DECIMAL).withSize(7).notNull());
        addMetadata(sysModifydtm, ColumnMetadata.named("SYS_MODIFYDTM").withIndex(30).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysMuserid, ColumnMetadata.named("SYS_MUSERID").withIndex(31).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysParentid, ColumnMetadata.named("SYS_PARENTID").withIndex(21).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysParenttablename, ColumnMetadata.named("SYS_PARENTTABLENAME").withIndex(22).ofType(Types.VARCHAR).withSize(32).notNull());
        addMetadata(sysSource, ColumnMetadata.named("SYS_SOURCE").withIndex(25).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysStatus, ColumnMetadata.named("SYS_STATUS").withIndex(27).ofType(Types.DECIMAL).withSize(18));
        addMetadata(tempserverfilename, ColumnMetadata.named("TEMPSERVERFILENAME").withIndex(11).ofType(Types.VARCHAR).withSize(500));
        addMetadata(type, ColumnMetadata.named("TYPE").withIndex(7).ofType(Types.VARCHAR).withSize(500));
        addMetadata(uploadedby, ColumnMetadata.named("UPLOADEDBY").withIndex(15).ofType(Types.VARCHAR).withSize(500));
    }

}

