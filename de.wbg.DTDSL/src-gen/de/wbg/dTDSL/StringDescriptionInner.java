/**
 */
package de.wbg.dTDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Description Inner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.StringDescriptionInner#getKeyRef <em>Key Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wbg.dTDSL.DTDSLPackage#getStringDescriptionInner()
 * @model
 * @generated
 */
public interface StringDescriptionInner extends EObject
{
  /**
   * Returns the value of the '<em><b>Key Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Ref</em>' reference.
   * @see #setKeyRef(StringKey)
   * @see de.wbg.dTDSL.DTDSLPackage#getStringDescriptionInner_KeyRef()
   * @model
   * @generated
   */
  StringKey getKeyRef();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.StringDescriptionInner#getKeyRef <em>Key Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Ref</em>' reference.
   * @see #getKeyRef()
   * @generated
   */
  void setKeyRef(StringKey value);

} // StringDescriptionInner
