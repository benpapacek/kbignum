//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/util/IllformedLocaleException.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaUtilIllformedLocaleException")
#ifdef RESTRICT_JavaUtilIllformedLocaleException
#define INCLUDE_ALL_JavaUtilIllformedLocaleException 0
#else
#define INCLUDE_ALL_JavaUtilIllformedLocaleException 1
#endif
#undef RESTRICT_JavaUtilIllformedLocaleException

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaUtilIllformedLocaleException_) && (INCLUDE_ALL_JavaUtilIllformedLocaleException || defined(INCLUDE_JavaUtilIllformedLocaleException))
#define JavaUtilIllformedLocaleException_

#define RESTRICT_JavaLangRuntimeException 1
#define INCLUDE_JavaLangRuntimeException 1
#include "java/lang/RuntimeException.h"

@class JavaLangThrowable;

/*!
 @brief Thrown by methods in <code>Locale</code> and <code>Locale.Builder</code> to
  indicate that an argument is not a well-formed BCP 47 tag.
 - seealso: Locale
 @since 1.7
 */
@interface JavaUtilIllformedLocaleException : JavaLangRuntimeException

#pragma mark Public

/*!
 @brief Constructs a new <code>IllformedLocaleException</code> with no
  detail message and -1 as the error index.
 */
- (instancetype __nonnull)init;

/*!
 @brief Constructs a new <code>IllformedLocaleException</code> with the
  given message and -1 as the error index.
 @param message the message
 */
- (instancetype __nonnull)initWithNSString:(NSString *)message;

/*!
 @brief Constructs a new <code>IllformedLocaleException</code> with the
  given message and the error index.The error index is the approximate
  offset from the start of the ill-formed value to the point where the
  parse first detected an error.
 A negative error index value indicates
  either the error index is not applicable or unknown.
 @param message the message
 @param errorIndex the index
 */
- (instancetype __nonnull)initWithNSString:(NSString *)message
                                   withInt:(jint)errorIndex;

/*!
 @brief Returns the index where the error was found.A negative value indicates
  either the error index is not applicable or unknown.
 @return the error index
 */
- (jint)getErrorIndex;

// Disallowed inherited constructors, do not use.

- (instancetype __nonnull)initWithJavaLangThrowable:(JavaLangThrowable *)arg0 NS_UNAVAILABLE;

- (instancetype __nonnull)initWithNSString:(NSString *)arg0
                     withJavaLangThrowable:(JavaLangThrowable *)arg1 NS_UNAVAILABLE;

- (instancetype __nonnull)initWithNSString:(NSString *)arg0
                     withJavaLangThrowable:(JavaLangThrowable *)arg1
                               withBoolean:(jboolean)arg2
                               withBoolean:(jboolean)arg3 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilIllformedLocaleException)

FOUNDATION_EXPORT void JavaUtilIllformedLocaleException_init(JavaUtilIllformedLocaleException *self);

FOUNDATION_EXPORT JavaUtilIllformedLocaleException *new_JavaUtilIllformedLocaleException_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilIllformedLocaleException *create_JavaUtilIllformedLocaleException_init(void);

FOUNDATION_EXPORT void JavaUtilIllformedLocaleException_initWithNSString_(JavaUtilIllformedLocaleException *self, NSString *message);

FOUNDATION_EXPORT JavaUtilIllformedLocaleException *new_JavaUtilIllformedLocaleException_initWithNSString_(NSString *message) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilIllformedLocaleException *create_JavaUtilIllformedLocaleException_initWithNSString_(NSString *message);

FOUNDATION_EXPORT void JavaUtilIllformedLocaleException_initWithNSString_withInt_(JavaUtilIllformedLocaleException *self, NSString *message, jint errorIndex);

FOUNDATION_EXPORT JavaUtilIllformedLocaleException *new_JavaUtilIllformedLocaleException_initWithNSString_withInt_(NSString *message, jint errorIndex) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilIllformedLocaleException *create_JavaUtilIllformedLocaleException_initWithNSString_withInt_(NSString *message, jint errorIndex);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilIllformedLocaleException)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaUtilIllformedLocaleException")
