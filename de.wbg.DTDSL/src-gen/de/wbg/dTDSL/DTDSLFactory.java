/**
 */
package de.wbg.dTDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.wbg.dTDSL.DTDSLPackage
 * @generated
 */
public interface DTDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DTDSLFactory eINSTANCE = de.wbg.dTDSL.impl.DTDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>DTDSL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DTDSL</em>'.
   * @generated
   */
  DTDSL createDTDSL();

  /**
   * Returns a new object of class '<em>Start Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start Point</em>'.
   * @generated
   */
  StartPoint createStartPoint();

  /**
   * Returns a new object of class '<em>Abstract</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract</em>'.
   * @generated
   */
  Abstract createAbstract();

  /**
   * Returns a new object of class '<em>String Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Description</em>'.
   * @generated
   */
  StringDescription createStringDescription();

  /**
   * Returns a new object of class '<em>String Description Inner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Description Inner</em>'.
   * @generated
   */
  StringDescriptionInner createStringDescriptionInner();

  /**
   * Returns a new object of class '<em>String Over Read</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Over Read</em>'.
   * @generated
   */
  StringOverRead createStringOverRead();

  /**
   * Returns a new object of class '<em>String Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Key</em>'.
   * @generated
   */
  StringKey createStringKey();

  /**
   * Returns a new object of class '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Value</em>'.
   * @generated
   */
  StringValue createStringValue();

  /**
   * Returns a new object of class '<em>String Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Or</em>'.
   * @generated
   */
  StringOr createStringOr();

  /**
   * Returns a new object of class '<em>String Description In Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Description In Variable</em>'.
   * @generated
   */
  StringDescriptionInVariable createStringDescriptionInVariable();

  /**
   * Returns a new object of class '<em>String Complex</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Complex</em>'.
   * @generated
   */
  StringComplex createStringComplex();

  /**
   * Returns a new object of class '<em>Object Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Description</em>'.
   * @generated
   */
  ObjectDescription createObjectDescription();

  /**
   * Returns a new object of class '<em>Object Description Inner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Description Inner</em>'.
   * @generated
   */
  ObjectDescriptionInner createObjectDescriptionInner();

  /**
   * Returns a new object of class '<em>Object Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Attribute</em>'.
   * @generated
   */
  ObjectAttribute createObjectAttribute();

  /**
   * Returns a new object of class '<em>Object Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Node</em>'.
   * @generated
   */
  ObjectNode createObjectNode();

  /**
   * Returns a new object of class '<em>Object Next</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Next</em>'.
   * @generated
   */
  ObjectNext createObjectNext();

  /**
   * Returns a new object of class '<em>Java Code Or ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Java Code Or ID</em>'.
   * @generated
   */
  JavaCodeOrID createJavaCodeOrID();

  /**
   * Returns a new object of class '<em>Object Many</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Many</em>'.
   * @generated
   */
  ObjectMany createObjectMany();

  /**
   * Returns a new object of class '<em>Object Choice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Choice</em>'.
   * @generated
   */
  ObjectChoice createObjectChoice();

  /**
   * Returns a new object of class '<em>Object Maybe</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Maybe</em>'.
   * @generated
   */
  ObjectMaybe createObjectMaybe();

  /**
   * Returns a new object of class '<em>Object Maybe Inner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Maybe Inner</em>'.
   * @generated
   */
  ObjectMaybeInner createObjectMaybeInner();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DTDSLPackage getDTDSLPackage();

} //DTDSLFactory
