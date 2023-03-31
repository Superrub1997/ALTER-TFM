/**
 */
package Physics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Physics.Physic#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see Physics.PhysicsPackage#getPhysic()
 * @model
 * @generated
 */
public interface Physic extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link Physics.PhysicClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see Physics.PhysicsPackage#getPhysic_Classes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PhysicClass> getClasses();

} // Physic
