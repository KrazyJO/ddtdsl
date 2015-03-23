/**
 */
package de.wbg.dTDSL.impl;

import de.wbg.dTDSL.DTDSLPackage;
import de.wbg.dTDSL.ObjectAttribute;
import de.wbg.dTDSL.ObjectDescription;

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
 *   <li>{@link de.wbg.dTDSL.impl.ObjectAttributeImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link de.wbg.dTDSL.impl.ObjectAttributeImpl#getInner <em>Inner</em>}</li>
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
   * The default value of the '{@link #getTypes() <em>Types</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected static final String TYPES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected String types = TYPES_EDEFAULT;

  /**
   * The cached value of the '{@link #getInner() <em>Inner</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInner()
   * @generated
   * @ordered
   */
  protected ObjectDescription inner;

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
  public String getTypes()
  {
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypes(String newTypes)
  {
    String oldTypes = types;
    types = newTypes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.OBJECT_ATTRIBUTE__TYPES, oldTypes, types));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectDescription getInner()
  {
    if (inner != null && inner.eIsProxy())
    {
      InternalEObject oldInner = (InternalEObject)inner;
      inner = (ObjectDescription)eResolveProxy(oldInner);
      if (inner != oldInner)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DTDSLPackage.OBJECT_ATTRIBUTE__INNER, oldInner, inner));
      }
    }
    return inner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectDescription basicGetInner()
  {
    return inner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInner(ObjectDescription newInner)
  {
    ObjectDescription oldInner = inner;
    inner = newInner;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.OBJECT_ATTRIBUTE__INNER, oldInner, inner));
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
      case DTDSLPackage.OBJECT_ATTRIBUTE__TYPES:
        return getTypes();
      case DTDSLPackage.OBJECT_ATTRIBUTE__INNER:
        if (resolve) return getInner();
        return basicGetInner();
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
      case DTDSLPackage.OBJECT_ATTRIBUTE__TYPES:
        setTypes((String)newValue);
        return;
      case DTDSLPackage.OBJECT_ATTRIBUTE__INNER:
        setInner((ObjectDescription)newValue);
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
      case DTDSLPackage.OBJECT_ATTRIBUTE__TYPES:
        setTypes(TYPES_EDEFAULT);
        return;
      case DTDSLPackage.OBJECT_ATTRIBUTE__INNER:
        setInner((ObjectDescription)null);
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
      case DTDSLPackage.OBJECT_ATTRIBUTE__TYPES:
        return TYPES_EDEFAULT == null ? types != null : !TYPES_EDEFAULT.equals(types);
      case DTDSLPackage.OBJECT_ATTRIBUTE__INNER:
        return inner != null;
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
    result.append(", types: ");
    result.append(types);
    result.append(')');
    return result.toString();
  }

} //ObjectAttributeImpl
