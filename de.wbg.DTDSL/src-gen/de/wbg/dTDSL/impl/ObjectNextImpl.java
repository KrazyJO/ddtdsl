/**
 */
package de.wbg.dTDSL.impl;

import de.wbg.dTDSL.DTDSLPackage;
import de.wbg.dTDSL.JavaCodeOrID;
import de.wbg.dTDSL.ObjectDescription;
import de.wbg.dTDSL.ObjectNext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Next</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.impl.ObjectNextImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.wbg.dTDSL.impl.ObjectNextImpl#getObjectDesription <em>Object Desription</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectNextImpl extends ObjectDescriptionInnerImpl implements ObjectNext
{
  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected JavaCodeOrID attribute;

  /**
   * The cached value of the '{@link #getObjectDesription() <em>Object Desription</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectDesription()
   * @generated
   * @ordered
   */
  protected ObjectDescription objectDesription;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectNextImpl()
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
    return DTDSLPackage.Literals.OBJECT_NEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaCodeOrID getAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttribute(JavaCodeOrID newAttribute, NotificationChain msgs)
  {
    JavaCodeOrID oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DTDSLPackage.OBJECT_NEXT__ATTRIBUTE, oldAttribute, newAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute(JavaCodeOrID newAttribute)
  {
    if (newAttribute != attribute)
    {
      NotificationChain msgs = null;
      if (attribute != null)
        msgs = ((InternalEObject)attribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DTDSLPackage.OBJECT_NEXT__ATTRIBUTE, null, msgs);
      if (newAttribute != null)
        msgs = ((InternalEObject)newAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DTDSLPackage.OBJECT_NEXT__ATTRIBUTE, null, msgs);
      msgs = basicSetAttribute(newAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.OBJECT_NEXT__ATTRIBUTE, newAttribute, newAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectDescription getObjectDesription()
  {
    if (objectDesription != null && objectDesription.eIsProxy())
    {
      InternalEObject oldObjectDesription = (InternalEObject)objectDesription;
      objectDesription = (ObjectDescription)eResolveProxy(oldObjectDesription);
      if (objectDesription != oldObjectDesription)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DTDSLPackage.OBJECT_NEXT__OBJECT_DESRIPTION, oldObjectDesription, objectDesription));
      }
    }
    return objectDesription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectDescription basicGetObjectDesription()
  {
    return objectDesription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectDesription(ObjectDescription newObjectDesription)
  {
    ObjectDescription oldObjectDesription = objectDesription;
    objectDesription = newObjectDesription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DTDSLPackage.OBJECT_NEXT__OBJECT_DESRIPTION, oldObjectDesription, objectDesription));
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
      case DTDSLPackage.OBJECT_NEXT__ATTRIBUTE:
        return basicSetAttribute(null, msgs);
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
      case DTDSLPackage.OBJECT_NEXT__ATTRIBUTE:
        return getAttribute();
      case DTDSLPackage.OBJECT_NEXT__OBJECT_DESRIPTION:
        if (resolve) return getObjectDesription();
        return basicGetObjectDesription();
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
      case DTDSLPackage.OBJECT_NEXT__ATTRIBUTE:
        setAttribute((JavaCodeOrID)newValue);
        return;
      case DTDSLPackage.OBJECT_NEXT__OBJECT_DESRIPTION:
        setObjectDesription((ObjectDescription)newValue);
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
      case DTDSLPackage.OBJECT_NEXT__ATTRIBUTE:
        setAttribute((JavaCodeOrID)null);
        return;
      case DTDSLPackage.OBJECT_NEXT__OBJECT_DESRIPTION:
        setObjectDesription((ObjectDescription)null);
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
      case DTDSLPackage.OBJECT_NEXT__ATTRIBUTE:
        return attribute != null;
      case DTDSLPackage.OBJECT_NEXT__OBJECT_DESRIPTION:
        return objectDesription != null;
    }
    return super.eIsSet(featureID);
  }

} //ObjectNextImpl
