/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema.tables.records;

import org.jooq.Result;
import org.jooq.impl.RecordImpl;
import org.jooq.util.mysql.information_schema.tables.SessionVariables;


/**
 * This class is generated by jOOQ.
 */
public class SessionVariablesRecord extends RecordImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 */
	public void setVariableName(String value) {
		setValue(SessionVariables.VARIABLE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getVariableName() {
		return getValue(SessionVariables.VARIABLE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setVariableValue(String value) {
		setValue(SessionVariables.VARIABLE_VALUE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getVariableValue() {
		return getValue(SessionVariables.VARIABLE_VALUE);
	}

	public SessionVariablesRecord(Result result) {
		super(result);
	}
}
