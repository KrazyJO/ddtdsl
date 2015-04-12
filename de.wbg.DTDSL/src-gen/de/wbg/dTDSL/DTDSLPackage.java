/**
 */
package de.wbg.dTDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.wbg.dTDSL.DTDSLFactory
 * @model kind="package"
 * @generated
 */
public interface DTDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dTDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.wbg.de/DTDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dTDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DTDSLPackage eINSTANCE = de.wbg.dTDSL.impl.DTDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.DTDSLImpl <em>DTDSL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.DTDSLImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getDTDSL()
   * @generated
   */
  int DTDSL = 0;

  /**
   * The feature id for the '<em><b>Parser Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTDSL__PARSER_NAME = 0;

  /**
   * The feature id for the '<em><b>Obj Description</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTDSL__OBJ_DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTDSL__START = 2;

  /**
   * The number of structural features of the '<em>DTDSL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTDSL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.StartPointImpl <em>Start Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.StartPointImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStartPoint()
   * @generated
   */
  int START_POINT = 1;

  /**
   * The feature id for the '<em><b>Begin</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_POINT__BEGIN = 0;

  /**
   * The number of structural features of the '<em>Start Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_POINT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.AbstractImpl <em>Abstract</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.AbstractImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getAbstract()
   * @generated
   */
  int ABSTRACT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT__NAME = 0;

  /**
   * The number of structural features of the '<em>Abstract</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.StringDescriptionImpl <em>String Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.StringDescriptionImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStringDescription()
   * @generated
   */
  int STRING_DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_DESCRIPTION__NAME = ABSTRACT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_DESCRIPTION__DESCRIPTION = ABSTRACT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_DESCRIPTION_FEATURE_COUNT = ABSTRACT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.StringDescriptionInnerImpl <em>String Description Inner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.StringDescriptionInnerImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStringDescriptionInner()
   * @generated
   */
  int STRING_DESCRIPTION_INNER = 4;

  /**
   * The feature id for the '<em><b>Key Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_DESCRIPTION_INNER__KEY_REF = 0;

  /**
   * The number of structural features of the '<em>String Description Inner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_DESCRIPTION_INNER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.StringOverReadImpl <em>String Over Read</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.StringOverReadImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStringOverRead()
   * @generated
   */
  int STRING_OVER_READ = 5;

  /**
   * The feature id for the '<em><b>Key Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_OVER_READ__KEY_REF = STRING_DESCRIPTION_INNER__KEY_REF;

  /**
   * The feature id for the '<em><b>Over Read</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_OVER_READ__OVER_READ = STRING_DESCRIPTION_INNER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Over Read</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_OVER_READ_FEATURE_COUNT = STRING_DESCRIPTION_INNER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.StringKeyImpl <em>String Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.StringKeyImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStringKey()
   * @generated
   */
  int STRING_KEY = 6;

  /**
   * The feature id for the '<em><b>Key Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_KEY__KEY_REF = STRING_DESCRIPTION_INNER__KEY_REF;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_KEY__NAME = STRING_DESCRIPTION_INNER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_KEY__TYPE = STRING_DESCRIPTION_INNER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>String Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_KEY_FEATURE_COUNT = STRING_DESCRIPTION_INNER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.StringValueImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 7;

  /**
   * The feature id for the '<em><b>Key Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__KEY_REF = STRING_DESCRIPTION_INNER__KEY_REF;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__NAME = STRING_DESCRIPTION_INNER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__TYPE = STRING_DESCRIPTION_INNER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>To Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__TO_KEY = STRING_DESCRIPTION_INNER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = STRING_DESCRIPTION_INNER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.StringOrImpl <em>String Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.StringOrImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStringOr()
   * @generated
   */
  int STRING_OR = 8;

  /**
   * The feature id for the '<em><b>Key Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_OR__KEY_REF = STRING_DESCRIPTION_INNER__KEY_REF;

  /**
   * The feature id for the '<em><b>Option</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_OR__OPTION = STRING_DESCRIPTION_INNER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_OR_FEATURE_COUNT = STRING_DESCRIPTION_INNER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.StringDescriptionInVariableImpl <em>String Description In Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.StringDescriptionInVariableImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStringDescriptionInVariable()
   * @generated
   */
  int STRING_DESCRIPTION_IN_VARIABLE = 9;

  /**
   * The feature id for the '<em><b>Key Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_DESCRIPTION_IN_VARIABLE__KEY_REF = STRING_DESCRIPTION_INNER__KEY_REF;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_DESCRIPTION_IN_VARIABLE__NAME = STRING_DESCRIPTION_INNER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_DESCRIPTION_IN_VARIABLE__DESCRIPTION = STRING_DESCRIPTION_INNER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>String Description In Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_DESCRIPTION_IN_VARIABLE_FEATURE_COUNT = STRING_DESCRIPTION_INNER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.StringComplexImpl <em>String Complex</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.StringComplexImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStringComplex()
   * @generated
   */
  int STRING_COMPLEX = 10;

  /**
   * The feature id for the '<em><b>Key Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_COMPLEX__KEY_REF = STRING_DESCRIPTION_INNER__KEY_REF;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_COMPLEX__NAME = STRING_DESCRIPTION_INNER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_COMPLEX__MANY = STRING_DESCRIPTION_INNER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Maybe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_COMPLEX__MAYBE = STRING_DESCRIPTION_INNER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>String Complex</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_COMPLEX_FEATURE_COUNT = STRING_DESCRIPTION_INNER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.ObjectDescriptionImpl <em>Object Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.ObjectDescriptionImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectDescription()
   * @generated
   */
  int OBJECT_DESCRIPTION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_DESCRIPTION__NAME = ABSTRACT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_DESCRIPTION__DESCRIPTION = ABSTRACT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_DESCRIPTION_FEATURE_COUNT = ABSTRACT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.ObjectDescriptionInnerImpl <em>Object Description Inner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.ObjectDescriptionInnerImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectDescriptionInner()
   * @generated
   */
  int OBJECT_DESCRIPTION_INNER = 12;

  /**
   * The number of structural features of the '<em>Object Description Inner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_DESCRIPTION_INNER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.ObjectAttributeImpl <em>Object Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.ObjectAttributeImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectAttribute()
   * @generated
   */
  int OBJECT_ATTRIBUTE = 13;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ATTRIBUTE__ATTRIBUTES = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>String Methode</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ATTRIBUTE__STRING_METHODE = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ATTRIBUTE_FEATURE_COUNT = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.ObjectNodeImpl <em>Object Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.ObjectNodeImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectNode()
   * @generated
   */
  int OBJECT_NODE = 14;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_NODE__ATTRIBUTES = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Inner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_NODE__INNER = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_NODE_FEATURE_COUNT = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.ObjectNextImpl <em>Object Next</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.ObjectNextImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectNext()
   * @generated
   */
  int OBJECT_NEXT = 15;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_NEXT__ATTRIBUTE = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Object Desription</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_NEXT__OBJECT_DESRIPTION = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Next</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_NEXT_FEATURE_COUNT = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.JavaCodeOrIDImpl <em>Java Code Or ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.JavaCodeOrIDImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getJavaCodeOrID()
   * @generated
   */
  int JAVA_CODE_OR_ID = 16;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_CODE_OR_ID__CODE = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_CODE_OR_ID__ID = 1;

  /**
   * The number of structural features of the '<em>Java Code Or ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_CODE_OR_ID_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.ObjectManyImpl <em>Object Many</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.ObjectManyImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectMany()
   * @generated
   */
  int OBJECT_MANY = 17;

  /**
   * The feature id for the '<em><b>Option</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MANY__OPTION = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Many</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MANY_FEATURE_COUNT = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.ObjectChoiceImpl <em>Object Choice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.ObjectChoiceImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectChoice()
   * @generated
   */
  int OBJECT_CHOICE = 18;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_CHOICE__OPTIONS = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Choice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_CHOICE_FEATURE_COUNT = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.ObjectMaybeImpl <em>Object Maybe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.ObjectMaybeImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectMaybe()
   * @generated
   */
  int OBJECT_MAYBE = 19;

  /**
   * The feature id for the '<em><b>Option</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MAYBE__OPTION = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MAYBE__DESCRIPTION = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Maybe</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MAYBE_FEATURE_COUNT = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.ObjectMaybeInnerImpl <em>Object Maybe Inner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.ObjectMaybeInnerImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectMaybeInner()
   * @generated
   */
  int OBJECT_MAYBE_INNER = 20;

  /**
   * The number of structural features of the '<em>Object Maybe Inner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MAYBE_INNER_FEATURE_COUNT = 0;


  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.DTDSL <em>DTDSL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DTDSL</em>'.
   * @see de.wbg.dTDSL.DTDSL
   * @generated
   */
  EClass getDTDSL();

  /**
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.DTDSL#getParserName <em>Parser Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parser Name</em>'.
   * @see de.wbg.dTDSL.DTDSL#getParserName()
   * @see #getDTDSL()
   * @generated
   */
  EAttribute getDTDSL_ParserName();

  /**
   * Returns the meta object for the containment reference list '{@link de.wbg.dTDSL.DTDSL#getObjDescription <em>Obj Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Obj Description</em>'.
   * @see de.wbg.dTDSL.DTDSL#getObjDescription()
   * @see #getDTDSL()
   * @generated
   */
  EReference getDTDSL_ObjDescription();

  /**
   * Returns the meta object for the containment reference '{@link de.wbg.dTDSL.DTDSL#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see de.wbg.dTDSL.DTDSL#getStart()
   * @see #getDTDSL()
   * @generated
   */
  EReference getDTDSL_Start();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.StartPoint <em>Start Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start Point</em>'.
   * @see de.wbg.dTDSL.StartPoint
   * @generated
   */
  EClass getStartPoint();

  /**
   * Returns the meta object for the reference '{@link de.wbg.dTDSL.StartPoint#getBegin <em>Begin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Begin</em>'.
   * @see de.wbg.dTDSL.StartPoint#getBegin()
   * @see #getStartPoint()
   * @generated
   */
  EReference getStartPoint_Begin();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.Abstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract</em>'.
   * @see de.wbg.dTDSL.Abstract
   * @generated
   */
  EClass getAbstract();

  /**
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.Abstract#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.wbg.dTDSL.Abstract#getName()
   * @see #getAbstract()
   * @generated
   */
  EAttribute getAbstract_Name();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.StringDescription <em>String Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Description</em>'.
   * @see de.wbg.dTDSL.StringDescription
   * @generated
   */
  EClass getStringDescription();

  /**
   * Returns the meta object for the containment reference list '{@link de.wbg.dTDSL.StringDescription#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Description</em>'.
   * @see de.wbg.dTDSL.StringDescription#getDescription()
   * @see #getStringDescription()
   * @generated
   */
  EReference getStringDescription_Description();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.StringDescriptionInner <em>String Description Inner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Description Inner</em>'.
   * @see de.wbg.dTDSL.StringDescriptionInner
   * @generated
   */
  EClass getStringDescriptionInner();

  /**
   * Returns the meta object for the reference '{@link de.wbg.dTDSL.StringDescriptionInner#getKeyRef <em>Key Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Key Ref</em>'.
   * @see de.wbg.dTDSL.StringDescriptionInner#getKeyRef()
   * @see #getStringDescriptionInner()
   * @generated
   */
  EReference getStringDescriptionInner_KeyRef();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.StringOverRead <em>String Over Read</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Over Read</em>'.
   * @see de.wbg.dTDSL.StringOverRead
   * @generated
   */
  EClass getStringOverRead();

  /**
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.StringOverRead#getOverRead <em>Over Read</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Over Read</em>'.
   * @see de.wbg.dTDSL.StringOverRead#getOverRead()
   * @see #getStringOverRead()
   * @generated
   */
  EAttribute getStringOverRead_OverRead();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.StringKey <em>String Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Key</em>'.
   * @see de.wbg.dTDSL.StringKey
   * @generated
   */
  EClass getStringKey();

  /**
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.StringKey#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.wbg.dTDSL.StringKey#getName()
   * @see #getStringKey()
   * @generated
   */
  EAttribute getStringKey_Name();

  /**
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.StringKey#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.wbg.dTDSL.StringKey#getType()
   * @see #getStringKey()
   * @generated
   */
  EAttribute getStringKey_Type();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see de.wbg.dTDSL.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.StringValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.wbg.dTDSL.StringValue#getName()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Name();

  /**
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.StringValue#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.wbg.dTDSL.StringValue#getType()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Type();

  /**
   * Returns the meta object for the reference '{@link de.wbg.dTDSL.StringValue#getToKey <em>To Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To Key</em>'.
   * @see de.wbg.dTDSL.StringValue#getToKey()
   * @see #getStringValue()
   * @generated
   */
  EReference getStringValue_ToKey();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.StringOr <em>String Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Or</em>'.
   * @see de.wbg.dTDSL.StringOr
   * @generated
   */
  EClass getStringOr();

  /**
   * Returns the meta object for the reference list '{@link de.wbg.dTDSL.StringOr#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Option</em>'.
   * @see de.wbg.dTDSL.StringOr#getOption()
   * @see #getStringOr()
   * @generated
   */
  EReference getStringOr_Option();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.StringDescriptionInVariable <em>String Description In Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Description In Variable</em>'.
   * @see de.wbg.dTDSL.StringDescriptionInVariable
   * @generated
   */
  EClass getStringDescriptionInVariable();

  /**
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.StringDescriptionInVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.wbg.dTDSL.StringDescriptionInVariable#getName()
   * @see #getStringDescriptionInVariable()
   * @generated
   */
  EAttribute getStringDescriptionInVariable_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.wbg.dTDSL.StringDescriptionInVariable#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Description</em>'.
   * @see de.wbg.dTDSL.StringDescriptionInVariable#getDescription()
   * @see #getStringDescriptionInVariable()
   * @generated
   */
  EReference getStringDescriptionInVariable_Description();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.StringComplex <em>String Complex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Complex</em>'.
   * @see de.wbg.dTDSL.StringComplex
   * @generated
   */
  EClass getStringComplex();

  /**
   * Returns the meta object for the reference '{@link de.wbg.dTDSL.StringComplex#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see de.wbg.dTDSL.StringComplex#getName()
   * @see #getStringComplex()
   * @generated
   */
  EReference getStringComplex_Name();

  /**
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.StringComplex#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see de.wbg.dTDSL.StringComplex#getMany()
   * @see #getStringComplex()
   * @generated
   */
  EAttribute getStringComplex_Many();

  /**
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.StringComplex#getMaybe <em>Maybe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maybe</em>'.
   * @see de.wbg.dTDSL.StringComplex#getMaybe()
   * @see #getStringComplex()
   * @generated
   */
  EAttribute getStringComplex_Maybe();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.ObjectDescription <em>Object Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Description</em>'.
   * @see de.wbg.dTDSL.ObjectDescription
   * @generated
   */
  EClass getObjectDescription();

  /**
   * Returns the meta object for the containment reference list '{@link de.wbg.dTDSL.ObjectDescription#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Description</em>'.
   * @see de.wbg.dTDSL.ObjectDescription#getDescription()
   * @see #getObjectDescription()
   * @generated
   */
  EReference getObjectDescription_Description();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.ObjectDescriptionInner <em>Object Description Inner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Description Inner</em>'.
   * @see de.wbg.dTDSL.ObjectDescriptionInner
   * @generated
   */
  EClass getObjectDescriptionInner();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.ObjectAttribute <em>Object Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Attribute</em>'.
   * @see de.wbg.dTDSL.ObjectAttribute
   * @generated
   */
  EClass getObjectAttribute();

  /**
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.ObjectAttribute#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attributes</em>'.
   * @see de.wbg.dTDSL.ObjectAttribute#getAttributes()
   * @see #getObjectAttribute()
   * @generated
   */
  EAttribute getObjectAttribute_Attributes();

  /**
   * Returns the meta object for the reference '{@link de.wbg.dTDSL.ObjectAttribute#getStringMethode <em>String Methode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>String Methode</em>'.
   * @see de.wbg.dTDSL.ObjectAttribute#getStringMethode()
   * @see #getObjectAttribute()
   * @generated
   */
  EReference getObjectAttribute_StringMethode();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.ObjectNode <em>Object Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Node</em>'.
   * @see de.wbg.dTDSL.ObjectNode
   * @generated
   */
  EClass getObjectNode();

  /**
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.ObjectNode#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attributes</em>'.
   * @see de.wbg.dTDSL.ObjectNode#getAttributes()
   * @see #getObjectNode()
   * @generated
   */
  EAttribute getObjectNode_Attributes();

  /**
   * Returns the meta object for the reference '{@link de.wbg.dTDSL.ObjectNode#getInner <em>Inner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Inner</em>'.
   * @see de.wbg.dTDSL.ObjectNode#getInner()
   * @see #getObjectNode()
   * @generated
   */
  EReference getObjectNode_Inner();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.ObjectNext <em>Object Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Next</em>'.
   * @see de.wbg.dTDSL.ObjectNext
   * @generated
   */
  EClass getObjectNext();

  /**
   * Returns the meta object for the containment reference '{@link de.wbg.dTDSL.ObjectNext#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute</em>'.
   * @see de.wbg.dTDSL.ObjectNext#getAttribute()
   * @see #getObjectNext()
   * @generated
   */
  EReference getObjectNext_Attribute();

  /**
   * Returns the meta object for the reference '{@link de.wbg.dTDSL.ObjectNext#getObjectDesription <em>Object Desription</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Object Desription</em>'.
   * @see de.wbg.dTDSL.ObjectNext#getObjectDesription()
   * @see #getObjectNext()
   * @generated
   */
  EReference getObjectNext_ObjectDesription();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.JavaCodeOrID <em>Java Code Or ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Code Or ID</em>'.
   * @see de.wbg.dTDSL.JavaCodeOrID
   * @generated
   */
  EClass getJavaCodeOrID();

  /**
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.JavaCodeOrID#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see de.wbg.dTDSL.JavaCodeOrID#getCode()
   * @see #getJavaCodeOrID()
   * @generated
   */
  EAttribute getJavaCodeOrID_Code();

  /**
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.JavaCodeOrID#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.wbg.dTDSL.JavaCodeOrID#getId()
   * @see #getJavaCodeOrID()
   * @generated
   */
  EAttribute getJavaCodeOrID_Id();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.ObjectMany <em>Object Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Many</em>'.
   * @see de.wbg.dTDSL.ObjectMany
   * @generated
   */
  EClass getObjectMany();

  /**
   * Returns the meta object for the containment reference '{@link de.wbg.dTDSL.ObjectMany#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Option</em>'.
   * @see de.wbg.dTDSL.ObjectMany#getOption()
   * @see #getObjectMany()
   * @generated
   */
  EReference getObjectMany_Option();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.ObjectChoice <em>Object Choice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Choice</em>'.
   * @see de.wbg.dTDSL.ObjectChoice
   * @generated
   */
  EClass getObjectChoice();

  /**
   * Returns the meta object for the containment reference list '{@link de.wbg.dTDSL.ObjectChoice#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see de.wbg.dTDSL.ObjectChoice#getOptions()
   * @see #getObjectChoice()
   * @generated
   */
  EReference getObjectChoice_Options();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.ObjectMaybe <em>Object Maybe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Maybe</em>'.
   * @see de.wbg.dTDSL.ObjectMaybe
   * @generated
   */
  EClass getObjectMaybe();

  /**
   * Returns the meta object for the reference '{@link de.wbg.dTDSL.ObjectMaybe#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Option</em>'.
   * @see de.wbg.dTDSL.ObjectMaybe#getOption()
   * @see #getObjectMaybe()
   * @generated
   */
  EReference getObjectMaybe_Option();

  /**
   * Returns the meta object for the containment reference '{@link de.wbg.dTDSL.ObjectMaybe#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see de.wbg.dTDSL.ObjectMaybe#getDescription()
   * @see #getObjectMaybe()
   * @generated
   */
  EReference getObjectMaybe_Description();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.ObjectMaybeInner <em>Object Maybe Inner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Maybe Inner</em>'.
   * @see de.wbg.dTDSL.ObjectMaybeInner
   * @generated
   */
  EClass getObjectMaybeInner();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DTDSLFactory getDTDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.DTDSLImpl <em>DTDSL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.DTDSLImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getDTDSL()
     * @generated
     */
    EClass DTDSL = eINSTANCE.getDTDSL();

    /**
     * The meta object literal for the '<em><b>Parser Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DTDSL__PARSER_NAME = eINSTANCE.getDTDSL_ParserName();

    /**
     * The meta object literal for the '<em><b>Obj Description</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DTDSL__OBJ_DESCRIPTION = eINSTANCE.getDTDSL_ObjDescription();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DTDSL__START = eINSTANCE.getDTDSL_Start();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.StartPointImpl <em>Start Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.StartPointImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStartPoint()
     * @generated
     */
    EClass START_POINT = eINSTANCE.getStartPoint();

    /**
     * The meta object literal for the '<em><b>Begin</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START_POINT__BEGIN = eINSTANCE.getStartPoint_Begin();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.AbstractImpl <em>Abstract</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.AbstractImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getAbstract()
     * @generated
     */
    EClass ABSTRACT = eINSTANCE.getAbstract();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT__NAME = eINSTANCE.getAbstract_Name();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.StringDescriptionImpl <em>String Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.StringDescriptionImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStringDescription()
     * @generated
     */
    EClass STRING_DESCRIPTION = eINSTANCE.getStringDescription();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_DESCRIPTION__DESCRIPTION = eINSTANCE.getStringDescription_Description();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.StringDescriptionInnerImpl <em>String Description Inner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.StringDescriptionInnerImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStringDescriptionInner()
     * @generated
     */
    EClass STRING_DESCRIPTION_INNER = eINSTANCE.getStringDescriptionInner();

    /**
     * The meta object literal for the '<em><b>Key Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_DESCRIPTION_INNER__KEY_REF = eINSTANCE.getStringDescriptionInner_KeyRef();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.StringOverReadImpl <em>String Over Read</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.StringOverReadImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStringOverRead()
     * @generated
     */
    EClass STRING_OVER_READ = eINSTANCE.getStringOverRead();

    /**
     * The meta object literal for the '<em><b>Over Read</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_OVER_READ__OVER_READ = eINSTANCE.getStringOverRead_OverRead();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.StringKeyImpl <em>String Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.StringKeyImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStringKey()
     * @generated
     */
    EClass STRING_KEY = eINSTANCE.getStringKey();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_KEY__NAME = eINSTANCE.getStringKey_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_KEY__TYPE = eINSTANCE.getStringKey_Type();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.StringValueImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__NAME = eINSTANCE.getStringValue_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__TYPE = eINSTANCE.getStringValue_Type();

    /**
     * The meta object literal for the '<em><b>To Key</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_VALUE__TO_KEY = eINSTANCE.getStringValue_ToKey();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.StringOrImpl <em>String Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.StringOrImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStringOr()
     * @generated
     */
    EClass STRING_OR = eINSTANCE.getStringOr();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_OR__OPTION = eINSTANCE.getStringOr_Option();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.StringDescriptionInVariableImpl <em>String Description In Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.StringDescriptionInVariableImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStringDescriptionInVariable()
     * @generated
     */
    EClass STRING_DESCRIPTION_IN_VARIABLE = eINSTANCE.getStringDescriptionInVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_DESCRIPTION_IN_VARIABLE__NAME = eINSTANCE.getStringDescriptionInVariable_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_DESCRIPTION_IN_VARIABLE__DESCRIPTION = eINSTANCE.getStringDescriptionInVariable_Description();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.StringComplexImpl <em>String Complex</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.StringComplexImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStringComplex()
     * @generated
     */
    EClass STRING_COMPLEX = eINSTANCE.getStringComplex();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_COMPLEX__NAME = eINSTANCE.getStringComplex_Name();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_COMPLEX__MANY = eINSTANCE.getStringComplex_Many();

    /**
     * The meta object literal for the '<em><b>Maybe</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_COMPLEX__MAYBE = eINSTANCE.getStringComplex_Maybe();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.ObjectDescriptionImpl <em>Object Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.ObjectDescriptionImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectDescription()
     * @generated
     */
    EClass OBJECT_DESCRIPTION = eINSTANCE.getObjectDescription();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_DESCRIPTION__DESCRIPTION = eINSTANCE.getObjectDescription_Description();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.ObjectDescriptionInnerImpl <em>Object Description Inner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.ObjectDescriptionInnerImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectDescriptionInner()
     * @generated
     */
    EClass OBJECT_DESCRIPTION_INNER = eINSTANCE.getObjectDescriptionInner();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.ObjectAttributeImpl <em>Object Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.ObjectAttributeImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectAttribute()
     * @generated
     */
    EClass OBJECT_ATTRIBUTE = eINSTANCE.getObjectAttribute();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_ATTRIBUTE__ATTRIBUTES = eINSTANCE.getObjectAttribute_Attributes();

    /**
     * The meta object literal for the '<em><b>String Methode</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_ATTRIBUTE__STRING_METHODE = eINSTANCE.getObjectAttribute_StringMethode();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.ObjectNodeImpl <em>Object Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.ObjectNodeImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectNode()
     * @generated
     */
    EClass OBJECT_NODE = eINSTANCE.getObjectNode();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_NODE__ATTRIBUTES = eINSTANCE.getObjectNode_Attributes();

    /**
     * The meta object literal for the '<em><b>Inner</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_NODE__INNER = eINSTANCE.getObjectNode_Inner();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.ObjectNextImpl <em>Object Next</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.ObjectNextImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectNext()
     * @generated
     */
    EClass OBJECT_NEXT = eINSTANCE.getObjectNext();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_NEXT__ATTRIBUTE = eINSTANCE.getObjectNext_Attribute();

    /**
     * The meta object literal for the '<em><b>Object Desription</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_NEXT__OBJECT_DESRIPTION = eINSTANCE.getObjectNext_ObjectDesription();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.JavaCodeOrIDImpl <em>Java Code Or ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.JavaCodeOrIDImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getJavaCodeOrID()
     * @generated
     */
    EClass JAVA_CODE_OR_ID = eINSTANCE.getJavaCodeOrID();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_CODE_OR_ID__CODE = eINSTANCE.getJavaCodeOrID_Code();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_CODE_OR_ID__ID = eINSTANCE.getJavaCodeOrID_Id();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.ObjectManyImpl <em>Object Many</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.ObjectManyImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectMany()
     * @generated
     */
    EClass OBJECT_MANY = eINSTANCE.getObjectMany();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_MANY__OPTION = eINSTANCE.getObjectMany_Option();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.ObjectChoiceImpl <em>Object Choice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.ObjectChoiceImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectChoice()
     * @generated
     */
    EClass OBJECT_CHOICE = eINSTANCE.getObjectChoice();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_CHOICE__OPTIONS = eINSTANCE.getObjectChoice_Options();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.ObjectMaybeImpl <em>Object Maybe</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.ObjectMaybeImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectMaybe()
     * @generated
     */
    EClass OBJECT_MAYBE = eINSTANCE.getObjectMaybe();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_MAYBE__OPTION = eINSTANCE.getObjectMaybe_Option();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_MAYBE__DESCRIPTION = eINSTANCE.getObjectMaybe_Description();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.ObjectMaybeInnerImpl <em>Object Maybe Inner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.ObjectMaybeInnerImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectMaybeInner()
     * @generated
     */
    EClass OBJECT_MAYBE_INNER = eINSTANCE.getObjectMaybeInner();

  }

} //DTDSLPackage
