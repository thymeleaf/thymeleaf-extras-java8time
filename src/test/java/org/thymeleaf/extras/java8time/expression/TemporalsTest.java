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

import java.time.temporal.Temporal;
import java.util.List;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class TemporalsTest {
    
    @Test
    public void testCreate_3args() {
        System.out.println("create");
        Object year = null;
        Object month = null;
        Object day = null;
        Temporals instance = null;
        Temporal expResult = null;
        Temporal result = instance.create(year, month, day);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreate_5args() {
        System.out.println("create");
        Object year = null;
        Object month = null;
        Object day = null;
        Object hour = null;
        Object minute = null;
        Temporals instance = null;
        Temporal expResult = null;
        Temporal result = instance.create(year, month, day, hour, minute);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreate_6args() {
        System.out.println("create");
        Object year = null;
        Object month = null;
        Object day = null;
        Object hour = null;
        Object minute = null;
        Object second = null;
        Temporals instance = null;
        Temporal expResult = null;
        Temporal result = instance.create(year, month, day, hour, minute, second);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreate_7args() {
        System.out.println("create");
        Object year = null;
        Object month = null;
        Object day = null;
        Object hour = null;
        Object minute = null;
        Object second = null;
        Object millisecond = null;
        Temporals instance = null;
        Temporal expResult = null;
        Temporal result = instance.create(year, month, day, hour, minute, second, millisecond);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreateNow() {
        System.out.println("createNow");
        Temporals instance = null;
        Temporal expResult = null;
        Temporal result = instance.createNow();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreateNowForTimeZone() {
        System.out.println("createNowForTimeZone");
        Object timeZone = null;
        Temporals instance = null;
        Temporal expResult = null;
        Temporal result = instance.createNowForTimeZone(timeZone);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreateToday() {
        System.out.println("createToday");
        Temporals instance = null;
        Temporal expResult = null;
        Temporal result = instance.createToday();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreateTodayForTimeZone() {
        System.out.println("createTodayForTimeZone");
        Object timeZone = null;
        Temporals instance = null;
        Temporal expResult = null;
        Temporal result = instance.createTodayForTimeZone(timeZone);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFormat_Temporal() {
        System.out.println("format");
        Temporal target = null;
        Temporals instance = null;
        String expResult = "";
        String result = instance.format(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayFormat_ObjectArr() {
        System.out.println("arrayFormat");
        Object[] target = null;
        Temporals instance = null;
        String[] expResult = null;
        String[] result = instance.arrayFormat(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListFormat_List() {
        System.out.println("listFormat");
        List<? extends Temporal> target = null;
        Temporals instance = null;
        List<String> expResult = null;
        List<String> result = instance.listFormat(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFormat_Set() {
        System.out.println("setFormat");
        Set<? extends Temporal> target = null;
        Temporals instance = null;
        Set<String> expResult = null;
        Set<String> result = instance.setFormat(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFormat_Temporal_String() {
        System.out.println("format");
        Temporal target = null;
        String pattern = "";
        Temporals instance = null;
        String expResult = "";
        String result = instance.format(target, pattern);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayFormat_ObjectArr_String() {
        System.out.println("arrayFormat");
        Object[] target = null;
        String pattern = "";
        Temporals instance = null;
        String[] expResult = null;
        String[] result = instance.arrayFormat(target, pattern);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListFormat_List_String() {
        System.out.println("listFormat");
        List<? extends Temporal> target = null;
        String pattern = "";
        Temporals instance = null;
        List<String> expResult = null;
        List<String> result = instance.listFormat(target, pattern);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFormat_Set_String() {
        System.out.println("setFormat");
        Set<? extends Temporal> target = null;
        String pattern = "";
        Temporals instance = null;
        Set<String> expResult = null;
        Set<String> result = instance.setFormat(target, pattern);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDay() {
        System.out.println("day");
        Temporal target = null;
        Temporals instance = null;
        Integer expResult = null;
        Integer result = instance.day(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayDay() {
        System.out.println("arrayDay");
        Object[] target = null;
        Temporals instance = null;
        Integer[] expResult = null;
        Integer[] result = instance.arrayDay(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListDay() {
        System.out.println("listDay");
        List<? extends Temporal> target = null;
        Temporals instance = null;
        List<Integer> expResult = null;
        List<Integer> result = instance.listDay(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDay() {
        System.out.println("setDay");
        Set<? extends Temporal> target = null;
        Temporals instance = null;
        Set<Integer> expResult = null;
        Set<Integer> result = instance.setDay(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMonth() {
        System.out.println("month");
        Temporal target = null;
        Temporals instance = null;
        Integer expResult = null;
        Integer result = instance.month(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayMonth() {
        System.out.println("arrayMonth");
        Object[] target = null;
        Temporals instance = null;
        Integer[] expResult = null;
        Integer[] result = instance.arrayMonth(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListMonth() {
        System.out.println("listMonth");
        List<? extends Temporal> target = null;
        Temporals instance = null;
        List<Integer> expResult = null;
        List<Integer> result = instance.listMonth(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMonth() {
        System.out.println("setMonth");
        Set<? extends Temporal> target = null;
        Temporals instance = null;
        Set<Integer> expResult = null;
        Set<Integer> result = instance.setMonth(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMonthName() {
        System.out.println("monthName");
        Temporal target = null;
        Temporals instance = null;
        String expResult = "";
        String result = instance.monthName(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayMonthName() {
        System.out.println("arrayMonthName");
        Object[] target = null;
        Temporals instance = null;
        String[] expResult = null;
        String[] result = instance.arrayMonthName(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListMonthName() {
        System.out.println("listMonthName");
        List<? extends Temporal> target = null;
        Temporals instance = null;
        List<String> expResult = null;
        List<String> result = instance.listMonthName(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMonthName() {
        System.out.println("setMonthName");
        Set<? extends Temporal> target = null;
        Temporals instance = null;
        Set<String> expResult = null;
        Set<String> result = instance.setMonthName(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMonthNameShort() {
        System.out.println("monthNameShort");
        Temporal target = null;
        Temporals instance = null;
        String expResult = "";
        String result = instance.monthNameShort(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayMonthNameShort() {
        System.out.println("arrayMonthNameShort");
        Object[] target = null;
        Temporals instance = null;
        String[] expResult = null;
        String[] result = instance.arrayMonthNameShort(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListMonthNameShort() {
        System.out.println("listMonthNameShort");
        List<? extends Temporal> target = null;
        Temporals instance = null;
        List<String> expResult = null;
        List<String> result = instance.listMonthNameShort(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMonthNameShort() {
        System.out.println("setMonthNameShort");
        Set<? extends Temporal> target = null;
        Temporals instance = null;
        Set<String> expResult = null;
        Set<String> result = instance.setMonthNameShort(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testYear() {
        System.out.println("year");
        Temporal target = null;
        Temporals instance = null;
        Integer expResult = null;
        Integer result = instance.year(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayYear() {
        System.out.println("arrayYear");
        Object[] target = null;
        Temporals instance = null;
        Integer[] expResult = null;
        Integer[] result = instance.arrayYear(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListYear() {
        System.out.println("listYear");
        List<? extends Temporal> target = null;
        Temporals instance = null;
        List<Integer> expResult = null;
        List<Integer> result = instance.listYear(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetYear() {
        System.out.println("setYear");
        Set<? extends Temporal> target = null;
        Temporals instance = null;
        Set<Integer> expResult = null;
        Set<Integer> result = instance.setYear(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDayOfWeek() {
        System.out.println("dayOfWeek");
        Temporal target = null;
        Temporals instance = null;
        Integer expResult = null;
        Integer result = instance.dayOfWeek(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayDayOfWeek() {
        System.out.println("arrayDayOfWeek");
        Object[] target = null;
        Temporals instance = null;
        Integer[] expResult = null;
        Integer[] result = instance.arrayDayOfWeek(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListDayOfWeek() {
        System.out.println("listDayOfWeek");
        List<? extends Temporal> target = null;
        Temporals instance = null;
        List<Integer> expResult = null;
        List<Integer> result = instance.listDayOfWeek(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDayOfWeek() {
        System.out.println("setDayOfWeek");
        Set<? extends Temporal> target = null;
        Temporals instance = null;
        Set<Integer> expResult = null;
        Set<Integer> result = instance.setDayOfWeek(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDayOfWeekName() {
        System.out.println("dayOfWeekName");
        Temporal target = null;
        Temporals instance = null;
        String expResult = "";
        String result = instance.dayOfWeekName(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayDayOfWeekName() {
        System.out.println("arrayDayOfWeekName");
        Object[] target = null;
        Temporals instance = null;
        String[] expResult = null;
        String[] result = instance.arrayDayOfWeekName(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListDayOfWeekName() {
        System.out.println("listDayOfWeekName");
        List<? extends Temporal> target = null;
        Temporals instance = null;
        List<String> expResult = null;
        List<String> result = instance.listDayOfWeekName(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDayOfWeekName() {
        System.out.println("setDayOfWeekName");
        Set<? extends Temporal> target = null;
        Temporals instance = null;
        Set<String> expResult = null;
        Set<String> result = instance.setDayOfWeekName(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDayOfWeekNameShort() {
        System.out.println("dayOfWeekNameShort");
        Temporal target = null;
        Temporals instance = null;
        String expResult = "";
        String result = instance.dayOfWeekNameShort(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayDayOfWeekNameShort() {
        System.out.println("arrayDayOfWeekNameShort");
        Object[] target = null;
        Temporals instance = null;
        String[] expResult = null;
        String[] result = instance.arrayDayOfWeekNameShort(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListDayOfWeekNameShort() {
        System.out.println("listDayOfWeekNameShort");
        List<? extends Temporal> target = null;
        Temporals instance = null;
        List<String> expResult = null;
        List<String> result = instance.listDayOfWeekNameShort(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDayOfWeekNameShort() {
        System.out.println("setDayOfWeekNameShort");
        Set<? extends Temporal> target = null;
        Temporals instance = null;
        Set<String> expResult = null;
        Set<String> result = instance.setDayOfWeekNameShort(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testHour() {
        System.out.println("hour");
        Temporal target = null;
        Temporals instance = null;
        Integer expResult = null;
        Integer result = instance.hour(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayHour() {
        System.out.println("arrayHour");
        Object[] target = null;
        Temporals instance = null;
        Integer[] expResult = null;
        Integer[] result = instance.arrayHour(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListHour() {
        System.out.println("listHour");
        List<? extends Temporal> target = null;
        Temporals instance = null;
        List<Integer> expResult = null;
        List<Integer> result = instance.listHour(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetHour() {
        System.out.println("setHour");
        Set<? extends Temporal> target = null;
        Temporals instance = null;
        Set<Integer> expResult = null;
        Set<Integer> result = instance.setHour(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMinute() {
        System.out.println("minute");
        Temporal target = null;
        Temporals instance = null;
        Integer expResult = null;
        Integer result = instance.minute(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayMinute() {
        System.out.println("arrayMinute");
        Object[] target = null;
        Temporals instance = null;
        Integer[] expResult = null;
        Integer[] result = instance.arrayMinute(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListMinute() {
        System.out.println("listMinute");
        List<? extends Temporal> target = null;
        Temporals instance = null;
        List<Integer> expResult = null;
        List<Integer> result = instance.listMinute(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMinute() {
        System.out.println("setMinute");
        Set<? extends Temporal> target = null;
        Temporals instance = null;
        Set<Integer> expResult = null;
        Set<Integer> result = instance.setMinute(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSecond() {
        System.out.println("second");
        Temporal target = null;
        Temporals instance = null;
        Integer expResult = null;
        Integer result = instance.second(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArraySecond() {
        System.out.println("arraySecond");
        Object[] target = null;
        Temporals instance = null;
        Integer[] expResult = null;
        Integer[] result = instance.arraySecond(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListSecond() {
        System.out.println("listSecond");
        List<? extends Temporal> target = null;
        Temporals instance = null;
        List<Integer> expResult = null;
        List<Integer> result = instance.listSecond(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetSecond() {
        System.out.println("setSecond");
        Set<? extends Temporal> target = null;
        Temporals instance = null;
        Set<Integer> expResult = null;
        Set<Integer> result = instance.setSecond(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMillisecond() {
        System.out.println("millisecond");
        Temporal target = null;
        Temporals instance = null;
        Integer expResult = null;
        Integer result = instance.millisecond(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayMillisecond() {
        System.out.println("arrayMillisecond");
        Object[] target = null;
        Temporals instance = null;
        Integer[] expResult = null;
        Integer[] result = instance.arrayMillisecond(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListMillisecond() {
        System.out.println("listMillisecond");
        List<? extends Temporal> target = null;
        Temporals instance = null;
        List<Integer> expResult = null;
        List<Integer> result = instance.listMillisecond(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMillisecond() {
        System.out.println("setMillisecond");
        Set<? extends Temporal> target = null;
        Temporals instance = null;
        Set<Integer> expResult = null;
        Set<Integer> result = instance.setMillisecond(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFormatISO() {
        System.out.println("formatISO");
        Temporal target = null;
        Temporals instance = null;
        String expResult = "";
        String result = instance.formatISO(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testArrayFormatISO() {
        System.out.println("arrayFormatISO");
        Object[] target = null;
        Temporals instance = null;
        String[] expResult = null;
        String[] result = instance.arrayFormatISO(target);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListFormatISO() {
        System.out.println("listFormatISO");
        List<? extends Temporal> target = null;
        Temporals instance = null;
        List<String> expResult = null;
        List<String> result = instance.listFormatISO(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFormatISO() {
        System.out.println("setFormatISO");
        Set<? extends Temporal> target = null;
        Temporals instance = null;
        Set<String> expResult = null;
        Set<String> result = instance.setFormatISO(target);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
