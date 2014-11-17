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
import java.util.Locale;
import org.thymeleaf.util.Validate;


/**
 * Formatting utilities for Java 8 Time object arrays.
 * 
 * @since 2.1.0
 */
public final class TemporalArrayUtils {

    private final TemporalFormattingUtils temporalFormattingUtils;
    
    public TemporalArrayUtils(final Locale locale, final ZoneId defaultZoneId) {
        super();
        Validate.notNull(locale, "Locale cannot be null");
        Validate.notNull(defaultZoneId, "ZoneId cannot be null");
        this.temporalFormattingUtils = new TemporalFormattingUtils(locale, defaultZoneId);
    }

    public String[] arrayFormat(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final String[] result = new String[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = temporalFormattingUtils.format((Temporal) target[i]);
        }
        return result;
    }

    public String[] arrayFormat(final Object[] target, final String pattern) {
        Validate.notNull(target, "Target cannot be null");
        final String[] result = new String[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = temporalFormattingUtils.format((Temporal) target[i], pattern);
        }
        return result;
    }

    public Integer[] arrayDay(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final Integer[] result = new Integer[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = temporalFormattingUtils.day((Temporal) target[i]);
        }
        return result;
    }

    public Integer[] arrayMonth(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final Integer[] result = new Integer[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = temporalFormattingUtils.month((Temporal) target[i]);
        }
        return result;
    }

    public String[] arrayMonthName(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final String[] result = new String[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = temporalFormattingUtils.monthName((Temporal) target[i]);
        }
        return result;
    }

    public String[] arrayMonthNameShort(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final String[] result = new String[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = temporalFormattingUtils.monthNameShort((Temporal) target[i]);
        }
        return result;
    }
    
    public Integer[] arrayYear(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final Integer[] result = new Integer[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = temporalFormattingUtils.year((Temporal) target[i]);
        }
        return result;
    }
    
    public Integer[] arrayDayOfWeek(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final Integer[] result = new Integer[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = temporalFormattingUtils.dayOfWeek((Temporal) target[i]);
        }
        return result;
    }
    
    public String[] arrayDayOfWeekName(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final String[] result = new String[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = temporalFormattingUtils.dayOfWeekName((Temporal) target[i]);
        }
        return result;
    }

    public String[] arrayDayOfWeekNameShort(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final String[] result = new String[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = temporalFormattingUtils.dayOfWeekNameShort((Temporal) target[i]);
        }
        return result;
    }

    public Integer[] arrayHour(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final Integer[] result = new Integer[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = temporalFormattingUtils.hour((Temporal) target[i]);
        }
        return result;
    }

    public Integer[] arrayMinute(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final Integer[] result = new Integer[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = temporalFormattingUtils.minute((Temporal) target[i]);
        }
        return result;
    }

    public Integer[] arraySecond(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final Integer[] result = new Integer[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = temporalFormattingUtils.second((Temporal) target[i]);
        }
        return result;
    }

    public Integer[] arrayNanosecond(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final Integer[] result = new Integer[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = temporalFormattingUtils.nanosecond((Temporal) target[i]);
        }
        return result;
    }

    public String[] arrayFormatISO(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final String[] result = new String[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = temporalFormattingUtils.formatISO((Temporal) target[i]);
        }
        return result;
    }

}
