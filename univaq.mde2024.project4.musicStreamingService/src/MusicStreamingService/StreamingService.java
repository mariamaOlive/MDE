/**
 */
package MusicStreamingService;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Streaming Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.StreamingService#getListeners <em>Listeners</em>}</li>
 *   <li>{@link MusicStreamingService.StreamingService#getArtist <em>Artist</em>}</li>
 *   <li>{@link MusicStreamingService.StreamingService#getPodcasts <em>Podcasts</em>}</li>
 *   <li>{@link MusicStreamingService.StreamingService#getPlaylist <em>Playlist</em>}</li>
 * </ul>
 *
 * @see MusicStreamingService.MusicStreamingServicePackage#getStreamingService()
 * @model
 * @generated
 */
public interface StreamingService extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Listeners</b></em>' containment reference list.
	 * The list contents are of type {@link MusicStreamingService.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listeners</em>' containment reference list.
	 * @see MusicStreamingService.MusicStreamingServicePackage#getStreamingService_Listeners()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<User> getListeners();

	/**
	 * Returns the value of the '<em><b>Artist</b></em>' containment reference list.
	 * The list contents are of type {@link MusicStreamingService.Artist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artist</em>' containment reference list.
	 * @see MusicStreamingService.MusicStreamingServicePackage#getStreamingService_Artist()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Artist> getArtist();

	/**
	 * Returns the value of the '<em><b>Podcasts</b></em>' containment reference list.
	 * The list contents are of type {@link MusicStreamingService.Podcast}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Podcasts</em>' containment reference list.
	 * @see MusicStreamingService.MusicStreamingServicePackage#getStreamingService_Podcasts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Podcast> getPodcasts();

	/**
	 * Returns the value of the '<em><b>Playlist</b></em>' containment reference list.
	 * The list contents are of type {@link MusicStreamingService.Playlist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Playlist</em>' containment reference list.
	 * @see MusicStreamingService.MusicStreamingServicePackage#getStreamingService_Playlist()
	 * @model containment="true"
	 * @generated
	 */
	EList<Playlist> getPlaylist();

} // StreamingService
