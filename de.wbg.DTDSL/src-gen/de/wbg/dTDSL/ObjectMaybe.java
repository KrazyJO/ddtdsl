/**
 */
package de.wbg.dTDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Maybe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.ObjectMaybe#getOption <em>Option</em>}</li>
 *   <li>{@link de.wbg.dTDSL.ObjectMaybe#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wbg.dTDSL.DTDSLPackage#getObjectMaybe()
 * @model
 * @generated
 */
public interface ObjectMaybe extends ObjectDescriptionInner
{
  /**
   * Returns the value of the '<em><b>Option</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' reference.
   * @see #setOption(ObjectDescription)
   * @see de.wbg.dTDSL.DTDSLPackage#getObjectMaybe_Option()
   * @model
   * @generated
   */
  ObjectDescription getOption();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.ObjectMaybe#getOption <em>Option</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option</em>' reference.
   * @see #getOption()
   * @generated
   */
  void setOption(ObjectDescription value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(ObjectMaybeInner)
   * @see de.wbg.dTDSL.DTDSLPackage#getObjectMaybe_Description()
   * @model containment="true"
   * @generated
   */
  ObjectMaybeInner getDescription();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.ObjectMaybe#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(ObjectMaybeInner value);

} // ObjectMaybe
