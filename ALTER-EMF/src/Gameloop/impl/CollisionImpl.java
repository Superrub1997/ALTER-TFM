/**
 */
package Gameloop.impl;

import Gameloop.Collision;
import Gameloop.GameloopPackage;
import Gameloop.Trigger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gameloop.impl.CollisionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link Gameloop.impl.CollisionImpl#getClassA <em>Class A</em>}</li>
 *   <li>{@link Gameloop.impl.CollisionImpl#getClassB <em>Class B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollisionImpl extends MinimalEObjectImpl.Container implements Collision {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Trigger action;

	/**
	 * The cached value of the '{@link #getClassA() <em>Class A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassA()
	 * @generated
	 * @ordered
	 */
	protected Ontologicals.Class classA;

	/**
	 * The cached value of the '{@link #getClassB() <em>Class B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassB()
	 * @generated
	 * @ordered
	 */
	protected Ontologicals.Class classB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GameloopPackage.Literals.COLLISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (Trigger)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameloopPackage.COLLISION__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Trigger newAction) {
		Trigger oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.COLLISION__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontologicals.Class getClassA() {
		if (classA != null && classA.eIsProxy()) {
			InternalEObject oldClassA = (InternalEObject)classA;
			classA = (Ontologicals.Class)eResolveProxy(oldClassA);
			if (classA != oldClassA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameloopPackage.COLLISION__CLASS_A, oldClassA, classA));
			}
		}
		return classA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontologicals.Class basicGetClassA() {
		return classA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassA(Ontologicals.Class newClassA) {
		Ontologicals.Class oldClassA = classA;
		classA = newClassA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.COLLISION__CLASS_A, oldClassA, classA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontologicals.Class getClassB() {
		if (classB != null && classB.eIsProxy()) {
			InternalEObject oldClassB = (InternalEObject)classB;
			classB = (Ontologicals.Class)eResolveProxy(oldClassB);
			if (classB != oldClassB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameloopPackage.COLLISION__CLASS_B, oldClassB, classB));
			}
		}
		return classB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontologicals.Class basicGetClassB() {
		return classB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassB(Ontologicals.Class newClassB) {
		Ontologicals.Class oldClassB = classB;
		classB = newClassB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.COLLISION__CLASS_B, oldClassB, classB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GameloopPackage.COLLISION__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case GameloopPackage.COLLISION__CLASS_A:
				if (resolve) return getClassA();
				return basicGetClassA();
			case GameloopPackage.COLLISION__CLASS_B:
				if (resolve) return getClassB();
				return basicGetClassB();
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
			case GameloopPackage.COLLISION__ACTION:
				setAction((Trigger)newValue);
				return;
			case GameloopPackage.COLLISION__CLASS_A:
				setClassA((Ontologicals.Class)newValue);
				return;
			case GameloopPackage.COLLISION__CLASS_B:
				setClassB((Ontologicals.Class)newValue);
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
			case GameloopPackage.COLLISION__ACTION:
				setAction((Trigger)null);
				return;
			case GameloopPackage.COLLISION__CLASS_A:
				setClassA((Ontologicals.Class)null);
				return;
			case GameloopPackage.COLLISION__CLASS_B:
				setClassB((Ontologicals.Class)null);
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
			case GameloopPackage.COLLISION__ACTION:
				return action != null;
			case GameloopPackage.COLLISION__CLASS_A:
				return classA != null;
			case GameloopPackage.COLLISION__CLASS_B:
				return classB != null;
		}
		return super.eIsSet(featureID);
	}

} //CollisionImpl
