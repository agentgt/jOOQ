/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle2.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class DateAsTimestampP_976 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1014437520;


	/**
	 * The procedure parameter <code>TEST.P_976.I</code>
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> DATE_AS_TIMESTAMP_I = createParameter("I", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * The procedure parameter <code>TEST.P_976.O</code>
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> DATE_AS_TIMESTAMP_O = createParameter("O", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * Create a new routine call instance
	 */
	public DateAsTimestampP_976() {
		super("P_976", org.jooq.test.oracle2.generatedclasses.DateAsTimestampTest.DATE_AS_TIMESTAMP_TEST);

		addInParameter(DATE_AS_TIMESTAMP_I);
		addOutParameter(DATE_AS_TIMESTAMP_O);
	}

	/**
	 * Set the <code>I</code> parameter IN value to the routine
	 */
	public void setI(java.sql.Timestamp value) {
		setValue(org.jooq.test.oracle2.generatedclasses.routines.DateAsTimestampP_976.DATE_AS_TIMESTAMP_I, value);
	}

	/**
	 * Get the <code>O</code> parameter OUT value from the routine
	 */
	public java.sql.Timestamp getO() {
		return getValue(DATE_AS_TIMESTAMP_O);
	}
}
