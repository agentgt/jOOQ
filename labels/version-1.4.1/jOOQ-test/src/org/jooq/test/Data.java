/**
 * Copyright (c) 2009, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jooq.test;

import java.sql.Date;

import org.jooq.Configuration;
import org.jooq.SQLDialect;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.impl.TableRecordImpl;

/**
 * @author Lukas Eder
 */
@SuppressWarnings("serial")
public final class Data {
	public static final Table<Table1Record> TABLE1 = new TableImpl<Table1Record>(SQLDialect.SQL99, "TABLE1") {
		@Override
		public Class<Table1Record> getRecordType() {
			return Table1Record.class;
		}
	};
	public static final Table<Table2Record> TABLE2 = new TableImpl<Table2Record>(SQLDialect.SQL99, "TABLE2"){
		@Override
		public Class<Table2Record> getRecordType() {
			return Table2Record.class;
		}
	};
	public static final Table<Table3Record> TABLE3 = new TableImpl<Table3Record>(SQLDialect.SQL99, "TABLE3") {
		@Override
		public Class<Table3Record> getRecordType() {
			return Table3Record.class;
		}
	};

	public static final TableField<Table1Record, Integer> FIELD_ID1 = new TableFieldImpl<Table1Record, Integer>(SQLDialect.SQL99, "ID1", Integer.class, TABLE1);
	public static final TableField<Table2Record, Integer> FIELD_ID2 = new TableFieldImpl<Table2Record, Integer>(SQLDialect.SQL99, "ID2", Integer.class, TABLE2);
	public static final TableField<Table3Record, Integer> FIELD_ID3 = new TableFieldImpl<Table3Record, Integer>(SQLDialect.SQL99, "ID3", Integer.class, TABLE3);

	public static final TableField<Table1Record, String> FIELD_NAME1 = new TableFieldImpl<Table1Record, String>(SQLDialect.SQL99, "NAME1", String.class, TABLE1);
	public static final TableField<Table2Record, String> FIELD_NAME2 = new TableFieldImpl<Table2Record, String>(SQLDialect.SQL99, "NAME2", String.class, TABLE2);
	public static final TableField<Table3Record, String> FIELD_NAME3 = new TableFieldImpl<Table3Record, String>(SQLDialect.SQL99, "NAME3", String.class, TABLE3);

	public static final TableField<Table1Record, Date> FIELD_DATE1 = new TableFieldImpl<Table1Record, Date>(SQLDialect.SQL99, "DATE1", Date.class, TABLE1);
	public static final TableField<Table2Record, Date> FIELD_DATE2 = new TableFieldImpl<Table2Record, Date>(SQLDialect.SQL99, "DATE2", Date.class, TABLE2);
	public static final TableField<Table3Record, Date> FIELD_DATE3 = new TableFieldImpl<Table3Record, Date>(SQLDialect.SQL99, "DATE3", Date.class, TABLE3);

	public static class Table1Record extends TableRecordImpl<Table1Record> {
		public Table1Record(Configuration configuration) {
	        super(configuration, TABLE1);
		}
	}
	public static class Table2Record extends TableRecordImpl<Table2Record> {
		public Table2Record(Configuration configuration) {
	        super(configuration, TABLE2);
		}
	}
	public static class Table3Record extends TableRecordImpl<Table3Record> {
		public Table3Record(Configuration configuration) {
	        super(configuration, TABLE3);
		}
	}

	private Data() {}
}