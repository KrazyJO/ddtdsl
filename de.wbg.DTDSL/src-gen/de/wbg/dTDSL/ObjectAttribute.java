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
 *   <li>{@link de.wbg.dTDSL.ObjectAttribute#getStringMethode <em>String Methode</em>}</li>
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

  /**
   * Returns the value of the '<em><b>String Methode</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Methode</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Methode</em>' reference.
   * @see #setStringMethode(StringDescription)
   * @see de.wbg.dTDSL.DTDSLPackage#getObjectAttribute_StringMethode()
   * @model
   * @generated
   */
  StringDescription getStringMethode();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.ObjectAttribute#getStringMethode <em>String Methode</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Methode</em>' reference.
   * @see #getStringMethode()
   * @generated
   */
  void setStringMethode(StringDescription value);

} // ObjectAttribute
