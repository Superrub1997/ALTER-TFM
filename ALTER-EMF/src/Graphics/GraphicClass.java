/**
 */
package Graphics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphic Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Graphics.GraphicClass#getVersions <em>Versions</em>}</li>
 *   <li>{@link Graphics.GraphicClass#getVname <em>Vname</em>}</li>
 *   <li>{@link Graphics.GraphicClass#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link Graphics.GraphicClass#getConnections <em>Connections</em>}</li>
 *   <li>{@link Graphics.GraphicClass#getShowAttributes <em>Show Attributes</em>}</li>
 *   <li>{@link Graphics.GraphicClass#getMaterialAttributes <em>Material Attributes</em>}</li>
 *   <li>{@link Graphics.GraphicClass#getOntoClass <em>Onto Class</em>}</li>
 * </ul>
 *
 * @see Graphics.GraphicsPackage#getGraphicClass()
 * @model
 * @generated
 */
public interface GraphicClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference.
	 * @see #setVersions(Versions)
	 * @see Graphics.GraphicsPackage#getGraphicClass_Versions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Versions getVersions();

	/**
	 * Sets the value of the '{@link Graphics.GraphicClass#getVersions <em>Versions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versions</em>' containment reference.
	 * @see #getVersions()
	 * @generated
	 */
	void setVersions(Versions value);

	/**
	 * Returns the value of the '<em><b>Vname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vname</em>' containment reference.
	 * @see #setVname(VersionName)
	 * @see Graphics.GraphicsPackage#getGraphicClass_Vname()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VersionName getVname();

	/**
	 * Sets the value of the '{@link Graphics.GraphicClass#getVname <em>Vname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vname</em>' containment reference.
	 * @see #getVname()
	 * @generated
	 */
	void setVname(VersionName value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(Constraints)
	 * @see Graphics.GraphicsPackage#getGraphicClass_Constraints()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constraints getConstraints();

	/**
	 * Sets the value of the '{@link Graphics.GraphicClass#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Constraints value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link Graphics.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see Graphics.GraphicsPackage#getGraphicClass_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Show Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Attributes</em>' attribute list.
	 * @see Graphics.GraphicsPackage#getGraphicClass_ShowAttributes()
	 * @model
	 * @generated
	 */
	EList<String> getShowAttributes();

	/**
	 * Returns the value of the '<em><b>Material Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Attributes</em>' attribute list.
	 * @see Graphics.GraphicsPackage#getGraphicClass_MaterialAttributes()
	 * @model
	 * @generated
	 */
	EList<String> getMaterialAttributes();

	/**
	 * Returns the value of the '<em><b>Onto Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onto Class</em>' reference.
	 * @see #setOntoClass(Ontologicals.Class)
	 * @see Graphics.GraphicsPackage#getGraphicClass_OntoClass()
	 * @model required="true"
	 * @generated
	 */
	Ontologicals.Class getOntoClass();

	/**
	 * Sets the value of the '{@link Graphics.GraphicClass#getOntoClass <em>Onto Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onto Class</em>' reference.
	 * @see #getOntoClass()
	 * @generated
	 */
	void setOntoClass(Ontologicals.Class value);

} // GraphicClass
