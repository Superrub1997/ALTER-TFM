/**
 */
package Ardsl.tests;

import Ardsl.ArdslFactory;
import Ardsl.GamePad;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Game Pad</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GamePadTest extends TestCase {

	/**
	 * The fixture for this Game Pad test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamePad fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GamePadTest.class);
	}

	/**
	 * Constructs a new Game Pad test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamePadTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Game Pad test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GamePad fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Game Pad test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamePad getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArdslFactory.eINSTANCE.createGamePad());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //GamePadTest
