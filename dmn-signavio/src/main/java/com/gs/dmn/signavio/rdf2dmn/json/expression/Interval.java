/*
 * Copyright 2016 Goldman Sachs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.gs.dmn.signavio.rdf2dmn.json.expression;

import com.gs.dmn.signavio.rdf2dmn.json.Context;
import com.gs.dmn.signavio.rdf2dmn.json.Visitor;

public class Interval extends UnaryTest {
    private Expression start;
    private Expression end;
    private boolean openStart;
    private boolean openEnd;

    public Expression getStart() {
        return start;
    }

    public Expression getEnd() {
        return end;
    }

    public boolean isOpenStart() {
        return openStart;
    }

    public boolean isOpenEnd() {
        return openEnd;
    }

    @Override
    public String accept(Visitor visitor, Context context) {
        return visitor.visit(this, context);
    }

    @Override
    public String toString() {
        return String.format("%s(%s, %s, %s, %s)", this.getClass().getSimpleName(), openStart, start.toString(), openEnd, end.toString());
    }

}
