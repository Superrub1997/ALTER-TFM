/**
 */
package Graphics.impl;

import Gameloop.GameloopPackage;
import Gameloop.impl.GameloopPackageImpl;
import Graphics.Connection;
import Graphics.Constraints;
import Graphics.Graphic;
import Graphics.GraphicClass;
import Graphics.GraphicsFactory;
import Graphics.GraphicsPackage;
import Graphics.Planes;
import Graphics.VersionName;
import Graphics.Versions;

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
public class GraphicsPackageImpl extends EPackageImpl implements GraphicsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planesEEnum = null;

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
	 * @see Graphics.GraphicsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GraphicsPackageImpl() {
		super(eNS_URI, GraphicsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GraphicsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GraphicsPackage init() {
		if (isInited) return (GraphicsPackage)EPackage.Registry.INSTANCE.getEPackage(GraphicsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGraphicsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GraphicsPackageImpl theGraphicsPackage = registeredGraphicsPackage instanceof GraphicsPackageImpl ? (GraphicsPackageImpl)registeredGraphicsPackage : new GraphicsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GameloopPackage.eNS_URI);
		GameloopPackageImpl theGameloopPackage = (GameloopPackageImpl)(registeredPackage instanceof GameloopPackageImpl ? registeredPackage : GameloopPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OntologicalsPackage.eNS_URI);
		OntologicalsPackageImpl theOntologicalsPackage = (OntologicalsPackageImpl)(registeredPackage instanceof OntologicalsPackageImpl ? registeredPackage : OntologicalsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PhysicsPackage.eNS_URI);
		PhysicsPackageImpl thePhysicsPackage = (PhysicsPackageImpl)(registeredPackage instanceof PhysicsPackageImpl ? registeredPackage : PhysicsPackage.eINSTANCE);

		// Create package meta-data objects
		theGraphicsPackage.createPackageContents();
		theGameloopPackage.createPackageContents();
		theOntologicalsPackage.createPackageContents();
		thePhysicsPackage.createPackageContents();

		// Initialize created meta-data
		theGraphicsPackage.initializePackageContents();
		theGameloopPackage.initializePackageContents();
		theOntologicalsPackage.initializePackageContents();
		thePhysicsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGraphicsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GraphicsPackage.eNS_URI, theGraphicsPackage);
		return theGraphicsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphic() {
		return graphicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphic_Classes() {
		return (EReference)graphicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicClass() {
		return graphicClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicClass_Versions() {
		return (EReference)graphicClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicClass_Vname() {
		return (EReference)graphicClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicClass_Constraints() {
		return (EReference)graphicClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicClass_Connections() {
		return (EReference)graphicClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicClass_ShowAttributes() {
		return (EAttribute)graphicClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicClass_MaterialAttributes() {
		return (EAttribute)graphicClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicClass_OntoClass() {
		return (EReference)graphicClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersions() {
		return versionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersions_V1() {
		return (EAttribute)versionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersions_V2() {
		return (EAttribute)versionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersions_V3() {
		return (EAttribute)versionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionName() {
		return versionNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionName_V1() {
		return (EAttribute)versionNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionName_V2() {
		return (EAttribute)versionNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionName_V3() {
		return (EAttribute)versionNameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraints() {
		return constraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraints_Planes() {
		return (EAttribute)constraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraints_Ilumination() {
		return (EAttribute)constraintsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraints_SizeMax() {
		return (EAttribute)constraintsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraints_SizeMin() {
		return (EAttribute)constraintsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraints_SizeInit() {
		return (EAttribute)constraintsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraints_Overlapping() {
		return (EAttribute)constraintsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraints_XToOriginPos() {
		return (EAttribute)constraintsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraints_YToOriginPos() {
		return (EAttribute)constraintsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraints_ZToOriginPos() {
		return (EAttribute)constraintsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraints_Rotation() {
		return (EAttribute)constraintsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraints_Text() {
		return (EAttribute)constraintsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraints_TextColor() {
		return (EAttribute)constraintsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Name() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Type() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Color() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_TextColor() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Decorator() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_DecoratorPos() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Pattern() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Width() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Position() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanes() {
		return planesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicsFactory getGraphicsFactory() {
		return (GraphicsFactory)getEFactoryInstance();
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
		graphicEClass = createEClass(GRAPHIC);
		createEReference(graphicEClass, GRAPHIC__CLASSES);

		graphicClassEClass = createEClass(GRAPHIC_CLASS);
		createEReference(graphicClassEClass, GRAPHIC_CLASS__VERSIONS);
		createEReference(graphicClassEClass, GRAPHIC_CLASS__VNAME);
		createEReference(graphicClassEClass, GRAPHIC_CLASS__CONSTRAINTS);
		createEReference(graphicClassEClass, GRAPHIC_CLASS__CONNECTIONS);
		createEAttribute(graphicClassEClass, GRAPHIC_CLASS__SHOW_ATTRIBUTES);
		createEAttribute(graphicClassEClass, GRAPHIC_CLASS__MATERIAL_ATTRIBUTES);
		createEReference(graphicClassEClass, GRAPHIC_CLASS__ONTO_CLASS);

		versionsEClass = createEClass(VERSIONS);
		createEAttribute(versionsEClass, VERSIONS__V1);
		createEAttribute(versionsEClass, VERSIONS__V2);
		createEAttribute(versionsEClass, VERSIONS__V3);

		versionNameEClass = createEClass(VERSION_NAME);
		createEAttribute(versionNameEClass, VERSION_NAME__V1);
		createEAttribute(versionNameEClass, VERSION_NAME__V2);
		createEAttribute(versionNameEClass, VERSION_NAME__V3);

		constraintsEClass = createEClass(CONSTRAINTS);
		createEAttribute(constraintsEClass, CONSTRAINTS__PLANES);
		createEAttribute(constraintsEClass, CONSTRAINTS__ILUMINATION);
		createEAttribute(constraintsEClass, CONSTRAINTS__SIZE_MAX);
		createEAttribute(constraintsEClass, CONSTRAINTS__SIZE_MIN);
		createEAttribute(constraintsEClass, CONSTRAINTS__SIZE_INIT);
		createEAttribute(constraintsEClass, CONSTRAINTS__OVERLAPPING);
		createEAttribute(constraintsEClass, CONSTRAINTS__XTO_ORIGIN_POS);
		createEAttribute(constraintsEClass, CONSTRAINTS__YTO_ORIGIN_POS);
		createEAttribute(constraintsEClass, CONSTRAINTS__ZTO_ORIGIN_POS);
		createEAttribute(constraintsEClass, CONSTRAINTS__ROTATION);
		createEAttribute(constraintsEClass, CONSTRAINTS__TEXT);
		createEAttribute(constraintsEClass, CONSTRAINTS__TEXT_COLOR);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__NAME);
		createEAttribute(connectionEClass, CONNECTION__TYPE);
		createEAttribute(connectionEClass, CONNECTION__COLOR);
		createEAttribute(connectionEClass, CONNECTION__TEXT_COLOR);
		createEAttribute(connectionEClass, CONNECTION__DECORATOR);
		createEAttribute(connectionEClass, CONNECTION__DECORATOR_POS);
		createEAttribute(connectionEClass, CONNECTION__PATTERN);
		createEAttribute(connectionEClass, CONNECTION__WIDTH);
		createEAttribute(connectionEClass, CONNECTION__POSITION);

		// Create enums
		planesEEnum = createEEnum(PLANES);
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
		initEClass(graphicEClass, Graphic.class, "Graphic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphic_Classes(), this.getGraphicClass(), null, "classes", null, 1, -1, Graphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicClassEClass, GraphicClass.class, "GraphicClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphicClass_Versions(), this.getVersions(), null, "versions", null, 1, 1, GraphicClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphicClass_Vname(), this.getVersionName(), null, "vname", null, 1, 1, GraphicClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphicClass_Constraints(), this.getConstraints(), null, "constraints", null, 1, 1, GraphicClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphicClass_Connections(), this.getConnection(), null, "connections", null, 0, -1, GraphicClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicClass_ShowAttributes(), ecorePackage.getEString(), "showAttributes", null, 0, -1, GraphicClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicClass_MaterialAttributes(), ecorePackage.getEString(), "materialAttributes", null, 0, -1, GraphicClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphicClass_OntoClass(), theOntologicalsPackage.getClass_(), null, "ontoClass", null, 1, 1, GraphicClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionsEClass, Versions.class, "Versions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersions_V1(), ecorePackage.getEString(), "v1", null, 1, 1, Versions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersions_V2(), ecorePackage.getEString(), "v2", null, 1, 1, Versions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersions_V3(), ecorePackage.getEString(), "v3", null, 1, 1, Versions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionNameEClass, VersionName.class, "VersionName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionName_V1(), ecorePackage.getEString(), "v1", null, 1, 1, VersionName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionName_V2(), ecorePackage.getEString(), "v2", null, 1, 1, VersionName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionName_V3(), ecorePackage.getEString(), "v3", null, 1, 1, VersionName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintsEClass, Constraints.class, "Constraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraints_Planes(), this.getPlanes(), "planes", null, 1, 1, Constraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraints_Ilumination(), ecorePackage.getEString(), "ilumination", null, 0, 1, Constraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraints_SizeMax(), ecorePackage.getEDouble(), "sizeMax", null, 1, 1, Constraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraints_SizeMin(), ecorePackage.getEDouble(), "sizeMin", null, 1, 1, Constraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraints_SizeInit(), ecorePackage.getEDouble(), "sizeInit", null, 0, 1, Constraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraints_Overlapping(), ecorePackage.getEBoolean(), "overlapping", null, 1, 1, Constraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraints_XToOriginPos(), ecorePackage.getEDouble(), "xToOriginPos", null, 1, 1, Constraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraints_YToOriginPos(), ecorePackage.getEDouble(), "yToOriginPos", null, 1, 1, Constraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraints_ZToOriginPos(), ecorePackage.getEDouble(), "zToOriginPos", null, 1, 1, Constraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraints_Rotation(), ecorePackage.getEInt(), "rotation", null, 1, 1, Constraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraints_Text(), ecorePackage.getEString(), "text", null, 0, 1, Constraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraints_TextColor(), ecorePackage.getEString(), "textColor", null, 0, 1, Constraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_Name(), ecorePackage.getEString(), "name", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Type(), ecorePackage.getEString(), "type", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Color(), ecorePackage.getEString(), "color", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_TextColor(), ecorePackage.getEString(), "textColor", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Decorator(), ecorePackage.getEString(), "decorator", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_DecoratorPos(), ecorePackage.getEString(), "decoratorPos", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Pattern(), ecorePackage.getEString(), "pattern", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Width(), ecorePackage.getEDouble(), "width", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Position(), ecorePackage.getEString(), "position", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(planesEEnum, Planes.class, "Planes");
		addEEnumLiteral(planesEEnum, Planes.ANY);
		addEEnumLiteral(planesEEnum, Planes.HORIZONTAL);
		addEEnumLiteral(planesEEnum, Planes.VERTICAL);

		// Create resource
		createResource(eNS_URI);
	}

} //GraphicsPackageImpl
