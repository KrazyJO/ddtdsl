/**
 */
package de.wbg.dTDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Next</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.ObjectNext#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.wbg.dTDSL.ObjectNext#getObjectDesription <em>Object Desription</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wbg.dTDSL.DTDSLPackage#getObjectNext()
 * @model
 * @generated
 */
public interface ObjectNext extends ObjectDescriptionInner, ObjectMaybeInner
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference.
   * @see #setAttribute(JavaCodeOrID)
   * @see de.wbg.dTDSL.DTDSLPackage#getObjectNext_Attribute()
   * @model containment="true"
   * @generated
   */
  JavaCodeOrID getAttribute();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.ObjectNext#getAttribute <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' containment reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(JavaCodeOrID value);

  /**
   * Returns the value of the '<em><b>Object Desription</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Desription</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Desription</em>' reference.
   * @see #setObjectDesription(ObjectDescription)
   * @see de.wbg.dTDSL.DTDSLPackage#getObjectNext_ObjectDesription()
   * @model
   * @generated
   */
  ObjectDescription getObjectDesription();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.ObjectNext#getObjectDesription <em>Object Desription</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Desription</em>' reference.
   * @see #getObjectDesription()
   * @generated
   */
  void setObjectDesription(ObjectDescription value);

} // ObjectNext
