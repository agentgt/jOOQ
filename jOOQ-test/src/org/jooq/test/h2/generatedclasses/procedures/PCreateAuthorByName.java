/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.procedures;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class PCreateAuthorByName extends org.jooq.impl.StoredProcedureImpl {

	private static final long serialVersionUID = -744165067;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> P2 = new org.jooq.impl.ParameterImpl<java.lang.String>("P2", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> P3 = new org.jooq.impl.ParameterImpl<java.lang.String>("P3", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new procedure call instance
	 */
	public PCreateAuthorByName() {
		super(org.jooq.SQLDialect.H2, "P_CREATE_AUTHOR_BY_NAME", org.jooq.test.h2.generatedclasses.Public.PUBLIC);

		addInParameter(P2);
		addInParameter(P3);
	}

	public void setP2(java.lang.String value) {
		setValue(P2, value);
	}

	public void setP3(java.lang.String value) {
		setValue(P3, value);
	}
}