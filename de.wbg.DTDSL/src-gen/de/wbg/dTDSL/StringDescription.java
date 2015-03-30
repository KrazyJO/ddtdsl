/**
 */
package de.wbg.dTDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.StringDescription#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wbg.dTDSL.DTDSLPackage#getStringDescription()
 * @model
 * @generated
 */
public interface StringDescription extends Abstract
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute list.
   * @see de.wbg.dTDSL.DTDSLPackage#getStringDescription_Description()
   * @model unique="false"
   * @generated
   */
  EList<String> getDescription();

} // StringDescription
