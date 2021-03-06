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
package com.gs.dmn.signavio.feel.lib;

import com.gs.dmn.feel.lib.DefaultFEELLib;
import com.gs.dmn.feel.lib.StandardFEELLib;
import com.gs.dmn.feel.lib.type.*;
import com.gs.dmn.feel.lib.type.context.DefaultContextType;
import com.gs.dmn.feel.lib.type.list.DefaultListType;
import com.gs.dmn.feel.lib.type.logic.DefaultBooleanType;
import com.gs.dmn.signavio.feel.lib.type.list.SignavioListLib;
import com.gs.dmn.signavio.feel.lib.type.numeric.DefaultSignavioNumberLib;
import com.gs.dmn.signavio.feel.lib.type.numeric.DefaultSignavioNumericType;
import com.gs.dmn.signavio.feel.lib.type.numeric.SignavioNumberLib;
import com.gs.dmn.signavio.feel.lib.type.string.DefaultSignavioStringLib;
import com.gs.dmn.signavio.feel.lib.type.string.DefaultSignavioStringType;
import com.gs.dmn.signavio.feel.lib.type.string.SignavioStringLib;
import com.gs.dmn.signavio.feel.lib.type.time.SignavioDateTimeLib;
import com.gs.dmn.signavio.feel.lib.type.time.xml.*;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import static com.gs.dmn.feel.lib.DefaultFEELLib.DATA_TYPE_FACTORY;

public class DefaultSignavioLib extends BaseSignavioLib<BigDecimal, XMLGregorianCalendar, XMLGregorianCalendar, XMLGregorianCalendar, Duration> {
    public static DefaultSignavioLib INSTANCE = new DefaultSignavioLib();

    public DefaultSignavioLib() {
        this(new DefaultSignavioNumericType(LOGGER),
                new DefaultBooleanType(LOGGER),
                new DefaultSignavioStringType(LOGGER),
                new DefaultSignavioDateType(LOGGER, DATA_TYPE_FACTORY),
                new DefaultSignavioTimeType(LOGGER, DATA_TYPE_FACTORY),
                new DefaultSignavioDateTimeType(LOGGER, DATA_TYPE_FACTORY),
                new DefaultSignavioDurationType(LOGGER, DATA_TYPE_FACTORY),
                new DefaultListType(LOGGER),
                new DefaultContextType(LOGGER),
                new DefaultFEELLib(),
                new DefaultSignavioNumberLib(),
                new DefaultSignavioStringLib(),
                new DefaultSignavioDateTimeLib(),
                new SignavioListLib()
        );
    }

    protected DefaultSignavioLib(
            NumericType<BigDecimal> numericType, BooleanType booleanType, StringType stringType,
            DateType<XMLGregorianCalendar, Duration> dateType, TimeType<XMLGregorianCalendar, Duration> timeType, DateTimeType<XMLGregorianCalendar, Duration> dateTimeType, DurationType<Duration, BigDecimal> durationType,
            ListType listType, ContextType contextType,
            StandardFEELLib<BigDecimal, XMLGregorianCalendar, XMLGregorianCalendar, XMLGregorianCalendar, Duration> feelLib,
            SignavioNumberLib<BigDecimal> numberLib,
            SignavioStringLib stringLib,
            SignavioDateTimeLib<BigDecimal, XMLGregorianCalendar, XMLGregorianCalendar, XMLGregorianCalendar> dateTimeLib,
            SignavioListLib listLib) {
        super(numericType, booleanType, stringType,
                dateType, timeType, dateTimeType, durationType,
                listType, contextType,
                feelLib, numberLib, stringLib, dateTimeLib, listLib);
    }
}
