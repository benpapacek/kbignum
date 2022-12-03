//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/lang/VirtualMachineError.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaLangVirtualMachineError")
#ifdef RESTRICT_JavaLangVirtualMachineError
#define INCLUDE_ALL_JavaLangVirtualMachineError 0
#else
#define INCLUDE_ALL_JavaLangVirtualMachineError 1
#endif
#undef RESTRICT_JavaLangVirtualMachineError

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaLangVirtualMachineError_) && (INCLUDE_ALL_JavaLangVirtualMachineError || defined(INCLUDE_JavaLangVirtualMachineError))
#define JavaLangVirtualMachineError_

#define RESTRICT_JavaLangError 1
#define INCLUDE_JavaLangError 1
#include "java/lang/Error.h"

@class JavaLangThrowable;

/*!
 @brief Thrown to indicate that the Java Virtual Machine is broken or has
  run out of resources necessary for it to continue operating.
 @author Frank Yellin
 @since JDK1.0
 */
@interface JavaLangVirtualMachineError : JavaLangError

#pragma mark Public

/*!
 @brief Constructs a <code>VirtualMachineError</code> with no detail message.
 */
- (instancetype __nonnull)init;

/*!
 @brief Constructs a <code>VirtualMachineError</code> with the specified
  detail message.
 @param message the detail message.
 */
- (instancetype __nonnull)initWithNSString:(NSString *)message;

/*!
 @brief Constructs a <code>VirtualMachineError</code> with the specified
  detail message and cause.
 <p>Note that the detail message
  associated with <code>cause</code> is <i>not</i> automatically
  incorporated in this error's detail message.
 @param message the detail message (which is saved for later retrieval          by the 
 <code>getMessage()</code>  method).
 @param cause the cause (which is saved for later retrieval by the          
 <code>getCause()</code>  method).  (A <code>null</code>  value is          permitted, and indicates that the cause is nonexistent or
           unknown.)
 @since 1.8
 */
- (instancetype __nonnull)initWithNSString:(NSString *)message
                     withJavaLangThrowable:(JavaLangThrowable *)cause;

/*!
 @brief Constructs an a <code>VirtualMachineError</code> with the specified
  cause and a detail message of <code>(cause==null ?
 null :
  cause.toString())</code>
  (which typically contains the class and
  detail message of <code>cause</code>).
 @param cause the cause (which is saved for later retrieval by the          
 <code>getCause()</code>  method).  (A <code>null</code>  value is          permitted, and indicates that the cause is nonexistent or
           unknown.)
 @since 1.8
 */
- (instancetype __nonnull)initWithJavaLangThrowable:(JavaLangThrowable *)cause;

// Disallowed inherited constructors, do not use.

- (instancetype __nonnull)initWithNSString:(NSString *)arg0
                     withJavaLangThrowable:(JavaLangThrowable *)arg1
                               withBoolean:(jboolean)arg2
                               withBoolean:(jboolean)arg3 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaLangVirtualMachineError)

FOUNDATION_EXPORT void JavaLangVirtualMachineError_init(JavaLangVirtualMachineError *self);

FOUNDATION_EXPORT void JavaLangVirtualMachineError_initWithNSString_(JavaLangVirtualMachineError *self, NSString *message);

FOUNDATION_EXPORT void JavaLangVirtualMachineError_initWithNSString_withJavaLangThrowable_(JavaLangVirtualMachineError *self, NSString *message, JavaLangThrowable *cause);

FOUNDATION_EXPORT void JavaLangVirtualMachineError_initWithJavaLangThrowable_(JavaLangVirtualMachineError *self, JavaLangThrowable *cause);

J2OBJC_TYPE_LITERAL_HEADER(JavaLangVirtualMachineError)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaLangVirtualMachineError")
