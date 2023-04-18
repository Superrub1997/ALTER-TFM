/**
 */
package Graphics.impl;

import Graphics.Connection;
import Graphics.Constraints;
import Graphics.GraphicClass;
import Graphics.GraphicsPackage;
import Graphics.Versions;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphic Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Graphics.impl.GraphicClassImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link Graphics.impl.GraphicClassImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link Graphics.impl.GraphicClassImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link Graphics.impl.GraphicClassImpl#getShowAttributes <em>Show Attributes</em>}</li>
 *   <li>{@link Graphics.impl.GraphicClassImpl#getMaterialAttributes <em>Material Attributes</em>}</li>
 *   <li>{@link Graphics.impl.GraphicClassImpl#getOntoClass <em>Onto Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicClassImpl extends MinimalEObjectImpl.Container implements GraphicClass {
	/**
	 * The cached value of the '{@link #getVersions() <em>Versions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<Versions> versions;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected Constraints constraints;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * The cached value of the '{@link #getShowAttributes() <em>Show Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> showAttributes;

	/**
	 * The cached value of the '{@link #getMaterialAttributes() <em>Material Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> materialAttributes;

	/**
	 * The cached value of the '{@link #getOntoClass() <em>Onto Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntoClass()
	 * @generated
	 * @ordered
	 */
	protected Ontologicals.Class ontoClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicsPackage.Literals.GRAPHIC_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Versions> getVersions() {
		if (versions == null) {
			versions = new EObjectContainmentEList<Versions>(Versions.class, this, GraphicsPackage.GRAPHIC_CLASS__VERSIONS);
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraints getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraints(Constraints newConstraints, NotificationChain msgs) {
		Constraints oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphicsPackage.GRAPHIC_CLASS__CONSTRAINTS, oldConstraints, newConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(Constraints newConstraints) {
		if (newConstraints != constraints) {
			NotificationChain msgs = null;
			if (constraints != null)
				msgs = ((InternalEObject)constraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphicsPackage.GRAPHIC_CLASS__CONSTRAINTS, null, msgs);
			if (newConstraints != null)
				msgs = ((InternalEObject)newConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphicsPackage.GRAPHIC_CLASS__CONSTRAINTS, null, msgs);
			msgs = basicSetConstraints(newConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicsPackage.GRAPHIC_CLASS__CONSTRAINTS, newConstraints, newConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this, GraphicsPackage.GRAPHIC_CLASS__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getShowAttributes() {
		if (showAttributes == null) {
			showAttributes = new EDataTypeUniqueEList<String>(String.class, this, GraphicsPackage.GRAPHIC_CLASS__SHOW_ATTRIBUTES);
		}
		return showAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMaterialAttributes() {
		if (materialAttributes == null) {
			materialAttributes = new EDataTypeUniqueEList<String>(String.class, this, GraphicsPackage.GRAPHIC_CLASS__MATERIAL_ATTRIBUTES);
		}
		return materialAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontologicals.Class getOntoClass() {
		if (ontoClass != null && ontoClass.eIsProxy()) {
			InternalEObject oldOntoClass = (InternalEObject)ontoClass;
			ontoClass = (Ontologicals.Class)eResolveProxy(oldOntoClass);
			if (ontoClass != oldOntoClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphicsPackage.GRAPHIC_CLASS__ONTO_CLASS, oldOntoClass, ontoClass));
			}
		}
		return ontoClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontologicals.Class basicGetOntoClass() {
		return ontoClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntoClass(Ontologicals.Class newOntoClass) {
		Ontologicals.Class oldOntoClass = ontoClass;
		ontoClass = newOntoClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicsPackage.GRAPHIC_CLASS__ONTO_CLASS, oldOntoClass, ontoClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphicsPackage.GRAPHIC_CLASS__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
			case GraphicsPackage.GRAPHIC_CLASS__CONSTRAINTS:
				return basicSetConstraints(null, msgs);
			case GraphicsPackage.GRAPHIC_CLASS__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
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
			case GraphicsPackage.GRAPHIC_CLASS__VERSIONS:
				return getVersions();
			case GraphicsPackage.GRAPHIC_CLASS__CONSTRAINTS:
				return getConstraints();
			case GraphicsPackage.GRAPHIC_CLASS__CONNECTIONS:
				return getConnections();
			case GraphicsPackage.GRAPHIC_CLASS__SHOW_ATTRIBUTES:
				return getShowAttributes();
			case GraphicsPackage.GRAPHIC_CLASS__MATERIAL_ATTRIBUTES:
				return getMaterialAttributes();
			case GraphicsPackage.GRAPHIC_CLASS__ONTO_CLASS:
				if (resolve) return getOntoClass();
				return basicGetOntoClass();
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
			case GraphicsPackage.GRAPHIC_CLASS__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends Versions>)newValue);
				return;
			case GraphicsPackage.GRAPHIC_CLASS__CONSTRAINTS:
				setConstraints((Constraints)newValue);
				return;
			case GraphicsPackage.GRAPHIC_CLASS__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case GraphicsPackage.GRAPHIC_CLASS__SHOW_ATTRIBUTES:
				getShowAttributes().clear();
				getShowAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case GraphicsPackage.GRAPHIC_CLASS__MATERIAL_ATTRIBUTES:
				getMaterialAttributes().clear();
				getMaterialAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case GraphicsPackage.GRAPHIC_CLASS__ONTO_CLASS:
				setOntoClass((Ontologicals.Class)newValue);
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
			case GraphicsPackage.GRAPHIC_CLASS__VERSIONS:
				getVersions().clear();
				return;
			case GraphicsPackage.GRAPHIC_CLASS__CONSTRAINTS:
				setConstraints((Constraints)null);
				return;
			case GraphicsPackage.GRAPHIC_CLASS__CONNECTIONS:
				getConnections().clear();
				return;
			case GraphicsPackage.GRAPHIC_CLASS__SHOW_ATTRIBUTES:
				getShowAttributes().clear();
				return;
			case GraphicsPackage.GRAPHIC_CLASS__MATERIAL_ATTRIBUTES:
				getMaterialAttributes().clear();
				return;
			case GraphicsPackage.GRAPHIC_CLASS__ONTO_CLASS:
				setOntoClass((Ontologicals.Class)null);
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
			case GraphicsPackage.GRAPHIC_CLASS__VERSIONS:
				return versions != null && !versions.isEmpty();
			case GraphicsPackage.GRAPHIC_CLASS__CONSTRAINTS:
				return constraints != null;
			case GraphicsPackage.GRAPHIC_CLASS__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case GraphicsPackage.GRAPHIC_CLASS__SHOW_ATTRIBUTES:
				return showAttributes != null && !showAttributes.isEmpty();
			case GraphicsPackage.GRAPHIC_CLASS__MATERIAL_ATTRIBUTES:
				return materialAttributes != null && !materialAttributes.isEmpty();
			case GraphicsPackage.GRAPHIC_CLASS__ONTO_CLASS:
				return ontoClass != null;
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
		result.append(" (showAttributes: ");
		result.append(showAttributes);
		result.append(", materialAttributes: ");
		result.append(materialAttributes);
		result.append(')');
		return result.toString();
	}

} //GraphicClassImpl
