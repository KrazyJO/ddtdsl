/**
 */
package de.wbg.dTDSL.impl;

import de.wbg.dTDSL.Abstract;
import de.wbg.dTDSL.DTDSL;
import de.wbg.dTDSL.DTDSLPackage;
import de.wbg.dTDSL.StartPoint;
import de.wbg.dTDSL.importStatement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DTDSL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.impl.DTDSLImpl#getParserName <em>Parser Name</em>}</li>
 *   <li>{@link de.wbg.dTDSL.impl.DTDSLImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.wbg.dTDSL.impl.DTDSLImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link de.wbg.dTDSL.impl.DTDSLImpl#getObjDescription <em>Obj Description</em>}</li>
 *   <li>{@link de.wbg.dTDSL.impl.DTDSLImpl#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DTDSLImpl extends MinimalEObjectImpl.Container implements DTDSL
{
  /**
   * The default value of the '{@link #getParserName() <em>Parser Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParserName()
   * @generated
   * @ordered
   */
  protected static final String PARSER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParserName() <em>Parser Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParserName()
   * @generated
   * @ordered
   */
  protected String parserName = PARSER_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<importStatement> imports;

  /**
   * The cached value of the '{@link #getObjDescription() <em>Obj Description</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjDescription()
   * @generated
   * @ordered
   */
  protected EList<Abstract> objDescription;

  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected StartPoint start;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DTDSLImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DTDSLPackage.Literals.DTDSL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParserName()
  {
    return parserName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParserName(String newParserName)
  {
    String oldParserName = parserName;
    parserName = newParserName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.DTDSL__PARSER_NAME, oldParserName, parserName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.DTDSL__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<importStatement> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<importStatement>(importStatement.class, this, DTDSLPackage.DTDSL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Abstract> getObjDescription()
  {
    if (objDescription == null)
    {
      objDescription = new EObjectContainmentEList<Abstract>(Abstract.class, this, DTDSLPackage.DTDSL__OBJ_DESCRIPTION);
    }
    return objDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StartPoint getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStart(StartPoint newStart, NotificationChain msgs)
  {
    StartPoint oldStart = start;
    start = newStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DTDSLPackage.DTDSL__START, oldStart, newStart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(StartPoint newStart)
  {
    if (newStart != start)
    {
      NotificationChain msgs = null;
      if (start != null)
        msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DTDSLPackage.DTDSL__START, null, msgs);
      if (newStart != null)
        msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DTDSLPackage.DTDSL__START, null, msgs);
      msgs = basicSetStart(newStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.DTDSL__START, newStart, newStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DTDSLPackage.DTDSL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case DTDSLPackage.DTDSL__OBJ_DESCRIPTION:
        return ((InternalEList<?>)getObjDescription()).basicRemove(otherEnd, msgs);
      case DTDSLPackage.DTDSL__START:
        return basicSetStart(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DTDSLPackage.DTDSL__PARSER_NAME:
        return getParserName();
      case DTDSLPackage.DTDSL__TYPE:
        return getType();
      case DTDSLPackage.DTDSL__IMPORTS:
        return getImports();
      case DTDSLPackage.DTDSL__OBJ_DESCRIPTION:
        return getObjDescription();
      case DTDSLPackage.DTDSL__START:
        return getStart();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DTDSLPackage.DTDSL__PARSER_NAME:
        setParserName((String)newValue);
        return;
      case DTDSLPackage.DTDSL__TYPE:
        setType((String)newValue);
        return;
      case DTDSLPackage.DTDSL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends importStatement>)newValue);
        return;
      case DTDSLPackage.DTDSL__OBJ_DESCRIPTION:
        getObjDescription().clear();
        getObjDescription().addAll((Collection<? extends Abstract>)newValue);
        return;
      case DTDSLPackage.DTDSL__START:
        setStart((StartPoint)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DTDSLPackage.DTDSL__PARSER_NAME:
        setParserName(PARSER_NAME_EDEFAULT);
        return;
      case DTDSLPackage.DTDSL__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case DTDSLPackage.DTDSL__IMPORTS:
        getImports().clear();
        return;
      case DTDSLPackage.DTDSL__OBJ_DESCRIPTION:
        getObjDescription().clear();
        return;
      case DTDSLPackage.DTDSL__START:
        setStart((StartPoint)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DTDSLPackage.DTDSL__PARSER_NAME:
        return PARSER_NAME_EDEFAULT == null ? parserName != null : !PARSER_NAME_EDEFAULT.equals(parserName);
      case DTDSLPackage.DTDSL__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case DTDSLPackage.DTDSL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case DTDSLPackage.DTDSL__OBJ_DESCRIPTION:
        return objDescription != null && !objDescription.isEmpty();
      case DTDSLPackage.DTDSL__START:
        return start != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (parserName: ");
    result.append(parserName);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //DTDSLImpl
