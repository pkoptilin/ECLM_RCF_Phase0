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
 * QDContact is a Querydsl query type for QDContact
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDContact extends com.mysema.query.sql.RelationalPathBase<QDContact> {

    private static final long serialVersionUID = -39710547;

    public static final QDContact dContact = new QDContact("D_CONTACT");

    public final StringPath prcontactemail = createString("prcontactemail");

    public final StringPath prcontactname = createString("prcontactname");

    public final StringPath prcontacttitle = createString("prcontacttitle");

    public final StringPath seccontactemail = createString("seccontactemail");

    public final StringPath seccontactname = createString("seccontactname");

    public final StringPath seccontacttitle = createString("seccontacttitle");

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

    public final com.mysema.query.sql.PrimaryKey<QDContact> dContact9Pk = createPrimaryKey(sysId);

//    public final com.mysema.query.sql.ForeignKey<QSBobject> dContact9SysParentidFk = createForeignKey(sysParentid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dContact9SysBobjectidFk = createForeignKey(sysBobjectid, "ID");

    public QDContact(String variable) {
        super(QDContact.class, forVariable(variable), "VZAKHARCHENKO", "D_CONTACT");
        addMetadata();
    }

    public QDContact(String variable, String schema, String table) {
        super(QDContact.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDContact(Path<? extends QDContact> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_CONTACT");
        addMetadata();
    }

    public QDContact(PathMetadata<?> metadata) {
        super(QDContact.class, metadata, "VZAKHARCHENKO", "D_CONTACT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(prcontactemail, ColumnMetadata.named("PRCONTACTEMAIL").withIndex(2).ofType(Types.VARCHAR).withSize(255).notNull());
        addMetadata(prcontactname, ColumnMetadata.named("PRCONTACTNAME").withIndex(1).ofType(Types.VARCHAR).withSize(255).notNull());
        addMetadata(prcontacttitle, ColumnMetadata.named("PRCONTACTTITLE").withIndex(3).ofType(Types.VARCHAR).withSize(255).notNull());
        addMetadata(seccontactemail, ColumnMetadata.named("SECCONTACTEMAIL").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(seccontactname, ColumnMetadata.named("SECCONTACTNAME").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(seccontacttitle, ColumnMetadata.named("SECCONTACTTITLE").withIndex(6).ofType(Types.VARCHAR).withSize(255));
        addMetadata(sysBobjectid, ColumnMetadata.named("SYS_BOBJECTID").withIndex(8).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysCreatedtm, ColumnMetadata.named("SYS_CREATEDTM").withIndex(16).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysCreateevent, ColumnMetadata.named("SYS_CREATEEVENT").withIndex(14).ofType(Types.VARCHAR).withSize(32));
        addMetadata(sysCuserid, ColumnMetadata.named("SYS_CUSERID").withIndex(17).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDataexmversion, ColumnMetadata.named("SYS_DATAEXMVERSION").withIndex(12).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDatedefpath, ColumnMetadata.named("SYS_DATEDEFPATH").withIndex(11).ofType(Types.VARCHAR).withSize(200));
        addMetadata(sysId, ColumnMetadata.named("SYS_ID").withIndex(7).ofType(Types.DECIMAL).withSize(7).notNull());
        addMetadata(sysModifydtm, ColumnMetadata.named("SYS_MODIFYDTM").withIndex(18).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysMuserid, ColumnMetadata.named("SYS_MUSERID").withIndex(19).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysParentid, ColumnMetadata.named("SYS_PARENTID").withIndex(9).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysParenttablename, ColumnMetadata.named("SYS_PARENTTABLENAME").withIndex(10).ofType(Types.VARCHAR).withSize(32).notNull());
        addMetadata(sysSource, ColumnMetadata.named("SYS_SOURCE").withIndex(13).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysStatus, ColumnMetadata.named("SYS_STATUS").withIndex(15).ofType(Types.DECIMAL).withSize(18));
    }

}

