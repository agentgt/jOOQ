/**
 * This class is generated by jOOQ
 */
package org.jooq.util.derby.sys.tables.records;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.TableRecordImpl;
import org.jooq.util.derby.sys.tables.Syscolumns;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class SyscolumnsRecord extends TableRecordImpl<SyscolumnsRecord> {

	private static final long serialVersionUID = -1736246201;

	/**
	 * An uncommented item
	 */
	public void setReferenceid(String value) {
		setValue(Syscolumns.REFERENCEID, value);
	}

	/**
	 * An uncommented item
	 */
	public String getReferenceid() {
		return getValue(Syscolumns.REFERENCEID);
	}

	/**
	 * An uncommented item
	 */
	public void setColumnname(String value) {
		setValue(Syscolumns.COLUMNNAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getColumnname() {
		return getValue(Syscolumns.COLUMNNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setColumnnumber(Integer value) {
		setValue(Syscolumns.COLUMNNUMBER, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getColumnnumber() {
		return getValue(Syscolumns.COLUMNNUMBER);
	}

	/**
	 * An uncommented item
	 */
	public void setColumndatatype(String value) {
		setValue(Syscolumns.COLUMNDATATYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getColumndatatype() {
		return getValue(Syscolumns.COLUMNDATATYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setColumndefault(String value) {
		setValue(Syscolumns.COLUMNDEFAULT, value);
	}

	/**
	 * An uncommented item
	 */
	public String getColumndefault() {
		return getValue(Syscolumns.COLUMNDEFAULT);
	}

	/**
	 * An uncommented item
	 */
	public void setColumndefaultid(String value) {
		setValue(Syscolumns.COLUMNDEFAULTID, value);
	}

	/**
	 * An uncommented item
	 */
	public String getColumndefaultid() {
		return getValue(Syscolumns.COLUMNDEFAULTID);
	}

	/**
	 * An uncommented item
	 */
	public void setAutoincrementvalue(Long value) {
		setValue(Syscolumns.AUTOINCREMENTVALUE, value);
	}

	/**
	 * An uncommented item
	 */
	public Long getAutoincrementvalue() {
		return getValue(Syscolumns.AUTOINCREMENTVALUE);
	}

	/**
	 * An uncommented item
	 */
	public void setAutoincrementstart(Long value) {
		setValue(Syscolumns.AUTOINCREMENTSTART, value);
	}

	/**
	 * An uncommented item
	 */
	public Long getAutoincrementstart() {
		return getValue(Syscolumns.AUTOINCREMENTSTART);
	}

	/**
	 * An uncommented item
	 */
	public void setAutoincrementinc(Long value) {
		setValue(Syscolumns.AUTOINCREMENTINC, value);
	}

	/**
	 * An uncommented item
	 */
	public Long getAutoincrementinc() {
		return getValue(Syscolumns.AUTOINCREMENTINC);
	}

	public SyscolumnsRecord(Configuration configuration) {
		super(configuration, Syscolumns.SYSCOLUMNS);
	}
}