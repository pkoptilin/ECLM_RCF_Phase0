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
 * QDDvenfka is a Querydsl query type for QDDvenfka
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDDvenfka extends com.mysema.query.sql.RelationalPathBase<QDDvenfka> {

    private static final long serialVersionUID = 1039711790;

    public static final QDDvenfka dDvenfka = new QDDvenfka("D_DVENFKA");

    public final StringPath fkabussname = createString("fkabussname");

    public final DateTimePath<java.util.Date> fkaeffdate = createDateTime("fkaeffdate", java.util.Date.class);

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

    public final com.mysema.query.sql.PrimaryKey<QDDvenfka> dDvenfka9Pk = createPrimaryKey(sysId);

    public final com.mysema.query.sql.ForeignKey<QSBobject> dDvenfka9SysBobjectidFk = createForeignKey(sysBobjectid, "ID");

//    public final com.mysema.query.sql.ForeignKey<QSBobject> dDvenfka9SysParentidFk = createForeignKey(sysParentid, "ID");

    public QDDvenfka(String variable) {
        super(QDDvenfka.class, forVariable(variable), "VZAKHARCHENKO", "D_DVENFKA");
        addMetadata();
    }

    public QDDvenfka(String variable, String schema, String table) {
        super(QDDvenfka.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDDvenfka(Path<? extends QDDvenfka> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_DVENFKA");
        addMetadata();
    }

    public QDDvenfka(PathMetadata<?> metadata) {
        super(QDDvenfka.class, metadata, "VZAKHARCHENKO", "D_DVENFKA");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fkabussname, ColumnMetadata.named("FKABUSSNAME").withIndex(1).ofType(Types.VARCHAR).withSize(255).notNull());
        addMetadata(fkaeffdate, ColumnMetadata.named("FKAEFFDATE").withIndex(2).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysBobjectid, ColumnMetadata.named("SYS_BOBJECTID").withIndex(4).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysCreatedtm, ColumnMetadata.named("SYS_CREATEDTM").withIndex(12).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysCreateevent, ColumnMetadata.named("SYS_CREATEEVENT").withIndex(10).ofType(Types.VARCHAR).withSize(32));
        addMetadata(sysCuserid, ColumnMetadata.named("SYS_CUSERID").withIndex(13).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDataexmversion, ColumnMetadata.named("SYS_DATAEXMVERSION").withIndex(8).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDatedefpath, ColumnMetadata.named("SYS_DATEDEFPATH").withIndex(7).ofType(Types.VARCHAR).withSize(200));
        addMetadata(sysId, ColumnMetadata.named("SYS_ID").withIndex(3).ofType(Types.DECIMAL).withSize(7).notNull());
        addMetadata(sysModifydtm, ColumnMetadata.named("SYS_MODIFYDTM").withIndex(14).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysMuserid, ColumnMetadata.named("SYS_MUSERID").withIndex(15).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysParentid, ColumnMetadata.named("SYS_PARENTID").withIndex(5).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysParenttablename, ColumnMetadata.named("SYS_PARENTTABLENAME").withIndex(6).ofType(Types.VARCHAR).withSize(32).notNull());
        addMetadata(sysSource, ColumnMetadata.named("SYS_SOURCE").withIndex(9).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysStatus, ColumnMetadata.named("SYS_STATUS").withIndex(11).ofType(Types.DECIMAL).withSize(18));
    }

}

