/**
 * Copyright (c) 2009-2012, Lukas Eder, lukas.eder@gmail.com
 *                          Christopher Deckers, chrriis@gmail.com
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
package org.jooq.tools.debug;

import org.jooq.Query;

/**
 * A debugger <code>Processor</code> is used to automatically perform actions
 * before and after the execution of a {@link Query}
 *
 * @author Christopher Deckers
 * @author Lukas Eder
 */
public interface Processor extends DebuggerObject {

    /**
     * Attach a new "before" action to this processor
     * <p>
     * This action will be executed before the {@link Query} matched by the
     * owning {@link Matcher}. Several actions can be chained this way.
     */
    Action newBefore();

    /**
     * Get a copy of the attached "before" actions for this processor
     */
    Action[] before();

    /**
     * Attach a new "instead" action to this processor
     * <p>
     * This action will be executed instead of the {@link Query} matched by the
     * owning {@link Matcher}. Several actions can be chained this way.
     */
    Action newInstead();

    /**
     * Get a copy of the attached "instead" actions for this processor
     */
    Action[] instead();

    /**
     * Attach a new "after" action to this processor
     * <p>
     * This action will be executed after the {@link Query} matched by the
     * owning {@link Matcher}. Several actions can be chained this way.
     */
    Action newAfter();

    /**
     * Get a copy of the attached "after" actions for this processor
     */
    Action[] after();
}
