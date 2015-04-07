/**
 */
package de.wbg.dTDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.ObjectChoice#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wbg.dTDSL.DTDSLPackage#getObjectChoice()
 * @model
 * @generated
 */
public interface ObjectChoice extends ObjectDescriptionInner
{
  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link de.wbg.dTDSL.ObjectMaybeInner}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see de.wbg.dTDSL.DTDSLPackage#getObjectChoice_Options()
   * @model containment="true"
   * @generated
   */
  EList<ObjectMaybeInner> getOptions();

} // ObjectChoice
