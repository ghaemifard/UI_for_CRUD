/**
 * generated by Xtext 2.10.0
 */
package edu.aut.islab.ghaemi.minuy.myUiDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.minuy.myUiDsl.ClassName#getTheId <em>The Id</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.minuy.myUiDsl.ClassName#getClazz <em>Clazz</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage#getClassName()
 * @model
 * @generated
 */
public interface ClassName extends EObject
{
  /**
   * Returns the value of the '<em><b>The Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>The Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>The Id</em>' attribute.
   * @see #setTheId(String)
   * @see edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage#getClassName_TheId()
   * @model
   * @generated
   */
  String getTheId();

  /**
   * Sets the value of the '{@link edu.aut.islab.ghaemi.minuy.myUiDsl.ClassName#getTheId <em>The Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>The Id</em>' attribute.
   * @see #getTheId()
   * @generated
   */
  void setTheId(String value);

  /**
   * Returns the value of the '<em><b>Clazz</b></em>' containment reference list.
   * The list contents are of type {@link edu.aut.islab.ghaemi.minuy.myUiDsl.ClassNameSec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clazz</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clazz</em>' containment reference list.
   * @see edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage#getClassName_Clazz()
   * @model containment="true"
   * @generated
   */
  EList<ClassNameSec> getClazz();

} // ClassName
