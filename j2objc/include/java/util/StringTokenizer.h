//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/util/StringTokenizer.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaUtilStringTokenizer")
#ifdef RESTRICT_JavaUtilStringTokenizer
#define INCLUDE_ALL_JavaUtilStringTokenizer 0
#else
#define INCLUDE_ALL_JavaUtilStringTokenizer 1
#endif
#undef RESTRICT_JavaUtilStringTokenizer

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaUtilStringTokenizer_) && (INCLUDE_ALL_JavaUtilStringTokenizer || defined(INCLUDE_JavaUtilStringTokenizer))
#define JavaUtilStringTokenizer_

#define RESTRICT_JavaUtilEnumeration 1
#define INCLUDE_JavaUtilEnumeration 1
#include "java/util/Enumeration.h"

/*!
 @brief The string tokenizer class allows an application to break a
  string into tokens.The tokenization method is much simpler than
  the one used by the <code>StreamTokenizer</code> class.
 The 
 <code>StringTokenizer</code> methods do not distinguish among
  identifiers, numbers, and quoted strings, nor do they recognize
  and skip comments. 
 <p>
  The set of delimiters (the characters that separate tokens) may
  be specified either at creation time or on a per-token basis. 
 <p>
  An instance of <code>StringTokenizer</code> behaves in one of two
  ways, depending on whether it was created with the 
 <code>returnDelims</code> flag having the value <code>true</code>
  or <code>false</code>:
  <ul>
  <li>If the flag is <code>false</code>, delimiter characters serve to
      separate tokens. A token is a maximal sequence of consecutive
      characters that are not delimiters. 
 <li>If the flag is <code>true</code>, delimiter characters are themselves
      considered to be tokens. A token is thus either one delimiter
      character, or a maximal sequence of consecutive characters that are
      not delimiters. 
 </ul><p>
  A <tt>StringTokenizer</tt> object internally maintains a current
  position within the string to be tokenized. Some operations advance this
  current position past the characters processed.<p>
  A token is returned by taking a substring of the string that was used to
  create the <tt>StringTokenizer</tt> object. 
 <p>
  The following is one example of the use of the tokenizer. The code: 
 <blockquote>@code

      StringTokenizer st = new StringTokenizer("this is a test");
      while (st.hasMoreTokens()) {
          System.out.println(st.nextToken());
      } 
  
@endcode</blockquote>
  <p>
  prints the following output: 
 <blockquote>@code

      this
      is
      a
      test 
  
@endcode</blockquote>
  
 <p>
  <tt>StringTokenizer</tt> is a legacy class that is retained for
  compatibility reasons although its use is discouraged in new code. It is
  recommended that anyone seeking this functionality use the <tt>split</tt>
  method of <tt>String</tt> or the java.util.regex package instead. 
 <p>
  The following example illustrates how the <tt>String.split</tt>
  method can be used to break up a string into its basic tokens: 
 <blockquote>@code

      String[] result = "this is a test".split("\\s");
      for (int x=0; x&lt;result.length; x++)
          System.out.println(result[x]); 
  
@endcode</blockquote>
  <p>
  prints the following output: 
 <blockquote>@code

      this
      is
      a
      test 
  
@endcode</blockquote>
 @author unascribed
 - seealso: java.io.StreamTokenizer
 @since JDK1.0
 */
@interface JavaUtilStringTokenizer : NSObject < JavaUtilEnumeration >

#pragma mark Public

/*!
 @brief Constructs a string tokenizer for the specified string.The
  tokenizer uses the default delimiter set, which is 
 <code>"&nbsp;&#92;t&#92;n&#92;r&#92;f"</code>: the space character,
  the tab character, the newline character, the carriage-return character,
  and the form-feed character.
 Delimiter characters themselves will
  not be treated as tokens.
 @param str a string to be parsed.
 @throw NullPointerExceptionif str is <CODE>null</CODE>
 */
- (instancetype __nonnull)initWithNSString:(NSString *)str;

/*!
 @brief Constructs a string tokenizer for the specified string.The
  characters in the <code>delim</code> argument are the delimiters
  for separating tokens.
 Delimiter characters themselves will not
  be treated as tokens. 
 <p>
  Note that if <tt>delim</tt> is <tt>null</tt>, this constructor does
  not throw an exception. However, trying to invoke other methods on the
  resulting <tt>StringTokenizer</tt> may result in a 
 <tt>NullPointerException</tt>.
 @param str a string to be parsed.
 @param delim the delimiters.
 @throw NullPointerExceptionif str is <CODE>null</CODE>
 */
- (instancetype __nonnull)initWithNSString:(NSString *)str
                              withNSString:(NSString *)delim;

/*!
 @brief Constructs a string tokenizer for the specified string.All
  characters in the <code>delim</code> argument are the delimiters
  for separating tokens.
 <p>
  If the <code>returnDelims</code> flag is <code>true</code>, then
  the delimiter characters are also returned as tokens. Each
  delimiter is returned as a string of length one. If the flag is 
 <code>false</code>, the delimiter characters are skipped and only
  serve as separators between tokens. 
 <p>
  Note that if <tt>delim</tt> is <tt>null</tt>, this constructor does
  not throw an exception. However, trying to invoke other methods on the
  resulting <tt>StringTokenizer</tt> may result in a 
 <tt>NullPointerException</tt>.
 @param str a string to be parsed.
 @param delim the delimiters.
 @param returnDelims flag indicating whether to return the delimiters                          as tokens.
 @throw NullPointerExceptionif str is <CODE>null</CODE>
 */
- (instancetype __nonnull)initWithNSString:(NSString *)str
                              withNSString:(NSString *)delim
                               withBoolean:(jboolean)returnDelims;

/*!
 @brief Calculates the number of times that this tokenizer's 
 <code>nextToken</code> method can be called before it generates an
  exception.The current position is not advanced.
 @return the number of tokens remaining in the string using the current
           delimiter set.
 - seealso: java.util.StringTokenizer#nextToken()
 */
- (jint)countTokens;

/*!
 @brief Returns the same value as the <code>hasMoreTokens</code>
  method.It exists so that this class can implement the 
 <code>Enumeration</code> interface.
 @return <code>true</code> if there are more tokens;
           <code>false</code> otherwise.
 - seealso: java.util.Enumeration
 - seealso: java.util.StringTokenizer#hasMoreTokens()
 */
- (jboolean)hasMoreElements;

/*!
 @brief Tests if there are more tokens available from this tokenizer's string.
 If this method returns <tt>true</tt>, then a subsequent call to 
 <tt>nextToken</tt> with no argument will successfully return a token.
 @return <code>true</code> if and only if there is at least one token
           in the string after the current position; <code>false</code>
           otherwise.
 */
- (jboolean)hasMoreTokens;

/*!
 @brief Returns the same value as the <code>nextToken</code> method,
  except that its declared return value is <code>Object</code> rather than 
 <code>String</code>.It exists so that this class can implement the 
 <code>Enumeration</code> interface.
 @return the next token in the string.
 @throw NoSuchElementExceptionif there are no more tokens in this
                tokenizer's string.
 - seealso: java.util.Enumeration
 - seealso: java.util.StringTokenizer#nextToken()
 */
- (id)nextElement;

/*!
 @brief Returns the next token from this string tokenizer.
 @return the next token from this string tokenizer.
 @throw NoSuchElementExceptionif there are no more tokens in this
                tokenizer's string.
 */
- (NSString *)nextToken;

/*!
 @brief Returns the next token in this string tokenizer's string.First,
  the set of characters considered to be delimiters by this 
 <tt>StringTokenizer</tt> object is changed to be the characters in
  the string <tt>delim</tt>.
 Then the next token in the string
  after the current position is returned. The current position is
  advanced beyond the recognized token.  The new delimiter set
  remains the default after this call.
 @param delim the new delimiters.
 @return the next token, after switching to the new delimiter set.
 @throw NoSuchElementExceptionif there are no more tokens in this
                tokenizer's string.
 @throw NullPointerExceptionif delim is <CODE>null</CODE>
 */
- (NSString *)nextTokenWithNSString:(NSString *)delim;

// Disallowed inherited constructors, do not use.

- (instancetype __nonnull)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(JavaUtilStringTokenizer)

FOUNDATION_EXPORT void JavaUtilStringTokenizer_initWithNSString_withNSString_withBoolean_(JavaUtilStringTokenizer *self, NSString *str, NSString *delim, jboolean returnDelims);

FOUNDATION_EXPORT JavaUtilStringTokenizer *new_JavaUtilStringTokenizer_initWithNSString_withNSString_withBoolean_(NSString *str, NSString *delim, jboolean returnDelims) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilStringTokenizer *create_JavaUtilStringTokenizer_initWithNSString_withNSString_withBoolean_(NSString *str, NSString *delim, jboolean returnDelims);

FOUNDATION_EXPORT void JavaUtilStringTokenizer_initWithNSString_withNSString_(JavaUtilStringTokenizer *self, NSString *str, NSString *delim);

FOUNDATION_EXPORT JavaUtilStringTokenizer *new_JavaUtilStringTokenizer_initWithNSString_withNSString_(NSString *str, NSString *delim) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilStringTokenizer *create_JavaUtilStringTokenizer_initWithNSString_withNSString_(NSString *str, NSString *delim);

FOUNDATION_EXPORT void JavaUtilStringTokenizer_initWithNSString_(JavaUtilStringTokenizer *self, NSString *str);

FOUNDATION_EXPORT JavaUtilStringTokenizer *new_JavaUtilStringTokenizer_initWithNSString_(NSString *str) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT JavaUtilStringTokenizer *create_JavaUtilStringTokenizer_initWithNSString_(NSString *str);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilStringTokenizer)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaUtilStringTokenizer")
