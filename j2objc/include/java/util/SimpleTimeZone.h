//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/util/SimpleTimeZone.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaUtilSimpleTimeZone")
#ifdef RESTRICT_JavaUtilSimpleTimeZone
#define INCLUDE_ALL_JavaUtilSimpleTimeZone 0
#else
#define INCLUDE_ALL_JavaUtilSimpleTimeZone 1
#endif
#undef RESTRICT_JavaUtilSimpleTimeZone

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaUtilSimpleTimeZone_) && (INCLUDE_ALL_JavaUtilSimpleTimeZone || defined(INCLUDE_JavaUtilSimpleTimeZone))
#define JavaUtilSimpleTimeZone_

#define RESTRICT_JavaUtilTimeZone 1
#define INCLUDE_JavaUtilTimeZone 1
#include "java/util/TimeZone.h"

@class IOSIntArray;
@class JavaUtilDate;

/*!
 @brief <code>SimpleTimeZone</code> is a concrete subclass of <code>TimeZone</code>
  that represents a time zone for use with a Gregorian calendar.
 The class holds an offset from GMT, called <em>raw offset</em>, and start
  and end rules for a daylight saving time schedule.  Since it only holds
  single values for each, it cannot handle historical changes in the offset
  from GMT and the daylight saving schedule, except that the <code>setStartYear</code>
  method can specify the year when the daylight
  saving time schedule starts in effect. 
 <p>
  To construct a <code>SimpleTimeZone</code> with a daylight saving time
  schedule, the schedule can be described with a set of rules, 
 <em>start-rule</em> and <em>end-rule</em>. A day when daylight saving time
  starts or ends is specified by a combination of <em>month</em>,
  <em>day-of-month</em>, and <em>day-of-week</em> values. The <em>month</em>
  value is represented by a Calendar <code>MONTH</code> field
  value, such as <code>Calendar.MARCH</code>. The <em>day-of-week</em> value is
  represented by a Calendar <code>DAY_OF_WEEK</code> value,
  such as <code>SUNDAY</code>. The meanings of value combinations
  are as follows. 
 <ul>
  <li><b>Exact day of month</b><br>
  To specify an exact day of month, set the <em>month</em> and 
 <em>day-of-month</em> to an exact value, and <em>day-of-week</em> to zero. For
  example, to specify March 1, set the <em>month</em> to <code>MARCH</code>
 , <em>day-of-month</em> to 1, and <em>day-of-week</em> to 0.</li>
  
 <li><b>Day of week on or after day of month</b><br>
  To specify a day of week on or after an exact day of month, set the 
 <em>month</em> to an exact month value, <em>day-of-month</em> to the day on
  or after which the rule is applied, and <em>day-of-week</em> to a negative <code>DAY_OF_WEEK</code>
  field value. For example, to specify the
  second Sunday of April, set <em>month</em> to <code>APRIL</code>,
  <em>day-of-month</em> to 8, and <em>day-of-week</em> to <code>-</code><code>SUNDAY</code>
 .</li>
  
 <li><b>Day of week on or before day of month</b><br>
  To specify a day of the week on or before an exact day of the month, set 
 <em>day-of-month</em> and <em>day-of-week</em> to a negative value. For
  example, to specify the last Wednesday on or before the 21st of March, set 
 <em>month</em> to <code>MARCH</code>, <em>day-of-month</em> is -21
  and <em>day-of-week</em> is <code>-</code><code>WEDNESDAY</code>. </li>
  
 <li><b>Last day-of-week of month</b><br>
  To specify, the last day-of-week of the month, set <em>day-of-week</em> to a 
 <code>DAY_OF_WEEK</code> value and <em>day-of-month</em> to
  -1. For example, to specify the last Sunday of October, set <em>month</em>
  to <code>OCTOBER</code>, <em>day-of-week</em> to <code>SUNDAY</code>
  and <em>day-of-month</em> to -1.  </li>
  
 </ul>
  The time of the day at which daylight saving time starts or ends is
  specified by a millisecond value within the day. There are three kinds of 
 <em>mode</em>s to specify the time: <code>WALL_TIME</code>, <code>STANDARD_TIME</code>
  and <code>UTC_TIME</code>. For example, if daylight
  saving time ends
  at 2:00 am in the wall clock time, it can be specified by 7200000
  milliseconds in the <code>WALL_TIME</code> mode. In this case, the wall clock time
  for an <em>end-rule</em> means the same thing as the daylight time. 
 <p>
  The following are examples of parameters for constructing time zone objects. 
 @code
<code>
       // Base GMT offset: -8:00
       // DST starts:      at 2:00am in standard time
       //                  on the first Sunday in April
       // DST ends:        at 2:00am in daylight time
       //                  on the last Sunday in October
       // Save:            1 hour
       SimpleTimeZone(-28800000,
                      "America/Los_Angeles",
                      Calendar.APRIL, 1, -Calendar.SUNDAY,
                      7200000,
                      Calendar.OCTOBER, -1, Calendar.SUNDAY,
                      7200000,
                      3600000)
       // Base GMT offset: +1:00
       // DST starts:      at 1:00am in UTC time
       //                  on the last Sunday in March
       // DST ends:        at 1:00am in UTC time
       //                  on the last Sunday in October
       // Save:            1 hour
       SimpleTimeZone(3600000,
                      "Europe/Paris",
                      Calendar.MARCH, -1, Calendar.SUNDAY,
                      3600000, SimpleTimeZone.UTC_TIME,
                      Calendar.OCTOBER, -1, Calendar.SUNDAY,
                      3600000, SimpleTimeZone.UTC_TIME,
                      3600000) 
  </code>
@endcode
  These parameter rules are also applicable to the set rule methods, such as 
 <code>setStartRule</code>.
 @since 1.1
 - seealso: Calendar
 - seealso: GregorianCalendar
 - seealso: TimeZone
 @author David Goldsmith, Mark Davis, Chen-Lieh Huang, Alan Liu
 */
@interface JavaUtilSimpleTimeZone : JavaUtilTimeZone

#pragma mark Public

/*!
 @brief Constructs a SimpleTimeZone with the given base time zone offset from GMT
  and time zone ID with no daylight saving time schedule.
 @param rawOffset The base time zone offset in milliseconds to GMT.
 @param ID The time zone name that is given to this instance.
 */
- (instancetype __nonnull)initWithInt:(jint)rawOffset
                         withNSString:(NSString *)ID;

/*!
 @brief Constructs a SimpleTimeZone with the given base time zone offset from
  GMT, time zone ID, and rules for starting and ending the daylight
  time.
 Both <code>startTime</code> and <code>endTime</code> are specified to be
  represented in the wall clock time. The amount of daylight saving is
  assumed to be 3600000 milliseconds (i.e., one hour). This constructor is
  equivalent to: 
 @code
<code>
      SimpleTimeZone(rawOffset,
                     ID,
                     startMonth,
                     startDay,
                     startDayOfWeek,
                     startTime,
                     SimpleTimeZone.<code>WALL_TIME</code>,
                     endMonth,
                     endDay,
                     endDayOfWeek,
                     endTime,
                     SimpleTimeZone.<code>WALL_TIME</code>,
                     3600000) 
  </code>
@endcode
 @param rawOffset The given base time zone offset from GMT.
 @param ID The time zone ID which is given to this object.
 @param startMonth The daylight saving time starting month. Month is                         a 
 <code>MONTH</code>  field value (0-based. e.g., 0                         for January).
 @param startDay The day of the month on which the daylight saving time starts.                         See the class description for the special cases of this parameter.
 @param startDayOfWeek The daylight saving time starting day-of-week.                         See the class description for the special cases of this parameter.
 @param startTime The daylight saving time starting time in local wall clock                         time (in milliseconds within the day), which is local
                          standard time in this case.
 @param endMonth The daylight saving time ending month. Month is                         a 
 <code>MONTH</code>  field                         value (0-based. e.g., 9 for October).
 @param endDay The day of the month on which the daylight saving time ends.                         See the class description for the special cases of this parameter.
 @param endDayOfWeek The daylight saving time ending day-of-week.                         See the class description for the special cases of this parameter.
 @param endTime The daylight saving ending time in local wall clock time,                         (in milliseconds within the day) which is local daylight
                          time in this case.
 @throw IllegalArgumentExceptionif the month, day, dayOfWeek, or time
  parameters are out of range for the start or end rule
 */
- (instancetype __nonnull)initWithInt:(jint)rawOffset
                         withNSString:(NSString *)ID
                              withInt:(jint)startMonth
                              withInt:(jint)startDay
                              withInt:(jint)startDayOfWeek
                              withInt:(jint)startTime
                              withInt:(jint)endMonth
                              withInt:(jint)endDay
                              withInt:(jint)endDayOfWeek
                              withInt:(jint)endTime;

/*!
 @brief Constructs a SimpleTimeZone with the given base time zone offset from
  GMT, time zone ID, and rules for starting and ending the daylight
  time.
 Both <code>startTime</code> and <code>endTime</code> are assumed to be
  represented in the wall clock time. This constructor is equivalent to: 
 @code
<code>
      SimpleTimeZone(rawOffset,
                     ID,
                     startMonth,
                     startDay,
                     startDayOfWeek,
                     startTime,
                     SimpleTimeZone.<code>WALL_TIME</code>,
                     endMonth,
                     endDay,
                     endDayOfWeek,
                     endTime,
                     SimpleTimeZone.<code>WALL_TIME</code>,
                     dstSavings) 
  </code>
@endcode
 @param rawOffset The given base time zone offset from GMT.
 @param ID The time zone ID which is given to this object.
 @param startMonth The daylight saving time starting month. Month is                         a 
 <code>MONTH</code>  field                         value (0-based. e.g., 0 for January).
 @param startDay The day of the month on which the daylight saving time starts.                         See the class description for the special cases of this parameter.
 @param startDayOfWeek The daylight saving time starting day-of-week.                         See the class description for the special cases of this parameter.
 @param startTime The daylight saving time starting time in local wall clock                         time, which is local standard time in this case.
 @param endMonth The daylight saving time ending month. Month is                         a 
 <code>MONTH</code>  field                         value (0-based. e.g., 9 for October).
 @param endDay The day of the month on which the daylight saving time ends.                         See the class description for the special cases of this parameter.
 @param endDayOfWeek The daylight saving time ending day-of-week.                         See the class description for the special cases of this parameter.
 @param endTime The daylight saving ending time in local wall clock time,                         which is local daylight time in this case.
 @param dstSavings The amount of time in milliseconds saved during                         daylight saving time.
 @throw IllegalArgumentExceptionif the month, day, dayOfWeek, or time
  parameters are out of range for the start or end rule
 @since 1.2
 */
- (instancetype __nonnull)initWithInt:(jint)rawOffset
                         withNSString:(NSString *)ID
                              withInt:(jint)startMonth
                              withInt:(jint)startDay
                              withInt:(jint)startDayOfWeek
                              withInt:(jint)startTime
                              withInt:(jint)endMonth
                              withInt:(jint)endDay
                              withInt:(jint)endDayOfWeek
                              withInt:(jint)endTime
                              withInt:(jint)dstSavings;

/*!
 @brief Constructs a SimpleTimeZone with the given base time zone offset from
  GMT, time zone ID, and rules for starting and ending the daylight
  time.
 This constructor takes the full set of the start and end rules
  parameters, including modes of <code>startTime</code> and 
 <code>endTime</code>. The mode specifies either <code>wall
  time</code>
  or <code>standard time</code> or <code>UTC
  time</code>
 .
 @param rawOffset The given base time zone offset from GMT.
 @param ID The time zone ID which is given to this object.
 @param startMonth The daylight saving time starting month. Month is                         a 
 <code>MONTH</code>  field                         value (0-based. e.g., 0 for January).
 @param startDay The day of the month on which the daylight saving time starts.                         See the class description for the special cases of this parameter.
 @param startDayOfWeek The daylight saving time starting day-of-week.                         See the class description for the special cases of this parameter.
 @param startTime The daylight saving time starting time in the time mode                         specified by 
  <code> startTimeMode </code> .
 @param startTimeMode The mode of the start time specified by startTime.
 @param endMonth The daylight saving time ending month. Month is                         a 
 <code>MONTH</code>  field                         value (0-based. e.g., 9 for October).
 @param endDay The day of the month on which the daylight saving time ends.                         See the class description for the special cases of this parameter.
 @param endDayOfWeek The daylight saving time ending day-of-week.                         See the class description for the special cases of this parameter.
 @param endTime The daylight saving ending time in time time mode                         specified by 
  <code> endTimeMode </code> .
 @param endTimeMode The mode of the end time specified by endTime
 @param dstSavings The amount of time in milliseconds saved during                         daylight saving time.
 @throw IllegalArgumentExceptionif the month, day, dayOfWeek, time more, or
  time parameters are out of range for the start or end rule, or if a time mode
  value is invalid.
 - seealso: #WALL_TIME
 - seealso: #STANDARD_TIME
 - seealso: #UTC_TIME
 @since 1.4
 */
- (instancetype __nonnull)initWithInt:(jint)rawOffset
                         withNSString:(NSString *)ID
                              withInt:(jint)startMonth
                              withInt:(jint)startDay
                              withInt:(jint)startDayOfWeek
                              withInt:(jint)startTime
                              withInt:(jint)startTimeMode
                              withInt:(jint)endMonth
                              withInt:(jint)endDay
                              withInt:(jint)endDayOfWeek
                              withInt:(jint)endTime
                              withInt:(jint)endTimeMode
                              withInt:(jint)dstSavings;

/*!
 @brief Returns a clone of this <code>SimpleTimeZone</code> instance.
 @return a clone of this instance.
 */
- (id)java_clone;

/*!
 @brief Compares the equality of two <code>SimpleTimeZone</code> objects.
 @param obj The  <code> SimpleTimeZone </code>  object to be compared with.
 @return True if the given <code>obj</code> is the same as this
              <code>SimpleTimeZone</code> object; false otherwise.
 */
- (jboolean)isEqual:(id)obj;

/*!
 @brief Returns the amount of time in milliseconds that the clock is
  advanced during daylight saving time.
 @return the number of milliseconds the time is advanced with
  respect to standard time when the daylight saving rules are in
  effect, or 0 (zero) if this time zone doesn't observe daylight
  saving time.
 - seealso: #setDSTSavings
 @since 1.2
 */
- (jint)getDSTSavings;

/*!
 @brief Returns the difference in milliseconds between local time and
  UTC, taking into account both the raw offset and the effect of
  daylight saving, for the specified date and time.This method
  assumes that the start and end month are distinct.
 It also
  uses a default <code>GregorianCalendar</code> object as its
  underlying calendar, such as for determining leap years.  Do
  not use the result of this method with a calendar other than a
  default <code>GregorianCalendar</code>.
  
 <p><em>Note:  In general, clients should use 
 <code>Calendar.get(ZONE_OFFSET) + Calendar.get(DST_OFFSET)</code>
  instead of calling this method.</em>
 @param era The era of the given date.
 @param year The year in the given date.
 @param month The month in the given date. Month is 0-based. e.g.,                   0 for January.
 @param day The day-in-month of the given date.
 @param dayOfWeek The day-of-week of the given date.
 @param millis The milliseconds in day in  <em> standard </em>  local time.
 @return The milliseconds to add to UTC to get local time.
 @throw IllegalArgumentExceptionthe <code>era</code>,
                   <code>month</code>, <code>day</code>, <code>dayOfWeek</code>,
                   or <code>millis</code> parameters are out of range
 */
- (jint)getOffsetWithInt:(jint)era
                 withInt:(jint)year
                 withInt:(jint)month
                 withInt:(jint)day
                 withInt:(jint)dayOfWeek
                 withInt:(jint)millis;

/*!
 @brief Returns the offset of this time zone from UTC at the given
  time.If daylight saving time is in effect at the given time,
  the offset value is adjusted with the amount of daylight
  saving.
 @param date the time at which the time zone offset is found
 @return the amount of time in milliseconds to add to UTC to get
  local time.
 @since 1.4
 */
- (jint)getOffsetWithLong:(jlong)date;

/*!
 @brief Gets the GMT offset for this time zone.
 @return the GMT offset value in milliseconds
 - seealso: #setRawOffset
 */
- (jint)getRawOffset;

/*!
 @brief Generates the hash code for the SimpleDateFormat object.
 @return the hash code for this object
 */
- (NSUInteger)hash;

/*!
 @brief Returns <code>true</code> if this zone has the same rules and offset as another zone.
 @param other the TimeZone object to be compared with
 @return <code>true</code> if the given zone is a SimpleTimeZone and has the
  same rules and offset as this one
 @since 1.2
 */
- (jboolean)hasSameRulesWithJavaUtilTimeZone:(JavaUtilTimeZone *)other;

/*!
 @brief Queries if the given date is in daylight saving time.
 @return true if daylight saving time is in effective at the
  given date; false otherwise.
 */
- (jboolean)inDaylightTimeWithJavaUtilDate:(JavaUtilDate *)date;

/*!
 @brief Returns <code>true</code> if this <code>SimpleTimeZone</code> observes
  Daylight Saving Time.This method is equivalent to <code>useDaylightTime()</code>
 .
 @return <code>true</code> if this <code>SimpleTimeZone</code> observes
  Daylight Saving Time; <code>false</code> otherwise.
 @since 1.7
 */
- (jboolean)observesDaylightTime;

/*!
 @brief Sets the amount of time in milliseconds that the clock is advanced
  during daylight saving time.
 @param millisSavedDuringDST the number of milliseconds the time is  advanced with respect to standard time when the daylight saving time rules
   are in effect. A positive number, typically one hour (3600000).
 - seealso: #getDSTSavings
 @since 1.2
 */
- (void)setDSTSavingsWithInt:(jint)millisSavedDuringDST;

/*!
 @brief Sets the daylight saving time end rule to a fixed date within a month.
 This method is equivalent to: 
 @code
<code>setEndRule(endMonth, endDay, 0, endTime)</code>
@endcode
 @param endMonth The daylight saving time ending month. Month is                         a 
 <code>MONTH</code>  field                         value (0-based. e.g., 9 for October).
 @param endDay The day of the month on which the daylight saving time ends.
 @param endTime The daylight saving ending time in local wall clock time,                         (in milliseconds within the day) which is local daylight
                          time in this case.
 @throw IllegalArgumentExceptionthe <code>endMonth</code>, <code>endDay</code>,
  or <code>endTime</code> parameters are out of range
 @since 1.2
 */
- (void)setEndRuleWithInt:(jint)endMonth
                  withInt:(jint)endDay
                  withInt:(jint)endTime;

/*!
 @brief Sets the daylight saving time end rule.For example, if daylight saving time
  ends on the last Sunday in October at 2 am in wall clock time,
  you can set the end rule by calling: 
 <code>setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2*60*60*1000);</code>
 @param endMonth The daylight saving time ending month. Month is                         a 
 <code>MONTH</code>  field                         value (0-based. e.g., 9 for October).
 @param endDay The day of the month on which the daylight saving time ends.                         See the class description for the special cases of this parameter.
 @param endDayOfWeek The daylight saving time ending day-of-week.                         See the class description for the special cases of this parameter.
 @param endTime The daylight saving ending time in local wall clock time,                         (in milliseconds within the day) which is local daylight
                          time in this case.
 @throw IllegalArgumentExceptionif the <code>endMonth</code>, <code>endDay</code>,
  <code>endDayOfWeek</code>, or <code>endTime</code> parameters are out of range
 */
- (void)setEndRuleWithInt:(jint)endMonth
                  withInt:(jint)endDay
                  withInt:(jint)endDayOfWeek
                  withInt:(jint)endTime;

/*!
 @brief Sets the daylight saving time end rule to a weekday before or after the given date within
  a month, e.g., the first Monday on or after the 8th.
 @param endMonth The daylight saving time ending month. Month is                         a 
 <code>MONTH</code>  field                         value (0-based. e.g., 9 for October).
 @param endDay The day of the month on which the daylight saving time ends.
 @param endDayOfWeek The daylight saving time ending day-of-week.
 @param endTime The daylight saving ending time in local wall clock time,                         (in milliseconds within the day) which is local daylight
                          time in this case.
 @param after If true, this rule selects the first  <code> endDayOfWeek </code>  on                         or 
  <em> after </em>   <code> endDay </code> .  If false, this rule                         selects the last 
  <code> endDayOfWeek </code>  on or before                         
  <code> endDay </code>  of the month.
 @throw IllegalArgumentExceptionthe <code>endMonth</code>, <code>endDay</code>,
  <code>endDayOfWeek</code>, or <code>endTime</code> parameters are out of range
 @since 1.2
 */
- (void)setEndRuleWithInt:(jint)endMonth
                  withInt:(jint)endDay
                  withInt:(jint)endDayOfWeek
                  withInt:(jint)endTime
              withBoolean:(jboolean)after;

/*!
 @brief Sets the base time zone offset to GMT.
 This is the offset to add to UTC to get local time.
 - seealso: #getRawOffset
 */
- (void)setRawOffsetWithInt:(jint)offsetMillis;

/*!
 @brief Sets the daylight saving time start rule to a fixed date within a month.
 This method is equivalent to: 
 @code
<code>setStartRule(startMonth, startDay, 0, startTime)</code>
@endcode
 @param startMonth The daylight saving time starting month. Month is                         a 
 <code>MONTH</code>  field                         value (0-based. e.g., 0 for January).
 @param startDay The day of the month on which the daylight saving time starts.
 @param startTime The daylight saving time starting time in local wall clock                         time, which is local standard time in this case.
                          See the class description for the special cases of this parameter.
 @throw IllegalArgumentExceptionif the <code>startMonth</code>,
  <code>startDayOfMonth</code>, or <code>startTime</code> parameters are out of range
 @since 1.2
 */
- (void)setStartRuleWithInt:(jint)startMonth
                    withInt:(jint)startDay
                    withInt:(jint)startTime;

/*!
 @brief Sets the daylight saving time start rule.For example, if daylight saving
  time starts on the first Sunday in April at 2 am in local wall clock
  time, you can set the start rule by calling: 
 @code
<code>setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2*60*60*1000);</code>
@endcode
 @param startMonth The daylight saving time starting month. Month is                         a 
 <code>MONTH</code>  field                         value (0-based. e.g., 0 for January).
 @param startDay The day of the month on which the daylight saving time starts.                         See the class description for the special cases of this parameter.
 @param startDayOfWeek The daylight saving time starting day-of-week.                         See the class description for the special cases of this parameter.
 @param startTime The daylight saving time starting time in local wall clock                         time, which is local standard time in this case.
 @throw IllegalArgumentExceptionif the <code>startMonth</code>, <code>startDay</code>,
  <code>startDayOfWeek</code>, or <code>startTime</code> parameters are out of range
 */
- (void)setStartRuleWithInt:(jint)startMonth
                    withInt:(jint)startDay
                    withInt:(jint)startDayOfWeek
                    withInt:(jint)startTime;

/*!
 @brief Sets the daylight saving time start rule to a weekday before or after the given date within
  a month, e.g., the first Monday on or after the 8th.
 @param startMonth The daylight saving time starting month. Month is                         a 
 <code>MONTH</code>  field                         value (0-based. e.g., 0 for January).
 @param startDay The day of the month on which the daylight saving time starts.
 @param startDayOfWeek The daylight saving time starting day-of-week.
 @param startTime The daylight saving time starting time in local wall clock                         time, which is local standard time in this case.
 @param after If true, this rule selects the first  <code> dayOfWeek </code>  on or                         
  <em> after </em>   <code> dayOfMonth </code> .  If false, this rule                         selects the last 
  <code> dayOfWeek </code>  on or  <em> before </em>                         
  <code> dayOfMonth </code> .
 @throw IllegalArgumentExceptionif the <code>startMonth</code>, <code>startDay</code>,
  <code>startDayOfWeek</code>, or <code>startTime</code> parameters are out of range
 @since 1.2
 */
- (void)setStartRuleWithInt:(jint)startMonth
                    withInt:(jint)startDay
                    withInt:(jint)startDayOfWeek
                    withInt:(jint)startTime
                withBoolean:(jboolean)after;

/*!
 @brief Sets the daylight saving time starting year.
 @param year The daylight saving starting year.
 */
- (void)setStartYearWithInt:(jint)year;

/*!
 @brief Returns a string representation of this time zone.
 @return a string representation of this time zone.
 */
- (NSString *)description;

/*!
 @brief Queries if this time zone uses daylight saving time.
 @return true if this time zone uses daylight saving time;
  false otherwise.
 */
- (jboolean)useDaylightTime;

#pragma mark Package-Private

/*!
 - seealso: TimeZone#getOffsets
 */
- (jint)getOffsetsWithLong:(jlong)date
              withIntArray:(IOSIntArray *)offsets;

// Disallowed inherited constructors, do not use.

- (instancetype __nonnull)init NS_UNAVAILABLE;

@end

J2OBJC_STATIC_INIT(JavaUtilSimpleTimeZone)

/*!
 @brief Constant for a mode of start or end time specified as wall clock
  time.Wall clock time is standard time for the onset rule, and
  daylight time for the end rule.
 @since 1.4
 */
inline jint JavaUtilSimpleTimeZone_get_WALL_TIME(void);
#define JavaUtilSimpleTimeZone_WALL_TIME 0
J2OBJC_STATIC_FIELD_CONSTANT(JavaUtilSimpleTimeZone, WALL_TIME, jint)

/*!
 @brief Constant for a mode of start or end time specified as standard time.
 @since 1.4
 */
inline jint JavaUtilSimpleTimeZone_get_STANDARD_TIME(void);
#define JavaUtilSimpleTimeZone_STANDARD_TIME 1
J2OBJC_STATIC_FIELD_CONSTANT(JavaUtilSimpleTimeZone, STANDARD_TIME, jint)

/*!
 @brief Constant for a mode of start or end time specified as UTC.European
  Union rules are specified as UTC time, for example.
 @since 1.4
 */
inline jint JavaUtilSimpleTimeZone_get_UTC_TIME(void);
#define JavaUtilSimpleTimeZone_UTC_TIME 2
J2OBJC_STATIC_FIELD_CONSTANT(JavaUtilSimpleTimeZone, UTC_TIME, jint)

inline jlong JavaUtilSimpleTimeZone_get_serialVersionUID(void);
#define JavaUtilSimpleTimeZone_serialVersionUID -403250971215465050LL
J2OBJC_STATIC_FIELD_CONSTANT(JavaUtilSimpleTimeZone, serialVersionUID, jlong)

inline jint JavaUtilSimpleTimeZone_get_currentSerialVersion(void);
#define JavaUtilSimpleTimeZone_currentSerialVersion 2
J2OBJC_STATIC_FIELD_CONSTANT(JavaUtilSimpleTimeZone, currentSerialVersion, jint)

FOUNDATION_EXPORT void JavaUtilSimpleTimeZone_initWithInt_withNSString_(JavaUtilSimpleTimeZone *self, jint rawOffset, NSString *ID);

FOUNDATION_EXPORT JavaUtilSimpleTimeZone *new_JavaUtilSimpleTimeZone_initWithInt_withNSString_(jint rawOffset, NSString *ID) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilSimpleTimeZone *create_JavaUtilSimpleTimeZone_initWithInt_withNSString_(jint rawOffset, NSString *ID);

FOUNDATION_EXPORT void JavaUtilSimpleTimeZone_initWithInt_withNSString_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_(JavaUtilSimpleTimeZone *self, jint rawOffset, NSString *ID, jint startMonth, jint startDay, jint startDayOfWeek, jint startTime, jint endMonth, jint endDay, jint endDayOfWeek, jint endTime);

FOUNDATION_EXPORT JavaUtilSimpleTimeZone *new_JavaUtilSimpleTimeZone_initWithInt_withNSString_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_(jint rawOffset, NSString *ID, jint startMonth, jint startDay, jint startDayOfWeek, jint startTime, jint endMonth, jint endDay, jint endDayOfWeek, jint endTime) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilSimpleTimeZone *create_JavaUtilSimpleTimeZone_initWithInt_withNSString_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_(jint rawOffset, NSString *ID, jint startMonth, jint startDay, jint startDayOfWeek, jint startTime, jint endMonth, jint endDay, jint endDayOfWeek, jint endTime);

FOUNDATION_EXPORT void JavaUtilSimpleTimeZone_initWithInt_withNSString_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_(JavaUtilSimpleTimeZone *self, jint rawOffset, NSString *ID, jint startMonth, jint startDay, jint startDayOfWeek, jint startTime, jint endMonth, jint endDay, jint endDayOfWeek, jint endTime, jint dstSavings);

FOUNDATION_EXPORT JavaUtilSimpleTimeZone *new_JavaUtilSimpleTimeZone_initWithInt_withNSString_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_(jint rawOffset, NSString *ID, jint startMonth, jint startDay, jint startDayOfWeek, jint startTime, jint endMonth, jint endDay, jint endDayOfWeek, jint endTime, jint dstSavings) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilSimpleTimeZone *create_JavaUtilSimpleTimeZone_initWithInt_withNSString_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_(jint rawOffset, NSString *ID, jint startMonth, jint startDay, jint startDayOfWeek, jint startTime, jint endMonth, jint endDay, jint endDayOfWeek, jint endTime, jint dstSavings);

FOUNDATION_EXPORT void JavaUtilSimpleTimeZone_initWithInt_withNSString_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_(JavaUtilSimpleTimeZone *self, jint rawOffset, NSString *ID, jint startMonth, jint startDay, jint startDayOfWeek, jint startTime, jint startTimeMode, jint endMonth, jint endDay, jint endDayOfWeek, jint endTime, jint endTimeMode, jint dstSavings);

FOUNDATION_EXPORT JavaUtilSimpleTimeZone *new_JavaUtilSimpleTimeZone_initWithInt_withNSString_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_(jint rawOffset, NSString *ID, jint startMonth, jint startDay, jint startDayOfWeek, jint startTime, jint startTimeMode, jint endMonth, jint endDay, jint endDayOfWeek, jint endTime, jint endTimeMode, jint dstSavings) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilSimpleTimeZone *create_JavaUtilSimpleTimeZone_initWithInt_withNSString_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_withInt_(jint rawOffset, NSString *ID, jint startMonth, jint startDay, jint startDayOfWeek, jint startTime, jint startTimeMode, jint endMonth, jint endDay, jint endDayOfWeek, jint endTime, jint endTimeMode, jint dstSavings);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilSimpleTimeZone)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaUtilSimpleTimeZone")
