//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/lang/Boolean.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaLangBoolean")
#ifdef RESTRICT_JavaLangBoolean
#define INCLUDE_ALL_JavaLangBoolean 0
#else
#define INCLUDE_ALL_JavaLangBoolean 1
#endif
#undef RESTRICT_JavaLangBoolean

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaLangBoolean_) && (INCLUDE_ALL_JavaLangBoolean || defined(INCLUDE_JavaLangBoolean))
#define JavaLangBoolean_

#define RESTRICT_JavaIoSerializable 1
#define INCLUDE_JavaIoSerializable 1
#include "java/io/Serializable.h"

#define RESTRICT_JavaLangComparable 1
#define INCLUDE_JavaLangComparable 1
#include "java/lang/Comparable.h"

@class IOSClass;

/*!
 @brief The Boolean class wraps a value of the primitive type 
 <code>boolean</code> in an object.An object of type 
 <code>Boolean</code> contains a single field whose type is 
 <code>boolean</code>.
 <p>
  In addition, this class provides many methods for
  converting a <code>boolean</code> to a <code>String</code> and a 
 <code>String</code> to a <code>boolean</code>, as well as other
  constants and methods useful when dealing with a 
 <code>boolean</code>.
 @author Arthur van Hoff
 @since JDK1.0
 */
@interface JavaLangBoolean : NSObject < JavaIoSerializable, JavaLangComparable >

#pragma mark Public

/*!
 @brief Allocates a <code>Boolean</code> object representing the 
 <code>value</code> argument.
 <p><b>Note: It is rarely appropriate to use this constructor.
  Unless a <i>new</i> instance is required, the static factory 
 <code>valueOf(boolean)</code> is generally a better choice. It is
  likely to yield significantly better space and time performance.</b>
 @param value the value of the <code>Boolean</code> .
 */
- (instancetype __nonnull)initWithBoolean:(jboolean)value;

/*!
 @brief Allocates a <code>Boolean</code> object representing the value 
 <code>true</code> if the string argument is not <code>null</code>
  and is equal, ignoring case, to the string <code>"true"</code>.
 Otherwise, allocate a <code>Boolean</code> object representing the
  value <code>false</code>. Examples:<p>
  <code>new Boolean("True")</code> produces a <code>Boolean</code> object
  that represents <code>true</code>.<br>
  <code>new Boolean("yes")</code> produces a <code>Boolean</code> object
  that represents <code>false</code>.
 @param s the string to be converted to a <code>Boolean</code> .
 */
- (instancetype __nonnull)initWithNSString:(NSString *)s;

/*!
 @brief Returns the value of this <code>Boolean</code> object as a boolean
  primitive.
 @return the primitive <code>boolean</code> value of this object.
 */
- (jboolean)booleanValue;

/*!
 @brief Compares two <code>boolean</code> values.
 The value returned is identical to what would be returned by: 
 @code

     Boolean.valueOf(x).compareTo(Boolean.valueOf(y)) 
  
@endcode
 @param x the first <code>boolean</code>  to compare
 @param y the second <code>boolean</code>  to compare
 @return the value <code>0</code> if <code>x == y</code>;
          a value less than <code>0</code> if <code>!x && y</code>; and
          a value greater than <code>0</code> if <code>x && !y</code>
 @since 1.7
 */
+ (jint)compareWithBoolean:(jboolean)x
               withBoolean:(jboolean)y;

/*!
 @brief Compares this <code>Boolean</code> instance with another.
 @param b the <code>Boolean</code>  instance to be compared
 @return zero if this object represents the same boolean value as the
           argument; a positive value if this object represents true
           and the argument represents false; and a negative value if
           this object represents false and the argument represents true
 @throw NullPointerExceptionif the argument is <code>null</code>
 - seealso: Comparable
 @since 1.5
 */
- (jint)compareToWithId:(JavaLangBoolean *)b;

/*!
 @brief Returns <code>true</code> if and only if the argument is not 
 <code>null</code> and is a <code>Boolean</code> object that
  represents the same <code>boolean</code> value as this object.
 @param obj the object to compare with.
 @return <code>true</code> if the Boolean objects represent the
           same value; <code>false</code> otherwise.
 */
- (jboolean)isEqual:(id)obj;

/*!
 @brief Returns <code>true</code> if and only if the system property
  named by the argument exists and is equal to the string 
 <code>"true"</code>.
 (Beginning with version 1.0.2 of the
  Java<small><sup>TM</sup></small> platform, the test of
  this string is case insensitive.) A system property is accessible
  through <code>getProperty</code>, a method defined by the 
 <code>System</code> class. 
 <p>
  If there is no property with the specified name, or if the specified
  name is empty or null, then <code>false</code> is returned.
 @param name the system property name.
 @return the <code>boolean</code> value of the system property.
 @throw SecurityExceptionfor the same reasons as
           <code>System.getProperty</code>
 - seealso: java.lang.System#getProperty(java.lang.String)
 - seealso: java.lang.System#getProperty(java.lang.String, java.lang.String)
 */
+ (jboolean)getBooleanWithNSString:(NSString *)name;

/*!
 @brief Returns a hash code for this <code>Boolean</code> object.
 @return the integer <code>1231</code> if this object represents 
 <code>true</code>; returns the integer <code>1237</code> if this
  object represents <code>false</code>.
 */
- (NSUInteger)hash;

/*!
 @brief Returns a hash code for a <code>boolean</code> value; compatible with 
 <code>Boolean.hashCode()</code>.
 @param value the value to hash
 @return a hash code value for a <code>boolean</code> value.
 @since 1.8
 */
+ (jint)hashCodeWithBoolean:(jboolean)value;

/*!
 @brief Returns the result of applying the logical AND operator to the
  specified <code>boolean</code> operands.
 @param a the first operand
 @param b the second operand
 @return the logical AND of <code>a</code> and <code>b</code>
 - seealso: java.util.function.BinaryOperator
 @since 1.8
 */
+ (jboolean)logicalAndWithBoolean:(jboolean)a
                      withBoolean:(jboolean)b;

/*!
 @brief Returns the result of applying the logical OR operator to the
  specified <code>boolean</code> operands.
 @param a the first operand
 @param b the second operand
 @return the logical OR of <code>a</code> and <code>b</code>
 - seealso: java.util.function.BinaryOperator
 @since 1.8
 */
+ (jboolean)logicalOrWithBoolean:(jboolean)a
                     withBoolean:(jboolean)b;

/*!
 @brief Returns the result of applying the logical XOR operator to the
  specified <code>boolean</code> operands.
 @param a the first operand
 @param b the second operand
 @return the logical XOR of <code>a</code> and <code>b</code>
 - seealso: java.util.function.BinaryOperator
 @since 1.8
 */
+ (jboolean)logicalXorWithBoolean:(jboolean)a
                      withBoolean:(jboolean)b;

/*!
 @brief Parses the string argument as a boolean.The <code>boolean</code>
  returned represents the value <code>true</code> if the string argument
  is not <code>null</code> and is equal, ignoring case, to the string 
 <code>"true"</code>.
 <p>
  Example: <code>Boolean.parseBoolean("True")</code> returns <code>true</code>.<br>
  Example: <code>Boolean.parseBoolean("yes")</code> returns <code>false</code>.
 @param s the <code>String</code>  containing the boolean                  representation to be parsed
 @return the boolean represented by the string argument
 @since 1.5
 */
+ (jboolean)parseBooleanWithNSString:(NSString *)s;

/*!
 @brief Returns a <code>String</code> object representing this Boolean's
  value.If this object represents the value <code>true</code>,
  a string equal to <code>"true"</code> is returned.
 Otherwise, a
  string equal to <code>"false"</code> is returned.
 @return a string representation of this object.
 */
- (NSString * __nonnull)description;

/*!
 @brief Returns a <code>String</code> object representing the specified
  boolean.If the specified boolean is <code>true</code>, then
  the string <code>"true"</code> will be returned, otherwise the
  string <code>"false"</code> will be returned.
 @param b the boolean to be converted
 @return the string representation of the specified <code>boolean</code>
 @since 1.4
 */
+ (NSString * __nonnull)toStringWithBoolean:(jboolean)b;

/*!
 @brief Returns a <code>Boolean</code> instance representing the specified 
 <code>boolean</code> value.If the specified <code>boolean</code> value
  is <code>true</code>, this method returns <code>Boolean.TRUE</code>;
  if it is <code>false</code>, this method returns <code>Boolean.FALSE</code>.
 If a new <code>Boolean</code> instance is not required, this method
  should generally be used in preference to the constructor 
 <code>Boolean(boolean)</code>, as this method is likely to yield
  significantly better space and time performance.
 @param b a boolean value.
 @return a <code>Boolean</code> instance representing <code>b</code>.
 @since 1.4
 */
+ (JavaLangBoolean * __nonnull)valueOfWithBoolean:(jboolean)b;

/*!
 @brief Returns a <code>Boolean</code> with a value represented by the
  specified string.The <code>Boolean</code> returned represents a
  true value if the string argument is not <code>null</code>
  and is equal, ignoring case, to the string <code>"true"</code>.
 @param s a string.
 @return the <code>Boolean</code> value represented by the string.
 */
+ (JavaLangBoolean * __nonnull)valueOfWithNSString:(NSString *)s;

// Disallowed inherited constructors, do not use.

- (instancetype __nonnull)init NS_UNAVAILABLE;

@end

J2OBJC_STATIC_INIT(JavaLangBoolean)

/*!
 @brief The <code>Boolean</code> object corresponding to the primitive
  value <code>true</code>.
 */
inline JavaLangBoolean *JavaLangBoolean_get_TRUE(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT JavaLangBoolean *JavaLangBoolean_TRUE;
J2OBJC_STATIC_FIELD_OBJ_FINAL(JavaLangBoolean, TRUE, JavaLangBoolean *)

/*!
 @brief The <code>Boolean</code> object corresponding to the primitive
  value <code>false</code>.
 */
inline JavaLangBoolean *JavaLangBoolean_get_FALSE(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT JavaLangBoolean *JavaLangBoolean_FALSE;
J2OBJC_STATIC_FIELD_OBJ_FINAL(JavaLangBoolean, FALSE, JavaLangBoolean *)

/*!
 @brief The Class object representing the primitive type boolean.
 @since JDK1.1
 */
inline IOSClass *JavaLangBoolean_get_TYPE(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT IOSClass *JavaLangBoolean_TYPE;
J2OBJC_STATIC_FIELD_OBJ_FINAL(JavaLangBoolean, TYPE, IOSClass *)

FOUNDATION_EXPORT void JavaLangBoolean_initWithBoolean_(JavaLangBoolean *self, jboolean value);

FOUNDATION_EXPORT JavaLangBoolean *new_JavaLangBoolean_initWithBoolean_(jboolean value) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaLangBoolean *create_JavaLangBoolean_initWithBoolean_(jboolean value);

FOUNDATION_EXPORT void JavaLangBoolean_initWithNSString_(JavaLangBoolean *self, NSString *s);

FOUNDATION_EXPORT JavaLangBoolean *new_JavaLangBoolean_initWithNSString_(NSString *s) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaLangBoolean *create_JavaLangBoolean_initWithNSString_(NSString *s);

FOUNDATION_EXPORT jboolean JavaLangBoolean_parseBooleanWithNSString_(NSString *s);

FOUNDATION_EXPORT JavaLangBoolean *JavaLangBoolean_valueOfWithBoolean_(jboolean b);

FOUNDATION_EXPORT JavaLangBoolean *JavaLangBoolean_valueOfWithNSString_(NSString *s);

FOUNDATION_EXPORT NSString *JavaLangBoolean_toStringWithBoolean_(jboolean b);

FOUNDATION_EXPORT jint JavaLangBoolean_hashCodeWithBoolean_(jboolean value);

FOUNDATION_EXPORT jboolean JavaLangBoolean_getBooleanWithNSString_(NSString *name);

FOUNDATION_EXPORT jint JavaLangBoolean_compareWithBoolean_withBoolean_(jboolean x, jboolean y);

FOUNDATION_EXPORT jboolean JavaLangBoolean_logicalAndWithBoolean_withBoolean_(jboolean a, jboolean b);

FOUNDATION_EXPORT jboolean JavaLangBoolean_logicalOrWithBoolean_withBoolean_(jboolean a, jboolean b);

FOUNDATION_EXPORT jboolean JavaLangBoolean_logicalXorWithBoolean_withBoolean_(jboolean a, jboolean b);

J2OBJC_TYPE_LITERAL_HEADER(JavaLangBoolean)

BOXED_INC_AND_DEC(Boolean, booleanValue, JavaLangBoolean)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaLangBoolean")