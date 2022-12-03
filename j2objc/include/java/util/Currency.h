//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/util/Currency.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaUtilCurrency")
#ifdef RESTRICT_JavaUtilCurrency
#define INCLUDE_ALL_JavaUtilCurrency 0
#else
#define INCLUDE_ALL_JavaUtilCurrency 1
#endif
#undef RESTRICT_JavaUtilCurrency

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaUtilCurrency_) && (INCLUDE_ALL_JavaUtilCurrency || defined(INCLUDE_JavaUtilCurrency))
#define JavaUtilCurrency_

#define RESTRICT_JavaIoSerializable 1
#define INCLUDE_JavaIoSerializable 1
#include "java/io/Serializable.h"

@class JavaUtilLocale;
@protocol JavaUtilSet;

/*!
 @brief Represents a currency.Currencies are identified by their ISO 4217 currency
  codes.
 Visit the <a href="http://www.iso.org/iso/home/standards/currency_codes.htm">
  ISO web site</a> for more information. 
 <p>
  The class is designed so that there's never more than one 
 <code>Currency</code> instance for any given currency. Therefore, there's
  no public constructor. You obtain a <code>Currency</code> instance using
  the <code>getInstance</code> methods.
 @since 1.4
 */
@interface JavaUtilCurrency : NSObject < JavaIoSerializable >

#pragma mark Public

/*!
 @brief Gets the set of available currencies.The returned set of currencies
  contains all of the available currencies, which may include currencies
  that represent obsolete ISO 4217 codes.
 The set can be modified
  without affecting the available currencies in the runtime.
 @return the set of available currencies.  If there is no currency
     available in the runtime, the returned set is empty.
 @since 1.7
 */
+ (id<JavaUtilSet>)getAvailableCurrencies;

/*!
 @brief Gets the ISO 4217 currency code of this currency.
 @return the ISO 4217 currency code of this currency.
 */
- (NSString *)getCurrencyCode;

/*!
 @brief Gets the default number of fraction digits used with this currency.
 For example, the default number of fraction digits for the Euro is 2,
  while for the Japanese Yen it's 0.
  In the case of pseudo-currencies, such as IMF Special Drawing Rights,
  -1 is returned.
 @return the default number of fraction digits used with this currency
 */
- (jint)getDefaultFractionDigits;

/*!
 @brief Gets the name that is suitable for displaying this currency for
  the default <code>DISPLAY</code> locale.
 If there is no suitable display name found
  for the default locale, the ISO 4217 currency code is returned. 
 <p>
  This is equivalent to calling 
 <code>getDisplayName(Locale.getDefault(Locale.Category.DISPLAY))</code>
 .
 @return the display name of this currency for the default
      <code>DISPLAY</code> locale
 @since 1.7
 */
- (NSString *)getDisplayName;

/*!
 @brief Gets the name that is suitable for displaying this currency for
  the specified locale.If there is no suitable display name found
  for the specified locale, the ISO 4217 currency code is returned.
 @param locale the locale for which a display name for this currency is  needed
 @return the display name of this currency for the specified locale
 @throw NullPointerExceptionif <code>locale</code> is null
 @since 1.7
 */
- (NSString *)getDisplayNameWithJavaUtilLocale:(JavaUtilLocale *)locale;

/*!
 @brief Returns the <code>Currency</code> instance for the country of the
  given locale.The language and variant components of the locale
  are ignored.
 The result may vary over time, as countries change their
  currencies. For example, for the original member countries of the
  European Monetary Union, the method returns the old national currencies
  until December 31, 2001, and the Euro from January 1, 2002, local time
  of the respective countries. 
 <p>
  The method returns <code>null</code> for territories that don't
  have a currency, such as Antarctica.
 @param locale the locale for whose country a  <code> Currency </code>
   instance is needed
 @return the <code>Currency</code> instance for the country of the given
  locale, or <code>null</code>
 @throw NullPointerExceptionif <code>locale</code> or its country
  code is <code>null</code>
 @throw IllegalArgumentExceptionif the country of the given <code>locale</code>
  is not a supported ISO 3166 country code.
 */
+ (JavaUtilCurrency *)getInstanceWithJavaUtilLocale:(JavaUtilLocale *)locale;

/*!
 @brief Returns the <code>Currency</code> instance for the given currency code.
 @param currencyCode the ISO 4217 code of the currency
 @return the <code>Currency</code> instance for the given currency code
 @throw NullPointerExceptionif <code>currencyCode</code> is null
 @throw IllegalArgumentExceptionif <code>currencyCode</code> is not
  a supported ISO 4217 code.
 */
+ (JavaUtilCurrency *)getInstanceWithNSString:(NSString *)currencyCode;

/*!
 @brief Returns the ISO 4217 numeric code of this currency.
 @return the ISO 4217 numeric code of this currency
 @since 1.7
 */
- (jint)getNumericCode;

/*!
 @brief Gets the symbol of this currency for the default 
 <code>DISPLAY</code> locale.
 For example, for the US Dollar, the symbol is "$" if the default
  locale is the US, while for other locales it may be "US$". If no
  symbol can be determined, the ISO 4217 currency code is returned. 
 <p>
  This is equivalent to calling 
 <code>getSymbol(Locale.getDefault(Locale.Category.DISPLAY))</code>
 .
 @return the symbol of this currency for the default
      <code>DISPLAY</code> locale
 */
- (NSString *)getSymbol;

/*!
 @brief Gets the symbol of this currency for the specified locale.
 For example, for the US Dollar, the symbol is "$" if the specified
  locale is the US, while for other locales it may be "US$". If no
  symbol can be determined, the ISO 4217 currency code is returned.
 @param locale the locale for which a display name for this currency is  needed
 @return the symbol of this currency for the specified locale
 @throw NullPointerExceptionif <code>locale</code> is null
 */
- (NSString *)getSymbolWithJavaUtilLocale:(JavaUtilLocale *)locale;

/*!
 @brief Returns the ISO 4217 currency code of this currency.
 @return the ISO 4217 currency code of this currency
 */
- (NSString *)description;

// Disallowed inherited constructors, do not use.

- (instancetype __nonnull)init NS_UNAVAILABLE;

@end

J2OBJC_STATIC_INIT(JavaUtilCurrency)

FOUNDATION_EXPORT JavaUtilCurrency *JavaUtilCurrency_getInstanceWithNSString_(NSString *currencyCode);

FOUNDATION_EXPORT JavaUtilCurrency *JavaUtilCurrency_getInstanceWithJavaUtilLocale_(JavaUtilLocale *locale);

FOUNDATION_EXPORT id<JavaUtilSet> JavaUtilCurrency_getAvailableCurrencies(void);

J2OBJC_TYPE_LITERAL_HEADER(JavaUtilCurrency)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaUtilCurrency")
