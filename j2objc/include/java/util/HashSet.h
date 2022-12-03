//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/util/HashSet.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaUtilHashSet")
#ifdef RESTRICT_JavaUtilHashSet
#define INCLUDE_ALL_JavaUtilHashSet 0
#else
#define INCLUDE_ALL_JavaUtilHashSet 1
#endif
#undef RESTRICT_JavaUtilHashSet

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaUtilHashSet_) && (INCLUDE_ALL_JavaUtilHashSet || defined(INCLUDE_JavaUtilHashSet))
#define JavaUtilHashSet_

#define RESTRICT_JavaUtilAbstractSet 1
#define INCLUDE_JavaUtilAbstractSet 1
#include "java/util/AbstractSet.h"

#define RESTRICT_JavaUtilSet 1
#define INCLUDE_JavaUtilSet 1
#include "java/util/Set.h"

#define RESTRICT_JavaIoSerializable 1
#define INCLUDE_JavaIoSerializable 1
#include "java/io/Serializable.h"

@protocol JavaUtilCollection;
@protocol JavaUtilIterator;
@protocol JavaUtilSpliterator;

/*!
 @brief This class implements the <tt>Set</tt> interface, backed by a hash table
  (actually a <tt>HashMap</tt> instance).It makes no guarantees as to the
  iteration order of the set; in particular, it does not guarantee that the
  order will remain constant over time.
 This class permits the <tt>null</tt>
  element. 
 <p>This class offers constant time performance for the basic operations
  (<tt>add</tt>, <tt>remove</tt>, <tt>contains</tt> and <tt>size</tt>),
  assuming the hash function disperses the elements properly among the
  buckets.  Iterating over this set requires time proportional to the sum of the 
 <tt>HashSet</tt> instance's size (the number of elements) plus the
  "capacity" of the backing <tt>HashMap</tt> instance (the number of
  buckets).  Thus, it's very important not to set the initial capacity too
  high (or the load factor too low) if iteration performance is important. 
 <p><strong>Note that this implementation is not synchronized.</strong>
  If multiple threads access a hash set concurrently, and at least one of
  the threads modifies the set, it <i>must</i> be synchronized externally.
  This is typically accomplished by synchronizing on some object that
  naturally encapsulates the set.
  If no such object exists, the set should be "wrapped" using the 
 <code>Collections.synchronizedSet</code>
  method.  This is best done at creation time, to prevent accidental
  unsynchronized access to the set:@code

    Set s = Collections.synchronizedSet(new HashSet(...));
@endcode
  
 <p>The iterators returned by this class's <tt>iterator</tt> method are 
 <i>fail-fast</i>: if the set is modified at any time after the iterator is
  created, in any way except through the iterator's own <tt>remove</tt>
  method, the Iterator throws a <code>ConcurrentModificationException</code>.
  Thus, in the face of concurrent modification, the iterator fails quickly
  and cleanly, rather than risking arbitrary, non-deterministic behavior at
  an undetermined time in the future. 
 <p>Note that the fail-fast behavior of an iterator cannot be guaranteed
  as it is, generally speaking, impossible to make any hard guarantees in the
  presence of unsynchronized concurrent modification.  Fail-fast iterators
  throw <tt>ConcurrentModificationException</tt> on a best-effort basis.
  Therefore, it would be wrong to write a program that depended on this
  exception for its correctness: <i>the fail-fast behavior of iterators
  should be used only to detect bugs.</i>
  
 <p>This class is a member of the 
 <a href="{@@docRoot}/../technotes/guides/collections/index.html">
  Java Collections Framework</a>.
 @author Josh Bloch
 @author Neal Gafter
 - seealso: Collection
 - seealso: Set
 - seealso: TreeSet
 - seealso: HashMap
 @since 1.2
 */
@interface JavaUtilHashSet : JavaUtilAbstractSet < JavaUtilSet, NSCopying, JavaIoSerializable >

#pragma mark Public

/*!
 @brief Constructs a new, empty set; the backing <tt>HashMap</tt> instance has
  default initial capacity (16) and load factor (0.75).
 */
- (instancetype __nonnull)init;

/*!
 @brief Constructs a new set containing the elements in the specified
  collection.The <tt>HashMap</tt> is created with default load factor
  (0.75) and an initial capacity sufficient to contain the elements in
  the specified collection.
 @param c the collection whose elements are to be placed into this set
 @throw NullPointerExceptionif the specified collection is null
 */
- (instancetype __nonnull)initWithJavaUtilCollection:(id<JavaUtilCollection>)c;

/*!
 @brief Constructs a new, empty set; the backing <tt>HashMap</tt> instance has
  the specified initial capacity and default load factor (0.75).
 @param initialCapacity the initial capacity of the hash table
 @throw IllegalArgumentExceptionif the initial capacity is less
              than zero
 */
- (instancetype __nonnull)initWithInt:(jint)initialCapacity;

/*!
 @brief Constructs a new, empty set; the backing <tt>HashMap</tt> instance has
  the specified initial capacity and the specified load factor.
 @param initialCapacity the initial capacity of the hash map
 @param loadFactor the load factor of the hash map
 @throw IllegalArgumentExceptionif the initial capacity is less
              than zero, or if the load factor is nonpositive
 */
- (instancetype __nonnull)initWithInt:(jint)initialCapacity
                            withFloat:(jfloat)loadFactor;

/*!
 @brief Adds the specified element to this set if it is not already present.
 More formally, adds the specified element <tt>e</tt> to this set if
  this set contains no element <tt>e2</tt> such that 
 <tt>(e==null&nbsp;?&nbsp;e2==null&nbsp;:&nbsp;e.equals(e2))</tt>.
  If this set already contains the element, the call leaves the set
  unchanged and returns <tt>false</tt>.
 @param e element to be added to this set
 @return <tt>true</tt> if this set did not already contain the specified
  element
 */
- (jboolean)addWithId:(id)e;

/*!
 @brief Removes all of the elements from this set.
 The set will be empty after this call returns.
 */
- (void)clear;

/*!
 @brief Returns a shallow copy of this <tt>HashSet</tt> instance: the elements
  themselves are not cloned.
 @return a shallow copy of this set
 */
- (id __nonnull)java_clone;

/*!
 @brief Returns <tt>true</tt> if this set contains the specified element.
 More formally, returns <tt>true</tt> if and only if this set
  contains an element <tt>e</tt> such that 
 <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
 @param o element whose presence in this set is to be tested
 @return <tt>true</tt> if this set contains the specified element
 */
- (jboolean)containsWithId:(id)o;

/*!
 @brief Returns <tt>true</tt> if this set contains no elements.
 @return <tt>true</tt> if this set contains no elements
 */
- (jboolean)isEmpty;

/*!
 @brief Returns an iterator over the elements in this set.The elements
  are returned in no particular order.
 @return an Iterator over the elements in this set
 - seealso: ConcurrentModificationException
 */
- (id<JavaUtilIterator> __nonnull)iterator;

/*!
 @brief Removes the specified element from this set if it is present.
 More formally, removes an element <tt>e</tt> such that 
 <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>,
  if this set contains such an element.  Returns <tt>true</tt> if
  this set contained the element (or equivalently, if this set
  changed as a result of the call).  (This set will not contain the
  element once the call returns.)
 @param o object to be removed from this set, if present
 @return <tt>true</tt> if the set contained the specified element
 */
- (jboolean)removeWithId:(id)o;

/*!
 @brief Returns the number of elements in this set (its cardinality).
 @return the number of elements in this set (its cardinality)
 */
- (jint)size;

/*!
 @brief Creates a <em><a href="Spliterator.html#binding">late-binding</a></em>
  and <em>fail-fast</em> <code>Spliterator</code> over the elements in this
  set.
 <p>The <code>Spliterator</code> reports <code>Spliterator.SIZED</code> and 
 <code>Spliterator.DISTINCT</code>.  Overriding implementations should document
  the reporting of additional characteristic values.
 @return a <code>Spliterator</code> over the elements in this set
 @since 1.8
 */
- (id<JavaUtilSpliterator> __nonnull)spliterator;

#pragma mark Package-Private

/*!
 @brief Constructs a new, empty linked hash set.
 (This package private
  constructor is only used by LinkedHashSet.) The backing
  HashMap instance is a LinkedHashMap with the specified initial
  capacity and the specified load factor.
 @param initialCapacity the initial capacity of the hash map
 @param loadFactor the load factor of the hash map
 @param dummy ignored (distinguishes this              constructor from other int, float constructor.)
 @throw IllegalArgumentExceptionif the initial capacity is less
              than zero, or if the load factor is nonpositive
 */
- (instancetype __nonnull)initWithInt:(jint)initialCapacity
                            withFloat:(jfloat)loadFactor
                          withBoolean:(jboolean)dummy;

@end

J2OBJC_STATIC_INIT(JavaUtilHashSet)

inline jlong JavaUtilHashSet_get_serialVersionUID(void);
#define JavaUtilHashSet_serialVersionUID -5024744406713321676LL
J2OBJC_STATIC_FIELD_CONSTANT(JavaUtilHashSet, serialVersionUID, jlong)

FOUNDATION_EXPORT void JavaUtilHashSet_init(JavaUtilHashSet *self);

FOUNDATION_EXPORT JavaUtilHashSet *new_JavaUtilHashSet_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilHashSet *create_JavaUtilHashSet_init(void);

FOUNDATION_EXPORT void JavaUtilHashSet_initWithJavaUtilCollection_(JavaUtilHashSet *self, id<JavaUtilCollection> c);

FOUNDATION_EXPORT JavaUtilHashSet *new_JavaUtilHashSet_initWithJavaUtilCollection_(id<JavaUtilCollection> c) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilHashSet *create_JavaUtilHashSet_initWithJavaUtilCollection_(id<JavaUtilCollection> c);

FOUNDATION_EXPORT void JavaUtilHashSet_initWithInt_withFloat_(JavaUtilHashSet *self, jint initialCapacity, jfloat loadFactor);

FOUNDATION_EXPORT JavaUtilHashSet *new_JavaUtilHashSet_initWithInt_withFloat_(jint initialCapacity, jfloat loadFactor) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilHashSet *create_JavaUtilHashSet_initWithInt_withFloat_(jint initialCapacity, jfloat loadFactor);

FOUNDATION_EXPORT void JavaUtilHashSet_initWithInt_(JavaUtilHashSet *self, jint initialCapacity);

FOUNDATION_EXPORT JavaUtilHashSet *new_JavaUtilHashSet_initWithInt_(jint initialCapacity) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilHashSet *create_JavaUtilHashSet_initWithInt_(jint initialCapacity);

FOUNDATION_EXPORT void JavaUtilHashSet_initWithInt_withFloat_withBoolean_(JavaUtilHashSet *self, jint initialCapacity, jfloat loadFactor, jboolean dummy);

FOUNDATION_EXPORT JavaUtilHashSet *new_JavaUtilHashSet_initWithInt_withFloat_withBoolean_(jint initialCapacity, jfloat loadFactor, jboolean dummy) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilHashSet *create_JavaUtilHashSet_initWithInt_withFloat_withBoolean_(jint initialCapacity, jfloat loadFactor, jboolean dummy);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilHashSet)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaUtilHashSet")
