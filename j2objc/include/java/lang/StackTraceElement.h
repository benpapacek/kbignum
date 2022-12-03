//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: Classes/java/lang/StackTraceElement.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaLangStackTraceElement")
#ifdef RESTRICT_JavaLangStackTraceElement
#define INCLUDE_ALL_JavaLangStackTraceElement 0
#else
#define INCLUDE_ALL_JavaLangStackTraceElement 1
#endif
#undef RESTRICT_JavaLangStackTraceElement

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaLangStackTraceElement_) && (INCLUDE_ALL_JavaLangStackTraceElement || defined(INCLUDE_JavaLangStackTraceElement))
#define JavaLangStackTraceElement_

#define RESTRICT_JavaIoSerializable 1
#define INCLUDE_JavaIoSerializable 1
#include "java/io/Serializable.h"

/*!
 @brief Simple iOS version of java.lang.StackTraceElement.
 @author Pankaj Kakkar
 */
@interface JavaLangStackTraceElement : NSObject < JavaIoSerializable >

#pragma mark Public

- (instancetype __nonnull)initWithNSString:(NSString *)className_
                              withNSString:(NSString *)methodName
                              withNSString:(NSString *)fileName
                                   withInt:(jint)lineNumber;

/*!
 @brief Returns true if the specified object is another 
 <code>StackTraceElement</code> instance representing the same execution
  point as this instance.Two stack trace elements <code>a</code> and 
 <code>b</code> are equal if and only if: 
 @code

      equals(a.getFileName(), b.getFileName()) &&
      a.getLineNumber() == b.getLineNumber()) &&
      equals(a.getClassName(), b.getClassName()) &&
      equals(a.getMethodName(), b.getMethodName()) 
  
@endcode
  where <code>equals</code> has the semantics of <code>Objects.equals</code>
 .
 @param obj the object to be compared with this stack trace element.
 @return true if the specified object is another
          <code>StackTraceElement</code> instance representing the same
          execution point as this instance.
 */
- (jboolean)isEqual:(id)obj;

- (NSString *)getClassName;

- (NSString *)getFileName;

- (jint)getLineNumber;

- (NSString *)getMethodName;

/*!
 @brief Returns a hash code value for this stack trace element.
 */
- (NSUInteger)hash;

- (NSString *)description;

#pragma mark Package-Private

- (instancetype __nonnull)initWithLong:(jlong)address;

// Disallowed inherited constructors, do not use.

- (instancetype __nonnull)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaLangStackTraceElement)

inline NSString *JavaLangStackTraceElement_get_UNKNOWN(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *JavaLangStackTraceElement_UNKNOWN;
J2OBJC_STATIC_FIELD_OBJ_FINAL(JavaLangStackTraceElement, UNKNOWN, NSString *)

inline NSString *JavaLangStackTraceElement_get_STRIPPED(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *JavaLangStackTraceElement_STRIPPED;
J2OBJC_STATIC_FIELD_OBJ_FINAL(JavaLangStackTraceElement, STRIPPED, NSString *)

FOUNDATION_EXPORT void JavaLangStackTraceElement_initWithNSString_withNSString_withNSString_withInt_(JavaLangStackTraceElement *self, NSString *className_, NSString *methodName, NSString *fileName, jint lineNumber);

FOUNDATION_EXPORT JavaLangStackTraceElement *new_JavaLangStackTraceElement_initWithNSString_withNSString_withNSString_withInt_(NSString *className_, NSString *methodName, NSString *fileName, jint lineNumber) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaLangStackTraceElement *create_JavaLangStackTraceElement_initWithNSString_withNSString_withNSString_withInt_(NSString *className_, NSString *methodName, NSString *fileName, jint lineNumber);

FOUNDATION_EXPORT void JavaLangStackTraceElement_initWithLong_(JavaLangStackTraceElement *self, jlong address);

FOUNDATION_EXPORT JavaLangStackTraceElement *new_JavaLangStackTraceElement_initWithLong_(jlong address) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaLangStackTraceElement *create_JavaLangStackTraceElement_initWithLong_(jlong address);

J2OBJC_TYPE_LITERAL_HEADER(JavaLangStackTraceElement)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaLangStackTraceElement")
