/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VBook extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.VBookRecord> {

	private static final long serialVersionUID = -2054648185;

	/**
	 * The singleton instance of public.v_book
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.VBook V_BOOK = new org.jooq.test.postgres.generatedclasses.tables.VBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.VBookRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.VBookRecord.class;
	}

	/**
	 * The table column <code>public.v_book.id</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.VBookRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>public.v_book.author_id</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.VBookRecord, java.lang.Integer> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>public.v_book.co_author_id</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.VBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("co_author_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>public.v_book.details_id</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.VBookRecord, java.lang.Integer> DETAILS_ID = createField("details_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>public.v_book.title</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.VBookRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>public.v_book.published_in</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.VBookRecord, java.lang.Integer> PUBLISHED_IN = createField("published_in", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>public.v_book.language_id</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.VBookRecord, java.lang.Integer> LANGUAGE_ID = createField("language_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>public.v_book.content_text</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.VBookRecord, java.lang.String> CONTENT_TEXT = createField("content_text", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>public.v_book.content_pdf</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.VBookRecord, byte[]> CONTENT_PDF = createField("content_pdf", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * The table column <code>public.v_book.status</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.VBookRecord, org.jooq.test.postgres.generatedclasses.enums.UBookStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(org.jooq.test.postgres.generatedclasses.enums.UBookStatus.class), this);

	public VBook() {
		super("v_book", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	public VBook(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.VBook.V_BOOK);
	}

	@Override
	public org.jooq.test.postgres.generatedclasses.tables.VBook as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.VBook(alias);
	}
}
