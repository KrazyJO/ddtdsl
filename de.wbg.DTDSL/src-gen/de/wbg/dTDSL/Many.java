/**
 */
package de.wbg.dTDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Many</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.Many#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wbg.dTDSL.DTDSLPackage#getMany()
 * @model
 * @generated
 */
public interface Many extends Abstract
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(ObjectDescriptionInner)
   * @see de.wbg.dTDSL.DTDSLPackage#getMany_Description()
   * @model containment="true"
   * @generated
   */
  ObjectDescriptionInner getDescription();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.Many#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(ObjectDescriptionInner value);

} // Many
