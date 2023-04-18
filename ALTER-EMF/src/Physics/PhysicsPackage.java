/**
 */
package Physics;

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
 * @see Physics.PhysicsFactory
 * @model kind="package"
 * @generated
 */
public interface PhysicsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Physics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://physics/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Physics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PhysicsPackage eINSTANCE = Physics.impl.PhysicsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Physics.impl.PhysicImpl <em>Physic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Physics.impl.PhysicImpl
	 * @see Physics.impl.PhysicsPackageImpl#getPhysic()
	 * @generated
	 */
	int PHYSIC = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC__CLASSES = 0;

	/**
	 * The number of structural features of the '<em>Physic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Physic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Physics.impl.PhysicClassImpl <em>Physic Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Physics.impl.PhysicClassImpl
	 * @see Physics.impl.PhysicsPackageImpl#getPhysicClass()
	 * @generated
	 */
	int PHYSIC_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Physic Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_CLASS__PHYSIC_BODY = 0;

	/**
	 * The feature id for the '<em><b>Bit Masks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_CLASS__BIT_MASKS = 1;

	/**
	 * The feature id for the '<em><b>Forces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_CLASS__FORCES = 2;

	/**
	 * The feature id for the '<em><b>Onto Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_CLASS__ONTO_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Physic Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_CLASS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Physic Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Physics.impl.PhysicBodyImpl <em>Physic Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Physics.impl.PhysicBodyImpl
	 * @see Physics.impl.PhysicsPackageImpl#getPhysicBody()
	 * @generated
	 */
	int PHYSIC_BODY = 2;

	/**
	 * The feature id for the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_BODY__MASS = 0;

	/**
	 * The feature id for the '<em><b>Body Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_BODY__BODY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_BODY__CHARGE = 2;

	/**
	 * The feature id for the '<em><b>Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_BODY__FRICTION = 3;

	/**
	 * The feature id for the '<em><b>Rolling Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_BODY__ROLLING_FRICTION = 4;

	/**
	 * The feature id for the '<em><b>Restitution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_BODY__RESTITUTION = 5;

	/**
	 * The feature id for the '<em><b>Damping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_BODY__DAMPING = 6;

	/**
	 * The feature id for the '<em><b>Angular Damping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_BODY__ANGULAR_DAMPING = 7;

	/**
	 * The number of structural features of the '<em>Physic Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_BODY_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Physic Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_BODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Physics.impl.ForceImpl <em>Force</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Physics.impl.ForceImpl
	 * @see Physics.impl.PhysicsPackageImpl#getForce()
	 * @generated
	 */
	int FORCE = 3;

	/**
	 * The feature id for the '<em><b>XVector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE__XVECTOR = 0;

	/**
	 * The feature id for the '<em><b>YVector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE__YVECTOR = 1;

	/**
	 * The feature id for the '<em><b>ZVector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE__ZVECTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Gesture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE__GESTURE = 4;

	/**
	 * The number of structural features of the '<em>Force</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Force</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Physics.impl.BitMasksImpl <em>Bit Masks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Physics.impl.BitMasksImpl
	 * @see Physics.impl.PhysicsPackageImpl#getBitMasks()
	 * @generated
	 */
	int BIT_MASKS = 4;

	/**
	 * The feature id for the '<em><b>Collision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MASKS__COLLISION = 0;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MASKS__CONTACT = 1;

	/**
	 * The number of structural features of the '<em>Bit Masks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MASKS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bit Masks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MASKS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Physics.BodyType <em>Body Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Physics.BodyType
	 * @see Physics.impl.PhysicsPackageImpl#getBodyType()
	 * @generated
	 */
	int BODY_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link Physics.Physic <em>Physic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physic</em>'.
	 * @see Physics.Physic
	 * @generated
	 */
	EClass getPhysic();

	/**
	 * Returns the meta object for the containment reference list '{@link Physics.Physic#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see Physics.Physic#getClasses()
	 * @see #getPhysic()
	 * @generated
	 */
	EReference getPhysic_Classes();

	/**
	 * Returns the meta object for class '{@link Physics.PhysicClass <em>Physic Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physic Class</em>'.
	 * @see Physics.PhysicClass
	 * @generated
	 */
	EClass getPhysicClass();

	/**
	 * Returns the meta object for the containment reference '{@link Physics.PhysicClass#getPhysicBody <em>Physic Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Physic Body</em>'.
	 * @see Physics.PhysicClass#getPhysicBody()
	 * @see #getPhysicClass()
	 * @generated
	 */
	EReference getPhysicClass_PhysicBody();

	/**
	 * Returns the meta object for the containment reference '{@link Physics.PhysicClass#getBitMasks <em>Bit Masks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bit Masks</em>'.
	 * @see Physics.PhysicClass#getBitMasks()
	 * @see #getPhysicClass()
	 * @generated
	 */
	EReference getPhysicClass_BitMasks();

	/**
	 * Returns the meta object for the containment reference list '{@link Physics.PhysicClass#getForces <em>Forces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forces</em>'.
	 * @see Physics.PhysicClass#getForces()
	 * @see #getPhysicClass()
	 * @generated
	 */
	EReference getPhysicClass_Forces();

	/**
	 * Returns the meta object for the reference '{@link Physics.PhysicClass#getOntoClass <em>Onto Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Onto Class</em>'.
	 * @see Physics.PhysicClass#getOntoClass()
	 * @see #getPhysicClass()
	 * @generated
	 */
	EReference getPhysicClass_OntoClass();

	/**
	 * Returns the meta object for class '{@link Physics.PhysicBody <em>Physic Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physic Body</em>'.
	 * @see Physics.PhysicBody
	 * @generated
	 */
	EClass getPhysicBody();

	/**
	 * Returns the meta object for the attribute '{@link Physics.PhysicBody#getMass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mass</em>'.
	 * @see Physics.PhysicBody#getMass()
	 * @see #getPhysicBody()
	 * @generated
	 */
	EAttribute getPhysicBody_Mass();

	/**
	 * Returns the meta object for the attribute '{@link Physics.PhysicBody#getBodyType <em>Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body Type</em>'.
	 * @see Physics.PhysicBody#getBodyType()
	 * @see #getPhysicBody()
	 * @generated
	 */
	EAttribute getPhysicBody_BodyType();

	/**
	 * Returns the meta object for the attribute '{@link Physics.PhysicBody#getCharge <em>Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charge</em>'.
	 * @see Physics.PhysicBody#getCharge()
	 * @see #getPhysicBody()
	 * @generated
	 */
	EAttribute getPhysicBody_Charge();

	/**
	 * Returns the meta object for the attribute '{@link Physics.PhysicBody#getFriction <em>Friction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friction</em>'.
	 * @see Physics.PhysicBody#getFriction()
	 * @see #getPhysicBody()
	 * @generated
	 */
	EAttribute getPhysicBody_Friction();

	/**
	 * Returns the meta object for the attribute '{@link Physics.PhysicBody#getRollingFriction <em>Rolling Friction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rolling Friction</em>'.
	 * @see Physics.PhysicBody#getRollingFriction()
	 * @see #getPhysicBody()
	 * @generated
	 */
	EAttribute getPhysicBody_RollingFriction();

	/**
	 * Returns the meta object for the attribute '{@link Physics.PhysicBody#getRestitution <em>Restitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restitution</em>'.
	 * @see Physics.PhysicBody#getRestitution()
	 * @see #getPhysicBody()
	 * @generated
	 */
	EAttribute getPhysicBody_Restitution();

	/**
	 * Returns the meta object for the attribute '{@link Physics.PhysicBody#getDamping <em>Damping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damping</em>'.
	 * @see Physics.PhysicBody#getDamping()
	 * @see #getPhysicBody()
	 * @generated
	 */
	EAttribute getPhysicBody_Damping();

	/**
	 * Returns the meta object for the attribute '{@link Physics.PhysicBody#getAngularDamping <em>Angular Damping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angular Damping</em>'.
	 * @see Physics.PhysicBody#getAngularDamping()
	 * @see #getPhysicBody()
	 * @generated
	 */
	EAttribute getPhysicBody_AngularDamping();

	/**
	 * Returns the meta object for class '{@link Physics.Force <em>Force</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Force</em>'.
	 * @see Physics.Force
	 * @generated
	 */
	EClass getForce();

	/**
	 * Returns the meta object for the attribute '{@link Physics.Force#getXVector <em>XVector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XVector</em>'.
	 * @see Physics.Force#getXVector()
	 * @see #getForce()
	 * @generated
	 */
	EAttribute getForce_XVector();

	/**
	 * Returns the meta object for the attribute '{@link Physics.Force#getYVector <em>YVector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YVector</em>'.
	 * @see Physics.Force#getYVector()
	 * @see #getForce()
	 * @generated
	 */
	EAttribute getForce_YVector();

	/**
	 * Returns the meta object for the attribute '{@link Physics.Force#getZVector <em>ZVector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZVector</em>'.
	 * @see Physics.Force#getZVector()
	 * @see #getForce()
	 * @generated
	 */
	EAttribute getForce_ZVector();

	/**
	 * Returns the meta object for the attribute '{@link Physics.Force#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Physics.Force#getName()
	 * @see #getForce()
	 * @generated
	 */
	EAttribute getForce_Name();

	/**
	 * Returns the meta object for the attribute '{@link Physics.Force#getGesture <em>Gesture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gesture</em>'.
	 * @see Physics.Force#getGesture()
	 * @see #getForce()
	 * @generated
	 */
	EAttribute getForce_Gesture();

	/**
	 * Returns the meta object for class '{@link Physics.BitMasks <em>Bit Masks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Masks</em>'.
	 * @see Physics.BitMasks
	 * @generated
	 */
	EClass getBitMasks();

	/**
	 * Returns the meta object for the reference list '{@link Physics.BitMasks#getCollision <em>Collision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collision</em>'.
	 * @see Physics.BitMasks#getCollision()
	 * @see #getBitMasks()
	 * @generated
	 */
	EReference getBitMasks_Collision();

	/**
	 * Returns the meta object for the reference list '{@link Physics.BitMasks#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contact</em>'.
	 * @see Physics.BitMasks#getContact()
	 * @see #getBitMasks()
	 * @generated
	 */
	EReference getBitMasks_Contact();

	/**
	 * Returns the meta object for enum '{@link Physics.BodyType <em>Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Body Type</em>'.
	 * @see Physics.BodyType
	 * @generated
	 */
	EEnum getBodyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PhysicsFactory getPhysicsFactory();

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
		 * The meta object literal for the '{@link Physics.impl.PhysicImpl <em>Physic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Physics.impl.PhysicImpl
		 * @see Physics.impl.PhysicsPackageImpl#getPhysic()
		 * @generated
		 */
		EClass PHYSIC = eINSTANCE.getPhysic();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSIC__CLASSES = eINSTANCE.getPhysic_Classes();

		/**
		 * The meta object literal for the '{@link Physics.impl.PhysicClassImpl <em>Physic Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Physics.impl.PhysicClassImpl
		 * @see Physics.impl.PhysicsPackageImpl#getPhysicClass()
		 * @generated
		 */
		EClass PHYSIC_CLASS = eINSTANCE.getPhysicClass();

		/**
		 * The meta object literal for the '<em><b>Physic Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSIC_CLASS__PHYSIC_BODY = eINSTANCE.getPhysicClass_PhysicBody();

		/**
		 * The meta object literal for the '<em><b>Bit Masks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSIC_CLASS__BIT_MASKS = eINSTANCE.getPhysicClass_BitMasks();

		/**
		 * The meta object literal for the '<em><b>Forces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSIC_CLASS__FORCES = eINSTANCE.getPhysicClass_Forces();

		/**
		 * The meta object literal for the '<em><b>Onto Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSIC_CLASS__ONTO_CLASS = eINSTANCE.getPhysicClass_OntoClass();

		/**
		 * The meta object literal for the '{@link Physics.impl.PhysicBodyImpl <em>Physic Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Physics.impl.PhysicBodyImpl
		 * @see Physics.impl.PhysicsPackageImpl#getPhysicBody()
		 * @generated
		 */
		EClass PHYSIC_BODY = eINSTANCE.getPhysicBody();

		/**
		 * The meta object literal for the '<em><b>Mass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSIC_BODY__MASS = eINSTANCE.getPhysicBody_Mass();

		/**
		 * The meta object literal for the '<em><b>Body Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSIC_BODY__BODY_TYPE = eINSTANCE.getPhysicBody_BodyType();

		/**
		 * The meta object literal for the '<em><b>Charge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSIC_BODY__CHARGE = eINSTANCE.getPhysicBody_Charge();

		/**
		 * The meta object literal for the '<em><b>Friction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSIC_BODY__FRICTION = eINSTANCE.getPhysicBody_Friction();

		/**
		 * The meta object literal for the '<em><b>Rolling Friction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSIC_BODY__ROLLING_FRICTION = eINSTANCE.getPhysicBody_RollingFriction();

		/**
		 * The meta object literal for the '<em><b>Restitution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSIC_BODY__RESTITUTION = eINSTANCE.getPhysicBody_Restitution();

		/**
		 * The meta object literal for the '<em><b>Damping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSIC_BODY__DAMPING = eINSTANCE.getPhysicBody_Damping();

		/**
		 * The meta object literal for the '<em><b>Angular Damping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSIC_BODY__ANGULAR_DAMPING = eINSTANCE.getPhysicBody_AngularDamping();

		/**
		 * The meta object literal for the '{@link Physics.impl.ForceImpl <em>Force</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Physics.impl.ForceImpl
		 * @see Physics.impl.PhysicsPackageImpl#getForce()
		 * @generated
		 */
		EClass FORCE = eINSTANCE.getForce();

		/**
		 * The meta object literal for the '<em><b>XVector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORCE__XVECTOR = eINSTANCE.getForce_XVector();

		/**
		 * The meta object literal for the '<em><b>YVector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORCE__YVECTOR = eINSTANCE.getForce_YVector();

		/**
		 * The meta object literal for the '<em><b>ZVector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORCE__ZVECTOR = eINSTANCE.getForce_ZVector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORCE__NAME = eINSTANCE.getForce_Name();

		/**
		 * The meta object literal for the '<em><b>Gesture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORCE__GESTURE = eINSTANCE.getForce_Gesture();

		/**
		 * The meta object literal for the '{@link Physics.impl.BitMasksImpl <em>Bit Masks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Physics.impl.BitMasksImpl
		 * @see Physics.impl.PhysicsPackageImpl#getBitMasks()
		 * @generated
		 */
		EClass BIT_MASKS = eINSTANCE.getBitMasks();

		/**
		 * The meta object literal for the '<em><b>Collision</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIT_MASKS__COLLISION = eINSTANCE.getBitMasks_Collision();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIT_MASKS__CONTACT = eINSTANCE.getBitMasks_Contact();

		/**
		 * The meta object literal for the '{@link Physics.BodyType <em>Body Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Physics.BodyType
		 * @see Physics.impl.PhysicsPackageImpl#getBodyType()
		 * @generated
		 */
		EEnum BODY_TYPE = eINSTANCE.getBodyType();

	}

} //PhysicsPackage
