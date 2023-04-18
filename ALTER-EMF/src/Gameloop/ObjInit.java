/**
 */
package Gameloop;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obj Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gameloop.ObjInit#getName <em>Name</em>}</li>
 *   <li>{@link Gameloop.ObjInit#getPosX <em>Pos X</em>}</li>
 *   <li>{@link Gameloop.ObjInit#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link Gameloop.ObjInit#getPosZ <em>Pos Z</em>}</li>
 *   <li>{@link Gameloop.ObjInit#getRules <em>Rules</em>}</li>
 *   <li>{@link Gameloop.ObjInit#getClass_ <em>Class</em>}</li>
 *   <li>{@link Gameloop.ObjInit#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see Gameloop.GameloopPackage#getObjInit()
 * @model
 * @generated
 */
public interface ObjInit extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Gameloop.GameloopPackage#getObjInit_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Gameloop.ObjInit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos X</em>' attribute.
	 * @see #setPosX(double)
	 * @see Gameloop.GameloopPackage#getObjInit_PosX()
	 * @model required="true"
	 * @generated
	 */
	double getPosX();

	/**
	 * Sets the value of the '{@link Gameloop.ObjInit#getPosX <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos X</em>' attribute.
	 * @see #getPosX()
	 * @generated
	 */
	void setPosX(double value);

	/**
	 * Returns the value of the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Y</em>' attribute.
	 * @see #setPosY(double)
	 * @see Gameloop.GameloopPackage#getObjInit_PosY()
	 * @model required="true"
	 * @generated
	 */
	double getPosY();

	/**
	 * Sets the value of the '{@link Gameloop.ObjInit#getPosY <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Y</em>' attribute.
	 * @see #getPosY()
	 * @generated
	 */
	void setPosY(double value);

	/**
	 * Returns the value of the '<em><b>Pos Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Z</em>' attribute.
	 * @see #setPosZ(double)
	 * @see Gameloop.GameloopPackage#getObjInit_PosZ()
	 * @model required="true"
	 * @generated
	 */
	double getPosZ();

	/**
	 * Sets the value of the '{@link Gameloop.ObjInit#getPosZ <em>Pos Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Z</em>' attribute.
	 * @see #getPosZ()
	 * @generated
	 */
	void setPosZ(double value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link Gameloop.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see Gameloop.GameloopPackage#getObjInit_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(Ontologicals.Class)
	 * @see Gameloop.GameloopPackage#getObjInit_Class()
	 * @model required="true"
	 * @generated
	 */
	Ontologicals.Class getClass_();

	/**
	 * Sets the value of the '{@link Gameloop.ObjInit#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(Ontologicals.Class value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link Gameloop.ObjAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see Gameloop.GameloopPackage#getObjInit_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjAttribute> getAttribute();

} // ObjInit
