/**
 */
package Gameloop.impl;

import Gameloop.GameloopPackage;
import Gameloop.ObjInit;

import Gameloop.Rule;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Obj Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gameloop.impl.ObjInitImpl#getName <em>Name</em>}</li>
 *   <li>{@link Gameloop.impl.ObjInitImpl#getPosX <em>Pos X</em>}</li>
 *   <li>{@link Gameloop.impl.ObjInitImpl#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link Gameloop.impl.ObjInitImpl#getPosZ <em>Pos Z</em>}</li>
 *   <li>{@link Gameloop.impl.ObjInitImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link Gameloop.impl.ObjInitImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjInitImpl extends MinimalEObjectImpl.Container implements ObjInit {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosX() <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosX()
	 * @generated
	 * @ordered
	 */
	protected static final double POS_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPosX() <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosX()
	 * @generated
	 * @ordered
	 */
	protected double posX = POS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosY() <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosY()
	 * @generated
	 * @ordered
	 */
	protected static final double POS_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPosY() <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosY()
	 * @generated
	 * @ordered
	 */
	protected double posY = POS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosZ() <em>Pos Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosZ()
	 * @generated
	 * @ordered
	 */
	protected static final double POS_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPosZ() <em>Pos Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosZ()
	 * @generated
	 * @ordered
	 */
	protected double posZ = POS_Z_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected Ontologicals.Class class_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjInitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GameloopPackage.Literals.OBJ_INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.OBJ_INIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPosX() {
		return posX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosX(double newPosX) {
		double oldPosX = posX;
		posX = newPosX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.OBJ_INIT__POS_X, oldPosX, posX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPosY() {
		return posY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosY(double newPosY) {
		double oldPosY = posY;
		posY = newPosY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.OBJ_INIT__POS_Y, oldPosY, posY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPosZ() {
		return posZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosZ(double newPosZ) {
		double oldPosZ = posZ;
		posZ = newPosZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.OBJ_INIT__POS_Z, oldPosZ, posZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, GameloopPackage.OBJ_INIT__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontologicals.Class getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject)class_;
			class_ = (Ontologicals.Class)eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameloopPackage.OBJ_INIT__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontologicals.Class basicGetClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(Ontologicals.Class newClass) {
		Ontologicals.Class oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.OBJ_INIT__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GameloopPackage.OBJ_INIT__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GameloopPackage.OBJ_INIT__NAME:
				return getName();
			case GameloopPackage.OBJ_INIT__POS_X:
				return getPosX();
			case GameloopPackage.OBJ_INIT__POS_Y:
				return getPosY();
			case GameloopPackage.OBJ_INIT__POS_Z:
				return getPosZ();
			case GameloopPackage.OBJ_INIT__RULES:
				return getRules();
			case GameloopPackage.OBJ_INIT__CLASS:
				if (resolve) return getClass_();
				return basicGetClass();
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
			case GameloopPackage.OBJ_INIT__NAME:
				setName((String)newValue);
				return;
			case GameloopPackage.OBJ_INIT__POS_X:
				setPosX((Double)newValue);
				return;
			case GameloopPackage.OBJ_INIT__POS_Y:
				setPosY((Double)newValue);
				return;
			case GameloopPackage.OBJ_INIT__POS_Z:
				setPosZ((Double)newValue);
				return;
			case GameloopPackage.OBJ_INIT__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case GameloopPackage.OBJ_INIT__CLASS:
				setClass((Ontologicals.Class)newValue);
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
			case GameloopPackage.OBJ_INIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GameloopPackage.OBJ_INIT__POS_X:
				setPosX(POS_X_EDEFAULT);
				return;
			case GameloopPackage.OBJ_INIT__POS_Y:
				setPosY(POS_Y_EDEFAULT);
				return;
			case GameloopPackage.OBJ_INIT__POS_Z:
				setPosZ(POS_Z_EDEFAULT);
				return;
			case GameloopPackage.OBJ_INIT__RULES:
				getRules().clear();
				return;
			case GameloopPackage.OBJ_INIT__CLASS:
				setClass((Ontologicals.Class)null);
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
			case GameloopPackage.OBJ_INIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GameloopPackage.OBJ_INIT__POS_X:
				return posX != POS_X_EDEFAULT;
			case GameloopPackage.OBJ_INIT__POS_Y:
				return posY != POS_Y_EDEFAULT;
			case GameloopPackage.OBJ_INIT__POS_Z:
				return posZ != POS_Z_EDEFAULT;
			case GameloopPackage.OBJ_INIT__RULES:
				return rules != null && !rules.isEmpty();
			case GameloopPackage.OBJ_INIT__CLASS:
				return class_ != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", posX: ");
		result.append(posX);
		result.append(", posY: ");
		result.append(posY);
		result.append(", posZ: ");
		result.append(posZ);
		result.append(')');
		return result.toString();
	}

} //ObjInitImpl
