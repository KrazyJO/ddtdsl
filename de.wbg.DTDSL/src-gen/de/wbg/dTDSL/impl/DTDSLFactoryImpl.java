/**
 */
package de.wbg.dTDSL.impl;

import de.wbg.dTDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DTDSLFactoryImpl extends EFactoryImpl implements DTDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DTDSLFactory init()
  {
    try
    {
      DTDSLFactory theDTDSLFactory = (DTDSLFactory)EPackage.Registry.INSTANCE.getEFactory(DTDSLPackage.eNS_URI);
      if (theDTDSLFactory != null)
      {
        return theDTDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DTDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DTDSLPackage.DTDSL: return createDTDSL();
      case DTDSLPackage.IMPORT_STATEMENT: return createimportStatement();
      case DTDSLPackage.START_POINT: return createStartPoint();
      case DTDSLPackage.ABSTRACT: return createAbstract();
      case DTDSLPackage.OBJECT_DESCRIPTION: return createObjectDescription();
      case DTDSLPackage.OBJECT_DESCRIPTION_INNER: return createObjectDescriptionInner();
      case DTDSLPackage.OBJECT_ATTRIBUTE: return createObjectAttribute();
      case DTDSLPackage.OBJECT_NEXT: return createObjectNext();
      case DTDSLPackage.JAVA_CODE_OR_ID: return createJavaCodeOrID();
      case DTDSLPackage.MANY: return createMany();
      case DTDSLPackage.CHOICE: return createChoice();
      case DTDSLPackage.OBJECT_MAYBE: return createObjectMaybe();
      case DTDSLPackage.KEYWORD: return createKeyword();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTDSL createDTDSL()
  {
    DTDSLImpl dtdsl = new DTDSLImpl();
    return dtdsl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public importStatement createimportStatement()
  {
    importStatementImpl importStatement = new importStatementImpl();
    return importStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StartPoint createStartPoint()
  {
    StartPointImpl startPoint = new StartPointImpl();
    return startPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Abstract createAbstract()
  {
    AbstractImpl abstract_ = new AbstractImpl();
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectDescription createObjectDescription()
  {
    ObjectDescriptionImpl objectDescription = new ObjectDescriptionImpl();
    return objectDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectDescriptionInner createObjectDescriptionInner()
  {
    ObjectDescriptionInnerImpl objectDescriptionInner = new ObjectDescriptionInnerImpl();
    return objectDescriptionInner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectAttribute createObjectAttribute()
  {
    ObjectAttributeImpl objectAttribute = new ObjectAttributeImpl();
    return objectAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectNext createObjectNext()
  {
    ObjectNextImpl objectNext = new ObjectNextImpl();
    return objectNext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaCodeOrID createJavaCodeOrID()
  {
    JavaCodeOrIDImpl javaCodeOrID = new JavaCodeOrIDImpl();
    return javaCodeOrID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Many createMany()
  {
    ManyImpl many = new ManyImpl();
    return many;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Choice createChoice()
  {
    ChoiceImpl choice = new ChoiceImpl();
    return choice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectMaybe createObjectMaybe()
  {
    ObjectMaybeImpl objectMaybe = new ObjectMaybeImpl();
    return objectMaybe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Keyword createKeyword()
  {
    KeywordImpl keyword = new KeywordImpl();
    return keyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTDSLPackage getDTDSLPackage()
  {
    return (DTDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DTDSLPackage getPackage()
  {
    return DTDSLPackage.eINSTANCE;
  }

} //DTDSLFactoryImpl
