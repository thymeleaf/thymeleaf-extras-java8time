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
import java.time.ZoneOffset;
import java.time.temporal.Temporal;
import static java.util.Arrays.asList;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests regarding formatting of sets of temporal objects.
 */
public class TemporalsSetTest {
    
    private final Temporals temporals = new Temporals(Locale.ENGLISH, ZoneOffset.UTC);

    @Test
    public void testSetFormat() {
        Set<Temporal> set = new TreeSet<>(asList(LocalDate.of(2015, 1, 1), LocalDate.of(2015, 12, 31)));
        Set<String> expected = new TreeSet<>(asList("January 1, 2015 12:00:00 AM Z", "December 31, 2015 12:00:00 AM Z"));
        assertEquals(expected, temporals.setFormat(set));
    }

    @Test
    public void testSetFormatWithPattern() {
        Set<Temporal> set = new TreeSet<>(asList(LocalDate.of(2015, 1, 1), LocalDate.of(2015, 12, 31)));
        String pattern = "yyyy-MM-dd";
        Set<String> expected = new TreeSet<>(asList("2015-01-01", "2015-12-31"));
        assertEquals(expected, temporals.setFormat(set, pattern));
    }

    @Test
    public void testSetDay() {
        Set<Temporal> set = new TreeSet<>(asList(LocalDate.of(2015, 1, 1), LocalDate.of(2015, 12, 31)));
        Set<Integer> expected = new TreeSet<>(asList(1, 31));
        assertEquals(expected, temporals.setDay(set));
    }
    
    @Test
    public void testSetMonth() {
        Set<Temporal> set = new TreeSet<>(asList(LocalDate.of(2015, 1, 1), LocalDate.of(2015, 12, 31)));
        Set<Integer> expected = new TreeSet<>(asList(1, 12));
        assertEquals(expected, temporals.setMonth(set));
    }
    
}
