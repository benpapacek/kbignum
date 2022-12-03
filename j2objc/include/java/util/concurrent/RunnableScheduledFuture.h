//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/util/concurrent/RunnableScheduledFuture.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaUtilConcurrentRunnableScheduledFuture")
#ifdef RESTRICT_JavaUtilConcurrentRunnableScheduledFuture
#define INCLUDE_ALL_JavaUtilConcurrentRunnableScheduledFuture 0
#else
#define INCLUDE_ALL_JavaUtilConcurrentRunnableScheduledFuture 1
#endif
#undef RESTRICT_JavaUtilConcurrentRunnableScheduledFuture

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaUtilConcurrentRunnableScheduledFuture_) && (INCLUDE_ALL_JavaUtilConcurrentRunnableScheduledFuture || defined(INCLUDE_JavaUtilConcurrentRunnableScheduledFuture))
#define JavaUtilConcurrentRunnableScheduledFuture_

#define RESTRICT_JavaUtilConcurrentRunnableFuture 1
#define INCLUDE_JavaUtilConcurrentRunnableFuture 1
#include "java/util/concurrent/RunnableFuture.h"

#define RESTRICT_JavaUtilConcurrentScheduledFuture 1
#define INCLUDE_JavaUtilConcurrentScheduledFuture 1
#include "java/util/concurrent/ScheduledFuture.h"

/*!
 @brief A <code>ScheduledFuture</code> that is <code>Runnable</code>.Successful
  execution of the <code>run</code> method causes completion of the 
 <code>Future</code> and allows access to its results.
 - seealso: FutureTask
 - seealso: Executor
 @since 1.6
 @author Doug Lea
 */
@protocol JavaUtilConcurrentRunnableScheduledFuture < JavaUtilConcurrentRunnableFuture, JavaUtilConcurrentScheduledFuture, JavaObject >

/*!
 @brief Returns <code>true</code> if this task is periodic.A periodic task may
  re-run according to some schedule.
 A non-periodic task can be
  run only once.
 @return <code>true</code> if this task is periodic
 */
- (jboolean)isPeriodic;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilConcurrentRunnableScheduledFuture)

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilConcurrentRunnableScheduledFuture)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaUtilConcurrentRunnableScheduledFuture")
