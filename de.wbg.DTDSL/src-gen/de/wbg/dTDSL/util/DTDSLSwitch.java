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
      case DTDSLPackage.STRING_DESCRIPTION:
      {
        StringDescription stringDescription = (StringDescription)theEObject;
        T result = caseStringDescription(stringDescription);
        if (result == null) result = caseAbstract(stringDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.STRING_DESCRIPTION_INNER:
      {
        StringDescriptionInner stringDescriptionInner = (StringDescriptionInner)theEObject;
        T result = caseStringDescriptionInner(stringDescriptionInner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.STRING_OVER_READ:
      {
        StringOverRead stringOverRead = (StringOverRead)theEObject;
        T result = caseStringOverRead(stringOverRead);
        if (result == null) result = caseStringDescriptionInner(stringOverRead);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.STRING_KEY:
      {
        StringKey stringKey = (StringKey)theEObject;
        T result = caseStringKey(stringKey);
        if (result == null) result = caseStringDescriptionInner(stringKey);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.STRING_VALUE:
      {
        StringValue stringValue = (StringValue)theEObject;
        T result = caseStringValue(stringValue);
        if (result == null) result = caseStringDescriptionInner(stringValue);
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
        if (result == null) result = caseObjectMaybeInner(objectAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.OBJECT_NODE:
      {
        ObjectNode objectNode = (ObjectNode)theEObject;
        T result = caseObjectNode(objectNode);
        if (result == null) result = caseObjectDescriptionInner(objectNode);
        if (result == null) result = caseObjectMaybeInner(objectNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.OBJECT_NEXT:
      {
        ObjectNext objectNext = (ObjectNext)theEObject;
        T result = caseObjectNext(objectNext);
        if (result == null) result = caseObjectDescriptionInner(objectNext);
        if (result == null) result = caseObjectMaybeInner(objectNext);
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
      case DTDSLPackage.OBJECT_MANY:
      {
        ObjectMany objectMany = (ObjectMany)theEObject;
        T result = caseObjectMany(objectMany);
        if (result == null) result = caseObjectDescriptionInner(objectMany);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.OBJECT_CHOICE:
      {
        ObjectChoice objectChoice = (ObjectChoice)theEObject;
        T result = caseObjectChoice(objectChoice);
        if (result == null) result = caseObjectDescriptionInner(objectChoice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.OBJECT_MAYBE:
      {
        ObjectMaybe objectMaybe = (ObjectMaybe)theEObject;
        T result = caseObjectMaybe(objectMaybe);
        if (result == null) result = caseObjectDescriptionInner(objectMaybe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DTDSLPackage.OBJECT_MAYBE_INNER:
      {
        ObjectMaybeInner objectMaybeInner = (ObjectMaybeInner)theEObject;
        T result = caseObjectMaybeInner(objectMaybeInner);
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
   * Returns the result of interpreting the object as an instance of '<em>String Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringDescription(StringDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Description Inner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Description Inner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringDescriptionInner(StringDescriptionInner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Over Read</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Over Read</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringOverRead(StringOverRead object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringKey(StringKey object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValue(StringValue object)
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
   * Returns the result of interpreting the object as an instance of '<em>Object Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectNode(ObjectNode object)
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
   * Returns the result of interpreting the object as an instance of '<em>Object Many</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Many</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectMany(ObjectMany object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Choice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Choice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectChoice(ObjectChoice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Maybe</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Maybe</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectMaybe(ObjectMaybe object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Maybe Inner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Maybe Inner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectMaybeInner(ObjectMaybeInner object)
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
