/**
 */
package MusicStreamingService.tests;

import MusicStreamingService.MusicStreamingServiceFactory;
import MusicStreamingService.SingleTrack;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Single Track</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SingleTrackTest extends MusicTrackTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SingleTrackTest.class);
	}

	/**
	 * Constructs a new Single Track test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleTrackTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Single Track test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SingleTrack getFixture() {
		return (SingleTrack)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MusicStreamingServiceFactory.eINSTANCE.createSingleTrack());
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

} //SingleTrackTest
