/**
 */
package de.wbg.dTDSL.util;

import de.wbg.dTDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.wbg.dTDSL.DTDSLPackage
 * @generated
 */
public class DTDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DTDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DTDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DTDSLSwitch<Adapter> modelSwitch =
    new DTDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseDTDSL(DTDSL object)
      {
        return createDTDSLAdapter();
      }
      @Override
      public Adapter caseimportStatement(importStatement object)
      {
        return createimportStatementAdapter();
      }
      @Override
      public Adapter caseStartPoint(StartPoint object)
      {
        return createStartPointAdapter();
      }
      @Override
      public Adapter caseAbstract(Abstract object)
      {
        return createAbstractAdapter();
      }
      @Override
      public Adapter caseObjectDescription(ObjectDescription object)
      {
        return createObjectDescriptionAdapter();
      }
      @Override
      public Adapter caseObjectDescriptionInner(ObjectDescriptionInner object)
      {
        return createObjectDescriptionInnerAdapter();
      }
      @Override
      public Adapter caseObjectAttribute(ObjectAttribute object)
      {
        return createObjectAttributeAdapter();
      }
      @Override
      public Adapter caseObjectNext(ObjectNext object)
      {
        return createObjectNextAdapter();
      }
      @Override
      public Adapter caseJavaCodeOrID(JavaCodeOrID object)
      {
        return createJavaCodeOrIDAdapter();
      }
      @Override
      public Adapter caseMany(Many object)
      {
        return createManyAdapter();
      }
      @Override
      public Adapter caseChoice(Choice object)
      {
        return createChoiceAdapter();
      }
      @Override
      public Adapter caseObjectMaybe(ObjectMaybe object)
      {
        return createObjectMaybeAdapter();
      }
      @Override
      public Adapter caseKeyword(Keyword object)
      {
        return createKeywordAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.wbg.dTDSL.DTDSL <em>DTDSL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wbg.dTDSL.DTDSL
   * @generated
   */
  public Adapter createDTDSLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wbg.dTDSL.importStatement <em>import Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wbg.dTDSL.importStatement
   * @generated
   */
  public Adapter createimportStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wbg.dTDSL.StartPoint <em>Start Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wbg.dTDSL.StartPoint
   * @generated
   */
  public Adapter createStartPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wbg.dTDSL.Abstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wbg.dTDSL.Abstract
   * @generated
   */
  public Adapter createAbstractAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wbg.dTDSL.ObjectDescription <em>Object Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wbg.dTDSL.ObjectDescription
   * @generated
   */
  public Adapter createObjectDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wbg.dTDSL.ObjectDescriptionInner <em>Object Description Inner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wbg.dTDSL.ObjectDescriptionInner
   * @generated
   */
  public Adapter createObjectDescriptionInnerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wbg.dTDSL.ObjectAttribute <em>Object Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wbg.dTDSL.ObjectAttribute
   * @generated
   */
  public Adapter createObjectAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wbg.dTDSL.ObjectNext <em>Object Next</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wbg.dTDSL.ObjectNext
   * @generated
   */
  public Adapter createObjectNextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wbg.dTDSL.JavaCodeOrID <em>Java Code Or ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wbg.dTDSL.JavaCodeOrID
   * @generated
   */
  public Adapter createJavaCodeOrIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wbg.dTDSL.Many <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wbg.dTDSL.Many
   * @generated
   */
  public Adapter createManyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wbg.dTDSL.Choice <em>Choice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wbg.dTDSL.Choice
   * @generated
   */
  public Adapter createChoiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wbg.dTDSL.ObjectMaybe <em>Object Maybe</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wbg.dTDSL.ObjectMaybe
   * @generated
   */
  public Adapter createObjectMaybeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wbg.dTDSL.Keyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wbg.dTDSL.Keyword
   * @generated
   */
  public Adapter createKeywordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DTDSLAdapterFactory
