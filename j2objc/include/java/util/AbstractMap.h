//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/util/AbstractMap.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaUtilAbstractMap")
#ifdef RESTRICT_JavaUtilAbstractMap
#define INCLUDE_ALL_JavaUtilAbstractMap 0
#else
#define INCLUDE_ALL_JavaUtilAbstractMap 1
#endif
#undef RESTRICT_JavaUtilAbstractMap

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaUtilAbstractMap_) && (INCLUDE_ALL_JavaUtilAbstractMap || defined(INCLUDE_JavaUtilAbstractMap))
#define JavaUtilAbstractMap_

#define RESTRICT_JavaUtilMap 1
#define INCLUDE_JavaUtilMap 1
#include "java/util/Map.h"

@protocol JavaUtilCollection;
@protocol JavaUtilFunctionBiConsumer;
@protocol JavaUtilFunctionBiFunction;
@protocol JavaUtilFunctionFunction;
@protocol JavaUtilSet;

/*!
 @brief This class provides a skeletal implementation of the <tt>Map</tt>
  interface, to minimize the effort required to implement this interface.
 <p>To implement an unmodifiable map, the programmer needs only to extend this
  class and provide an implementation for the <tt>entrySet</tt> method, which
  returns a set-view of the map's mappings.  Typically, the returned set
  will, in turn, be implemented atop <tt>AbstractSet</tt>.  This set should
  not support the <tt>add</tt> or <tt>remove</tt> methods, and its iterator
  should not support the <tt>remove</tt> method. 
 <p>To implement a modifiable map, the programmer must additionally override
  this class's <tt>put</tt> method (which otherwise throws an 
 <tt>UnsupportedOperationException</tt>), and the iterator returned by 
 <tt>entrySet().iterator()</tt> must additionally implement its 
 <tt>remove</tt> method. 
 <p>The programmer should generally provide a void (no argument) and map
  constructor, as per the recommendation in the <tt>Map</tt> interface
  specification. 
 <p>The documentation for each non-abstract method in this class describes its
  implementation in detail.  Each of these methods may be overridden if the
  map being implemented admits a more efficient implementation. 
 <p>This class is a member of the 
 <a href="{@@docRoot}/../technotes/guides/collections/index.html">
  Java Collections Framework</a>.
 @author Josh Bloch
 @author Neal Gafter
 - seealso: Map
 - seealso: Collection
 @since 1.2
 */
@interface JavaUtilAbstractMap : NSObject < JavaUtilMap > {
 @public
  /*!
   @brief Each of these fields are initialized to contain an instance of the
  appropriate view the first time this view is requested.The views are
  stateless, so there's no reason to create more than one of each.
   <p>Since there is no synchronization performed while accessing these fields,
  it is expected that java.util.Map view classes using these fields have
  no non-final fields (or any fields at all except for outer-this). Adhering
  to this rule would make the races on these fields benign. 
 <p>It is also imperative that implementations read the field only once,
  as in: 
 @code
  public Set<K> keySet() {
    Set<K> ks = keySet;  // single racy read
    if (ks == null) {
      ks = new KeySet();
      keySet = ks;
    }
    return ks;
  }
 
@endcode
   */
  volatile_id keySet_;
  volatile_id values_;
}

#pragma mark Public

/*!
 @throw UnsupportedOperationException
 */
- (void)clear;

/*!
 @throw ClassCastException
 @throw NullPointerException
 */
- (jboolean)containsKeyWithId:(id)key;

/*!
 @throw ClassCastException
 @throw NullPointerException
 */
- (jboolean)containsValueWithId:(id)value;

- (id<JavaUtilSet> __nonnull)entrySet;

/*!
 @brief Compares the specified object with this map for equality.Returns
  <tt>true</tt> if the given object is also a map and the two maps
  represent the same mappings.
 More formally, two maps <tt>m1</tt> and 
 <tt>m2</tt> represent the same mappings if 
 <tt>m1.entrySet().equals(m2.entrySet())</tt>.  This ensures that the 
 <tt>equals</tt> method works properly across different implementations
  of the <tt>Map</tt> interface.
 @param o object to be compared for equality with this map
 @return <tt>true</tt> if the specified object is equal to this map
 */
- (jboolean)isEqual:(id)o;

/*!
 @throw ClassCastException
 @throw NullPointerException
 */
- (id __nullable)getWithId:(id)key;

/*!
 @brief Returns the hash code value for this map.The hash code of a map is
  defined to be the sum of the hash codes of each entry in the map's 
 <tt>entrySet()</tt> view.
 This ensures that <tt>m1.equals(m2)</tt>
  implies that <tt>m1.hashCode()==m2.hashCode()</tt> for any two maps 
 <tt>m1</tt> and <tt>m2</tt>, as required by the general contract of 
 <code>Object.hashCode</code>.
 @return the hash code value for this map
 - seealso: Map.Entry#hashCode()
 - seealso: Object#equals(Object)
 - seealso: Set#equals(Object)
 */
- (NSUInteger)hash;

/*!
 */
- (jboolean)isEmpty;

/*!
 */
- (id<JavaUtilSet> __nonnull)keySet;

/*!
 @throw UnsupportedOperationException
 @throw ClassCastException
 @throw NullPointerException
 @throw IllegalArgumentException
 */
- (id __nullable)putWithId:(id)key
                    withId:(id)value;

/*!
 @throw UnsupportedOperationException
 @throw ClassCastException
 @throw NullPointerException
 @throw IllegalArgumentException
 */
- (void)putAllWithJavaUtilMap:(id<JavaUtilMap>)m;

/*!
 @throw UnsupportedOperationException
 @throw ClassCastException
 @throw NullPointerException
 */
- (id __nullable)removeWithId:(id)key;

/*!
 */
- (jint)size;

/*!
 @brief Returns a string representation of this map.The string representation
  consists of a list of key-value mappings in the order returned by the
  map's <tt>entrySet</tt> view's iterator, enclosed in braces
  (<tt>"{}"</tt>).
 Adjacent mappings are separated by the characters 
 <tt>", "</tt> (comma and space).  Each key-value mapping is rendered as
  the key followed by an equals sign (<tt>"="</tt>) followed by the
  associated value.  Keys and values are converted to strings as by 
 <code>String.valueOf(Object)</code>.
 @return a string representation of this map
 */
- (NSString * __nonnull)description;

/*!
 */
- (id<JavaUtilCollection> __nonnull)values;

#pragma mark Protected

/*!
 @brief Sole constructor.
 (For invocation by subclass constructors, typically
  implicit.)
 */
- (instancetype __nonnull)init;

/*!
 @brief Returns a shallow copy of this <tt>AbstractMap</tt> instance: the keys
  and values themselves are not cloned.
 @return a shallow copy of this map
 */
- (id __nonnull)java_clone;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilAbstractMap)

J2OBJC_VOLATILE_FIELD_SETTER(JavaUtilAbstractMap, keySet_, id<JavaUtilSet>)
J2OBJC_VOLATILE_FIELD_SETTER(JavaUtilAbstractMap, values_, id<JavaUtilCollection>)

FOUNDATION_EXPORT void JavaUtilAbstractMap_init(JavaUtilAbstractMap *self);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilAbstractMap)

#endif

#if !defined (JavaUtilAbstractMap_SimpleEntry_) && (INCLUDE_ALL_JavaUtilAbstractMap || defined(INCLUDE_JavaUtilAbstractMap_SimpleEntry))
#define JavaUtilAbstractMap_SimpleEntry_

#define RESTRICT_JavaUtilMap 1
#define INCLUDE_JavaUtilMap_Entry 1
#include "java/util/Map.h"

#define RESTRICT_JavaIoSerializable 1
#define INCLUDE_JavaIoSerializable 1
#include "java/io/Serializable.h"

/*!
 @brief An Entry maintaining a key and a value.The value may be
  changed using the <tt>setValue</tt> method.
 This class
  facilitates the process of building custom map
  implementations. For example, it may be convenient to return
  arrays of <tt>SimpleEntry</tt> instances in method 
 <tt>Map.entrySet().toArray</tt>.
 @since 1.6
 */
@interface JavaUtilAbstractMap_SimpleEntry : NSObject < JavaUtilMap_Entry, JavaIoSerializable >

#pragma mark Public

/*!
 @brief Creates an entry representing the same mapping as the
  specified entry.
 @param entry_ the entry to copy
 */
- (instancetype __nonnull)initWithJavaUtilMap_Entry:(id<JavaUtilMap_Entry>)entry_;

/*!
 @brief Creates an entry representing a mapping from the specified
  key to the specified value.
 @param key the key represented by this entry
 @param value the value represented by this entry
 */
- (instancetype __nonnull)initWithId:(id)key
                              withId:(id)value;

/*!
 @brief Compares the specified object with this entry for equality.
 Returns <code>true</code> if the given object is also a map entry and
  the two entries represent the same mapping.  More formally, two entries 
 <code>e1</code> and <code>e2</code> represent the same mapping
  if@code

    (e1.getKey()==null ?
     e2.getKey()==null :
     e1.getKey().equals(e2.getKey()))   
   &amp;&amp;
    (e1.getValue()==null ?
     e2.getValue()==null :
     e1.getValue().equals(e2.getValue()))
@endcode
  This ensures that the <code>equals</code> method works properly across
  different implementations of the <code>Map.Entry</code> interface.
 @param o object to be compared for equality with this map entry
 @return <code>true</code> if the specified object is equal to this map
          entry
 - seealso: #hashCode
 */
- (jboolean)isEqual:(id)o;

/*!
 @brief Returns the key corresponding to this entry.
 @return the key corresponding to this entry
 */
- (id)getKey;

/*!
 @brief Returns the value corresponding to this entry.
 @return the value corresponding to this entry
 */
- (id)getValue;

/*!
 @brief Returns the hash code value for this map entry.The hash code
  of a map entry <code>e</code> is defined to be: @code

    (e.getKey()==null   ?
 0 : e.getKey().hashCode()) ^
    (e.getValue()==null ? 0 : e.getValue().hashCode())
@endcode
  This ensures that <code>e1.equals(e2)</code> implies that 
 <code>e1.hashCode()==e2.hashCode()</code> for any two Entries 
 <code>e1</code> and <code>e2</code>, as required by the general
  contract of <code>Object.hashCode</code>.
 @return the hash code value for this map entry
 - seealso: #equals
 */
- (NSUInteger)hash;

/*!
 @brief Replaces the value corresponding to this entry with the specified
  value.
 @param value new value to be stored in this entry
 @return the old value corresponding to the entry
 */
- (id)setValueWithId:(id)value;

/*!
 @brief Returns a String representation of this map entry.This
  implementation returns the string representation of this
  entry's key followed by the equals character ("<tt>=</tt>")
  followed by the string representation of this entry's value.
 @return a String representation of this map entry
 */
- (NSString * __nonnull)description;

// Disallowed inherited constructors, do not use.

- (instancetype __nonnull)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilAbstractMap_SimpleEntry)

FOUNDATION_EXPORT void JavaUtilAbstractMap_SimpleEntry_initWithId_withId_(JavaUtilAbstractMap_SimpleEntry *self, id key, id value);

FOUNDATION_EXPORT JavaUtilAbstractMap_SimpleEntry *new_JavaUtilAbstractMap_SimpleEntry_initWithId_withId_(id key, id value) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilAbstractMap_SimpleEntry *create_JavaUtilAbstractMap_SimpleEntry_initWithId_withId_(id key, id value);

FOUNDATION_EXPORT void JavaUtilAbstractMap_SimpleEntry_initWithJavaUtilMap_Entry_(JavaUtilAbstractMap_SimpleEntry *self, id<JavaUtilMap_Entry> entry_);

FOUNDATION_EXPORT JavaUtilAbstractMap_SimpleEntry *new_JavaUtilAbstractMap_SimpleEntry_initWithJavaUtilMap_Entry_(id<JavaUtilMap_Entry> entry_) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilAbstractMap_SimpleEntry *create_JavaUtilAbstractMap_SimpleEntry_initWithJavaUtilMap_Entry_(id<JavaUtilMap_Entry> entry_);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilAbstractMap_SimpleEntry)

#endif

#if !defined (JavaUtilAbstractMap_SimpleImmutableEntry_) && (INCLUDE_ALL_JavaUtilAbstractMap || defined(INCLUDE_JavaUtilAbstractMap_SimpleImmutableEntry))
#define JavaUtilAbstractMap_SimpleImmutableEntry_

#define RESTRICT_JavaUtilMap 1
#define INCLUDE_JavaUtilMap_Entry 1
#include "java/util/Map.h"

#define RESTRICT_JavaIoSerializable 1
#define INCLUDE_JavaIoSerializable 1
#include "java/io/Serializable.h"

/*!
 @brief An Entry maintaining an immutable key and value.This class
  does not support method <tt>setValue</tt>.
 This class may be
  convenient in methods that return thread-safe snapshots of
  key-value mappings.
 @since 1.6
 */
@interface JavaUtilAbstractMap_SimpleImmutableEntry : NSObject < JavaUtilMap_Entry, JavaIoSerializable >

#pragma mark Public

/*!
 @brief Creates an entry representing the same mapping as the
  specified entry.
 @param entry_ the entry to copy
 */
- (instancetype __nonnull)initWithJavaUtilMap_Entry:(id<JavaUtilMap_Entry>)entry_;

/*!
 @brief Creates an entry representing a mapping from the specified
  key to the specified value.
 @param key the key represented by this entry
 @param value the value represented by this entry
 */
- (instancetype __nonnull)initWithId:(id)key
                              withId:(id)value;

/*!
 @brief Compares the specified object with this entry for equality.
 Returns <code>true</code> if the given object is also a map entry and
  the two entries represent the same mapping.  More formally, two entries 
 <code>e1</code> and <code>e2</code> represent the same mapping
  if@code

    (e1.getKey()==null ?
     e2.getKey()==null :
     e1.getKey().equals(e2.getKey()))   
   &amp;&amp;
    (e1.getValue()==null ?
     e2.getValue()==null :
     e1.getValue().equals(e2.getValue()))
@endcode
  This ensures that the <code>equals</code> method works properly across
  different implementations of the <code>Map.Entry</code> interface.
 @param o object to be compared for equality with this map entry
 @return <code>true</code> if the specified object is equal to this map
          entry
 - seealso: #hashCode
 */
- (jboolean)isEqual:(id)o;

/*!
 @brief Returns the key corresponding to this entry.
 @return the key corresponding to this entry
 */
- (id)getKey;

/*!
 @brief Returns the value corresponding to this entry.
 @return the value corresponding to this entry
 */
- (id)getValue;

/*!
 @brief Returns the hash code value for this map entry.The hash code
  of a map entry <code>e</code> is defined to be: @code

    (e.getKey()==null   ?
 0 : e.getKey().hashCode()) ^
    (e.getValue()==null ? 0 : e.getValue().hashCode())
@endcode
  This ensures that <code>e1.equals(e2)</code> implies that 
 <code>e1.hashCode()==e2.hashCode()</code> for any two Entries 
 <code>e1</code> and <code>e2</code>, as required by the general
  contract of <code>Object.hashCode</code>.
 @return the hash code value for this map entry
 - seealso: #equals
 */
- (NSUInteger)hash;

/*!
 @brief Replaces the value corresponding to this entry with the specified
  value (optional operation).This implementation simply throws 
 <tt>UnsupportedOperationException</tt>, as this class implements
  an <i>immutable</i> map entry.
 @param value new value to be stored in this entry
 @return (Does not return)
 @throw UnsupportedOperationExceptionalways
 */
- (id)setValueWithId:(id)value;

/*!
 @brief Returns a String representation of this map entry.This
  implementation returns the string representation of this
  entry's key followed by the equals character ("<tt>=</tt>")
  followed by the string representation of this entry's value.
 @return a String representation of this map entry
 */
- (NSString * __nonnull)description;

// Disallowed inherited constructors, do not use.

- (instancetype __nonnull)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilAbstractMap_SimpleImmutableEntry)

FOUNDATION_EXPORT void JavaUtilAbstractMap_SimpleImmutableEntry_initWithId_withId_(JavaUtilAbstractMap_SimpleImmutableEntry *self, id key, id value);

FOUNDATION_EXPORT JavaUtilAbstractMap_SimpleImmutableEntry *new_JavaUtilAbstractMap_SimpleImmutableEntry_initWithId_withId_(id key, id value) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilAbstractMap_SimpleImmutableEntry *create_JavaUtilAbstractMap_SimpleImmutableEntry_initWithId_withId_(id key, id value);

FOUNDATION_EXPORT void JavaUtilAbstractMap_SimpleImmutableEntry_initWithJavaUtilMap_Entry_(JavaUtilAbstractMap_SimpleImmutableEntry *self, id<JavaUtilMap_Entry> entry_);

FOUNDATION_EXPORT JavaUtilAbstractMap_SimpleImmutableEntry *new_JavaUtilAbstractMap_SimpleImmutableEntry_initWithJavaUtilMap_Entry_(id<JavaUtilMap_Entry> entry_) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilAbstractMap_SimpleImmutableEntry *create_JavaUtilAbstractMap_SimpleImmutableEntry_initWithJavaUtilMap_Entry_(id<JavaUtilMap_Entry> entry_);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilAbstractMap_SimpleImmutableEntry)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaUtilAbstractMap")
