/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.h2.generatedclasses.Public;
import org.jooq.test.h2.generatedclasses.tables.records.XTestCase_64_69Record;
import org.jooq.util.h2.H2DataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_64_69 extends UpdatableTableImpl<XTestCase_64_69Record> {

	private static final long serialVersionUID = 1624368442;

	/**
	 * The singleton instance of X_TEST_CASE_64_69
	 */
	public static final XTestCase_64_69 X_TEST_CASE_64_69 = new XTestCase_64_69();

	/**
	 * The class holding records for this type
	 */
	private static final Class<XTestCase_64_69Record> __RECORD_TYPE = XTestCase_64_69Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XTestCase_64_69Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<XTestCase_64_69Record, Integer> ID = new TableFieldImpl<XTestCase_64_69Record, Integer>(SQLDialect.H2, "ID", H2DataType.INTEGER, X_TEST_CASE_64_69);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.X_TEST_CASE_64_69.UNUSED_ID]
	 * REFERENCES X_UNUSED [PUBLIC.X_UNUSED.ID, PUBLIC.X_UNUSED.NAME, PUBLIC.X_UNUSED.ID]
	 * </pre></code>
	 */
	public static final TableField<XTestCase_64_69Record, Integer> UNUSED_ID = new TableFieldImpl<XTestCase_64_69Record, Integer>(SQLDialect.H2, "UNUSED_ID", H2DataType.INTEGER, X_TEST_CASE_64_69);

	/**
	 * No further instances allowed
	 */
	private XTestCase_64_69() {
		super(SQLDialect.H2, "X_TEST_CASE_64_69", Public.PUBLIC);
	}

	/*
	 * static initialiser
	 */
	static {
		X_TEST_CASE_64_69.addToMainUniqueKey(ID);
	}
}