/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.db2.DB2DataType;
import org.jooq.util.db2.syscat.Syscat;
import org.jooq.util.db2.syscat.tables.records.AttributesRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Attributes extends TableImpl<AttributesRecord> {

	private static final long serialVersionUID = -2019585229;

	/**
	 * The singleton instance of ATTRIBUTES
	 */
	public static final Attributes ATTRIBUTES = new Attributes();

	/**
	 * The class holding records for this type
	 */
	private static final Class<AttributesRecord> __RECORD_TYPE = AttributesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AttributesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> TYPESCHEMA = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "TYPESCHEMA", DB2DataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> TYPEMODULENAME = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "TYPEMODULENAME", DB2DataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> TYPENAME = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "TYPENAME", DB2DataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> ATTR_NAME = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "ATTR_NAME", DB2DataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> ATTR_TYPESCHEMA = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "ATTR_TYPESCHEMA", DB2DataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> ATTR_TYPEMODULENAME = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "ATTR_TYPEMODULENAME", DB2DataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> ATTR_TYPENAME = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "ATTR_TYPENAME", DB2DataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> TARGET_TYPESCHEMA = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "TARGET_TYPESCHEMA", DB2DataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> TARGET_TYPEMODULENAME = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "TARGET_TYPEMODULENAME", DB2DataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> TARGET_TYPENAME = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "TARGET_TYPENAME", DB2DataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> SOURCE_TYPESCHEMA = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "SOURCE_TYPESCHEMA", DB2DataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> SOURCE_TYPEMODULENAME = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "SOURCE_TYPEMODULENAME", DB2DataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> SOURCE_TYPENAME = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "SOURCE_TYPENAME", DB2DataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, Short> ORDINAL = new TableFieldImpl<AttributesRecord, Short>(SQLDialect.DB2, "ORDINAL", DB2DataType.SMALLINT, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, Integer> LENGTH = new TableFieldImpl<AttributesRecord, Integer>(SQLDialect.DB2, "LENGTH", DB2DataType.INTEGER, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, Short> SCALE = new TableFieldImpl<AttributesRecord, Short>(SQLDialect.DB2, "SCALE", DB2DataType.SMALLINT, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, Short> CODEPAGE = new TableFieldImpl<AttributesRecord, Short>(SQLDialect.DB2, "CODEPAGE", DB2DataType.SMALLINT, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> COLLATIONSCHEMA = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "COLLATIONSCHEMA", DB2DataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> COLLATIONNAME = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "COLLATIONNAME", DB2DataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> LOGGED = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "LOGGED", DB2DataType.CHARACTER, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> COMPACT = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "COMPACT", DB2DataType.CHARACTER, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> DL_FEATURES = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "DL_FEATURES", DB2DataType.CHARACTER, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AttributesRecord, String> JAVA_FIELDNAME = new TableFieldImpl<AttributesRecord, String>(SQLDialect.DB2, "JAVA_FIELDNAME", DB2DataType.VARCHAR, ATTRIBUTES);

	/**
	 * No further instances allowed
	 */
	private Attributes() {
		super(SQLDialect.DB2, "ATTRIBUTES", Syscat.SYSCAT);
	}
}