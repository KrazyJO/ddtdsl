/**
 */
package de.wbg.dTDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Many</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.ObjectMany#getOption <em>Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wbg.dTDSL.DTDSLPackage#getObjectMany()
 * @model
 * @generated
 */
public interface ObjectMany extends ObjectDescriptionInner
{
  /**
   * Returns the value of the '<em><b>Option</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' containment reference.
   * @see #setOption(ObjectMaybeInner)
   * @see de.wbg.dTDSL.DTDSLPackage#getObjectMany_Option()
   * @model containment="true"
   * @generated
   */
  ObjectMaybeInner getOption();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.ObjectMany#getOption <em>Option</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option</em>' containment reference.
   * @see #getOption()
   * @generated
   */
  void setOption(ObjectMaybeInner value);

} // ObjectMany
