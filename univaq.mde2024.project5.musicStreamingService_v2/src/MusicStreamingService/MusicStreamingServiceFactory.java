/**
 */
package MusicStreamingService;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MusicStreamingService.MusicStreamingServicePackage
 * @generated
 */
public interface MusicStreamingServiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MusicStreamingServiceFactory eINSTANCE = MusicStreamingService.impl.MusicStreamingServiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Streaming Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Streaming Service</em>'.
	 * @generated
	 */
	StreamingService createStreamingService();

	/**
	 * Returns a new object of class '<em>Artist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artist</em>'.
	 * @generated
	 */
	Artist createArtist();

	/**
	 * Returns a new object of class '<em>Single Track</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Track</em>'.
	 * @generated
	 */
	SingleTrack createSingleTrack();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Playlist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Playlist</em>'.
	 * @generated
	 */
	Playlist createPlaylist();

	/**
	 * Returns a new object of class '<em>Podcast</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Podcast</em>'.
	 * @generated
	 */
	Podcast createPodcast();

	/**
	 * Returns a new object of class '<em>Podcast Episode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Podcast Episode</em>'.
	 * @generated
	 */
	PodcastEpisode createPodcastEpisode();

	/**
	 * Returns a new object of class '<em>Album Track</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Album Track</em>'.
	 * @generated
	 */
	AlbumTrack createAlbumTrack();

	/**
	 * Returns a new object of class '<em>Studio Album</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Studio Album</em>'.
	 * @generated
	 */
	StudioAlbum createStudioAlbum();

	/**
	 * Returns a new object of class '<em>Live Album</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Album</em>'.
	 * @generated
	 */
	LiveAlbum createLiveAlbum();

	/**
	 * Returns a new object of class '<em>Concert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concert</em>'.
	 * @generated
	 */
	Concert createConcert();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MusicStreamingServicePackage getMusicStreamingServicePackage();

} //MusicStreamingServiceFactory
