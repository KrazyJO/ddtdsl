/**
 */
package de.wbg.dTDSL.impl;

import de.wbg.dTDSL.DTDSLPackage;
import de.wbg.dTDSL.StringKey;
import de.wbg.dTDSL.StringValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.impl.StringValueImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.wbg.dTDSL.impl.StringValueImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.wbg.dTDSL.impl.StringValueImpl#getToKey <em>To Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringValueImpl extends StringDescriptionInnerImpl implements StringValue
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getToKey() <em>To Key</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToKey()
   * @generated
   * @ordered
   */
  protected StringKey toKey;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StringValueImpl()
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
    return DTDSLPackage.Literals.STRING_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.STRING_VALUE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.STRING_VALUE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringKey getToKey()
  {
    if (toKey != null && toKey.eIsProxy())
    {
      InternalEObject oldToKey = (InternalEObject)toKey;
      toKey = (StringKey)eResolveProxy(oldToKey);
      if (toKey != oldToKey)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DTDSLPackage.STRING_VALUE__TO_KEY, oldToKey, toKey));
      }
    }
    return toKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringKey basicGetToKey()
  {
    return toKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToKey(StringKey newToKey)
  {
    StringKey oldToKey = toKey;
    toKey = newToKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.STRING_VALUE__TO_KEY, oldToKey, toKey));
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
      case DTDSLPackage.STRING_VALUE__NAME:
        return getName();
      case DTDSLPackage.STRING_VALUE__TYPE:
        return getType();
      case DTDSLPackage.STRING_VALUE__TO_KEY:
        if (resolve) return getToKey();
        return basicGetToKey();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DTDSLPackage.STRING_VALUE__NAME:
        setName((String)newValue);
        return;
      case DTDSLPackage.STRING_VALUE__TYPE:
        setType((String)newValue);
        return;
      case DTDSLPackage.STRING_VALUE__TO_KEY:
        setToKey((StringKey)newValue);
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
      case DTDSLPackage.STRING_VALUE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DTDSLPackage.STRING_VALUE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case DTDSLPackage.STRING_VALUE__TO_KEY:
        setToKey((StringKey)null);
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
      case DTDSLPackage.STRING_VALUE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DTDSLPackage.STRING_VALUE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case DTDSLPackage.STRING_VALUE__TO_KEY:
        return toKey != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //StringValueImpl
