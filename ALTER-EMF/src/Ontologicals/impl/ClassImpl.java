/**
 */
package Ontologicals.impl;

import Ontologicals.Attribute;
import Ontologicals.OntologicalsPackage;
import Ontologicals.Reference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ontologicals.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link Ontologicals.impl.ClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link Ontologicals.impl.ClassImpl#isNoSCN <em>No SCN</em>}</li>
 *   <li>{@link Ontologicals.impl.ClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link Ontologicals.impl.ClassImpl#getReferences <em>References</em>}</li>
 *   <li>{@link Ontologicals.impl.ClassImpl#getSuperclasses <em>Superclasses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements Ontologicals.Class {
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
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoSCN() <em>No SCN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoSCN()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_SCN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoSCN() <em>No SCN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoSCN()
	 * @generated
	 * @ordered
	 */
	protected boolean noSCN = NO_SCN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> references;

	/**
	 * The cached value of the '{@link #getSuperclasses() <em>Superclasses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperclasses()
	 * @generated
	 * @ordered
	 */
	protected EList<Ontologicals.Class> superclasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologicalsPackage.Literals.CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.CLASS__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoSCN() {
		return noSCN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoSCN(boolean newNoSCN) {
		boolean oldNoSCN = noSCN;
		noSCN = newNoSCN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.CLASS__NO_SCN, oldNoSCN, noSCN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, OntologicalsPackage.CLASS__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<Reference>(Reference.class, this, OntologicalsPackage.CLASS__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ontologicals.Class> getSuperclasses() {
		if (superclasses == null) {
			superclasses = new EObjectResolvingEList<Ontologicals.Class>(Ontologicals.Class.class, this, OntologicalsPackage.CLASS__SUPERCLASSES);
		}
		return superclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntologicalsPackage.CLASS__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case OntologicalsPackage.CLASS__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
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
			case OntologicalsPackage.CLASS__NAME:
				return getName();
			case OntologicalsPackage.CLASS__ABSTRACT:
				return isAbstract();
			case OntologicalsPackage.CLASS__NO_SCN:
				return isNoSCN();
			case OntologicalsPackage.CLASS__ATTRIBUTES:
				return getAttributes();
			case OntologicalsPackage.CLASS__REFERENCES:
				return getReferences();
			case OntologicalsPackage.CLASS__SUPERCLASSES:
				return getSuperclasses();
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
			case OntologicalsPackage.CLASS__NAME:
				setName((String)newValue);
				return;
			case OntologicalsPackage.CLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case OntologicalsPackage.CLASS__NO_SCN:
				setNoSCN((Boolean)newValue);
				return;
			case OntologicalsPackage.CLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case OntologicalsPackage.CLASS__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case OntologicalsPackage.CLASS__SUPERCLASSES:
				getSuperclasses().clear();
				getSuperclasses().addAll((Collection<? extends Ontologicals.Class>)newValue);
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
			case OntologicalsPackage.CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OntologicalsPackage.CLASS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case OntologicalsPackage.CLASS__NO_SCN:
				setNoSCN(NO_SCN_EDEFAULT);
				return;
			case OntologicalsPackage.CLASS__ATTRIBUTES:
				getAttributes().clear();
				return;
			case OntologicalsPackage.CLASS__REFERENCES:
				getReferences().clear();
				return;
			case OntologicalsPackage.CLASS__SUPERCLASSES:
				getSuperclasses().clear();
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
			case OntologicalsPackage.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OntologicalsPackage.CLASS__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case OntologicalsPackage.CLASS__NO_SCN:
				return noSCN != NO_SCN_EDEFAULT;
			case OntologicalsPackage.CLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case OntologicalsPackage.CLASS__REFERENCES:
				return references != null && !references.isEmpty();
			case OntologicalsPackage.CLASS__SUPERCLASSES:
				return superclasses != null && !superclasses.isEmpty();
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
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", noSCN: ");
		result.append(noSCN);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
