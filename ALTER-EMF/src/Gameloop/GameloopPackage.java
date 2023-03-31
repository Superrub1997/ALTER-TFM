/**
 */
package Gameloop;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Gameloop.GameloopFactory
 * @model kind="package"
 * @generated
 */
public interface GameloopPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Gameloop";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gameloop/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Gameloop";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GameloopPackage eINSTANCE = Gameloop.impl.GameloopPackageImpl.init();

	/**
	 * The meta object id for the '{@link Gameloop.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.impl.GameImpl
	 * @see Gameloop.impl.GameloopPackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__WIN = 0;

	/**
	 * The feature id for the '<em><b>Lose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__LOSE = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__START = 2;

	/**
	 * The feature id for the '<em><b>Obj Init</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__OBJ_INIT = 3;

	/**
	 * The feature id for the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__SCORE = 4;

	/**
	 * The feature id for the '<em><b>Collisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__COLLISIONS = 5;

	/**
	 * The feature id for the '<em><b>Actions Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__ACTIONS_TRIGGERS = 6;

	/**
	 * The feature id for the '<em><b>Gamepad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAMEPAD = 7;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gameloop.impl.GamePadImpl <em>Game Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.impl.GamePadImpl
	 * @see Gameloop.impl.GameloopPackageImpl#getGamePad()
	 * @generated
	 */
	int GAME_PAD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PAD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PAD__TRIGGER = 1;

	/**
	 * The number of structural features of the '<em>Game Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PAD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Game Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gameloop.impl.ObjInitImpl <em>Obj Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.impl.ObjInitImpl
	 * @see Gameloop.impl.GameloopPackageImpl#getObjInit()
	 * @generated
	 */
	int OBJ_INIT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJ_INIT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJ_INIT__POS_X = 1;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJ_INIT__POS_Y = 2;

	/**
	 * The feature id for the '<em><b>Pos Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJ_INIT__POS_Z = 3;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJ_INIT__RULES = 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJ_INIT__CLASS = 5;

	/**
	 * The number of structural features of the '<em>Obj Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJ_INIT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Obj Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJ_INIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gameloop.impl.ScoreSystemImpl <em>Score System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.impl.ScoreSystemImpl
	 * @see Gameloop.impl.GameloopPackageImpl#getScoreSystem()
	 * @generated
	 */
	int SCORE_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM__START = 0;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM__FINISH = 1;

	/**
	 * The feature id for the '<em><b>Lives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM__LIVES = 2;

	/**
	 * The number of structural features of the '<em>Score System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Score System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gameloop.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.impl.TriggerImpl
	 * @see Gameloop.impl.GameloopPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Score Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__SCORE_CHANGE = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Time Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TIME_TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Physic Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__PHYSIC_CHANGES = 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__ACTION = 5;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gameloop.impl.CollisionImpl <em>Collision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.impl.CollisionImpl
	 * @see Gameloop.impl.GameloopPackageImpl#getCollision()
	 * @generated
	 */
	int COLLISION = 5;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Class A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION__CLASS_A = 1;

	/**
	 * The feature id for the '<em><b>Class B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION__CLASS_B = 2;

	/**
	 * The number of structural features of the '<em>Collision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Collision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gameloop.impl.PhysicChangeImpl <em>Physic Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.impl.PhysicChangeImpl
	 * @see Gameloop.impl.GameloopPackageImpl#getPhysicChange()
	 * @generated
	 */
	int PHYSIC_CHANGE = 6;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_CHANGE__SCALE = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_CHANGE__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Change Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_CHANGE__CHANGE_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_CHANGE__ACTION = 3;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_CHANGE__OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Force</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_CHANGE__FORCE = 5;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_CHANGE__POSITION = 6;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_CHANGE__CLASS = 7;

	/**
	 * The number of structural features of the '<em>Physic Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_CHANGE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Physic Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_CHANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gameloop.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.impl.ConditionImpl
	 * @see Gameloop.impl.GameloopPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 7;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gameloop.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.impl.RuleImpl
	 * @see Gameloop.impl.GameloopPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 8;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ACTION = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gameloop.impl.LogicOpImpl <em>Logic Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.impl.LogicOpImpl
	 * @see Gameloop.impl.GameloopPackageImpl#getLogicOp()
	 * @generated
	 */
	int LOGIC_OP = 9;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_OP__LEFT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logic Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_OP_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logic Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_OP_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gameloop.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.impl.NotImpl
	 * @see Gameloop.impl.GameloopPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 10;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__LEFT = LOGIC_OP__LEFT;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = LOGIC_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = LOGIC_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gameloop.impl.ArithmeticImpl <em>Arithmetic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.impl.ArithmeticImpl
	 * @see Gameloop.impl.GameloopPackageImpl#getArithmetic()
	 * @generated
	 */
	int ARITHMETIC = 11;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC__OP = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC__LEFT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC__RIGHT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arithmetic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arithmetic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gameloop.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.impl.ValueImpl
	 * @see Gameloop.impl.GameloopPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 12;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gameloop.impl.AllInstancesImpl <em>All Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.impl.AllInstancesImpl
	 * @see Gameloop.impl.GameloopPackageImpl#getAllInstances()
	 * @generated
	 */
	int ALL_INSTANCES = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCES__TYPE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>All Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCES_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>All Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCES_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gameloop.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.impl.AttributeValueImpl
	 * @see Gameloop.impl.GameloopPackageImpl#getAttributeValue()
	 * @generated
	 */
	int ATTRIBUTE_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__CLASS = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__ATTRIBUTE = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gameloop.impl.ConstantValueImpl <em>Constant Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.impl.ConstantValueImpl
	 * @see Gameloop.impl.GameloopPackageImpl#getConstantValue()
	 * @generated
	 */
	int CONSTANT_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constant Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gameloop.impl.BinaryImpl <em>Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.impl.BinaryImpl
	 * @see Gameloop.impl.GameloopPackageImpl#getBinary()
	 * @generated
	 */
	int BINARY = 16;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__LEFT = LOGIC_OP__LEFT;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__OP = LOGIC_OP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__RIGHT = LOGIC_OP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FEATURE_COUNT = LOGIC_OP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_COUNT = LOGIC_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gameloop.BasicActions <em>Basic Actions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.BasicActions
	 * @see Gameloop.impl.GameloopPackageImpl#getBasicActions()
	 * @generated
	 */
	int BASIC_ACTIONS = 17;

	/**
	 * The meta object id for the '{@link Gameloop.Action <em>Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.Action
	 * @see Gameloop.impl.GameloopPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 18;

	/**
	 * The meta object id for the '{@link Gameloop.Position <em>Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.Position
	 * @see Gameloop.impl.GameloopPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 19;

	/**
	 * The meta object id for the '{@link Gameloop.LogicOps <em>Logic Ops</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.LogicOps
	 * @see Gameloop.impl.GameloopPackageImpl#getLogicOps()
	 * @generated
	 */
	int LOGIC_OPS = 20;

	/**
	 * The meta object id for the '{@link Gameloop.ArithmOps <em>Arithm Ops</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gameloop.ArithmOps
	 * @see Gameloop.impl.GameloopPackageImpl#getArithmOps()
	 * @generated
	 */
	int ARITHM_OPS = 21;


	/**
	 * Returns the meta object for class '{@link Gameloop.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see Gameloop.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.Game#getWin <em>Win</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Win</em>'.
	 * @see Gameloop.Game#getWin()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Win();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.Game#getLose <em>Lose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lose</em>'.
	 * @see Gameloop.Game#getLose()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Lose();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.Game#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see Gameloop.Game#getStart()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Start();

	/**
	 * Returns the meta object for the containment reference list '{@link Gameloop.Game#getObjInit <em>Obj Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Obj Init</em>'.
	 * @see Gameloop.Game#getObjInit()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_ObjInit();

	/**
	 * Returns the meta object for the containment reference '{@link Gameloop.Game#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Score</em>'.
	 * @see Gameloop.Game#getScore()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Score();

	/**
	 * Returns the meta object for the containment reference list '{@link Gameloop.Game#getCollisions <em>Collisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collisions</em>'.
	 * @see Gameloop.Game#getCollisions()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Collisions();

	/**
	 * Returns the meta object for the containment reference list '{@link Gameloop.Game#getActionsTriggers <em>Actions Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions Triggers</em>'.
	 * @see Gameloop.Game#getActionsTriggers()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_ActionsTriggers();

	/**
	 * Returns the meta object for the containment reference list '{@link Gameloop.Game#getGamepad <em>Gamepad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gamepad</em>'.
	 * @see Gameloop.Game#getGamepad()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Gamepad();

	/**
	 * Returns the meta object for class '{@link Gameloop.GamePad <em>Game Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Pad</em>'.
	 * @see Gameloop.GamePad
	 * @generated
	 */
	EClass getGamePad();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.GamePad#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gameloop.GamePad#getName()
	 * @see #getGamePad()
	 * @generated
	 */
	EAttribute getGamePad_Name();

	/**
	 * Returns the meta object for the reference '{@link Gameloop.GamePad#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger</em>'.
	 * @see Gameloop.GamePad#getTrigger()
	 * @see #getGamePad()
	 * @generated
	 */
	EReference getGamePad_Trigger();

	/**
	 * Returns the meta object for class '{@link Gameloop.ObjInit <em>Obj Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obj Init</em>'.
	 * @see Gameloop.ObjInit
	 * @generated
	 */
	EClass getObjInit();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.ObjInit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gameloop.ObjInit#getName()
	 * @see #getObjInit()
	 * @generated
	 */
	EAttribute getObjInit_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.ObjInit#getPosX <em>Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos X</em>'.
	 * @see Gameloop.ObjInit#getPosX()
	 * @see #getObjInit()
	 * @generated
	 */
	EAttribute getObjInit_PosX();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.ObjInit#getPosY <em>Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Y</em>'.
	 * @see Gameloop.ObjInit#getPosY()
	 * @see #getObjInit()
	 * @generated
	 */
	EAttribute getObjInit_PosY();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.ObjInit#getPosZ <em>Pos Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Z</em>'.
	 * @see Gameloop.ObjInit#getPosZ()
	 * @see #getObjInit()
	 * @generated
	 */
	EAttribute getObjInit_PosZ();

	/**
	 * Returns the meta object for the containment reference list '{@link Gameloop.ObjInit#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see Gameloop.ObjInit#getRules()
	 * @see #getObjInit()
	 * @generated
	 */
	EReference getObjInit_Rules();

	/**
	 * Returns the meta object for the reference '{@link Gameloop.ObjInit#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see Gameloop.ObjInit#getClass_()
	 * @see #getObjInit()
	 * @generated
	 */
	EReference getObjInit_Class();

	/**
	 * Returns the meta object for class '{@link Gameloop.ScoreSystem <em>Score System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score System</em>'.
	 * @see Gameloop.ScoreSystem
	 * @generated
	 */
	EClass getScoreSystem();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.ScoreSystem#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see Gameloop.ScoreSystem#getStart()
	 * @see #getScoreSystem()
	 * @generated
	 */
	EAttribute getScoreSystem_Start();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.ScoreSystem#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish</em>'.
	 * @see Gameloop.ScoreSystem#getFinish()
	 * @see #getScoreSystem()
	 * @generated
	 */
	EAttribute getScoreSystem_Finish();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.ScoreSystem#getLives <em>Lives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lives</em>'.
	 * @see Gameloop.ScoreSystem#getLives()
	 * @see #getScoreSystem()
	 * @generated
	 */
	EAttribute getScoreSystem_Lives();

	/**
	 * Returns the meta object for class '{@link Gameloop.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see Gameloop.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.Trigger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gameloop.Trigger#getName()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.Trigger#getScoreChange <em>Score Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score Change</em>'.
	 * @see Gameloop.Trigger#getScoreChange()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_ScoreChange();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.Trigger#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see Gameloop.Trigger#getMessage()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Message();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.Trigger#getTimeTrigger <em>Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Trigger</em>'.
	 * @see Gameloop.Trigger#getTimeTrigger()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_TimeTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link Gameloop.Trigger#getPhysicChanges <em>Physic Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physic Changes</em>'.
	 * @see Gameloop.Trigger#getPhysicChanges()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_PhysicChanges();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.Trigger#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see Gameloop.Trigger#getAction()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Action();

	/**
	 * Returns the meta object for class '{@link Gameloop.Collision <em>Collision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collision</em>'.
	 * @see Gameloop.Collision
	 * @generated
	 */
	EClass getCollision();

	/**
	 * Returns the meta object for the reference '{@link Gameloop.Collision#getClassA <em>Class A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class A</em>'.
	 * @see Gameloop.Collision#getClassA()
	 * @see #getCollision()
	 * @generated
	 */
	EReference getCollision_ClassA();

	/**
	 * Returns the meta object for the reference '{@link Gameloop.Collision#getClassB <em>Class B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class B</em>'.
	 * @see Gameloop.Collision#getClassB()
	 * @see #getCollision()
	 * @generated
	 */
	EReference getCollision_ClassB();

	/**
	 * Returns the meta object for the reference '{@link Gameloop.Collision#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see Gameloop.Collision#getAction()
	 * @see #getCollision()
	 * @generated
	 */
	EReference getCollision_Action();

	/**
	 * Returns the meta object for class '{@link Gameloop.PhysicChange <em>Physic Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physic Change</em>'.
	 * @see Gameloop.PhysicChange
	 * @generated
	 */
	EClass getPhysicChange();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.PhysicChange#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see Gameloop.PhysicChange#getAttribute()
	 * @see #getPhysicChange()
	 * @generated
	 */
	EAttribute getPhysicChange_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.PhysicChange#getChangeValue <em>Change Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Value</em>'.
	 * @see Gameloop.PhysicChange#getChangeValue()
	 * @see #getPhysicChange()
	 * @generated
	 */
	EAttribute getPhysicChange_ChangeValue();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.PhysicChange#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see Gameloop.PhysicChange#getAction()
	 * @see #getPhysicChange()
	 * @generated
	 */
	EAttribute getPhysicChange_Action();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.PhysicChange#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see Gameloop.PhysicChange#getObject()
	 * @see #getPhysicChange()
	 * @generated
	 */
	EAttribute getPhysicChange_Object();

	/**
	 * Returns the meta object for the reference '{@link Gameloop.PhysicChange#getForce <em>Force</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Force</em>'.
	 * @see Gameloop.PhysicChange#getForce()
	 * @see #getPhysicChange()
	 * @generated
	 */
	EReference getPhysicChange_Force();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.PhysicChange#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see Gameloop.PhysicChange#getPosition()
	 * @see #getPhysicChange()
	 * @generated
	 */
	EAttribute getPhysicChange_Position();

	/**
	 * Returns the meta object for the reference '{@link Gameloop.PhysicChange#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see Gameloop.PhysicChange#getClass_()
	 * @see #getPhysicChange()
	 * @generated
	 */
	EReference getPhysicChange_Class();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.PhysicChange#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see Gameloop.PhysicChange#getScale()
	 * @see #getPhysicChange()
	 * @generated
	 */
	EAttribute getPhysicChange_Scale();

	/**
	 * Returns the meta object for class '{@link Gameloop.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see Gameloop.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link Gameloop.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see Gameloop.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the containment reference '{@link Gameloop.Rule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see Gameloop.Rule#getCondition()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Condition();

	/**
	 * Returns the meta object for the reference '{@link Gameloop.Rule#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see Gameloop.Rule#getAction()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Action();

	/**
	 * Returns the meta object for class '{@link Gameloop.LogicOp <em>Logic Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Op</em>'.
	 * @see Gameloop.LogicOp
	 * @generated
	 */
	EClass getLogicOp();

	/**
	 * Returns the meta object for the containment reference '{@link Gameloop.LogicOp#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see Gameloop.LogicOp#getLeft()
	 * @see #getLogicOp()
	 * @generated
	 */
	EReference getLogicOp_Left();

	/**
	 * Returns the meta object for class '{@link Gameloop.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see Gameloop.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link Gameloop.Arithmetic <em>Arithmetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic</em>'.
	 * @see Gameloop.Arithmetic
	 * @generated
	 */
	EClass getArithmetic();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.Arithmetic#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see Gameloop.Arithmetic#getOp()
	 * @see #getArithmetic()
	 * @generated
	 */
	EAttribute getArithmetic_Op();

	/**
	 * Returns the meta object for the containment reference '{@link Gameloop.Arithmetic#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see Gameloop.Arithmetic#getLeft()
	 * @see #getArithmetic()
	 * @generated
	 */
	EReference getArithmetic_Left();

	/**
	 * Returns the meta object for the containment reference '{@link Gameloop.Arithmetic#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see Gameloop.Arithmetic#getRight()
	 * @see #getArithmetic()
	 * @generated
	 */
	EReference getArithmetic_Right();

	/**
	 * Returns the meta object for class '{@link Gameloop.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see Gameloop.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link Gameloop.AllInstances <em>All Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Instances</em>'.
	 * @see Gameloop.AllInstances
	 * @generated
	 */
	EClass getAllInstances();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.AllInstances#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Gameloop.AllInstances#getType()
	 * @see #getAllInstances()
	 * @generated
	 */
	EAttribute getAllInstances_Type();

	/**
	 * Returns the meta object for class '{@link Gameloop.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value</em>'.
	 * @see Gameloop.AttributeValue
	 * @generated
	 */
	EClass getAttributeValue();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.AttributeValue#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see Gameloop.AttributeValue#getClass_()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EAttribute getAttributeValue_Class();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.AttributeValue#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see Gameloop.AttributeValue#getAttribute()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EAttribute getAttributeValue_Attribute();

	/**
	 * Returns the meta object for class '{@link Gameloop.ConstantValue <em>Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Value</em>'.
	 * @see Gameloop.ConstantValue
	 * @generated
	 */
	EClass getConstantValue();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.ConstantValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Gameloop.ConstantValue#getValue()
	 * @see #getConstantValue()
	 * @generated
	 */
	EAttribute getConstantValue_Value();

	/**
	 * Returns the meta object for class '{@link Gameloop.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary</em>'.
	 * @see Gameloop.Binary
	 * @generated
	 */
	EClass getBinary();

	/**
	 * Returns the meta object for the attribute '{@link Gameloop.Binary#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see Gameloop.Binary#getOp()
	 * @see #getBinary()
	 * @generated
	 */
	EAttribute getBinary_Op();

	/**
	 * Returns the meta object for the containment reference '{@link Gameloop.Binary#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see Gameloop.Binary#getRight()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_Right();

	/**
	 * Returns the meta object for enum '{@link Gameloop.BasicActions <em>Basic Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Basic Actions</em>'.
	 * @see Gameloop.BasicActions
	 * @generated
	 */
	EEnum getBasicActions();

	/**
	 * Returns the meta object for enum '{@link Gameloop.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action</em>'.
	 * @see Gameloop.Action
	 * @generated
	 */
	EEnum getAction();

	/**
	 * Returns the meta object for enum '{@link Gameloop.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position</em>'.
	 * @see Gameloop.Position
	 * @generated
	 */
	EEnum getPosition();

	/**
	 * Returns the meta object for enum '{@link Gameloop.LogicOps <em>Logic Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logic Ops</em>'.
	 * @see Gameloop.LogicOps
	 * @generated
	 */
	EEnum getLogicOps();

	/**
	 * Returns the meta object for enum '{@link Gameloop.ArithmOps <em>Arithm Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arithm Ops</em>'.
	 * @see Gameloop.ArithmOps
	 * @generated
	 */
	EEnum getArithmOps();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GameloopFactory getGameloopFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Gameloop.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.impl.GameImpl
		 * @see Gameloop.impl.GameloopPackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Win</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__WIN = eINSTANCE.getGame_Win();

		/**
		 * The meta object literal for the '<em><b>Lose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__LOSE = eINSTANCE.getGame_Lose();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__START = eINSTANCE.getGame_Start();

		/**
		 * The meta object literal for the '<em><b>Obj Init</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__OBJ_INIT = eINSTANCE.getGame_ObjInit();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__SCORE = eINSTANCE.getGame_Score();

		/**
		 * The meta object literal for the '<em><b>Collisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__COLLISIONS = eINSTANCE.getGame_Collisions();

		/**
		 * The meta object literal for the '<em><b>Actions Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__ACTIONS_TRIGGERS = eINSTANCE.getGame_ActionsTriggers();

		/**
		 * The meta object literal for the '<em><b>Gamepad</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__GAMEPAD = eINSTANCE.getGame_Gamepad();

		/**
		 * The meta object literal for the '{@link Gameloop.impl.GamePadImpl <em>Game Pad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.impl.GamePadImpl
		 * @see Gameloop.impl.GameloopPackageImpl#getGamePad()
		 * @generated
		 */
		EClass GAME_PAD = eINSTANCE.getGamePad();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_PAD__NAME = eINSTANCE.getGamePad_Name();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_PAD__TRIGGER = eINSTANCE.getGamePad_Trigger();

		/**
		 * The meta object literal for the '{@link Gameloop.impl.ObjInitImpl <em>Obj Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.impl.ObjInitImpl
		 * @see Gameloop.impl.GameloopPackageImpl#getObjInit()
		 * @generated
		 */
		EClass OBJ_INIT = eINSTANCE.getObjInit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJ_INIT__NAME = eINSTANCE.getObjInit_Name();

		/**
		 * The meta object literal for the '<em><b>Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJ_INIT__POS_X = eINSTANCE.getObjInit_PosX();

		/**
		 * The meta object literal for the '<em><b>Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJ_INIT__POS_Y = eINSTANCE.getObjInit_PosY();

		/**
		 * The meta object literal for the '<em><b>Pos Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJ_INIT__POS_Z = eINSTANCE.getObjInit_PosZ();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJ_INIT__RULES = eINSTANCE.getObjInit_Rules();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJ_INIT__CLASS = eINSTANCE.getObjInit_Class();

		/**
		 * The meta object literal for the '{@link Gameloop.impl.ScoreSystemImpl <em>Score System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.impl.ScoreSystemImpl
		 * @see Gameloop.impl.GameloopPackageImpl#getScoreSystem()
		 * @generated
		 */
		EClass SCORE_SYSTEM = eINSTANCE.getScoreSystem();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE_SYSTEM__START = eINSTANCE.getScoreSystem_Start();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE_SYSTEM__FINISH = eINSTANCE.getScoreSystem_Finish();

		/**
		 * The meta object literal for the '<em><b>Lives</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE_SYSTEM__LIVES = eINSTANCE.getScoreSystem_Lives();

		/**
		 * The meta object literal for the '{@link Gameloop.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.impl.TriggerImpl
		 * @see Gameloop.impl.GameloopPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__NAME = eINSTANCE.getTrigger_Name();

		/**
		 * The meta object literal for the '<em><b>Score Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__SCORE_CHANGE = eINSTANCE.getTrigger_ScoreChange();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__MESSAGE = eINSTANCE.getTrigger_Message();

		/**
		 * The meta object literal for the '<em><b>Time Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__TIME_TRIGGER = eINSTANCE.getTrigger_TimeTrigger();

		/**
		 * The meta object literal for the '<em><b>Physic Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__PHYSIC_CHANGES = eINSTANCE.getTrigger_PhysicChanges();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__ACTION = eINSTANCE.getTrigger_Action();

		/**
		 * The meta object literal for the '{@link Gameloop.impl.CollisionImpl <em>Collision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.impl.CollisionImpl
		 * @see Gameloop.impl.GameloopPackageImpl#getCollision()
		 * @generated
		 */
		EClass COLLISION = eINSTANCE.getCollision();

		/**
		 * The meta object literal for the '<em><b>Class A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLISION__CLASS_A = eINSTANCE.getCollision_ClassA();

		/**
		 * The meta object literal for the '<em><b>Class B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLISION__CLASS_B = eINSTANCE.getCollision_ClassB();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLISION__ACTION = eINSTANCE.getCollision_Action();

		/**
		 * The meta object literal for the '{@link Gameloop.impl.PhysicChangeImpl <em>Physic Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.impl.PhysicChangeImpl
		 * @see Gameloop.impl.GameloopPackageImpl#getPhysicChange()
		 * @generated
		 */
		EClass PHYSIC_CHANGE = eINSTANCE.getPhysicChange();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSIC_CHANGE__ATTRIBUTE = eINSTANCE.getPhysicChange_Attribute();

		/**
		 * The meta object literal for the '<em><b>Change Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSIC_CHANGE__CHANGE_VALUE = eINSTANCE.getPhysicChange_ChangeValue();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSIC_CHANGE__ACTION = eINSTANCE.getPhysicChange_Action();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSIC_CHANGE__OBJECT = eINSTANCE.getPhysicChange_Object();

		/**
		 * The meta object literal for the '<em><b>Force</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSIC_CHANGE__FORCE = eINSTANCE.getPhysicChange_Force();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSIC_CHANGE__POSITION = eINSTANCE.getPhysicChange_Position();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSIC_CHANGE__CLASS = eINSTANCE.getPhysicChange_Class();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSIC_CHANGE__SCALE = eINSTANCE.getPhysicChange_Scale();

		/**
		 * The meta object literal for the '{@link Gameloop.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.impl.ConditionImpl
		 * @see Gameloop.impl.GameloopPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link Gameloop.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.impl.RuleImpl
		 * @see Gameloop.impl.GameloopPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__CONDITION = eINSTANCE.getRule_Condition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__ACTION = eINSTANCE.getRule_Action();

		/**
		 * The meta object literal for the '{@link Gameloop.impl.LogicOpImpl <em>Logic Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.impl.LogicOpImpl
		 * @see Gameloop.impl.GameloopPackageImpl#getLogicOp()
		 * @generated
		 */
		EClass LOGIC_OP = eINSTANCE.getLogicOp();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_OP__LEFT = eINSTANCE.getLogicOp_Left();

		/**
		 * The meta object literal for the '{@link Gameloop.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.impl.NotImpl
		 * @see Gameloop.impl.GameloopPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '{@link Gameloop.impl.ArithmeticImpl <em>Arithmetic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.impl.ArithmeticImpl
		 * @see Gameloop.impl.GameloopPackageImpl#getArithmetic()
		 * @generated
		 */
		EClass ARITHMETIC = eINSTANCE.getArithmetic();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC__OP = eINSTANCE.getArithmetic_Op();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC__LEFT = eINSTANCE.getArithmetic_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC__RIGHT = eINSTANCE.getArithmetic_Right();

		/**
		 * The meta object literal for the '{@link Gameloop.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.impl.ValueImpl
		 * @see Gameloop.impl.GameloopPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link Gameloop.impl.AllInstancesImpl <em>All Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.impl.AllInstancesImpl
		 * @see Gameloop.impl.GameloopPackageImpl#getAllInstances()
		 * @generated
		 */
		EClass ALL_INSTANCES = eINSTANCE.getAllInstances();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_INSTANCES__TYPE = eINSTANCE.getAllInstances_Type();

		/**
		 * The meta object literal for the '{@link Gameloop.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.impl.AttributeValueImpl
		 * @see Gameloop.impl.GameloopPackageImpl#getAttributeValue()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE__CLASS = eINSTANCE.getAttributeValue_Class();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE__ATTRIBUTE = eINSTANCE.getAttributeValue_Attribute();

		/**
		 * The meta object literal for the '{@link Gameloop.impl.ConstantValueImpl <em>Constant Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.impl.ConstantValueImpl
		 * @see Gameloop.impl.GameloopPackageImpl#getConstantValue()
		 * @generated
		 */
		EClass CONSTANT_VALUE = eINSTANCE.getConstantValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_VALUE__VALUE = eINSTANCE.getConstantValue_Value();

		/**
		 * The meta object literal for the '{@link Gameloop.impl.BinaryImpl <em>Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.impl.BinaryImpl
		 * @see Gameloop.impl.GameloopPackageImpl#getBinary()
		 * @generated
		 */
		EClass BINARY = eINSTANCE.getBinary();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY__OP = eINSTANCE.getBinary_Op();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__RIGHT = eINSTANCE.getBinary_Right();

		/**
		 * The meta object literal for the '{@link Gameloop.BasicActions <em>Basic Actions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.BasicActions
		 * @see Gameloop.impl.GameloopPackageImpl#getBasicActions()
		 * @generated
		 */
		EEnum BASIC_ACTIONS = eINSTANCE.getBasicActions();

		/**
		 * The meta object literal for the '{@link Gameloop.Action <em>Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.Action
		 * @see Gameloop.impl.GameloopPackageImpl#getAction()
		 * @generated
		 */
		EEnum ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link Gameloop.Position <em>Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.Position
		 * @see Gameloop.impl.GameloopPackageImpl#getPosition()
		 * @generated
		 */
		EEnum POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link Gameloop.LogicOps <em>Logic Ops</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.LogicOps
		 * @see Gameloop.impl.GameloopPackageImpl#getLogicOps()
		 * @generated
		 */
		EEnum LOGIC_OPS = eINSTANCE.getLogicOps();

		/**
		 * The meta object literal for the '{@link Gameloop.ArithmOps <em>Arithm Ops</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gameloop.ArithmOps
		 * @see Gameloop.impl.GameloopPackageImpl#getArithmOps()
		 * @generated
		 */
		EEnum ARITHM_OPS = eINSTANCE.getArithmOps();

	}

} //GameloopPackage
