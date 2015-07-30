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
 * QDContractstats is a Querydsl query type for QDContractstats
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDContractstats extends com.mysema.query.sql.RelationalPathBase<QDContractstats> {

    private static final long serialVersionUID = 828906906;

    public static final QDContractstats dContractstats = new QDContractstats("D_CONTRACTSTATS");

    public final DateTimePath<java.util.Date> contstarttime = createDateTime("contstarttime", java.util.Date.class);

    public final NumberPath<Double> elapsedassembletime = createNumber("elapsedassembletime", Double.class);

    public final NumberPath<Double> elapsedcollaboratetime = createNumber("elapsedcollaboratetime", Double.class);

    public final NumberPath<Double> elapsedcontractcycletime = createNumber("elapsedcontractcycletime", Double.class);

    public final NumberPath<Double> elapsedexecutetime = createNumber("elapsedexecutetime", Double.class);

    public final NumberPath<Double> elapsedmanagetime = createNumber("elapsedmanagetime", Double.class);

    public final NumberPath<Double> elapsednegotiatetime = createNumber("elapsednegotiatetime", Double.class);

    public final NumberPath<Double> elapsedrequesttime = createNumber("elapsedrequesttime", Double.class);

    public final DateTimePath<java.util.Date> lastassemblestarttime = createDateTime("lastassemblestarttime", java.util.Date.class);

    public final DateTimePath<java.util.Date> lastcollaboratestarttime = createDateTime("lastcollaboratestarttime", java.util.Date.class);

    public final DateTimePath<java.util.Date> lastexecutestarttime = createDateTime("lastexecutestarttime", java.util.Date.class);

    public final DateTimePath<java.util.Date> lastmanagestarttime = createDateTime("lastmanagestarttime", java.util.Date.class);

    public final DateTimePath<java.util.Date> lastnegotiatestarttime = createDateTime("lastnegotiatestarttime", java.util.Date.class);

    public final DateTimePath<java.util.Date> lastrequeststarttime = createDateTime("lastrequeststarttime", java.util.Date.class);

    public final NumberPath<Integer> noassemble = createNumber("noassemble", Integer.class);

    public final NumberPath<Integer> nocollaborate = createNumber("nocollaborate", Integer.class);

    public final NumberPath<Integer> noexecute = createNumber("noexecute", Integer.class);

    public final NumberPath<Integer> nomanage = createNumber("nomanage", Integer.class);

    public final NumberPath<Integer> nonegotiate = createNumber("nonegotiate", Integer.class);

    public final NumberPath<Integer> norequest = createNumber("norequest", Integer.class);

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

    public final com.mysema.query.sql.PrimaryKey<QDContractstats> dContractstats15Pk = createPrimaryKey(sysId);

//    public final com.mysema.query.sql.ForeignKey<QSBobject> dContractst15SysParentidFk = createForeignKey(sysParentid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dContracts15SysBobjectidFk = createForeignKey(sysBobjectid, "ID");

    public QDContractstats(String variable) {
        super(QDContractstats.class, forVariable(variable), "VZAKHARCHENKO", "D_CONTRACTSTATS");
        addMetadata();
    }

    public QDContractstats(String variable, String schema, String table) {
        super(QDContractstats.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDContractstats(Path<? extends QDContractstats> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_CONTRACTSTATS");
        addMetadata();
    }

    public QDContractstats(PathMetadata<?> metadata) {
        super(QDContractstats.class, metadata, "VZAKHARCHENKO", "D_CONTRACTSTATS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(contstarttime, ColumnMetadata.named("CONTSTARTTIME").withIndex(1).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(elapsedassembletime, ColumnMetadata.named("ELAPSEDASSEMBLETIME").withIndex(6).ofType(Types.DECIMAL).withSize(15).withDigits(2));
        addMetadata(elapsedcollaboratetime, ColumnMetadata.named("ELAPSEDCOLLABORATETIME").withIndex(9).ofType(Types.DECIMAL).withSize(15).withDigits(2));
        addMetadata(elapsedcontractcycletime, ColumnMetadata.named("ELAPSEDCONTRACTCYCLETIME").withIndex(20).ofType(Types.DECIMAL).withSize(15).withDigits(2));
        addMetadata(elapsedexecutetime, ColumnMetadata.named("ELAPSEDEXECUTETIME").withIndex(15).ofType(Types.DECIMAL).withSize(15).withDigits(2));
        addMetadata(elapsedmanagetime, ColumnMetadata.named("ELAPSEDMANAGETIME").withIndex(18).ofType(Types.DECIMAL).withSize(15).withDigits(2));
        addMetadata(elapsednegotiatetime, ColumnMetadata.named("ELAPSEDNEGOTIATETIME").withIndex(12).ofType(Types.DECIMAL).withSize(15).withDigits(2));
        addMetadata(elapsedrequesttime, ColumnMetadata.named("ELAPSEDREQUESTTIME").withIndex(3).ofType(Types.DECIMAL).withSize(15).withDigits(2));
        addMetadata(lastassemblestarttime, ColumnMetadata.named("LASTASSEMBLESTARTTIME").withIndex(5).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(lastcollaboratestarttime, ColumnMetadata.named("LASTCOLLABORATESTARTTIME").withIndex(8).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(lastexecutestarttime, ColumnMetadata.named("LASTEXECUTESTARTTIME").withIndex(14).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(lastmanagestarttime, ColumnMetadata.named("LASTMANAGESTARTTIME").withIndex(17).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(lastnegotiatestarttime, ColumnMetadata.named("LASTNEGOTIATESTARTTIME").withIndex(11).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(lastrequeststarttime, ColumnMetadata.named("LASTREQUESTSTARTTIME").withIndex(2).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(noassemble, ColumnMetadata.named("NOASSEMBLE").withIndex(7).ofType(Types.DECIMAL).withSize(18));
        addMetadata(nocollaborate, ColumnMetadata.named("NOCOLLABORATE").withIndex(10).ofType(Types.DECIMAL).withSize(18));
        addMetadata(noexecute, ColumnMetadata.named("NOEXECUTE").withIndex(16).ofType(Types.DECIMAL).withSize(18));
        addMetadata(nomanage, ColumnMetadata.named("NOMANAGE").withIndex(19).ofType(Types.DECIMAL).withSize(18));
        addMetadata(nonegotiate, ColumnMetadata.named("NONEGOTIATE").withIndex(13).ofType(Types.DECIMAL).withSize(18));
        addMetadata(norequest, ColumnMetadata.named("NOREQUEST").withIndex(4).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysBobjectid, ColumnMetadata.named("SYS_BOBJECTID").withIndex(22).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysCreatedtm, ColumnMetadata.named("SYS_CREATEDTM").withIndex(30).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysCreateevent, ColumnMetadata.named("SYS_CREATEEVENT").withIndex(28).ofType(Types.VARCHAR).withSize(32));
        addMetadata(sysCuserid, ColumnMetadata.named("SYS_CUSERID").withIndex(31).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDataexmversion, ColumnMetadata.named("SYS_DATAEXMVERSION").withIndex(26).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysDatedefpath, ColumnMetadata.named("SYS_DATEDEFPATH").withIndex(25).ofType(Types.VARCHAR).withSize(200));
        addMetadata(sysId, ColumnMetadata.named("SYS_ID").withIndex(21).ofType(Types.DECIMAL).withSize(7).notNull());
        addMetadata(sysModifydtm, ColumnMetadata.named("SYS_MODIFYDTM").withIndex(32).ofType(Types.TIMESTAMP).withSize(11).withDigits(6));
        addMetadata(sysMuserid, ColumnMetadata.named("SYS_MUSERID").withIndex(33).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysParentid, ColumnMetadata.named("SYS_PARENTID").withIndex(23).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(sysParenttablename, ColumnMetadata.named("SYS_PARENTTABLENAME").withIndex(24).ofType(Types.VARCHAR).withSize(32).notNull());
        addMetadata(sysSource, ColumnMetadata.named("SYS_SOURCE").withIndex(27).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysStatus, ColumnMetadata.named("SYS_STATUS").withIndex(29).ofType(Types.DECIMAL).withSize(18));
    }

}

