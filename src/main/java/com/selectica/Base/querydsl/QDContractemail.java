package com.selectica.Base.querydsl;

import com.mysema.query.sql.ColumnMetadata;
import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.DateTimePath;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.StringPath;
import com.selectica.spring.domain.querydsl.QSBobject;
import com.selectica.spring.domain.querydsl.QSBobjectMultiValue;

import javax.annotation.Generated;
import java.sql.Types;

import static com.mysema.query.types.PathMetadataFactory.forVariable;


/**
 * QDContractemail is a Querydsl query type for QDContractemail
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDContractemail extends com.mysema.query.sql.RelationalPathBase<QDContractemail> {

    private static final long serialVersionUID = 815768727;

    public static final QDContractemail dContractemail = new QDContractemail("D_CONTRACTEMAIL");

    public final NumberPath<Integer> attachments = createNumber("attachments", Integer.class);

    public final StringPath body = createString("body");

    public final StringPath cc = createString("cc");

    public final NumberPath<Integer> contractattach = createNumber("contractattach", Integer.class);

    public final StringPath replyto = createString("replyto");

    public final StringPath status = createString("status");

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

    public final StringPath to = createString("to");

    public final com.mysema.query.sql.PrimaryKey<QDContractemail> dContractemail15Pk = createPrimaryKey(sysId);

    public final com.mysema.query.sql.ForeignKey<QSBobject> dContracte15SysBobjectidFk = createForeignKey(sysBobjectid, "ID");

//    public final com.mysema.query.sql.ForeignKey<QSBobject> dContractem15SysParentidFk = createForeignKey(sysParentid, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobjectMultiValue> dContractema15AttachmentsFk = createForeignKey(attachments, "ID");

    public final com.mysema.query.sql.ForeignKey<QSBobject> dContract15ContractattachFk = createForeignKey(contractattach, "ID");

    public QDContractemail(String variable) {
        super(QDContractemail.class, forVariable(variable), "VZAKHARCHENKO", "D_CONTRACTEMAIL");
        addMetadata();
    }

    public QDContractemail(String variable, String schema, String table) {
        super(QDContractemail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDContractemail(Path<? extends QDContractemail> path) {
        super(path.getType(), path.getMetadata(), "VZAKHARCHENKO", "D_CONTRACTEMAIL");
        addMetadata();
    }

    public QDContractemail(PathMetadata<?> metadata) {
        super(QDContractemail.class, metadata, "VZAKHARCHENKO", "D_CONTRACTEMAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attachments, ColumnMetadata.named("ATTACHMENTS").withIndex(5).ofType(Types.DECIMAL).withSize(18));
        addMetadata(body, ColumnMetadata.named("BODY").withIndex(8).ofType(Types.CLOB).withSize(4000).notNull());
        addMetadata(cc, ColumnMetadata.named("CC").withIndex(2).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(contractattach, ColumnMetadata.named("CONTRACTATTACH").withIndex(4).ofType(Types.DECIMAL).withSize(18));
        addMetadata(replyto, ColumnMetadata.named("REPLYTO").withIndex(3).ofType(Types.VARCHAR).withSize(100));
        addMetadata(status, ColumnMetadata.named("STATUS").withIndex(7).ofType(Types.VARCHAR).withSize(500));
        addMetadata(subject, ColumnMetadata.named("SUBJECT").withIndex(6).ofType(Types.VARCHAR).withSize(100).notNull());
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
        addMetadata(to, ColumnMetadata.named("TO").withIndex(1).ofType(Types.VARCHAR).withSize(1000).notNull());
    }

}

