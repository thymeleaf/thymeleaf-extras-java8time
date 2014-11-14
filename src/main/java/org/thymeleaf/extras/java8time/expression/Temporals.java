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
package org.thymeleaf.extras.java8time.expression;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.thymeleaf.exceptions.TemplateProcessingException;
import org.thymeleaf.extras.java8time.util.TemporalUtils;
import org.thymeleaf.util.Validate;


/**
 * <p>
 *   Utility class for performing Java 8 dates ({@link java.time.Temporal}) operations.
 * </p>
 * <p>
 *   An object of this class is usually available in variable evaluation expressions with the name
 *   <tt>#temporals</tt>.
 * </p>
 * 
 * @author Daniel Fern&aacute;ndez
 * 
 * @since 2.1.3
 *
 */
public final class Temporals {


    private final Locale locale;




    public Temporals(final Locale locale) {
        super();
        Validate.notNull(locale, "Locale cannot be null");
        this.locale = locale;
    }

    
    
    
    
    /**
     * 
     * @since 2.1.3
     */
    public Temporal create(final Object year, final Object month, final Object day) {
        return TemporalUtils.create(year, month, day, null, null, null, null, null, this.locale);
    }

    
    /**
     * 
     * @since 2.1.3
     */
    public Temporal create(final Object year, final Object month, final Object day,
            final Object hour, final Object minute) {
        return TemporalUtils.create(year, month, day, hour, minute, null, null, null, this.locale);
    }

    
    /**
     * 
     * @since 2.1.3
     */
    public Temporal create(final Object year, final Object month, final Object day,
            final Object hour, final Object minute, final Object second) {
        return TemporalUtils.create(year, month, day, hour, minute, second, null, null, this.locale);
    }


    /**
     *
     * @since 2.1.3
     */
    public Temporal create(final Object year, final Object month, final Object day,
            final Object hour, final Object minute, final Object second, final Object millisecond) {
        return TemporalUtils.create(year, month, day, hour, minute, second, millisecond, null, this.locale);
    }


    /**
     * 
     * @since 2.1.3
     */
    public Temporal createNow() {
        return TemporalUtils.createNow(null, this.locale);
    }


    /**
     *
     * @since 2.1.0
     */
    public Temporal createNowForTimeZone(final Object timeZone) {
        return TemporalUtils.createNow(timeZone, this.locale);
    }


    /**
     *
     * @since 2.1.3
     */
    public Temporal createToday() {
        return TemporalUtils.createToday(null, this.locale);
    }


    /**
     *
     * @since 2.1.0
     */
    public Temporal createTodayForTimeZone(final Object timeZone) {
        return TemporalUtils.createToday(timeZone, this.locale);
    }

    
    
    
    public String format(final Temporal target) {
        try {
            return TemporalUtils.format(target, this.locale);
        } catch (final Exception e) {
            throw new TemplateProcessingException(
                    "Error formatting date with standard format for locale " + this.locale, e);
        }
    }
    
    public String[] arrayFormat(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final String[] result = new String[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = format((Temporal)target[i]);
        }
        return result;
    }
    
    public List<String> listFormat(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final List<String> result = new ArrayList<String>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(format(element));
        }
        return result;
    }
    
    public Set<String> setFormat(final Set<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final Set<String> result = new LinkedHashSet<String>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(format(element));
        }
        return result;
    }

    
    
    
    public String format(final Temporal target, final String pattern) {
        try {
            return TemporalUtils.format(target, pattern, this.locale);
        } catch (final Exception e) {
            throw new TemplateProcessingException(
                    "Error formatting date with format pattern \"" + pattern + "\"", e);
        }
    }
    
    public String[] arrayFormat(final Object[] target, final String pattern) {
        Validate.notNull(target, "Target cannot be null");
        final String[] result = new String[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = format((Temporal)target[i], pattern);
        }
        return result;
    }
    
    public List<String> listFormat(final List<? extends Temporal> target, final String pattern) {
        Validate.notNull(target, "Target cannot be null");
        final List<String> result = new ArrayList<String>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(format(element, pattern));
        }
        return result;
    }
    
    public Set<String> setFormat(final Set<? extends Temporal> target, final String pattern) {
        Validate.notNull(target, "Target cannot be null");
        final Set<String> result = new LinkedHashSet<String>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(format(element, pattern));
        }
        return result;
    }

    
    
    

    public Integer day(final Temporal target) {
        return TemporalUtils.day(target);
    }
    
    public Integer[] arrayDay(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final Integer[] result = new Integer[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = day((Temporal)target[i]);
        }
        return result;
    }
    
    public List<Integer> listDay(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final List<Integer> result = new ArrayList<Integer>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(day(element));
        }
        return result;
    }
    
    public Set<Integer> setDay(final Set<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final Set<Integer> result = new LinkedHashSet<Integer>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(day(element));
        }
        return result;
    }

    
    
    

    public Integer month(final Temporal target) {
        return TemporalUtils.month(target);
    }
    
    public Integer[] arrayMonth(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final Integer[] result = new Integer[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = month((Temporal)target[i]);
        }
        return result;
    }
    
    public List<Integer> listMonth(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final List<Integer> result = new ArrayList<Integer>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(month(element));
        }
        return result;
    }
    
    public Set<Integer> setMonth(final Set<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final Set<Integer> result = new LinkedHashSet<Integer>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(month(element));
        }
        return result;
    }


    
    

    public String monthName(final Temporal target) {
        return TemporalUtils.monthName(target, this.locale);
    }
    
    public String[] arrayMonthName(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final String[] result = new String[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = monthName((Temporal)target[i]);
        }
        return result;
    }
    
    public List<String> listMonthName(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final List<String> result = new ArrayList<String>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(monthName(element));
        }
        return result;
    }
    
    public Set<String> setMonthName(final Set<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final Set<String> result = new LinkedHashSet<String>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(monthName(element));
        }
        return result;
    }

    
    

    public String monthNameShort(final Temporal target) {
        return TemporalUtils.monthNameShort(target, this.locale);
    }
    
    public String[] arrayMonthNameShort(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final String[] result = new String[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = monthNameShort((Temporal)target[i]);
        }
        return result;
    }
    
    public List<String> listMonthNameShort(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final List<String> result = new ArrayList<String>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(monthNameShort(element));
        }
        return result;
    }
    
    public Set<String> setMonthNameShort(final Set<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final Set<String> result = new LinkedHashSet<String>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(monthNameShort(element));
        }
        return result;
    }

    
    
    
    

    public Integer year(final Temporal target) {
        return TemporalUtils.year(target);
    }
    
    public Integer[] arrayYear(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final Integer[] result = new Integer[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = year((Temporal)target[i]);
        }
        return result;
    }
    
    public List<Integer> listYear(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final List<Integer> result = new ArrayList<Integer>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(year(element));
        }
        return result;
    }
    
    public Set<Integer> setYear(final Set<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final Set<Integer> result = new LinkedHashSet<Integer>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(year(element));
        }
        return result;
    }

    
    
    

    public Integer dayOfWeek(final Temporal target) {
        return TemporalUtils.dayOfWeek(target);
    }
    
    public Integer[] arrayDayOfWeek(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final Integer[] result = new Integer[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = dayOfWeek((Temporal)target[i]);
        }
        return result;
    }
    
    public List<Integer> listDayOfWeek(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final List<Integer> result = new ArrayList<Integer>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(dayOfWeek(element));
        }
        return result;
    }
    
    public Set<Integer> setDayOfWeek(final Set<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final Set<Integer> result = new LinkedHashSet<Integer>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(dayOfWeek(element));
        }
        return result;
    }
    

    
    
    

    public String dayOfWeekName(final Temporal target) {
        return TemporalUtils.dayOfWeekName(target, this.locale);
    }
    
    public String[] arrayDayOfWeekName(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final String[] result = new String[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = dayOfWeekName((Temporal)target[i]);
        }
        return result;
    }
    
    public List<String> listDayOfWeekName(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final List<String> result = new ArrayList<String>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(dayOfWeekName(element));
        }
        return result;
    }
    
    public Set<String> setDayOfWeekName(final Set<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final Set<String> result = new LinkedHashSet<String>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(dayOfWeekName(element));
        }
        return result;
    }

    
    
    
    

    public String dayOfWeekNameShort(final Temporal target) {
        return TemporalUtils.dayOfWeekNameShort(target, this.locale);
    }
    
    public String[] arrayDayOfWeekNameShort(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final String[] result = new String[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = dayOfWeekNameShort((Temporal)target[i]);
        }
        return result;
    }
    
    public List<String> listDayOfWeekNameShort(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final List<String> result = new ArrayList<String>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(dayOfWeekNameShort(element));
        }
        return result;
    }
    
    public Set<String> setDayOfWeekNameShort(final Set<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final Set<String> result = new LinkedHashSet<String>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(dayOfWeekNameShort(element));
        }
        return result;
    }

    
    
    

    

    
    
    

    public Integer hour(final Temporal target) {
        return TemporalUtils.hour(target);
    }
    
    public Integer[] arrayHour(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final Integer[] result = new Integer[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = hour((Temporal)target[i]);
        }
        return result;
    }
    
    public List<Integer> listHour(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final List<Integer> result = new ArrayList<Integer>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(hour(element));
        }
        return result;
    }
    
    public Set<Integer> setHour(final Set<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final Set<Integer> result = new LinkedHashSet<Integer>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(hour(element));
        }
        return result;
    }

    

    
    
    

    public Integer minute(final Temporal target) {
        return TemporalUtils.minute(target);
    }
    
    public Integer[] arrayMinute(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final Integer[] result = new Integer[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = minute((Temporal)target[i]);
        }
        return result;
    }
    
    public List<Integer> listMinute(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final List<Integer> result = new ArrayList<Integer>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(minute(element));
        }
        return result;
    }
    
    public Set<Integer> setMinute(final Set<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final Set<Integer> result = new LinkedHashSet<Integer>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(minute(element));
        }
        return result;
    }

    

    
    
    

    public Integer second(final Temporal target) {
        return TemporalUtils.second(target);
    }
    
    public Integer[] arraySecond(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final Integer[] result = new Integer[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = second((Temporal)target[i]);
        }
        return result;
    }
    
    public List<Integer> listSecond(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final List<Integer> result = new ArrayList<Integer>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(second(element));
        }
        return result;
    }
    
    public Set<Integer> setSecond(final Set<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final Set<Integer> result = new LinkedHashSet<Integer>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(second(element));
        }
        return result;
    }

    

    
    
    

    public Integer millisecond(final Temporal target) {
        return TemporalUtils.millisecond(target);
    }
    
    public Integer[] arrayMillisecond(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final Integer[] result = new Integer[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = millisecond((Temporal)target[i]);
        }
        return result;
    }
    
    public List<Integer> listMillisecond(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final List<Integer> result = new ArrayList<Integer>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(millisecond(element));
        }
        return result;
    }
    
    public Set<Integer> setMillisecond(final Set<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final Set<Integer> result = new LinkedHashSet<Integer>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(millisecond(element));
        }
        return result;
    }




    /**
     *
     * @since 2.1.4
     */
    public String formatISO(final Temporal target) {
        try {
            return TemporalUtils.formatISO(target);
        } catch (final Exception e) {
            throw new TemplateProcessingException("Error formatting date as ISO8601", e);
        }
    }

    /**
     *
     * @since 2.1.4
     */
    public String[] arrayFormatISO(final Object[] target) {
        Validate.notNull(target, "Target cannot be null");
        final String[] result = new String[target.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = formatISO((Temporal) target[i]);
        }
        return result;
    }

    /**
     *
     * @since 2.1.4
     */
    public List<String> listFormatISO(final List<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final List<String> result = new ArrayList<String>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(formatISO(element));
        }
        return result;
    }

    /**
     *
     * @since 2.1.4
     */
    public Set<String> setFormatISO(final Set<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        final Set<String> result = new LinkedHashSet<String>(target.size() + 2);
        for (final Temporal element : target) {
            result.add(formatISO(element));
        }
        return result;
    }


}
