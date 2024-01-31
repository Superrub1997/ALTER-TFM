/**
 */
package Ardsl.tests;

import Ardsl.ArdslFactory;
import Ardsl.PhysicBody;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Physic Body</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicBodyTest extends TestCase {

	/**
	 * The fixture for this Physic Body test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicBody fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PhysicBodyTest.class);
	}

	/**
	 * Constructs a new Physic Body test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicBodyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Physic Body test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PhysicBody fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Physic Body test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicBody getFixture() {
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
		setFixture(ArdslFactory.eINSTANCE.createPhysicBody());
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

} //PhysicBodyTest
