/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.extras.java8time.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;
import org.thymeleaf.util.Validate;

/**
 * Utilities for the creation of Java 8 Time objects.
 *
 * @author Jos&eacute; Miguel Samper
 *
 * @since 2.1.1
 */
public final class TemporalObjects {

    public TemporalObjects() {
        super();
    }

    public static DateTimeFormatter formatterFor(final Object target, final Locale locale) {
        Validate.notNull(target, "Target cannot be null");
        Validate.notNull(locale, "Locale cannot be null");
        if (target instanceof LocalDate) {
            return DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(locale);
        } else if (target instanceof LocalDateTime) {
            return DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.MEDIUM).withLocale(locale);
        } else if (target instanceof ZonedDateTime) {
            return DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(locale);
        } else if (target instanceof Instant) {
            return new DateTimeFormatterBuilder().appendInstant().toFormatter();
        } else if (target instanceof LocalTime) {
            return DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(locale);
        } else if (target instanceof OffsetTime) {
            // FIXME: localise
            return new DateTimeFormatterBuilder()
                .appendValue(ChronoField.HOUR_OF_DAY)
                .appendLiteral(':')
                .appendValue(ChronoField.MINUTE_OF_HOUR)
                .appendLiteral(':')
                .appendValue(ChronoField.SECOND_OF_MINUTE)
                .appendLocalizedOffset(TextStyle.FULL)
                .toFormatter()
                .withLocale(locale);
        } else if (target instanceof OffsetDateTime) {
            // FIXME: localise
            return new DateTimeFormatterBuilder()
                .appendText(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(' ')
                .appendValue(ChronoField.DAY_OF_MONTH)
                .appendLiteral(", ")
                .appendValue(ChronoField.YEAR)
                .appendLiteral(' ')
                .appendValue(ChronoField.HOUR_OF_DAY)
                .appendLiteral(':')
                .appendValue(ChronoField.MINUTE_OF_HOUR)
                .appendLiteral(':')
                .appendValue(ChronoField.SECOND_OF_MINUTE)
                .appendLocalizedOffset(TextStyle.FULL)
                .toFormatter()
                .withLocale(locale);
        } else if (target instanceof Year) {
            return new DateTimeFormatterBuilder()
                .appendValue(ChronoField.YEAR)
                .toFormatter();
        } else if (target instanceof YearMonth) {
            // FIXME: localise
            return new DateTimeFormatterBuilder()
                .appendText(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(' ')
                .appendValue(ChronoField.YEAR)
                .toFormatter()
                .withLocale(locale);
        } else {
            throw new IllegalArgumentException(
                "Cannot format object of class \"" + target.getClass().getName() + "\" as a date");
        }
    }
    
    /**
     * Creates a Temporal object filling the missing fields of the provided time with default values.
     * @param target the temporal object to be converted
     * @param defaultZoneId the default value for ZoneId
     * @return a Temporal object
     */
    public static ChronoZonedDateTime zonedTime(final Object target, final ZoneId defaultZoneId) {
        Validate.notNull(target, "Target cannot be null");
        Validate.notNull(defaultZoneId, "ZoneId cannot be null");
        if (target instanceof ChronoZonedDateTime) {
            return (ChronoZonedDateTime) target;
        } else if (target instanceof LocalDateTime) {
            return ZonedDateTime.of((LocalDateTime) target, defaultZoneId);
        } else if (target instanceof LocalDate) {
            return ZonedDateTime.of((LocalDate) target, LocalTime.MIDNIGHT, defaultZoneId);
        } else if (target instanceof Instant) {
            return ZonedDateTime.ofInstant((Instant) target, defaultZoneId);
        } else {
            throw new IllegalArgumentException(
                "Cannot format object of class \"" + target.getClass().getName() + "\" as a date");
        }
    }
    
    public static TemporalAccessor temporal(final Object target) {
        Validate.notNull(target, "Target cannot be null");
        if (target instanceof TemporalAccessor) {
            return (TemporalAccessor) target;
        } else {
            throw new IllegalArgumentException(
                "Cannot normalize class \"" + target.getClass().getName() + "\" as a date");
        }
    }
}
