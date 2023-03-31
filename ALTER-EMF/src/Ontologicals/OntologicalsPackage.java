/**
 */
package Ontologicals;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see Ontologicals.OntologicalsFactory
 * @model kind="package"
 * @generated
 */
public interface OntologicalsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Ontologicals";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ontologicals/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Ontologicals";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OntologicalsPackage eINSTANCE = Ontologicals.impl.OntologicalsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Ontologicals.impl.OntologicalImpl <em>Ontological</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ontologicals.impl.OntologicalImpl
	 * @see Ontologicals.impl.OntologicalsPackageImpl#getOntological()
	 * @generated
	 */
	int ONTOLOGICAL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL__URI = 1;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL__EXTERNAL = 2;

	/**
	 * The feature id for the '<em><b>Only Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL__ONLY_CODES = 3;

	/**
	 * The feature id for the '<em><b>Bluetooth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL__BLUETOOTH = 4;

	/**
	 * The feature id for the '<em><b>Firebase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL__FIREBASE = 5;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL__CLASSES = 6;

	/**
	 * The feature id for the '<em><b>Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL__GRAPHIC = 7;

	/**
	 * The feature id for the '<em><b>Physic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL__PHYSIC = 8;

	/**
	 * The feature id for the '<em><b>Gameloop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL__GAMELOOP = 9;

	/**
	 * The number of structural features of the '<em>Ontological</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Ontological</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Ontologicals.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ontologicals.impl.ClassImpl
	 * @see Ontologicals.impl.OntologicalsPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ABSTRACT = 1;

	/**
	 * The feature id for the '<em><b>No SCN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NO_SCN = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__REFERENCES = 4;

	/**
	 * The feature id for the '<em><b>Superclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPERCLASSES = 5;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Ontologicals.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ontologicals.impl.AttributeImpl
	 * @see Ontologicals.impl.OntologicalsPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MIN = 2;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MAX = 3;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT = 4;

	/**
	 * The feature id for the '<em><b>Is Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_PARAM = 5;

	/**
	 * The feature id for the '<em><b>Is Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_KEY = 6;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__READ_ONLY = 7;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Ontologicals.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ontologicals.impl.ReferenceImpl
	 * @see Ontologicals.impl.OntologicalsPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Containtment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CONTAINTMENT = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__MIN = 2;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__MAX = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TARGET = 4;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__OPPOSITE = 5;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Ontologicals.Ontological <em>Ontological</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontological</em>'.
	 * @see Ontologicals.Ontological
	 * @generated
	 */
	EClass getOntological();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Ontological#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Ontologicals.Ontological#getName()
	 * @see #getOntological()
	 * @generated
	 */
	EAttribute getOntological_Name();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Ontological#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see Ontologicals.Ontological#getURI()
	 * @see #getOntological()
	 * @generated
	 */
	EAttribute getOntological_URI();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Ontological#isExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External</em>'.
	 * @see Ontologicals.Ontological#isExternal()
	 * @see #getOntological()
	 * @generated
	 */
	EAttribute getOntological_External();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Ontological#isOnlyCodes <em>Only Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Codes</em>'.
	 * @see Ontologicals.Ontological#isOnlyCodes()
	 * @see #getOntological()
	 * @generated
	 */
	EAttribute getOntological_OnlyCodes();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Ontological#isBluetooth <em>Bluetooth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bluetooth</em>'.
	 * @see Ontologicals.Ontological#isBluetooth()
	 * @see #getOntological()
	 * @generated
	 */
	EAttribute getOntological_Bluetooth();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Ontological#isFirebase <em>Firebase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firebase</em>'.
	 * @see Ontologicals.Ontological#isFirebase()
	 * @see #getOntological()
	 * @generated
	 */
	EAttribute getOntological_Firebase();

	/**
	 * Returns the meta object for the containment reference list '{@link Ontologicals.Ontological#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see Ontologicals.Ontological#getClasses()
	 * @see #getOntological()
	 * @generated
	 */
	EReference getOntological_Classes();

	/**
	 * Returns the meta object for the containment reference '{@link Ontologicals.Ontological#getGraphic <em>Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphic</em>'.
	 * @see Ontologicals.Ontological#getGraphic()
	 * @see #getOntological()
	 * @generated
	 */
	EReference getOntological_Graphic();

	/**
	 * Returns the meta object for the containment reference '{@link Ontologicals.Ontological#getPhysic <em>Physic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Physic</em>'.
	 * @see Ontologicals.Ontological#getPhysic()
	 * @see #getOntological()
	 * @generated
	 */
	EReference getOntological_Physic();

	/**
	 * Returns the meta object for the containment reference '{@link Ontologicals.Ontological#getGameloop <em>Gameloop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gameloop</em>'.
	 * @see Ontologicals.Ontological#getGameloop()
	 * @see #getOntological()
	 * @generated
	 */
	EReference getOntological_Gameloop();

	/**
	 * Returns the meta object for class '{@link Ontologicals.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see Ontologicals.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Ontologicals.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Class#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see Ontologicals.Class#isAbstract()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Class#isNoSCN <em>No SCN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No SCN</em>'.
	 * @see Ontologicals.Class#isNoSCN()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_NoSCN();

	/**
	 * Returns the meta object for the containment reference list '{@link Ontologicals.Class#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see Ontologicals.Class#getAttributes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link Ontologicals.Class#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see Ontologicals.Class#getReferences()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_References();

	/**
	 * Returns the meta object for the reference list '{@link Ontologicals.Class#getSuperclasses <em>Superclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Superclasses</em>'.
	 * @see Ontologicals.Class#getSuperclasses()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Superclasses();

	/**
	 * Returns the meta object for class '{@link Ontologicals.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see Ontologicals.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Ontologicals.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Ontologicals.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Attribute#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see Ontologicals.Attribute#getMin()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Min();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Attribute#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see Ontologicals.Attribute#getMax()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Max();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Attribute#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see Ontologicals.Attribute#getDefault()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Default();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Attribute#isIsParam <em>Is Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Param</em>'.
	 * @see Ontologicals.Attribute#isIsParam()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsParam();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Attribute#isIsKey <em>Is Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Key</em>'.
	 * @see Ontologicals.Attribute#isIsKey()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsKey();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Attribute#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see Ontologicals.Attribute#isReadOnly()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_ReadOnly();

	/**
	 * Returns the meta object for class '{@link Ontologicals.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see Ontologicals.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Reference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Ontologicals.Reference#getName()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Reference#getContaintment <em>Containtment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containtment</em>'.
	 * @see Ontologicals.Reference#getContaintment()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Containtment();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Reference#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see Ontologicals.Reference#getMin()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Min();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Reference#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see Ontologicals.Reference#getMax()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Max();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Reference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see Ontologicals.Reference#getTarget()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Target();

	/**
	 * Returns the meta object for the attribute '{@link Ontologicals.Reference#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opposite</em>'.
	 * @see Ontologicals.Reference#getOpposite()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Opposite();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OntologicalsFactory getOntologicalsFactory();

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
		 * The meta object literal for the '{@link Ontologicals.impl.OntologicalImpl <em>Ontological</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ontologicals.impl.OntologicalImpl
		 * @see Ontologicals.impl.OntologicalsPackageImpl#getOntological()
		 * @generated
		 */
		EClass ONTOLOGICAL = eINSTANCE.getOntological();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL__NAME = eINSTANCE.getOntological_Name();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL__URI = eINSTANCE.getOntological_URI();

		/**
		 * The meta object literal for the '<em><b>External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL__EXTERNAL = eINSTANCE.getOntological_External();

		/**
		 * The meta object literal for the '<em><b>Only Codes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL__ONLY_CODES = eINSTANCE.getOntological_OnlyCodes();

		/**
		 * The meta object literal for the '<em><b>Bluetooth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL__BLUETOOTH = eINSTANCE.getOntological_Bluetooth();

		/**
		 * The meta object literal for the '<em><b>Firebase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL__FIREBASE = eINSTANCE.getOntological_Firebase();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGICAL__CLASSES = eINSTANCE.getOntological_Classes();

		/**
		 * The meta object literal for the '<em><b>Graphic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGICAL__GRAPHIC = eINSTANCE.getOntological_Graphic();

		/**
		 * The meta object literal for the '<em><b>Physic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGICAL__PHYSIC = eINSTANCE.getOntological_Physic();

		/**
		 * The meta object literal for the '<em><b>Gameloop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGICAL__GAMELOOP = eINSTANCE.getOntological_Gameloop();

		/**
		 * The meta object literal for the '{@link Ontologicals.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ontologicals.impl.ClassImpl
		 * @see Ontologicals.impl.OntologicalsPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__ABSTRACT = eINSTANCE.getClass_Abstract();

		/**
		 * The meta object literal for the '<em><b>No SCN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NO_SCN = eINSTANCE.getClass_NoSCN();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ATTRIBUTES = eINSTANCE.getClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__REFERENCES = eINSTANCE.getClass_References();

		/**
		 * The meta object literal for the '<em><b>Superclasses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SUPERCLASSES = eINSTANCE.getClass_Superclasses();

		/**
		 * The meta object literal for the '{@link Ontologicals.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ontologicals.impl.AttributeImpl
		 * @see Ontologicals.impl.OntologicalsPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MIN = eINSTANCE.getAttribute_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MAX = eINSTANCE.getAttribute_Max();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT = eINSTANCE.getAttribute_Default();

		/**
		 * The meta object literal for the '<em><b>Is Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_PARAM = eINSTANCE.getAttribute_IsParam();

		/**
		 * The meta object literal for the '<em><b>Is Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_KEY = eINSTANCE.getAttribute_IsKey();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__READ_ONLY = eINSTANCE.getAttribute_ReadOnly();

		/**
		 * The meta object literal for the '{@link Ontologicals.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ontologicals.impl.ReferenceImpl
		 * @see Ontologicals.impl.OntologicalsPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__NAME = eINSTANCE.getReference_Name();

		/**
		 * The meta object literal for the '<em><b>Containtment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__CONTAINTMENT = eINSTANCE.getReference_Containtment();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__MIN = eINSTANCE.getReference_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__MAX = eINSTANCE.getReference_Max();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__TARGET = eINSTANCE.getReference_Target();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__OPPOSITE = eINSTANCE.getReference_Opposite();

	}

} //OntologicalsPackage
