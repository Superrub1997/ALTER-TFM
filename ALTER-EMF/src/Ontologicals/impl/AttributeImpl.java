/**
 */
package Ontologicals.impl;

import Ontologicals.Attribute;
import Ontologicals.OntologicalsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ontologicals.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Ontologicals.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link Ontologicals.impl.AttributeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link Ontologicals.impl.AttributeImpl#getMax <em>Max</em>}</li>
 *   <li>{@link Ontologicals.impl.AttributeImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link Ontologicals.impl.AttributeImpl#isIsParam <em>Is Param</em>}</li>
 *   <li>{@link Ontologicals.impl.AttributeImpl#isIsKey <em>Is Key</em>}</li>
 *   <li>{@link Ontologicals.impl.AttributeImpl#isReadOnly <em>Read Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected String min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected String max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsParam() <em>Is Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsParam()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PARAM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsParam() <em>Is Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsParam()
	 * @generated
	 * @ordered
	 */
	protected boolean isParam = IS_PARAM_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsKey() <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsKey() <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsKey()
	 * @generated
	 * @ordered
	 */
	protected boolean isKey = IS_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologicalsPackage.Literals.ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(String newMin) {
		String oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ATTRIBUTE__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(String newMax) {
		String oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ATTRIBUTE__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ATTRIBUTE__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsParam() {
		return isParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsParam(boolean newIsParam) {
		boolean oldIsParam = isParam;
		isParam = newIsParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ATTRIBUTE__IS_PARAM, oldIsParam, isParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsKey() {
		return isKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsKey(boolean newIsKey) {
		boolean oldIsKey = isKey;
		isKey = newIsKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ATTRIBUTE__IS_KEY, oldIsKey, isKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ATTRIBUTE__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntologicalsPackage.ATTRIBUTE__NAME:
				return getName();
			case OntologicalsPackage.ATTRIBUTE__TYPE:
				return getType();
			case OntologicalsPackage.ATTRIBUTE__MIN:
				return getMin();
			case OntologicalsPackage.ATTRIBUTE__MAX:
				return getMax();
			case OntologicalsPackage.ATTRIBUTE__DEFAULT:
				return getDefault();
			case OntologicalsPackage.ATTRIBUTE__IS_PARAM:
				return isIsParam();
			case OntologicalsPackage.ATTRIBUTE__IS_KEY:
				return isIsKey();
			case OntologicalsPackage.ATTRIBUTE__READ_ONLY:
				return isReadOnly();
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
			case OntologicalsPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case OntologicalsPackage.ATTRIBUTE__TYPE:
				setType((String)newValue);
				return;
			case OntologicalsPackage.ATTRIBUTE__MIN:
				setMin((String)newValue);
				return;
			case OntologicalsPackage.ATTRIBUTE__MAX:
				setMax((String)newValue);
				return;
			case OntologicalsPackage.ATTRIBUTE__DEFAULT:
				setDefault((String)newValue);
				return;
			case OntologicalsPackage.ATTRIBUTE__IS_PARAM:
				setIsParam((Boolean)newValue);
				return;
			case OntologicalsPackage.ATTRIBUTE__IS_KEY:
				setIsKey((Boolean)newValue);
				return;
			case OntologicalsPackage.ATTRIBUTE__READ_ONLY:
				setReadOnly((Boolean)newValue);
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
			case OntologicalsPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OntologicalsPackage.ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OntologicalsPackage.ATTRIBUTE__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case OntologicalsPackage.ATTRIBUTE__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case OntologicalsPackage.ATTRIBUTE__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case OntologicalsPackage.ATTRIBUTE__IS_PARAM:
				setIsParam(IS_PARAM_EDEFAULT);
				return;
			case OntologicalsPackage.ATTRIBUTE__IS_KEY:
				setIsKey(IS_KEY_EDEFAULT);
				return;
			case OntologicalsPackage.ATTRIBUTE__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
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
			case OntologicalsPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OntologicalsPackage.ATTRIBUTE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OntologicalsPackage.ATTRIBUTE__MIN:
				return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
			case OntologicalsPackage.ATTRIBUTE__MAX:
				return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
			case OntologicalsPackage.ATTRIBUTE__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case OntologicalsPackage.ATTRIBUTE__IS_PARAM:
				return isParam != IS_PARAM_EDEFAULT;
			case OntologicalsPackage.ATTRIBUTE__IS_KEY:
				return isKey != IS_KEY_EDEFAULT;
			case OntologicalsPackage.ATTRIBUTE__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
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
		result.append(", type: ");
		result.append(type);
		result.append(", min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", default: ");
		result.append(default_);
		result.append(", isParam: ");
		result.append(isParam);
		result.append(", isKey: ");
		result.append(isKey);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
