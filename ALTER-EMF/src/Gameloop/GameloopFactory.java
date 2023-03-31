/**
 */
package Gameloop;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Gameloop.GameloopPackage
 * @generated
 */
public interface GameloopFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GameloopFactory eINSTANCE = Gameloop.impl.GameloopFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game</em>'.
	 * @generated
	 */
	Game createGame();

	/**
	 * Returns a new object of class '<em>Game Pad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Pad</em>'.
	 * @generated
	 */
	GamePad createGamePad();

	/**
	 * Returns a new object of class '<em>Obj Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obj Init</em>'.
	 * @generated
	 */
	ObjInit createObjInit();

	/**
	 * Returns a new object of class '<em>Score System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Score System</em>'.
	 * @generated
	 */
	ScoreSystem createScoreSystem();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>Collision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collision</em>'.
	 * @generated
	 */
	Collision createCollision();

	/**
	 * Returns a new object of class '<em>Physic Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physic Change</em>'.
	 * @generated
	 */
	PhysicChange createPhysicChange();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not</em>'.
	 * @generated
	 */
	Not createNot();

	/**
	 * Returns a new object of class '<em>Arithmetic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetic</em>'.
	 * @generated
	 */
	Arithmetic createArithmetic();

	/**
	 * Returns a new object of class '<em>All Instances</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Instances</em>'.
	 * @generated
	 */
	AllInstances createAllInstances();

	/**
	 * Returns a new object of class '<em>Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value</em>'.
	 * @generated
	 */
	AttributeValue createAttributeValue();

	/**
	 * Returns a new object of class '<em>Constant Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Value</em>'.
	 * @generated
	 */
	ConstantValue createConstantValue();

	/**
	 * Returns a new object of class '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary</em>'.
	 * @generated
	 */
	Binary createBinary();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GameloopPackage getGameloopPackage();

} //GameloopFactory
