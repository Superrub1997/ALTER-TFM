/**
 */
package Physics.tests;

import Physics.BitMasks;
import Physics.PhysicsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bit Masks</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BitMasksTest extends TestCase {

	/**
	 * The fixture for this Bit Masks test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitMasks fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BitMasksTest.class);
	}

	/**
	 * Constructs a new Bit Masks test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitMasksTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Bit Masks test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BitMasks fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Bit Masks test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitMasks getFixture() {
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
		setFixture(PhysicsFactory.eINSTANCE.createBitMasks());
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

} //BitMasksTest
