/**
 */
package de.wbg.dTDSL.impl;

import de.wbg.dTDSL.DTDSLPackage;
import de.wbg.dTDSL.StringComplex;
import de.wbg.dTDSL.StringDescriptionInner;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Complex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.wbg.dTDSL.impl.StringComplexImpl#getDescription <em>Description</em>}</li>
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
   * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected EList<StringDescriptionInner> description;

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
  public EList<StringDescriptionInner> getDescription()
  {
    if (description == null)
    {
      description = new EObjectContainmentEList<StringDescriptionInner>(StringDescriptionInner.class, this, DTDSLPackage.STRING_COMPLEX__DESCRIPTION);
    }
    return description;
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
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DTDSLPackage.STRING_COMPLEX__DESCRIPTION:
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
      case DTDSLPackage.STRING_COMPLEX__DESCRIPTION:
        return getDescription();
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
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DTDSLPackage.STRING_COMPLEX__DESCRIPTION:
        getDescription().clear();
        getDescription().addAll((Collection<? extends StringDescriptionInner>)newValue);
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
      case DTDSLPackage.STRING_COMPLEX__DESCRIPTION:
        getDescription().clear();
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
      case DTDSLPackage.STRING_COMPLEX__DESCRIPTION:
        return description != null && !description.isEmpty();
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
