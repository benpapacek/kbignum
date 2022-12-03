//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/util/jar/Manifest.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaUtilJarManifest")
#ifdef RESTRICT_JavaUtilJarManifest
#define INCLUDE_ALL_JavaUtilJarManifest 0
#else
#define INCLUDE_ALL_JavaUtilJarManifest 1
#endif
#undef RESTRICT_JavaUtilJarManifest

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaUtilJarManifest_) && (INCLUDE_ALL_JavaUtilJarManifest || defined(INCLUDE_JavaUtilJarManifest))
#define JavaUtilJarManifest_

@class JavaIoInputStream;
@class JavaIoOutputStream;
@class JavaLangStringBuffer;
@class JavaUtilJarAttributes;
@protocol JavaUtilMap;

/*!
 @brief The Manifest class is used to maintain Manifest entry names and their
  associated Attributes.There are main Manifest Attributes as well as
  per-entry Attributes.
 For information on the Manifest format, please
  see the 
 <a href="../../../../technotes/guides/jar/jar.html">
  Manifest format specification</a>.
 @author David Connelly
 - seealso: Attributes
 @since 1.2
 */
@interface JavaUtilJarManifest : NSObject < NSCopying >

#pragma mark Public

/*!
 @brief Constructs a new, empty Manifest.
 */
- (instancetype __nonnull)init;

/*!
 @brief Constructs a new Manifest from the specified input stream.
 @param is the input stream containing manifest data
 @throw IOExceptionif an I/O error has occurred
 */
- (instancetype __nonnull)initWithJavaIoInputStream:(JavaIoInputStream *)is;

/*!
 @brief Constructs a new Manifest that is a copy of the specified Manifest.
 @param man the Manifest to copy
 */
- (instancetype __nonnull)initWithJavaUtilJarManifest:(JavaUtilJarManifest *)man;

/*!
 @brief Clears the main Attributes as well as the entries in this Manifest.
 */
- (void)clear;

/*!
 @brief Returns a shallow copy of this Manifest.The shallow copy is
  implemented as follows: 
 @code

      public Object clone() { return new Manifest(this); } 
  
@endcode
 @return a shallow copy of this Manifest
 */
- (id)java_clone;

/*!
 @brief Returns true if the specified Object is also a Manifest and has
  the same main Attributes and entries.
 @param o the object to be compared
 @return true if the specified Object is also a Manifest and has
  the same main Attributes and entries
 */
- (jboolean)isEqual:(id)o;

/*!
 @brief Returns the Attributes for the specified entry name.
 This method is defined as: 
 @code

       return (Attributes)getEntries().get(name) 
  
@endcode
  Though <code>null</code> is a valid <code>name</code>, when 
 <code>getAttributes(null)</code> is invoked on a <code>Manifest</code>
  obtained from a jar file, <code>null</code> will be returned.  While jar
  files themselves do not allow <code>null</code>-named attributes, it is
  possible to invoke <code>getEntries</code> on a <code>Manifest</code>, and
  on that result, invoke <code>put</code> with a null key and an
  arbitrary value.  Subsequent invocations of 
 <code>getAttributes(null)</code> will return the just-<code>put</code>
  value. 
 <p>
  Note that this method does not return the manifest's main attributes;
  see <code>getMainAttributes</code>.
 @param name entry name
 @return the Attributes for the specified entry name
 */
- (JavaUtilJarAttributes *)getAttributesWithNSString:(NSString *)name;

/*!
 @brief Returns a Map of the entries contained in this Manifest.Each entry
  is represented by a String name (key) and associated Attributes (value).
 The Map permits the <code>null</code> key, but no entry with a null key is
  created by <code>read</code>, nor is such an entry written by using <code>write</code>
 .
 @return a Map of the entries contained in this Manifest
 */
- (id<JavaUtilMap>)getEntries;

/*!
 @brief Returns the main Attributes for the Manifest.
 @return the main Attributes for the Manifest
 */
- (JavaUtilJarAttributes *)getMainAttributes;

/*!
 @brief Returns the hash code for this Manifest.
 */
- (NSUInteger)hash;

/*!
 @brief Reads the Manifest from the specified InputStream.The entry
  names and attributes read will be merged in with the current
  manifest entries.
 @param is the input stream
 @throw IOExceptionif an I/O error has occurred
 */
- (void)readWithJavaIoInputStream:(JavaIoInputStream *)is;

/*!
 @brief Writes the Manifest to the specified OutputStream.
 Attributes.Name.MANIFEST_VERSION must be set in
  MainAttributes prior to invoking this method.
 @param outArg the output stream
 @throw IOExceptionif an I/O error has occurred
 - seealso: #getMainAttributes
 */
- (void)writeWithJavaIoOutputStream:(JavaIoOutputStream *)outArg;

#pragma mark Package-Private

/*!
 @brief Adds line breaks to enforce a maximum 72 bytes per line.
 */
+ (void)make72SafeWithJavaLangStringBuffer:(JavaLangStringBuffer *)line;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilJarManifest)

FOUNDATION_EXPORT void JavaUtilJarManifest_init(JavaUtilJarManifest *self);

FOUNDATION_EXPORT JavaUtilJarManifest *new_JavaUtilJarManifest_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilJarManifest *create_JavaUtilJarManifest_init(void);

FOUNDATION_EXPORT void JavaUtilJarManifest_initWithJavaIoInputStream_(JavaUtilJarManifest *self, JavaIoInputStream *is);

FOUNDATION_EXPORT JavaUtilJarManifest *new_JavaUtilJarManifest_initWithJavaIoInputStream_(JavaIoInputStream *is) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilJarManifest *create_JavaUtilJarManifest_initWithJavaIoInputStream_(JavaIoInputStream *is);

FOUNDATION_EXPORT void JavaUtilJarManifest_initWithJavaUtilJarManifest_(JavaUtilJarManifest *self, JavaUtilJarManifest *man);

FOUNDATION_EXPORT JavaUtilJarManifest *new_JavaUtilJarManifest_initWithJavaUtilJarManifest_(JavaUtilJarManifest *man) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilJarManifest *create_JavaUtilJarManifest_initWithJavaUtilJarManifest_(JavaUtilJarManifest *man);

FOUNDATION_EXPORT void JavaUtilJarManifest_make72SafeWithJavaLangStringBuffer_(JavaLangStringBuffer *line);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilJarManifest)

#endif

#if !defined (JavaUtilJarManifest_FastInputStream_) && (INCLUDE_ALL_JavaUtilJarManifest || defined(INCLUDE_JavaUtilJarManifest_FastInputStream))
#define JavaUtilJarManifest_FastInputStream_

#define RESTRICT_JavaIoFilterInputStream 1
#define INCLUDE_JavaIoFilterInputStream 1
#include "java/io/FilterInputStream.h"

@class IOSByteArray;
@class JavaIoInputStream;

@interface JavaUtilJarManifest_FastInputStream : JavaIoFilterInputStream

#pragma mark Public

- (jint)available;

- (void)close;

- (jbyte)peek;

- (jint)read;

- (jint)readWithByteArray:(IOSByteArray *)b
                  withInt:(jint)off
                  withInt:(jint)len;

- (jint)readLineWithByteArray:(IOSByteArray *)b;

- (jint)readLineWithByteArray:(IOSByteArray *)b
                      withInt:(jint)off
                      withInt:(jint)len;

- (jlong)skipWithLong:(jlong)n;

#pragma mark Package-Private

- (instancetype __nonnull)initWithJavaIoInputStream:(JavaIoInputStream *)inArg;

- (instancetype __nonnull)initWithJavaIoInputStream:(JavaIoInputStream *)inArg
                                            withInt:(jint)size;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilJarManifest_FastInputStream)

FOUNDATION_EXPORT void JavaUtilJarManifest_FastInputStream_initWithJavaIoInputStream_(JavaUtilJarManifest_FastInputStream *self, JavaIoInputStream *inArg);

FOUNDATION_EXPORT JavaUtilJarManifest_FastInputStream *new_JavaUtilJarManifest_FastInputStream_initWithJavaIoInputStream_(JavaIoInputStream *inArg) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilJarManifest_FastInputStream *create_JavaUtilJarManifest_FastInputStream_initWithJavaIoInputStream_(JavaIoInputStream *inArg);

FOUNDATION_EXPORT void JavaUtilJarManifest_FastInputStream_initWithJavaIoInputStream_withInt_(JavaUtilJarManifest_FastInputStream *self, JavaIoInputStream *inArg, jint size);

FOUNDATION_EXPORT JavaUtilJarManifest_FastInputStream *new_JavaUtilJarManifest_FastInputStream_initWithJavaIoInputStream_withInt_(JavaIoInputStream *inArg, jint size) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilJarManifest_FastInputStream *create_JavaUtilJarManifest_FastInputStream_initWithJavaIoInputStream_withInt_(JavaIoInputStream *inArg, jint size);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilJarManifest_FastInputStream)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaUtilJarManifest")
