/**
 */
package Physics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physic Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Physics.PhysicClass#getPhysicBody <em>Physic Body</em>}</li>
 *   <li>{@link Physics.PhysicClass#getBitMasks <em>Bit Masks</em>}</li>
 *   <li>{@link Physics.PhysicClass#getForces <em>Forces</em>}</li>
 *   <li>{@link Physics.PhysicClass#getOntoClass <em>Onto Class</em>}</li>
 * </ul>
 *
 * @see Physics.PhysicsPackage#getPhysicClass()
 * @model
 * @generated
 */
public interface PhysicClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Physic Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physic Body</em>' containment reference.
	 * @see #setPhysicBody(PhysicBody)
	 * @see Physics.PhysicsPackage#getPhysicClass_PhysicBody()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PhysicBody getPhysicBody();

	/**
	 * Sets the value of the '{@link Physics.PhysicClass#getPhysicBody <em>Physic Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physic Body</em>' containment reference.
	 * @see #getPhysicBody()
	 * @generated
	 */
	void setPhysicBody(PhysicBody value);

	/**
	 * Returns the value of the '<em><b>Bit Masks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Masks</em>' containment reference.
	 * @see #setBitMasks(BitMasks)
	 * @see Physics.PhysicsPackage#getPhysicClass_BitMasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BitMasks getBitMasks();

	/**
	 * Sets the value of the '{@link Physics.PhysicClass#getBitMasks <em>Bit Masks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Masks</em>' containment reference.
	 * @see #getBitMasks()
	 * @generated
	 */
	void setBitMasks(BitMasks value);

	/**
	 * Returns the value of the '<em><b>Forces</b></em>' containment reference list.
	 * The list contents are of type {@link Physics.Force}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forces</em>' containment reference list.
	 * @see Physics.PhysicsPackage#getPhysicClass_Forces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Force> getForces();

	/**
	 * Returns the value of the '<em><b>Onto Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onto Class</em>' reference.
	 * @see #setOntoClass(Ontologicals.Class)
	 * @see Physics.PhysicsPackage#getPhysicClass_OntoClass()
	 * @model required="true"
	 * @generated
	 */
	Ontologicals.Class getOntoClass();

	/**
	 * Sets the value of the '{@link Physics.PhysicClass#getOntoClass <em>Onto Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onto Class</em>' reference.
	 * @see #getOntoClass()
	 * @generated
	 */
	void setOntoClass(Ontologicals.Class value);

} // PhysicClass
