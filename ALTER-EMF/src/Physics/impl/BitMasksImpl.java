/**
 */
package Physics.impl;

import Physics.BitMasks;
import Physics.PhysicsPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bit Masks</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Physics.impl.BitMasksImpl#getCollision <em>Collision</em>}</li>
 *   <li>{@link Physics.impl.BitMasksImpl#getContact <em>Contact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BitMasksImpl extends MinimalEObjectImpl.Container implements BitMasks {
	/**
	 * The cached value of the '{@link #getCollision() <em>Collision</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollision()
	 * @generated
	 * @ordered
	 */
	protected EList<Ontologicals.Class> collision;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<Ontologicals.Class> contact;

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
	public EList<Ontologicals.Class> getCollision() {
		if (collision == null) {
			collision = new EObjectResolvingEList<Ontologicals.Class>(Ontologicals.Class.class, this, PhysicsPackage.BIT_MASKS__COLLISION);
		}
		return collision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ontologicals.Class> getContact() {
		if (contact == null) {
			contact = new EObjectResolvingEList<Ontologicals.Class>(Ontologicals.Class.class, this, PhysicsPackage.BIT_MASKS__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhysicsPackage.BIT_MASKS__COLLISION:
				return getCollision();
			case PhysicsPackage.BIT_MASKS__CONTACT:
				return getContact();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PhysicsPackage.BIT_MASKS__COLLISION:
				getCollision().clear();
				getCollision().addAll((Collection<? extends Ontologicals.Class>)newValue);
				return;
			case PhysicsPackage.BIT_MASKS__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends Ontologicals.Class>)newValue);
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
			case PhysicsPackage.BIT_MASKS__COLLISION:
				getCollision().clear();
				return;
			case PhysicsPackage.BIT_MASKS__CONTACT:
				getContact().clear();
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
			case PhysicsPackage.BIT_MASKS__COLLISION:
				return collision != null && !collision.isEmpty();
			case PhysicsPackage.BIT_MASKS__CONTACT:
				return contact != null && !contact.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BitMasksImpl
