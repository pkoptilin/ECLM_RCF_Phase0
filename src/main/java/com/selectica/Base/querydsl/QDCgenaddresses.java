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
 * QDCgenaddresses is a Querydsl query type for QDCgenaddresses
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDCgenaddresses extends com.mysema.query.sql.RelationalPathBase<QDCgenaddresses> {

    private static final long serialVersionUID = -1914226430;

    public static final QDCgenaddresses dCgenaddresses = new QDCgenaddresses("D_CGENADDRESSES");

    public final StringPath cadr1 = createString("cadr1");

    public final StringPath cadr2 = createString("cadr2");

    public final StringPath cadrcity = createString("cadrcity");

    public final NumberPath<Integer> cadrctry = createNumber("cadrctry", Integer.class);

    public final NumberPath<Integer> cadrstate = createNumber("cadrstate", Integer.class);

    public final NumberPath<Integer> cadrtype = createNumber("cadrtype", Integer.class);

    public final StringPath cadrzip = createString("cadrzip");

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

    public final com.mysema.query.sql.PrimaryKey<QDCgenaddresses> dCgenaddresses15Pk = createPrimaryKey(sysId);

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCgenaddresses15CadrstateFk = createForeignKey(cadrstate, "ID");

//    public final com.mysema.query.sql.ForeignKey<QSBobject> dCgenaddres15SysParentidFk = createForeignKey(sysParentid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCgenaddresses15CadrtypeFk = createForeignKey(cadrtype, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCgenaddresses15CadrctryFk = createForeignKey(cadrctry, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dCgenaddre15SysBobjectidFk = createForeignKey(sysBobjectid, "ID");

    public QDCgenaddresses(String variable) {
        super(QDCgenaddresses.class, forVariable(variable), "VZAKHARCHENKO", "D_CGENADDRESSES");
        addMetadata();
    }

    public QDCgenaddresses(String variable, String schema, String table) {
        super(QDCgenaddresses.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDCgenaddresses(Path<? extends QDCgenaddresses> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_CGENADDRESSES");
        addMetadata();
    }

    public QDCgenaddresses(PathMetadata<?> metadata) {
        super(QDCgenaddresses.class, metadata, "VZAKHARCHENKO", "D_CGENADDRESSES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cadr1, ColumnMetadata.named("CADR1").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cadr2, ColumnMetadata.named("CADR2").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cadrcity, ColumnMetadata.named("CADRCITY").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cadrctry, ColumnMetadata.named("CADRCTRY").withIndex(7).ofType(Types.DECIMAL).withSize(18));
        addMetadata(cadrstate, ColumnMetadata.named("CADRSTATE").withIndex(5).ofType(Types.DECIMAL).withSize(18));
        addMetadata(cadrtype, ColumnMetadata.named("CADRTYPE").withIndex(1).ofType(Types.DECIMAL).withSize(18));
        addMetadata(cadrzip, ColumnMetadata.named("CADRZIP").withIndex(6).ofType(Types.VARCHAR).withSize(255));
        addMetadata(sysBobjectid, ColumnMetadata.named("SYS_BOBJECTID").withIndex(9).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysCreatedtm, ColumnMetadata.named("SYS_CREATEDTM").withIndex(17).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysCreateevent, ColumnMetadata.named("SYS_CREATEEVENT").withIndex(15).ofType(Types.VARCHAR).withSize(32));
        addMetadata(sysCuserid, ColumnMetadata.named("SYS_CUSERID").withIndex(18).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDataexmversion, ColumnMetadata.named("SYS_DATAEXMVERSION").withIndex(13).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDatedefpath, ColumnMetadata.named("SYS_DATEDEFPATH").withIndex(12).ofType(Types.VARCHAR).withSize(200));
        addMetadata(sysId, ColumnMetadata.named("SYS_ID").withIndex(8).ofType(Types.DECIMAL).withSize(7).notNull());
        addMetadata(sysModifydtm, ColumnMetadata.named("SYS_MODIFYDTM").withIndex(19).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysMuserid, ColumnMetadata.named("SYS_MUSERID").withIndex(20).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysParentid, ColumnMetadata.named("SYS_PARENTID").withIndex(10).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysParenttablename, ColumnMetadata.named("SYS_PARENTTABLENAME").withIndex(11).ofType(Types.VARCHAR).withSize(32).notNull());
        addMetadata(sysSource, ColumnMetadata.named("SYS_SOURCE").withIndex(14).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysStatus, ColumnMetadata.named("SYS_STATUS").withIndex(16).ofType(Types.DECIMAL).withSize(18));
    }

}

