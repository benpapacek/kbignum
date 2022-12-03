//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/lambda/java/java/lang/invoke/LambdaConversionException.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaLangInvokeLambdaConversionException")
#ifdef RESTRICT_JavaLangInvokeLambdaConversionException
#define INCLUDE_ALL_JavaLangInvokeLambdaConversionException 0
#else
#define INCLUDE_ALL_JavaLangInvokeLambdaConversionException 1
#endif
#undef RESTRICT_JavaLangInvokeLambdaConversionException

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaLangInvokeLambdaConversionException_) && (INCLUDE_ALL_JavaLangInvokeLambdaConversionException || defined(INCLUDE_JavaLangInvokeLambdaConversionException))
#define JavaLangInvokeLambdaConversionException_

#define RESTRICT_JavaLangException 1
#define INCLUDE_JavaLangException 1
#include "java/lang/Exception.h"

@class JavaLangThrowable;

/*!
 @brief LambdaConversionException
 */
@interface JavaLangInvokeLambdaConversionException : JavaLangException

#pragma mark Public

/*!
 @brief Constructs a <code>LambdaConversionException</code>.
 */
- (instancetype __nonnull)init;

/*!
 @brief Constructs a <code>LambdaConversionException</code> with a message.
 @param message the detail message
 */
- (instancetype __nonnull)initWithNSString:(NSString *)message;

/*!
 @brief Constructs a <code>LambdaConversionException</code> with a message and cause.
 @param message the detail message
 @param cause the cause
 */
- (instancetype __nonnull)initWithNSString:(NSString *)message
                     withJavaLangThrowable:(JavaLangThrowable *)cause;

/*!
 @brief Constructs a <code>LambdaConversionException</code> with a message,
  cause, and other settings.
 @param message the detail message
 @param cause the cause
 @param enableSuppression whether or not suppressed exceptions are enabled
 @param writableStackTrace whether or not the stack trace is writable
 */
- (instancetype __nonnull)initWithNSString:(NSString *)message
                     withJavaLangThrowable:(JavaLangThrowable *)cause
                               withBoolean:(jboolean)enableSuppression
                               withBoolean:(jboolean)writableStackTrace;

/*!
 @brief Constructs a <code>LambdaConversionException</code> with a cause.
 @param cause the cause
 */
- (instancetype __nonnull)initWithJavaLangThrowable:(JavaLangThrowable *)cause;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaLangInvokeLambdaConversionException)

FOUNDATION_EXPORT void JavaLangInvokeLambdaConversionException_init(JavaLangInvokeLambdaConversionException *self);

FOUNDATION_EXPORT JavaLangInvokeLambdaConversionException *new_JavaLangInvokeLambdaConversionException_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaLangInvokeLambdaConversionException *create_JavaLangInvokeLambdaConversionException_init(void);

FOUNDATION_EXPORT void JavaLangInvokeLambdaConversionException_initWithNSString_(JavaLangInvokeLambdaConversionException *self, NSString *message);

FOUNDATION_EXPORT JavaLangInvokeLambdaConversionException *new_JavaLangInvokeLambdaConversionException_initWithNSString_(NSString *message) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaLangInvokeLambdaConversionException *create_JavaLangInvokeLambdaConversionException_initWithNSString_(NSString *message);

FOUNDATION_EXPORT void JavaLangInvokeLambdaConversionException_initWithNSString_withJavaLangThrowable_(JavaLangInvokeLambdaConversionException *self, NSString *message, JavaLangThrowable *cause);

FOUNDATION_EXPORT JavaLangInvokeLambdaConversionException *new_JavaLangInvokeLambdaConversionException_initWithNSString_withJavaLangThrowable_(NSString *message, JavaLangThrowable *cause) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaLangInvokeLambdaConversionException *create_JavaLangInvokeLambdaConversionException_initWithNSString_withJavaLangThrowable_(NSString *message, JavaLangThrowable *cause);

FOUNDATION_EXPORT void JavaLangInvokeLambdaConversionException_initWithJavaLangThrowable_(JavaLangInvokeLambdaConversionException *self, JavaLangThrowable *cause);

FOUNDATION_EXPORT JavaLangInvokeLambdaConversionException *new_JavaLangInvokeLambdaConversionException_initWithJavaLangThrowable_(JavaLangThrowable *cause) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaLangInvokeLambdaConversionException *create_JavaLangInvokeLambdaConversionException_initWithJavaLangThrowable_(JavaLangThrowable *cause);

FOUNDATION_EXPORT void JavaLangInvokeLambdaConversionException_initWithNSString_withJavaLangThrowable_withBoolean_withBoolean_(JavaLangInvokeLambdaConversionException *self, NSString *message, JavaLangThrowable *cause, jboolean enableSuppression, jboolean writableStackTrace);

FOUNDATION_EXPORT JavaLangInvokeLambdaConversionException *new_JavaLangInvokeLambdaConversionException_initWithNSString_withJavaLangThrowable_withBoolean_withBoolean_(NSString *message, JavaLangThrowable *cause, jboolean enableSuppression, jboolean writableStackTrace) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaLangInvokeLambdaConversionException *create_JavaLangInvokeLambdaConversionException_initWithNSString_withJavaLangThrowable_withBoolean_withBoolean_(NSString *message, JavaLangThrowable *cause, jboolean enableSuppression, jboolean writableStackTrace);

J2OBJC_TYPE_LITERAL_HEADER(JavaLangInvokeLambdaConversionException)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaLangInvokeLambdaConversionException")
