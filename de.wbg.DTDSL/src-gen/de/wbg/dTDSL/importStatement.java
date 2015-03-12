/**
 */
package de.wbg.dTDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>import Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.importStatement#getImportClass <em>Import Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wbg.dTDSL.DTDSLPackage#getimportStatement()
 * @model
 * @generated
 */
public interface importStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Import Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Class</em>' attribute.
   * @see #setImportClass(String)
   * @see de.wbg.dTDSL.DTDSLPackage#getimportStatement_ImportClass()
   * @model
   * @generated
   */
  String getImportClass();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.importStatement#getImportClass <em>Import Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Class</em>' attribute.
   * @see #getImportClass()
   * @generated
   */
  void setImportClass(String value);

} // importStatement
