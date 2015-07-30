package com.selectica.Base.querydsl;

import com.mysema.query.sql.ColumnMetadata;
import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.StringPath;
import com.selectica.spring.domain.querydsl.QSBobject;
import com.selectica.spring.domain.querydsl.QSBobjectMultiValue;
import com.selectica.spring.domain.querydsl.QSDictValue;

import javax.annotation.Generated;
import java.sql.Types;

import static com.mysema.query.types.PathMetadataFactory.forVariable;


/**
 * QDDcpdetails is a Querydsl query type for QDDcpdetails
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDDcpdetails extends com.mysema.query.sql.RelationalPathBase<QDDcpdetails> {

    private static final long serialVersionUID = 417422756;

    public static final QDDcpdetails dDcpdetails = new QDDcpdetails("D_DCPDETAILS");

    public final NumberPath<Integer> addedclauses = createNumber("addedclauses", Integer.class);

    public final NumberPath<Integer> changedclauses = createNumber("changedclauses", Integer.class);

    public final StringPath diradr1 = createString("diradr1");

    public final StringPath diradr2 = createString("diradr2");

    public final NumberPath<Integer> dircategory = createNumber("dircategory", Integer.class);

    public final StringPath dircity = createString("dircity");

    public final NumberPath<Integer> dircountry = createNumber("dircountry", Integer.class);

    public final StringPath dirdesc = createString("dirdesc");

    public final NumberPath<Integer> dirstate = createNumber("dirstate", Integer.class);

    public final NumberPath<Integer> dirstatus = createNumber("dirstatus", Integer.class);

    public final StringPath dirwebsite = createString("dirwebsite");

    public final StringPath dirzip = createString("dirzip");

    public final NumberPath<Integer> evclauses = createNumber("evclauses", Integer.class);

//    public final StringPath name = createString("name");

    public final NumberPath<Integer> removedclauses = createNumber("removedclauses", Integer.class);

    public final NumberPath<Integer> sysId = createNumber("sysId", Integer.class);

    public final NumberPath<Integer> usedclauses = createNumber("usedclauses", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QDDcpdetails> dDcpdetails12Pk = createPrimaryKey(sysId);

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dDcpdetails12EvclausesFk = createForeignKey(evclauses, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dDcpdetails12DircategoryFk = createForeignKey(dircategory, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dDcpdetails12DirstatusFk = createForeignKey(dirstatus, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dDcpdetails12SysIdFk = createForeignKey(sysId, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dDcpdetails12DircountryFk = createForeignKey(dircountry, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dDcpdetai12RemovedclausesFk = createForeignKey(removedclauses, "ID");

    public final com.mysema.query.sql.ForeignKey<QSDictValue> dDcpdetails12DirstateFk = createForeignKey(dirstate, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dDcpdetails12UsedclausesFk = createForeignKey(usedclauses, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dDcpdetails12AddedclausesFk = createForeignKey(addedclauses, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dDcpdetai12ChangedclausesFk = createForeignKey(changedclauses, "ID");

    public QDDcpdetails(String variable) {
        super(QDDcpdetails.class, forVariable(variable), "VZAKHARCHENKO", "D_DCPDETAILS");
        addMetadata();
    }

    public QDDcpdetails(String variable, String schema, String table) {
        super(QDDcpdetails.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDDcpdetails(Path<? extends QDDcpdetails> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_DCPDETAILS");
        addMetadata();
    }

    public QDDcpdetails(PathMetadata<?> metadata) {
        super(QDDcpdetails.class, metadata, "VZAKHARCHENKO", "D_DCPDETAILS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(addedclauses, ColumnMetadata.named("ADDEDCLAUSES").withIndex(6).ofType(Types.DECIMAL).withSize(18));
        addMetadata(changedclauses, ColumnMetadata.named("CHANGEDCLAUSES").withIndex(2).ofType(Types.DECIMAL).withSize(18));
        addMetadata(diradr1, ColumnMetadata.named("DIRADR1").withIndex(9).ofType(Types.VARCHAR).withSize(255));
        addMetadata(diradr2, ColumnMetadata.named("DIRADR2").withIndex(10).ofType(Types.VARCHAR).withSize(255));
        addMetadata(dircategory, ColumnMetadata.named("DIRCATEGORY").withIndex(8).ofType(Types.DECIMAL).withSize(18));
        addMetadata(dircity, ColumnMetadata.named("DIRCITY").withIndex(11).ofType(Types.VARCHAR).withSize(255));
        addMetadata(dircountry, ColumnMetadata.named("DIRCOUNTRY").withIndex(14).ofType(Types.DECIMAL).withSize(18));
        addMetadata(dirdesc, ColumnMetadata.named("DIRDESC").withIndex(16).ofType(Types.CLOB).withSize(4000));
        addMetadata(dirstate, ColumnMetadata.named("DIRSTATE").withIndex(12).ofType(Types.DECIMAL).withSize(18));
        addMetadata(dirstatus, ColumnMetadata.named("DIRSTATUS").withIndex(7).ofType(Types.DECIMAL).withSize(18).notNull());
        addMetadata(dirwebsite, ColumnMetadata.named("DIRWEBSITE").withIndex(15).ofType(Types.VARCHAR).withSize(255));
        addMetadata(dirzip, ColumnMetadata.named("DIRZIP").withIndex(13).ofType(Types.VARCHAR).withSize(255));
        addMetadata(evclauses, ColumnMetadata.named("EVCLAUSES").withIndex(4).ofType(Types.DECIMAL).withSize(18));
//        addMetadata(name, ColumnMetadata.named("NAME").withIndex(1).ofType(Types.VARCHAR).withSize(255).notNull());
        addMetadata(removedclauses, ColumnMetadata.named("REMOVEDCLAUSES").withIndex(5).ofType(Types.DECIMAL).withSize(18));
        addMetadata(sysId, ColumnMetadata.named("SYS_ID").withIndex(17).ofType(Types.DECIMAL).withSize(7).notNull());
        addMetadata(usedclauses, ColumnMetadata.named("USEDCLAUSES").withIndex(3).ofType(Types.DECIMAL).withSize(18));
    }

}

