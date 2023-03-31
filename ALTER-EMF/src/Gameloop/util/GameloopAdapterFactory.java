/**
 */
package Gameloop.util;

import Gameloop.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Gameloop.GameloopPackage
 * @generated
 */
public class GameloopAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GameloopPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameloopAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GameloopPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameloopSwitch<Adapter> modelSwitch =
		new GameloopSwitch<Adapter>() {
			@Override
			public Adapter caseGame(Game object) {
				return createGameAdapter();
			}
			@Override
			public Adapter caseGamePad(GamePad object) {
				return createGamePadAdapter();
			}
			@Override
			public Adapter caseObjInit(ObjInit object) {
				return createObjInitAdapter();
			}
			@Override
			public Adapter caseScoreSystem(ScoreSystem object) {
				return createScoreSystemAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseCollision(Collision object) {
				return createCollisionAdapter();
			}
			@Override
			public Adapter casePhysicChange(PhysicChange object) {
				return createPhysicChangeAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseLogicOp(LogicOp object) {
				return createLogicOpAdapter();
			}
			@Override
			public Adapter caseNot(Not object) {
				return createNotAdapter();
			}
			@Override
			public Adapter caseArithmetic(Arithmetic object) {
				return createArithmeticAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseAllInstances(AllInstances object) {
				return createAllInstancesAdapter();
			}
			@Override
			public Adapter caseAttributeValue(AttributeValue object) {
				return createAttributeValueAdapter();
			}
			@Override
			public Adapter caseConstantValue(ConstantValue object) {
				return createConstantValueAdapter();
			}
			@Override
			public Adapter caseBinary(Binary object) {
				return createBinaryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Gameloop.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gameloop.Game
	 * @generated
	 */
	public Adapter createGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gameloop.GamePad <em>Game Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gameloop.GamePad
	 * @generated
	 */
	public Adapter createGamePadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gameloop.ObjInit <em>Obj Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gameloop.ObjInit
	 * @generated
	 */
	public Adapter createObjInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gameloop.ScoreSystem <em>Score System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gameloop.ScoreSystem
	 * @generated
	 */
	public Adapter createScoreSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gameloop.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gameloop.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gameloop.Collision <em>Collision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gameloop.Collision
	 * @generated
	 */
	public Adapter createCollisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gameloop.PhysicChange <em>Physic Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gameloop.PhysicChange
	 * @generated
	 */
	public Adapter createPhysicChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gameloop.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gameloop.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gameloop.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gameloop.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gameloop.LogicOp <em>Logic Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gameloop.LogicOp
	 * @generated
	 */
	public Adapter createLogicOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gameloop.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gameloop.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gameloop.Arithmetic <em>Arithmetic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gameloop.Arithmetic
	 * @generated
	 */
	public Adapter createArithmeticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gameloop.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gameloop.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gameloop.AllInstances <em>All Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gameloop.AllInstances
	 * @generated
	 */
	public Adapter createAllInstancesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gameloop.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gameloop.AttributeValue
	 * @generated
	 */
	public Adapter createAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gameloop.ConstantValue <em>Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gameloop.ConstantValue
	 * @generated
	 */
	public Adapter createConstantValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gameloop.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gameloop.Binary
	 * @generated
	 */
	public Adapter createBinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GameloopAdapterFactory
