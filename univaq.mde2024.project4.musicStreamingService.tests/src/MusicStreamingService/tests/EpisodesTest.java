/**
 */
package MusicStreamingService.tests;

import MusicStreamingService.Episodes;
import MusicStreamingService.MusicStreamingServiceFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Episodes</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EpisodesTest extends TrackTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EpisodesTest.class);
	}

	/**
	 * Constructs a new Episodes test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Episodes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Episodes getFixture() {
		return (Episodes)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MusicStreamingServiceFactory.eINSTANCE.createEpisodes());
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

} //EpisodesTest
