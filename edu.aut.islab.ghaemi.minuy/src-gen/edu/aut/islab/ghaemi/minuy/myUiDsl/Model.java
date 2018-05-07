/**
 * generated by Xtext 2.10.0
 */
package edu.aut.islab.ghaemi.minuy.myUiDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.minuy.myUiDsl.Model#getHeads <em>Heads</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.minuy.myUiDsl.Model#getBodis <em>Bodis</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.minuy.myUiDsl.Model#getAccessories <em>Accessories</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Heads</b></em>' containment reference list.
   * The list contents are of type {@link edu.aut.islab.ghaemi.minuy.myUiDsl.Head}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Heads</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Heads</em>' containment reference list.
   * @see edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage#getModel_Heads()
   * @model containment="true"
   * @generated
   */
  EList<Head> getHeads();

  /**
   * Returns the value of the '<em><b>Bodis</b></em>' containment reference list.
   * The list contents are of type {@link edu.aut.islab.ghaemi.minuy.myUiDsl.Body}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bodis</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bodis</em>' containment reference list.
   * @see edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage#getModel_Bodis()
   * @model containment="true"
   * @generated
   */
  EList<Body> getBodis();

  /**
   * Returns the value of the '<em><b>Accessories</b></em>' containment reference list.
   * The list contents are of type {@link edu.aut.islab.ghaemi.minuy.myUiDsl.Accessory}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accessories</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accessories</em>' containment reference list.
   * @see edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage#getModel_Accessories()
   * @model containment="true"
   * @generated
   */
  EList<Accessory> getAccessories();

} // Model