/**
 */
package Physics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physic Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Physics.PhysicBody#getMass <em>Mass</em>}</li>
 *   <li>{@link Physics.PhysicBody#getBodyType <em>Body Type</em>}</li>
 *   <li>{@link Physics.PhysicBody#getCharge <em>Charge</em>}</li>
 *   <li>{@link Physics.PhysicBody#getFriction <em>Friction</em>}</li>
 *   <li>{@link Physics.PhysicBody#getRollingFriction <em>Rolling Friction</em>}</li>
 *   <li>{@link Physics.PhysicBody#getRestitution <em>Restitution</em>}</li>
 *   <li>{@link Physics.PhysicBody#getDamping <em>Damping</em>}</li>
 *   <li>{@link Physics.PhysicBody#getAngularDamping <em>Angular Damping</em>}</li>
 * </ul>
 *
 * @see Physics.PhysicsPackage#getPhysicBody()
 * @model
 * @generated
 */
public interface PhysicBody extends EObject {
	/**
	 * Returns the value of the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' attribute.
	 * @see #setMass(double)
	 * @see Physics.PhysicsPackage#getPhysicBody_Mass()
	 * @model required="true"
	 * @generated
	 */
	double getMass();

	/**
	 * Sets the value of the '{@link Physics.PhysicBody#getMass <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' attribute.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(double value);

	/**
	 * Returns the value of the '<em><b>Body Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Physics.BodyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Type</em>' attribute.
	 * @see Physics.BodyType
	 * @see #setBodyType(BodyType)
	 * @see Physics.PhysicsPackage#getPhysicBody_BodyType()
	 * @model required="true"
	 * @generated
	 */
	BodyType getBodyType();

	/**
	 * Sets the value of the '{@link Physics.PhysicBody#getBodyType <em>Body Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Type</em>' attribute.
	 * @see Physics.BodyType
	 * @see #getBodyType()
	 * @generated
	 */
	void setBodyType(BodyType value);

	/**
	 * Returns the value of the '<em><b>Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge</em>' attribute.
	 * @see #setCharge(double)
	 * @see Physics.PhysicsPackage#getPhysicBody_Charge()
	 * @model required="true"
	 * @generated
	 */
	double getCharge();

	/**
	 * Sets the value of the '{@link Physics.PhysicBody#getCharge <em>Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge</em>' attribute.
	 * @see #getCharge()
	 * @generated
	 */
	void setCharge(double value);

	/**
	 * Returns the value of the '<em><b>Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friction</em>' attribute.
	 * @see #setFriction(double)
	 * @see Physics.PhysicsPackage#getPhysicBody_Friction()
	 * @model required="true"
	 * @generated
	 */
	double getFriction();

	/**
	 * Sets the value of the '{@link Physics.PhysicBody#getFriction <em>Friction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friction</em>' attribute.
	 * @see #getFriction()
	 * @generated
	 */
	void setFriction(double value);

	/**
	 * Returns the value of the '<em><b>Rolling Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolling Friction</em>' attribute.
	 * @see #setRollingFriction(double)
	 * @see Physics.PhysicsPackage#getPhysicBody_RollingFriction()
	 * @model required="true"
	 * @generated
	 */
	double getRollingFriction();

	/**
	 * Sets the value of the '{@link Physics.PhysicBody#getRollingFriction <em>Rolling Friction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolling Friction</em>' attribute.
	 * @see #getRollingFriction()
	 * @generated
	 */
	void setRollingFriction(double value);

	/**
	 * Returns the value of the '<em><b>Restitution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restitution</em>' attribute.
	 * @see #setRestitution(double)
	 * @see Physics.PhysicsPackage#getPhysicBody_Restitution()
	 * @model required="true"
	 * @generated
	 */
	double getRestitution();

	/**
	 * Sets the value of the '{@link Physics.PhysicBody#getRestitution <em>Restitution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restitution</em>' attribute.
	 * @see #getRestitution()
	 * @generated
	 */
	void setRestitution(double value);

	/**
	 * Returns the value of the '<em><b>Damping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damping</em>' attribute.
	 * @see #setDamping(double)
	 * @see Physics.PhysicsPackage#getPhysicBody_Damping()
	 * @model required="true"
	 * @generated
	 */
	double getDamping();

	/**
	 * Sets the value of the '{@link Physics.PhysicBody#getDamping <em>Damping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damping</em>' attribute.
	 * @see #getDamping()
	 * @generated
	 */
	void setDamping(double value);

	/**
	 * Returns the value of the '<em><b>Angular Damping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angular Damping</em>' attribute.
	 * @see #setAngularDamping(double)
	 * @see Physics.PhysicsPackage#getPhysicBody_AngularDamping()
	 * @model required="true"
	 * @generated
	 */
	double getAngularDamping();

	/**
	 * Sets the value of the '{@link Physics.PhysicBody#getAngularDamping <em>Angular Damping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Damping</em>' attribute.
	 * @see #getAngularDamping()
	 * @generated
	 */
	void setAngularDamping(double value);

} // PhysicBody
