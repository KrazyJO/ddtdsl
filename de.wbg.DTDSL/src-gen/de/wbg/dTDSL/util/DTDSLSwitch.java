/**
 */
package de.wbg.dTDSL.util;

import de.wbg.dTDSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.wbg.dTDSL.DTDSLPackage
 * @generated
 */
public class DTDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DTDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DTDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DTDSLPackage.DTDSL:
      {
        DTDSL dtdsl = (DTDSL)theEObject;
        T result = caseDTDSL(dtdsl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.IMPORT_STATEMENT:
      {
        importStatement importStatement = (importStatement)theEObject;
        T result = caseimportStatement(importStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.START_POINT:
      {
        StartPoint startPoint = (StartPoint)theEObject;
        T result = caseStartPoint(startPoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.ABSTRACT:
      {
        Abstract abstract_ = (Abstract)theEObject;
        T result = caseAbstract(abstract_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.OBJECT_DESCRIPTION:
      {
        ObjectDescription objectDescription = (ObjectDescription)theEObject;
        T result = caseObjectDescription(objectDescription);
        if (result == null) result = caseAbstract(objectDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.OBJECT_DESCRIPTION_INNER:
      {
        ObjectDescriptionInner objectDescriptionInner = (ObjectDescriptionInner)theEObject;
        T result = caseObjectDescriptionInner(objectDescriptionInner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.OBJECT_ATTRIBUTE:
      {
        ObjectAttribute objectAttribute = (ObjectAttribute)theEObject;
        T result = caseObjectAttribute(objectAttribute);
        if (result == null) result = caseObjectDescriptionInner(objectAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.OBJECT_NEXT:
      {
        ObjectNext objectNext = (ObjectNext)theEObject;
        T result = caseObjectNext(objectNext);
        if (result == null) result = caseObjectDescriptionInner(objectNext);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.JAVA_CODE_OR_ID:
      {
        JavaCodeOrID javaCodeOrID = (JavaCodeOrID)theEObject;
        T result = caseJavaCodeOrID(javaCodeOrID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.MANY:
      {
        Many many = (Many)theEObject;
        T result = caseMany(many);
        if (result == null) result = caseAbstract(many);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.CHOICE:
      {
        Choice choice = (Choice)theEObject;
        T result = caseChoice(choice);
        if (result == null) result = caseAbstract(choice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.MAYBE:
      {
        Maybe maybe = (Maybe)theEObject;
        T result = caseMaybe(maybe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.KEYWORD:
      {
        Keyword keyword = (Keyword)theEObject;
        T result = caseKeyword(keyword);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DTDSL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DTDSL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDTDSL(DTDSL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>import Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>import Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseimportStatement(importStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Start Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Start Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStartPoint(StartPoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstract(Abstract object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectDescription(ObjectDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Description Inner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Description Inner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectDescriptionInner(ObjectDescriptionInner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectAttribute(ObjectAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Next</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Next</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectNext(ObjectNext object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Java Code Or ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Java Code Or ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJavaCodeOrID(JavaCodeOrID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Many</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Many</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMany(Many object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoice(Choice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Maybe</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Maybe</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaybe(Maybe object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Keyword</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Keyword</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyword(Keyword object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DTDSLSwitch
