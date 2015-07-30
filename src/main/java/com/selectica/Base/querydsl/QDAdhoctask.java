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
 * QDAdhoctask is a Querydsl query type for QDAdhoctask
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDAdhoctask extends com.mysema.query.sql.RelationalPathBase<QDAdhoctask> {

    private static final long serialVersionUID = 945872779;

    public static final QDAdhoctask dAdhoctask = new QDAdhoctask("D_ADHOCTASK");

    public final DateTimePath<java.util.Date> adhoctaskdue = createDateTime("adhoctaskdue", java.util.Date.class);

    public final StringPath adhoctaskname = createString("adhoctaskname");

    public final NumberPath<Integer> adhoctaskowner = createNumber("adhoctaskowner", Integer.class);

    public final NumberPath<Integer> adhoctaskstatus = createNumber("adhoctaskstatus", Integer.class);

    public final StringPath adhoctasktext = createString("adhoctasktext");

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

    public final com.mysema.query.sql.PrimaryKey<QDAdhoctask> dAdhoctask11Pk = createPrimaryKey(sysId);

    public final com.mysema.query.sql.ForeignKey<QSBobject> dAdhoctask11SysBobjectidFk = createForeignKey(sysBobjectid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSPoContact> dAdhoctas11AdhoctaskownerFk = createForeignKey(adhoctaskowner, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dAdhocta11AdhoctaskstatusFk = createForeignKey(adhoctaskstatus, "ID");

//    public final com.mysema.query.sql.ForeignKey<QSBobject> dAdhoctask11SysParentidFk = createForeignKey(sysParentid, "ID");

    public QDAdhoctask(String variable) {
        super(QDAdhoctask.class, forVariable(variable), "VZAKHARCHENKO", "D_ADHOCTASK");
        addMetadata();
    }

    public QDAdhoctask(String variable, String schema, String table) {
        super(QDAdhoctask.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDAdhoctask(Path<? extends QDAdhoctask> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_ADHOCTASK");
        addMetadata();
    }

    public QDAdhoctask(PathMetadata<?> metadata) {
        super(QDAdhoctask.class, metadata, "VZAKHARCHENKO", "D_ADHOCTASK");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(adhoctaskdue, ColumnMetadata.named("ADHOCTASKDUE").withIndex(3).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(adhoctaskname, ColumnMetadata.named("ADHOCTASKNAME").withIndex(1).ofType(Types.VARCHAR).withSize(64).notNull());
        addMetadata(adhoctaskowner, ColumnMetadata.named("ADHOCTASKOWNER").withIndex(2).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(adhoctaskstatus, ColumnMetadata.named("ADHOCTASKSTATUS").withIndex(4).ofType(Types.DECIMAL).withSize(18));
        addMetadata(adhoctasktext, ColumnMetadata.named("ADHOCTASKTEXT").withIndex(5).ofType(Types.VARCHAR).withSize(2000));
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

