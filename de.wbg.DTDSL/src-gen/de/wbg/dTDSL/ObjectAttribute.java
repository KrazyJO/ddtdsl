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
 *   <li>{@link de.wbg.dTDSL.ObjectAttribute#getTypes <em>Types</em>}</li>
 *   <li>{@link de.wbg.dTDSL.ObjectAttribute#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link de.wbg.dTDSL.ObjectAttribute#getInner <em>Inner</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wbg.dTDSL.DTDSLPackage#getObjectAttribute()
 * @model
 * @generated
 */
public interface ObjectAttribute extends ObjectDescriptionInner
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
   * Returns the value of the '<em><b>Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' attribute.
   * @see #setTypes(String)
   * @see de.wbg.dTDSL.DTDSLPackage#getObjectAttribute_Types()
   * @model
   * @generated
   */
  String getTypes();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.ObjectAttribute#getTypes <em>Types</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Types</em>' attribute.
   * @see #getTypes()
   * @generated
   */
  void setTypes(String value);

  /**
   * Returns the value of the '<em><b>Keyword</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keyword</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keyword</em>' containment reference.
   * @see #setKeyword(Keyword)
   * @see de.wbg.dTDSL.DTDSLPackage#getObjectAttribute_Keyword()
   * @model containment="true"
   * @generated
   */
  Keyword getKeyword();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.ObjectAttribute#getKeyword <em>Keyword</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keyword</em>' containment reference.
   * @see #getKeyword()
   * @generated
   */
  void setKeyword(Keyword value);

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
   * @see de.wbg.dTDSL.DTDSLPackage#getObjectAttribute_Inner()
   * @model
   * @generated
   */
  ObjectDescription getInner();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.ObjectAttribute#getInner <em>Inner</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inner</em>' reference.
   * @see #getInner()
   * @generated
   */
  void setInner(ObjectDescription value);

} // ObjectAttribute
