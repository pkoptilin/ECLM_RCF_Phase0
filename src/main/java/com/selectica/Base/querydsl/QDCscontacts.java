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
 * QDCscontacts is a Querydsl query type for QDCscontacts
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDCscontacts extends com.mysema.query.sql.RelationalPathBase<QDCscontacts> {

    private static final long serialVersionUID = 2008000790;

    public static final QDCscontacts dCscontacts = new QDCscontacts("D_CSCONTACTS");

    public final StringPath contemail = createString("contemail");

    public final StringPath contfn = createString("contfn");

    public final StringPath contln = createString("contln");

    public final StringPath contmph = createString("contmph");

    public final StringPath contph = createString("contph");

    public final StringPath conttitle = createString("conttitle");

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

    public final com.mysema.query.sql.PrimaryKey<QDCscontacts> dCscontacts12Pk = createPrimaryKey(sysId);

//    public final com.mysema.query.sql.ForeignKey<QSBobject> dCscontacts12SysParentidFk = createForeignKey(sysParentid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dCscontact12SysBobjectidFk = createForeignKey(sysBobjectid, "ID");

    public QDCscontacts(String variable) {
        super(QDCscontacts.class, forVariable(variable), "VZAKHARCHENKO", "D_CSCONTACTS");
        addMetadata();
    }

    public QDCscontacts(String variable, String schema, String table) {
        super(QDCscontacts.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDCscontacts(Path<? extends QDCscontacts> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_CSCONTACTS");
        addMetadata();
    }

    public QDCscontacts(PathMetadata<?> metadata) {
        super(QDCscontacts.class, metadata, "VZAKHARCHENKO", "D_CSCONTACTS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(contemail, ColumnMetadata.named("CONTEMAIL").withIndex(6).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(contfn, ColumnMetadata.named("CONTFN").withIndex(1).ofType(Types.VARCHAR).withSize(255).notNull());
        addMetadata(contln, ColumnMetadata.named("CONTLN").withIndex(2).ofType(Types.VARCHAR).withSize(255).notNull());
        addMetadata(contmph, ColumnMetadata.named("CONTMPH").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(contph, ColumnMetadata.named("CONTPH").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(conttitle, ColumnMetadata.named("CONTTITLE").withIndex(3).ofType(Types.VARCHAR).withSize(255));
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

