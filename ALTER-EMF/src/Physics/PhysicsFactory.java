/**
 */
package Physics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Physics.PhysicsPackage
 * @generated
 */
public interface PhysicsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PhysicsFactory eINSTANCE = Physics.impl.PhysicsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Physic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physic</em>'.
	 * @generated
	 */
	Physic createPhysic();

	/**
	 * Returns a new object of class '<em>Physic Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physic Class</em>'.
	 * @generated
	 */
	PhysicClass createPhysicClass();

	/**
	 * Returns a new object of class '<em>Physic Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physic Body</em>'.
	 * @generated
	 */
	PhysicBody createPhysicBody();

	/**
	 * Returns a new object of class '<em>Force</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Force</em>'.
	 * @generated
	 */
	Force createForce();

	/**
	 * Returns a new object of class '<em>Bit Masks</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit Masks</em>'.
	 * @generated
	 */
	BitMasks createBitMasks();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PhysicsPackage getPhysicsPackage();

} //PhysicsFactory
