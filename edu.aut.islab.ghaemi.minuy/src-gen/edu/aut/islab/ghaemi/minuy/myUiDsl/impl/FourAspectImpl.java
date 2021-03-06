/**
 * generated by Xtext 2.10.0
 */
package edu.aut.islab.ghaemi.minuy.myUiDsl.impl;

import edu.aut.islab.ghaemi.minuy.myUiDsl.DownAspect;
import edu.aut.islab.ghaemi.minuy.myUiDsl.FourAspect;
import edu.aut.islab.ghaemi.minuy.myUiDsl.LeftAspect;
import edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage;
import edu.aut.islab.ghaemi.minuy.myUiDsl.RightAspect;
import edu.aut.islab.ghaemi.minuy.myUiDsl.UpAspect;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Four Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.minuy.myUiDsl.impl.FourAspectImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.minuy.myUiDsl.impl.FourAspectImpl#getRight <em>Right</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.minuy.myUiDsl.impl.FourAspectImpl#getUp <em>Up</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.minuy.myUiDsl.impl.FourAspectImpl#getDown <em>Down</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FourAspectImpl extends MinimalEObjectImpl.Container implements FourAspect
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected LeftAspect left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected RightAspect right;

  /**
   * The cached value of the '{@link #getUp() <em>Up</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUp()
   * @generated
   * @ordered
   */
  protected UpAspect up;

  /**
   * The cached value of the '{@link #getDown() <em>Down</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDown()
   * @generated
   * @ordered
   */
  protected DownAspect down;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FourAspectImpl()
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
    return MyUiDslPackage.Literals.FOUR_ASPECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftAspect getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(LeftAspect newLeft, NotificationChain msgs)
  {
    LeftAspect oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyUiDslPackage.FOUR_ASPECT__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(LeftAspect newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyUiDslPackage.FOUR_ASPECT__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyUiDslPackage.FOUR_ASPECT__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUiDslPackage.FOUR_ASPECT__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightAspect getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(RightAspect newRight, NotificationChain msgs)
  {
    RightAspect oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyUiDslPackage.FOUR_ASPECT__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(RightAspect newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyUiDslPackage.FOUR_ASPECT__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyUiDslPackage.FOUR_ASPECT__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUiDslPackage.FOUR_ASPECT__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpAspect getUp()
  {
    return up;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUp(UpAspect newUp, NotificationChain msgs)
  {
    UpAspect oldUp = up;
    up = newUp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyUiDslPackage.FOUR_ASPECT__UP, oldUp, newUp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUp(UpAspect newUp)
  {
    if (newUp != up)
    {
      NotificationChain msgs = null;
      if (up != null)
        msgs = ((InternalEObject)up).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyUiDslPackage.FOUR_ASPECT__UP, null, msgs);
      if (newUp != null)
        msgs = ((InternalEObject)newUp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyUiDslPackage.FOUR_ASPECT__UP, null, msgs);
      msgs = basicSetUp(newUp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUiDslPackage.FOUR_ASPECT__UP, newUp, newUp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DownAspect getDown()
  {
    return down;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDown(DownAspect newDown, NotificationChain msgs)
  {
    DownAspect oldDown = down;
    down = newDown;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyUiDslPackage.FOUR_ASPECT__DOWN, oldDown, newDown);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDown(DownAspect newDown)
  {
    if (newDown != down)
    {
      NotificationChain msgs = null;
      if (down != null)
        msgs = ((InternalEObject)down).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyUiDslPackage.FOUR_ASPECT__DOWN, null, msgs);
      if (newDown != null)
        msgs = ((InternalEObject)newDown).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyUiDslPackage.FOUR_ASPECT__DOWN, null, msgs);
      msgs = basicSetDown(newDown, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUiDslPackage.FOUR_ASPECT__DOWN, newDown, newDown));
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
      case MyUiDslPackage.FOUR_ASPECT__LEFT:
        return basicSetLeft(null, msgs);
      case MyUiDslPackage.FOUR_ASPECT__RIGHT:
        return basicSetRight(null, msgs);
      case MyUiDslPackage.FOUR_ASPECT__UP:
        return basicSetUp(null, msgs);
      case MyUiDslPackage.FOUR_ASPECT__DOWN:
        return basicSetDown(null, msgs);
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
      case MyUiDslPackage.FOUR_ASPECT__LEFT:
        return getLeft();
      case MyUiDslPackage.FOUR_ASPECT__RIGHT:
        return getRight();
      case MyUiDslPackage.FOUR_ASPECT__UP:
        return getUp();
      case MyUiDslPackage.FOUR_ASPECT__DOWN:
        return getDown();
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
      case MyUiDslPackage.FOUR_ASPECT__LEFT:
        setLeft((LeftAspect)newValue);
        return;
      case MyUiDslPackage.FOUR_ASPECT__RIGHT:
        setRight((RightAspect)newValue);
        return;
      case MyUiDslPackage.FOUR_ASPECT__UP:
        setUp((UpAspect)newValue);
        return;
      case MyUiDslPackage.FOUR_ASPECT__DOWN:
        setDown((DownAspect)newValue);
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
      case MyUiDslPackage.FOUR_ASPECT__LEFT:
        setLeft((LeftAspect)null);
        return;
      case MyUiDslPackage.FOUR_ASPECT__RIGHT:
        setRight((RightAspect)null);
        return;
      case MyUiDslPackage.FOUR_ASPECT__UP:
        setUp((UpAspect)null);
        return;
      case MyUiDslPackage.FOUR_ASPECT__DOWN:
        setDown((DownAspect)null);
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
      case MyUiDslPackage.FOUR_ASPECT__LEFT:
        return left != null;
      case MyUiDslPackage.FOUR_ASPECT__RIGHT:
        return right != null;
      case MyUiDslPackage.FOUR_ASPECT__UP:
        return up != null;
      case MyUiDslPackage.FOUR_ASPECT__DOWN:
        return down != null;
    }
    return super.eIsSet(featureID);
  }

} //FourAspectImpl
