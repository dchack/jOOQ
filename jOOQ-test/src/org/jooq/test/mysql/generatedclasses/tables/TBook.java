/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.test.mysql.generatedclasses.Test;
import org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord;


/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
public class TBook extends TableImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of t_book
	 */
	public static final TBook T_BOOK = new TBook();

	/**
	 * The class holding records for this table
	 */
	private static final Class<TBookRecord> RECORD_TYPE = TBookRecord.class;

	/**
	 * The class holding records for this table
	 */
	@Override
	public Class<TBookRecord> getRecordType() {
		return RECORD_TYPE;
	}

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY 'PRI'
	 */
	public static final TableField<Integer> ID = new TableFieldImpl<Integer>("ID", Integer.class, T_BOOK);

	/**
	 * The author ID in entity 'author'
	 * 
	 * FOREIGN KEY 't_book_ibfk_1' [AUTHOR_ID] REFERENCES t_author [ID]
	 */
	public static final TableField<Integer> AUTHOR_ID = new TableFieldImpl<Integer>("AUTHOR_ID", Integer.class, T_BOOK);

	/**
	 * The book's title
	 */
	public static final TableField<String> TITLE = new TableFieldImpl<String>("TITLE", String.class, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("t_book", Test.TEST);
	}
}
