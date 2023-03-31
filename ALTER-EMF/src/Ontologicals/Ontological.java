/**
 */
package Ontologicals;

import Gameloop.Game;
import Graphics.Graphic;
import Physics.Physic;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontological</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ontologicals.Ontological#getName <em>Name</em>}</li>
 *   <li>{@link Ontologicals.Ontological#getURI <em>URI</em>}</li>
 *   <li>{@link Ontologicals.Ontological#isExternal <em>External</em>}</li>
 *   <li>{@link Ontologicals.Ontological#isOnlyCodes <em>Only Codes</em>}</li>
 *   <li>{@link Ontologicals.Ontological#isBluetooth <em>Bluetooth</em>}</li>
 *   <li>{@link Ontologicals.Ontological#isFirebase <em>Firebase</em>}</li>
 *   <li>{@link Ontologicals.Ontological#getClasses <em>Classes</em>}</li>
 *   <li>{@link Ontologicals.Ontological#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link Ontologicals.Ontological#getPhysic <em>Physic</em>}</li>
 *   <li>{@link Ontologicals.Ontological#getGameloop <em>Gameloop</em>}</li>
 * </ul>
 *
 * @see Ontologicals.OntologicalsPackage#getOntological()
 * @model
 * @generated
 */
public interface Ontological extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Ontologicals.OntologicalsPackage#getOntological_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Ontologicals.Ontological#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see Ontologicals.OntologicalsPackage#getOntological_URI()
	 * @model
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link Ontologicals.Ontological#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see #setExternal(boolean)
	 * @see Ontologicals.OntologicalsPackage#getOntological_External()
	 * @model
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link Ontologicals.Ontological#isExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' attribute.
	 * @see #isExternal()
	 * @generated
	 */
	void setExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Only Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Only Codes</em>' attribute.
	 * @see #setOnlyCodes(boolean)
	 * @see Ontologicals.OntologicalsPackage#getOntological_OnlyCodes()
	 * @model
	 * @generated
	 */
	boolean isOnlyCodes();

	/**
	 * Sets the value of the '{@link Ontologicals.Ontological#isOnlyCodes <em>Only Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Codes</em>' attribute.
	 * @see #isOnlyCodes()
	 * @generated
	 */
	void setOnlyCodes(boolean value);

	/**
	 * Returns the value of the '<em><b>Bluetooth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bluetooth</em>' attribute.
	 * @see #setBluetooth(boolean)
	 * @see Ontologicals.OntologicalsPackage#getOntological_Bluetooth()
	 * @model
	 * @generated
	 */
	boolean isBluetooth();

	/**
	 * Sets the value of the '{@link Ontologicals.Ontological#isBluetooth <em>Bluetooth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bluetooth</em>' attribute.
	 * @see #isBluetooth()
	 * @generated
	 */
	void setBluetooth(boolean value);

	/**
	 * Returns the value of the '<em><b>Firebase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firebase</em>' attribute.
	 * @see #setFirebase(boolean)
	 * @see Ontologicals.OntologicalsPackage#getOntological_Firebase()
	 * @model
	 * @generated
	 */
	boolean isFirebase();

	/**
	 * Sets the value of the '{@link Ontologicals.Ontological#isFirebase <em>Firebase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firebase</em>' attribute.
	 * @see #isFirebase()
	 * @generated
	 */
	void setFirebase(boolean value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link Ontologicals.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see Ontologicals.OntologicalsPackage#getOntological_Classes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Ontologicals.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphic</em>' containment reference.
	 * @see #setGraphic(Graphic)
	 * @see Ontologicals.OntologicalsPackage#getOntological_Graphic()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Graphic getGraphic();

	/**
	 * Sets the value of the '{@link Ontologicals.Ontological#getGraphic <em>Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic</em>' containment reference.
	 * @see #getGraphic()
	 * @generated
	 */
	void setGraphic(Graphic value);

	/**
	 * Returns the value of the '<em><b>Physic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physic</em>' containment reference.
	 * @see #setPhysic(Physic)
	 * @see Ontologicals.OntologicalsPackage#getOntological_Physic()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Physic getPhysic();

	/**
	 * Sets the value of the '{@link Ontologicals.Ontological#getPhysic <em>Physic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physic</em>' containment reference.
	 * @see #getPhysic()
	 * @generated
	 */
	void setPhysic(Physic value);

	/**
	 * Returns the value of the '<em><b>Gameloop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameloop</em>' containment reference.
	 * @see #setGameloop(Game)
	 * @see Ontologicals.OntologicalsPackage#getOntological_Gameloop()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Game getGameloop();

	/**
	 * Sets the value of the '{@link Ontologicals.Ontological#getGameloop <em>Gameloop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gameloop</em>' containment reference.
	 * @see #getGameloop()
	 * @generated
	 */
	void setGameloop(Game value);

} // Ontological
