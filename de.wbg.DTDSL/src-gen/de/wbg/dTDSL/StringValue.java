/**
 */
package de.wbg.dTDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.StringValue#getName <em>Name</em>}</li>
 *   <li>{@link de.wbg.dTDSL.StringValue#getType <em>Type</em>}</li>
 *   <li>{@link de.wbg.dTDSL.StringValue#getToKey <em>To Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wbg.dTDSL.DTDSLPackage#getStringValue()
 * @model
 * @generated
 */
public interface StringValue extends StringDescriptionInner
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.wbg.dTDSL.DTDSLPackage#getStringValue_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.StringValue#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see de.wbg.dTDSL.DTDSLPackage#getStringValue_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.StringValue#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>To Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Key</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Key</em>' reference.
   * @see #setToKey(StringKey)
   * @see de.wbg.dTDSL.DTDSLPackage#getStringValue_ToKey()
   * @model
   * @generated
   */
  StringKey getToKey();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.StringValue#getToKey <em>To Key</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Key</em>' reference.
   * @see #getToKey()
   * @generated
   */
  void setToKey(StringKey value);

} // StringValue
