/**
 * Copyright (c) 2009-2011, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
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
 * . Neither the name "jOOQ" nor the names of its contributors may be
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
package org.jooq.impl;

import java.util.Collections;
import java.util.List;

import org.jooq.Attachable;
import org.jooq.Configuration;
import org.jooq.DataType;
import org.jooq.Field;

/**
 * A base class for custom {@link Field} implementations in client code.
 * <p>
 * Client code may provide proper {@link Field} implementations extending this
 * useful base class. All necessary parts of the {@link Field} interface are
 * already implemented. Only these two methods need further implementation:
 * <ul>
 * <li>{@link #toSQLReference(Configuration, boolean)}</li>
 * <li>{@link #bind(Configuration, java.sql.PreparedStatement, int)}</li>
 * </ul>
 * Refer to those method's Javadoc for further details about their expected
 * behaviour. Note that, optionally, an additional implementation for
 * <ul>
 * <li>{@link #toSQLDeclaration(Configuration, boolean)}</li>
 * </ul>
 * may also be provided, if the default behaviour thereof needs to be
 * overridden.
 *
 * @author Lukas Eder
 */
public abstract class CustomField<T> extends AbstractField<T> {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -1778024624798672262L;

    /**
     * @deprecated - 1.6.1 [#453] - Use {@link #CustomField(String, DataType)} instead
     */
    @SuppressWarnings("unused")
    @Deprecated
    protected CustomField(Configuration configuration, String name, DataType<T> type) {
        this(name, type);
    }

    protected CustomField(String name, DataType<T> type) {
        super(name, type);
    }

    /**
     * Don't allow any further overrides
     */
    @Override
    public final Field<T> as(String alias) {
        return super.as(alias);
    }

    /**
     * Don't allow any further overrides
     */
    @Override
    public final Field<T> add(Field<? extends Number> value) {
        return super.add(value);
    }

    /**
     * Don't allow any further overrides
     */
    @Override
    public final Field<T> mul(Field<? extends Number> value) {
        return super.mul(value);
    }

    /**
     * Subclasses may further override this method
     * <hr/>
     * {@inheritDoc}
     */
    @Override
    public boolean isNullLiteral() {
        return false;
    }

    /**
     * Subclasses may further override this method
     * <hr/>
     * {@inheritDoc}
     */
    @Override
    public List<Attachable> getAttachables() {
        return Collections.emptyList();
    }
}