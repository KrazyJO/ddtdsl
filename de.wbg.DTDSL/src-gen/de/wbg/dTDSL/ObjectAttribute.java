/**
 */
package de.wbg.dTDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.ObjectAttribute#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wbg.dTDSL.DTDSLPackage#getObjectAttribute()
 * @model
 * @generated
 */
public interface ObjectAttribute extends ObjectDescriptionInner, ObjectMaybeInner
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
   * @see de.wbg.dTDSL.DTDSLPackage#getObjectAttribute_Attributes()
   * @model
   * @generated
   */
  String getAttributes();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.ObjectAttribute#getAttributes <em>Attributes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributes</em>' attribute.
   * @see #getAttributes()
   * @generated
   */
  void setAttributes(String value);

} // ObjectAttribute
