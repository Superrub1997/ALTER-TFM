/**
 */
package Ontologicals;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ontologicals.Class#getName <em>Name</em>}</li>
 *   <li>{@link Ontologicals.Class#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link Ontologicals.Class#isNoSCN <em>No SCN</em>}</li>
 *   <li>{@link Ontologicals.Class#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link Ontologicals.Class#getReferences <em>References</em>}</li>
 *   <li>{@link Ontologicals.Class#getSuperclasses <em>Superclasses</em>}</li>
 * </ul>
 *
 * @see Ontologicals.OntologicalsPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Ontologicals.OntologicalsPackage#getClass_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Ontologicals.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see Ontologicals.OntologicalsPackage#getClass_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link Ontologicals.Class#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>No SCN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No SCN</em>' attribute.
	 * @see #setNoSCN(boolean)
	 * @see Ontologicals.OntologicalsPackage#getClass_NoSCN()
	 * @model
	 * @generated
	 */
	boolean isNoSCN();

	/**
	 * Sets the value of the '{@link Ontologicals.Class#isNoSCN <em>No SCN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No SCN</em>' attribute.
	 * @see #isNoSCN()
	 * @generated
	 */
	void setNoSCN(boolean value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link Ontologicals.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see Ontologicals.OntologicalsPackage#getClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link Ontologicals.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see Ontologicals.OntologicalsPackage#getClass_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Superclasses</b></em>' reference list.
	 * The list contents are of type {@link Ontologicals.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superclasses</em>' reference list.
	 * @see Ontologicals.OntologicalsPackage#getClass_Superclasses()
	 * @model
	 * @generated
	 */
	EList<Class> getSuperclasses();

} // Class
