/**
 */
package Physics.impl;

import Physics.BitMasks;
import Physics.PhysicsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bit Masks</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Physics.impl.BitMasksImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link Physics.impl.BitMasksImpl#getCollision <em>Collision</em>}</li>
 *   <li>{@link Physics.impl.BitMasksImpl#getContactTest <em>Contact Test</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BitMasksImpl extends MinimalEObjectImpl.Container implements BitMasks {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final int CATEGORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected int category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollision() <em>Collision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollision()
	 * @generated
	 * @ordered
	 */
	protected static final int COLLISION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCollision() <em>Collision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollision()
	 * @generated
	 * @ordered
	 */
	protected int collision = COLLISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactTest() <em>Contact Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactTest()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTACT_TEST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContactTest() <em>Contact Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactTest()
	 * @generated
	 * @ordered
	 */
	protected int contactTest = CONTACT_TEST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitMasksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhysicsPackage.Literals.BIT_MASKS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(int newCategory) {
		int oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhysicsPackage.BIT_MASKS__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCollision() {
		return collision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollision(int newCollision) {
		int oldCollision = collision;
		collision = newCollision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhysicsPackage.BIT_MASKS__COLLISION, oldCollision, collision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getContactTest() {
		return contactTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactTest(int newContactTest) {
		int oldContactTest = contactTest;
		contactTest = newContactTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhysicsPackage.BIT_MASKS__CONTACT_TEST, oldContactTest, contactTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhysicsPackage.BIT_MASKS__CATEGORY:
				return getCategory();
			case PhysicsPackage.BIT_MASKS__COLLISION:
				return getCollision();
			case PhysicsPackage.BIT_MASKS__CONTACT_TEST:
				return getContactTest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PhysicsPackage.BIT_MASKS__CATEGORY:
				setCategory((Integer)newValue);
				return;
			case PhysicsPackage.BIT_MASKS__COLLISION:
				setCollision((Integer)newValue);
				return;
			case PhysicsPackage.BIT_MASKS__CONTACT_TEST:
				setContactTest((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PhysicsPackage.BIT_MASKS__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case PhysicsPackage.BIT_MASKS__COLLISION:
				setCollision(COLLISION_EDEFAULT);
				return;
			case PhysicsPackage.BIT_MASKS__CONTACT_TEST:
				setContactTest(CONTACT_TEST_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PhysicsPackage.BIT_MASKS__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case PhysicsPackage.BIT_MASKS__COLLISION:
				return collision != COLLISION_EDEFAULT;
			case PhysicsPackage.BIT_MASKS__CONTACT_TEST:
				return contactTest != CONTACT_TEST_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (category: ");
		result.append(category);
		result.append(", collision: ");
		result.append(collision);
		result.append(", contactTest: ");
		result.append(contactTest);
		result.append(')');
		return result.toString();
	}

} //BitMasksImpl
