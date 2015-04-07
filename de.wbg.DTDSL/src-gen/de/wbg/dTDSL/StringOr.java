/**
 */
package de.wbg.dTDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.StringOr#getOption <em>Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wbg.dTDSL.DTDSLPackage#getStringOr()
 * @model
 * @generated
 */
public interface StringOr extends StringDescriptionInner
{
  /**
   * Returns the value of the '<em><b>Option</b></em>' reference list.
   * The list contents are of type {@link de.wbg.dTDSL.StringDescriptionInVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' reference list.
   * @see de.wbg.dTDSL.DTDSLPackage#getStringOr_Option()
   * @model
   * @generated
   */
  EList<StringDescriptionInVariable> getOption();

} // StringOr
