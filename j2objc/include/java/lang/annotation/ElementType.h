//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: android/platform/libcore/ojluni/src/main/java/java/lang/annotation/ElementType.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_JavaLangAnnotationElementType")
#ifdef RESTRICT_JavaLangAnnotationElementType
#define INCLUDE_ALL_JavaLangAnnotationElementType 0
#else
#define INCLUDE_ALL_JavaLangAnnotationElementType 1
#endif
#undef RESTRICT_JavaLangAnnotationElementType

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (JavaLangAnnotationElementType_) && (INCLUDE_ALL_JavaLangAnnotationElementType || defined(INCLUDE_JavaLangAnnotationElementType))
#define JavaLangAnnotationElementType_

#define RESTRICT_JavaLangEnum 1
#define INCLUDE_JavaLangEnum 1
#include "java/lang/Enum.h"

@class IOSObjectArray;

typedef NS_ENUM(NSUInteger, JavaLangAnnotationElementType_Enum) {
  JavaLangAnnotationElementType_Enum_TYPE = 0,
  JavaLangAnnotationElementType_Enum_FIELD = 1,
  JavaLangAnnotationElementType_Enum_METHOD = 2,
  JavaLangAnnotationElementType_Enum_PARAMETER = 3,
  JavaLangAnnotationElementType_Enum_CONSTRUCTOR = 4,
  JavaLangAnnotationElementType_Enum_LOCAL_VARIABLE = 5,
  JavaLangAnnotationElementType_Enum_ANNOTATION_TYPE = 6,
  JavaLangAnnotationElementType_Enum_PACKAGE = 7,
  JavaLangAnnotationElementType_Enum_TYPE_PARAMETER = 8,
  JavaLangAnnotationElementType_Enum_TYPE_USE = 9,
  JavaLangAnnotationElementType_Enum_MODULE = 10,
};

/*!
 @brief The constants of this enumerated type provide a simple classification of the syntactic locations
  where annotations may appear in a Java program.These constants are used in <code>Target</code>
  meta-annotations to specify where it is legal to write
  annotations of a given type.
 <p>The syntactic locations where annotations may appear are split into <em>declaration
  contexts</em> , where annotations apply to declarations, and <em>type contexts</em> , where
  annotations apply to types used in declarations and expressions. 
 <p>The constants <code>ANNOTATION_TYPE</code>, <code>CONSTRUCTOR</code>, <code>FIELD</code>, <code>LOCAL_VARIABLE</code>
 , <code>METHOD</code>, <code>PACKAGE</code>, <code>MODULE</code>, <code>PARAMETER</code>, <code>TYPE</code>
 , and <code>TYPE_PARAMETER</code> correspond to the declaration contexts in JLS 9.6.4.1. 
 <p>For example, an annotation whose type is meta-annotated with 
 <code>@@Target(ElementType.FIELD)</code> may only be written as a modifier for a field declaration. 
 <p>The constant <code>TYPE_USE</code> corresponds to the type contexts in JLS 4.11, as well as to two
  declaration contexts: type declarations (including annotation type declarations) and type
  parameter declarations. 
 <p>For example, an annotation whose type is meta-annotated with 
 <code>@@Target(ElementType.TYPE_USE)</code> may be written on the type of a field (or within the type
  of the field, if it is a nested, parameterized, or array type), and may also appear as a modifier
  for, say, a class declaration. 
 <p>The <code>TYPE_USE</code> constant includes type declarations and type parameter declarations as a
  convenience for designers of type checkers which give semantics to annotation types. For example,
  if the annotation type <code>NonNull</code> is meta-annotated with 
 <code>@@Target(ElementType.TYPE_USE)</code>, then <code>@@NonNull</code> <code>class C {...}</code> could be
  treated by a type checker as indicating that all variables of class <code>C</code> are non-null, while
  still allowing variables of other classes to be non-null or not non-null based on whether 
 <code>@@NonNull</code> appears at the variable's declaration.
 @author Joshua Bloch
 @since 1.5
 */
@interface JavaLangAnnotationElementType : JavaLangEnum

#pragma mark Public

+ (JavaLangAnnotationElementType *)valueOfWithNSString:(NSString *)name;

+ (IOSObjectArray *)values;

#pragma mark Package-Private

- (JavaLangAnnotationElementType_Enum)toNSEnum;

@end

J2OBJC_STATIC_INIT(JavaLangAnnotationElementType)

/*! INTERNAL ONLY - Use enum accessors declared below. */
FOUNDATION_EXPORT JavaLangAnnotationElementType *JavaLangAnnotationElementType_values_[];

/*!
 @brief Class, interface (including annotation type), or enum declaration
 */
inline JavaLangAnnotationElementType *JavaLangAnnotationElementType_get_TYPE(void);
J2OBJC_ENUM_CONSTANT(JavaLangAnnotationElementType, TYPE)

/*!
 @brief Field declaration (includes enum constants)
 */
inline JavaLangAnnotationElementType *JavaLangAnnotationElementType_get_FIELD(void);
J2OBJC_ENUM_CONSTANT(JavaLangAnnotationElementType, FIELD)

/*!
 @brief Method declaration
 */
inline JavaLangAnnotationElementType *JavaLangAnnotationElementType_get_METHOD(void);
J2OBJC_ENUM_CONSTANT(JavaLangAnnotationElementType, METHOD)

/*!
 @brief Formal parameter declaration
 */
inline JavaLangAnnotationElementType *JavaLangAnnotationElementType_get_PARAMETER(void);
J2OBJC_ENUM_CONSTANT(JavaLangAnnotationElementType, PARAMETER)

/*!
 @brief Constructor declaration
 */
inline JavaLangAnnotationElementType *JavaLangAnnotationElementType_get_CONSTRUCTOR(void);
J2OBJC_ENUM_CONSTANT(JavaLangAnnotationElementType, CONSTRUCTOR)

/*!
 @brief Local variable declaration
 */
inline JavaLangAnnotationElementType *JavaLangAnnotationElementType_get_LOCAL_VARIABLE(void);
J2OBJC_ENUM_CONSTANT(JavaLangAnnotationElementType, LOCAL_VARIABLE)

/*!
 @brief Annotation type declaration
 */
inline JavaLangAnnotationElementType *JavaLangAnnotationElementType_get_ANNOTATION_TYPE(void);
J2OBJC_ENUM_CONSTANT(JavaLangAnnotationElementType, ANNOTATION_TYPE)

/*!
 @brief Package declaration
 */
inline JavaLangAnnotationElementType *JavaLangAnnotationElementType_get_PACKAGE(void);
J2OBJC_ENUM_CONSTANT(JavaLangAnnotationElementType, PACKAGE)

/*!
 @brief Type parameter declaration
 @since 1.8
 */
inline JavaLangAnnotationElementType *JavaLangAnnotationElementType_get_TYPE_PARAMETER(void);
J2OBJC_ENUM_CONSTANT(JavaLangAnnotationElementType, TYPE_PARAMETER)

/*!
 @brief Use of a type
 @since 1.8
 */
inline JavaLangAnnotationElementType *JavaLangAnnotationElementType_get_TYPE_USE(void);
J2OBJC_ENUM_CONSTANT(JavaLangAnnotationElementType, TYPE_USE)

/*!
 @brief Module declaration.
 @since 9
 */
inline JavaLangAnnotationElementType *JavaLangAnnotationElementType_get_MODULE(void);
J2OBJC_ENUM_CONSTANT(JavaLangAnnotationElementType, MODULE)

FOUNDATION_EXPORT IOSObjectArray *JavaLangAnnotationElementType_values(void);

FOUNDATION_EXPORT JavaLangAnnotationElementType *JavaLangAnnotationElementType_valueOfWithNSString_(NSString *name);

FOUNDATION_EXPORT JavaLangAnnotationElementType *JavaLangAnnotationElementType_fromOrdinal(NSUInteger ordinal);

J2OBJC_TYPE_LITERAL_HEADER(JavaLangAnnotationElementType)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_JavaLangAnnotationElementType")
