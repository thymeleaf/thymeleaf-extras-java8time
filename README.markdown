
Thymeleaf - Module for Java 8 Time API compatibility
====================================================

------------------------------------------------------------------------------

Status
------

This is a *thymeleaf extras* module, not a part of the Thymeleaf core (and as
such following its own versioning schema), but fully supported by the 
Thymeleaf team.

Current versions: 

  * **Version 2.1.3.RELEASE** - for Thymeleaf 2.1 (requires 2.1.3+)


License
-------

This software is licensed under the [Apache License 2.0]
(http://www.apache.org/licenses/LICENSE-2.0.html).


Requirements
------------

  *   Java **8**
  *   Thymeleaf **2.1.3+**
  *   Attoparser **1.1+** [http://www.attoparser.org]


Maven info
----------

  *   groupId: `org.thymeleaf.extras`   
  *   artifactId: `thymeleaf-extras-java8time`


Distribution packages
---------------------

Distribution packages (binaries + sources + javadoc) can be downloaded from [SourceForge](http://sourceforge.net/projects/thymeleaf/files/thymeleaf-extras-java8time/).


Installation
------------

Just add the `org.thymeleaf.extras.java8time.dialect.Java8TimeDialect`
class to the list of dialects in your TemplateEngine implementation, and you will
have the #temporals object available to be used in your templates.


Features
--------

This module add a #temporals object similar to the #dates or #calendar ones in
the Standard Dialect

```java
/*
 * =============================================================================
 * See javadoc API for class org.thymeleaf.extras.java8time.expression.Temporals
 * =============================================================================
 */

/*
 * Format date with the standard locale format
 * Also works with arrays, lists or sets
 */
${#temporals.format(temporal)}
${#temporals.arrayFormat(temporalsArray)}
${#temporals.listFormat(temporalsList)}
${#temporals.setFormat(temporalsSet)}

/*
 * Format date with the specified pattern
 * Also works with arrays, lists or sets
 */
${#temporals.format(temporal, 'dd/MMM/yyyy HH:mm')}
${#temporals.arrayFormat(temporalsArray, 'dd/MMM/yyyy HH:mm')}
${#temporals.listFormat(temporalsList, 'dd/MMM/yyyy HH:mm')}
${#temporals.setFormat(temporalsSet, 'dd/MMM/yyyy HH:mm')}

/*
 * Obtain date properties
 * Also works with arrays, lists or sets
 */
${#temporals.day(temporal)}                    // also arrayDay(...), listDay(...), etc.
${#temporals.month(temporal)}                  // also arrayMonth(...), listMonth(...), etc.
${#temporals.monthName(temporal)}              // also arrayMonthName(...), listMonthName(...), etc.
${#temporals.monthNameShort(temporal)}         // also arrayMonthNameShort(...), listMonthNameShort(...), etc.
${#temporals.year(temporal)}                   // also arrayYear(...), listYear(...), etc.
${#temporals.dayOfWeek(temporal)}              // also arrayDayOfWeek(...), listDayOfWeek(...), etc.
${#temporals.dayOfWeekName(temporal)}          // also arrayDayOfWeekName(...), listDayOfWeekName(...), etc.
${#temporals.dayOfWeekNameShort(temporal)}     // also arrayDayOfWeekNameShort(...), listDayOfWeekNameShort(...), etc.
${#temporals.hour(temporal)}                   // also arrayHour(...), listHour(...), etc.
${#temporals.minute(temporal)}                 // also arrayMinute(...), listMinute(...), etc.
${#temporals.second(temporal)}                 // also arraySecond(...), listSecond(...), etc.
${#temporals.millisecond(temporal)}            // also arrayMillisecond(...), listMillisecond(...), etc.

/*
 * Create temporal (java.time.Temporal) objects from its components
 */
${#temporals.create(year,month,day)}
${#temporals.create(year,month,day,hour,minute)}
${#temporals.create(year,month,day,hour,minute,second)}
${#temporals.create(year,month,day,hour,minute,second,millisecond)}

/*
 * Create a temporal (java.time.Temporal) object for the current date and time
 */
${#temporals.createNow()}

/*
 * Create a temporal (java.time.Temporal) object for the current date (time set to 00:00)
 */
${#temporals.createToday()}
```

