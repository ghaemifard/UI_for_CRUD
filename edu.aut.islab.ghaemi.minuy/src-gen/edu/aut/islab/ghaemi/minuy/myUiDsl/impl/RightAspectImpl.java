/**
 * generated by Xtext 2.10.0
 */
package edu.aut.islab.ghaemi.minuy.myUiDsl.impl;

import edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage;
import edu.aut.islab.ghaemi.minuy.myUiDsl.RightAspect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.minuy.myUiDsl.impl.RightAspectImpl#getValue <em>Value</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.minuy.myUiDsl.impl.RightAspectImpl#getMeasureType <em>Measure Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RightAspectImpl extends MinimalEObjectImpl.Container implements RightAspect
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getMeasureType() <em>Measure Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasureType()
   * @generated
   * @ordered
   */
  protected static final String MEASURE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMeasureType() <em>Measure Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasureType()
   * @generated
   * @ordered
   */
  protected String measureType = MEASURE_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RightAspectImpl()
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
    return MyUiDslPackage.Literals.RIGHT_ASPECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUiDslPackage.RIGHT_ASPECT__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMeasureType()
  {
    return measureType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMeasureType(String newMeasureType)
  {
    String oldMeasureType = measureType;
    measureType = newMeasureType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUiDslPackage.RIGHT_ASPECT__MEASURE_TYPE, oldMeasureType, measureType));
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
      case MyUiDslPackage.RIGHT_ASPECT__VALUE:
        return getValue();
      case MyUiDslPackage.RIGHT_ASPECT__MEASURE_TYPE:
        return getMeasureType();
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
      case MyUiDslPackage.RIGHT_ASPECT__VALUE:
        setValue((Integer)newValue);
        return;
      case MyUiDslPackage.RIGHT_ASPECT__MEASURE_TYPE:
        setMeasureType((String)newValue);
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
      case MyUiDslPackage.RIGHT_ASPECT__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case MyUiDslPackage.RIGHT_ASPECT__MEASURE_TYPE:
        setMeasureType(MEASURE_TYPE_EDEFAULT);
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
      case MyUiDslPackage.RIGHT_ASPECT__VALUE:
        return value != VALUE_EDEFAULT;
      case MyUiDslPackage.RIGHT_ASPECT__MEASURE_TYPE:
        return MEASURE_TYPE_EDEFAULT == null ? measureType != null : !MEASURE_TYPE_EDEFAULT.equals(measureType);
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
    result.append(" (value: ");
    result.append(value);
    result.append(", measureType: ");
    result.append(measureType);
    result.append(')');
    return result.toString();
  }

} //RightAspectImpl
