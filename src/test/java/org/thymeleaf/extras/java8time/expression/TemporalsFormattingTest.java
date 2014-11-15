/*
 * Copyright 2014 The THYMELEAF team.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thymeleaf.extras.java8time.expression;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;
import java.util.Locale;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests regarding formatting of temporal objects.
 */
public class TemporalsFormattingTest {
    
    private final Temporals temporals = new Temporals(Locale.ENGLISH, ZoneOffset.UTC);

    @Test
    public void testFormat() {
        Temporal time = ZonedDateTime.of(2015, 12, 31, 23, 59, 45, 0, ZoneOffset.UTC);
        assertEquals("December 31, 2015 11:59:45 PM Z", temporals.format(time));
    }

    @Test
    public void testFormatWithPattern() {
        Temporal time = LocalDateTime.of(2015, 12, 31, 23, 59);
        String pattern = "yyyy-MM-dd HH:mm:ss";
        String expectd = "2015-12-31 23:59:00";
        assertEquals(expectd, temporals.format(time, pattern));
    }

    @Test
    public void testDay() {
        Temporal time = LocalDate.of(2015, 12, 31);
        assertEquals(31, temporals.day(time).intValue());
    }

    /*
    @Test
    public void testMonth() {

        Temporal target = null;

        Integer expResult = null;
        Integer result = temporals.month(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayMonth() {

        Object[] target = null;

        Integer[] expResult = null;
        Integer[] result = temporals.arrayMonth(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListMonth() {

        List<? extends Temporal> target = null;

        List<Integer> expResult = null;
        List<Integer> result = temporals.listMonth(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMonth() {

        Set<? extends Temporal> target = null;

        Set<Integer> expResult = null;
        Set<Integer> result = temporals.setMonth(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMonthName() {

        Temporal target = null;

        String expResult = "";
        String result = temporals.monthName(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayMonthName() {

        Object[] target = null;

        String[] expResult = null;
        String[] result = temporals.arrayMonthName(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListMonthName() {

        List<? extends Temporal> target = null;

        List<String> expResult = null;
        List<String> result = temporals.listMonthName(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMonthName() {

        Set<? extends Temporal> target = null;

        Set<String> expResult = null;
        Set<String> result = temporals.setMonthName(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMonthNameShort() {

        Temporal target = null;

        String expResult = "";
        String result = temporals.monthNameShort(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayMonthNameShort() {

        Object[] target = null;

        String[] expResult = null;
        String[] result = temporals.arrayMonthNameShort(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListMonthNameShort() {

        List<? extends Temporal> target = null;

        List<String> expResult = null;
        List<String> result = temporals.listMonthNameShort(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMonthNameShort() {

        Set<? extends Temporal> target = null;

        Set<String> expResult = null;
        Set<String> result = temporals.setMonthNameShort(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testYear() {

        Temporal target = null;

        Integer expResult = null;
        Integer result = temporals.year(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayYear() {

        Object[] target = null;

        Integer[] expResult = null;
        Integer[] result = temporals.arrayYear(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListYear() {

        List<? extends Temporal> target = null;

        List<Integer> expResult = null;
        List<Integer> result = temporals.listYear(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetYear() {

        Set<? extends Temporal> target = null;

        Set<Integer> expResult = null;
        Set<Integer> result = temporals.setYear(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDayOfWeek() {

        Temporal target = null;

        Integer expResult = null;
        Integer result = temporals.dayOfWeek(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayDayOfWeek() {

        Object[] target = null;

        Integer[] expResult = null;
        Integer[] result = temporals.arrayDayOfWeek(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListDayOfWeek() {

        List<? extends Temporal> target = null;

        List<Integer> expResult = null;
        List<Integer> result = temporals.listDayOfWeek(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDayOfWeek() {

        Set<? extends Temporal> target = null;

        Set<Integer> expResult = null;
        Set<Integer> result = temporals.setDayOfWeek(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDayOfWeekName() {

        Temporal target = null;

        String expResult = "";
        String result = temporals.dayOfWeekName(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayDayOfWeekName() {

        Object[] target = null;

        String[] expResult = null;
        String[] result = temporals.arrayDayOfWeekName(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListDayOfWeekName() {

        List<? extends Temporal> target = null;

        List<String> expResult = null;
        List<String> result = temporals.listDayOfWeekName(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDayOfWeekName() {

        Set<? extends Temporal> target = null;

        Set<String> expResult = null;
        Set<String> result = temporals.setDayOfWeekName(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDayOfWeekNameShort() {

        Temporal target = null;

        String expResult = "";
        String result = temporals.dayOfWeekNameShort(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayDayOfWeekNameShort() {

        Object[] target = null;

        String[] expResult = null;
        String[] result = temporals.arrayDayOfWeekNameShort(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListDayOfWeekNameShort() {

        List<? extends Temporal> target = null;

        List<String> expResult = null;
        List<String> result = temporals.listDayOfWeekNameShort(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDayOfWeekNameShort() {

        Set<? extends Temporal> target = null;

        Set<String> expResult = null;
        Set<String> result = temporals.setDayOfWeekNameShort(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testHour() {

        Temporal target = null;

        Integer expResult = null;
        Integer result = temporals.hour(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayHour() {

        Object[] target = null;

        Integer[] expResult = null;
        Integer[] result = temporals.arrayHour(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListHour() {

        List<? extends Temporal> target = null;

        List<Integer> expResult = null;
        List<Integer> result = temporals.listHour(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetHour() {

        Set<? extends Temporal> target = null;

        Set<Integer> expResult = null;
        Set<Integer> result = temporals.setHour(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMinute() {

        Temporal target = null;

        Integer expResult = null;
        Integer result = temporals.minute(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayMinute() {

        Object[] target = null;

        Integer[] expResult = null;
        Integer[] result = temporals.arrayMinute(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListMinute() {

        List<? extends Temporal> target = null;

        List<Integer> expResult = null;
        List<Integer> result = temporals.listMinute(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMinute() {

        Set<? extends Temporal> target = null;

        Set<Integer> expResult = null;
        Set<Integer> result = temporals.setMinute(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSecond() {

        Temporal target = null;

        Integer expResult = null;
        Integer result = temporals.second(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArraySecond() {

        Object[] target = null;

        Integer[] expResult = null;
        Integer[] result = temporals.arraySecond(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListSecond() {

        List<? extends Temporal> target = null;

        List<Integer> expResult = null;
        List<Integer> result = temporals.listSecond(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetSecond() {

        Set<? extends Temporal> target = null;

        Set<Integer> expResult = null;
        Set<Integer> result = temporals.setSecond(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMillisecond() {

        Temporal target = null;

        Integer expResult = null;
        Integer result = temporals.millisecond(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayMillisecond() {

        Object[] target = null;

        Integer[] expResult = null;
        Integer[] result = temporals.arrayMillisecond(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListMillisecond() {

        List<? extends Temporal> target = null;

        List<Integer> expResult = null;
        List<Integer> result = temporals.listMillisecond(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMillisecond() {

        Set<? extends Temporal> target = null;

        Set<Integer> expResult = null;
        Set<Integer> result = temporals.setMillisecond(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFormatISO() {

        Temporal target = null;

        String expResult = "";
        String result = temporals.formatISO(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayFormatISO() {

        Object[] target = null;

        String[] expResult = null;
        String[] result = temporals.arrayFormatISO(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListFormatISO() {

        List<? extends Temporal> target = null;

        List<String> expResult = null;
        List<String> result = temporals.listFormatISO(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFormatISO() {

        Set<? extends Temporal> target = null;

        Set<String> expResult = null;
        Set<String> result = temporals.setFormatISO(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    */
}
