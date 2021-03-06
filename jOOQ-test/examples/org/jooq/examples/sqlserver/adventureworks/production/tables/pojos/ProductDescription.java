/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductDescription", schema = "Production")
public class ProductDescription implements java.io.Serializable {

	private static final long serialVersionUID = 500586337;


	@javax.validation.constraints.NotNull
	private java.lang.Integer  ProductDescriptionID;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 400)
	private java.lang.String   Description;

	@javax.validation.constraints.NotNull
	private java.lang.String   rowguid;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ProductDescriptionID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getProductDescriptionID() {
		return this.ProductDescriptionID;
	}

	public void setProductDescriptionID(java.lang.Integer ProductDescriptionID) {
		this.ProductDescriptionID = ProductDescriptionID;
	}

	@javax.persistence.Column(name = "Description", nullable = false, length = 400)
	public java.lang.String getDescription() {
		return this.Description;
	}

	public void setDescription(java.lang.String Description) {
		this.Description = Description;
	}

	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return this.rowguid;
	}

	public void setrowguid(java.lang.String rowguid) {
		this.rowguid = rowguid;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
