/**
 * This class is generated by jOOQ
 */
package org.jooq.util.derby.sys.tables.records;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.TableRecordImpl;
import org.jooq.util.derby.sys.tables.Syssequences;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class SyssequencesRecord extends TableRecordImpl<SyssequencesRecord> {

	private static final long serialVersionUID = -588981671;

	/**
	 * An uncommented item
	 */
	public void setSequenceid(String value) {
		setValue(Syssequences.SEQUENCEID, value);
	}

	/**
	 * An uncommented item
	 */
	public String getSequenceid() {
		return getValue(Syssequences.SEQUENCEID);
	}

	/**
	 * An uncommented item
	 */
	public void setSequencename(String value) {
		setValue(Syssequences.SEQUENCENAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getSequencename() {
		return getValue(Syssequences.SEQUENCENAME);
	}

	/**
	 * An uncommented item
	 */
	public void setSchemaid(String value) {
		setValue(Syssequences.SCHEMAID, value);
	}

	/**
	 * An uncommented item
	 */
	public String getSchemaid() {
		return getValue(Syssequences.SCHEMAID);
	}

	/**
	 * An uncommented item
	 */
	public void setSequencedatatype(String value) {
		setValue(Syssequences.SEQUENCEDATATYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getSequencedatatype() {
		return getValue(Syssequences.SEQUENCEDATATYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setCurrentvalue(Long value) {
		setValue(Syssequences.CURRENTVALUE, value);
	}

	/**
	 * An uncommented item
	 */
	public Long getCurrentvalue() {
		return getValue(Syssequences.CURRENTVALUE);
	}

	/**
	 * An uncommented item
	 */
	public void setStartvalue(Long value) {
		setValue(Syssequences.STARTVALUE, value);
	}

	/**
	 * An uncommented item
	 */
	public Long getStartvalue() {
		return getValue(Syssequences.STARTVALUE);
	}

	/**
	 * An uncommented item
	 */
	public void setMinimumvalue(Long value) {
		setValue(Syssequences.MINIMUMVALUE, value);
	}

	/**
	 * An uncommented item
	 */
	public Long getMinimumvalue() {
		return getValue(Syssequences.MINIMUMVALUE);
	}

	/**
	 * An uncommented item
	 */
	public void setMaximumvalue(Long value) {
		setValue(Syssequences.MAXIMUMVALUE, value);
	}

	/**
	 * An uncommented item
	 */
	public Long getMaximumvalue() {
		return getValue(Syssequences.MAXIMUMVALUE);
	}

	/**
	 * An uncommented item
	 */
	public void setIncrement(Long value) {
		setValue(Syssequences.INCREMENT, value);
	}

	/**
	 * An uncommented item
	 */
	public Long getIncrement() {
		return getValue(Syssequences.INCREMENT);
	}

	/**
	 * An uncommented item
	 */
	public void setCycleoption(String value) {
		setValue(Syssequences.CYCLEOPTION, value);
	}

	/**
	 * An uncommented item
	 */
	public String getCycleoption() {
		return getValue(Syssequences.CYCLEOPTION);
	}

	public SyssequencesRecord(Configuration configuration) {
		super(configuration, Syssequences.SYSSEQUENCES);
	}
}