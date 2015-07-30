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
 * QDCsdeliverable is a Querydsl query type for QDCsdeliverable
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDCsdeliverable extends com.mysema.query.sql.RelationalPathBase<QDCsdeliverable> {

    private static final long serialVersionUID = -943202212;

    public static final QDCsdeliverable dCsdeliverable = new QDCsdeliverable("D_CSDELIVERABLE");

    public final StringPath delcomments = createString("delcomments");

    public final NumberPath<Integer> deldeliverable = createNumber("deldeliverable", Integer.class);

    public final DateTimePath<java.util.Date> delduedate = createDateTime("delduedate", java.util.Date.class);

    public final StringPath delrpext = createString("delrpext");

    public final NumberPath<Integer> delrpint = createNumber("delrpint", Integer.class);

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

    public final com.mysema.query.sql.PrimaryKey<QDCsdeliverable> dCsdeliverable15Pk = createPrimaryKey(sysId);

    public final com.mysema.query.sql.ForeignKey<QSBobject> dCsdeliver15SysBobjectidFk = createForeignKey(sysBobjectid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCsdelive15DeldeliverableFk = createForeignKey(deldeliverable, "ID");

    public final com.mysema.query.sql.ForeignKey<QSPoContact> dCsdeliverable15DelrpintFk = createForeignKey(delrpint, "ID");

//    public final com.mysema.query.sql.ForeignKey<QSBobject> dCsdelivera15SysParentidFk = createForeignKey(sysParentid, "ID");

    public QDCsdeliverable(String variable) {
        super(QDCsdeliverable.class, forVariable(variable), "VZAKHARCHENKO", "D_CSDELIVERABLE");
        addMetadata();
    }

    public QDCsdeliverable(String variable, String schema, String table) {
        super(QDCsdeliverable.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDCsdeliverable(Path<? extends QDCsdeliverable> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_CSDELIVERABLE");
        addMetadata();
    }

    public QDCsdeliverable(PathMetadata<?> metadata) {
        super(QDCsdeliverable.class, metadata, "VZAKHARCHENKO", "D_CSDELIVERABLE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(delcomments, ColumnMetadata.named("DELCOMMENTS").withIndex(5).ofType(Types.CLOB).withSize(4000));
        addMetadata(deldeliverable, ColumnMetadata.named("DELDELIVERABLE").withIndex(3).ofType(Types.DECIMAL).withSize(18));
        addMetadata(delduedate, ColumnMetadata.named("DELDUEDATE").withIndex(4).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(delrpext, ColumnMetadata.named("DELRPEXT").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(delrpint, ColumnMetadata.named("DELRPINT").withIndex(1).ofType(Types.DECIMAL).withSize(18));
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

