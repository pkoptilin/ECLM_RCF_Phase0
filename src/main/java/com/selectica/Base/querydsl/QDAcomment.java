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
 * QDAcomment is a Querydsl query type for QDAcomment
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDAcomment extends com.mysema.query.sql.RelationalPathBase<QDAcomment> {

    private static final long serialVersionUID = 1835701233;

    public static final QDAcomment dAcomment = new QDAcomment("D_ACOMMENT");

    public final StringPath commentsby = createString("commentsby");

    public final DateTimePath<java.util.Date> commentsdate = createDateTime("commentsdate", java.util.Date.class);

    public final StringPath commentstext = createString("commentstext");

    public final StringPath subject = createString("subject");

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

    public final com.mysema.query.sql.PrimaryKey<QDAcomment> dAcomment10Pk = createPrimaryKey(sysId);

    public final com.mysema.query.sql.ForeignKey<QSBobject> dAcomment10SysBobjectidFk = createForeignKey(sysBobjectid, "ID");

    public QDAcomment(String variable) {
        super(QDAcomment.class, forVariable(variable), "VZAKHARCHENKO", "D_ACOMMENT");
        addMetadata();
    }

    public QDAcomment(String variable, String schema, String table) {
        super(QDAcomment.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDAcomment(Path<? extends QDAcomment> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_ACOMMENT");
        addMetadata();
    }

    public QDAcomment(PathMetadata<?> metadata) {
        super(QDAcomment.class, metadata, "VZAKHARCHENKO", "D_ACOMMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commentsby, ColumnMetadata.named("COMMENTSBY").withIndex(4).ofType(Types.VARCHAR).withSize(64));
        addMetadata(commentsdate, ColumnMetadata.named("COMMENTSDATE").withIndex(3).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(commentstext, ColumnMetadata.named("COMMENTSTEXT").withIndex(2).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(subject, ColumnMetadata.named("SUBJECT").withIndex(1).ofType(Types.VARCHAR).withSize(64));
        addMetadata(sysBobjectid, ColumnMetadata.named("SYS_BOBJECTID").withIndex(6).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysCreatedtm, ColumnMetadata.named("SYS_CREATEDTM").withIndex(14).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysCreateevent, ColumnMetadata.named("SYS_CREATEEVENT").withIndex(12).ofType(Types.VARCHAR).withSize(32));
        addMetadata(sysCuserid, ColumnMetadata.named("SYS_CUSERID").withIndex(15).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDataexmversion, ColumnMetadata.named("SYS_DATAEXMVERSION").withIndex(10).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDatedefpath, ColumnMetadata.named("SYS_DATEDEFPATH").withIndex(9).ofType(Types.VARCHAR).withSize(200));
        addMetadata(sysId, ColumnMetadata.named("SYS_ID").withIndex(5).ofType(Types.DECIMAL).withSize(7).notNull());
        addMetadata(sysModifydtm, ColumnMetadata.named("SYS_MODIFYDTM").withIndex(16).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysMuserid, ColumnMetadata.named("SYS_MUSERID").withIndex(17).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysParentid, ColumnMetadata.named("SYS_PARENTID").withIndex(7).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysParenttablename, ColumnMetadata.named("SYS_PARENTTABLENAME").withIndex(8).ofType(Types.VARCHAR).withSize(32).notNull());
        addMetadata(sysSource, ColumnMetadata.named("SYS_SOURCE").withIndex(11).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysStatus, ColumnMetadata.named("SYS_STATUS").withIndex(13).ofType(Types.DECIMAL).withSize(18));
    }

}

