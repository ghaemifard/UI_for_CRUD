/**
 * generated by Xtext 2.10.0
 */
package edu.aut.islab.ghaemi.minuy.myUiDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Css Styles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.minuy.myUiDsl.CssStyles#getStyles <em>Styles</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage#getCssStyles()
 * @model
 * @generated
 */
public interface CssStyles extends EObject
{
  /**
   * Returns the value of the '<em><b>Styles</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Styles</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Styles</em>' containment reference.
   * @see #setStyles(CssStyle)
   * @see edu.aut.islab.ghaemi.minuy.myUiDsl.MyUiDslPackage#getCssStyles_Styles()
   * @model containment="true"
   * @generated
   */
  CssStyle getStyles();

  /**
   * Sets the value of the '{@link edu.aut.islab.ghaemi.minuy.myUiDsl.CssStyles#getStyles <em>Styles</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Styles</em>' containment reference.
   * @see #getStyles()
   * @generated
   */
  void setStyles(CssStyle value);

} // CssStyles
