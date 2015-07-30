package com.selectica.Base.querydsl;

import com.mysema.query.sql.ColumnMetadata;
import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.DateTimePath;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.StringPath;
import com.selectica.spring.domain.querydsl.QSBobject;

import javax.annotation.Generated;
import java.sql.Types;

import static com.mysema.query.types.PathMetadataFactory.forVariable;


/**
 * QDExhibits is a Querydsl query type for QDExhibits
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDExhibits extends com.mysema.query.sql.RelationalPathBase<QDExhibits> {

    private static final long serialVersionUID = 1470294285;

    public static final QDExhibits dExhibits = new QDExhibits("D_EXHIBITS");

    public final StringPath exhibita = createString("exhibita");

    public final StringPath exhibitb = createString("exhibitb");

    public final StringPath exhibitc = createString("exhibitc");

    public final StringPath exhibitd = createString("exhibitd");

    public final StringPath exhibite = createString("exhibite");

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

    public final com.mysema.query.sql.PrimaryKey<QDExhibits> dExhibits10Pk = createPrimaryKey(sysId);

//    public final com.mysema.query.sql.ForeignKey<QSBobject> dExhibits10SysParentidFk = createForeignKey(sysParentid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dExhibits10SysBobjectidFk = createForeignKey(sysBobjectid, "ID");

    public QDExhibits(String variable) {
        super(QDExhibits.class, forVariable(variable), "VZAKHARCHENKO", "D_EXHIBITS");
        addMetadata();
    }

    public QDExhibits(String variable, String schema, String table) {
        super(QDExhibits.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDExhibits(Path<? extends QDExhibits> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_EXHIBITS");
        addMetadata();
    }

    public QDExhibits(PathMetadata<?> metadata) {
        super(QDExhibits.class, metadata, "VZAKHARCHENKO", "D_EXHIBITS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exhibita, ColumnMetadata.named("EXHIBITA").withIndex(1).ofType(Types.VARCHAR).withSize(1));
        addMetadata(exhibitb, ColumnMetadata.named("EXHIBITB").withIndex(2).ofType(Types.VARCHAR).withSize(1));
        addMetadata(exhibitc, ColumnMetadata.named("EXHIBITC").withIndex(3).ofType(Types.VARCHAR).withSize(1));
        addMetadata(exhibitd, ColumnMetadata.named("EXHIBITD").withIndex(4).ofType(Types.VARCHAR).withSize(1));
        addMetadata(exhibite, ColumnMetadata.named("EXHIBITE").withIndex(5).ofType(Types.VARCHAR).withSize(1));
        addMetadata(sysBobjectid, ColumnMetadata.named("SYS_BOBJECTID").withIndex(7).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysCreatedtm, ColumnMetadata.named("SYS_CREATEDTM").withIndex(15).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysCreateevent, ColumnMetadata.named("SYS_CREATEEVENT").withIndex(13).ofType(Types.VARCHAR).withSize(32));
        addMetadata(sysCuserid, ColumnMetadata.named("SYS_CUSERID").withIndex(16).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDataexmversion, ColumnMetadata.named("SYS_DATAEXMVERSION").withIndex(11).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDatedefpath, ColumnMetadata.named("SYS_DATEDEFPATH").withIndex(10).ofType(Types.VARCHAR).withSize(200));
        addMetadata(sysId, ColumnMetadata.named("SYS_ID").withIndex(6).ofType(Types.DECIMAL).withSize(7).notNull());
        addMetadata(sysModifydtm, ColumnMetadata.named("SYS_MODIFYDTM").withIndex(17).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysMuserid, ColumnMetadata.named("SYS_MUSERID").withIndex(18).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysParentid, ColumnMetadata.named("SYS_PARENTID").withIndex(8).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysParenttablename, ColumnMetadata.named("SYS_PARENTTABLENAME").withIndex(9).ofType(Types.VARCHAR).withSize(32).notNull());
        addMetadata(sysSource, ColumnMetadata.named("SYS_SOURCE").withIndex(12).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysStatus, ColumnMetadata.named("SYS_STATUS").withIndex(14).ofType(Types.DECIMAL).withSize(18));
    }

}

