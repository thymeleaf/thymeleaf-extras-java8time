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
import java.time.temporal.Temporal;
import java.util.List;
import java.util.Locale;
import static java.util.stream.Collectors.toList;
import org.thymeleaf.util.Validate;


/**
 * Formatting utilities for Java 8 Time object lists.
 *
 * @author Jos&eacute; Miguel Samper
 *
 * @since 2.1.0
 */
public final class TemporalListUtils {
    
    private final TemporalFormattingUtils temporalFormattingUtils;
    
    public TemporalListUtils(final Locale locale, final ZoneId defaultZoneId) {
        super();
        Validate.notNull(locale, "Locale cannot be null");
        Validate.notNull(defaultZoneId, "ZoneId cannot be null");
        this.temporalFormattingUtils = new TemporalFormattingUtils(locale, defaultZoneId);
    }

    public List<String> listFormat(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        return target.stream()
            .map(time -> temporalFormattingUtils.format(time))
            .collect(toList());
    }

    public List<String> listFormat(final List<? extends Temporal> target, final String pattern) {
        Validate.notNull(target, "Target cannot be null");
        return target.stream()
            .map(time -> temporalFormattingUtils.format(time, pattern))
            .collect(toList());
    }
    
    public List<Integer> listDay(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        return target.stream()
            .map(time -> temporalFormattingUtils.day(time))
            .collect(toList());
    }
    
    public List<Integer> listMonth(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        return target.stream()
            .map(time -> temporalFormattingUtils.month(time))
            .collect(toList());
    }

    public List<String> listMonthName(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        return target.stream()
            .map(time -> temporalFormattingUtils.monthName(time))
            .collect(toList());
    }

    public List<String> listMonthNameShort(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        return target.stream()
            .map(time -> temporalFormattingUtils.monthNameShort(time))
            .collect(toList());
    }

    public List<Integer> listYear(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        return target.stream()
            .map(time -> temporalFormattingUtils.year(time))
            .collect(toList());
    }
    
    public List<Integer> listDayOfWeek(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        return target.stream()
            .map(time -> temporalFormattingUtils.dayOfWeek(time))
            .collect(toList());
    }

    public List<String> listDayOfWeekName(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        return target.stream()
            .map(time -> temporalFormattingUtils.dayOfWeekName(time))
            .collect(toList());
    }
    
    public List<String> listDayOfWeekNameShort(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        return target.stream()
            .map(time -> temporalFormattingUtils.dayOfWeekNameShort(time))
            .collect(toList());
    }
    
    public List<Integer> listHour(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        return target.stream()
            .map(time -> temporalFormattingUtils.hour(time))
            .collect(toList());
    }

    public List<Integer> listMinute(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        return target.stream()
            .map(time -> temporalFormattingUtils.minute(time))
            .collect(toList());
    }

    public List<Integer> listSecond(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        return target.stream()
            .map(time -> temporalFormattingUtils.second(time))
            .collect(toList());
    }

    public List<Integer> listNanosecond(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        return target.stream()
            .map(time -> temporalFormattingUtils.nanosecond(time))
            .collect(toList());
    }

    public List<String> listFormatISO(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        return target.stream()
            .map(time -> temporalFormattingUtils.formatISO(time))
            .collect(toList());
    }
    
}
