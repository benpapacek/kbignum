//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/lang/NegativeArraySizeException.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaLangNegativeArraySizeException")
#ifdef RESTRICT_JavaLangNegativeArraySizeException
#define INCLUDE_ALL_JavaLangNegativeArraySizeException 0
#else
#define INCLUDE_ALL_JavaLangNegativeArraySizeException 1
#endif
#undef RESTRICT_JavaLangNegativeArraySizeException

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaLangNegativeArraySizeException_) && (INCLUDE_ALL_JavaLangNegativeArraySizeException || defined(INCLUDE_JavaLangNegativeArraySizeException))
#define JavaLangNegativeArraySizeException_

#define RESTRICT_JavaLangRuntimeException 1
#define INCLUDE_JavaLangRuntimeException 1
#include "java/lang/RuntimeException.h"

@class JavaLangThrowable;

/*!
 @brief Thrown if an application tries to create an array with negative size.
 @author unascribed
 @since JDK1.0
 */
@interface JavaLangNegativeArraySizeException : JavaLangRuntimeException

#pragma mark Public

/*!
 @brief Constructs a <code>NegativeArraySizeException</code> with no
  detail message.
 */
- (instancetype __nonnull)init;

/*!
 @brief Constructs a <code>NegativeArraySizeException</code> with the
  specified detail message.
 @param s the detail message.
 */
- (instancetype __nonnull)initWithNSString:(NSString *)s;

// Disallowed inherited constructors, do not use.

- (instancetype __nonnull)initWithJavaLangThrowable:(JavaLangThrowable *)arg0 NS_UNAVAILABLE;

- (instancetype __nonnull)initWithNSString:(NSString *)arg0
                     withJavaLangThrowable:(JavaLangThrowable *)arg1 NS_UNAVAILABLE;

- (instancetype __nonnull)initWithNSString:(NSString *)arg0
                     withJavaLangThrowable:(JavaLangThrowable *)arg1
                               withBoolean:(jboolean)arg2
                               withBoolean:(jboolean)arg3 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaLangNegativeArraySizeException)

FOUNDATION_EXPORT void JavaLangNegativeArraySizeException_init(JavaLangNegativeArraySizeException *self);

FOUNDATION_EXPORT JavaLangNegativeArraySizeException *new_JavaLangNegativeArraySizeException_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaLangNegativeArraySizeException *create_JavaLangNegativeArraySizeException_init(void);

FOUNDATION_EXPORT void JavaLangNegativeArraySizeException_initWithNSString_(JavaLangNegativeArraySizeException *self, NSString *s);

FOUNDATION_EXPORT JavaLangNegativeArraySizeException *new_JavaLangNegativeArraySizeException_initWithNSString_(NSString *s) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaLangNegativeArraySizeException *create_JavaLangNegativeArraySizeException_initWithNSString_(NSString *s);

J2OBJC_TYPE_LITERAL_HEADER(JavaLangNegativeArraySizeException)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaLangNegativeArraySizeException")
