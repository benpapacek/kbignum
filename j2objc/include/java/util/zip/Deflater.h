//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/util/zip/Deflater.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaUtilZipDeflater")
#ifdef RESTRICT_JavaUtilZipDeflater
#define INCLUDE_ALL_JavaUtilZipDeflater 0
#else
#define INCLUDE_ALL_JavaUtilZipDeflater 1
#endif
#undef RESTRICT_JavaUtilZipDeflater

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaUtilZipDeflater_) && (INCLUDE_ALL_JavaUtilZipDeflater || defined(INCLUDE_JavaUtilZipDeflater))
#define JavaUtilZipDeflater_

@class IOSByteArray;

/*!
 @brief This class provides support for general purpose compression using the
  popular ZLIB compression library.The ZLIB compression library was
  initially developed as part of the PNG graphics standard and is not
  protected by patents.
 It is fully described in the specifications at the 
 <a href="package-summary.html#package_description">java.util.zip
  package description</a>.
  
 <p>The following code fragment demonstrates a trivial compression
  and decompression of a string using <tt>Deflater</tt> and 
 <tt>Inflater</tt>.
  
 <blockquote>@code

  try {
      // Encode a String into bytes
      String inputString = "blahblahblah";
      byte[] input = inputString.getBytes("UTF-8");
      // Compress the bytes
      byte[] output = new byte[100];
      Deflater compresser = new Deflater();
      compresser.setInput(input);
      compresser.finish();
      int compressedDataLength = compresser.deflate(output);
      compresser.end();
      // Decompress the bytes
      Inflater decompresser = new Inflater();
      decompresser.setInput(output, 0, compressedDataLength);
      byte[] result = new byte[100];
      int resultLength = decompresser.inflate(result);
      decompresser.end();
      // Decode the bytes into a String
      String outputString = new String(result, 0, resultLength, "UTF-8");
  } catch(java.io.UnsupportedEncodingException ex) {
      // handle
  } catch (java.util.zip.DataFormatException ex) {
      // handle
  } 
  
@endcode</blockquote>
 - seealso: Inflater
 @author David Connelly
 */
@interface JavaUtilZipDeflater : NSObject {
 @public
  IOSByteArray *buf_;
  jint off_;
  jint len_;
  jint level_;
  jint strategy_;
  jboolean setParams_;
  jboolean finish_;
  jboolean finished_;
}

#pragma mark Public

/*!
 @brief Creates a new compressor with the default compression level.
 Compressed data will be generated in ZLIB format.
 */
- (instancetype __nonnull)init;

/*!
 @brief Creates a new compressor using the specified compression level.
 Compressed data will be generated in ZLIB format.
 @param level the compression level (0-9)
 */
- (instancetype __nonnull)initWithInt:(jint)level;

/*!
 @brief Creates a new compressor using the specified compression level.
 If 'nowrap' is true then the ZLIB header and checksum fields will
  not be used in order to support the compression format used in
  both GZIP and PKZIP.
 @param level the compression level (0-9)
 @param nowrap if true then use GZIP compatible compression
 */
- (instancetype __nonnull)initWithInt:(jint)level
                          withBoolean:(jboolean)nowrap;

/*!
 @brief Compresses the input data and fills specified buffer with compressed
  data.Returns actual number of bytes of compressed data.
 A return value
  of 0 indicates that <code>needsInput</code> should be called
  in order to determine if more input data is required. 
 <p>This method uses <code>NO_FLUSH</code> as its compression flush mode.
  An invocation of this method of the form <code>deflater.deflate(b)</code>
  yields the same result as the invocation of 
 <code>deflater.deflate(b, 0, b.length, Deflater.NO_FLUSH)</code>.
 @param b the buffer for the compressed data
 @return the actual number of bytes of compressed data written to the
          output buffer
 */
- (jint)deflateWithByteArray:(IOSByteArray *)b;

/*!
 @brief Compresses the input data and fills specified buffer with compressed
  data.Returns actual number of bytes of compressed data.
 A return value
  of 0 indicates that <code>needsInput</code> should be called
  in order to determine if more input data is required. 
 <p>This method uses <code>NO_FLUSH</code> as its compression flush mode.
  An invocation of this method of the form <code>deflater.deflate(b, off, len)</code>
  yields the same result as the invocation of 
 <code>deflater.deflate(b, off, len, Deflater.NO_FLUSH)</code>.
 @param b the buffer for the compressed data
 @param off the start offset of the data
 @param len the maximum number of bytes of compressed data
 @return the actual number of bytes of compressed data written to the
          output buffer
 */
- (jint)deflateWithByteArray:(IOSByteArray *)b
                     withInt:(jint)off
                     withInt:(jint)len;

/*!
 @brief Compresses the input data and fills the specified buffer with compressed
  data.Returns actual number of bytes of data compressed.
 <p>Compression flush mode is one of the following three modes: 
 <ul>
  <li><code>NO_FLUSH</code>: allows the deflater to decide how much data
  to accumulate, before producing output, in order to achieve the best
  compression (should be used in normal use scenario). A return value
  of 0 in this flush mode indicates that <code>needsInput()</code> should
  be called in order to determine if more input data is required. 
 <li><code>SYNC_FLUSH</code>: all pending output in the deflater is flushed,
  to the specified output buffer, so that an inflater that works on
  compressed data can get all input data available so far (In particular
  the <code>needsInput()</code> returns <code>true</code> after this invocation
  if enough output space is provided). Flushing with <code>SYNC_FLUSH</code>
  may degrade compression for some compression algorithms and so it
  should be used only when necessary. 
 <li><code>FULL_FLUSH</code>: all pending output is flushed out as with 
 <code>SYNC_FLUSH</code>. The compression state is reset so that the inflater
  that works on the compressed output data can restart from this point
  if previous compressed data has been damaged or if random access is
  desired. Using <code>FULL_FLUSH</code> too often can seriously degrade
  compression. 
 </ul>
  
 <p>In the case of <code>FULL_FLUSH</code> or <code>SYNC_FLUSH</code>, if
  the return value is <code>len</code>, the space available in output
  buffer <code>b</code>, this method should be invoked again with the same 
 <code>flush</code> parameter and more output space.
 @param b the buffer for the compressed data
 @param off the start offset of the data
 @param len the maximum number of bytes of compressed data
 @param flush the compression flush mode
 @return the actual number of bytes of compressed data written to
          the output buffer
 @throw IllegalArgumentExceptionif the flush mode is invalid
 @since 1.7
 */
- (jint)deflateWithByteArray:(IOSByteArray *)b
                     withInt:(jint)off
                     withInt:(jint)len
                     withInt:(jint)flush;

/*!
 @brief Closes the compressor and discards any unprocessed input.
 This method should be called when the compressor is no longer
  being used, but will also be called automatically by the
  finalize() method. Once this method is called, the behavior
  of the Deflater object is undefined.
 */
- (void)end;

/*!
 @brief When called, indicates that compression should end with the current
  contents of the input buffer.
 */
- (void)finish;

/*!
 @brief Returns true if the end of the compressed data output stream has
  been reached.
 @return true if the end of the compressed data output stream has
  been reached
 */
- (jboolean)finished;

/*!
 @brief Returns the ADLER-32 value of the uncompressed data.
 @return the ADLER-32 value of the uncompressed data
 */
- (jint)getAdler;

/*!
 @brief Returns the total number of uncompressed bytes input so far.
 @return the total (non-negative) number of uncompressed bytes input so far
 @since 1.5
 */
- (jlong)getBytesRead;

/*!
 @brief Returns the total number of compressed bytes output so far.
 @return the total (non-negative) number of compressed bytes output so far
 @since 1.5
 */
- (jlong)getBytesWritten;

/*!
 @brief Returns the total number of uncompressed bytes input so far.
 <p>Since the number of bytes may be greater than
  Integer.MAX_VALUE, the <code>getBytesRead()</code> method is now
  the preferred means of obtaining this information.</p>
 @return the total number of uncompressed bytes input so far
 */
- (jint)getTotalIn;

/*!
 @brief Returns the total number of compressed bytes output so far.
 <p>Since the number of bytes may be greater than
  Integer.MAX_VALUE, the <code>getBytesWritten()</code> method is now
  the preferred means of obtaining this information.</p>
 @return the total number of compressed bytes output so far
 */
- (jint)getTotalOut;

/*!
 @brief Returns true if the input data buffer is empty and setInput()
  should be called in order to provide more input.
 @return true if the input data buffer is empty and setInput()
  should be called in order to provide more input
 */
- (jboolean)needsInput;

/*!
 @brief Resets deflater so that a new set of input data can be processed.
 Keeps current compression level and strategy settings.
 */
- (void)reset;

/*!
 @brief Sets preset dictionary for compression.A preset dictionary is used
  when the history buffer can be predetermined.
 When the data is later
  uncompressed with Inflater.inflate(), Inflater.getAdler() can be called
  in order to get the Adler-32 value of the dictionary required for
  decompression.
 @param b the dictionary data bytes
 - seealso: Inflater#inflate
 - seealso: Inflater#getAdler
 */
- (void)setDictionaryWithByteArray:(IOSByteArray *)b;

/*!
 @brief Sets preset dictionary for compression.A preset dictionary is used
  when the history buffer can be predetermined.
 When the data is later
  uncompressed with Inflater.inflate(), Inflater.getAdler() can be called
  in order to get the Adler-32 value of the dictionary required for
  decompression.
 @param b the dictionary data bytes
 @param off the start offset of the data
 @param len the length of the data
 - seealso: Inflater#inflate
 - seealso: Inflater#getAdler
 */
- (void)setDictionaryWithByteArray:(IOSByteArray *)b
                           withInt:(jint)off
                           withInt:(jint)len;

/*!
 @brief Sets input data for compression.This should be called whenever
  needsInput() returns true indicating that more input data is required.
 @param b the input data bytes
 - seealso: Deflater#needsInput
 */
- (void)setInputWithByteArray:(IOSByteArray *)b;

/*!
 @brief Sets input data for compression.This should be called whenever
  needsInput() returns true indicating that more input data is required.
 @param b the input data bytes
 @param off the start offset of the data
 @param len the length of the data
 - seealso: Deflater#needsInput
 */
- (void)setInputWithByteArray:(IOSByteArray *)b
                      withInt:(jint)off
                      withInt:(jint)len;

/*!
 @brief Sets the compression level to the specified value.
 <p> If the compression level is changed, the next invocation
  of <code>deflate</code> will compress the input available so far
  with the old level (and may be flushed); the new level will
  take effect only after that invocation.
 @param level the new compression level (0-9)
 @throw IllegalArgumentExceptionif the compression level is invalid
 */
- (void)setLevelWithInt:(jint)level;

/*!
 @brief Sets the compression strategy to the specified value.
 <p> If the compression strategy is changed, the next invocation
  of <code>deflate</code> will compress the input available so far with
  the old strategy (and may be flushed); the new strategy will take
  effect only after that invocation.
 @param strategy the new compression strategy
 @throw IllegalArgumentExceptionif the compression strategy is
                                      invalid
 */
- (void)setStrategyWithInt:(jint)strategy;

#pragma mark Protected

/*!
 @brief Closes the compressor when garbage is collected.
 */
- (void)java_finalize;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilZipDeflater)

J2OBJC_FIELD_SETTER(JavaUtilZipDeflater, buf_, IOSByteArray *)

/*!
 @brief Compression method for the deflate algorithm (the only one currently
  supported).
 */
inline jint JavaUtilZipDeflater_get_DEFLATED(void);
#define JavaUtilZipDeflater_DEFLATED 8
J2OBJC_STATIC_FIELD_CONSTANT(JavaUtilZipDeflater, DEFLATED, jint)

/*!
 @brief Compression level for no compression.
 */
inline jint JavaUtilZipDeflater_get_NO_COMPRESSION(void);
#define JavaUtilZipDeflater_NO_COMPRESSION 0
J2OBJC_STATIC_FIELD_CONSTANT(JavaUtilZipDeflater, NO_COMPRESSION, jint)

/*!
 @brief Compression level for fastest compression.
 */
inline jint JavaUtilZipDeflater_get_BEST_SPEED(void);
#define JavaUtilZipDeflater_BEST_SPEED 1
J2OBJC_STATIC_FIELD_CONSTANT(JavaUtilZipDeflater, BEST_SPEED, jint)

/*!
 @brief Compression level for best compression.
 */
inline jint JavaUtilZipDeflater_get_BEST_COMPRESSION(void);
#define JavaUtilZipDeflater_BEST_COMPRESSION 9
J2OBJC_STATIC_FIELD_CONSTANT(JavaUtilZipDeflater, BEST_COMPRESSION, jint)

/*!
 @brief Default compression level.
 */
inline jint JavaUtilZipDeflater_get_DEFAULT_COMPRESSION(void);
#define JavaUtilZipDeflater_DEFAULT_COMPRESSION -1
J2OBJC_STATIC_FIELD_CONSTANT(JavaUtilZipDeflater, DEFAULT_COMPRESSION, jint)

/*!
 @brief Compression strategy best used for data consisting mostly of small
  values with a somewhat random distribution.Forces more Huffman coding
  and less string matching.
 */
inline jint JavaUtilZipDeflater_get_FILTERED(void);
#define JavaUtilZipDeflater_FILTERED 1
J2OBJC_STATIC_FIELD_CONSTANT(JavaUtilZipDeflater, FILTERED, jint)

/*!
 @brief Compression strategy for Huffman coding only.
 */
inline jint JavaUtilZipDeflater_get_HUFFMAN_ONLY(void);
#define JavaUtilZipDeflater_HUFFMAN_ONLY 2
J2OBJC_STATIC_FIELD_CONSTANT(JavaUtilZipDeflater, HUFFMAN_ONLY, jint)

/*!
 @brief Default compression strategy.
 */
inline jint JavaUtilZipDeflater_get_DEFAULT_STRATEGY(void);
#define JavaUtilZipDeflater_DEFAULT_STRATEGY 0
J2OBJC_STATIC_FIELD_CONSTANT(JavaUtilZipDeflater, DEFAULT_STRATEGY, jint)

/*!
 @brief Compression flush mode used to achieve best compression result.
 - seealso: Deflater#deflate(byte[], int, int, int)
 @since 1.7
 */
inline jint JavaUtilZipDeflater_get_NO_FLUSH(void);
#define JavaUtilZipDeflater_NO_FLUSH 0
J2OBJC_STATIC_FIELD_CONSTANT(JavaUtilZipDeflater, NO_FLUSH, jint)

/*!
 @brief Compression flush mode used to flush out all pending output; may
  degrade compression for some compression algorithms.
 - seealso: Deflater#deflate(byte[], int, int, int)
 @since 1.7
 */
inline jint JavaUtilZipDeflater_get_SYNC_FLUSH(void);
#define JavaUtilZipDeflater_SYNC_FLUSH 2
J2OBJC_STATIC_FIELD_CONSTANT(JavaUtilZipDeflater, SYNC_FLUSH, jint)

/*!
 @brief Compression flush mode used to flush out all pending output and
  reset the deflater.Using this mode too often can seriously degrade
  compression.
 - seealso: Deflater#deflate(byte[], int, int, int)
 @since 1.7
 */
inline jint JavaUtilZipDeflater_get_FULL_FLUSH(void);
#define JavaUtilZipDeflater_FULL_FLUSH 3
J2OBJC_STATIC_FIELD_CONSTANT(JavaUtilZipDeflater, FULL_FLUSH, jint)

FOUNDATION_EXPORT void JavaUtilZipDeflater_initWithInt_withBoolean_(JavaUtilZipDeflater *self, jint level, jboolean nowrap);

FOUNDATION_EXPORT JavaUtilZipDeflater *new_JavaUtilZipDeflater_initWithInt_withBoolean_(jint level, jboolean nowrap) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilZipDeflater *create_JavaUtilZipDeflater_initWithInt_withBoolean_(jint level, jboolean nowrap);

FOUNDATION_EXPORT void JavaUtilZipDeflater_initWithInt_(JavaUtilZipDeflater *self, jint level);

FOUNDATION_EXPORT JavaUtilZipDeflater *new_JavaUtilZipDeflater_initWithInt_(jint level) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilZipDeflater *create_JavaUtilZipDeflater_initWithInt_(jint level);

FOUNDATION_EXPORT void JavaUtilZipDeflater_init(JavaUtilZipDeflater *self);

FOUNDATION_EXPORT JavaUtilZipDeflater *new_JavaUtilZipDeflater_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilZipDeflater *create_JavaUtilZipDeflater_init(void);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilZipDeflater)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaUtilZipDeflater")
