//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/util/MissingFormatArgumentException.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaUtilMissingFormatArgumentException")
#ifdef RESTRICT_JavaUtilMissingFormatArgumentException
#define INCLUDE_ALL_JavaUtilMissingFormatArgumentException 0
#else
#define INCLUDE_ALL_JavaUtilMissingFormatArgumentException 1
#endif
#undef RESTRICT_JavaUtilMissingFormatArgumentException

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaUtilMissingFormatArgumentException_) && (INCLUDE_ALL_JavaUtilMissingFormatArgumentException || defined(INCLUDE_JavaUtilMissingFormatArgumentException))
#define JavaUtilMissingFormatArgumentException_

#define RESTRICT_JavaUtilIllegalFormatException 1
#define INCLUDE_JavaUtilIllegalFormatException 1
#include "java/util/IllegalFormatException.h"

/*!
 @brief Unchecked exception thrown when there is a format specifier which does not
  have a corresponding argument or if an argument index refers to an argument
  that does not exist.
 <p> Unless otherwise specified, passing a <tt>null</tt> argument to any
  method or constructor in this class will cause a <code>NullPointerException</code>
  to be thrown.
 @since 1.5
 */
@interface JavaUtilMissingFormatArgumentException : JavaUtilIllegalFormatException

#pragma mark Public

/*!
 @brief Constructs an instance of this class with the unmatched format
  specifier.
 @param s Format specifier which does not have a corresponding argument
 */
- (instancetype __nonnull)initWithNSString:(NSString *)s;

/*!
 @brief Returns the unmatched format specifier.
 @return The unmatched format specifier
 */
- (NSString *)getFormatSpecifier;

- (NSString *)getMessage;

// Disallowed inherited constructors, do not use.

- (instancetype __nonnull)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilMissingFormatArgumentException)

FOUNDATION_EXPORT void JavaUtilMissingFormatArgumentException_initWithNSString_(JavaUtilMissingFormatArgumentException *self, NSString *s);

FOUNDATION_EXPORT JavaUtilMissingFormatArgumentException *new_JavaUtilMissingFormatArgumentException_initWithNSString_(NSString *s) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilMissingFormatArgumentException *create_JavaUtilMissingFormatArgumentException_initWithNSString_(NSString *s);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilMissingFormatArgumentException)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaUtilMissingFormatArgumentException")
