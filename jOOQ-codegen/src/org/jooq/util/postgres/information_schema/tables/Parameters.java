/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.postgres.PostgresDataType;
import org.jooq.util.postgres.information_schema.InformationSchema;
import org.jooq.util.postgres.information_schema.tables.records.ParametersRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Parameters extends TableImpl<ParametersRecord> {

	private static final long serialVersionUID = -1604447122;

	/**
	 * The singleton instance of parameters
	 */
	public static final Parameters PARAMETERS = new Parameters();

	/**
	 * The class holding records for this type
	 */
	private static final Class<ParametersRecord> __RECORD_TYPE = ParametersRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ParametersRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> SPECIFIC_CATALOG = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "specific_catalog", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> SPECIFIC_SCHEMA = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "specific_schema", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> SPECIFIC_NAME = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "specific_name", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, Integer> ORDINAL_POSITION = new TableFieldImpl<ParametersRecord, Integer>(SQLDialect.POSTGRES, "ordinal_position", PostgresDataType.INTEGER, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> PARAMETER_MODE = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "parameter_mode", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> IS_RESULT = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "is_result", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> AS_LOCATOR = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "as_locator", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> PARAMETER_NAME = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "parameter_name", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> DATA_TYPE = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "data_type", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, Integer> CHARACTER_MAXIMUM_LENGTH = new TableFieldImpl<ParametersRecord, Integer>(SQLDialect.POSTGRES, "character_maximum_length", PostgresDataType.INTEGER, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, Integer> CHARACTER_OCTET_LENGTH = new TableFieldImpl<ParametersRecord, Integer>(SQLDialect.POSTGRES, "character_octet_length", PostgresDataType.INTEGER, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> CHARACTER_SET_CATALOG = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "character_set_catalog", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> CHARACTER_SET_SCHEMA = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "character_set_schema", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> CHARACTER_SET_NAME = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "character_set_name", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> COLLATION_CATALOG = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "collation_catalog", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> COLLATION_SCHEMA = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "collation_schema", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> COLLATION_NAME = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "collation_name", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, Integer> NUMERIC_PRECISION = new TableFieldImpl<ParametersRecord, Integer>(SQLDialect.POSTGRES, "numeric_precision", PostgresDataType.INTEGER, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, Integer> NUMERIC_PRECISION_RADIX = new TableFieldImpl<ParametersRecord, Integer>(SQLDialect.POSTGRES, "numeric_precision_radix", PostgresDataType.INTEGER, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, Integer> NUMERIC_SCALE = new TableFieldImpl<ParametersRecord, Integer>(SQLDialect.POSTGRES, "numeric_scale", PostgresDataType.INTEGER, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, Integer> DATETIME_PRECISION = new TableFieldImpl<ParametersRecord, Integer>(SQLDialect.POSTGRES, "datetime_precision", PostgresDataType.INTEGER, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> INTERVAL_TYPE = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "interval_type", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> INTERVAL_PRECISION = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "interval_precision", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> UDT_CATALOG = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "udt_catalog", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> UDT_SCHEMA = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "udt_schema", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> UDT_NAME = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "udt_name", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> SCOPE_CATALOG = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "scope_catalog", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> SCOPE_SCHEMA = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "scope_schema", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> SCOPE_NAME = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "scope_name", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, Integer> MAXIMUM_CARDINALITY = new TableFieldImpl<ParametersRecord, Integer>(SQLDialect.POSTGRES, "maximum_cardinality", PostgresDataType.INTEGER, PARAMETERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ParametersRecord, String> DTD_IDENTIFIER = new TableFieldImpl<ParametersRecord, String>(SQLDialect.POSTGRES, "dtd_identifier", PostgresDataType.CHARACTERVARYING, PARAMETERS);

	/**
	 * No further instances allowed
	 */
	private Parameters() {
		super(SQLDialect.POSTGRES, "parameters", InformationSchema.INFORMATION_SCHEMA);
	}
}