/**
 */
package Graphics.impl;

import Graphics.GraphicsPackage;
import Graphics.Versions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Versions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Graphics.impl.VersionsImpl#getV1 <em>V1</em>}</li>
 *   <li>{@link Graphics.impl.VersionsImpl#getV2 <em>V2</em>}</li>
 *   <li>{@link Graphics.impl.VersionsImpl#getV3 <em>V3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionsImpl extends MinimalEObjectImpl.Container implements Versions {
	/**
	 * The default value of the '{@link #getV1() <em>V1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV1()
	 * @generated
	 * @ordered
	 */
	protected static final String V1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getV1() <em>V1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV1()
	 * @generated
	 * @ordered
	 */
	protected String v1 = V1_EDEFAULT;

	/**
	 * The default value of the '{@link #getV2() <em>V2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV2()
	 * @generated
	 * @ordered
	 */
	protected static final String V2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getV2() <em>V2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV2()
	 * @generated
	 * @ordered
	 */
	protected String v2 = V2_EDEFAULT;

	/**
	 * The default value of the '{@link #getV3() <em>V3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV3()
	 * @generated
	 * @ordered
	 */
	protected static final String V3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getV3() <em>V3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV3()
	 * @generated
	 * @ordered
	 */
	protected String v3 = V3_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicsPackage.Literals.VERSIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getV1() {
		return v1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV1(String newV1) {
		String oldV1 = v1;
		v1 = newV1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicsPackage.VERSIONS__V1, oldV1, v1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getV2() {
		return v2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV2(String newV2) {
		String oldV2 = v2;
		v2 = newV2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicsPackage.VERSIONS__V2, oldV2, v2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getV3() {
		return v3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV3(String newV3) {
		String oldV3 = v3;
		v3 = newV3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicsPackage.VERSIONS__V3, oldV3, v3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphicsPackage.VERSIONS__V1:
				return getV1();
			case GraphicsPackage.VERSIONS__V2:
				return getV2();
			case GraphicsPackage.VERSIONS__V3:
				return getV3();
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
			case GraphicsPackage.VERSIONS__V1:
				setV1((String)newValue);
				return;
			case GraphicsPackage.VERSIONS__V2:
				setV2((String)newValue);
				return;
			case GraphicsPackage.VERSIONS__V3:
				setV3((String)newValue);
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
			case GraphicsPackage.VERSIONS__V1:
				setV1(V1_EDEFAULT);
				return;
			case GraphicsPackage.VERSIONS__V2:
				setV2(V2_EDEFAULT);
				return;
			case GraphicsPackage.VERSIONS__V3:
				setV3(V3_EDEFAULT);
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
			case GraphicsPackage.VERSIONS__V1:
				return V1_EDEFAULT == null ? v1 != null : !V1_EDEFAULT.equals(v1);
			case GraphicsPackage.VERSIONS__V2:
				return V2_EDEFAULT == null ? v2 != null : !V2_EDEFAULT.equals(v2);
			case GraphicsPackage.VERSIONS__V3:
				return V3_EDEFAULT == null ? v3 != null : !V3_EDEFAULT.equals(v3);
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
		result.append(" (v1: ");
		result.append(v1);
		result.append(", v2: ");
		result.append(v2);
		result.append(", v3: ");
		result.append(v3);
		result.append(')');
		return result.toString();
	}

} //VersionsImpl
