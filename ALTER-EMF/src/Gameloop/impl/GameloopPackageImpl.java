/**
 */
package Gameloop.impl;

import Gameloop.Action;
import Gameloop.AllInstances;
import Gameloop.ArithmOps;
import Gameloop.Arithmetic;
import Gameloop.AttributeValue;
import Gameloop.BasicActions;
import Gameloop.Binary;
import Gameloop.Collision;
import Gameloop.Condition;
import Gameloop.ConstantValue;
import Gameloop.Game;
import Gameloop.GamePad;
import Gameloop.GameloopFactory;
import Gameloop.GameloopPackage;
import Gameloop.LogicOp;
import Gameloop.LogicOps;
import Gameloop.Not;
import Gameloop.ObjInit;
import Gameloop.PhysicChange;
import Gameloop.Position;
import Gameloop.Rule;
import Gameloop.ScoreSystem;
import Gameloop.Trigger;
import Gameloop.Value;

import Graphics.GraphicsPackage;
import Graphics.impl.GraphicsPackageImpl;
import Ontologicals.OntologicalsPackage;
import Ontologicals.impl.OntologicalsPackageImpl;
import Physics.PhysicsPackage;
import Physics.impl.PhysicsPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameloopPackageImpl extends EPackageImpl implements GameloopPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gamePadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scoreSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allInstancesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basicActionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicOpsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arithmOpsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Gameloop.GameloopPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GameloopPackageImpl() {
		super(eNS_URI, GameloopFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GameloopPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GameloopPackage init() {
		if (isInited) return (GameloopPackage)EPackage.Registry.INSTANCE.getEPackage(GameloopPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGameloopPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GameloopPackageImpl theGameloopPackage = registeredGameloopPackage instanceof GameloopPackageImpl ? (GameloopPackageImpl)registeredGameloopPackage : new GameloopPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OntologicalsPackage.eNS_URI);
		OntologicalsPackageImpl theOntologicalsPackage = (OntologicalsPackageImpl)(registeredPackage instanceof OntologicalsPackageImpl ? registeredPackage : OntologicalsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PhysicsPackage.eNS_URI);
		PhysicsPackageImpl thePhysicsPackage = (PhysicsPackageImpl)(registeredPackage instanceof PhysicsPackageImpl ? registeredPackage : PhysicsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GraphicsPackage.eNS_URI);
		GraphicsPackageImpl theGraphicsPackage = (GraphicsPackageImpl)(registeredPackage instanceof GraphicsPackageImpl ? registeredPackage : GraphicsPackage.eINSTANCE);

		// Create package meta-data objects
		theGameloopPackage.createPackageContents();
		theOntologicalsPackage.createPackageContents();
		thePhysicsPackage.createPackageContents();
		theGraphicsPackage.createPackageContents();

		// Initialize created meta-data
		theGameloopPackage.initializePackageContents();
		theOntologicalsPackage.initializePackageContents();
		thePhysicsPackage.initializePackageContents();
		theGraphicsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGameloopPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GameloopPackage.eNS_URI, theGameloopPackage);
		return theGameloopPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_Win() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_Lose() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_Start() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_ObjInit() {
		return (EReference)gameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Score() {
		return (EReference)gameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Collisions() {
		return (EReference)gameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_ActionsTriggers() {
		return (EReference)gameEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Gamepad() {
		return (EReference)gameEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGamePad() {
		return gamePadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGamePad_Name() {
		return (EAttribute)gamePadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGamePad_Trigger() {
		return (EReference)gamePadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjInit() {
		return objInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjInit_Name() {
		return (EAttribute)objInitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjInit_PosX() {
		return (EAttribute)objInitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjInit_PosY() {
		return (EAttribute)objInitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjInit_PosZ() {
		return (EAttribute)objInitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjInit_Rules() {
		return (EReference)objInitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjInit_Class() {
		return (EReference)objInitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScoreSystem() {
		return scoreSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScoreSystem_Start() {
		return (EAttribute)scoreSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScoreSystem_Finish() {
		return (EAttribute)scoreSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScoreSystem_Lives() {
		return (EAttribute)scoreSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Name() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_ScoreChange() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Message() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_TimeTrigger() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_PhysicChanges() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Action() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollision() {
		return collisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollision_ClassA() {
		return (EReference)collisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollision_ClassB() {
		return (EReference)collisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollision_Action() {
		return (EReference)collisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicChange() {
		return physicChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicChange_Attribute() {
		return (EAttribute)physicChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicChange_ChangeValue() {
		return (EAttribute)physicChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicChange_Action() {
		return (EAttribute)physicChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicChange_Object() {
		return (EAttribute)physicChangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicChange_Force() {
		return (EReference)physicChangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicChange_Position() {
		return (EAttribute)physicChangeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicChange_Class() {
		return (EReference)physicChangeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicChange_Scale() {
		return (EAttribute)physicChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Condition() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Action() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicOp() {
		return logicOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicOp_Left() {
		return (EReference)logicOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmetic() {
		return arithmeticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArithmetic_Op() {
		return (EAttribute)arithmeticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmetic_Left() {
		return (EReference)arithmeticEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmetic_Right() {
		return (EReference)arithmeticEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllInstances() {
		return allInstancesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllInstances_Type() {
		return (EAttribute)allInstancesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValue() {
		return attributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValue_Class() {
		return (EAttribute)attributeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValue_Attribute() {
		return (EAttribute)attributeValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantValue() {
		return constantValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantValue_Value() {
		return (EAttribute)constantValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinary() {
		return binaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinary_Op() {
		return (EAttribute)binaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinary_Right() {
		return (EReference)binaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasicActions() {
		return basicActionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAction() {
		return actionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPosition() {
		return positionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicOps() {
		return logicOpsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArithmOps() {
		return arithmOpsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameloopFactory getGameloopFactory() {
		return (GameloopFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gameEClass = createEClass(GAME);
		createEAttribute(gameEClass, GAME__WIN);
		createEAttribute(gameEClass, GAME__LOSE);
		createEAttribute(gameEClass, GAME__START);
		createEReference(gameEClass, GAME__OBJ_INIT);
		createEReference(gameEClass, GAME__SCORE);
		createEReference(gameEClass, GAME__COLLISIONS);
		createEReference(gameEClass, GAME__ACTIONS_TRIGGERS);
		createEReference(gameEClass, GAME__GAMEPAD);

		gamePadEClass = createEClass(GAME_PAD);
		createEAttribute(gamePadEClass, GAME_PAD__NAME);
		createEReference(gamePadEClass, GAME_PAD__TRIGGER);

		objInitEClass = createEClass(OBJ_INIT);
		createEAttribute(objInitEClass, OBJ_INIT__NAME);
		createEAttribute(objInitEClass, OBJ_INIT__POS_X);
		createEAttribute(objInitEClass, OBJ_INIT__POS_Y);
		createEAttribute(objInitEClass, OBJ_INIT__POS_Z);
		createEReference(objInitEClass, OBJ_INIT__RULES);
		createEReference(objInitEClass, OBJ_INIT__CLASS);

		scoreSystemEClass = createEClass(SCORE_SYSTEM);
		createEAttribute(scoreSystemEClass, SCORE_SYSTEM__START);
		createEAttribute(scoreSystemEClass, SCORE_SYSTEM__FINISH);
		createEAttribute(scoreSystemEClass, SCORE_SYSTEM__LIVES);

		triggerEClass = createEClass(TRIGGER);
		createEAttribute(triggerEClass, TRIGGER__NAME);
		createEAttribute(triggerEClass, TRIGGER__SCORE_CHANGE);
		createEAttribute(triggerEClass, TRIGGER__MESSAGE);
		createEAttribute(triggerEClass, TRIGGER__TIME_TRIGGER);
		createEReference(triggerEClass, TRIGGER__PHYSIC_CHANGES);
		createEAttribute(triggerEClass, TRIGGER__ACTION);

		collisionEClass = createEClass(COLLISION);
		createEReference(collisionEClass, COLLISION__ACTION);
		createEReference(collisionEClass, COLLISION__CLASS_A);
		createEReference(collisionEClass, COLLISION__CLASS_B);

		physicChangeEClass = createEClass(PHYSIC_CHANGE);
		createEAttribute(physicChangeEClass, PHYSIC_CHANGE__SCALE);
		createEAttribute(physicChangeEClass, PHYSIC_CHANGE__ATTRIBUTE);
		createEAttribute(physicChangeEClass, PHYSIC_CHANGE__CHANGE_VALUE);
		createEAttribute(physicChangeEClass, PHYSIC_CHANGE__ACTION);
		createEAttribute(physicChangeEClass, PHYSIC_CHANGE__OBJECT);
		createEReference(physicChangeEClass, PHYSIC_CHANGE__FORCE);
		createEAttribute(physicChangeEClass, PHYSIC_CHANGE__POSITION);
		createEReference(physicChangeEClass, PHYSIC_CHANGE__CLASS);

		conditionEClass = createEClass(CONDITION);

		ruleEClass = createEClass(RULE);
		createEReference(ruleEClass, RULE__CONDITION);
		createEReference(ruleEClass, RULE__ACTION);

		logicOpEClass = createEClass(LOGIC_OP);
		createEReference(logicOpEClass, LOGIC_OP__LEFT);

		notEClass = createEClass(NOT);

		arithmeticEClass = createEClass(ARITHMETIC);
		createEAttribute(arithmeticEClass, ARITHMETIC__OP);
		createEReference(arithmeticEClass, ARITHMETIC__LEFT);
		createEReference(arithmeticEClass, ARITHMETIC__RIGHT);

		valueEClass = createEClass(VALUE);

		allInstancesEClass = createEClass(ALL_INSTANCES);
		createEAttribute(allInstancesEClass, ALL_INSTANCES__TYPE);

		attributeValueEClass = createEClass(ATTRIBUTE_VALUE);
		createEAttribute(attributeValueEClass, ATTRIBUTE_VALUE__CLASS);
		createEAttribute(attributeValueEClass, ATTRIBUTE_VALUE__ATTRIBUTE);

		constantValueEClass = createEClass(CONSTANT_VALUE);
		createEAttribute(constantValueEClass, CONSTANT_VALUE__VALUE);

		binaryEClass = createEClass(BINARY);
		createEAttribute(binaryEClass, BINARY__OP);
		createEReference(binaryEClass, BINARY__RIGHT);

		// Create enums
		basicActionsEEnum = createEEnum(BASIC_ACTIONS);
		actionEEnum = createEEnum(ACTION);
		positionEEnum = createEEnum(POSITION);
		logicOpsEEnum = createEEnum(LOGIC_OPS);
		arithmOpsEEnum = createEEnum(ARITHM_OPS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OntologicalsPackage theOntologicalsPackage = (OntologicalsPackage)EPackage.Registry.INSTANCE.getEPackage(OntologicalsPackage.eNS_URI);
		PhysicsPackage thePhysicsPackage = (PhysicsPackage)EPackage.Registry.INSTANCE.getEPackage(PhysicsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		logicOpEClass.getESuperTypes().add(this.getCondition());
		notEClass.getESuperTypes().add(this.getLogicOp());
		arithmeticEClass.getESuperTypes().add(this.getCondition());
		allInstancesEClass.getESuperTypes().add(this.getValue());
		attributeValueEClass.getESuperTypes().add(this.getValue());
		constantValueEClass.getESuperTypes().add(this.getValue());
		binaryEClass.getESuperTypes().add(this.getLogicOp());

		// Initialize classes, features, and operations; add parameters
		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGame_Win(), ecorePackage.getEString(), "win", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Lose(), ecorePackage.getEString(), "lose", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Start(), ecorePackage.getEString(), "start", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_ObjInit(), this.getObjInit(), null, "objInit", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Score(), this.getScoreSystem(), null, "score", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Collisions(), this.getCollision(), null, "collisions", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_ActionsTriggers(), this.getTrigger(), null, "actionsTriggers", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Gamepad(), this.getGamePad(), null, "gamepad", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gamePadEClass, GamePad.class, "GamePad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGamePad_Name(), ecorePackage.getEString(), "name", null, 1, 1, GamePad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGamePad_Trigger(), this.getTrigger(), null, "trigger", null, 1, 1, GamePad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objInitEClass, ObjInit.class, "ObjInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjInit_Name(), ecorePackage.getEString(), "name", null, 1, 1, ObjInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjInit_PosX(), ecorePackage.getEDouble(), "posX", null, 1, 1, ObjInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjInit_PosY(), ecorePackage.getEDouble(), "posY", null, 1, 1, ObjInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjInit_PosZ(), ecorePackage.getEDouble(), "posZ", null, 1, 1, ObjInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjInit_Rules(), this.getRule(), null, "rules", null, 0, -1, ObjInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjInit_Class(), theOntologicalsPackage.getClass_(), null, "class", null, 1, 1, ObjInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scoreSystemEClass, ScoreSystem.class, "ScoreSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScoreSystem_Start(), ecorePackage.getEInt(), "start", null, 1, 1, ScoreSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScoreSystem_Finish(), ecorePackage.getEInt(), "finish", null, 1, 1, ScoreSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScoreSystem_Lives(), ecorePackage.getEInt(), "lives", null, 1, 1, ScoreSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrigger_Name(), ecorePackage.getEString(), "name", null, 1, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_ScoreChange(), ecorePackage.getEInt(), "scoreChange", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_Message(), ecorePackage.getEString(), "message", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_TimeTrigger(), ecorePackage.getEInt(), "timeTrigger", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_PhysicChanges(), this.getPhysicChange(), null, "physicChanges", null, 0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_Action(), this.getBasicActions(), "action", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collisionEClass, Collision.class, "Collision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollision_Action(), this.getTrigger(), null, "action", null, 1, 1, Collision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollision_ClassA(), theOntologicalsPackage.getClass_(), null, "classA", null, 1, 1, Collision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollision_ClassB(), theOntologicalsPackage.getClass_(), null, "classB", null, 1, 1, Collision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicChangeEClass, PhysicChange.class, "PhysicChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicChange_Scale(), ecorePackage.getEDouble(), "scale", null, 0, 1, PhysicChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicChange_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, PhysicChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicChange_ChangeValue(), ecorePackage.getEInt(), "changeValue", null, 0, 1, PhysicChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicChange_Action(), this.getAction(), "action", null, 1, 1, PhysicChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicChange_Object(), ecorePackage.getEString(), "object", null, 1, 1, PhysicChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicChange_Force(), thePhysicsPackage.getForce(), null, "force", null, 0, 1, PhysicChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicChange_Position(), this.getPosition(), "position", null, 0, 1, PhysicChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicChange_Class(), theOntologicalsPackage.getClass_(), null, "class", null, 1, 1, PhysicChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRule_Condition(), this.getCondition(), null, "condition", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Action(), this.getTrigger(), null, "action", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicOpEClass, LogicOp.class, "LogicOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicOp_Left(), this.getCondition(), null, "left", null, 1, 1, LogicOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arithmeticEClass, Arithmetic.class, "Arithmetic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArithmetic_Op(), this.getArithmOps(), "op", null, 1, 1, Arithmetic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArithmetic_Left(), this.getValue(), null, "left", null, 1, 1, Arithmetic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArithmetic_Right(), this.getValue(), null, "right", null, 1, 1, Arithmetic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allInstancesEClass, AllInstances.class, "AllInstances", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllInstances_Type(), ecorePackage.getEString(), "type", null, 1, 1, AllInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeValueEClass, AttributeValue.class, "AttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeValue_Class(), ecorePackage.getEString(), "class", null, 1, 1, AttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeValue_Attribute(), ecorePackage.getEString(), "attribute", null, 1, 1, AttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantValueEClass, ConstantValue.class, "ConstantValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstantValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, ConstantValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryEClass, Binary.class, "Binary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinary_Op(), this.getLogicOps(), "op", null, 1, 1, Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinary_Right(), this.getCondition(), null, "right", null, 1, 1, Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(basicActionsEEnum, BasicActions.class, "BasicActions");
		addEEnumLiteral(basicActionsEEnum, BasicActions.START);
		addEEnumLiteral(basicActionsEEnum, BasicActions.WIN);
		addEEnumLiteral(basicActionsEEnum, BasicActions.LOSE);

		initEEnum(actionEEnum, Action.class, "Action");
		addEEnumLiteral(actionEEnum, Action.CREATE);
		addEEnumLiteral(actionEEnum, Action.EDIT);
		addEEnumLiteral(actionEEnum, Action.DELETE);

		initEEnum(positionEEnum, Position.class, "Position");
		addEEnumLiteral(positionEEnum, Position.FRONT);
		addEEnumLiteral(positionEEnum, Position.DEFAULT);
		addEEnumLiteral(positionEEnum, Position.BACK);

		initEEnum(logicOpsEEnum, LogicOps.class, "LogicOps");
		addEEnumLiteral(logicOpsEEnum, LogicOps.OR);
		addEEnumLiteral(logicOpsEEnum, LogicOps.AND);

		initEEnum(arithmOpsEEnum, ArithmOps.class, "ArithmOps");
		addEEnumLiteral(arithmOpsEEnum, ArithmOps.EQUAL);
		addEEnumLiteral(arithmOpsEEnum, ArithmOps.GREATER);
		addEEnumLiteral(arithmOpsEEnum, ArithmOps.GREATER_EQUAL);
		addEEnumLiteral(arithmOpsEEnum, ArithmOps.LOWER);
		addEEnumLiteral(arithmOpsEEnum, ArithmOps.LOWER_EQUAL);

		// Create resource
		createResource(eNS_URI);
	}

} //GameloopPackageImpl
