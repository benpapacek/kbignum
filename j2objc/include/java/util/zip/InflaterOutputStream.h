//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/util/zip/InflaterOutputStream.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaUtilZipInflaterOutputStream")
#ifdef RESTRICT_JavaUtilZipInflaterOutputStream
#define INCLUDE_ALL_JavaUtilZipInflaterOutputStream 0
#else
#define INCLUDE_ALL_JavaUtilZipInflaterOutputStream 1
#endif
#undef RESTRICT_JavaUtilZipInflaterOutputStream

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaUtilZipInflaterOutputStream_) && (INCLUDE_ALL_JavaUtilZipInflaterOutputStream || defined(INCLUDE_JavaUtilZipInflaterOutputStream))
#define JavaUtilZipInflaterOutputStream_

#define RESTRICT_JavaIoFilterOutputStream 1
#define INCLUDE_JavaIoFilterOutputStream 1
#include "java/io/FilterOutputStream.h"

@class IOSByteArray;
@class JavaIoOutputStream;
@class JavaUtilZipInflater;

/*!
 @brief Implements an output stream filter for uncompressing data stored in the
  "deflate" compression format.
 @since 1.6
 @author David R Tribble (david@@tribble.com)
 - seealso: InflaterInputStream
 - seealso: DeflaterInputStream
 - seealso: DeflaterOutputStream
 */
@interface JavaUtilZipInflaterOutputStream : JavaIoFilterOutputStream {
 @public
  /*!
   @brief Decompressor for this stream.
   */
  JavaUtilZipInflater *inf_;
  /*!
   @brief Output buffer for writing uncompressed data.
   */
  IOSByteArray *buf_;
}

#pragma mark Public

/*!
 @brief Creates a new output stream with a default decompressor and buffer
  size.
 @param outArg output stream to write the uncompressed data to
 @throw NullPointerExceptionif <code>out</code> is null
 */
- (instancetype __nonnull)initWithJavaIoOutputStream:(JavaIoOutputStream *)outArg;

/*!
 @brief Creates a new output stream with the specified decompressor and a
  default buffer size.
 @param outArg output stream to write the uncompressed data to
 @param infl decompressor ("inflater") for this stream
 @throw NullPointerExceptionif <code>out</code> or <code>infl</code> is null
 */
- (instancetype __nonnull)initWithJavaIoOutputStream:(JavaIoOutputStream *)outArg
                             withJavaUtilZipInflater:(JavaUtilZipInflater *)infl;

/*!
 @brief Creates a new output stream with the specified decompressor and
  buffer size.
 @param outArg output stream to write the uncompressed data to
 @param infl decompressor ("inflater") for this stream
 @param bufLen decompression buffer size
 @throw IllegalArgumentExceptionif <code>bufLen <= 0</code>
 @throw NullPointerExceptionif <code>out</code> or <code>infl</code> is null
 */
- (instancetype __nonnull)initWithJavaIoOutputStream:(JavaIoOutputStream *)outArg
                             withJavaUtilZipInflater:(JavaUtilZipInflater *)infl
                                             withInt:(jint)bufLen;

/*!
 @brief Writes any remaining uncompressed data to the output stream and closes
  the underlying output stream.
 @throw IOExceptionif an I/O error occurs
 */
- (void)close;

/*!
 @brief Finishes writing uncompressed data to the output stream without closing
  the underlying stream.Use this method when applying multiple filters in
  succession to the same output stream.
 @throw IOExceptionif an I/O error occurs or this stream is already
  closed
 */
- (void)finish;

/*!
 @brief Flushes this output stream, forcing any pending buffered output bytes to be
  written.
 @throw IOExceptionif an I/O error occurs or this stream is already
  closed
 */
- (void)flush;

/*!
 @brief Writes an array of bytes to the uncompressed output stream.
 @param b buffer containing compressed data to decompress and write to  the output stream
 @param off starting offset of the compressed data within <code>b</code>
 @param len number of bytes to decompress from <code>b</code>
 @throw IndexOutOfBoundsExceptionif <code>off < 0</code>, or if 
 <code>len < 0</code>, or if <code>len > b.length - off</code>
 @throw IOExceptionif an I/O error occurs or this stream is already
  closed
 @throw NullPointerExceptionif <code>b</code> is null
 @throw ZipExceptionif a compression (ZIP) format error occurs
 */
- (void)writeWithByteArray:(IOSByteArray *)b
                   withInt:(jint)off
                   withInt:(jint)len;

/*!
 @brief Writes a byte to the uncompressed output stream.
 @param b a single byte of compressed data to decompress and write to  the output stream
 @throw IOExceptionif an I/O error occurs or this stream is already
  closed
 @throw ZipExceptionif a compression (ZIP) format error occurs
 */
- (void)writeWithInt:(jint)b;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilZipInflaterOutputStream)

J2OBJC_FIELD_SETTER(JavaUtilZipInflaterOutputStream, inf_, JavaUtilZipInflater *)
J2OBJC_FIELD_SETTER(JavaUtilZipInflaterOutputStream, buf_, IOSByteArray *)

FOUNDATION_EXPORT void JavaUtilZipInflaterOutputStream_initWithJavaIoOutputStream_(JavaUtilZipInflaterOutputStream *self, JavaIoOutputStream *outArg);

FOUNDATION_EXPORT JavaUtilZipInflaterOutputStream *new_JavaUtilZipInflaterOutputStream_initWithJavaIoOutputStream_(JavaIoOutputStream *outArg) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilZipInflaterOutputStream *create_JavaUtilZipInflaterOutputStream_initWithJavaIoOutputStream_(JavaIoOutputStream *outArg);

FOUNDATION_EXPORT void JavaUtilZipInflaterOutputStream_initWithJavaIoOutputStream_withJavaUtilZipInflater_(JavaUtilZipInflaterOutputStream *self, JavaIoOutputStream *outArg, JavaUtilZipInflater *infl);

FOUNDATION_EXPORT JavaUtilZipInflaterOutputStream *new_JavaUtilZipInflaterOutputStream_initWithJavaIoOutputStream_withJavaUtilZipInflater_(JavaIoOutputStream *outArg, JavaUtilZipInflater *infl) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilZipInflaterOutputStream *create_JavaUtilZipInflaterOutputStream_initWithJavaIoOutputStream_withJavaUtilZipInflater_(JavaIoOutputStream *outArg, JavaUtilZipInflater *infl);

FOUNDATION_EXPORT void JavaUtilZipInflaterOutputStream_initWithJavaIoOutputStream_withJavaUtilZipInflater_withInt_(JavaUtilZipInflaterOutputStream *self, JavaIoOutputStream *outArg, JavaUtilZipInflater *infl, jint bufLen);

FOUNDATION_EXPORT JavaUtilZipInflaterOutputStream *new_JavaUtilZipInflaterOutputStream_initWithJavaIoOutputStream_withJavaUtilZipInflater_withInt_(JavaIoOutputStream *outArg, JavaUtilZipInflater *infl, jint bufLen) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilZipInflaterOutputStream *create_JavaUtilZipInflaterOutputStream_initWithJavaIoOutputStream_withJavaUtilZipInflater_withInt_(JavaIoOutputStream *outArg, JavaUtilZipInflater *infl, jint bufLen);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilZipInflaterOutputStream)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaUtilZipInflaterOutputStream")
