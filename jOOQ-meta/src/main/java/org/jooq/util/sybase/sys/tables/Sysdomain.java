/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class Sysdomain extends org.jooq.impl.TableImpl<org.jooq.util.sybase.sys.tables.records.SysdomainRecord> {

	private static final long serialVersionUID = 1704665703;

	/**
	 * The singleton instance of SYSDOMAIN
	 */
	public static final org.jooq.util.sybase.sys.tables.Sysdomain SYSDOMAIN = new org.jooq.util.sybase.sys.tables.Sysdomain();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.sybase.sys.tables.records.SysdomainRecord> __RECORD_TYPE = org.jooq.util.sybase.sys.tables.records.SysdomainRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.sybase.sys.tables.records.SysdomainRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysdomainRecord, java.lang.Short> DOMAIN_ID = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysdomainRecord, java.lang.Short>("domain_id", org.jooq.impl.SQLDataType.SMALLINT, SYSDOMAIN);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysdomainRecord, java.lang.String> DOMAIN_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysdomainRecord, java.lang.String>("domain_name", org.jooq.impl.SQLDataType.CHAR, SYSDOMAIN);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysdomainRecord, java.lang.Short> TYPE_ID = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysdomainRecord, java.lang.Short>("type_id", org.jooq.impl.SQLDataType.SMALLINT, SYSDOMAIN);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysdomainRecord, java.lang.Short> PRECISION = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysdomainRecord, java.lang.Short>("precision", org.jooq.impl.SQLDataType.SMALLINT, SYSDOMAIN);

	/**
	 * No further instances allowed
	 */
	private Sysdomain() {
		super("SYSDOMAIN", org.jooq.util.sybase.sys.Sys.SYS);
	}
}