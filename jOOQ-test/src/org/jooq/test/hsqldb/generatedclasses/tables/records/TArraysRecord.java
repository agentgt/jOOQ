/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class TArraysRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.TArraysRecord> {

	private static final long serialVersionUID = -1160912737;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setStringArray(java.lang.String[] value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.STRING_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String[] getStringArray() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.STRING_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setNumberArray(java.lang.Integer[] value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.NUMBER_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer[] getNumberArray() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.NUMBER_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setDateArray(java.sql.Date[] value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.DATE_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Date[] getDateArray() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.DATE_ARRAY);
	}

	/**
	 * Create a detached TArraysRecord
	 */
	public TArraysRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.T_ARRAYS);
	}

	/**
	 * Create an attached TArraysRecord
	 */
	public TArraysRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.T_ARRAYS, configuration);
	}
}