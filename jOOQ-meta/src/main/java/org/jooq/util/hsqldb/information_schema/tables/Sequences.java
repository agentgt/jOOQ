/**
 * This class is generated by jOOQ
 */
package org.jooq.util.hsqldb.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class Sequences extends org.jooq.impl.TableImpl<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord> {

	private static final long serialVersionUID = 1688214603;

	/**
	 * The singleton instance of SEQUENCES
	 */
	public static final org.jooq.util.hsqldb.information_schema.tables.Sequences SEQUENCES = new org.jooq.util.hsqldb.information_schema.tables.Sequences();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord> __RECORD_TYPE = org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String> SEQUENCE_CATALOG = new org.jooq.impl.TableFieldImpl<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String>("SEQUENCE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String> SEQUENCE_SCHEMA = new org.jooq.impl.TableFieldImpl<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String>("SEQUENCE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String> SEQUENCE_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String>("SEQUENCE_NAME", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String> DATA_TYPE = new org.jooq.impl.TableFieldImpl<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String>("DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.Long> NUMERIC_PRECISION = new org.jooq.impl.TableFieldImpl<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.Long>("NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.Long> NUMERIC_PRECISION_RADIX = new org.jooq.impl.TableFieldImpl<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.Long>("NUMERIC_PRECISION_RADIX", org.jooq.impl.SQLDataType.BIGINT, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.Long> NUMERIC_SCALE = new org.jooq.impl.TableFieldImpl<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.Long>("NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String> MAXIMUM_VALUE = new org.jooq.impl.TableFieldImpl<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String>("MAXIMUM_VALUE", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String> MINIMUM_VALUE = new org.jooq.impl.TableFieldImpl<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String>("MINIMUM_VALUE", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String> INCREMENT = new org.jooq.impl.TableFieldImpl<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String>("INCREMENT", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String> CYCLE_OPTION = new org.jooq.impl.TableFieldImpl<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String>("CYCLE_OPTION", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String> DECLARED_DATA_TYPE = new org.jooq.impl.TableFieldImpl<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String>("DECLARED_DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.Long> DECLARED_NUMERIC_PRECISION = new org.jooq.impl.TableFieldImpl<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.Long>("DECLARED_NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.Long> DECLARED_NUMERIC_SCALE = new org.jooq.impl.TableFieldImpl<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.Long>("DECLARED_NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String> START_WITH = new org.jooq.impl.TableFieldImpl<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String>("START_WITH", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String> NEXT_VALUE = new org.jooq.impl.TableFieldImpl<org.jooq.util.hsqldb.information_schema.tables.records.SequencesRecord, java.lang.String>("NEXT_VALUE", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * No further instances allowed
	 */
	private Sequences() {
		super("SEQUENCES", org.jooq.util.hsqldb.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}
}