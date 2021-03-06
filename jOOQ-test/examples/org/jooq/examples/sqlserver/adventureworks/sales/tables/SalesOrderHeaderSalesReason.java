/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class SalesOrderHeaderSalesReason extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason> {

	private static final long serialVersionUID = 1248569275;

	/**
	 * The singleton instance of Sales.SalesOrderHeaderSalesReason
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeaderSalesReason SalesOrderHeaderSalesReason = new org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeaderSalesReason();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason.class;
	}

	/**
	 * The table column <code>Sales.SalesOrderHeaderSalesReason.SalesOrderID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SalesOrderHeaderSalesReason_SalesOrderHeader_SalesOrderID
	 * FOREIGN KEY (SalesOrderID)
	 * REFERENCES Sales.SalesOrderHeader (SalesOrderID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason, java.lang.Integer> SalesOrderID = createField("SalesOrderID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>Sales.SalesOrderHeaderSalesReason.SalesReasonID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SalesOrderHeaderSalesReason_SalesReason_SalesReasonID
	 * FOREIGN KEY (SalesReasonID)
	 * REFERENCES Sales.SalesReason (SalesReasonID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason, java.lang.Integer> SalesReasonID = createField("SalesReasonID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>Sales.SalesOrderHeaderSalesReason.ModifiedDate</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public SalesOrderHeaderSalesReason() {
		super("SalesOrderHeaderSalesReason", org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales);
	}

	public SalesOrderHeaderSalesReason(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeaderSalesReason.SalesOrderHeaderSalesReason);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_SalesOrderHeaderSalesReason_SalesOrderID_SalesReasonID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_SalesOrderHeaderSalesReason_SalesOrderID_SalesReasonID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_SalesOrderHeaderSalesReason_SalesOrderHeader_SalesOrderID, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_SalesOrderHeaderSalesReason_SalesReason_SalesReasonID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeaderSalesReason as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeaderSalesReason(alias);
	}
}
