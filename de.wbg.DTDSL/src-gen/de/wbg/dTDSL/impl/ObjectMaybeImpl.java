/**
 */
package de.wbg.dTDSL.impl;

import de.wbg.dTDSL.Abstract;
import de.wbg.dTDSL.DTDSLPackage;
import de.wbg.dTDSL.ObjectDescription;
import de.wbg.dTDSL.ObjectMaybe;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Maybe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.impl.ObjectMaybeImpl#getObject <em>Object</em>}</li>
 *   <li>{@link de.wbg.dTDSL.impl.ObjectMaybeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectMaybeImpl extends ObjectDescriptionInnerImpl implements ObjectMaybe
{
  /**
   * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected Abstract object;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected ObjectDescription id;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectMaybeImpl()
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
    return DTDSLPackage.Literals.OBJECT_MAYBE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Abstract getObject()
  {
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObject(Abstract newObject, NotificationChain msgs)
  {
    Abstract oldObject = object;
    object = newObject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DTDSLPackage.OBJECT_MAYBE__OBJECT, oldObject, newObject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObject(Abstract newObject)
  {
    if (newObject != object)
    {
      NotificationChain msgs = null;
      if (object != null)
        msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DTDSLPackage.OBJECT_MAYBE__OBJECT, null, msgs);
      if (newObject != null)
        msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DTDSLPackage.OBJECT_MAYBE__OBJECT, null, msgs);
      msgs = basicSetObject(newObject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.OBJECT_MAYBE__OBJECT, newObject, newObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectDescription getId()
  {
    if (id != null && id.eIsProxy())
    {
      InternalEObject oldId = (InternalEObject)id;
      id = (ObjectDescription)eResolveProxy(oldId);
      if (id != oldId)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DTDSLPackage.OBJECT_MAYBE__ID, oldId, id));
      }
    }
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectDescription basicGetId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(ObjectDescription newId)
  {
    ObjectDescription oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.OBJECT_MAYBE__ID, oldId, id));
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
      case DTDSLPackage.OBJECT_MAYBE__OBJECT:
        return basicSetObject(null, msgs);
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
      case DTDSLPackage.OBJECT_MAYBE__OBJECT:
        return getObject();
      case DTDSLPackage.OBJECT_MAYBE__ID:
        if (resolve) return getId();
        return basicGetId();
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
      case DTDSLPackage.OBJECT_MAYBE__OBJECT:
        setObject((Abstract)newValue);
        return;
      case DTDSLPackage.OBJECT_MAYBE__ID:
        setId((ObjectDescription)newValue);
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
      case DTDSLPackage.OBJECT_MAYBE__OBJECT:
        setObject((Abstract)null);
        return;
      case DTDSLPackage.OBJECT_MAYBE__ID:
        setId((ObjectDescription)null);
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
      case DTDSLPackage.OBJECT_MAYBE__OBJECT:
        return object != null;
      case DTDSLPackage.OBJECT_MAYBE__ID:
        return id != null;
    }
    return super.eIsSet(featureID);
  }

} //ObjectMaybeImpl
