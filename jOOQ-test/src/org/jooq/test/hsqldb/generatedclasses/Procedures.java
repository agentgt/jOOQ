/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses;


import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Generated;

import org.jooq.test.hsqldb.generatedclasses.procedures.PArrays1;
import org.jooq.test.hsqldb.generatedclasses.procedures.PArrays2;
import org.jooq.test.hsqldb.generatedclasses.procedures.PArrays3;
import org.jooq.test.hsqldb.generatedclasses.procedures.PAuthorExists;
import org.jooq.test.hsqldb.generatedclasses.procedures.PCreateAuthor;
import org.jooq.test.hsqldb.generatedclasses.procedures.PCreateAuthorByName;
import org.jooq.test.hsqldb.generatedclasses.procedures.PUnused;


/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures in PUBLIC
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public final class Procedures {

	/**
	 * Invoke P_ARRAYS1
	 *
	 * @param inArray IN parameter
	 * @param outArray OUT parameter
	 */
	public static Integer[] pArrays1(Connection connection, Integer[] inArray) throws SQLException {
		PArrays1 p = new PArrays1();
		p.setInArray(inArray);

		p.execute(connection);
		return p.getOutArray();
	}

	/**
	 * Invoke P_ARRAYS2
	 *
	 * @param inArray IN parameter
	 * @param outArray OUT parameter
	 */
	public static Long[] pArrays2(Connection connection, Long[] inArray) throws SQLException {
		PArrays2 p = new PArrays2();
		p.setInArray(inArray);

		p.execute(connection);
		return p.getOutArray();
	}

	/**
	 * Invoke P_ARRAYS3
	 *
	 * @param inArray IN parameter
	 * @param outArray OUT parameter
	 */
	public static String[] pArrays3(Connection connection, String[] inArray) throws SQLException {
		PArrays3 p = new PArrays3();
		p.setInArray(inArray);

		p.execute(connection);
		return p.getOutArray();
	}

	/**
	 * Invoke P_AUTHOR_EXISTS
	 *
	 * @param authorName IN parameter
	 * @param result OUT parameter
	 */
	public static Integer pAuthorExists(Connection connection, String authorName) throws SQLException {
		PAuthorExists p = new PAuthorExists();
		p.setAuthorName(authorName);

		p.execute(connection);
		return p.getResult();
	}

	/**
	 * Invoke P_CREATE_AUTHOR
	 *
	 */
	public static void pCreateAuthor(Connection connection) throws SQLException {
		PCreateAuthor p = new PCreateAuthor();

		p.execute(connection);
	}

	/**
	 * Invoke P_CREATE_AUTHOR_BY_NAME
	 *
	 * @param firstName IN parameter
	 * @param lastName IN parameter
	 */
	public static void pCreateAuthorByName(Connection connection, String firstName, String lastName) throws SQLException {
		PCreateAuthorByName p = new PCreateAuthorByName();
		p.setFirstName(firstName);
		p.setLastName(lastName);

		p.execute(connection);
	}

	/**
	 * Invoke P_UNUSED
	 *
	 * @param in1 IN parameter
	 * @param out1 OUT parameter
	 * @param out2 IN OUT parameter
	 */
	public static PUnused pUnused(Connection connection, String in1, Integer out2) throws SQLException {
		PUnused p = new PUnused();
		p.setIn1(in1);
		p.setOut2(out2);

		p.execute(connection);
		return p;
	}

	/**
	 * No instances
	 */
	private Procedures() {}
}