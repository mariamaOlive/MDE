/**
 */
package MusicStreamingService.tests;

import MusicStreamingService.Album;
import MusicStreamingService.MusicStreamingServiceFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link MusicStreamingService.Album#getDuration() <em>Duration</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AlbumTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AlbumTest.class);
	}

	/**
	 * Constructs a new Album test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlbumTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Album test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Album getFixture() {
		return (Album)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MusicStreamingServiceFactory.eINSTANCE.createAlbum());
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

	/**
	 * Tests the '{@link MusicStreamingService.Album#getDuration() <em>Duration</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MusicStreamingService.Album#getDuration()
	 * @generated
	 */
	public void testGetDuration() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link MusicStreamingService.Album#setDuration(int) <em>Duration</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MusicStreamingService.Album#setDuration(int)
	 * @generated
	 */
	public void testSetDuration() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //AlbumTest
