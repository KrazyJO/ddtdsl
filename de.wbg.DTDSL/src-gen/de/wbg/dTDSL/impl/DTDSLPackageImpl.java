/**
 */
package de.wbg.dTDSL.impl;

import de.wbg.dTDSL.Abstract;
import de.wbg.dTDSL.Choice;
import de.wbg.dTDSL.DTDSLFactory;
import de.wbg.dTDSL.DTDSLPackage;
import de.wbg.dTDSL.JavaCodeOrID;
import de.wbg.dTDSL.Keyword;
import de.wbg.dTDSL.Many;
import de.wbg.dTDSL.Maybe;
import de.wbg.dTDSL.ObjectAttribute;
import de.wbg.dTDSL.ObjectDescription;
import de.wbg.dTDSL.ObjectDescriptionInner;
import de.wbg.dTDSL.ObjectNext;
import de.wbg.dTDSL.StartPoint;
import de.wbg.dTDSL.importStatement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DTDSLPackageImpl extends EPackageImpl implements DTDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dtdslEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass startPointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectDescriptionInnerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectNextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass javaCodeOrIDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass manyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass choiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maybeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keywordEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.wbg.dTDSL.DTDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DTDSLPackageImpl()
  {
    super(eNS_URI, DTDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DTDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DTDSLPackage init()
  {
    if (isInited) return (DTDSLPackage)EPackage.Registry.INSTANCE.getEPackage(DTDSLPackage.eNS_URI);

    // Obtain or create and register package
    DTDSLPackageImpl theDTDSLPackage = (DTDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DTDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DTDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDTDSLPackage.createPackageContents();

    // Initialize created meta-data
    theDTDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDTDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DTDSLPackage.eNS_URI, theDTDSLPackage);
    return theDTDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDTDSL()
  {
    return dtdslEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDTDSL_ParserName()
  {
    return (EAttribute)dtdslEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDTDSL_Type()
  {
    return (EAttribute)dtdslEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDTDSL_ObjDescription()
  {
    return (EReference)dtdslEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDTDSL_Imports()
  {
    return (EReference)dtdslEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDTDSL_Start()
  {
    return (EReference)dtdslEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getimportStatement()
  {
    return importStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getimportStatement_ImportClass()
  {
    return (EAttribute)importStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStartPoint()
  {
    return startPointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStartPoint_Begin()
  {
    return (EReference)startPointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstract()
  {
    return abstractEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectDescription()
  {
    return objectDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectDescription_Name()
  {
    return (EAttribute)objectDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectDescription_Description()
  {
    return (EReference)objectDescriptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectDescriptionInner()
  {
    return objectDescriptionInnerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectAttribute()
  {
    return objectAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectAttribute_Attributes()
  {
    return (EAttribute)objectAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectAttribute_Types()
  {
    return (EAttribute)objectAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectAttribute_Keyword()
  {
    return (EReference)objectAttributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectAttribute_Inner()
  {
    return (EReference)objectAttributeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectNext()
  {
    return objectNextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectNext_Attribute()
  {
    return (EReference)objectNextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectNext_ObjectDesription()
  {
    return (EReference)objectNextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJavaCodeOrID()
  {
    return javaCodeOrIDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaCodeOrID_Code()
  {
    return (EAttribute)javaCodeOrIDEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaCodeOrID_Id()
  {
    return (EAttribute)javaCodeOrIDEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMany()
  {
    return manyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMany_Description()
  {
    return (EReference)manyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChoice()
  {
    return choiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoice_Options()
  {
    return (EReference)choiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMaybe()
  {
    return maybeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMaybe_Object()
  {
    return (EReference)maybeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMaybe_Id()
  {
    return (EReference)maybeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKeyword()
  {
    return keywordEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeyword_Name()
  {
    return (EAttribute)keywordEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTDSLFactory getDTDSLFactory()
  {
    return (DTDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    dtdslEClass = createEClass(DTDSL);
    createEAttribute(dtdslEClass, DTDSL__PARSER_NAME);
    createEAttribute(dtdslEClass, DTDSL__TYPE);
    createEReference(dtdslEClass, DTDSL__OBJ_DESCRIPTION);
    createEReference(dtdslEClass, DTDSL__IMPORTS);
    createEReference(dtdslEClass, DTDSL__START);

    importStatementEClass = createEClass(IMPORT_STATEMENT);
    createEAttribute(importStatementEClass, IMPORT_STATEMENT__IMPORT_CLASS);

    startPointEClass = createEClass(START_POINT);
    createEReference(startPointEClass, START_POINT__BEGIN);

    abstractEClass = createEClass(ABSTRACT);

    objectDescriptionEClass = createEClass(OBJECT_DESCRIPTION);
    createEAttribute(objectDescriptionEClass, OBJECT_DESCRIPTION__NAME);
    createEReference(objectDescriptionEClass, OBJECT_DESCRIPTION__DESCRIPTION);

    objectDescriptionInnerEClass = createEClass(OBJECT_DESCRIPTION_INNER);

    objectAttributeEClass = createEClass(OBJECT_ATTRIBUTE);
    createEAttribute(objectAttributeEClass, OBJECT_ATTRIBUTE__ATTRIBUTES);
    createEAttribute(objectAttributeEClass, OBJECT_ATTRIBUTE__TYPES);
    createEReference(objectAttributeEClass, OBJECT_ATTRIBUTE__KEYWORD);
    createEReference(objectAttributeEClass, OBJECT_ATTRIBUTE__INNER);

    objectNextEClass = createEClass(OBJECT_NEXT);
    createEReference(objectNextEClass, OBJECT_NEXT__ATTRIBUTE);
    createEReference(objectNextEClass, OBJECT_NEXT__OBJECT_DESRIPTION);

    javaCodeOrIDEClass = createEClass(JAVA_CODE_OR_ID);
    createEAttribute(javaCodeOrIDEClass, JAVA_CODE_OR_ID__CODE);
    createEAttribute(javaCodeOrIDEClass, JAVA_CODE_OR_ID__ID);

    manyEClass = createEClass(MANY);
    createEReference(manyEClass, MANY__DESCRIPTION);

    choiceEClass = createEClass(CHOICE);
    createEReference(choiceEClass, CHOICE__OPTIONS);

    maybeEClass = createEClass(MAYBE);
    createEReference(maybeEClass, MAYBE__OBJECT);
    createEReference(maybeEClass, MAYBE__ID);

    keywordEClass = createEClass(KEYWORD);
    createEAttribute(keywordEClass, KEYWORD__NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    objectDescriptionEClass.getESuperTypes().add(this.getAbstract());
    objectAttributeEClass.getESuperTypes().add(this.getObjectDescriptionInner());
    objectNextEClass.getESuperTypes().add(this.getObjectDescriptionInner());
    manyEClass.getESuperTypes().add(this.getAbstract());
    choiceEClass.getESuperTypes().add(this.getAbstract());

    // Initialize classes and features; add operations and parameters
    initEClass(dtdslEClass, de.wbg.dTDSL.DTDSL.class, "DTDSL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDTDSL_ParserName(), ecorePackage.getEString(), "parserName", null, 0, 1, de.wbg.dTDSL.DTDSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDTDSL_Type(), ecorePackage.getEString(), "type", null, 0, 1, de.wbg.dTDSL.DTDSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDTDSL_ObjDescription(), this.getAbstract(), null, "objDescription", null, 0, -1, de.wbg.dTDSL.DTDSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDTDSL_Imports(), this.getimportStatement(), null, "imports", null, 0, -1, de.wbg.dTDSL.DTDSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDTDSL_Start(), this.getStartPoint(), null, "start", null, 0, 1, de.wbg.dTDSL.DTDSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importStatementEClass, importStatement.class, "importStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getimportStatement_ImportClass(), ecorePackage.getEString(), "importClass", null, 0, 1, importStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(startPointEClass, StartPoint.class, "StartPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStartPoint_Begin(), this.getObjectDescription(), null, "begin", null, 0, 1, StartPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractEClass, Abstract.class, "Abstract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectDescriptionEClass, ObjectDescription.class, "ObjectDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectDescription_Name(), ecorePackage.getEString(), "name", null, 0, 1, ObjectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectDescription_Description(), this.getObjectDescriptionInner(), null, "description", null, 0, -1, ObjectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectDescriptionInnerEClass, ObjectDescriptionInner.class, "ObjectDescriptionInner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectAttributeEClass, ObjectAttribute.class, "ObjectAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectAttribute_Attributes(), ecorePackage.getEString(), "attributes", null, 0, 1, ObjectAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjectAttribute_Types(), ecorePackage.getEString(), "types", null, 0, 1, ObjectAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectAttribute_Keyword(), this.getKeyword(), null, "keyword", null, 0, 1, ObjectAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectAttribute_Inner(), this.getObjectDescription(), null, "inner", null, 0, 1, ObjectAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectNextEClass, ObjectNext.class, "ObjectNext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectNext_Attribute(), this.getJavaCodeOrID(), null, "attribute", null, 0, 1, ObjectNext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectNext_ObjectDesription(), this.getObjectDescription(), null, "objectDesription", null, 0, 1, ObjectNext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(javaCodeOrIDEClass, JavaCodeOrID.class, "JavaCodeOrID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJavaCodeOrID_Code(), ecorePackage.getEString(), "code", null, 0, 1, JavaCodeOrID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJavaCodeOrID_Id(), ecorePackage.getEString(), "id", null, 0, 1, JavaCodeOrID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(manyEClass, Many.class, "Many", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMany_Description(), this.getObjectDescriptionInner(), null, "description", null, 0, -1, Many.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChoice_Options(), this.getKeyword(), null, "options", null, 0, -1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(maybeEClass, Maybe.class, "Maybe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMaybe_Object(), this.getAbstract(), null, "object", null, 0, 1, Maybe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMaybe_Id(), this.getObjectDescription(), null, "id", null, 0, 1, Maybe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(keywordEClass, Keyword.class, "Keyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKeyword_Name(), ecorePackage.getEString(), "name", null, 0, 1, Keyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DTDSLPackageImpl
