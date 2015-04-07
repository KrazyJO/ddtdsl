/**
 */
package de.wbg.dTDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Description In Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.StringDescriptionInVariable#getName <em>Name</em>}</li>
 *   <li>{@link de.wbg.dTDSL.StringDescriptionInVariable#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wbg.dTDSL.DTDSLPackage#getStringDescriptionInVariable()
 * @model
 * @generated
 */
public interface StringDescriptionInVariable extends StringDescriptionInner
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
   * @see de.wbg.dTDSL.DTDSLPackage#getStringDescriptionInVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.StringDescriptionInVariable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see de.wbg.dTDSL.DTDSLPackage#getStringDescriptionInVariable_Description()
   * @model containment="true"
   * @generated
   */
  EList<StringDescriptionInner> getDescription();

} // StringDescriptionInVariable
