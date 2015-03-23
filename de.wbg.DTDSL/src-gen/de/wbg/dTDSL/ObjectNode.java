/**
 */
package de.wbg.dTDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.ObjectNode#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.wbg.dTDSL.ObjectNode#getInner <em>Inner</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wbg.dTDSL.DTDSLPackage#getObjectNode()
 * @model
 * @generated
 */
public interface ObjectNode extends ObjectDescriptionInner, ObjectMaybeInner
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' attribute.
   * @see #setAttributes(String)
   * @see de.wbg.dTDSL.DTDSLPackage#getObjectNode_Attributes()
   * @model
   * @generated
   */
  String getAttributes();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.ObjectNode#getAttributes <em>Attributes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributes</em>' attribute.
   * @see #getAttributes()
   * @generated
   */
  void setAttributes(String value);

  /**
   * Returns the value of the '<em><b>Inner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inner</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inner</em>' reference.
   * @see #setInner(ObjectDescription)
   * @see de.wbg.dTDSL.DTDSLPackage#getObjectNode_Inner()
   * @model
   * @generated
   */
  ObjectDescription getInner();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.ObjectNode#getInner <em>Inner</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inner</em>' reference.
   * @see #getInner()
   * @generated
   */
  void setInner(ObjectDescription value);

} // ObjectNode
