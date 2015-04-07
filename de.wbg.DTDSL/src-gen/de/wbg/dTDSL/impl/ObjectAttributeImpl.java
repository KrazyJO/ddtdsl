/**
 */
package de.wbg.dTDSL.impl;

import de.wbg.dTDSL.DTDSLPackage;
import de.wbg.dTDSL.ObjectAttribute;
import de.wbg.dTDSL.StringDescription;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.impl.ObjectAttributeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.wbg.dTDSL.impl.ObjectAttributeImpl#getStringMethode <em>String Methode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectAttributeImpl extends ObjectDescriptionInnerImpl implements ObjectAttribute
{
  /**
   * The default value of the '{@link #getAttributes() <em>Attributes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected static final String ATTRIBUTES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected String attributes = ATTRIBUTES_EDEFAULT;

  /**
   * The cached value of the '{@link #getStringMethode() <em>String Methode</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringMethode()
   * @generated
   * @ordered
   */
  protected StringDescription stringMethode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectAttributeImpl()
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
    return DTDSLPackage.Literals.OBJECT_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttributes()
  {
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributes(String newAttributes)
  {
    String oldAttributes = attributes;
    attributes = newAttributes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.OBJECT_ATTRIBUTE__ATTRIBUTES, oldAttributes, attributes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringDescription getStringMethode()
  {
    if (stringMethode != null && stringMethode.eIsProxy())
    {
      InternalEObject oldStringMethode = (InternalEObject)stringMethode;
      stringMethode = (StringDescription)eResolveProxy(oldStringMethode);
      if (stringMethode != oldStringMethode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DTDSLPackage.OBJECT_ATTRIBUTE__STRING_METHODE, oldStringMethode, stringMethode));
      }
    }
    return stringMethode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringDescription basicGetStringMethode()
  {
    return stringMethode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringMethode(StringDescription newStringMethode)
  {
    StringDescription oldStringMethode = stringMethode;
    stringMethode = newStringMethode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.OBJECT_ATTRIBUTE__STRING_METHODE, oldStringMethode, stringMethode));
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
      case DTDSLPackage.OBJECT_ATTRIBUTE__ATTRIBUTES:
        return getAttributes();
      case DTDSLPackage.OBJECT_ATTRIBUTE__STRING_METHODE:
        if (resolve) return getStringMethode();
        return basicGetStringMethode();
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
      case DTDSLPackage.OBJECT_ATTRIBUTE__ATTRIBUTES:
        setAttributes((String)newValue);
        return;
      case DTDSLPackage.OBJECT_ATTRIBUTE__STRING_METHODE:
        setStringMethode((StringDescription)newValue);
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
      case DTDSLPackage.OBJECT_ATTRIBUTE__ATTRIBUTES:
        setAttributes(ATTRIBUTES_EDEFAULT);
        return;
      case DTDSLPackage.OBJECT_ATTRIBUTE__STRING_METHODE:
        setStringMethode((StringDescription)null);
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
      case DTDSLPackage.OBJECT_ATTRIBUTE__ATTRIBUTES:
        return ATTRIBUTES_EDEFAULT == null ? attributes != null : !ATTRIBUTES_EDEFAULT.equals(attributes);
      case DTDSLPackage.OBJECT_ATTRIBUTE__STRING_METHODE:
        return stringMethode != null;
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
    result.append(" (attributes: ");
    result.append(attributes);
    result.append(')');
    return result.toString();
  }

} //ObjectAttributeImpl
