//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/util/WeakHashMap.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaUtilWeakHashMap")
#ifdef RESTRICT_JavaUtilWeakHashMap
#define INCLUDE_ALL_JavaUtilWeakHashMap 0
#else
#define INCLUDE_ALL_JavaUtilWeakHashMap 1
#endif
#undef RESTRICT_JavaUtilWeakHashMap
#ifdef INCLUDE_JavaUtilWeakHashMap_EntrySpliterator
#define INCLUDE_JavaUtilWeakHashMap_WeakHashMapSpliterator 1
#endif
#ifdef INCLUDE_JavaUtilWeakHashMap_ValueSpliterator
#define INCLUDE_JavaUtilWeakHashMap_WeakHashMapSpliterator 1
#endif
#ifdef INCLUDE_JavaUtilWeakHashMap_KeySpliterator
#define INCLUDE_JavaUtilWeakHashMap_WeakHashMapSpliterator 1
#endif

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaUtilWeakHashMap_) && (INCLUDE_ALL_JavaUtilWeakHashMap || defined(INCLUDE_JavaUtilWeakHashMap))
#define JavaUtilWeakHashMap_

#define RESTRICT_JavaUtilAbstractMap 1
#define INCLUDE_JavaUtilAbstractMap 1
#include "java/util/AbstractMap.h"

#define RESTRICT_JavaUtilMap 1
#define INCLUDE_JavaUtilMap 1
#include "java/util/Map.h"

@class IOSObjectArray;
@class JavaUtilWeakHashMap_Entry;
@protocol JavaUtilCollection;
@protocol JavaUtilFunctionBiConsumer;
@protocol JavaUtilFunctionBiFunction;
@protocol JavaUtilSet;

/*!
 @brief Hash table based implementation of the <tt>Map</tt> interface, with 
 <em>weak keys</em>.
 An entry in a <tt>WeakHashMap</tt> will automatically be removed when
  its key is no longer in ordinary use.  More precisely, the presence of a
  mapping for a given key will not prevent the key from being discarded by the
  garbage collector, that is, made finalizable, finalized, and then reclaimed.
  When a key has been discarded its entry is effectively removed from the map,
  so this class behaves somewhat differently from other <tt>Map</tt>
  implementations. 
 <p> Both null values and the null key are supported. This class has
  performance characteristics similar to those of the <tt>HashMap</tt>
  class, and has the same efficiency parameters of <em>initial capacity</em>
  and <em>load factor</em>.
  
 <p> Like most collection classes, this class is not synchronized.
  A synchronized <tt>WeakHashMap</tt> may be constructed using the 
 <code>Collections.synchronizedMap</code>
  method. 
 <p> This class is intended primarily for use with key objects whose 
 <tt>equals</tt> methods test for object identity using the 
 <tt>==</tt> operator.  Once such a key is discarded it can never be
  recreated, so it is impossible to do a lookup of that key in a 
 <tt>WeakHashMap</tt> at some later time and be surprised that its entry
  has been removed.  This class will work perfectly well with key objects
  whose <tt>equals</tt> methods are not based upon object identity, such
  as <tt>String</tt> instances.  With such recreatable key objects,
  however, the automatic removal of <tt>WeakHashMap</tt> entries whose
  keys have been discarded may prove to be confusing. 
 <p> The behavior of the <tt>WeakHashMap</tt> class depends in part upon
  the actions of the garbage collector, so several familiar (though not
  required) <tt>Map</tt> invariants do not hold for this class.  Because
  the garbage collector may discard keys at any time, a 
 <tt>WeakHashMap</tt> may behave as though an unknown thread is silently
  removing entries.  In particular, even if you synchronize on a 
 <tt>WeakHashMap</tt> instance and invoke none of its mutator methods, it
  is possible for the <tt>size</tt> method to return smaller values over
  time, for the <tt>isEmpty</tt> method to return <tt>false</tt> and
  then <tt>true</tt>, for the <tt>containsKey</tt> method to return 
 <tt>true</tt> and later <tt>false</tt> for a given key, for the 
 <tt>get</tt> method to return a value for a given key but later return 
 <tt>null</tt>, for the <tt>put</tt> method to return 
 <tt>null</tt> and the <tt>remove</tt> method to return 
 <tt>false</tt> for a key that previously appeared to be in the map, and
  for successive examinations of the key set, the value collection, and
  the entry set to yield successively smaller numbers of elements. 
 <p> Each key object in a <tt>WeakHashMap</tt> is stored indirectly as
  the referent of a weak reference.  Therefore a key will automatically be
  removed only after the weak references to it, both inside and outside of the
  map, have been cleared by the garbage collector. 
 <p> <strong>Implementation note:</strong> The value objects in a 
 <tt>WeakHashMap</tt> are held by ordinary strong references.  Thus care
  should be taken to ensure that value objects do not strongly refer to their
  own keys, either directly or indirectly, since that will prevent the keys
  from being discarded.  Note that a value object may refer indirectly to its
  key via the <tt>WeakHashMap</tt> itself; that is, a value object may
  strongly refer to some other key object whose associated value object, in
  turn, strongly refers to the key of the first value object.  If the values
  in the map do not rely on the map holding strong references to them, one way
  to deal with this is to wrap values themselves within 
 <tt>WeakReferences</tt> before
  inserting, as in: <tt>m.put(key, new WeakReference(value))</tt>,
  and then unwrapping upon each <tt>get</tt>.
  
 <p>The iterators returned by the <tt>iterator</tt> method of the collections
  returned by all of this class's "collection view methods" are 
 <i>fail-fast</i>: if the map is structurally modified at any time after the
  iterator is created, in any way except through the iterator's own 
 <tt>remove</tt> method, the iterator will throw a <code>ConcurrentModificationException</code>
 .  Thus, in the face of concurrent
  modification, the iterator fails quickly and cleanly, rather than risking
  arbitrary, non-deterministic behavior at an undetermined time in the future. 
 <p>Note that the fail-fast behavior of an iterator cannot be guaranteed
  as it is, generally speaking, impossible to make any hard guarantees in the
  presence of unsynchronized concurrent modification.  Fail-fast iterators
  throw <tt>ConcurrentModificationException</tt> on a best-effort basis.
  Therefore, it would be wrong to write a program that depended on this
  exception for its correctness:  <i>the fail-fast behavior of iterators
  should be used only to detect bugs.</i>
  
 <p>This class is a member of the 
 <a href="{@@docRoot}/../technotes/guides/collections/index.html">
  Java Collections Framework</a>.
 @author Doug Lea
 @author Josh Bloch
 @author Mark Reinhold
 @since 1.2
 - seealso: java.util.HashMap
 - seealso: java.lang.ref.WeakReference
 */
@interface JavaUtilWeakHashMap : JavaUtilAbstractMap < JavaUtilMap > {
 @public
  /*!
   @brief The table, resized as necessary.Length MUST Always be a power of two.
   */
  IOSObjectArray *table_;
  /*!
   @brief The number of times this WeakHashMap has been structurally modified.
   Structural modifications are those that change the number of
  mappings in the map or otherwise modify its internal structure
  (e.g., rehash).  This field is used to make iterators on
  Collection-views of the map fail-fast.
   - seealso: ConcurrentModificationException
   */
  jint modCount_;
}

#pragma mark Public

/*!
 @brief Constructs a new, empty <tt>WeakHashMap</tt> with the default initial
  capacity (16) and load factor (0.75).
 */
- (instancetype __nonnull)init;

/*!
 @brief Constructs a new, empty <tt>WeakHashMap</tt> with the given initial
  capacity and the default load factor (0.75).
 @param initialCapacity The initial capacity of the  <tt> WeakHashMap </tt>
 @throw IllegalArgumentExceptionif the initial capacity is negative
 */
- (instancetype __nonnull)initWithInt:(jint)initialCapacity;

/*!
 @brief Constructs a new, empty <tt>WeakHashMap</tt> with the given initial
  capacity and the given load factor.
 @param initialCapacity The initial capacity of the  <tt> WeakHashMap </tt>
 @param loadFactor The load factor of the  <tt> WeakHashMap </tt>
 @throw IllegalArgumentExceptionif the initial capacity is negative,
          or if the load factor is nonpositive.
 */
- (instancetype __nonnull)initWithInt:(jint)initialCapacity
                            withFloat:(jfloat)loadFactor;

/*!
 @brief Constructs a new <tt>WeakHashMap</tt> with the same mappings as the
  specified map.The <tt>WeakHashMap</tt> is created with the default
  load factor (0.75) and an initial capacity sufficient to hold the
  mappings in the specified map.
 @param m the map whose mappings are to be placed in this map
 @throw NullPointerExceptionif the specified map is null
 @since 1.3
 */
- (instancetype __nonnull)initWithJavaUtilMap:(id<JavaUtilMap>)m;

/*!
 @brief Removes all of the mappings from this map.
 The map will be empty after this call returns.
 */
- (void)clear;

/*!
 @brief Returns <tt>true</tt> if this map contains a mapping for the
  specified key.
 @param key The key whose presence in this map is to be tested
 @return <tt>true</tt> if there is a mapping for <tt>key</tt>;
          <tt>false</tt> otherwise
 */
- (jboolean)containsKeyWithId:(id)key;

/*!
 @brief Returns <tt>true</tt> if this map maps one or more keys to the
  specified value.
 @param value value whose presence in this map is to be tested
 @return <tt>true</tt> if this map maps one or more keys to the
          specified value
 */
- (jboolean)containsValueWithId:(id)value;

/*!
 @brief Returns a <code>Set</code> view of the mappings contained in this map.
 The set is backed by the map, so changes to the map are
  reflected in the set, and vice-versa.  If the map is modified
  while an iteration over the set is in progress (except through
  the iterator's own <tt>remove</tt> operation, or through the 
 <tt>setValue</tt> operation on a map entry returned by the
  iterator) the results of the iteration are undefined.  The set
  supports element removal, which removes the corresponding
  mapping from the map, via the <tt>Iterator.remove</tt>,
  <tt>Set.remove</tt>, <tt>removeAll</tt>, <tt>retainAll</tt> and 
 <tt>clear</tt> operations.  It does not support the 
 <tt>add</tt> or <tt>addAll</tt> operations.
 */
- (id<JavaUtilSet> __nonnull)entrySet;

- (void)forEachWithJavaUtilFunctionBiConsumer:(id<JavaUtilFunctionBiConsumer>)action;

/*!
 @brief Returns the value to which the specified key is mapped,
  or <code>null</code> if this map contains no mapping for the key.
 <p>More formally, if this map contains a mapping from a key 
 <code>k</code> to a value <code>v</code> such that <code>(key==null ? k==null :
  key.equals(k))</code>
 , then this method returns <code>v</code>; otherwise
  it returns <code>null</code>.  (There can be at most one such mapping.) 
 <p>A return value of <code>null</code> does not <i>necessarily</i>
  indicate that the map contains no mapping for the key; it's also
  possible that the map explicitly maps the key to <code>null</code>.
  The <code>containsKey</code> operation may be used to
  distinguish these two cases.
 - seealso: #put(Object, Object)
 */
- (id __nullable)getWithId:(id)key;

/*!
 @brief Returns <tt>true</tt> if this map contains no key-value mappings.
 This result is a snapshot, and may not reflect unprocessed
  entries that will be removed before next attempted access
  because they are no longer referenced.
 */
- (jboolean)isEmpty;

/*!
 @brief Returns a <code>Set</code> view of the keys contained in this map.
 The set is backed by the map, so changes to the map are
  reflected in the set, and vice-versa.  If the map is modified
  while an iteration over the set is in progress (except through
  the iterator's own <tt>remove</tt> operation), the results of
  the iteration are undefined.  The set supports element removal,
  which removes the corresponding mapping from the map, via the 
 <tt>Iterator.remove</tt>, <tt>Set.remove</tt>,
  <tt>removeAll</tt>, <tt>retainAll</tt>, and <tt>clear</tt>
  operations.  It does not support the <tt>add</tt> or <tt>addAll</tt>
  operations.
 */
- (id<JavaUtilSet> __nonnull)keySet;

/*!
 @brief Associates the specified value with the specified key in this map.
 If the map previously contained a mapping for this key, the old
  value is replaced.
 @param key key with which the specified value is to be associated.
 @param value value to be associated with the specified key.
 @return the previous value associated with <tt>key</tt>, or
          <tt>null</tt> if there was no mapping for <tt>key</tt>.
          (A <tt>null</tt> return can also indicate that the map
          previously associated <tt>null</tt> with <tt>key</tt>.)
 */
- (id __nullable)putWithId:(id)key
                    withId:(id)value;

/*!
 @brief Copies all of the mappings from the specified map to this map.
 These mappings will replace any mappings that this map had for any
  of the keys currently in the specified map.
 @param m mappings to be stored in this map.
 @throw NullPointerExceptionif the specified map is null.
 */
- (void)putAllWithJavaUtilMap:(id<JavaUtilMap>)m;

/*!
 @brief Removes the mapping for a key from this weak hash map if it is present.
 More formally, if this map contains a mapping from key <tt>k</tt> to
  value <tt>v</tt> such that <code>(key==null ?  k==null :
  key.equals(k))</code>, that mapping is removed.  (The map can contain
  at most one such mapping.) 
 <p>Returns the value to which this map previously associated the key,
  or <tt>null</tt> if the map contained no mapping for the key.  A
  return value of <tt>null</tt> does not <i>necessarily</i> indicate
  that the map contained no mapping for the key; it's also possible
  that the map explicitly mapped the key to <tt>null</tt>.
  
 <p>The map will not contain a mapping for the specified key once the
  call returns.
 @param key key whose mapping is to be removed from the map
 @return the previous value associated with <tt>key</tt>, or
          <tt>null</tt> if there was no mapping for <tt>key</tt>
 */
- (id __nullable)removeWithId:(id)key;

- (void)replaceAllWithJavaUtilFunctionBiFunction:(id<JavaUtilFunctionBiFunction>)function;

/*!
 @brief Returns the number of key-value mappings in this map.
 This result is a snapshot, and may not reflect unprocessed
  entries that will be removed before next attempted access
  because they are no longer referenced.
 */
- (jint)size;

/*!
 @brief Returns a <code>Collection</code> view of the values contained in this map.
 The collection is backed by the map, so changes to the map are
  reflected in the collection, and vice-versa.  If the map is
  modified while an iteration over the collection is in progress
  (except through the iterator's own <tt>remove</tt> operation),
  the results of the iteration are undefined.  The collection
  supports element removal, which removes the corresponding
  mapping from the map, via the <tt>Iterator.remove</tt>,
  <tt>Collection.remove</tt>, <tt>removeAll</tt>,
  <tt>retainAll</tt> and <tt>clear</tt> operations.  It does not
  support the <tt>add</tt> or <tt>addAll</tt> operations.
 */
- (id<JavaUtilCollection> __nonnull)values;

#pragma mark Package-Private

/*!
 @brief Returns the entry associated with the specified key in this map.
 Returns null if the map contains no mapping for this key.
 */
- (JavaUtilWeakHashMap_Entry *)getEntryWithId:(id)key;

/*!
 @brief Retrieve object hash code and applies a supplemental hash function to the
  result hash, which defends against poor quality hash functions.This is
  critical because HashMap uses power-of-two length hash tables, that
  otherwise encounter collisions for hashCodes that do not differ
  in lower bits.
 */
- (jint)hash__WithId:(id)k;

/*!
 @brief Special version of remove needed by Entry set
 */
- (jboolean)removeMappingWithId:(id)o;

/*!
 @brief Rehashes the contents of this map into a new array with a
  larger capacity.This method is called automatically when the
  number of keys in this map reaches its threshold.
 If current capacity is MAXIMUM_CAPACITY, this method does not
  resize the map, but sets threshold to Integer.MAX_VALUE.
  This has the effect of preventing future calls.
 @param newCapacity the new capacity, MUST be a power of two;         must be greater than current capacity unless current
          capacity is MAXIMUM_CAPACITY (in which case value
          is irrelevant).
 */
- (void)resizeWithInt:(jint)newCapacity;

/*!
 @brief Returns internal representation of null key back to caller as null.
 */
+ (id)unmaskNullWithId:(id)key;

@end

J2OBJC_STATIC_INIT(JavaUtilWeakHashMap)

J2OBJC_FIELD_SETTER(JavaUtilWeakHashMap, table_, IOSObjectArray *)

FOUNDATION_EXPORT void JavaUtilWeakHashMap_initWithInt_withFloat_(JavaUtilWeakHashMap *self, jint initialCapacity, jfloat loadFactor);

FOUNDATION_EXPORT JavaUtilWeakHashMap *new_JavaUtilWeakHashMap_initWithInt_withFloat_(jint initialCapacity, jfloat loadFactor) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilWeakHashMap *create_JavaUtilWeakHashMap_initWithInt_withFloat_(jint initialCapacity, jfloat loadFactor);

FOUNDATION_EXPORT void JavaUtilWeakHashMap_initWithInt_(JavaUtilWeakHashMap *self, jint initialCapacity);

FOUNDATION_EXPORT JavaUtilWeakHashMap *new_JavaUtilWeakHashMap_initWithInt_(jint initialCapacity) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilWeakHashMap *create_JavaUtilWeakHashMap_initWithInt_(jint initialCapacity);

FOUNDATION_EXPORT void JavaUtilWeakHashMap_init(JavaUtilWeakHashMap *self);

FOUNDATION_EXPORT JavaUtilWeakHashMap *new_JavaUtilWeakHashMap_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilWeakHashMap *create_JavaUtilWeakHashMap_init(void);

FOUNDATION_EXPORT void JavaUtilWeakHashMap_initWithJavaUtilMap_(JavaUtilWeakHashMap *self, id<JavaUtilMap> m);

FOUNDATION_EXPORT JavaUtilWeakHashMap *new_JavaUtilWeakHashMap_initWithJavaUtilMap_(id<JavaUtilMap> m) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilWeakHashMap *create_JavaUtilWeakHashMap_initWithJavaUtilMap_(id<JavaUtilMap> m);

FOUNDATION_EXPORT id JavaUtilWeakHashMap_unmaskNullWithId_(id key);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilWeakHashMap)

#endif

#if !defined (JavaUtilWeakHashMap_Entry_) && (INCLUDE_ALL_JavaUtilWeakHashMap || defined(INCLUDE_JavaUtilWeakHashMap_Entry))
#define JavaUtilWeakHashMap_Entry_

#define RESTRICT_JavaLangRefWeakReference 1
#define INCLUDE_JavaLangRefWeakReference 1
#include "java/lang/ref/WeakReference.h"

#define RESTRICT_JavaUtilMap 1
#define INCLUDE_JavaUtilMap_Entry 1
#include "java/util/Map.h"

@class JavaLangRefReferenceQueue;

/*!
 @brief The entries in this hash table extend WeakReference, using its main ref
  field as the key.
 */
@interface JavaUtilWeakHashMap_Entry : JavaLangRefWeakReference < JavaUtilMap_Entry > {
 @public
  id value_;
  jint hash__;
  JavaUtilWeakHashMap_Entry *next_;
}

#pragma mark Public

- (jboolean)isEqual:(id)o;

- (id)getKey;

- (id)getValue;

- (NSUInteger)hash;

- (id)setValueWithId:(id)newValue;

- (NSString *)description;

#pragma mark Package-Private

/*!
 @brief Creates new entry.
 */
- (instancetype __nonnull)initWithId:(id)key
                              withId:(id)value
       withJavaLangRefReferenceQueue:(JavaLangRefReferenceQueue *)queue
                             withInt:(jint)hash_
       withJavaUtilWeakHashMap_Entry:(JavaUtilWeakHashMap_Entry *)next;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilWeakHashMap_Entry)

J2OBJC_FIELD_SETTER(JavaUtilWeakHashMap_Entry, value_, id)
J2OBJC_FIELD_SETTER(JavaUtilWeakHashMap_Entry, next_, JavaUtilWeakHashMap_Entry *)

FOUNDATION_EXPORT void JavaUtilWeakHashMap_Entry_initWithId_withId_withJavaLangRefReferenceQueue_withInt_withJavaUtilWeakHashMap_Entry_(JavaUtilWeakHashMap_Entry *self, id key, id value, JavaLangRefReferenceQueue *queue, jint hash_, JavaUtilWeakHashMap_Entry *next);

FOUNDATION_EXPORT JavaUtilWeakHashMap_Entry *new_JavaUtilWeakHashMap_Entry_initWithId_withId_withJavaLangRefReferenceQueue_withInt_withJavaUtilWeakHashMap_Entry_(id key, id value, JavaLangRefReferenceQueue *queue, jint hash_, JavaUtilWeakHashMap_Entry *next) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilWeakHashMap_Entry *create_JavaUtilWeakHashMap_Entry_initWithId_withId_withJavaLangRefReferenceQueue_withInt_withJavaUtilWeakHashMap_Entry_(id key, id value, JavaLangRefReferenceQueue *queue, jint hash_, JavaUtilWeakHashMap_Entry *next);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilWeakHashMap_Entry)

#endif

#if !defined (JavaUtilWeakHashMap_WeakHashMapSpliterator_) && (INCLUDE_ALL_JavaUtilWeakHashMap || defined(INCLUDE_JavaUtilWeakHashMap_WeakHashMapSpliterator))
#define JavaUtilWeakHashMap_WeakHashMapSpliterator_

@class JavaUtilWeakHashMap;
@class JavaUtilWeakHashMap_Entry;

/*!
 @brief Similar form as other hash Spliterators, but skips dead
  elements.
 */
@interface JavaUtilWeakHashMap_WeakHashMapSpliterator : NSObject {
 @public
  JavaUtilWeakHashMap *map_;
  JavaUtilWeakHashMap_Entry *current_;
  jint index_;
  jint fence_;
  jint est_;
  jint expectedModCount_;
}

#pragma mark Public

- (jlong)estimateSize;

#pragma mark Package-Private

- (instancetype __nonnull)initWithJavaUtilWeakHashMap:(JavaUtilWeakHashMap *)m
                                              withInt:(jint)origin
                                              withInt:(jint)fence
                                              withInt:(jint)est
                                              withInt:(jint)expectedModCount;

- (jint)getFence;

// Disallowed inherited constructors, do not use.

- (instancetype __nonnull)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilWeakHashMap_WeakHashMapSpliterator)

J2OBJC_FIELD_SETTER(JavaUtilWeakHashMap_WeakHashMapSpliterator, map_, JavaUtilWeakHashMap *)
J2OBJC_FIELD_SETTER(JavaUtilWeakHashMap_WeakHashMapSpliterator, current_, JavaUtilWeakHashMap_Entry *)

FOUNDATION_EXPORT void JavaUtilWeakHashMap_WeakHashMapSpliterator_initWithJavaUtilWeakHashMap_withInt_withInt_withInt_withInt_(JavaUtilWeakHashMap_WeakHashMapSpliterator *self, JavaUtilWeakHashMap *m, jint origin, jint fence, jint est, jint expectedModCount);

FOUNDATION_EXPORT JavaUtilWeakHashMap_WeakHashMapSpliterator *new_JavaUtilWeakHashMap_WeakHashMapSpliterator_initWithJavaUtilWeakHashMap_withInt_withInt_withInt_withInt_(JavaUtilWeakHashMap *m, jint origin, jint fence, jint est, jint expectedModCount) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilWeakHashMap_WeakHashMapSpliterator *create_JavaUtilWeakHashMap_WeakHashMapSpliterator_initWithJavaUtilWeakHashMap_withInt_withInt_withInt_withInt_(JavaUtilWeakHashMap *m, jint origin, jint fence, jint est, jint expectedModCount);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilWeakHashMap_WeakHashMapSpliterator)

#endif

#if !defined (JavaUtilWeakHashMap_KeySpliterator_) && (INCLUDE_ALL_JavaUtilWeakHashMap || defined(INCLUDE_JavaUtilWeakHashMap_KeySpliterator))
#define JavaUtilWeakHashMap_KeySpliterator_

#define RESTRICT_JavaUtilSpliterator 1
#define INCLUDE_JavaUtilSpliterator 1
#include "java/util/Spliterator.h"

@class JavaUtilWeakHashMap;
@protocol JavaUtilComparator;
@protocol JavaUtilFunctionConsumer;

@interface JavaUtilWeakHashMap_KeySpliterator : JavaUtilWeakHashMap_WeakHashMapSpliterator < JavaUtilSpliterator >

#pragma mark Public

- (jint)characteristics;

- (void)forEachRemainingWithJavaUtilFunctionConsumer:(id<JavaUtilFunctionConsumer>)action;

- (jboolean)tryAdvanceWithJavaUtilFunctionConsumer:(id<JavaUtilFunctionConsumer>)action;

- (JavaUtilWeakHashMap_KeySpliterator *)trySplit;

#pragma mark Package-Private

- (instancetype __nonnull)initWithJavaUtilWeakHashMap:(JavaUtilWeakHashMap *)m
                                              withInt:(jint)origin
                                              withInt:(jint)fence
                                              withInt:(jint)est
                                              withInt:(jint)expectedModCount;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilWeakHashMap_KeySpliterator)

FOUNDATION_EXPORT void JavaUtilWeakHashMap_KeySpliterator_initWithJavaUtilWeakHashMap_withInt_withInt_withInt_withInt_(JavaUtilWeakHashMap_KeySpliterator *self, JavaUtilWeakHashMap *m, jint origin, jint fence, jint est, jint expectedModCount);

FOUNDATION_EXPORT JavaUtilWeakHashMap_KeySpliterator *new_JavaUtilWeakHashMap_KeySpliterator_initWithJavaUtilWeakHashMap_withInt_withInt_withInt_withInt_(JavaUtilWeakHashMap *m, jint origin, jint fence, jint est, jint expectedModCount) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilWeakHashMap_KeySpliterator *create_JavaUtilWeakHashMap_KeySpliterator_initWithJavaUtilWeakHashMap_withInt_withInt_withInt_withInt_(JavaUtilWeakHashMap *m, jint origin, jint fence, jint est, jint expectedModCount);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilWeakHashMap_KeySpliterator)

#endif

#if !defined (JavaUtilWeakHashMap_ValueSpliterator_) && (INCLUDE_ALL_JavaUtilWeakHashMap || defined(INCLUDE_JavaUtilWeakHashMap_ValueSpliterator))
#define JavaUtilWeakHashMap_ValueSpliterator_

#define RESTRICT_JavaUtilSpliterator 1
#define INCLUDE_JavaUtilSpliterator 1
#include "java/util/Spliterator.h"

@class JavaUtilWeakHashMap;
@protocol JavaUtilComparator;
@protocol JavaUtilFunctionConsumer;

@interface JavaUtilWeakHashMap_ValueSpliterator : JavaUtilWeakHashMap_WeakHashMapSpliterator < JavaUtilSpliterator >

#pragma mark Public

- (jint)characteristics;

- (void)forEachRemainingWithJavaUtilFunctionConsumer:(id<JavaUtilFunctionConsumer>)action;

- (jboolean)tryAdvanceWithJavaUtilFunctionConsumer:(id<JavaUtilFunctionConsumer>)action;

- (JavaUtilWeakHashMap_ValueSpliterator *)trySplit;

#pragma mark Package-Private

- (instancetype __nonnull)initWithJavaUtilWeakHashMap:(JavaUtilWeakHashMap *)m
                                              withInt:(jint)origin
                                              withInt:(jint)fence
                                              withInt:(jint)est
                                              withInt:(jint)expectedModCount;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilWeakHashMap_ValueSpliterator)

FOUNDATION_EXPORT void JavaUtilWeakHashMap_ValueSpliterator_initWithJavaUtilWeakHashMap_withInt_withInt_withInt_withInt_(JavaUtilWeakHashMap_ValueSpliterator *self, JavaUtilWeakHashMap *m, jint origin, jint fence, jint est, jint expectedModCount);

FOUNDATION_EXPORT JavaUtilWeakHashMap_ValueSpliterator *new_JavaUtilWeakHashMap_ValueSpliterator_initWithJavaUtilWeakHashMap_withInt_withInt_withInt_withInt_(JavaUtilWeakHashMap *m, jint origin, jint fence, jint est, jint expectedModCount) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilWeakHashMap_ValueSpliterator *create_JavaUtilWeakHashMap_ValueSpliterator_initWithJavaUtilWeakHashMap_withInt_withInt_withInt_withInt_(JavaUtilWeakHashMap *m, jint origin, jint fence, jint est, jint expectedModCount);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilWeakHashMap_ValueSpliterator)

#endif

#if !defined (JavaUtilWeakHashMap_EntrySpliterator_) && (INCLUDE_ALL_JavaUtilWeakHashMap || defined(INCLUDE_JavaUtilWeakHashMap_EntrySpliterator))
#define JavaUtilWeakHashMap_EntrySpliterator_

#define RESTRICT_JavaUtilSpliterator 1
#define INCLUDE_JavaUtilSpliterator 1
#include "java/util/Spliterator.h"

@class JavaUtilWeakHashMap;
@protocol JavaUtilComparator;
@protocol JavaUtilFunctionConsumer;

@interface JavaUtilWeakHashMap_EntrySpliterator : JavaUtilWeakHashMap_WeakHashMapSpliterator < JavaUtilSpliterator >

#pragma mark Public

- (jint)characteristics;

- (void)forEachRemainingWithJavaUtilFunctionConsumer:(id<JavaUtilFunctionConsumer>)action;

- (jboolean)tryAdvanceWithJavaUtilFunctionConsumer:(id<JavaUtilFunctionConsumer>)action;

- (JavaUtilWeakHashMap_EntrySpliterator *)trySplit;

#pragma mark Package-Private

- (instancetype __nonnull)initWithJavaUtilWeakHashMap:(JavaUtilWeakHashMap *)m
                                              withInt:(jint)origin
                                              withInt:(jint)fence
                                              withInt:(jint)est
                                              withInt:(jint)expectedModCount;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilWeakHashMap_EntrySpliterator)

FOUNDATION_EXPORT void JavaUtilWeakHashMap_EntrySpliterator_initWithJavaUtilWeakHashMap_withInt_withInt_withInt_withInt_(JavaUtilWeakHashMap_EntrySpliterator *self, JavaUtilWeakHashMap *m, jint origin, jint fence, jint est, jint expectedModCount);

FOUNDATION_EXPORT JavaUtilWeakHashMap_EntrySpliterator *new_JavaUtilWeakHashMap_EntrySpliterator_initWithJavaUtilWeakHashMap_withInt_withInt_withInt_withInt_(JavaUtilWeakHashMap *m, jint origin, jint fence, jint est, jint expectedModCount) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilWeakHashMap_EntrySpliterator *create_JavaUtilWeakHashMap_EntrySpliterator_initWithJavaUtilWeakHashMap_withInt_withInt_withInt_withInt_(JavaUtilWeakHashMap *m, jint origin, jint fence, jint est, jint expectedModCount);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilWeakHashMap_EntrySpliterator)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaUtilWeakHashMap")
