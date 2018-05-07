/**
 * generated by Xtext 2.10.0
 */
package edu.aut.islab.ghaemi.minuy.myUiDsl.impl;

import edu.aut.islab.ghaemi.minuy.myUiDsl.ClassName;
import edu.aut.islab.ghaemi.minuy.myUiDsl.InnerClass;
import edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inner Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.minuy.myUiDsl.impl.InnerClassImpl#getClazzes <em>Clazzes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InnerClassImpl extends MinimalEObjectImpl.Container implements InnerClass
{
  /**
   * The cached value of the '{@link #getClazzes() <em>Clazzes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClazzes()
   * @generated
   * @ordered
   */
  protected ClassName clazzes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InnerClassImpl()
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
    return MyUiDslPackage.Literals.INNER_CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassName getClazzes()
  {
    return clazzes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClazzes(ClassName newClazzes, NotificationChain msgs)
  {
    ClassName oldClazzes = clazzes;
    clazzes = newClazzes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyUiDslPackage.INNER_CLASS__CLAZZES, oldClazzes, newClazzes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClazzes(ClassName newClazzes)
  {
    if (newClazzes != clazzes)
    {
      NotificationChain msgs = null;
      if (clazzes != null)
        msgs = ((InternalEObject)clazzes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyUiDslPackage.INNER_CLASS__CLAZZES, null, msgs);
      if (newClazzes != null)
        msgs = ((InternalEObject)newClazzes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyUiDslPackage.INNER_CLASS__CLAZZES, null, msgs);
      msgs = basicSetClazzes(newClazzes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUiDslPackage.INNER_CLASS__CLAZZES, newClazzes, newClazzes));
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
      case MyUiDslPackage.INNER_CLASS__CLAZZES:
        return basicSetClazzes(null, msgs);
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
      case MyUiDslPackage.INNER_CLASS__CLAZZES:
        return getClazzes();
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
      case MyUiDslPackage.INNER_CLASS__CLAZZES:
        setClazzes((ClassName)newValue);
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
      case MyUiDslPackage.INNER_CLASS__CLAZZES:
        setClazzes((ClassName)null);
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
      case MyUiDslPackage.INNER_CLASS__CLAZZES:
        return clazzes != null;
    }
    return super.eIsSet(featureID);
  }

} //InnerClassImpl
