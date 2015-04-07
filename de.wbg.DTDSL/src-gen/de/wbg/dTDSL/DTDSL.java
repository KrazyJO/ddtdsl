/**
 */
package de.wbg.dTDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTDSL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.DTDSL#getParserName <em>Parser Name</em>}</li>
 *   <li>{@link de.wbg.dTDSL.DTDSL#getObjDescription <em>Obj Description</em>}</li>
 *   <li>{@link de.wbg.dTDSL.DTDSL#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wbg.dTDSL.DTDSLPackage#getDTDSL()
 * @model
 * @generated
 */
public interface DTDSL extends EObject
{
  /**
   * Returns the value of the '<em><b>Parser Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parser Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parser Name</em>' attribute.
   * @see #setParserName(String)
   * @see de.wbg.dTDSL.DTDSLPackage#getDTDSL_ParserName()
   * @model
   * @generated
   */
  String getParserName();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.DTDSL#getParserName <em>Parser Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parser Name</em>' attribute.
   * @see #getParserName()
   * @generated
   */
  void setParserName(String value);

  /**
   * Returns the value of the '<em><b>Obj Description</b></em>' containment reference list.
   * The list contents are of type {@link de.wbg.dTDSL.Abstract}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obj Description</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj Description</em>' containment reference list.
   * @see de.wbg.dTDSL.DTDSLPackage#getDTDSL_ObjDescription()
   * @model containment="true"
   * @generated
   */
  EList<Abstract> getObjDescription();

  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(StartPoint)
   * @see de.wbg.dTDSL.DTDSLPackage#getDTDSL_Start()
   * @model containment="true"
   * @generated
   */
  StartPoint getStart();

  /**
   * Sets the value of the '{@link de.wbg.dTDSL.DTDSL#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(StartPoint value);

} // DTDSL
