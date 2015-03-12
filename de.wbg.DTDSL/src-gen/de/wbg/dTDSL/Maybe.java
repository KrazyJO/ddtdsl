/**
 */
package de.wbg.dTDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maybe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.Maybe#getObject <em>Object</em>}</li>
 *   <li>{@link de.wbg.dTDSL.Maybe#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wbg.dTDSL.DTDSLPackage#getMaybe()
 * @model
 * @generated
 */
public interface Maybe extends EObject
{
  /**
   * Returns the value of the '<em><b>Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' containment reference.
   * @see #setObject(Abstract)
   * @see de.wbg.dTDSL.DTDSLPackage#getMaybe_Object()
   * @model containment="true"
   * @generated
   */
  Abstract getObject();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.Maybe#getObject <em>Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' containment reference.
   * @see #getObject()
   * @generated
   */
  void setObject(Abstract value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' reference.
   * @see #setId(ObjectDescription)
   * @see de.wbg.dTDSL.DTDSLPackage#getMaybe_Id()
   * @model
   * @generated
   */
  ObjectDescription getId();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.Maybe#getId <em>Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' reference.
   * @see #getId()
   * @generated
   */
  void setId(ObjectDescription value);

} // Maybe
