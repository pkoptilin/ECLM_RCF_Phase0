package com.selectica.Base.querydsl;

import com.mysema.query.sql.ColumnMetadata;
import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.DateTimePath;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.StringPath;
import com.selectica.spring.domain.querydsl.QSBobject;
import com.selectica.spring.domain.querydsl.QSBobjectMultiValue;
import com.selectica.spring.domain.querydsl.QSDictValue;

import javax.annotation.Generated;
import java.sql.Types;

import static com.mysema.query.types.PathMetadataFactory.forVariable;


/**
 * QDReminder is a Querydsl query type for QDReminder
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDReminder extends com.mysema.query.sql.RelationalPathBase<QDReminder> {

    private static final long serialVersionUID = -1182177915;

    public static final QDReminder dReminder = new QDReminder("D_REMINDER");

    public final StringPath comments = createString("comments");

    public final NumberPath<Integer> duplicatedsystemid = createNumber("duplicatedsystemid", Integer.class);

    public final NumberPath<Integer> eventtype = createNumber("eventtype", Integer.class);

    public final DateTimePath<java.util.Date> ifotherdate = createDateTime("ifotherdate", java.util.Date.class);

    public final DateTimePath<java.util.Date> notificationdate = createDateTime("notificationdate", java.util.Date.class);

    public final NumberPath<Integer> notificationdelta = createNumber("notificationdelta", Integer.class);

    public final NumberPath<Integer> notificationfreq = createNumber("notificationfreq", Integer.class);

    public final NumberPath<Integer> recipientaccountuser = createNumber("recipientaccountuser", Integer.class);

    public final StringPath recipientexternaluser = createString("recipientexternaluser");

    public final DateTimePath<java.util.Date> resolvedeventdate = createDateTime("resolvedeventdate", java.util.Date.class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

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

    public final com.mysema.query.sql.PrimaryKey<QDReminder> dReminder10Pk = createPrimaryKey(sysId);

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dReminder10EventtypeFk = createForeignKey(eventtype, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dReminder10SysBobjectidFk = createForeignKey(sysBobjectid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dRemind10NotificationfreqFk = createForeignKey(notificationfreq, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dReminder10StatusFk = createForeignKey(status, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dRe10RecipientaccountuserFk = createForeignKey(recipientaccountuser, "ID");

//    public final com.mysema.query.sql.ForeignKey<QSBobject> dReminder10SysParentidFk = createForeignKey(sysParentid, "ID");

    public QDReminder(String variable) {
        super(QDReminder.class, forVariable(variable), "VZAKHARCHENKO", "D_REMINDER");
        addMetadata();
    }

    public QDReminder(String variable, String schema, String table) {
        super(QDReminder.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDReminder(Path<? extends QDReminder> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_REMINDER");
        addMetadata();
    }

    public QDReminder(PathMetadata<?> metadata) {
        super(QDReminder.class, metadata, "VZAKHARCHENKO", "D_REMINDER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(comments, ColumnMetadata.named("COMMENTS").withIndex(10).ofType(Types.VARCHAR).withSize(2000).notNull());
        addMetadata(duplicatedsystemid, ColumnMetadata.named("DUPLICATEDSYSTEMID").withIndex(1).ofType(Types.DECIMAL).withSize(18));
        addMetadata(eventtype, ColumnMetadata.named("EVENTTYPE").withIndex(3).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(ifotherdate, ColumnMetadata.named("IFOTHERDATE").withIndex(4).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(notificationdate, ColumnMetadata.named("NOTIFICATIONDATE").withIndex(7).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(notificationdelta, ColumnMetadata.named("NOTIFICATIONDELTA").withIndex(6).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(notificationfreq, ColumnMetadata.named("NOTIFICATIONFREQ").withIndex(8).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(recipientaccountuser, ColumnMetadata.named("RECIPIENTACCOUNTUSER").withIndex(11).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(recipientexternaluser, ColumnMetadata.named("RECIPIENTEXTERNALUSER").withIndex(12).ofType(Types.CLOB).withSize(4000));
        addMetadata(resolvedeventdate, ColumnMetadata.named("RESOLVEDEVENTDATE").withIndex(5).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(status, ColumnMetadata.named("STATUS").withIndex(2).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(subject, ColumnMetadata.named("SUBJECT").withIndex(9).ofType(Types.VARCHAR).withSize(64).notNull());
        addMetadata(sysBobjectid, ColumnMetadata.named("SYS_BOBJECTID").withIndex(14).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysCreatedtm, ColumnMetadata.named("SYS_CREATEDTM").withIndex(22).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysCreateevent, ColumnMetadata.named("SYS_CREATEEVENT").withIndex(20).ofType(Types.VARCHAR).withSize(32));
        addMetadata(sysCuserid, ColumnMetadata.named("SYS_CUSERID").withIndex(23).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDataexmversion, ColumnMetadata.named("SYS_DATAEXMVERSION").withIndex(18).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDatedefpath, ColumnMetadata.named("SYS_DATEDEFPATH").withIndex(17).ofType(Types.VARCHAR).withSize(200));
        addMetadata(sysId, ColumnMetadata.named("SYS_ID").withIndex(13).ofType(Types.DECIMAL).withSize(7).notNull());
        addMetadata(sysModifydtm, ColumnMetadata.named("SYS_MODIFYDTM").withIndex(24).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysMuserid, ColumnMetadata.named("SYS_MUSERID").withIndex(25).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysParentid, ColumnMetadata.named("SYS_PARENTID").withIndex(15).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysParenttablename, ColumnMetadata.named("SYS_PARENTTABLENAME").withIndex(16).ofType(Types.VARCHAR).withSize(32).notNull());
        addMetadata(sysSource, ColumnMetadata.named("SYS_SOURCE").withIndex(19).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysStatus, ColumnMetadata.named("SYS_STATUS").withIndex(21).ofType(Types.DECIMAL).withSize(18));
    }

}

