//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/util/function/DoubleToIntFunction.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaUtilFunctionDoubleToIntFunction")
#ifdef RESTRICT_JavaUtilFunctionDoubleToIntFunction
#define INCLUDE_ALL_JavaUtilFunctionDoubleToIntFunction 0
#else
#define INCLUDE_ALL_JavaUtilFunctionDoubleToIntFunction 1
#endif
#undef RESTRICT_JavaUtilFunctionDoubleToIntFunction

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaUtilFunctionDoubleToIntFunction_) && (INCLUDE_ALL_JavaUtilFunctionDoubleToIntFunction || defined(INCLUDE_JavaUtilFunctionDoubleToIntFunction))
#define JavaUtilFunctionDoubleToIntFunction_

/*!
 @brief Represents a function that accepts a double-valued argument and produces an
  int-valued result.This is the <code>double</code>-to-<code>int</code> primitive
  specialization for <code>Function</code>.
 <p>This is a <a href="package-summary.html">functional interface</a>
  whose functional method is <code>applyAsInt(double)</code>.
 - seealso: Function
 @since 1.8
 */
@protocol JavaUtilFunctionDoubleToIntFunction < JavaObject >

/*!
 @brief Applies this function to the given argument.
 @param value the function argument
 @return the function result
 */
- (jint)applyAsIntWithDouble:(jdouble)value;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilFunctionDoubleToIntFunction)

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilFunctionDoubleToIntFunction)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaUtilFunctionDoubleToIntFunction")
