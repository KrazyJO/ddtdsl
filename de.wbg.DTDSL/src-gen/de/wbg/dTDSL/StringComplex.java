/**
 */
package de.wbg.dTDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Complex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.StringComplex#getDescription <em>Description</em>}</li>
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
   * Returns the value of the '<em><b>Description</b></em>' containment reference list.
   * The list contents are of type {@link de.wbg.dTDSL.StringDescriptionInner}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference list.
   * @see de.wbg.dTDSL.DTDSLPackage#getStringComplex_Description()
   * @model containment="true"
   * @generated
   */
  EList<StringDescriptionInner> getDescription();

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
