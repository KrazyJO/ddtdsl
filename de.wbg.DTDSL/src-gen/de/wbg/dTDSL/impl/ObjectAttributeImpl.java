/**
 */
package de.wbg.dTDSL.impl;

import de.wbg.dTDSL.DTDSLPackage;
import de.wbg.dTDSL.Keyword;
import de.wbg.dTDSL.ObjectAttribute;
import de.wbg.dTDSL.ObjectDescription;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link de.wbg.dTDSL.impl.ObjectAttributeImpl#getKeyword <em>Keyword</em>}</li>
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
   * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyword()
   * @generated
   * @ordered
   */
  protected Keyword keyword;

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
  public Keyword getKeyword()
  {
    return keyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKeyword(Keyword newKeyword, NotificationChain msgs)
  {
    Keyword oldKeyword = keyword;
    keyword = newKeyword;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DTDSLPackage.OBJECT_ATTRIBUTE__KEYWORD, oldKeyword, newKeyword);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyword(Keyword newKeyword)
  {
    if (newKeyword != keyword)
    {
      NotificationChain msgs = null;
      if (keyword != null)
        msgs = ((InternalEObject)keyword).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DTDSLPackage.OBJECT_ATTRIBUTE__KEYWORD, null, msgs);
      if (newKeyword != null)
        msgs = ((InternalEObject)newKeyword).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DTDSLPackage.OBJECT_ATTRIBUTE__KEYWORD, null, msgs);
      msgs = basicSetKeyword(newKeyword, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.OBJECT_ATTRIBUTE__KEYWORD, newKeyword, newKeyword));
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
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DTDSLPackage.OBJECT_ATTRIBUTE__KEYWORD:
        return basicSetKeyword(null, msgs);
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
      case DTDSLPackage.OBJECT_ATTRIBUTE__ATTRIBUTES:
        return getAttributes();
      case DTDSLPackage.OBJECT_ATTRIBUTE__TYPES:
        return getTypes();
      case DTDSLPackage.OBJECT_ATTRIBUTE__KEYWORD:
        return getKeyword();
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
      case DTDSLPackage.OBJECT_ATTRIBUTE__KEYWORD:
        setKeyword((Keyword)newValue);
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
      case DTDSLPackage.OBJECT_ATTRIBUTE__KEYWORD:
        setKeyword((Keyword)null);
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
      case DTDSLPackage.OBJECT_ATTRIBUTE__KEYWORD:
        return keyword != null;
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
