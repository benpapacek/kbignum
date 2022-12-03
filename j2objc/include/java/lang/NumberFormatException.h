//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/lang/NumberFormatException.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaLangNumberFormatException")
#ifdef RESTRICT_JavaLangNumberFormatException
#define INCLUDE_ALL_JavaLangNumberFormatException 0
#else
#define INCLUDE_ALL_JavaLangNumberFormatException 1
#endif
#undef RESTRICT_JavaLangNumberFormatException

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaLangNumberFormatException_) && (INCLUDE_ALL_JavaLangNumberFormatException || defined(INCLUDE_JavaLangNumberFormatException))
#define JavaLangNumberFormatException_

#define RESTRICT_JavaLangIllegalArgumentException 1
#define INCLUDE_JavaLangIllegalArgumentException 1
#include "java/lang/IllegalArgumentException.h"

@class JavaLangThrowable;

/*!
 @brief Thrown to indicate that the application has attempted to convert
  a string to one of the numeric types, but that the string does not
  have the appropriate format.
 @author unascribed
 - seealso: java.lang.Integer#parseInt(String)
 @since JDK1.0
 */
@interface JavaLangNumberFormatException : JavaLangIllegalArgumentException

#pragma mark Public

/*!
 @brief Constructs a <code>NumberFormatException</code> with no detail message.
 */
- (instancetype __nonnull)init;

/*!
 @brief Constructs a <code>NumberFormatException</code> with the
  specified detail message.
 @param s the detail message.
 */
- (instancetype __nonnull)initWithNSString:(NSString *)s;

#pragma mark Package-Private

/*!
 @brief Factory method for making a <code>NumberFormatException</code>
  given the specified input which caused the error.
 @param s the input causing the error
 */
+ (JavaLangNumberFormatException *)forInputStringWithNSString:(NSString *)s;

// Disallowed inherited constructors, do not use.

- (instancetype __nonnull)initWithJavaLangThrowable:(JavaLangThrowable *)arg0 NS_UNAVAILABLE;

- (instancetype __nonnull)initWithNSString:(NSString *)arg0
                     withJavaLangThrowable:(JavaLangThrowable *)arg1 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaLangNumberFormatException)

inline jlong JavaLangNumberFormatException_get_serialVersionUID(void);
#define JavaLangNumberFormatException_serialVersionUID -2848938806368998894LL
J2OBJC_STATIC_FIELD_CONSTANT(JavaLangNumberFormatException, serialVersionUID, jlong)

FOUNDATION_EXPORT void JavaLangNumberFormatException_init(JavaLangNumberFormatException *self);

FOUNDATION_EXPORT JavaLangNumberFormatException *new_JavaLangNumberFormatException_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaLangNumberFormatException *create_JavaLangNumberFormatException_init(void);

FOUNDATION_EXPORT void JavaLangNumberFormatException_initWithNSString_(JavaLangNumberFormatException *self, NSString *s);

FOUNDATION_EXPORT JavaLangNumberFormatException *new_JavaLangNumberFormatException_initWithNSString_(NSString *s) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaLangNumberFormatException *create_JavaLangNumberFormatException_initWithNSString_(NSString *s);

FOUNDATION_EXPORT JavaLangNumberFormatException *JavaLangNumberFormatException_forInputStringWithNSString_(NSString *s);

J2OBJC_TYPE_LITERAL_HEADER(JavaLangNumberFormatException)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaLangNumberFormatException")
