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
   * Returns a new object of class '<em>Keyword</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Keyword</em>'.
   * @generated
   */
  Keyword createKeyword();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DTDSLPackage getDTDSLPackage();

} //DTDSLFactory
