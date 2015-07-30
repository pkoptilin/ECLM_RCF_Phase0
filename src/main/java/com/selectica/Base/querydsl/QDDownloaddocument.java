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
 * QDDownloaddocument is a Querydsl query type for QDDownloaddocument
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDDownloaddocument extends com.mysema.query.sql.RelationalPathBase<QDDownloaddocument> {

    private static final long serialVersionUID = 1822192566;

    public static final QDDownloaddocument dDownloaddocument = new QDDownloaddocument("D_DOWNLOADDOCUMENT");

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

    public final com.mysema.query.sql.PrimaryKey<QDDownloaddocument> dDownloaddocument18Pk = createPrimaryKey(sysId);

//    public final com.mysema.query.sql.ForeignKey<QSBobject> dDownloaddo18SysParentidFk = createForeignKey(sysParentid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dDownloadd18SysBobjectidFk = createForeignKey(sysBobjectid, "ID");

    public QDDownloaddocument(String variable) {
        super(QDDownloaddocument.class, forVariable(variable), "VZAKHARCHENKO", "D_DOWNLOADDOCUMENT");
        addMetadata();
    }

    public QDDownloaddocument(String variable, String schema, String table) {
        super(QDDownloaddocument.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDDownloaddocument(Path<? extends QDDownloaddocument> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_DOWNLOADDOCUMENT");
        addMetadata();
    }

    public QDDownloaddocument(PathMetadata<?> metadata) {
        super(QDDownloaddocument.class, metadata, "VZAKHARCHENKO", "D_DOWNLOADDOCUMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(sysBobjectid, ColumnMetadata.named("SYS_BOBJECTID").withIndex(2).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysCreatedtm, ColumnMetadata.named("SYS_CREATEDTM").withIndex(10).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysCreateevent, ColumnMetadata.named("SYS_CREATEEVENT").withIndex(8).ofType(Types.VARCHAR).withSize(32));
        addMetadata(sysCuserid, ColumnMetadata.named("SYS_CUSERID").withIndex(11).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDataexmversion, ColumnMetadata.named("SYS_DATAEXMVERSION").withIndex(6).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDatedefpath, ColumnMetadata.named("SYS_DATEDEFPATH").withIndex(5).ofType(Types.VARCHAR).withSize(200));
        addMetadata(sysId, ColumnMetadata.named("SYS_ID").withIndex(1).ofType(Types.DECIMAL).withSize(7).notNull());
        addMetadata(sysModifydtm, ColumnMetadata.named("SYS_MODIFYDTM").withIndex(12).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysMuserid, ColumnMetadata.named("SYS_MUSERID").withIndex(13).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysParentid, ColumnMetadata.named("SYS_PARENTID").withIndex(3).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysParenttablename, ColumnMetadata.named("SYS_PARENTTABLENAME").withIndex(4).ofType(Types.VARCHAR).withSize(32).notNull());
        addMetadata(sysSource, ColumnMetadata.named("SYS_SOURCE").withIndex(7).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysStatus, ColumnMetadata.named("SYS_STATUS").withIndex(9).ofType(Types.DECIMAL).withSize(18));
    }

}

