/**
 */
package de.wbg.dTDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.StartPoint#getBegin <em>Begin</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wbg.dTDSL.DTDSLPackage#getStartPoint()
 * @model
 * @generated
 */
public interface StartPoint extends EObject
{
  /**
   * Returns the value of the '<em><b>Begin</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Begin</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Begin</em>' reference.
   * @see #setBegin(Abstract)
   * @see de.wbg.dTDSL.DTDSLPackage#getStartPoint_Begin()
   * @model
   * @generated
   */
  Abstract getBegin();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.StartPoint#getBegin <em>Begin</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Begin</em>' reference.
   * @see #getBegin()
   * @generated
   */
  void setBegin(Abstract value);

} // StartPoint
