//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/util/concurrent/Flow.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaUtilConcurrentFlow")
#ifdef RESTRICT_JavaUtilConcurrentFlow
#define INCLUDE_ALL_JavaUtilConcurrentFlow 0
#else
#define INCLUDE_ALL_JavaUtilConcurrentFlow 1
#endif
#undef RESTRICT_JavaUtilConcurrentFlow
#ifdef INCLUDE_JavaUtilConcurrentFlow_Processor
#define INCLUDE_JavaUtilConcurrentFlow_Subscriber 1
#define INCLUDE_JavaUtilConcurrentFlow_Publisher 1
#endif

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaUtilConcurrentFlow_) && (INCLUDE_ALL_JavaUtilConcurrentFlow || defined(INCLUDE_JavaUtilConcurrentFlow))
#define JavaUtilConcurrentFlow_

/*!
 @brief Interrelated interfaces and static methods for establishing
  flow-controlled components in which <code>Publishers</code>
  produce items consumed by one or more <code>Subscribers</code>
 , each managed by a <code>Subscription</code>
 .
 <p>These interfaces correspond to the <a href="http://www.reactive-streams.org/">
  reactive-streams</a>
  specification.  They apply in both concurrent and distributed
  asynchronous settings: All (seven) methods are defined in <code>void</code>
  "one-way" message style. Communication relies on a simple form
  of flow control (method <code>Subscription.request</code>) that can be
  used to avoid resource management problems that may otherwise occur
  in "push" based systems. 
 <p><b>Examples.</b> A <code>Publisher</code> usually defines its own 
 <code>Subscription</code> implementation; constructing one in method 
 <code>subscribe</code> and issuing it to the calling <code>Subscriber</code>
 . It publishes items to the subscriber asynchronously,
  normally using an <code>Executor</code>.  For example, here is a very
  simple publisher that only issues (when requested) a single <code>TRUE</code>
  item to a single subscriber.  Because the subscriber receives
  only a single item, this class does not use buffering and ordering
  control required in most implementations. 
 @code
  class OneShotPublisher implements Publisher<Boolean> {
    private final ExecutorService executor = ForkJoinPool.commonPool(); // daemon-based
    private boolean subscribed; // true after first subscribe
    public synchronized void subscribe(Subscriber<? super Boolean> subscriber) {
      if (subscribed)
        subscriber.onError(new IllegalStateException()); // only one allowed
      else {
        subscribed = true;
        subscriber.onSubscribe(new OneShotSubscription(subscriber, executor));
      }    }
    static class OneShotSubscription implements Subscription {
      private final Subscriber<? super Boolean> subscriber;
      private final ExecutorService executor;
      private Future<?> future; // to allow cancellation
      private boolean completed;
      OneShotSubscription(Subscriber<? super Boolean> subscriber,
                          ExecutorService executor) {
        this.subscriber = subscriber;
        this.executor = executor;
      }
      public synchronized void request(long n) {
        if (n != 0 && !completed) {
          completed = true;
          if (n < 0) {
            IllegalArgumentException ex = new IllegalArgumentException();
            executor.execute(() -> subscriber.onError(ex));
          } else {
            future = executor.submit(() -> {
              subscriber.onNext(Boolean.TRUE);
              subscriber.onComplete();
            });          }          }          }
      public synchronized void cancel() {
        completed = true;
        if (future != null) future.cancel(false);
      }    }    }
 
@endcode
  
 <p>A <code>Subscriber</code> arranges that items be requested and
  processed.  Items (invocations of <code>Subscriber.onNext</code>) are
  not issued unless requested, but multiple items may be requested.
  Many Subscriber implementations can arrange this in the style of
  the following example, where a buffer size of 1 single-steps, and
  larger sizes usually allow for more efficient overlapped processing
  with less communication; for example with a value of 64, this keeps
  total outstanding requests between 32 and 64.
  Because Subscriber method invocations for a given <code>Subscription</code>
  are strictly ordered, there is no need for these
  methods to use locks or volatiles unless a Subscriber maintains
  multiple Subscriptions (in which case it is better to instead
  define multiple Subscribers, each with its own Subscription). 
 @code
  class SampleSubscriber<T> implements Subscriber<T> {
    final Consumer<? super T> consumer;
    Subscription subscription;
    final long bufferSize;
    long count;
    SampleSubscriber(long bufferSize, Consumer<? super T> consumer) {
      this.bufferSize = bufferSize;
      this.consumer = consumer;
    }
    public void onSubscribe(Subscription subscription) {
      long initialRequestSize = bufferSize;
      count = bufferSize - bufferSize / 2; // re-request when half consumed
      (this.subscription = subscription).request(initialRequestSize);
    }
    public void onNext(T item) {
      if (--count <= 0)
        subscription.request(count = bufferSize - bufferSize / 2);
      consumer.accept(item);
    }
    public void onError(Throwable ex) { ex.printStackTrace(); }
    public void onComplete() {}
  }
 
@endcode
  
 <p>The default value of <code>defaultBufferSize</code> may provide a
  useful starting point for choosing request sizes and capacities in
  Flow components based on expected rates, resources, and usages.
  Or, when flow control is never needed, a subscriber may initially
  request an effectively unbounded number of items, as in: 
 @code
  class UnboundedSubscriber<T> implements Subscriber<T> {
    public void onSubscribe(Subscription subscription) {
      subscription.request(Long.MAX_VALUE); // effectively unbounded
    }
    public void onNext(T item) { use(item); }
    public void onError(Throwable ex) { ex.printStackTrace(); }
    public void onComplete() {}
    void use(T item) { ... } }
 
@endcode
 @author Doug Lea
 @since 9
 */
@interface JavaUtilConcurrentFlow : NSObject

#pragma mark Public

/*!
 @brief Returns a default value for Publisher or Subscriber buffering,
  that may be used in the absence of other constraints.
 @return the buffer size value
 */
+ (jint)defaultBufferSize;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilConcurrentFlow)

inline jint JavaUtilConcurrentFlow_get_DEFAULT_BUFFER_SIZE(void);
#define JavaUtilConcurrentFlow_DEFAULT_BUFFER_SIZE 256
J2OBJC_STATIC_FIELD_CONSTANT(JavaUtilConcurrentFlow, DEFAULT_BUFFER_SIZE, jint)

FOUNDATION_EXPORT jint JavaUtilConcurrentFlow_defaultBufferSize(void);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilConcurrentFlow)

#endif

#if !defined (JavaUtilConcurrentFlow_Publisher_) && (INCLUDE_ALL_JavaUtilConcurrentFlow || defined(INCLUDE_JavaUtilConcurrentFlow_Publisher))
#define JavaUtilConcurrentFlow_Publisher_

@protocol JavaUtilConcurrentFlow_Subscriber;

/*!
 @brief A producer of items (and related control messages) received by
  Subscribers.Each current <code>Subscriber</code> receives the same
  items (via method <code>onNext</code>) in the same order, unless
  drops or errors are encountered.
 If a Publisher encounters an
  error that does not allow items to be issued to a Subscriber,
  that Subscriber receives <code>onError</code>, and then receives no
  further messages.  Otherwise, when it is known that no further
  messages will be issued to it, a subscriber receives <code>onComplete</code>
 .  Publishers ensure that Subscriber method
  invocations for each subscription are strictly ordered in <a href="package-summary.html#MemoryVisibility">
 <i>happens-before</i></a>
  order. 
 <p>Publishers may vary in policy about whether drops (failures
  to issue an item because of resource limitations) are treated
  as unrecoverable errors.  Publishers may also vary about
  whether Subscribers receive items that were produced or
  available before they subscribed.
 */
@protocol JavaUtilConcurrentFlow_Publisher < JavaObject >

/*!
 @brief Adds the given Subscriber if possible.If already
  subscribed, or the attempt to subscribe fails due to policy
  violations or errors, the Subscriber's <code>onError</code>
  method is invoked with an <code>IllegalStateException</code>.
 Otherwise, the Subscriber's <code>onSubscribe</code> method is
  invoked with a new <code>Subscription</code>.  Subscribers may
  enable receiving items by invoking the <code>request</code>
  method of this Subscription, and may unsubscribe by
  invoking its <code>cancel</code> method.
 @param subscriber the subscriber
 @throw NullPointerExceptionif subscriber is null
 */
- (void)subscribeWithJavaUtilConcurrentFlow_Subscriber:(id<JavaUtilConcurrentFlow_Subscriber>)subscriber;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilConcurrentFlow_Publisher)

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilConcurrentFlow_Publisher)

#endif

#if !defined (JavaUtilConcurrentFlow_Subscriber_) && (INCLUDE_ALL_JavaUtilConcurrentFlow || defined(INCLUDE_JavaUtilConcurrentFlow_Subscriber))
#define JavaUtilConcurrentFlow_Subscriber_

@class JavaLangThrowable;
@protocol JavaUtilConcurrentFlow_Subscription;

/*!
 @brief A receiver of messages.The methods in this interface are
  invoked in strict sequential order for each <code>Subscription</code>
 .
 */
@protocol JavaUtilConcurrentFlow_Subscriber < JavaObject >

/*!
 @brief Method invoked prior to invoking any other Subscriber
  methods for the given Subscription.If this method throws
  an exception, resulting behavior is not guaranteed, but may
  cause the Subscription not to be established or to be cancelled.
 <p>Typically, implementations of this method invoke <code>subscription.request</code>
  to enable receiving items.
 @param subscription a new subscription
 */
- (void)onSubscribeWithJavaUtilConcurrentFlow_Subscription:(id<JavaUtilConcurrentFlow_Subscription>)subscription;

/*!
 @brief Method invoked with a Subscription's next item.If this
  method throws an exception, resulting behavior is not
  guaranteed, but may cause the Subscription to be cancelled.
 @param item the item
 */
- (void)onNextWithId:(id)item;

/*!
 @brief Method invoked upon an unrecoverable error encountered by a
  Publisher or Subscription, after which no other Subscriber
  methods are invoked by the Subscription.If this method
  itself throws an exception, resulting behavior is
  undefined.
 @param throwable the exception
 */
- (void)onErrorWithJavaLangThrowable:(JavaLangThrowable *)throwable;

/*!
 @brief Method invoked when it is known that no additional
  Subscriber method invocations will occur for a Subscription
  that is not already terminated by error, after which no
  other Subscriber methods are invoked by the Subscription.
 If this method throws an exception, resulting behavior is
  undefined.
 */
- (void)onComplete;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilConcurrentFlow_Subscriber)

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilConcurrentFlow_Subscriber)

#endif

#if !defined (JavaUtilConcurrentFlow_Subscription_) && (INCLUDE_ALL_JavaUtilConcurrentFlow || defined(INCLUDE_JavaUtilConcurrentFlow_Subscription))
#define JavaUtilConcurrentFlow_Subscription_

/*!
 @brief Message control linking a <code>Publisher</code> and <code>Subscriber</code>
 .Subscribers receive items only when requested,
  and may cancel at any time.
 The methods in this interface are
  intended to be invoked only by their Subscribers; usages in
  other contexts have undefined effects.
 */
@protocol JavaUtilConcurrentFlow_Subscription < JavaObject >

/*!
 @brief Adds the given number <code>n</code> of items to the current
  unfulfilled demand for this subscription.If <code>n</code> is
  less than or equal to zero, the Subscriber will receive an 
 <code>onError</code> signal with an <code>IllegalArgumentException</code>
  argument.
 Otherwise, the
  Subscriber will receive up to <code>n</code> additional <code>onNext</code>
  invocations (or fewer if terminated).
 @param n the increment of demand; a value of <code>Long.MAX_VALUE</code>
   may be considered as effectively unbounded
 */
- (void)requestWithLong:(jlong)n;

/*!
 @brief Causes the Subscriber to (eventually) stop receiving
  messages.Implementation is best-effort -- additional
  messages may be received after invoking this method.
 A cancelled subscription need not ever receive an 
 <code>onComplete</code> or <code>onError</code> signal.
 */
- (void)cancel;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilConcurrentFlow_Subscription)

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilConcurrentFlow_Subscription)

#endif

#if !defined (JavaUtilConcurrentFlow_Processor_) && (INCLUDE_ALL_JavaUtilConcurrentFlow || defined(INCLUDE_JavaUtilConcurrentFlow_Processor))
#define JavaUtilConcurrentFlow_Processor_

/*!
 @brief A component that acts as both a Subscriber and Publisher.
 */
@protocol JavaUtilConcurrentFlow_Processor < JavaUtilConcurrentFlow_Subscriber, JavaUtilConcurrentFlow_Publisher, JavaObject >

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilConcurrentFlow_Processor)

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilConcurrentFlow_Processor)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaUtilConcurrentFlow")
