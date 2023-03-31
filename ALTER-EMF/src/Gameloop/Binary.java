/**
 */
package Gameloop;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gameloop.Binary#getOp <em>Op</em>}</li>
 *   <li>{@link Gameloop.Binary#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see Gameloop.GameloopPackage#getBinary()
 * @model
 * @generated
 */
public interface Binary extends LogicOp {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link Gameloop.LogicOps}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see Gameloop.LogicOps
	 * @see #setOp(LogicOps)
	 * @see Gameloop.GameloopPackage#getBinary_Op()
	 * @model required="true"
	 * @generated
	 */
	LogicOps getOp();

	/**
	 * Sets the value of the '{@link Gameloop.Binary#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see Gameloop.LogicOps
	 * @see #getOp()
	 * @generated
	 */
	void setOp(LogicOps value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Condition)
	 * @see Gameloop.GameloopPackage#getBinary_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getRight();

	/**
	 * Sets the value of the '{@link Gameloop.Binary#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Condition value);

} // Binary
