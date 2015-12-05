/*
 * Copyright 2015 The THYMELEAF team.
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
package org.thymeleaf.extras.java8time.dialect;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.thymeleaf.context.IExpressionContext;
import org.thymeleaf.expression.IExpressionObjectFactory;
import org.thymeleaf.extras.java8time.expression.Temporals;

/**
 * @author jmsamper
 * @author Ivan Martinez-Ortiz
 * 
 * @since 3.0.0
 */
public class Java8TimeExpressionFactory implements IExpressionObjectFactory {
    
    private static final String TEMPORAL_EVALUATION_VARIABLE_NAME = "temporals";
    
    private static final Set<String> ALL_EXPRESSION_OBJECT_NAMES = Collections.unmodifiableSet(
        new HashSet<>(Arrays.asList(TEMPORAL_EVALUATION_VARIABLE_NAME)));

    @Override
    public Set<String> getAllExpressionObjectNames() {
        return ALL_EXPRESSION_OBJECT_NAMES;
    }

    @Override
    public Object buildObject(IExpressionContext context, String expressionObjectName) {
        if (TEMPORAL_EVALUATION_VARIABLE_NAME.equals(expressionObjectName)) {
            return new Temporals(context.getLocale());
        }
        return null;
    }

    @Override
    public boolean isCacheable(String expressionObjectName) {
        return expressionObjectName != null && TEMPORAL_EVALUATION_VARIABLE_NAME.equals(expressionObjectName);
    }
    
}
