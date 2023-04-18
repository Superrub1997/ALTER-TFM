/**
 */
package Gameloop.impl;

import Gameloop.Collision;
import Gameloop.Game;
import Gameloop.GamePad;
import Gameloop.GameloopPackage;
import Gameloop.ObjInit;
import Gameloop.ScoreSystem;
import Gameloop.Trigger;

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
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gameloop.impl.GameImpl#getWin <em>Win</em>}</li>
 *   <li>{@link Gameloop.impl.GameImpl#getLose <em>Lose</em>}</li>
 *   <li>{@link Gameloop.impl.GameImpl#getStart <em>Start</em>}</li>
 *   <li>{@link Gameloop.impl.GameImpl#getObjInit <em>Obj Init</em>}</li>
 *   <li>{@link Gameloop.impl.GameImpl#getScore <em>Score</em>}</li>
 *   <li>{@link Gameloop.impl.GameImpl#getCollisions <em>Collisions</em>}</li>
 *   <li>{@link Gameloop.impl.GameImpl#getActionsTriggers <em>Actions Triggers</em>}</li>
 *   <li>{@link Gameloop.impl.GameImpl#getGamepad <em>Gamepad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
	/**
	 * The default value of the '{@link #getWin() <em>Win</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWin()
	 * @generated
	 * @ordered
	 */
	protected static final String WIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWin() <em>Win</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWin()
	 * @generated
	 * @ordered
	 */
	protected String win = WIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLose() <em>Lose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLose()
	 * @generated
	 * @ordered
	 */
	protected static final String LOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLose() <em>Lose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLose()
	 * @generated
	 * @ordered
	 */
	protected String lose = LOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final String START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected String start = START_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjInit() <em>Obj Init</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjInit()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjInit> objInit;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected ScoreSystem score;

	/**
	 * The cached value of the '{@link #getCollisions() <em>Collisions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollisions()
	 * @generated
	 * @ordered
	 */
	protected EList<Collision> collisions;

	/**
	 * The cached value of the '{@link #getActionsTriggers() <em>Actions Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionsTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> actionsTriggers;

	/**
	 * The cached value of the '{@link #getGamepad() <em>Gamepad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamepad()
	 * @generated
	 * @ordered
	 */
	protected EList<GamePad> gamepad;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GameloopPackage.Literals.GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWin() {
		return win;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWin(String newWin) {
		String oldWin = win;
		win = newWin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.GAME__WIN, oldWin, win));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLose() {
		return lose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLose(String newLose) {
		String oldLose = lose;
		lose = newLose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.GAME__LOSE, oldLose, lose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(String newStart) {
		String oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.GAME__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjInit> getObjInit() {
		if (objInit == null) {
			objInit = new EObjectContainmentEList<ObjInit>(ObjInit.class, this, GameloopPackage.GAME__OBJ_INIT);
		}
		return objInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScoreSystem getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScore(ScoreSystem newScore, NotificationChain msgs) {
		ScoreSystem oldScore = score;
		score = newScore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GameloopPackage.GAME__SCORE, oldScore, newScore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(ScoreSystem newScore) {
		if (newScore != score) {
			NotificationChain msgs = null;
			if (score != null)
				msgs = ((InternalEObject)score).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GameloopPackage.GAME__SCORE, null, msgs);
			if (newScore != null)
				msgs = ((InternalEObject)newScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GameloopPackage.GAME__SCORE, null, msgs);
			msgs = basicSetScore(newScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.GAME__SCORE, newScore, newScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Collision> getCollisions() {
		if (collisions == null) {
			collisions = new EObjectContainmentEList<Collision>(Collision.class, this, GameloopPackage.GAME__COLLISIONS);
		}
		return collisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getActionsTriggers() {
		if (actionsTriggers == null) {
			actionsTriggers = new EObjectContainmentEList<Trigger>(Trigger.class, this, GameloopPackage.GAME__ACTIONS_TRIGGERS);
		}
		return actionsTriggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GamePad> getGamepad() {
		if (gamepad == null) {
			gamepad = new EObjectContainmentEList<GamePad>(GamePad.class, this, GameloopPackage.GAME__GAMEPAD);
		}
		return gamepad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GameloopPackage.GAME__OBJ_INIT:
				return ((InternalEList<?>)getObjInit()).basicRemove(otherEnd, msgs);
			case GameloopPackage.GAME__SCORE:
				return basicSetScore(null, msgs);
			case GameloopPackage.GAME__COLLISIONS:
				return ((InternalEList<?>)getCollisions()).basicRemove(otherEnd, msgs);
			case GameloopPackage.GAME__ACTIONS_TRIGGERS:
				return ((InternalEList<?>)getActionsTriggers()).basicRemove(otherEnd, msgs);
			case GameloopPackage.GAME__GAMEPAD:
				return ((InternalEList<?>)getGamepad()).basicRemove(otherEnd, msgs);
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
			case GameloopPackage.GAME__WIN:
				return getWin();
			case GameloopPackage.GAME__LOSE:
				return getLose();
			case GameloopPackage.GAME__START:
				return getStart();
			case GameloopPackage.GAME__OBJ_INIT:
				return getObjInit();
			case GameloopPackage.GAME__SCORE:
				return getScore();
			case GameloopPackage.GAME__COLLISIONS:
				return getCollisions();
			case GameloopPackage.GAME__ACTIONS_TRIGGERS:
				return getActionsTriggers();
			case GameloopPackage.GAME__GAMEPAD:
				return getGamepad();
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
			case GameloopPackage.GAME__WIN:
				setWin((String)newValue);
				return;
			case GameloopPackage.GAME__LOSE:
				setLose((String)newValue);
				return;
			case GameloopPackage.GAME__START:
				setStart((String)newValue);
				return;
			case GameloopPackage.GAME__OBJ_INIT:
				getObjInit().clear();
				getObjInit().addAll((Collection<? extends ObjInit>)newValue);
				return;
			case GameloopPackage.GAME__SCORE:
				setScore((ScoreSystem)newValue);
				return;
			case GameloopPackage.GAME__COLLISIONS:
				getCollisions().clear();
				getCollisions().addAll((Collection<? extends Collision>)newValue);
				return;
			case GameloopPackage.GAME__ACTIONS_TRIGGERS:
				getActionsTriggers().clear();
				getActionsTriggers().addAll((Collection<? extends Trigger>)newValue);
				return;
			case GameloopPackage.GAME__GAMEPAD:
				getGamepad().clear();
				getGamepad().addAll((Collection<? extends GamePad>)newValue);
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
			case GameloopPackage.GAME__WIN:
				setWin(WIN_EDEFAULT);
				return;
			case GameloopPackage.GAME__LOSE:
				setLose(LOSE_EDEFAULT);
				return;
			case GameloopPackage.GAME__START:
				setStart(START_EDEFAULT);
				return;
			case GameloopPackage.GAME__OBJ_INIT:
				getObjInit().clear();
				return;
			case GameloopPackage.GAME__SCORE:
				setScore((ScoreSystem)null);
				return;
			case GameloopPackage.GAME__COLLISIONS:
				getCollisions().clear();
				return;
			case GameloopPackage.GAME__ACTIONS_TRIGGERS:
				getActionsTriggers().clear();
				return;
			case GameloopPackage.GAME__GAMEPAD:
				getGamepad().clear();
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
			case GameloopPackage.GAME__WIN:
				return WIN_EDEFAULT == null ? win != null : !WIN_EDEFAULT.equals(win);
			case GameloopPackage.GAME__LOSE:
				return LOSE_EDEFAULT == null ? lose != null : !LOSE_EDEFAULT.equals(lose);
			case GameloopPackage.GAME__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case GameloopPackage.GAME__OBJ_INIT:
				return objInit != null && !objInit.isEmpty();
			case GameloopPackage.GAME__SCORE:
				return score != null;
			case GameloopPackage.GAME__COLLISIONS:
				return collisions != null && !collisions.isEmpty();
			case GameloopPackage.GAME__ACTIONS_TRIGGERS:
				return actionsTriggers != null && !actionsTriggers.isEmpty();
			case GameloopPackage.GAME__GAMEPAD:
				return gamepad != null && !gamepad.isEmpty();
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
		result.append(" (win: ");
		result.append(win);
		result.append(", lose: ");
		result.append(lose);
		result.append(", start: ");
		result.append(start);
		result.append(')');
		return result.toString();
	}

} //GameImpl
