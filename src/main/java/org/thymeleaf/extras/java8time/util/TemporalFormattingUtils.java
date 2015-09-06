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

import java.time.ZoneId;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;
import org.thymeleaf.exceptions.TemplateProcessingException;
import static org.thymeleaf.extras.java8time.util.TemporalObjects.temporal;
import static org.thymeleaf.extras.java8time.util.TemporalObjects.zonedTime;
import org.thymeleaf.util.StringUtils;
import org.thymeleaf.util.Validate;

/**
 * Formatting utilities for Java 8 Time objects.
 *
 * @author Jos&eacute; Miguel Samper
 *
 * @since 2.1.0
 */
public final class TemporalFormattingUtils {

    // Even though Java comes with several patterns for ISO8601, we use the same pattern of Thymeleaf #dates utility.
    private static final DateTimeFormatter ISO8601_DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZZZ");
    
    private final Locale locale;
    private final ZoneId defaultZoneId;
    
    public TemporalFormattingUtils(final Locale locale, final ZoneId defaultZoneId) {
        super();
        Validate.notNull(locale, "Locale cannot be null");
        Validate.notNull(defaultZoneId, "ZoneId cannot be null");
        this.locale = locale;
        this.defaultZoneId = defaultZoneId;
    }

    public String format(final Object target) {
        Validate.notNull(target, "Cannot apply format on null");
        return formatDate(target);
    }

    public String format(final Object target, final Locale locale) {
        Validate.notNull(target, "Cannot apply format on null");
        Validate.notNull(locale, "Locale cannot be null");
        return formatDate(target, null, locale);
    }

    public String format(final Object target, final String pattern) {
        return format(target, pattern, null);
    }

    public String format(final Object target, final String pattern, final Locale locale) {
        Validate.notNull(target, "Cannot apply format on null");
        Validate.notEmpty(pattern, "Pattern cannot be null or empty");
        return formatDate(target, pattern, locale);
    }

    public Integer day(final Object target) {
        Validate.notNull(target, "Cannot retrieve day from null");
        final TemporalAccessor time = temporal(target);
        return time.get(ChronoField.DAY_OF_MONTH);
    }

    public Integer month(final Object target) {
        Validate.notNull(target, "Cannot retrieve month from null");
        final TemporalAccessor time = temporal(target);
        return time.get(ChronoField.MONTH_OF_YEAR);
    }

    public String monthName(final Object target) {
        Validate.notNull(target, "Cannot retrieve month name from null");
        return format(target, "MMMM");
    }

    public String monthNameShort(final Object target) {
        Validate.notNull(target, "Cannot retrieve month name short from null");
        return format(target, "MMM");
    }

    public Integer year(final Object target) {
        Validate.notNull(target, "Cannot retrieve year from null");
        final TemporalAccessor time = temporal(target);
        return time.get(ChronoField.YEAR);
    }

    public Integer dayOfWeek(final Object target) {
        Validate.notNull(target, "Cannot retrieve day of week from null");
        final TemporalAccessor time = temporal(target);
        return time.get(ChronoField.DAY_OF_WEEK);
    }

    public String dayOfWeekName(final Object target) {
        Validate.notNull(target, "Cannot retrieve day of week name from null");
        return format(target, "EEEE");
    }

    public String dayOfWeekNameShort(final Object target) {
        Validate.notNull(target, "Cannot retrieve day of week name shortfrom null");
        return format(target, "EEE");
    }

    public Integer hour(final Object target) {
        Validate.notNull(target, "Cannot retrieve hour from null");
        final TemporalAccessor time = temporal(target);
        return time.get(ChronoField.HOUR_OF_DAY);
    }

    public Integer minute(final Object target) {
        Validate.notNull(target, "Cannot retrieve hour from null");
        final TemporalAccessor time = temporal(target);
        return time.get(ChronoField.MINUTE_OF_HOUR);
    }

    public Integer second(final Object target) {
        Validate.notNull(target, "Cannot retrieve hour from null");
        final TemporalAccessor time = temporal(target);
        return time.get(ChronoField.SECOND_OF_MINUTE);
    }

    public Integer nanosecond(final Object target) {
        Validate.notNull(target, "Cannot retrieve hour from null");
        final TemporalAccessor time = temporal(target);
        return time.get(ChronoField.NANO_OF_SECOND);
    }

    public String formatISO(final Object target) {
        Validate.notNull(target, "Cannot apply format on null");
        if (target instanceof TemporalAccessor) {
            ChronoZonedDateTime time = zonedTime(target, defaultZoneId);
            return ISO8601_DATE_TIME_FORMATTER.withLocale(locale).format(time);
        } else {
            throw new IllegalArgumentException(
                "Cannot format object of class \"" + target.getClass().getName() + "\" as a date");
        }
    }

    private String formatDate(final Object target) {
        return formatDate(target, null, null);
    }

    private String formatDate(final Object target, final String pattern, final Locale localeOverride) {
        Locale formattingLocale = localeOverride != null ? localeOverride : locale;
        try {
            Validate.notNull(target, "Cannot apply format on null");

            DateTimeFormatter formatter;
            if (StringUtils.isEmptyOrWhitespace(pattern)) {
                formatter = TemporalObjects.formatterFor(target, formattingLocale);
                return formatter.format(temporal(target));
            } else {
                formatter = DateTimeFormatter.ofPattern(pattern, formattingLocale);
                return formatter.format(temporal(target));
            }
        } catch (final Exception e) {
            throw new TemplateProcessingException(
                "Error formatting date for locale " + formattingLocale, e);
        }
    }

}
