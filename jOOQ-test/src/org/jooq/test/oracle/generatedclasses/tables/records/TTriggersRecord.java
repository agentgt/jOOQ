/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class TTriggersRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.tables.records.TTriggersRecord> {

	private static final long serialVersionUID = -713128001;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.tables.TTriggers.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.tables.TTriggers.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setCounter(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.tables.TTriggers.COUNTER, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getCounter() {
		return getValue(org.jooq.test.oracle.generatedclasses.tables.TTriggers.COUNTER);
	}

	/**
	 * Create a detached TTriggersRecord
	 */
	public TTriggersRecord() {
		super(org.jooq.test.oracle.generatedclasses.tables.TTriggers.T_TRIGGERS);
	}

	/**
	 * Create an attached TTriggersRecord
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public TTriggersRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.oracle.generatedclasses.tables.TTriggers.T_TRIGGERS, configuration);
	}
}