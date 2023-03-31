/**
 */
package Physics.impl;

import Gameloop.GameloopPackage;
import Gameloop.impl.GameloopPackageImpl;
import Graphics.GraphicsPackage;
import Graphics.impl.GraphicsPackageImpl;
import Ontologicals.OntologicalsPackage;

import Ontologicals.impl.OntologicalsPackageImpl;

import Physics.BitMasks;
import Physics.BodyType;
import Physics.Force;
import Physics.Physic;
import Physics.PhysicBody;
import Physics.PhysicClass;
import Physics.PhysicsFactory;
import Physics.PhysicsPackage;

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
public class PhysicsPackageImpl extends EPackageImpl implements PhysicsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitMasksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bodyTypeEEnum = null;

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
	 * @see Physics.PhysicsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PhysicsPackageImpl() {
		super(eNS_URI, PhysicsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PhysicsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PhysicsPackage init() {
		if (isInited) return (PhysicsPackage)EPackage.Registry.INSTANCE.getEPackage(PhysicsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPhysicsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PhysicsPackageImpl thePhysicsPackage = registeredPhysicsPackage instanceof PhysicsPackageImpl ? (PhysicsPackageImpl)registeredPhysicsPackage : new PhysicsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GameloopPackage.eNS_URI);
		GameloopPackageImpl theGameloopPackage = (GameloopPackageImpl)(registeredPackage instanceof GameloopPackageImpl ? registeredPackage : GameloopPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OntologicalsPackage.eNS_URI);
		OntologicalsPackageImpl theOntologicalsPackage = (OntologicalsPackageImpl)(registeredPackage instanceof OntologicalsPackageImpl ? registeredPackage : OntologicalsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GraphicsPackage.eNS_URI);
		GraphicsPackageImpl theGraphicsPackage = (GraphicsPackageImpl)(registeredPackage instanceof GraphicsPackageImpl ? registeredPackage : GraphicsPackage.eINSTANCE);

		// Create package meta-data objects
		thePhysicsPackage.createPackageContents();
		theGameloopPackage.createPackageContents();
		theOntologicalsPackage.createPackageContents();
		theGraphicsPackage.createPackageContents();

		// Initialize created meta-data
		thePhysicsPackage.initializePackageContents();
		theGameloopPackage.initializePackageContents();
		theOntologicalsPackage.initializePackageContents();
		theGraphicsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePhysicsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PhysicsPackage.eNS_URI, thePhysicsPackage);
		return thePhysicsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysic() {
		return physicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysic_Classes() {
		return (EReference)physicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicClass() {
		return physicClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicClass_PhysicBody() {
		return (EReference)physicClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicClass_BitMasks() {
		return (EReference)physicClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicClass_Forces() {
		return (EReference)physicClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicClass_OntoClass() {
		return (EReference)physicClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicBody() {
		return physicBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicBody_Mass() {
		return (EAttribute)physicBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicBody_BodyType() {
		return (EAttribute)physicBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicBody_Charge() {
		return (EAttribute)physicBodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicBody_Friction() {
		return (EAttribute)physicBodyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicBody_RollingFriction() {
		return (EAttribute)physicBodyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicBody_Restitution() {
		return (EAttribute)physicBodyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicBody_Damping() {
		return (EAttribute)physicBodyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicBody_AngularDamping() {
		return (EAttribute)physicBodyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForce() {
		return forceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForce_XVector() {
		return (EAttribute)forceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForce_YVector() {
		return (EAttribute)forceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForce_ZVector() {
		return (EAttribute)forceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForce_Name() {
		return (EAttribute)forceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForce_Gesture() {
		return (EAttribute)forceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitMasks() {
		return bitMasksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitMasks_Category() {
		return (EAttribute)bitMasksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitMasks_Collision() {
		return (EAttribute)bitMasksEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitMasks_ContactTest() {
		return (EAttribute)bitMasksEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBodyType() {
		return bodyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicsFactory getPhysicsFactory() {
		return (PhysicsFactory)getEFactoryInstance();
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
		physicEClass = createEClass(PHYSIC);
		createEReference(physicEClass, PHYSIC__CLASSES);

		physicClassEClass = createEClass(PHYSIC_CLASS);
		createEReference(physicClassEClass, PHYSIC_CLASS__PHYSIC_BODY);
		createEReference(physicClassEClass, PHYSIC_CLASS__BIT_MASKS);
		createEReference(physicClassEClass, PHYSIC_CLASS__FORCES);
		createEReference(physicClassEClass, PHYSIC_CLASS__ONTO_CLASS);

		physicBodyEClass = createEClass(PHYSIC_BODY);
		createEAttribute(physicBodyEClass, PHYSIC_BODY__MASS);
		createEAttribute(physicBodyEClass, PHYSIC_BODY__BODY_TYPE);
		createEAttribute(physicBodyEClass, PHYSIC_BODY__CHARGE);
		createEAttribute(physicBodyEClass, PHYSIC_BODY__FRICTION);
		createEAttribute(physicBodyEClass, PHYSIC_BODY__ROLLING_FRICTION);
		createEAttribute(physicBodyEClass, PHYSIC_BODY__RESTITUTION);
		createEAttribute(physicBodyEClass, PHYSIC_BODY__DAMPING);
		createEAttribute(physicBodyEClass, PHYSIC_BODY__ANGULAR_DAMPING);

		forceEClass = createEClass(FORCE);
		createEAttribute(forceEClass, FORCE__XVECTOR);
		createEAttribute(forceEClass, FORCE__YVECTOR);
		createEAttribute(forceEClass, FORCE__ZVECTOR);
		createEAttribute(forceEClass, FORCE__NAME);
		createEAttribute(forceEClass, FORCE__GESTURE);

		bitMasksEClass = createEClass(BIT_MASKS);
		createEAttribute(bitMasksEClass, BIT_MASKS__CATEGORY);
		createEAttribute(bitMasksEClass, BIT_MASKS__COLLISION);
		createEAttribute(bitMasksEClass, BIT_MASKS__CONTACT_TEST);

		// Create enums
		bodyTypeEEnum = createEEnum(BODY_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(physicEClass, Physic.class, "Physic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysic_Classes(), this.getPhysicClass(), null, "classes", null, 1, -1, Physic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicClassEClass, PhysicClass.class, "PhysicClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicClass_PhysicBody(), this.getPhysicBody(), null, "physicBody", null, 1, 1, PhysicClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicClass_BitMasks(), this.getBitMasks(), null, "bitMasks", null, 1, 1, PhysicClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicClass_Forces(), this.getForce(), null, "forces", null, 0, -1, PhysicClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicClass_OntoClass(), theOntologicalsPackage.getClass_(), null, "ontoClass", null, 1, 1, PhysicClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicBodyEClass, PhysicBody.class, "PhysicBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicBody_Mass(), ecorePackage.getEDouble(), "mass", null, 1, 1, PhysicBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicBody_BodyType(), this.getBodyType(), "bodyType", null, 1, 1, PhysicBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicBody_Charge(), ecorePackage.getEDouble(), "charge", null, 1, 1, PhysicBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicBody_Friction(), ecorePackage.getEDouble(), "friction", null, 1, 1, PhysicBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicBody_RollingFriction(), ecorePackage.getEDouble(), "rollingFriction", null, 1, 1, PhysicBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicBody_Restitution(), ecorePackage.getEDouble(), "restitution", null, 1, 1, PhysicBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicBody_Damping(), ecorePackage.getEDouble(), "damping", null, 1, 1, PhysicBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicBody_AngularDamping(), ecorePackage.getEDouble(), "angularDamping", null, 1, 1, PhysicBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forceEClass, Force.class, "Force", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForce_XVector(), ecorePackage.getEDouble(), "xVector", null, 0, 1, Force.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForce_YVector(), ecorePackage.getEDouble(), "yVector", null, 0, 1, Force.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForce_ZVector(), ecorePackage.getEDouble(), "zVector", null, 0, 1, Force.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForce_Name(), ecorePackage.getEString(), "name", null, 1, 1, Force.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForce_Gesture(), ecorePackage.getEString(), "gesture", null, 1, 1, Force.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bitMasksEClass, BitMasks.class, "BitMasks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBitMasks_Category(), ecorePackage.getEInt(), "category", null, 1, 1, BitMasks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitMasks_Collision(), ecorePackage.getEInt(), "collision", null, 1, 1, BitMasks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitMasks_ContactTest(), ecorePackage.getEInt(), "contactTest", null, 1, 1, BitMasks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bodyTypeEEnum, BodyType.class, "BodyType");
		addEEnumLiteral(bodyTypeEEnum, BodyType.STATIC);
		addEEnumLiteral(bodyTypeEEnum, BodyType.DYNAMIC);
		addEEnumLiteral(bodyTypeEEnum, BodyType.KINEMATIC);

		// Create resource
		createResource(eNS_URI);
	}

} //PhysicsPackageImpl
