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
import java.util.Set;
import static java.util.stream.Collectors.toSet;
import org.thymeleaf.util.Validate;


/**
 * Formatting utilities for Java 8 Time object sets.
 * 
 * @since 2.1.4
 */
public final class TemporalSetUtils {

    private final TemporalFormattingUtils temporalFormattingUtils;
    
    public TemporalSetUtils(final Locale locale, final ZoneId defaultZoneId) {
        super();
        Validate.notNull(locale, "Locale cannot be null");
        Validate.notNull(defaultZoneId, "ZoneId cannot be null");
        this.temporalFormattingUtils = new TemporalFormattingUtils(locale, defaultZoneId);
    }

    public Set<String> setFormat(final Set<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        return target.stream()
            .map(time -> temporalFormattingUtils.format(time))
            .collect(toSet());
    }

    public Set<String> setFormat(final Set<? extends Temporal> target, 
            final String pattern) {
        Validate.notNull(target, "Target cannot be null");
        return target.stream()
            .map(time -> temporalFormattingUtils.format(time, pattern))
            .collect(toSet());
    }

    public Set<Integer> setDay(final Set<? extends Temporal> target) {
        Validate.notNull(target, "Target cannot be null");
        return target.stream()
            .map(time -> temporalFormattingUtils.day(time))
            .collect(toSet());
    }
}
