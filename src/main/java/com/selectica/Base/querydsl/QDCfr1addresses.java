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
 * QDCfr1addresses is a Querydsl query type for QDCfr1addresses
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDCfr1addresses extends com.mysema.query.sql.RelationalPathBase<QDCfr1addresses> {

    private static final long serialVersionUID = -531451123;

    public static final QDCfr1addresses dCfr1addresses = new QDCfr1addresses("D_CFR1ADDRESSES");

    public final StringPath aadradr1 = createString("aadradr1");

    public final StringPath aadradr2 = createString("aadradr2");

    public final StringPath aadrcity = createString("aadrcity");

    public final NumberPath<Integer> aadrctry = createNumber("aadrctry", Integer.class);

    public final NumberPath<Integer> aadrstate = createNumber("aadrstate", Integer.class);

    public final NumberPath<Integer> aadrtype = createNumber("aadrtype", Integer.class);

    public final StringPath aadrzip = createString("aadrzip");

    public final NumberPath<Integer> cadrtype = createNumber("cadrtype", Integer.class);

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

    public final com.mysema.query.sql.PrimaryKey<QDCfr1addresses> dCfr1addresses15Pk = createPrimaryKey(sysId);

//    public final com.mysema.query.sql.ForeignKey<QSBobject> dCfr1addres15SysParentidFk = createForeignKey(sysParentid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCfr1addresses15AadrctryFk = createForeignKey(aadrctry, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dCfr1addre15SysBobjectidFk = createForeignKey(sysBobjectid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCfr1addresses15AadrtypeFk = createForeignKey(aadrtype, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCfr1addresses15AadrstateFk = createForeignKey(aadrstate, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCfr1addresses15CadrtypeFk = createForeignKey(cadrtype, "ID");

    public QDCfr1addresses(String variable) {
        super(QDCfr1addresses.class, forVariable(variable), "VZAKHARCHENKO", "D_CFR1ADDRESSES");
        addMetadata();
    }

    public QDCfr1addresses(String variable, String schema, String table) {
        super(QDCfr1addresses.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDCfr1addresses(Path<? extends QDCfr1addresses> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_CFR1ADDRESSES");
        addMetadata();
    }

    public QDCfr1addresses(PathMetadata<?> metadata) {
        super(QDCfr1addresses.class, metadata, "VZAKHARCHENKO", "D_CFR1ADDRESSES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aadradr1, ColumnMetadata.named("AADRADR1").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(aadradr2, ColumnMetadata.named("AADRADR2").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(aadrcity, ColumnMetadata.named("AADRCITY").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(aadrctry, ColumnMetadata.named("AADRCTRY").withIndex(7).ofType(Types.DECIMAL).withSize(18));
        addMetadata(aadrstate, ColumnMetadata.named("AADRSTATE").withIndex(5).ofType(Types.DECIMAL).withSize(18));
        addMetadata(aadrtype, ColumnMetadata.named("AADRTYPE").withIndex(1).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(aadrzip, ColumnMetadata.named("AADRZIP").withIndex(6).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cadrtype, ColumnMetadata.named("CADRTYPE").withIndex(8).ofType(Types.DECIMAL).withSize(18));
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

