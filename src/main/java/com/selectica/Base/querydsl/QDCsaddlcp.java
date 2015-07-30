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
 * QDCsaddlcp is a Querydsl query type for QDCsaddlcp
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDCsaddlcp extends com.mysema.query.sql.RelationalPathBase<QDCsaddlcp> {

    private static final long serialVersionUID = 1932130075;

    public static final QDCsaddlcp dCsaddlcp = new QDCsaddlcp("D_CSADDLCP");

    public final StringPath acpadr1 = createString("acpadr1");

    public final StringPath acpadr2 = createString("acpadr2");

    public final StringPath acpcity = createString("acpcity");

    public final NumberPath<Integer> acpctry = createNumber("acpctry", Integer.class);

    public final NumberPath<Integer> acpentitytype = createNumber("acpentitytype", Integer.class);

    public final StringPath acpname = createString("acpname");

    public final NumberPath<Integer> acpstate = createNumber("acpstate", Integer.class);

    public final StringPath acpzip = createString("acpzip");

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

    public final com.mysema.query.sql.PrimaryKey<QDCsaddlcp> dCsaddlcp10Pk = createPrimaryKey(sysId);

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCsaddlcp10AcpstateFk = createForeignKey(acpstate, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCsaddlcp10AcpctryFk = createForeignKey(acpctry, "ID");

//    public final com.mysema.query.sql.ForeignKey<QSBobject> dCsaddlcp10SysParentidFk = createForeignKey(sysParentid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dCsaddlcp10SysBobjectidFk = createForeignKey(sysBobjectid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCsaddlcp10AcpentitytypeFk = createForeignKey(acpentitytype, "ID");

    public QDCsaddlcp(String variable) {
        super(QDCsaddlcp.class, forVariable(variable), "VZAKHARCHENKO", "D_CSADDLCP");
        addMetadata();
    }

    public QDCsaddlcp(String variable, String schema, String table) {
        super(QDCsaddlcp.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDCsaddlcp(Path<? extends QDCsaddlcp> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_CSADDLCP");
        addMetadata();
    }

    public QDCsaddlcp(PathMetadata<?> metadata) {
        super(QDCsaddlcp.class, metadata, "VZAKHARCHENKO", "D_CSADDLCP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(acpadr1, ColumnMetadata.named("ACPADR1").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(acpadr2, ColumnMetadata.named("ACPADR2").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(acpcity, ColumnMetadata.named("ACPCITY").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(acpctry, ColumnMetadata.named("ACPCTRY").withIndex(8).ofType(Types.DECIMAL).withSize(18));
        addMetadata(acpentitytype, ColumnMetadata.named("ACPENTITYTYPE").withIndex(2).ofType(Types.DECIMAL).withSize(18));
        addMetadata(acpname, ColumnMetadata.named("ACPNAME").withIndex(1).ofType(Types.VARCHAR).withSize(255).notNull());
        addMetadata(acpstate, ColumnMetadata.named("ACPSTATE").withIndex(6).ofType(Types.DECIMAL).withSize(18));
        addMetadata(acpzip, ColumnMetadata.named("ACPZIP").withIndex(7).ofType(Types.VARCHAR).withSize(255));
        addMetadata(sysBobjectid, ColumnMetadata.named("SYS_BOBJECTID").withIndex(10).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysCreatedtm, ColumnMetadata.named("SYS_CREATEDTM").withIndex(18).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysCreateevent, ColumnMetadata.named("SYS_CREATEEVENT").withIndex(16).ofType(Types.VARCHAR).withSize(32));
        addMetadata(sysCuserid, ColumnMetadata.named("SYS_CUSERID").withIndex(19).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDataexmversion, ColumnMetadata.named("SYS_DATAEXMVERSION").withIndex(14).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDatedefpath, ColumnMetadata.named("SYS_DATEDEFPATH").withIndex(13).ofType(Types.VARCHAR).withSize(200));
        addMetadata(sysId, ColumnMetadata.named("SYS_ID").withIndex(9).ofType(Types.DECIMAL).withSize(7).notNull());
        addMetadata(sysModifydtm, ColumnMetadata.named("SYS_MODIFYDTM").withIndex(20).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysMuserid, ColumnMetadata.named("SYS_MUSERID").withIndex(21).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysParentid, ColumnMetadata.named("SYS_PARENTID").withIndex(11).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysParenttablename, ColumnMetadata.named("SYS_PARENTTABLENAME").withIndex(12).ofType(Types.VARCHAR).withSize(32).notNull());
        addMetadata(sysSource, ColumnMetadata.named("SYS_SOURCE").withIndex(15).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysStatus, ColumnMetadata.named("SYS_STATUS").withIndex(17).ofType(Types.DECIMAL).withSize(18));
    }

}

