/**
 * This class is generated by jOOQ
 */
package org.jooq.util.derby.sys.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.derby.DerbyDataType;
import org.jooq.util.derby.sys.Sys;
import org.jooq.util.derby.sys.tables.records.SysconglomeratesRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Sysconglomerates extends TableImpl<SysconglomeratesRecord> {

	private static final long serialVersionUID = 1577717614;

	/**
	 * The singleton instance of SYSCONGLOMERATES
	 */
	public static final Sysconglomerates SYSCONGLOMERATES = new Sysconglomerates();

	/**
	 * The class holding records for this type
	 */
	private static final Class<SysconglomeratesRecord> __RECORD_TYPE = SysconglomeratesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SysconglomeratesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<SysconglomeratesRecord, String> SCHEMAID = new TableFieldImpl<SysconglomeratesRecord, String>(SQLDialect.DERBY, "SCHEMAID", DerbyDataType.CHAR, SYSCONGLOMERATES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SysconglomeratesRecord, String> TABLEID = new TableFieldImpl<SysconglomeratesRecord, String>(SQLDialect.DERBY, "TABLEID", DerbyDataType.CHAR, SYSCONGLOMERATES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SysconglomeratesRecord, Long> CONGLOMERATENUMBER = new TableFieldImpl<SysconglomeratesRecord, Long>(SQLDialect.DERBY, "CONGLOMERATENUMBER", DerbyDataType.BIGINT, SYSCONGLOMERATES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SysconglomeratesRecord, String> CONGLOMERATENAME = new TableFieldImpl<SysconglomeratesRecord, String>(SQLDialect.DERBY, "CONGLOMERATENAME", DerbyDataType.VARCHAR, SYSCONGLOMERATES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SysconglomeratesRecord, Boolean> ISINDEX = new TableFieldImpl<SysconglomeratesRecord, Boolean>(SQLDialect.DERBY, "ISINDEX", DerbyDataType.BOOLEAN, SYSCONGLOMERATES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SysconglomeratesRecord, String> DESCRIPTOR = new TableFieldImpl<SysconglomeratesRecord, String>(SQLDialect.DERBY, "DESCRIPTOR", DerbyDataType.ORGAPACHEDERBYCATALOGINDEXDESCRIPTOR, SYSCONGLOMERATES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SysconglomeratesRecord, Boolean> ISCONSTRAINT = new TableFieldImpl<SysconglomeratesRecord, Boolean>(SQLDialect.DERBY, "ISCONSTRAINT", DerbyDataType.BOOLEAN, SYSCONGLOMERATES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SysconglomeratesRecord, String> CONGLOMERATEID = new TableFieldImpl<SysconglomeratesRecord, String>(SQLDialect.DERBY, "CONGLOMERATEID", DerbyDataType.CHAR, SYSCONGLOMERATES);

	/**
	 * No further instances allowed
	 */
	private Sysconglomerates() {
		super(SQLDialect.DERBY, "SYSCONGLOMERATES", Sys.SYS);
	}
}