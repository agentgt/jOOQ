/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema.tables.records;

import org.jooq.Result;
import org.jooq.impl.RecordImpl;
import org.jooq.util.mysql.information_schema.tables.ReferentialConstraints;


/**
 * This class is generated by jOOQ.
 */
public class ReferentialConstraintsRecord extends RecordImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 */
	public void setConstraintCatalog(String value) {
		setValue(ReferentialConstraints.CONSTRAINT_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public String getConstraintCatalog() {
		return getValue(ReferentialConstraints.CONSTRAINT_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintSchema(String value) {
		setValue(ReferentialConstraints.CONSTRAINT_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getConstraintSchema() {
		return getValue(ReferentialConstraints.CONSTRAINT_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintName(String value) {
		setValue(ReferentialConstraints.CONSTRAINT_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getConstraintName() {
		return getValue(ReferentialConstraints.CONSTRAINT_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setUniqueConstraintCatalog(String value) {
		setValue(ReferentialConstraints.UNIQUE_CONSTRAINT_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public String getUniqueConstraintCatalog() {
		return getValue(ReferentialConstraints.UNIQUE_CONSTRAINT_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setUniqueConstraintSchema(String value) {
		setValue(ReferentialConstraints.UNIQUE_CONSTRAINT_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getUniqueConstraintSchema() {
		return getValue(ReferentialConstraints.UNIQUE_CONSTRAINT_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setUniqueConstraintName(String value) {
		setValue(ReferentialConstraints.UNIQUE_CONSTRAINT_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getUniqueConstraintName() {
		return getValue(ReferentialConstraints.UNIQUE_CONSTRAINT_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setMatchOption(String value) {
		setValue(ReferentialConstraints.MATCH_OPTION, value);
	}

	/**
	 * An uncommented item
	 */
	public String getMatchOption() {
		return getValue(ReferentialConstraints.MATCH_OPTION);
	}

	/**
	 * An uncommented item
	 */
	public void setUpdateRule(String value) {
		setValue(ReferentialConstraints.UPDATE_RULE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getUpdateRule() {
		return getValue(ReferentialConstraints.UPDATE_RULE);
	}

	/**
	 * An uncommented item
	 */
	public void setDeleteRule(String value) {
		setValue(ReferentialConstraints.DELETE_RULE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getDeleteRule() {
		return getValue(ReferentialConstraints.DELETE_RULE);
	}

	/**
	 * An uncommented item
	 */
	public void setTableName(String value) {
		setValue(ReferentialConstraints.TABLE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableName() {
		return getValue(ReferentialConstraints.TABLE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setReferencedTableName(String value) {
		setValue(ReferentialConstraints.REFERENCED_TABLE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getReferencedTableName() {
		return getValue(ReferentialConstraints.REFERENCED_TABLE_NAME);
	}

	public ReferentialConstraintsRecord(Result result) {
		super(result);
	}
}
