/**
 */
package Physics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Masks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Physics.BitMasks#getCategory <em>Category</em>}</li>
 *   <li>{@link Physics.BitMasks#getCollision <em>Collision</em>}</li>
 *   <li>{@link Physics.BitMasks#getContactTest <em>Contact Test</em>}</li>
 * </ul>
 *
 * @see Physics.PhysicsPackage#getBitMasks()
 * @model
 * @generated
 */
public interface BitMasks extends EObject {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(int)
	 * @see Physics.PhysicsPackage#getBitMasks_Category()
	 * @model required="true"
	 * @generated
	 */
	int getCategory();

	/**
	 * Sets the value of the '{@link Physics.BitMasks#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(int value);

	/**
	 * Returns the value of the '<em><b>Collision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collision</em>' attribute.
	 * @see #setCollision(int)
	 * @see Physics.PhysicsPackage#getBitMasks_Collision()
	 * @model required="true"
	 * @generated
	 */
	int getCollision();

	/**
	 * Sets the value of the '{@link Physics.BitMasks#getCollision <em>Collision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collision</em>' attribute.
	 * @see #getCollision()
	 * @generated
	 */
	void setCollision(int value);

	/**
	 * Returns the value of the '<em><b>Contact Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Test</em>' attribute.
	 * @see #setContactTest(int)
	 * @see Physics.PhysicsPackage#getBitMasks_ContactTest()
	 * @model required="true"
	 * @generated
	 */
	int getContactTest();

	/**
	 * Sets the value of the '{@link Physics.BitMasks#getContactTest <em>Contact Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Test</em>' attribute.
	 * @see #getContactTest()
	 * @generated
	 */
	void setContactTest(int value);

} // BitMasks
