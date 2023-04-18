/**
 */
package Gameloop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gameloop.Collision#getAction <em>Action</em>}</li>
 *   <li>{@link Gameloop.Collision#getClassA <em>Class A</em>}</li>
 *   <li>{@link Gameloop.Collision#getClassB <em>Class B</em>}</li>
 * </ul>
 *
 * @see Gameloop.GameloopPackage#getCollision()
 * @model
 * @generated
 */
public interface Collision extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Trigger)
	 * @see Gameloop.GameloopPackage#getCollision_Action()
	 * @model required="true"
	 * @generated
	 */
	Trigger getAction();

	/**
	 * Sets the value of the '{@link Gameloop.Collision#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Trigger value);

	/**
	 * Returns the value of the '<em><b>Class A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class A</em>' reference.
	 * @see #setClassA(Ontologicals.Class)
	 * @see Gameloop.GameloopPackage#getCollision_ClassA()
	 * @model required="true"
	 * @generated
	 */
	Ontologicals.Class getClassA();

	/**
	 * Sets the value of the '{@link Gameloop.Collision#getClassA <em>Class A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class A</em>' reference.
	 * @see #getClassA()
	 * @generated
	 */
	void setClassA(Ontologicals.Class value);

	/**
	 * Returns the value of the '<em><b>Class B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class B</em>' reference.
	 * @see #setClassB(Ontologicals.Class)
	 * @see Gameloop.GameloopPackage#getCollision_ClassB()
	 * @model required="true"
	 * @generated
	 */
	Ontologicals.Class getClassB();

	/**
	 * Sets the value of the '{@link Gameloop.Collision#getClassB <em>Class B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class B</em>' reference.
	 * @see #getClassB()
	 * @generated
	 */
	void setClassB(Ontologicals.Class value);

} // Collision
