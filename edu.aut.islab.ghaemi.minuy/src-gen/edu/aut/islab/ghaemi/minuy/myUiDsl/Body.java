/**
 * generated by Xtext 2.10.0
 */
package edu.aut.islab.ghaemi.minuy.myUiDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.minuy.myUiDsl.Body#getName <em>Name</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.minuy.myUiDsl.Body#getRight <em>Right</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.minuy.myUiDsl.Body#getSelfRepeat <em>Self Repeat</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage#getBody()
 * @model
 * @generated
 */
public interface Body extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Node)
   * @see edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage#getBody_Name()
   * @model containment="true"
   * @generated
   */
  Node getName();

  /**
   * Sets the value of the '{@link edu.aut.islab.ghaemi.minuy.myUiDsl.Body#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Node value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link edu.aut.islab.ghaemi.minuy.myUiDsl.Node}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage#getBody_Right()
   * @model containment="true"
   * @generated
   */
  EList<Node> getRight();

  /**
   * Returns the value of the '<em><b>Self Repeat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Self Repeat</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Self Repeat</em>' containment reference.
   * @see #setSelfRepeat(SelfRepeat)
   * @see edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage#getBody_SelfRepeat()
   * @model containment="true"
   * @generated
   */
  SelfRepeat getSelfRepeat();

  /**
   * Sets the value of the '{@link edu.aut.islab.ghaemi.minuy.myUiDsl.Body#getSelfRepeat <em>Self Repeat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Self Repeat</em>' containment reference.
   * @see #getSelfRepeat()
   * @generated
   */
  void setSelfRepeat(SelfRepeat value);

} // Body
