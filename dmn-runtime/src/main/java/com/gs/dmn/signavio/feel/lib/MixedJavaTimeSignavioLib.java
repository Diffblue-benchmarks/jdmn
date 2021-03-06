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

import com.gs.dmn.feel.lib.MixedJavaTimeFEELLib;
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
import com.gs.dmn.signavio.feel.lib.type.time.mixed.MixedSignavioDateTimeLib;
import com.gs.dmn.signavio.feel.lib.type.time.mixed.SignavioLocalDateType;
import com.gs.dmn.signavio.feel.lib.type.time.mixed.SignavioOffsetTimeType;
import com.gs.dmn.signavio.feel.lib.type.time.mixed.SignavioZonedDateTimeType;
import com.gs.dmn.signavio.feel.lib.type.time.xml.DefaultSignavioDurationType;

import javax.xml.datatype.Duration;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetTime;
import java.time.ZonedDateTime;

import static com.gs.dmn.feel.lib.DefaultFEELLib.DATA_TYPE_FACTORY;

public class MixedJavaTimeSignavioLib extends BaseSignavioLib<BigDecimal, LocalDate, OffsetTime, ZonedDateTime, Duration> {
    public static MixedJavaTimeSignavioLib INSTANCE = new MixedJavaTimeSignavioLib();

    private final MixedJavaTimeFEELLib mixedFeelLib;

    public MixedJavaTimeSignavioLib() {
        this(new DefaultSignavioNumericType(LOGGER),
                new DefaultBooleanType(LOGGER),
                new DefaultSignavioStringType(LOGGER),
                new SignavioLocalDateType(LOGGER, DATA_TYPE_FACTORY),
                new SignavioOffsetTimeType(LOGGER, DATA_TYPE_FACTORY),
                new SignavioZonedDateTimeType(LOGGER, DATA_TYPE_FACTORY),
                new DefaultSignavioDurationType(LOGGER, DATA_TYPE_FACTORY),
                new DefaultListType(LOGGER),
                new DefaultContextType(LOGGER),
                new MixedJavaTimeFEELLib(),
                new DefaultSignavioNumberLib(),
                new DefaultSignavioStringLib(),
                (SignavioDateTimeLib) new MixedSignavioDateTimeLib(),
                new SignavioListLib()
        );
    }

    protected MixedJavaTimeSignavioLib(
            NumericType<BigDecimal> numericType, BooleanType booleanType, StringType stringType,
            DateType<LocalDate, Duration> dateType, TimeType<OffsetTime, Duration> timeType, DateTimeType<ZonedDateTime, Duration> dateTimeType, DurationType<Duration, BigDecimal> durationType,
            ListType listType, ContextType contextType,
            StandardFEELLib<BigDecimal, LocalDate, OffsetTime, ZonedDateTime, Duration> feelLib,
            SignavioNumberLib<BigDecimal> numberLib,
            SignavioStringLib stringLib,
            SignavioDateTimeLib<BigDecimal, LocalDate, OffsetTime, ZonedDateTime> dateTimeLib,
            SignavioListLib listLib) {
        super(numericType, booleanType, stringType,
                dateType, timeType, dateTimeType, durationType,
                listType, contextType,
                feelLib, numberLib, stringLib, dateTimeLib, listLib);
        this.mixedFeelLib = (MixedJavaTimeFEELLib) this.feelLib;
    }

    //
    // Date and time operations
    //
    public BigDecimal day(ZonedDateTime date) {
        return this.mixedFeelLib.day(date);
    }

    public LocalDate dayAdd(ZonedDateTime dateTime, BigDecimal daysToAdd) {
        try {
            return this.dateTimeLib.dayAddDateTime(dateTime, daysToAdd);
        } catch (Exception e) {
            String message = String.format("dayAdd(%s, %s)", dateTime, daysToAdd);
            logError(message, e);
            return null;
        }
    }

    public BigDecimal dayDiff(ZonedDateTime dateTime1, ZonedDateTime dateTime2) {
        try {
            return BigDecimal.valueOf(this.dateTimeLib.dayDiffDateTime(dateTime1, dateTime2));
        } catch (Exception e) {
            String message = String.format("dayDiff(%s, %s)", dateTime1, dateTime2);
            logError(message, e);
            return null;
        }
    }

    public BigDecimal hour(ZonedDateTime dateTime) {
        return this.mixedFeelLib.hour(dateTime);
    }

    public BigDecimal hourDiff(ZonedDateTime time1, ZonedDateTime time2) {
        try {
            return BigDecimal.valueOf(this.dateTimeLib.hourDiffDateTime(time1, time2));
        } catch (Exception e) {
            String message = String.format("hourDiff(%s, %s)", time1, time2);
            logError(message, e);
            return null;
        }
    }

    public BigDecimal minute(ZonedDateTime dateTime) {
        return this.mixedFeelLib.minute(dateTime);
    }

    public BigDecimal second(ZonedDateTime time) {
        return this.mixedFeelLib.second(time);
    }

    public Duration timeOffset(ZonedDateTime time) {
        return this.mixedFeelLib.timeOffset(time);
    }

    public String timezone(ZonedDateTime time) {
        return this.mixedFeelLib.timezone(time);
    }

    public BigDecimal minutesDiff(ZonedDateTime dateTime1, ZonedDateTime dateTime2) {
        try {
            return BigDecimal.valueOf(this.dateTimeLib.minutesDiffDateTime(dateTime1, dateTime2));
        } catch (Exception e) {
            String message = String.format("minutesDiff(%s, %s)", dateTime1, dateTime2);
            logError(message, e);
            return null;
        }
    }

    public BigDecimal month(ZonedDateTime dateTime) {
        return this.mixedFeelLib.month(dateTime);
    }

    public ZonedDateTime monthAdd(ZonedDateTime dateTime, BigDecimal monthsToAdd) {
        try {
            return this.dateTimeLib.monthAddDateTime(dateTime, monthsToAdd);
        } catch (Exception e) {
            String message = String.format("monthAdd(%s, %s)", dateTime, monthsToAdd);
            logError(message, e);
            return null;
        }
    }

    public BigDecimal monthDiff(ZonedDateTime dateTime1, ZonedDateTime dateTime2) {
        try {
            return BigDecimal.valueOf(this.dateTimeLib.monthDiffDateTime(dateTime1, dateTime2));
        } catch (Exception e) {
            String message = String.format("monthDiff(%s, %s)", dateTime1, dateTime2);
            logError(message, e);
            return null;
        }
    }

    public BigDecimal weekday(ZonedDateTime dateTime) {
        try {
            return BigDecimal.valueOf(this.dateTimeLib.weekdayDateTime(dateTime));
        } catch (Exception e) {
            String message = String.format("weekday(%s)", dateTime);
            logError(message, e);
            return null;
        }
    }

    public BigDecimal year(ZonedDateTime dateTime) {
        return this.mixedFeelLib.year(dateTime);
    }

    public ZonedDateTime yearAdd(ZonedDateTime dateTime, BigDecimal yearsToAdd) {
        try {
            return this.dateTimeLib.yearAddDateTime(dateTime, yearsToAdd);
        } catch (Exception e) {
            String message = String.format("yearAdd(%s, %s)", dateTime, yearsToAdd);
            logError(message, e);
            return null;
        }
    }

    public BigDecimal yearDiff(ZonedDateTime dateTime1, ZonedDateTime dateTime2) {
        try {
            return BigDecimal.valueOf(this.dateTimeLib.yearDiffDateTime(dateTime1, dateTime2));
        } catch (Exception e) {
            String message = String.format("yearDiff(%s, %s)", dateTime1, dateTime2);
            logError(message, e);
            return null;
        }
    }

    public LocalDate date(LocalDate date) {
        return this.mixedFeelLib.date(date);
    }

    public OffsetTime time(OffsetTime time) {
        return this.mixedFeelLib.time(time);
    }
}
