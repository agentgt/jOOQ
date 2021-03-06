/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "V_LIBRARY", schema = "TEST")
public class VLibraryRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = -1353528728;

	/**
	 * The table column <code>TEST.V_LIBRARY.AUTHOR</code>
	 */
	public void setAuthor(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.VLibrary.V_LIBRARY.AUTHOR, value);
	}

	/**
	 * The table column <code>TEST.V_LIBRARY.AUTHOR</code>
	 */
	@javax.persistence.Column(name = "AUTHOR", length = 101)
	public java.lang.String getAuthor() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.VLibrary.V_LIBRARY.AUTHOR);
	}

	/**
	 * The table column <code>TEST.V_LIBRARY.TITLE</code>
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.VLibrary.V_LIBRARY.TITLE, value);
	}

	/**
	 * The table column <code>TEST.V_LIBRARY.TITLE</code>
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.VLibrary.V_LIBRARY.TITLE);
	}

	/**
	 * Create a detached VLibraryRecord
	 */
	public VLibraryRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.VLibrary.V_LIBRARY);
	}
}
