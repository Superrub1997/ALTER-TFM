/**
 */
package Ontologicals.impl;

import Gameloop.Game;

import Graphics.Graphic;

import Ontologicals.Ontological;
import Ontologicals.OntologicalsPackage;

import Physics.Physic;

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
 * An implementation of the model object '<em><b>Ontological</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ontologicals.impl.OntologicalImpl#getName <em>Name</em>}</li>
 *   <li>{@link Ontologicals.impl.OntologicalImpl#getURI <em>URI</em>}</li>
 *   <li>{@link Ontologicals.impl.OntologicalImpl#isExternal <em>External</em>}</li>
 *   <li>{@link Ontologicals.impl.OntologicalImpl#isOnlyCodes <em>Only Codes</em>}</li>
 *   <li>{@link Ontologicals.impl.OntologicalImpl#isBluetooth <em>Bluetooth</em>}</li>
 *   <li>{@link Ontologicals.impl.OntologicalImpl#isFirebase <em>Firebase</em>}</li>
 *   <li>{@link Ontologicals.impl.OntologicalImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link Ontologicals.impl.OntologicalImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link Ontologicals.impl.OntologicalImpl#getPhysic <em>Physic</em>}</li>
 *   <li>{@link Ontologicals.impl.OntologicalImpl#getGameloop <em>Gameloop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologicalImpl extends MinimalEObjectImpl.Container implements Ontological {
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
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean external = EXTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isOnlyCodes() <em>Only Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyCodes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ONLY_CODES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnlyCodes() <em>Only Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyCodes()
	 * @generated
	 * @ordered
	 */
	protected boolean onlyCodes = ONLY_CODES_EDEFAULT;

	/**
	 * The default value of the '{@link #isBluetooth() <em>Bluetooth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBluetooth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLUETOOTH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBluetooth() <em>Bluetooth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBluetooth()
	 * @generated
	 * @ordered
	 */
	protected boolean bluetooth = BLUETOOTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isFirebase() <em>Firebase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirebase()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIREBASE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFirebase() <em>Firebase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirebase()
	 * @generated
	 * @ordered
	 */
	protected boolean firebase = FIREBASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<Ontologicals.Class> classes;

	/**
	 * The cached value of the '{@link #getGraphic() <em>Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphic()
	 * @generated
	 * @ordered
	 */
	protected Graphic graphic;

	/**
	 * The cached value of the '{@link #getPhysic() <em>Physic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysic()
	 * @generated
	 * @ordered
	 */
	protected Physic physic;

	/**
	 * The cached value of the '{@link #getGameloop() <em>Gameloop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameloop()
	 * @generated
	 * @ordered
	 */
	protected Game gameloop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologicalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologicalsPackage.Literals.ONTOLOGICAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ONTOLOGICAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURI() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURI(String newURI) {
		String oldURI = uri;
		uri = newURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ONTOLOGICAL__URI, oldURI, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExternal() {
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternal(boolean newExternal) {
		boolean oldExternal = external;
		external = newExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ONTOLOGICAL__EXTERNAL, oldExternal, external));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnlyCodes() {
		return onlyCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnlyCodes(boolean newOnlyCodes) {
		boolean oldOnlyCodes = onlyCodes;
		onlyCodes = newOnlyCodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ONTOLOGICAL__ONLY_CODES, oldOnlyCodes, onlyCodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBluetooth() {
		return bluetooth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBluetooth(boolean newBluetooth) {
		boolean oldBluetooth = bluetooth;
		bluetooth = newBluetooth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ONTOLOGICAL__BLUETOOTH, oldBluetooth, bluetooth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFirebase() {
		return firebase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirebase(boolean newFirebase) {
		boolean oldFirebase = firebase;
		firebase = newFirebase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ONTOLOGICAL__FIREBASE, oldFirebase, firebase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ontologicals.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<Ontologicals.Class>(Ontologicals.Class.class, this, OntologicalsPackage.ONTOLOGICAL__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graphic getGraphic() {
		return graphic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphic(Graphic newGraphic, NotificationChain msgs) {
		Graphic oldGraphic = graphic;
		graphic = newGraphic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ONTOLOGICAL__GRAPHIC, oldGraphic, newGraphic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphic(Graphic newGraphic) {
		if (newGraphic != graphic) {
			NotificationChain msgs = null;
			if (graphic != null)
				msgs = ((InternalEObject)graphic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntologicalsPackage.ONTOLOGICAL__GRAPHIC, null, msgs);
			if (newGraphic != null)
				msgs = ((InternalEObject)newGraphic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntologicalsPackage.ONTOLOGICAL__GRAPHIC, null, msgs);
			msgs = basicSetGraphic(newGraphic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ONTOLOGICAL__GRAPHIC, newGraphic, newGraphic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Physic getPhysic() {
		return physic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysic(Physic newPhysic, NotificationChain msgs) {
		Physic oldPhysic = physic;
		physic = newPhysic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ONTOLOGICAL__PHYSIC, oldPhysic, newPhysic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysic(Physic newPhysic) {
		if (newPhysic != physic) {
			NotificationChain msgs = null;
			if (physic != null)
				msgs = ((InternalEObject)physic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntologicalsPackage.ONTOLOGICAL__PHYSIC, null, msgs);
			if (newPhysic != null)
				msgs = ((InternalEObject)newPhysic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntologicalsPackage.ONTOLOGICAL__PHYSIC, null, msgs);
			msgs = basicSetPhysic(newPhysic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ONTOLOGICAL__PHYSIC, newPhysic, newPhysic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game getGameloop() {
		return gameloop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGameloop(Game newGameloop, NotificationChain msgs) {
		Game oldGameloop = gameloop;
		gameloop = newGameloop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ONTOLOGICAL__GAMELOOP, oldGameloop, newGameloop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameloop(Game newGameloop) {
		if (newGameloop != gameloop) {
			NotificationChain msgs = null;
			if (gameloop != null)
				msgs = ((InternalEObject)gameloop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntologicalsPackage.ONTOLOGICAL__GAMELOOP, null, msgs);
			if (newGameloop != null)
				msgs = ((InternalEObject)newGameloop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntologicalsPackage.ONTOLOGICAL__GAMELOOP, null, msgs);
			msgs = basicSetGameloop(newGameloop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalsPackage.ONTOLOGICAL__GAMELOOP, newGameloop, newGameloop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntologicalsPackage.ONTOLOGICAL__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case OntologicalsPackage.ONTOLOGICAL__GRAPHIC:
				return basicSetGraphic(null, msgs);
			case OntologicalsPackage.ONTOLOGICAL__PHYSIC:
				return basicSetPhysic(null, msgs);
			case OntologicalsPackage.ONTOLOGICAL__GAMELOOP:
				return basicSetGameloop(null, msgs);
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
			case OntologicalsPackage.ONTOLOGICAL__NAME:
				return getName();
			case OntologicalsPackage.ONTOLOGICAL__URI:
				return getURI();
			case OntologicalsPackage.ONTOLOGICAL__EXTERNAL:
				return isExternal();
			case OntologicalsPackage.ONTOLOGICAL__ONLY_CODES:
				return isOnlyCodes();
			case OntologicalsPackage.ONTOLOGICAL__BLUETOOTH:
				return isBluetooth();
			case OntologicalsPackage.ONTOLOGICAL__FIREBASE:
				return isFirebase();
			case OntologicalsPackage.ONTOLOGICAL__CLASSES:
				return getClasses();
			case OntologicalsPackage.ONTOLOGICAL__GRAPHIC:
				return getGraphic();
			case OntologicalsPackage.ONTOLOGICAL__PHYSIC:
				return getPhysic();
			case OntologicalsPackage.ONTOLOGICAL__GAMELOOP:
				return getGameloop();
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
			case OntologicalsPackage.ONTOLOGICAL__NAME:
				setName((String)newValue);
				return;
			case OntologicalsPackage.ONTOLOGICAL__URI:
				setURI((String)newValue);
				return;
			case OntologicalsPackage.ONTOLOGICAL__EXTERNAL:
				setExternal((Boolean)newValue);
				return;
			case OntologicalsPackage.ONTOLOGICAL__ONLY_CODES:
				setOnlyCodes((Boolean)newValue);
				return;
			case OntologicalsPackage.ONTOLOGICAL__BLUETOOTH:
				setBluetooth((Boolean)newValue);
				return;
			case OntologicalsPackage.ONTOLOGICAL__FIREBASE:
				setFirebase((Boolean)newValue);
				return;
			case OntologicalsPackage.ONTOLOGICAL__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends Ontologicals.Class>)newValue);
				return;
			case OntologicalsPackage.ONTOLOGICAL__GRAPHIC:
				setGraphic((Graphic)newValue);
				return;
			case OntologicalsPackage.ONTOLOGICAL__PHYSIC:
				setPhysic((Physic)newValue);
				return;
			case OntologicalsPackage.ONTOLOGICAL__GAMELOOP:
				setGameloop((Game)newValue);
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
			case OntologicalsPackage.ONTOLOGICAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OntologicalsPackage.ONTOLOGICAL__URI:
				setURI(URI_EDEFAULT);
				return;
			case OntologicalsPackage.ONTOLOGICAL__EXTERNAL:
				setExternal(EXTERNAL_EDEFAULT);
				return;
			case OntologicalsPackage.ONTOLOGICAL__ONLY_CODES:
				setOnlyCodes(ONLY_CODES_EDEFAULT);
				return;
			case OntologicalsPackage.ONTOLOGICAL__BLUETOOTH:
				setBluetooth(BLUETOOTH_EDEFAULT);
				return;
			case OntologicalsPackage.ONTOLOGICAL__FIREBASE:
				setFirebase(FIREBASE_EDEFAULT);
				return;
			case OntologicalsPackage.ONTOLOGICAL__CLASSES:
				getClasses().clear();
				return;
			case OntologicalsPackage.ONTOLOGICAL__GRAPHIC:
				setGraphic((Graphic)null);
				return;
			case OntologicalsPackage.ONTOLOGICAL__PHYSIC:
				setPhysic((Physic)null);
				return;
			case OntologicalsPackage.ONTOLOGICAL__GAMELOOP:
				setGameloop((Game)null);
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
			case OntologicalsPackage.ONTOLOGICAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OntologicalsPackage.ONTOLOGICAL__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case OntologicalsPackage.ONTOLOGICAL__EXTERNAL:
				return external != EXTERNAL_EDEFAULT;
			case OntologicalsPackage.ONTOLOGICAL__ONLY_CODES:
				return onlyCodes != ONLY_CODES_EDEFAULT;
			case OntologicalsPackage.ONTOLOGICAL__BLUETOOTH:
				return bluetooth != BLUETOOTH_EDEFAULT;
			case OntologicalsPackage.ONTOLOGICAL__FIREBASE:
				return firebase != FIREBASE_EDEFAULT;
			case OntologicalsPackage.ONTOLOGICAL__CLASSES:
				return classes != null && !classes.isEmpty();
			case OntologicalsPackage.ONTOLOGICAL__GRAPHIC:
				return graphic != null;
			case OntologicalsPackage.ONTOLOGICAL__PHYSIC:
				return physic != null;
			case OntologicalsPackage.ONTOLOGICAL__GAMELOOP:
				return gameloop != null;
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
		result.append(", URI: ");
		result.append(uri);
		result.append(", external: ");
		result.append(external);
		result.append(", onlyCodes: ");
		result.append(onlyCodes);
		result.append(", bluetooth: ");
		result.append(bluetooth);
		result.append(", firebase: ");
		result.append(firebase);
		result.append(')');
		return result.toString();
	}

} //OntologicalImpl
