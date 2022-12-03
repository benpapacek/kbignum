//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/lang/ArrayStoreException.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaLangArrayStoreException")
#ifdef RESTRICT_JavaLangArrayStoreException
#define INCLUDE_ALL_JavaLangArrayStoreException 0
#else
#define INCLUDE_ALL_JavaLangArrayStoreException 1
#endif
#undef RESTRICT_JavaLangArrayStoreException

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaLangArrayStoreException_) && (INCLUDE_ALL_JavaLangArrayStoreException || defined(INCLUDE_JavaLangArrayStoreException))
#define JavaLangArrayStoreException_

#define RESTRICT_JavaLangRuntimeException 1
#define INCLUDE_JavaLangRuntimeException 1
#include "java/lang/RuntimeException.h"

@class JavaLangThrowable;

/*!
 @brief Thrown to indicate that an attempt has been made to store the
  wrong type of object into an array of objects.For example, the
  following code generates an <code>ArrayStoreException</code>:
  <blockquote>@code

      Object x[] = new String[3];
      x[0] = new Integer(0); 
  
@endcode</blockquote>
 @author unascribed
 @since JDK1.0
 */
@interface JavaLangArrayStoreException : JavaLangRuntimeException

#pragma mark Public

/*!
 @brief Constructs an <code>ArrayStoreException</code> with no detail message.
 */
- (instancetype __nonnull)init;

/*!
 @brief Constructs an <code>ArrayStoreException</code> with the specified
  detail message.
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

J2OBJC_EMPTY_STATIC_INIT(JavaLangArrayStoreException)

FOUNDATION_EXPORT void JavaLangArrayStoreException_init(JavaLangArrayStoreException *self);

FOUNDATION_EXPORT JavaLangArrayStoreException *new_JavaLangArrayStoreException_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaLangArrayStoreException *create_JavaLangArrayStoreException_init(void);

FOUNDATION_EXPORT void JavaLangArrayStoreException_initWithNSString_(JavaLangArrayStoreException *self, NSString *s);

FOUNDATION_EXPORT JavaLangArrayStoreException *new_JavaLangArrayStoreException_initWithNSString_(NSString *s) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaLangArrayStoreException *create_JavaLangArrayStoreException_initWithNSString_(NSString *s);

J2OBJC_TYPE_LITERAL_HEADER(JavaLangArrayStoreException)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaLangArrayStoreException")
