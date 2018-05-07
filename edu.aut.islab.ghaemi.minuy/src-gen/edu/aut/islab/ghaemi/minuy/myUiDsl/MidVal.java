/**
 * generated by Xtext 2.10.0
 */
package edu.aut.islab.ghaemi.minuy.myUiDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mid Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.minuy.myUiDsl.MidVal#getValue <em>Value</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.minuy.myUiDsl.MidVal#getMeasureType <em>Measure Type</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage#getMidVal()
 * @model
 * @generated
 */
public interface MidVal extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage#getMidVal_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link edu.aut.islab.ghaemi.minuy.myUiDsl.MidVal#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Measure Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Measure Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measure Type</em>' attribute.
   * @see #setMeasureType(String)
   * @see edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage#getMidVal_MeasureType()
   * @model
   * @generated
   */
  String getMeasureType();

  /**
   * Sets the value of the '{@link edu.aut.islab.ghaemi.minuy.myUiDsl.MidVal#getMeasureType <em>Measure Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measure Type</em>' attribute.
   * @see #getMeasureType()
   * @generated
   */
  void setMeasureType(String value);

} // MidVal
