/**
 */
package de.wbg.dTDSL.impl;

import de.wbg.dTDSL.Abstract;
import de.wbg.dTDSL.DTDSLFactory;
import de.wbg.dTDSL.DTDSLPackage;
import de.wbg.dTDSL.JavaCodeOrID;
import de.wbg.dTDSL.Keyword;
import de.wbg.dTDSL.ObjectAttribute;
import de.wbg.dTDSL.ObjectChoice;
import de.wbg.dTDSL.ObjectDescription;
import de.wbg.dTDSL.ObjectDescriptionInner;
import de.wbg.dTDSL.ObjectMany;
import de.wbg.dTDSL.ObjectMaybe;
import de.wbg.dTDSL.ObjectMaybeInner;
import de.wbg.dTDSL.ObjectNext;
import de.wbg.dTDSL.ObjectNode;
import de.wbg.dTDSL.StartPoint;
import de.wbg.dTDSL.StringDescription;

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
  private EClass stringDescriptionEClass = null;

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
  private EClass objectNodeEClass = null;

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
  private EClass objectManyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectChoiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectMaybeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectMaybeInnerEClass = null;

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
  public EReference getDTDSL_Start()
  {
    return (EReference)dtdslEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getAbstract_Name()
  {
    return (EAttribute)abstractEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringDescription()
  {
    return stringDescriptionEClass;
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
  public EReference getObjectDescription_Description()
  {
    return (EReference)objectDescriptionEClass.getEStructuralFeatures().get(0);
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
  public EClass getObjectNode()
  {
    return objectNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectNode_Attributes()
  {
    return (EAttribute)objectNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectNode_Inner()
  {
    return (EReference)objectNodeEClass.getEStructuralFeatures().get(1);
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
  public EClass getObjectMany()
  {
    return objectManyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectMany_Option()
  {
    return (EReference)objectManyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectChoice()
  {
    return objectChoiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectChoice_Options()
  {
    return (EReference)objectChoiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectMaybe()
  {
    return objectMaybeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectMaybe_Option()
  {
    return (EReference)objectMaybeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectMaybe_Description()
  {
    return (EReference)objectMaybeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectMaybeInner()
  {
    return objectMaybeInnerEClass;
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
    createEReference(dtdslEClass, DTDSL__START);

    startPointEClass = createEClass(START_POINT);
    createEReference(startPointEClass, START_POINT__BEGIN);

    abstractEClass = createEClass(ABSTRACT);
    createEAttribute(abstractEClass, ABSTRACT__NAME);

    stringDescriptionEClass = createEClass(STRING_DESCRIPTION);

    objectDescriptionEClass = createEClass(OBJECT_DESCRIPTION);
    createEReference(objectDescriptionEClass, OBJECT_DESCRIPTION__DESCRIPTION);

    objectDescriptionInnerEClass = createEClass(OBJECT_DESCRIPTION_INNER);

    objectAttributeEClass = createEClass(OBJECT_ATTRIBUTE);
    createEAttribute(objectAttributeEClass, OBJECT_ATTRIBUTE__ATTRIBUTES);

    objectNodeEClass = createEClass(OBJECT_NODE);
    createEAttribute(objectNodeEClass, OBJECT_NODE__ATTRIBUTES);
    createEReference(objectNodeEClass, OBJECT_NODE__INNER);

    objectNextEClass = createEClass(OBJECT_NEXT);
    createEReference(objectNextEClass, OBJECT_NEXT__ATTRIBUTE);
    createEReference(objectNextEClass, OBJECT_NEXT__OBJECT_DESRIPTION);

    javaCodeOrIDEClass = createEClass(JAVA_CODE_OR_ID);
    createEAttribute(javaCodeOrIDEClass, JAVA_CODE_OR_ID__CODE);
    createEAttribute(javaCodeOrIDEClass, JAVA_CODE_OR_ID__ID);

    objectManyEClass = createEClass(OBJECT_MANY);
    createEReference(objectManyEClass, OBJECT_MANY__OPTION);

    objectChoiceEClass = createEClass(OBJECT_CHOICE);
    createEReference(objectChoiceEClass, OBJECT_CHOICE__OPTIONS);

    objectMaybeEClass = createEClass(OBJECT_MAYBE);
    createEReference(objectMaybeEClass, OBJECT_MAYBE__OPTION);
    createEReference(objectMaybeEClass, OBJECT_MAYBE__DESCRIPTION);

    objectMaybeInnerEClass = createEClass(OBJECT_MAYBE_INNER);

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
    stringDescriptionEClass.getESuperTypes().add(this.getAbstract());
    objectDescriptionEClass.getESuperTypes().add(this.getAbstract());
    objectAttributeEClass.getESuperTypes().add(this.getObjectDescriptionInner());
    objectAttributeEClass.getESuperTypes().add(this.getObjectMaybeInner());
    objectNodeEClass.getESuperTypes().add(this.getObjectDescriptionInner());
    objectNodeEClass.getESuperTypes().add(this.getObjectMaybeInner());
    objectNextEClass.getESuperTypes().add(this.getObjectDescriptionInner());
    objectNextEClass.getESuperTypes().add(this.getObjectMaybeInner());
    objectManyEClass.getESuperTypes().add(this.getObjectDescriptionInner());
    objectChoiceEClass.getESuperTypes().add(this.getObjectDescriptionInner());
    objectMaybeEClass.getESuperTypes().add(this.getObjectDescriptionInner());

    // Initialize classes and features; add operations and parameters
    initEClass(dtdslEClass, de.wbg.dTDSL.DTDSL.class, "DTDSL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDTDSL_ParserName(), ecorePackage.getEString(), "parserName", null, 0, 1, de.wbg.dTDSL.DTDSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDTDSL_Type(), ecorePackage.getEString(), "type", null, 0, 1, de.wbg.dTDSL.DTDSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDTDSL_ObjDescription(), this.getAbstract(), null, "objDescription", null, 0, -1, de.wbg.dTDSL.DTDSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDTDSL_Start(), this.getStartPoint(), null, "start", null, 0, 1, de.wbg.dTDSL.DTDSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(startPointEClass, StartPoint.class, "StartPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStartPoint_Begin(), this.getObjectDescription(), null, "begin", null, 0, 1, StartPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractEClass, Abstract.class, "Abstract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstract_Name(), ecorePackage.getEString(), "name", null, 0, 1, Abstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringDescriptionEClass, StringDescription.class, "StringDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectDescriptionEClass, ObjectDescription.class, "ObjectDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectDescription_Description(), this.getObjectDescriptionInner(), null, "description", null, 0, -1, ObjectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectDescriptionInnerEClass, ObjectDescriptionInner.class, "ObjectDescriptionInner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectAttributeEClass, ObjectAttribute.class, "ObjectAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectAttribute_Attributes(), ecorePackage.getEString(), "attributes", null, 0, 1, ObjectAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectNodeEClass, ObjectNode.class, "ObjectNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectNode_Attributes(), ecorePackage.getEString(), "attributes", null, 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectNode_Inner(), this.getObjectDescription(), null, "inner", null, 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectNextEClass, ObjectNext.class, "ObjectNext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectNext_Attribute(), this.getJavaCodeOrID(), null, "attribute", null, 0, 1, ObjectNext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectNext_ObjectDesription(), this.getObjectDescription(), null, "objectDesription", null, 0, 1, ObjectNext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(javaCodeOrIDEClass, JavaCodeOrID.class, "JavaCodeOrID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJavaCodeOrID_Code(), ecorePackage.getEString(), "code", null, 0, 1, JavaCodeOrID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJavaCodeOrID_Id(), ecorePackage.getEString(), "id", null, 0, 1, JavaCodeOrID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectManyEClass, ObjectMany.class, "ObjectMany", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectMany_Option(), this.getObjectMaybeInner(), null, "option", null, 0, 1, ObjectMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectChoiceEClass, ObjectChoice.class, "ObjectChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectChoice_Options(), this.getObjectMaybeInner(), null, "options", null, 0, -1, ObjectChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectMaybeEClass, ObjectMaybe.class, "ObjectMaybe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectMaybe_Option(), this.getObjectDescription(), null, "option", null, 0, 1, ObjectMaybe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectMaybe_Description(), this.getObjectMaybeInner(), null, "description", null, 0, 1, ObjectMaybe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectMaybeInnerEClass, ObjectMaybeInner.class, "ObjectMaybeInner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(keywordEClass, Keyword.class, "Keyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKeyword_Name(), ecorePackage.getEString(), "name", null, 0, 1, Keyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DTDSLPackageImpl
