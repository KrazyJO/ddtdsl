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
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTDSL__TYPE = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTDSL__IMPORTS = 2;

  /**
   * The feature id for the '<em><b>Obj Description</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTDSL__OBJ_DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTDSL__START = 4;

  /**
   * The number of structural features of the '<em>DTDSL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTDSL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.importStatementImpl <em>import Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.importStatementImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getimportStatement()
   * @generated
   */
  int IMPORT_STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Import Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT__IMPORT_CLASS = 0;

  /**
   * The number of structural features of the '<em>import Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.StartPointImpl <em>Start Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.StartPointImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getStartPoint()
   * @generated
   */
  int START_POINT = 2;

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
  int ABSTRACT = 3;

  /**
   * The number of structural features of the '<em>Abstract</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.ObjectDescriptionImpl <em>Object Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.ObjectDescriptionImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectDescription()
   * @generated
   */
  int OBJECT_DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_DESCRIPTION__NAME = ABSTRACT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_DESCRIPTION__DESCRIPTION = ABSTRACT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_DESCRIPTION_FEATURE_COUNT = ABSTRACT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.ObjectDescriptionInnerImpl <em>Object Description Inner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.ObjectDescriptionInnerImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectDescriptionInner()
   * @generated
   */
  int OBJECT_DESCRIPTION_INNER = 5;

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
  int OBJECT_ATTRIBUTE = 6;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ATTRIBUTE__ATTRIBUTES = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ATTRIBUTE__TYPES = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ATTRIBUTE__KEYWORD = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Inner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ATTRIBUTE__INNER = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Object Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ATTRIBUTE_FEATURE_COUNT = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.ObjectNextImpl <em>Object Next</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.ObjectNextImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectNext()
   * @generated
   */
  int OBJECT_NEXT = 7;

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
  int JAVA_CODE_OR_ID = 8;

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
   * The meta object id for the '{@link de.wbg.dTDSL.impl.ManyImpl <em>Many</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.ManyImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getMany()
   * @generated
   */
  int MANY = 9;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY__DESCRIPTION = ABSTRACT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Many</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_FEATURE_COUNT = ABSTRACT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.ChoiceImpl <em>Choice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.ChoiceImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getChoice()
   * @generated
   */
  int CHOICE = 10;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__OPTIONS = ABSTRACT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Choice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_FEATURE_COUNT = ABSTRACT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.ObjectMaybeImpl <em>Object Maybe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.ObjectMaybeImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectMaybe()
   * @generated
   */
  int OBJECT_MAYBE = 11;

  /**
   * The feature id for the '<em><b>Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MAYBE__OBJECT = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MAYBE__ID = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Maybe</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MAYBE_FEATURE_COUNT = OBJECT_DESCRIPTION_INNER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.wbg.dTDSL.impl.KeywordImpl <em>Keyword</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wbg.dTDSL.impl.KeywordImpl
   * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getKeyword()
   * @generated
   */
  int KEYWORD = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEYWORD__NAME = 0;

  /**
   * The number of structural features of the '<em>Keyword</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEYWORD_FEATURE_COUNT = 1;


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
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.DTDSL#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.wbg.dTDSL.DTDSL#getType()
   * @see #getDTDSL()
   * @generated
   */
  EAttribute getDTDSL_Type();

  /**
   * Returns the meta object for the containment reference list '{@link de.wbg.dTDSL.DTDSL#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.wbg.dTDSL.DTDSL#getImports()
   * @see #getDTDSL()
   * @generated
   */
  EReference getDTDSL_Imports();

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
   * Returns the meta object for class '{@link de.wbg.dTDSL.importStatement <em>import Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>import Statement</em>'.
   * @see de.wbg.dTDSL.importStatement
   * @generated
   */
  EClass getimportStatement();

  /**
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.importStatement#getImportClass <em>Import Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import Class</em>'.
   * @see de.wbg.dTDSL.importStatement#getImportClass()
   * @see #getimportStatement()
   * @generated
   */
  EAttribute getimportStatement_ImportClass();

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
   * Returns the meta object for class '{@link de.wbg.dTDSL.ObjectDescription <em>Object Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Description</em>'.
   * @see de.wbg.dTDSL.ObjectDescription
   * @generated
   */
  EClass getObjectDescription();

  /**
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.ObjectDescription#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.wbg.dTDSL.ObjectDescription#getName()
   * @see #getObjectDescription()
   * @generated
   */
  EAttribute getObjectDescription_Name();

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
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.ObjectAttribute#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Types</em>'.
   * @see de.wbg.dTDSL.ObjectAttribute#getTypes()
   * @see #getObjectAttribute()
   * @generated
   */
  EAttribute getObjectAttribute_Types();

  /**
   * Returns the meta object for the containment reference '{@link de.wbg.dTDSL.ObjectAttribute#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Keyword</em>'.
   * @see de.wbg.dTDSL.ObjectAttribute#getKeyword()
   * @see #getObjectAttribute()
   * @generated
   */
  EReference getObjectAttribute_Keyword();

  /**
   * Returns the meta object for the reference '{@link de.wbg.dTDSL.ObjectAttribute#getInner <em>Inner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Inner</em>'.
   * @see de.wbg.dTDSL.ObjectAttribute#getInner()
   * @see #getObjectAttribute()
   * @generated
   */
  EReference getObjectAttribute_Inner();

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
   * Returns the meta object for class '{@link de.wbg.dTDSL.Many <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Many</em>'.
   * @see de.wbg.dTDSL.Many
   * @generated
   */
  EClass getMany();

  /**
   * Returns the meta object for the containment reference '{@link de.wbg.dTDSL.Many#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see de.wbg.dTDSL.Many#getDescription()
   * @see #getMany()
   * @generated
   */
  EReference getMany_Description();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.Choice <em>Choice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choice</em>'.
   * @see de.wbg.dTDSL.Choice
   * @generated
   */
  EClass getChoice();

  /**
   * Returns the meta object for the containment reference list '{@link de.wbg.dTDSL.Choice#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see de.wbg.dTDSL.Choice#getOptions()
   * @see #getChoice()
   * @generated
   */
  EReference getChoice_Options();

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
   * Returns the meta object for the containment reference '{@link de.wbg.dTDSL.ObjectMaybe#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object</em>'.
   * @see de.wbg.dTDSL.ObjectMaybe#getObject()
   * @see #getObjectMaybe()
   * @generated
   */
  EReference getObjectMaybe_Object();

  /**
   * Returns the meta object for the reference '{@link de.wbg.dTDSL.ObjectMaybe#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Id</em>'.
   * @see de.wbg.dTDSL.ObjectMaybe#getId()
   * @see #getObjectMaybe()
   * @generated
   */
  EReference getObjectMaybe_Id();

  /**
   * Returns the meta object for class '{@link de.wbg.dTDSL.Keyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Keyword</em>'.
   * @see de.wbg.dTDSL.Keyword
   * @generated
   */
  EClass getKeyword();

  /**
   * Returns the meta object for the attribute '{@link de.wbg.dTDSL.Keyword#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.wbg.dTDSL.Keyword#getName()
   * @see #getKeyword()
   * @generated
   */
  EAttribute getKeyword_Name();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DTDSL__TYPE = eINSTANCE.getDTDSL_Type();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DTDSL__IMPORTS = eINSTANCE.getDTDSL_Imports();

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
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.importStatementImpl <em>import Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.importStatementImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getimportStatement()
     * @generated
     */
    EClass IMPORT_STATEMENT = eINSTANCE.getimportStatement();

    /**
     * The meta object literal for the '<em><b>Import Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_STATEMENT__IMPORT_CLASS = eINSTANCE.getimportStatement_ImportClass();

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
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.ObjectDescriptionImpl <em>Object Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.ObjectDescriptionImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getObjectDescription()
     * @generated
     */
    EClass OBJECT_DESCRIPTION = eINSTANCE.getObjectDescription();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_DESCRIPTION__NAME = eINSTANCE.getObjectDescription_Name();

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
     * The meta object literal for the '<em><b>Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_ATTRIBUTE__TYPES = eINSTANCE.getObjectAttribute_Types();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_ATTRIBUTE__KEYWORD = eINSTANCE.getObjectAttribute_Keyword();

    /**
     * The meta object literal for the '<em><b>Inner</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_ATTRIBUTE__INNER = eINSTANCE.getObjectAttribute_Inner();

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
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.ManyImpl <em>Many</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.ManyImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getMany()
     * @generated
     */
    EClass MANY = eINSTANCE.getMany();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MANY__DESCRIPTION = eINSTANCE.getMany_Description();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.ChoiceImpl <em>Choice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.ChoiceImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getChoice()
     * @generated
     */
    EClass CHOICE = eINSTANCE.getChoice();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHOICE__OPTIONS = eINSTANCE.getChoice_Options();

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
     * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_MAYBE__OBJECT = eINSTANCE.getObjectMaybe_Object();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_MAYBE__ID = eINSTANCE.getObjectMaybe_Id();

    /**
     * The meta object literal for the '{@link de.wbg.dTDSL.impl.KeywordImpl <em>Keyword</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wbg.dTDSL.impl.KeywordImpl
     * @see de.wbg.dTDSL.impl.DTDSLPackageImpl#getKeyword()
     * @generated
     */
    EClass KEYWORD = eINSTANCE.getKeyword();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEYWORD__NAME = eINSTANCE.getKeyword_Name();

  }

} //DTDSLPackage
