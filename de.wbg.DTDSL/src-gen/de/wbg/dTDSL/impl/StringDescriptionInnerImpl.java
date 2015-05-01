/**
 */
package de.wbg.dTDSL.impl;

import de.wbg.dTDSL.DTDSLPackage;
import de.wbg.dTDSL.StringDescriptionInner;
import de.wbg.dTDSL.StringKey;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Description Inner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.impl.StringDescriptionInnerImpl#getKeyRef <em>Key Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringDescriptionInnerImpl extends MinimalEObjectImpl.Container implements StringDescriptionInner
{
  /**
   * The cached value of the '{@link #getKeyRef() <em>Key Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyRef()
   * @generated
   * @ordered
   */
  protected StringKey keyRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StringDescriptionInnerImpl()
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
    return DTDSLPackage.Literals.STRING_DESCRIPTION_INNER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringKey getKeyRef()
  {
    if (keyRef != null && keyRef.eIsProxy())
    {
      InternalEObject oldKeyRef = (InternalEObject)keyRef;
      keyRef = (StringKey)eResolveProxy(oldKeyRef);
      if (keyRef != oldKeyRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DTDSLPackage.STRING_DESCRIPTION_INNER__KEY_REF, oldKeyRef, keyRef));
      }
    }
    return keyRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringKey basicGetKeyRef()
  {
    return keyRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyRef(StringKey newKeyRef)
  {
    StringKey oldKeyRef = keyRef;
    keyRef = newKeyRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.STRING_DESCRIPTION_INNER__KEY_REF, oldKeyRef, keyRef));
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
      case DTDSLPackage.STRING_DESCRIPTION_INNER__KEY_REF:
        if (resolve) return getKeyRef();
        return basicGetKeyRef();
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
      case DTDSLPackage.STRING_DESCRIPTION_INNER__KEY_REF:
        setKeyRef((StringKey)newValue);
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
      case DTDSLPackage.STRING_DESCRIPTION_INNER__KEY_REF:
        setKeyRef((StringKey)null);
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
      case DTDSLPackage.STRING_DESCRIPTION_INNER__KEY_REF:
        return keyRef != null;
    }
    return super.eIsSet(featureID);
  }

} //StringDescriptionInnerImpl
