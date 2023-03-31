/**
 */
package Graphics;

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
 * @see Graphics.GraphicsFactory
 * @model kind="package"
 * @generated
 */
public interface GraphicsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Graphics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://graphics/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Graphics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphicsPackage eINSTANCE = Graphics.impl.GraphicsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Graphics.impl.GraphicImpl <em>Graphic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Graphics.impl.GraphicImpl
	 * @see Graphics.impl.GraphicsPackageImpl#getGraphic()
	 * @generated
	 */
	int GRAPHIC = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC__CLASSES = 0;

	/**
	 * The number of structural features of the '<em>Graphic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Graphic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Graphics.impl.GraphicClassImpl <em>Graphic Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Graphics.impl.GraphicClassImpl
	 * @see Graphics.impl.GraphicsPackageImpl#getGraphicClass()
	 * @generated
	 */
	int GRAPHIC_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_CLASS__VERSIONS = 0;

	/**
	 * The feature id for the '<em><b>Vname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_CLASS__VNAME = 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_CLASS__CONSTRAINTS = 2;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_CLASS__CONNECTIONS = 3;

	/**
	 * The feature id for the '<em><b>Show Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_CLASS__SHOW_ATTRIBUTES = 4;

	/**
	 * The feature id for the '<em><b>Material Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_CLASS__MATERIAL_ATTRIBUTES = 5;

	/**
	 * The feature id for the '<em><b>Onto Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_CLASS__ONTO_CLASS = 6;

	/**
	 * The number of structural features of the '<em>Graphic Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_CLASS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Graphic Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Graphics.impl.VersionsImpl <em>Versions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Graphics.impl.VersionsImpl
	 * @see Graphics.impl.GraphicsPackageImpl#getVersions()
	 * @generated
	 */
	int VERSIONS = 2;

	/**
	 * The feature id for the '<em><b>V1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONS__V1 = 0;

	/**
	 * The feature id for the '<em><b>V2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONS__V2 = 1;

	/**
	 * The feature id for the '<em><b>V3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONS__V3 = 2;

	/**
	 * The number of structural features of the '<em>Versions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Versions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Graphics.impl.VersionNameImpl <em>Version Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Graphics.impl.VersionNameImpl
	 * @see Graphics.impl.GraphicsPackageImpl#getVersionName()
	 * @generated
	 */
	int VERSION_NAME = 3;

	/**
	 * The feature id for the '<em><b>V1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_NAME__V1 = 0;

	/**
	 * The feature id for the '<em><b>V2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_NAME__V2 = 1;

	/**
	 * The feature id for the '<em><b>V3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_NAME__V3 = 2;

	/**
	 * The number of structural features of the '<em>Version Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_NAME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Version Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Graphics.impl.ConstraintsImpl <em>Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Graphics.impl.ConstraintsImpl
	 * @see Graphics.impl.GraphicsPackageImpl#getConstraints()
	 * @generated
	 */
	int CONSTRAINTS = 4;

	/**
	 * The feature id for the '<em><b>Planes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__PLANES = 0;

	/**
	 * The feature id for the '<em><b>Ilumination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__ILUMINATION = 1;

	/**
	 * The feature id for the '<em><b>Size Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__SIZE_MAX = 2;

	/**
	 * The feature id for the '<em><b>Size Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__SIZE_MIN = 3;

	/**
	 * The feature id for the '<em><b>Size Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__SIZE_INIT = 4;

	/**
	 * The feature id for the '<em><b>Overlapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__OVERLAPPING = 5;

	/**
	 * The feature id for the '<em><b>XTo Origin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__XTO_ORIGIN_POS = 6;

	/**
	 * The feature id for the '<em><b>YTo Origin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__YTO_ORIGIN_POS = 7;

	/**
	 * The feature id for the '<em><b>ZTo Origin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__ZTO_ORIGIN_POS = 8;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__ROTATION = 9;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__TEXT = 10;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__TEXT_COLOR = 11;

	/**
	 * The number of structural features of the '<em>Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Graphics.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Graphics.impl.ConnectionImpl
	 * @see Graphics.impl.GraphicsPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TEXT_COLOR = 3;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DECORATOR = 4;

	/**
	 * The feature id for the '<em><b>Decorator Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DECORATOR_POS = 5;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PATTERN = 6;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__WIDTH = 7;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__POSITION = 8;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Graphics.Planes <em>Planes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Graphics.Planes
	 * @see Graphics.impl.GraphicsPackageImpl#getPlanes()
	 * @generated
	 */
	int PLANES = 6;


	/**
	 * Returns the meta object for class '{@link Graphics.Graphic <em>Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic</em>'.
	 * @see Graphics.Graphic
	 * @generated
	 */
	EClass getGraphic();

	/**
	 * Returns the meta object for the containment reference list '{@link Graphics.Graphic#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see Graphics.Graphic#getClasses()
	 * @see #getGraphic()
	 * @generated
	 */
	EReference getGraphic_Classes();

	/**
	 * Returns the meta object for class '{@link Graphics.GraphicClass <em>Graphic Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic Class</em>'.
	 * @see Graphics.GraphicClass
	 * @generated
	 */
	EClass getGraphicClass();

	/**
	 * Returns the meta object for the containment reference '{@link Graphics.GraphicClass#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Versions</em>'.
	 * @see Graphics.GraphicClass#getVersions()
	 * @see #getGraphicClass()
	 * @generated
	 */
	EReference getGraphicClass_Versions();

	/**
	 * Returns the meta object for the containment reference '{@link Graphics.GraphicClass#getVname <em>Vname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vname</em>'.
	 * @see Graphics.GraphicClass#getVname()
	 * @see #getGraphicClass()
	 * @generated
	 */
	EReference getGraphicClass_Vname();

	/**
	 * Returns the meta object for the containment reference '{@link Graphics.GraphicClass#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see Graphics.GraphicClass#getConstraints()
	 * @see #getGraphicClass()
	 * @generated
	 */
	EReference getGraphicClass_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Graphics.GraphicClass#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see Graphics.GraphicClass#getConnections()
	 * @see #getGraphicClass()
	 * @generated
	 */
	EReference getGraphicClass_Connections();

	/**
	 * Returns the meta object for the attribute list '{@link Graphics.GraphicClass#getShowAttributes <em>Show Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Show Attributes</em>'.
	 * @see Graphics.GraphicClass#getShowAttributes()
	 * @see #getGraphicClass()
	 * @generated
	 */
	EAttribute getGraphicClass_ShowAttributes();

	/**
	 * Returns the meta object for the attribute list '{@link Graphics.GraphicClass#getMaterialAttributes <em>Material Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Material Attributes</em>'.
	 * @see Graphics.GraphicClass#getMaterialAttributes()
	 * @see #getGraphicClass()
	 * @generated
	 */
	EAttribute getGraphicClass_MaterialAttributes();

	/**
	 * Returns the meta object for the reference '{@link Graphics.GraphicClass#getOntoClass <em>Onto Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Onto Class</em>'.
	 * @see Graphics.GraphicClass#getOntoClass()
	 * @see #getGraphicClass()
	 * @generated
	 */
	EReference getGraphicClass_OntoClass();

	/**
	 * Returns the meta object for class '{@link Graphics.Versions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versions</em>'.
	 * @see Graphics.Versions
	 * @generated
	 */
	EClass getVersions();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Versions#getV1 <em>V1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V1</em>'.
	 * @see Graphics.Versions#getV1()
	 * @see #getVersions()
	 * @generated
	 */
	EAttribute getVersions_V1();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Versions#getV2 <em>V2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V2</em>'.
	 * @see Graphics.Versions#getV2()
	 * @see #getVersions()
	 * @generated
	 */
	EAttribute getVersions_V2();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Versions#getV3 <em>V3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V3</em>'.
	 * @see Graphics.Versions#getV3()
	 * @see #getVersions()
	 * @generated
	 */
	EAttribute getVersions_V3();

	/**
	 * Returns the meta object for class '{@link Graphics.VersionName <em>Version Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Name</em>'.
	 * @see Graphics.VersionName
	 * @generated
	 */
	EClass getVersionName();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.VersionName#getV1 <em>V1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V1</em>'.
	 * @see Graphics.VersionName#getV1()
	 * @see #getVersionName()
	 * @generated
	 */
	EAttribute getVersionName_V1();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.VersionName#getV2 <em>V2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V2</em>'.
	 * @see Graphics.VersionName#getV2()
	 * @see #getVersionName()
	 * @generated
	 */
	EAttribute getVersionName_V2();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.VersionName#getV3 <em>V3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V3</em>'.
	 * @see Graphics.VersionName#getV3()
	 * @see #getVersionName()
	 * @generated
	 */
	EAttribute getVersionName_V3();

	/**
	 * Returns the meta object for class '{@link Graphics.Constraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints</em>'.
	 * @see Graphics.Constraints
	 * @generated
	 */
	EClass getConstraints();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Constraints#getPlanes <em>Planes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Planes</em>'.
	 * @see Graphics.Constraints#getPlanes()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_Planes();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Constraints#getIlumination <em>Ilumination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ilumination</em>'.
	 * @see Graphics.Constraints#getIlumination()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_Ilumination();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Constraints#getSizeMax <em>Size Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Max</em>'.
	 * @see Graphics.Constraints#getSizeMax()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_SizeMax();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Constraints#getSizeMin <em>Size Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Min</em>'.
	 * @see Graphics.Constraints#getSizeMin()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_SizeMin();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Constraints#getSizeInit <em>Size Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Init</em>'.
	 * @see Graphics.Constraints#getSizeInit()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_SizeInit();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Constraints#isOverlapping <em>Overlapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overlapping</em>'.
	 * @see Graphics.Constraints#isOverlapping()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_Overlapping();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Constraints#getXToOriginPos <em>XTo Origin Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XTo Origin Pos</em>'.
	 * @see Graphics.Constraints#getXToOriginPos()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_XToOriginPos();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Constraints#getYToOriginPos <em>YTo Origin Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YTo Origin Pos</em>'.
	 * @see Graphics.Constraints#getYToOriginPos()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_YToOriginPos();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Constraints#getZToOriginPos <em>ZTo Origin Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZTo Origin Pos</em>'.
	 * @see Graphics.Constraints#getZToOriginPos()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_ZToOriginPos();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Constraints#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see Graphics.Constraints#getRotation()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Constraints#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see Graphics.Constraints#getText()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_Text();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Constraints#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Color</em>'.
	 * @see Graphics.Constraints#getTextColor()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_TextColor();

	/**
	 * Returns the meta object for class '{@link Graphics.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see Graphics.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Graphics.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Connection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Graphics.Connection#getType()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Type();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Connection#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see Graphics.Connection#getColor()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Color();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Connection#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Color</em>'.
	 * @see Graphics.Connection#getTextColor()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Connection#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decorator</em>'.
	 * @see Graphics.Connection#getDecorator()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Decorator();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Connection#getDecoratorPos <em>Decorator Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decorator Pos</em>'.
	 * @see Graphics.Connection#getDecoratorPos()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_DecoratorPos();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Connection#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see Graphics.Connection#getPattern()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Connection#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see Graphics.Connection#getWidth()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Width();

	/**
	 * Returns the meta object for the attribute '{@link Graphics.Connection#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see Graphics.Connection#getPosition()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Position();

	/**
	 * Returns the meta object for enum '{@link Graphics.Planes <em>Planes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Planes</em>'.
	 * @see Graphics.Planes
	 * @generated
	 */
	EEnum getPlanes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphicsFactory getGraphicsFactory();

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
		 * The meta object literal for the '{@link Graphics.impl.GraphicImpl <em>Graphic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Graphics.impl.GraphicImpl
		 * @see Graphics.impl.GraphicsPackageImpl#getGraphic()
		 * @generated
		 */
		EClass GRAPHIC = eINSTANCE.getGraphic();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC__CLASSES = eINSTANCE.getGraphic_Classes();

		/**
		 * The meta object literal for the '{@link Graphics.impl.GraphicClassImpl <em>Graphic Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Graphics.impl.GraphicClassImpl
		 * @see Graphics.impl.GraphicsPackageImpl#getGraphicClass()
		 * @generated
		 */
		EClass GRAPHIC_CLASS = eINSTANCE.getGraphicClass();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_CLASS__VERSIONS = eINSTANCE.getGraphicClass_Versions();

		/**
		 * The meta object literal for the '<em><b>Vname</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_CLASS__VNAME = eINSTANCE.getGraphicClass_Vname();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_CLASS__CONSTRAINTS = eINSTANCE.getGraphicClass_Constraints();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_CLASS__CONNECTIONS = eINSTANCE.getGraphicClass_Connections();

		/**
		 * The meta object literal for the '<em><b>Show Attributes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_CLASS__SHOW_ATTRIBUTES = eINSTANCE.getGraphicClass_ShowAttributes();

		/**
		 * The meta object literal for the '<em><b>Material Attributes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_CLASS__MATERIAL_ATTRIBUTES = eINSTANCE.getGraphicClass_MaterialAttributes();

		/**
		 * The meta object literal for the '<em><b>Onto Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_CLASS__ONTO_CLASS = eINSTANCE.getGraphicClass_OntoClass();

		/**
		 * The meta object literal for the '{@link Graphics.impl.VersionsImpl <em>Versions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Graphics.impl.VersionsImpl
		 * @see Graphics.impl.GraphicsPackageImpl#getVersions()
		 * @generated
		 */
		EClass VERSIONS = eINSTANCE.getVersions();

		/**
		 * The meta object literal for the '<em><b>V1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONS__V1 = eINSTANCE.getVersions_V1();

		/**
		 * The meta object literal for the '<em><b>V2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONS__V2 = eINSTANCE.getVersions_V2();

		/**
		 * The meta object literal for the '<em><b>V3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONS__V3 = eINSTANCE.getVersions_V3();

		/**
		 * The meta object literal for the '{@link Graphics.impl.VersionNameImpl <em>Version Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Graphics.impl.VersionNameImpl
		 * @see Graphics.impl.GraphicsPackageImpl#getVersionName()
		 * @generated
		 */
		EClass VERSION_NAME = eINSTANCE.getVersionName();

		/**
		 * The meta object literal for the '<em><b>V1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_NAME__V1 = eINSTANCE.getVersionName_V1();

		/**
		 * The meta object literal for the '<em><b>V2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_NAME__V2 = eINSTANCE.getVersionName_V2();

		/**
		 * The meta object literal for the '<em><b>V3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_NAME__V3 = eINSTANCE.getVersionName_V3();

		/**
		 * The meta object literal for the '{@link Graphics.impl.ConstraintsImpl <em>Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Graphics.impl.ConstraintsImpl
		 * @see Graphics.impl.GraphicsPackageImpl#getConstraints()
		 * @generated
		 */
		EClass CONSTRAINTS = eINSTANCE.getConstraints();

		/**
		 * The meta object literal for the '<em><b>Planes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__PLANES = eINSTANCE.getConstraints_Planes();

		/**
		 * The meta object literal for the '<em><b>Ilumination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__ILUMINATION = eINSTANCE.getConstraints_Ilumination();

		/**
		 * The meta object literal for the '<em><b>Size Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__SIZE_MAX = eINSTANCE.getConstraints_SizeMax();

		/**
		 * The meta object literal for the '<em><b>Size Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__SIZE_MIN = eINSTANCE.getConstraints_SizeMin();

		/**
		 * The meta object literal for the '<em><b>Size Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__SIZE_INIT = eINSTANCE.getConstraints_SizeInit();

		/**
		 * The meta object literal for the '<em><b>Overlapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__OVERLAPPING = eINSTANCE.getConstraints_Overlapping();

		/**
		 * The meta object literal for the '<em><b>XTo Origin Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__XTO_ORIGIN_POS = eINSTANCE.getConstraints_XToOriginPos();

		/**
		 * The meta object literal for the '<em><b>YTo Origin Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__YTO_ORIGIN_POS = eINSTANCE.getConstraints_YToOriginPos();

		/**
		 * The meta object literal for the '<em><b>ZTo Origin Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__ZTO_ORIGIN_POS = eINSTANCE.getConstraints_ZToOriginPos();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__ROTATION = eINSTANCE.getConstraints_Rotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__TEXT = eINSTANCE.getConstraints_Text();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__TEXT_COLOR = eINSTANCE.getConstraints_TextColor();

		/**
		 * The meta object literal for the '{@link Graphics.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Graphics.impl.ConnectionImpl
		 * @see Graphics.impl.GraphicsPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__TYPE = eINSTANCE.getConnection_Type();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__COLOR = eINSTANCE.getConnection_Color();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__TEXT_COLOR = eINSTANCE.getConnection_TextColor();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__DECORATOR = eINSTANCE.getConnection_Decorator();

		/**
		 * The meta object literal for the '<em><b>Decorator Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__DECORATOR_POS = eINSTANCE.getConnection_DecoratorPos();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__PATTERN = eINSTANCE.getConnection_Pattern();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__WIDTH = eINSTANCE.getConnection_Width();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__POSITION = eINSTANCE.getConnection_Position();

		/**
		 * The meta object literal for the '{@link Graphics.Planes <em>Planes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Graphics.Planes
		 * @see Graphics.impl.GraphicsPackageImpl#getPlanes()
		 * @generated
		 */
		EEnum PLANES = eINSTANCE.getPlanes();

	}

} //GraphicsPackage
