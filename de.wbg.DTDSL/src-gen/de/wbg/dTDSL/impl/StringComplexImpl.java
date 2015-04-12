/**
 */
package de.wbg.dTDSL.impl;

import de.wbg.dTDSL.DTDSLPackage;
import de.wbg.dTDSL.StringComplex;
import de.wbg.dTDSL.StringDescriptionInVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Complex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.impl.StringComplexImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.wbg.dTDSL.impl.StringComplexImpl#getMany <em>Many</em>}</li>
 *   <li>{@link de.wbg.dTDSL.impl.StringComplexImpl#getMaybe <em>Maybe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringComplexImpl extends StringDescriptionInnerImpl implements StringComplex
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected StringDescriptionInVariable name;

  /**
   * The default value of the '{@link #getMany() <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMany()
   * @generated
   * @ordered
   */
  protected static final String MANY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMany() <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMany()
   * @generated
   * @ordered
   */
  protected String many = MANY_EDEFAULT;

  /**
   * The default value of the '{@link #getMaybe() <em>Maybe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaybe()
   * @generated
   * @ordered
   */
  protected static final String MAYBE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMaybe() <em>Maybe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaybe()
   * @generated
   * @ordered
   */
  protected String maybe = MAYBE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StringComplexImpl()
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
    return DTDSLPackage.Literals.STRING_COMPLEX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringDescriptionInVariable getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (StringDescriptionInVariable)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DTDSLPackage.STRING_COMPLEX__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringDescriptionInVariable basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(StringDescriptionInVariable newName)
  {
    StringDescriptionInVariable oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.STRING_COMPLEX__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMany()
  {
    return many;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMany(String newMany)
  {
    String oldMany = many;
    many = newMany;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.STRING_COMPLEX__MANY, oldMany, many));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMaybe()
  {
    return maybe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaybe(String newMaybe)
  {
    String oldMaybe = maybe;
    maybe = newMaybe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.STRING_COMPLEX__MAYBE, oldMaybe, maybe));
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
      case DTDSLPackage.STRING_COMPLEX__NAME:
        if (resolve) return getName();
        return basicGetName();
      case DTDSLPackage.STRING_COMPLEX__MANY:
        return getMany();
      case DTDSLPackage.STRING_COMPLEX__MAYBE:
        return getMaybe();
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
      case DTDSLPackage.STRING_COMPLEX__NAME:
        setName((StringDescriptionInVariable)newValue);
        return;
      case DTDSLPackage.STRING_COMPLEX__MANY:
        setMany((String)newValue);
        return;
      case DTDSLPackage.STRING_COMPLEX__MAYBE:
        setMaybe((String)newValue);
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
      case DTDSLPackage.STRING_COMPLEX__NAME:
        setName((StringDescriptionInVariable)null);
        return;
      case DTDSLPackage.STRING_COMPLEX__MANY:
        setMany(MANY_EDEFAULT);
        return;
      case DTDSLPackage.STRING_COMPLEX__MAYBE:
        setMaybe(MAYBE_EDEFAULT);
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
      case DTDSLPackage.STRING_COMPLEX__NAME:
        return name != null;
      case DTDSLPackage.STRING_COMPLEX__MANY:
        return MANY_EDEFAULT == null ? many != null : !MANY_EDEFAULT.equals(many);
      case DTDSLPackage.STRING_COMPLEX__MAYBE:
        return MAYBE_EDEFAULT == null ? maybe != null : !MAYBE_EDEFAULT.equals(maybe);
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
    result.append(" (many: ");
    result.append(many);
    result.append(", maybe: ");
    result.append(maybe);
    result.append(')');
    return result.toString();
  }

} //StringComplexImpl
