/**
 */
package de.wbg.dTDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Complex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.StringComplex#getName <em>Name</em>}</li>
 *   <li>{@link de.wbg.dTDSL.StringComplex#getMany <em>Many</em>}</li>
 *   <li>{@link de.wbg.dTDSL.StringComplex#getMaybe <em>Maybe</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wbg.dTDSL.DTDSLPackage#getStringComplex()
 * @model
 * @generated
 */
public interface StringComplex extends StringDescriptionInner
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(StringDescriptionInVariable)
   * @see de.wbg.dTDSL.DTDSLPackage#getStringComplex_Name()
   * @model
   * @generated
   */
  StringDescriptionInVariable getName();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.StringComplex#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(StringDescriptionInVariable value);

  /**
   * Returns the value of the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Many</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many</em>' attribute.
   * @see #setMany(String)
   * @see de.wbg.dTDSL.DTDSLPackage#getStringComplex_Many()
   * @model
   * @generated
   */
  String getMany();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.StringComplex#getMany <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Many</em>' attribute.
   * @see #getMany()
   * @generated
   */
  void setMany(String value);

  /**
   * Returns the value of the '<em><b>Maybe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maybe</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maybe</em>' attribute.
   * @see #setMaybe(String)
   * @see de.wbg.dTDSL.DTDSLPackage#getStringComplex_Maybe()
   * @model
   * @generated
   */
  String getMaybe();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.StringComplex#getMaybe <em>Maybe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maybe</em>' attribute.
   * @see #getMaybe()
   * @generated
   */
  void setMaybe(String value);

} // StringComplex
