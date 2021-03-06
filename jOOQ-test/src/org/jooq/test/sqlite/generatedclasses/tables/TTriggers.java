/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TTriggers extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sqlite.generatedclasses.tables.records.TTriggersRecord> {

	private static final long serialVersionUID = -404707694;

	/**
	 * The singleton instance of t_triggers
	 */
	public static final org.jooq.test.sqlite.generatedclasses.tables.TTriggers T_TRIGGERS = new org.jooq.test.sqlite.generatedclasses.tables.TTriggers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.TTriggersRecord> getRecordType() {
		return org.jooq.test.sqlite.generatedclasses.tables.records.TTriggersRecord.class;
	}

	/**
	 * The table column <code>t_triggers.id_generated</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> ID_GENERATED = createField("id_generated", org.jooq.impl.SQLDataType.INTEGER, T_TRIGGERS);

	/**
	 * The table column <code>t_triggers.id</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_TRIGGERS);

	/**
	 * The table column <code>t_triggers.counter</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> COUNTER = createField("counter", org.jooq.impl.SQLDataType.INTEGER, T_TRIGGERS);

	/**
	 * No further instances allowed
	 */
	private TTriggers() {
		super("t_triggers");
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TTriggersRecord> getMainKey() {
		return org.jooq.test.sqlite.generatedclasses.Keys.PK_T_TRIGGERS_ID_GENERATED;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TTriggersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TTriggersRecord>>asList(org.jooq.test.sqlite.generatedclasses.Keys.PK_T_TRIGGERS_ID_GENERATED);
	}
}
