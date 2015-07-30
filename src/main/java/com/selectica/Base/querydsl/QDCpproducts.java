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
 * QDCpproducts is a Querydsl query type for QDCpproducts
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDCpproducts extends com.mysema.query.sql.RelationalPathBase<QDCpproducts> {

    private static final long serialVersionUID = -1595880156;

    public static final QDCpproducts dCpproducts = new QDCpproducts("D_CPPRODUCTS");

    public final NumberPath<Integer> prddiscount = createNumber("prddiscount", Integer.class);

    public final StringPath prditcode = createString("prditcode");

    public final StringPath prditdesc = createString("prditdesc");

    public final NumberPath<Double> prdpricepu = createNumber("prdpricepu", Double.class);

    public final NumberPath<Integer> prdqty = createNumber("prdqty", Integer.class);

    public final NumberPath<Double> prdsubtotal = createNumber("prdsubtotal", Double.class);

    public final NumberPath<Integer> prdunitmeasure = createNumber("prdunitmeasure", Integer.class);

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

    public final com.mysema.query.sql.PrimaryKey<QDCpproducts> dCpproducts12Pk = createPrimaryKey(sysId);

    public final com.mysema.query.sql.ForeignKey<QSBobject> dCpproduct12SysBobjectidFk = createForeignKey(sysBobjectid, "ID");

//    public final com.mysema.query.sql.ForeignKey<QSBobject> dCpproducts12SysParentidFk = createForeignKey(sysParentid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dCpproduc12PrdunitmeasureFk = createForeignKey(prdunitmeasure, "ID");

    public QDCpproducts(String variable) {
        super(QDCpproducts.class, forVariable(variable), "VZAKHARCHENKO", "D_CPPRODUCTS");
        addMetadata();
    }

    public QDCpproducts(String variable, String schema, String table) {
        super(QDCpproducts.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDCpproducts(Path<? extends QDCpproducts> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_CPPRODUCTS");
        addMetadata();
    }

    public QDCpproducts(PathMetadata<?> metadata) {
        super(QDCpproducts.class, metadata, "VZAKHARCHENKO", "D_CPPRODUCTS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(prddiscount, ColumnMetadata.named("PRDDISCOUNT").withIndex(6).ofType(Types.DECIMAL).withSize(18));
        addMetadata(prditcode, ColumnMetadata.named("PRDITCODE").withIndex(1).ofType(Types.VARCHAR).withSize(255));
        addMetadata(prditdesc, ColumnMetadata.named("PRDITDESC").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(prdpricepu, ColumnMetadata.named("PRDPRICEPU").withIndex(5).ofType(Types.DECIMAL).withSize(15).withDigits(2));
        addMetadata(prdqty, ColumnMetadata.named("PRDQTY").withIndex(3).ofType(Types.DECIMAL).withSize(18));
        addMetadata(prdsubtotal, ColumnMetadata.named("PRDSUBTOTAL").withIndex(7).ofType(Types.DECIMAL).withSize(15).withDigits(2));
        addMetadata(prdunitmeasure, ColumnMetadata.named("PRDUNITMEASURE").withIndex(4).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysBobjectid, ColumnMetadata.named("SYS_BOBJECTID").withIndex(9).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysCreatedtm, ColumnMetadata.named("SYS_CREATEDTM").withIndex(17).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysCreateevent, ColumnMetadata.named("SYS_CREATEEVENT").withIndex(15).ofType(Types.VARCHAR).withSize(32));
        addMetadata(sysCuserid, ColumnMetadata.named("SYS_CUSERID").withIndex(18).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDataexmversion, ColumnMetadata.named("SYS_DATAEXMVERSION").withIndex(13).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDatedefpath, ColumnMetadata.named("SYS_DATEDEFPATH").withIndex(12).ofType(Types.VARCHAR).withSize(200));
        addMetadata(sysId, ColumnMetadata.named("SYS_ID").withIndex(8).ofType(Types.DECIMAL).withSize(7).notNull());
        addMetadata(sysModifydtm, ColumnMetadata.named("SYS_MODIFYDTM").withIndex(19).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysMuserid, ColumnMetadata.named("SYS_MUSERID").withIndex(20).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysParentid, ColumnMetadata.named("SYS_PARENTID").withIndex(10).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysParenttablename, ColumnMetadata.named("SYS_PARENTTABLENAME").withIndex(11).ofType(Types.VARCHAR).withSize(32).notNull());
        addMetadata(sysSource, ColumnMetadata.named("SYS_SOURCE").withIndex(14).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysStatus, ColumnMetadata.named("SYS_STATUS").withIndex(16).ofType(Types.DECIMAL).withSize(18));
    }

}

