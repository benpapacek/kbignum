//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/util/concurrent/atomic/AtomicReferenceArray.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaUtilConcurrentAtomicAtomicReferenceArray")
#ifdef RESTRICT_JavaUtilConcurrentAtomicAtomicReferenceArray
#define INCLUDE_ALL_JavaUtilConcurrentAtomicAtomicReferenceArray 0
#else
#define INCLUDE_ALL_JavaUtilConcurrentAtomicAtomicReferenceArray 1
#endif
#undef RESTRICT_JavaUtilConcurrentAtomicAtomicReferenceArray

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaUtilConcurrentAtomicAtomicReferenceArray_) && (INCLUDE_ALL_JavaUtilConcurrentAtomicAtomicReferenceArray || defined(INCLUDE_JavaUtilConcurrentAtomicAtomicReferenceArray))
#define JavaUtilConcurrentAtomicAtomicReferenceArray_

#define RESTRICT_JavaIoSerializable 1
#define INCLUDE_JavaIoSerializable 1
#include "java/io/Serializable.h"

@class IOSObjectArray;
@protocol JavaUtilFunctionBinaryOperator;
@protocol JavaUtilFunctionUnaryOperator;

/*!
 @brief An array of object references in which elements may be updated
  atomically.See the <code>java.util.concurrent.atomic</code> package
  specification for description of the properties of atomic
  variables.
 @since 1.5
 @author Doug Lea
 */
@interface JavaUtilConcurrentAtomicAtomicReferenceArray : NSObject < JavaIoSerializable >

#pragma mark Public

/*!
 @brief Creates a new AtomicReferenceArray with the same length as, and
  all elements copied from, the given array.
 @param array the array to copy elements from
 @throw NullPointerExceptionif array is null
 */
- (instancetype __nonnull)initWithNSObjectArray:(IOSObjectArray *)array;

/*!
 @brief Creates a new AtomicReferenceArray of the given length, with all
  elements initially null.
 @param length the length of the array
 */
- (instancetype __nonnull)initWithInt:(jint)length;

/*!
 @brief Atomically updates the element at index <code>i</code> with the
  results of applying the given function to the current and
  given values, returning the updated value.The function should
  be side-effect-free, since it may be re-applied when attempted
  updates fail due to contention among threads.
 The function is
  applied with the current value at index <code>i</code> as its first
  argument, and the given update as the second argument.
 @param i the index
 @param x the update value
 @param accumulatorFunction a side-effect-free function of two arguments
 @return the updated value
 @since 1.8
 */
- (id)accumulateAndGetWithInt:(jint)i
                       withId:(id)x
withJavaUtilFunctionBinaryOperator:(id<JavaUtilFunctionBinaryOperator>)accumulatorFunction;

/*!
 @brief Atomically sets the element at position <code>i</code> to the given
  updated value if the current value <code>==</code> the expected value.
 @param i the index
 @param expect the expected value
 @param update the new value
 @return <code>true</code> if successful. False return indicates that
  the actual value was not equal to the expected value.
 */
- (jboolean)compareAndSetWithInt:(jint)i
                          withId:(id)expect
                          withId:(id)update;

/*!
 @brief Gets the current value at position <code>i</code>.
 @param i the index
 @return the current value
 */
- (id)getWithInt:(jint)i;

/*!
 @brief Atomically updates the element at index <code>i</code> with the
  results of applying the given function to the current and
  given values, returning the previous value.The function should
  be side-effect-free, since it may be re-applied when attempted
  updates fail due to contention among threads.
 The function is
  applied with the current value at index <code>i</code> as its first
  argument, and the given update as the second argument.
 @param i the index
 @param x the update value
 @param accumulatorFunction a side-effect-free function of two arguments
 @return the previous value
 @since 1.8
 */
- (id)getAndAccumulateWithInt:(jint)i
                       withId:(id)x
withJavaUtilFunctionBinaryOperator:(id<JavaUtilFunctionBinaryOperator>)accumulatorFunction;

/*!
 @brief Atomically sets the element at position <code>i</code> to the given
  value and returns the old value.
 @param i the index
 @param newValue the new value
 @return the previous value
 */
- (id)getAndSetWithInt:(jint)i
                withId:(id)newValue;

/*!
 @brief Atomically updates the element at index <code>i</code> with the results
  of applying the given function, returning the previous value.The
  function should be side-effect-free, since it may be re-applied
  when attempted updates fail due to contention among threads.
 @param i the index
 @param updateFunction a side-effect-free function
 @return the previous value
 @since 1.8
 */
- (id)getAndUpdateWithInt:(jint)i
withJavaUtilFunctionUnaryOperator:(id<JavaUtilFunctionUnaryOperator>)updateFunction;

/*!
 @brief Eventually sets the element at position <code>i</code> to the given value.
 @param i the index
 @param newValue the new value
 @since 1.6
 */
- (void)lazySetWithInt:(jint)i
                withId:(id)newValue;

/*!
 @brief Returns the length of the array.
 @return the length of the array
 */
- (jint)length;

/*!
 @brief Sets the element at position <code>i</code> to the given value.
 @param i the index
 @param newValue the new value
 */
- (void)setWithInt:(jint)i
            withId:(id)newValue;

/*!
 @brief Returns the String representation of the current values of array.
 @return the String representation of the current values of array
 */
- (NSString *)description;

/*!
 @brief Atomically updates the element at index <code>i</code> with the results
  of applying the given function, returning the updated value.The
  function should be side-effect-free, since it may be re-applied
  when attempted updates fail due to contention among threads.
 @param i the index
 @param updateFunction a side-effect-free function
 @return the updated value
 @since 1.8
 */
- (id)updateAndGetWithInt:(jint)i
withJavaUtilFunctionUnaryOperator:(id<JavaUtilFunctionUnaryOperator>)updateFunction;

/*!
 @brief Atomically sets the element at position <code>i</code> to the given
  updated value if the current value <code>==</code> the expected value.
 <p><a href="package-summary.html#weakCompareAndSet">May fail
  spuriously and does not provide ordering guarantees</a>, so is
  only rarely an appropriate alternative to <code>compareAndSet</code>.
 @param i the index
 @param expect the expected value
 @param update the new value
 @return <code>true</code> if successful
 */
- (jboolean)weakCompareAndSetWithInt:(jint)i
                              withId:(id)expect
                              withId:(id)update;

#pragma mark Package-Private

// Disallowed inherited constructors, do not use.

- (instancetype __nonnull)init NS_UNAVAILABLE;

@end

J2OBJC_STATIC_INIT(JavaUtilConcurrentAtomicAtomicReferenceArray)

FOUNDATION_EXPORT void JavaUtilConcurrentAtomicAtomicReferenceArray_initWithInt_(JavaUtilConcurrentAtomicAtomicReferenceArray *self, jint length);

FOUNDATION_EXPORT JavaUtilConcurrentAtomicAtomicReferenceArray *new_JavaUtilConcurrentAtomicAtomicReferenceArray_initWithInt_(jint length) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilConcurrentAtomicAtomicReferenceArray *create_JavaUtilConcurrentAtomicAtomicReferenceArray_initWithInt_(jint length);

FOUNDATION_EXPORT void JavaUtilConcurrentAtomicAtomicReferenceArray_initWithNSObjectArray_(JavaUtilConcurrentAtomicAtomicReferenceArray *self, IOSObjectArray *array);

FOUNDATION_EXPORT JavaUtilConcurrentAtomicAtomicReferenceArray *new_JavaUtilConcurrentAtomicAtomicReferenceArray_initWithNSObjectArray_(IOSObjectArray *array) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilConcurrentAtomicAtomicReferenceArray *create_JavaUtilConcurrentAtomicAtomicReferenceArray_initWithNSObjectArray_(IOSObjectArray *array);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilConcurrentAtomicAtomicReferenceArray)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaUtilConcurrentAtomicAtomicReferenceArray")