/**
 */
package Gameloop;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gameloop.AttributeValue#getClass_ <em>Class</em>}</li>
 *   <li>{@link Gameloop.AttributeValue#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see Gameloop.GameloopPackage#getAttributeValue()
 * @model
 * @generated
 */
public interface AttributeValue extends Value {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see Gameloop.GameloopPackage#getAttributeValue_Class()
	 * @model required="true"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link Gameloop.AttributeValue#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #setAttribute(String)
	 * @see Gameloop.GameloopPackage#getAttributeValue_Attribute()
	 * @model required="true"
	 * @generated
	 */
	String getAttribute();

	/**
	 * Sets the value of the '{@link Gameloop.AttributeValue#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(String value);

} // AttributeValue
