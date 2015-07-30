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
 * QDCpservices is a Querydsl query type for QDCpservices
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDCpservices extends com.mysema.query.sql.RelationalPathBase<QDCpservices> {

    private static final long serialVersionUID = 787090462;

    public static final QDCpservices dCpservices = new QDCpservices("D_CPSERVICES");

    public final StringPath serdesc = createString("serdesc");

    public final NumberPath<Integer> serdiscount = createNumber("serdiscount", Integer.class);

    public final StringPath sername = createString("sername");

    public final NumberPath<Double> serpricepu = createNumber("serpricepu", Double.class);

    public final NumberPath<Integer> serqty = createNumber("serqty", Integer.class);

    public final DateTimePath<java.util.Date> serserdate = createDateTime("serserdate", java.util.Date.class);

    public final NumberPath<Double> sersubtotal = createNumber("sersubtotal", Double.class);

    public final NumberPath<Integer> serunitmeasure = createNumber("serunitmeasure", Integer.class);

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

    public final com.mysema.query.sql.PrimaryKey<QDCpservices> dCpservices12Pk = createPrimaryKey(sysId);

    public final com.mysema.query.sql.ForeignKey<QSBobject> dCpservice12SysBobjectidFk = createForeignKey(sysBobjectid, "ID");

//    public final com.mysema.query.sql.ForeignKey<QSBobject> dCpservices12SysParentidFk = createForeignKey(sysParentid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCpservic12SerunitmeasureFk = createForeignKey(serunitmeasure, "ID");

    public QDCpservices(String variable) {
        super(QDCpservices.class, forVariable(variable), "VZAKHARCHENKO", "D_CPSERVICES");
        addMetadata();
    }

    public QDCpservices(String variable, String schema, String table) {
        super(QDCpservices.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDCpservices(Path<? extends QDCpservices> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_CPSERVICES");
        addMetadata();
    }

    public QDCpservices(PathMetadata<?> metadata) {
        super(QDCpservices.class, metadata, "VZAKHARCHENKO", "D_CPSERVICES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(serdesc, ColumnMetadata.named("SERDESC").withIndex(2).ofType(Types.CLOB).withSize(4000));
        addMetadata(serdiscount, ColumnMetadata.named("SERDISCOUNT").withIndex(6).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sername, ColumnMetadata.named("SERNAME").withIndex(1).ofType(Types.VARCHAR).withSize(255));
        addMetadata(serpricepu, ColumnMetadata.named("SERPRICEPU").withIndex(5).ofType(Types.DECIMAL).withSize(15).withDigits(2));
        addMetadata(serqty, ColumnMetadata.named("SERQTY").withIndex(3).ofType(Types.DECIMAL).withSize(18));
        addMetadata(serserdate, ColumnMetadata.named("SERSERDATE").withIndex(8).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sersubtotal, ColumnMetadata.named("SERSUBTOTAL").withIndex(7).ofType(Types.DECIMAL).withSize(15).withDigits(2));
        addMetadata(serunitmeasure, ColumnMetadata.named("SERUNITMEASURE").withIndex(4).ofType(Types.DECIMAL).withSize(18));
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

