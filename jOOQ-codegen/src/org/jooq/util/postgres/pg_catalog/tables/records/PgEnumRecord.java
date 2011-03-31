/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables.records;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.TableRecordImpl;
import org.jooq.util.postgres.pg_catalog.tables.PgEnum;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PgEnumRecord extends TableRecordImpl<PgEnumRecord> {

	private static final long serialVersionUID = -332125006;

	/**
	 * An uncommented item
	 */
	public void setEnumtypid(Long value) {
		setValue(PgEnum.ENUMTYPID, value);
	}

	/**
	 * An uncommented item
	 */
	public Long getEnumtypid() {
		return getValue(PgEnum.ENUMTYPID);
	}

	/**
	 * An uncommented item
	 */
	public void setEnumlabel(String value) {
		setValue(PgEnum.ENUMLABEL, value);
	}

	/**
	 * An uncommented item
	 */
	public String getEnumlabel() {
		return getValue(PgEnum.ENUMLABEL);
	}

	public PgEnumRecord(Configuration configuration) {
		super(configuration, PgEnum.PG_ENUM);
	}
}