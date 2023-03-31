/**
 */
package Physics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Force</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Physics.Force#getXVector <em>XVector</em>}</li>
 *   <li>{@link Physics.Force#getYVector <em>YVector</em>}</li>
 *   <li>{@link Physics.Force#getZVector <em>ZVector</em>}</li>
 *   <li>{@link Physics.Force#getName <em>Name</em>}</li>
 *   <li>{@link Physics.Force#getGesture <em>Gesture</em>}</li>
 * </ul>
 *
 * @see Physics.PhysicsPackage#getForce()
 * @model
 * @generated
 */
public interface Force extends EObject {
	/**
	 * Returns the value of the '<em><b>XVector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XVector</em>' attribute.
	 * @see #setXVector(double)
	 * @see Physics.PhysicsPackage#getForce_XVector()
	 * @model
	 * @generated
	 */
	double getXVector();

	/**
	 * Sets the value of the '{@link Physics.Force#getXVector <em>XVector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XVector</em>' attribute.
	 * @see #getXVector()
	 * @generated
	 */
	void setXVector(double value);

	/**
	 * Returns the value of the '<em><b>YVector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YVector</em>' attribute.
	 * @see #setYVector(double)
	 * @see Physics.PhysicsPackage#getForce_YVector()
	 * @model
	 * @generated
	 */
	double getYVector();

	/**
	 * Sets the value of the '{@link Physics.Force#getYVector <em>YVector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YVector</em>' attribute.
	 * @see #getYVector()
	 * @generated
	 */
	void setYVector(double value);

	/**
	 * Returns the value of the '<em><b>ZVector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZVector</em>' attribute.
	 * @see #setZVector(double)
	 * @see Physics.PhysicsPackage#getForce_ZVector()
	 * @model
	 * @generated
	 */
	double getZVector();

	/**
	 * Sets the value of the '{@link Physics.Force#getZVector <em>ZVector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZVector</em>' attribute.
	 * @see #getZVector()
	 * @generated
	 */
	void setZVector(double value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Physics.PhysicsPackage#getForce_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Physics.Force#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Gesture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gesture</em>' attribute.
	 * @see #setGesture(String)
	 * @see Physics.PhysicsPackage#getForce_Gesture()
	 * @model required="true"
	 * @generated
	 */
	String getGesture();

	/**
	 * Sets the value of the '{@link Physics.Force#getGesture <em>Gesture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gesture</em>' attribute.
	 * @see #getGesture()
	 * @generated
	 */
	void setGesture(String value);

} // Force
