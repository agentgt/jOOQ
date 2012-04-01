/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_DIRECTORY", schema = "TEST")
public class T_DIRECTORY extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY> {

	private static final long serialVersionUID = -87905102;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true)
	public java.lang.Integer getID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY> fetchT_DIRECTORYList() {
		return create()
			.selectFrom(org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY)
			.where(org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY.PARENT_ID.equal(getValue(org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT PK_T_DIRECTORY_SELF
	 * FOREIGN KEY (PARENT_ID)
	 * REFERENCES TEST.T_DIRECTORY (ID)
	 * </pre></code>
	 */
	public void setPARENT_ID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY.PARENT_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT PK_T_DIRECTORY_SELF
	 * FOREIGN KEY (PARENT_ID)
	 * REFERENCES TEST.T_DIRECTORY (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "PARENT_ID")
	public java.lang.Integer getPARENT_ID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY.PARENT_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT PK_T_DIRECTORY_SELF
	 * FOREIGN KEY (PARENT_ID)
	 * REFERENCES TEST.T_DIRECTORY (ID)
	 * </pre></code>
	 */
	public org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY fetchT_DIRECTORY() {
		return create()
			.selectFrom(org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY)
			.where(org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY.ID.equal(getValue(org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY.PARENT_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setIS_DIRECTORY(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY.IS_DIRECTORY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "IS_DIRECTORY")
	public java.lang.Integer getIS_DIRECTORY() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY.IS_DIRECTORY);
	}

	/**
	 * An uncommented item
	 */
	public void setname(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY.name, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "name")
	public java.lang.String getname() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY.name);
	}

	/**
	 * Create a detached T_DIRECTORY
	 */
	public T_DIRECTORY() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY);
	}
}