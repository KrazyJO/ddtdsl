/**
 */
package de.wbg.dTDSL.impl;

import de.wbg.dTDSL.DTDSLPackage;
import de.wbg.dTDSL.StringDescription;
import de.wbg.dTDSL.StringDescriptionInner;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.impl.StringDescriptionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringDescriptionImpl extends AbstractImpl implements StringDescription
{
  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected EList<StringDescriptionInner> description;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StringDescriptionImpl()
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
    return DTDSLPackage.Literals.STRING_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StringDescriptionInner> getDescription()
  {
    if (description == null)
    {
      description = new EObjectContainmentEList<StringDescriptionInner>(StringDescriptionInner.class, this, DTDSLPackage.STRING_DESCRIPTION__DESCRIPTION);
    }
    return description;
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
      case DTDSLPackage.STRING_DESCRIPTION__DESCRIPTION:
        return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
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
      case DTDSLPackage.STRING_DESCRIPTION__DESCRIPTION:
        return getDescription();
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
      case DTDSLPackage.STRING_DESCRIPTION__DESCRIPTION:
        getDescription().clear();
        getDescription().addAll((Collection<? extends StringDescriptionInner>)newValue);
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
      case DTDSLPackage.STRING_DESCRIPTION__DESCRIPTION:
        getDescription().clear();
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
      case DTDSLPackage.STRING_DESCRIPTION__DESCRIPTION:
        return description != null && !description.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StringDescriptionImpl
