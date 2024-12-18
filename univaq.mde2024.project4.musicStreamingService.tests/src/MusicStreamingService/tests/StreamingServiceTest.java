/**
 */
package MusicStreamingService.tests;

import MusicStreamingService.MusicStreamingServiceFactory;
import MusicStreamingService.StreamingService;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Streaming Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StreamingServiceTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StreamingServiceTest.class);
	}

	/**
	 * Constructs a new Streaming Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamingServiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Streaming Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StreamingService getFixture() {
		return (StreamingService)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MusicStreamingServiceFactory.eINSTANCE.createStreamingService());
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

} //StreamingServiceTest
