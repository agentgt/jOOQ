/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.procedures;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.db2.generatedclasses.Lukas;
import org.jooq.util.db2.DB2DataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PUnused extends StoredProcedureImpl {

	private static final long serialVersionUID = 527232354;


	/**
	 * An uncommented item
	 */
	public static final Parameter<String> IN1 = new ParameterImpl<String>(SQLDialect.DB2, "IN1", DB2DataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> OUT1 = new ParameterImpl<Integer>(SQLDialect.DB2, "OUT1", DB2DataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> OUT2 = new ParameterImpl<Integer>(SQLDialect.DB2, "OUT2", DB2DataType.INTEGER);

	/**
	 * No further instances allowed
	 */
	public PUnused() {
		super(SQLDialect.DB2, "P_UNUSED", Lukas.LUKAS);

		addInParameter(IN1);
		addOutParameter(OUT1);
		addInOutParameter(OUT2);
	}

	public void setIn1(String value) {
		setValue(IN1, value);
	}

	public void setOut2(Integer value) {
		setValue(OUT2, value);
	}

	public Integer getOut1() {
		return getValue(OUT1);
	}

	public Integer getOut2() {
		return getValue(OUT2);
	}
}