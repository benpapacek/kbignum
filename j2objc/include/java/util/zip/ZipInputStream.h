//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/util/zip/ZipInputStream.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaUtilZipZipInputStream")
#ifdef RESTRICT_JavaUtilZipZipInputStream
#define INCLUDE_ALL_JavaUtilZipZipInputStream 0
#else
#define INCLUDE_ALL_JavaUtilZipZipInputStream 1
#endif
#undef RESTRICT_JavaUtilZipZipInputStream

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaUtilZipZipInputStream_) && (INCLUDE_ALL_JavaUtilZipZipInputStream || defined(INCLUDE_JavaUtilZipZipInputStream))
#define JavaUtilZipZipInputStream_

#define RESTRICT_JavaUtilZipInflaterInputStream 1
#define INCLUDE_JavaUtilZipInflaterInputStream 1
#include "java/util/zip/InflaterInputStream.h"

#define RESTRICT_JavaUtilZipZipConstants 1
#define INCLUDE_JavaUtilZipZipConstants 1
#include "java/util/zip/ZipConstants.h"

@class IOSByteArray;
@class JavaIoInputStream;
@class JavaNioCharsetCharset;
@class JavaUtilZipInflater;
@class JavaUtilZipZipEntry;

/*!
 @brief This class implements an input stream filter for reading files in the
  ZIP file format.Includes support for both compressed and uncompressed
  entries.
 @author David Connelly
 */
@interface JavaUtilZipZipInputStream : JavaUtilZipInflaterInputStream < JavaUtilZipZipConstants >

#pragma mark Public

/*!
 @brief Creates a new ZIP input stream.
 <p>The UTF-8 <code>charset</code> is used to
  decode the entry names.
 @param inArg the actual input stream
 */
- (instancetype __nonnull)initWithJavaIoInputStream:(JavaIoInputStream *)inArg;

/*!
 @brief Creates a new ZIP input stream.
 @param inArg the actual input stream
 @param charset The 
 charset  to be         used to decode the ZIP entry name (ignored if the
           <a href="package-summary.html#lang_encoding">
   language         encoding bit </a>
   of the ZIP entry's general purpose bit         flag is set).
 @since 1.7
 */
- (instancetype __nonnull)initWithJavaIoInputStream:(JavaIoInputStream *)inArg
                          withJavaNioCharsetCharset:(JavaNioCharsetCharset *)charset;

/*!
 @brief Returns 0 after EOF has reached for the current entry data,
  otherwise always return 1.
 <p>
  Programs should not count on this method to return the actual number
  of bytes that could be read without blocking.
 @return 1 before EOF and 0 after EOF has reached for current entry.
 @throw IOExceptionif an I/O error occurs.
 */
- (jint)available;

/*!
 @brief Closes this input stream and releases any system resources associated
  with the stream.
 @throw IOExceptionif an I/O error has occurred
 */
- (void)close;

/*!
 @brief Closes the current ZIP entry and positions the stream for reading the
  next entry.
 @throw ZipExceptionif a ZIP file error has occurred
 @throw IOExceptionif an I/O error has occurred
 */
- (void)closeEntry;

/*!
 @brief Reads the next ZIP file entry and positions the stream at the
  beginning of the entry data.
 @return the next ZIP file entry, or null if there are no more entries
 @throw ZipExceptionif a ZIP file error has occurred
 @throw IOExceptionif an I/O error has occurred
 */
- (JavaUtilZipZipEntry *)getNextEntry;

/*!
 @brief Reads from the current ZIP entry into an array of bytes.
 If <code>len</code> is not zero, the method
  blocks until some input is available; otherwise, no
  bytes are read and <code>0</code> is returned.
 @param b the buffer into which the data is read
 @param off the start offset in the destination array  <code> b </code>
 @param len the maximum number of bytes read
 @return the actual number of bytes read, or -1 if the end of the
          entry is reached
 @throw NullPointerExceptionif <code>b</code> is <code>null</code>.
 @throw IndexOutOfBoundsExceptionif <code>off</code> is negative, 
 <code>len</code> is negative, or <code>len</code> is greater than 
 <code>b.length - off</code>
 @throw ZipExceptionif a ZIP file error has occurred
 @throw IOExceptionif an I/O error has occurred
 */
- (jint)readWithByteArray:(IOSByteArray *)b
                  withInt:(jint)off
                  withInt:(jint)len;

/*!
 @brief Skips specified number of bytes in the current ZIP entry.
 @param n the number of bytes to skip
 @return the actual number of bytes skipped
 @throw ZipExceptionif a ZIP file error has occurred
 @throw IOExceptionif an I/O error has occurred
 @throw IllegalArgumentExceptionif <code>n < 0</code>
 */
- (jlong)skipWithLong:(jlong)n;

#pragma mark Protected

/*!
 @brief Creates a new <code>ZipEntry</code> object for the specified
  entry name.
 @param name the ZIP file entry name
 @return the ZipEntry just created
 */
- (JavaUtilZipZipEntry *)createZipEntryWithNSString:(NSString *)name;

// Disallowed inherited constructors, do not use.

- (instancetype __nonnull)initWithJavaIoInputStream:(JavaIoInputStream *)arg0
                            withJavaUtilZipInflater:(JavaUtilZipInflater *)arg1 NS_UNAVAILABLE;

- (instancetype __nonnull)initWithJavaIoInputStream:(JavaIoInputStream *)arg0
                            withJavaUtilZipInflater:(JavaUtilZipInflater *)arg1
                                            withInt:(jint)arg2 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilZipZipInputStream)

FOUNDATION_EXPORT void JavaUtilZipZipInputStream_initWithJavaIoInputStream_(JavaUtilZipZipInputStream *self, JavaIoInputStream *inArg);

FOUNDATION_EXPORT JavaUtilZipZipInputStream *new_JavaUtilZipZipInputStream_initWithJavaIoInputStream_(JavaIoInputStream *inArg) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilZipZipInputStream *create_JavaUtilZipZipInputStream_initWithJavaIoInputStream_(JavaIoInputStream *inArg);

FOUNDATION_EXPORT void JavaUtilZipZipInputStream_initWithJavaIoInputStream_withJavaNioCharsetCharset_(JavaUtilZipZipInputStream *self, JavaIoInputStream *inArg, JavaNioCharsetCharset *charset);

FOUNDATION_EXPORT JavaUtilZipZipInputStream *new_JavaUtilZipZipInputStream_initWithJavaIoInputStream_withJavaNioCharsetCharset_(JavaIoInputStream *inArg, JavaNioCharsetCharset *charset) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilZipZipInputStream *create_JavaUtilZipZipInputStream_initWithJavaIoInputStream_withJavaNioCharsetCharset_(JavaIoInputStream *inArg, JavaNioCharsetCharset *charset);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilZipZipInputStream)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaUtilZipZipInputStream")
