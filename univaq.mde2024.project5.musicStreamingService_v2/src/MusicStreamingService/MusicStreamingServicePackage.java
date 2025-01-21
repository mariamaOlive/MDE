/**
 */
package MusicStreamingService;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MusicStreamingService.MusicStreamingServiceFactory
 * @model kind="package"
 * @generated
 */
public interface MusicStreamingServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MusicStreamingService";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://it.univaq.disim.mde.course.project4/MSS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MSS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MusicStreamingServicePackage eINSTANCE = MusicStreamingService.impl.MusicStreamingServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link MusicStreamingService.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MusicStreamingService.impl.NamedElementImpl
	 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MusicStreamingService.impl.StreamingServiceImpl <em>Streaming Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MusicStreamingService.impl.StreamingServiceImpl
	 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getStreamingService()
	 * @generated
	 */
	int STREAMING_SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_SERVICE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Listeners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_SERVICE__LISTENERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_SERVICE__ARTIST = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Podcasts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_SERVICE__PODCASTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Playlist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_SERVICE__PLAYLIST = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Streaming Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_SERVICE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Streaming Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_SERVICE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MusicStreamingService.impl.ComposerImpl <em>Composer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MusicStreamingService.impl.ComposerImpl
	 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getComposer()
	 * @generated
	 */
	int COMPOSER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Composer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MusicStreamingService.impl.ArtistImpl <em>Artist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MusicStreamingService.impl.ArtistImpl
	 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getArtist()
	 * @generated
	 */
	int ARTIST = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__ABOUT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Followers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__FOLLOWERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Img url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__IMG_URL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Num of listeners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__NUM_OF_LISTENERS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned albums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__OWNED_ALBUMS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned solos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__OWNED_SOLOS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Featured in</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__FEATURED_IN = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Artist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Artist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MusicStreamingService.impl.TrackImpl <em>Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MusicStreamingService.impl.TrackImpl
	 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getTrack()
	 * @generated
	 */
	int TRACK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__DURATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MusicStreamingService.impl.MusicTrackImpl <em>Music Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MusicStreamingService.impl.MusicTrackImpl
	 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getMusicTrack()
	 * @generated
	 */
	int MUSIC_TRACK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_TRACK__NAME = TRACK__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_TRACK__DURATION = TRACK__DURATION;

	/**
	 * The feature id for the '<em><b>Genre</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_TRACK__GENRE = TRACK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lyrics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_TRACK__LYRICS = TRACK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Featured artist</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_TRACK__FEATURED_ARTIST = TRACK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Music Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_TRACK_FEATURE_COUNT = TRACK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Music Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_TRACK_OPERATION_COUNT = TRACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MusicStreamingService.impl.SingleTrackImpl <em>Single Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MusicStreamingService.impl.SingleTrackImpl
	 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getSingleTrack()
	 * @generated
	 */
	int SINGLE_TRACK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TRACK__NAME = MUSIC_TRACK__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TRACK__DURATION = MUSIC_TRACK__DURATION;

	/**
	 * The feature id for the '<em><b>Genre</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TRACK__GENRE = MUSIC_TRACK__GENRE;

	/**
	 * The feature id for the '<em><b>Lyrics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TRACK__LYRICS = MUSIC_TRACK__LYRICS;

	/**
	 * The feature id for the '<em><b>Featured artist</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TRACK__FEATURED_ARTIST = MUSIC_TRACK__FEATURED_ARTIST;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TRACK__OWNER = MUSIC_TRACK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TRACK_FEATURE_COUNT = MUSIC_TRACK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TRACK_OPERATION_COUNT = MUSIC_TRACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MusicStreamingService.impl.AlbumImpl <em>Album</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MusicStreamingService.impl.AlbumImpl
	 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getAlbum()
	 * @generated
	 */
	int ALBUM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__TRACKS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__DURATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Img url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__IMG_URL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MusicStreamingService.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MusicStreamingService.impl.UserImpl
	 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getUser()
	 * @generated
	 */
	int USER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERNAME = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Followed artist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FOLLOWED_ARTIST = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned playlist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__OWNED_PLAYLIST = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Subscribed podcast</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SUBSCRIBED_PODCAST = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MusicStreamingService.impl.PlaylistImpl <em>Playlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MusicStreamingService.impl.PlaylistImpl
	 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getPlaylist()
	 * @generated
	 */
	int PLAYLIST = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__TRACKS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num of tracks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__NUM_OF_TRACKS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__DURATION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__ORDER = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__OWNERS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MusicStreamingService.impl.PodcastImpl <em>Podcast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MusicStreamingService.impl.PodcastImpl
	 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getPodcast()
	 * @generated
	 */
	int PODCAST = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PODCAST__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PODCAST__TAG = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PODCAST__RATING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Img url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PODCAST__IMG_URL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Episodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PODCAST__EPISODES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Followers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PODCAST__FOLLOWERS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Podcast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PODCAST_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Podcast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PODCAST_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MusicStreamingService.impl.EpisodesImpl <em>Episodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MusicStreamingService.impl.EpisodesImpl
	 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getEpisodes()
	 * @generated
	 */
	int EPISODES = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODES__NAME = TRACK__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODES__DURATION = TRACK__DURATION;

	/**
	 * The feature id for the '<em><b>Date created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODES__DATE_CREATED = TRACK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transcript</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODES__TRANSCRIPT = TRACK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODES__DESCRIPTION = TRACK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Episodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODES_FEATURE_COUNT = TRACK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Episodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODES_OPERATION_COUNT = TRACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MusicStreamingService.impl.AlbumTrackImpl <em>Album Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MusicStreamingService.impl.AlbumTrackImpl
	 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getAlbumTrack()
	 * @generated
	 */
	int ALBUM_TRACK = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_TRACK__NAME = MUSIC_TRACK__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_TRACK__DURATION = MUSIC_TRACK__DURATION;

	/**
	 * The feature id for the '<em><b>Genre</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_TRACK__GENRE = MUSIC_TRACK__GENRE;

	/**
	 * The feature id for the '<em><b>Lyrics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_TRACK__LYRICS = MUSIC_TRACK__LYRICS;

	/**
	 * The feature id for the '<em><b>Featured artist</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_TRACK__FEATURED_ARTIST = MUSIC_TRACK__FEATURED_ARTIST;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_TRACK__POSITION = MUSIC_TRACK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Album Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_TRACK_FEATURE_COUNT = MUSIC_TRACK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Album Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_TRACK_OPERATION_COUNT = MUSIC_TRACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MusicStreamingService.PodcastTag <em>Podcast Tag</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MusicStreamingService.PodcastTag
	 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getPodcastTag()
	 * @generated
	 */
	int PODCAST_TAG = 13;

	/**
	 * The meta object id for the '{@link MusicStreamingService.Order <em>Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MusicStreamingService.Order
	 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 14;

	/**
	 * The meta object id for the '{@link MusicStreamingService.MusicGenre <em>Music Genre</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MusicStreamingService.MusicGenre
	 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getMusicGenre()
	 * @generated
	 */
	int MUSIC_GENRE = 15;


	/**
	 * Returns the meta object for class '{@link MusicStreamingService.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see MusicStreamingService.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MusicStreamingService.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link MusicStreamingService.StreamingService <em>Streaming Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Streaming Service</em>'.
	 * @see MusicStreamingService.StreamingService
	 * @generated
	 */
	EClass getStreamingService();

	/**
	 * Returns the meta object for the containment reference list '{@link MusicStreamingService.StreamingService#getListeners <em>Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listeners</em>'.
	 * @see MusicStreamingService.StreamingService#getListeners()
	 * @see #getStreamingService()
	 * @generated
	 */
	EReference getStreamingService_Listeners();

	/**
	 * Returns the meta object for the containment reference list '{@link MusicStreamingService.StreamingService#getArtist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artist</em>'.
	 * @see MusicStreamingService.StreamingService#getArtist()
	 * @see #getStreamingService()
	 * @generated
	 */
	EReference getStreamingService_Artist();

	/**
	 * Returns the meta object for the containment reference list '{@link MusicStreamingService.StreamingService#getPodcasts <em>Podcasts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Podcasts</em>'.
	 * @see MusicStreamingService.StreamingService#getPodcasts()
	 * @see #getStreamingService()
	 * @generated
	 */
	EReference getStreamingService_Podcasts();

	/**
	 * Returns the meta object for the containment reference list '{@link MusicStreamingService.StreamingService#getPlaylist <em>Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Playlist</em>'.
	 * @see MusicStreamingService.StreamingService#getPlaylist()
	 * @see #getStreamingService()
	 * @generated
	 */
	EReference getStreamingService_Playlist();

	/**
	 * Returns the meta object for class '{@link MusicStreamingService.Composer <em>Composer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composer</em>'.
	 * @see MusicStreamingService.Composer
	 * @generated
	 */
	EClass getComposer();

	/**
	 * Returns the meta object for class '{@link MusicStreamingService.Artist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artist</em>'.
	 * @see MusicStreamingService.Artist
	 * @generated
	 */
	EClass getArtist();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.Artist#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see MusicStreamingService.Artist#getAbout()
	 * @see #getArtist()
	 * @generated
	 */
	EAttribute getArtist_About();

	/**
	 * Returns the meta object for the reference list '{@link MusicStreamingService.Artist#getFollowers <em>Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Followers</em>'.
	 * @see MusicStreamingService.Artist#getFollowers()
	 * @see #getArtist()
	 * @generated
	 */
	EReference getArtist_Followers();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.Artist#getImg_url <em>Img url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Img url</em>'.
	 * @see MusicStreamingService.Artist#getImg_url()
	 * @see #getArtist()
	 * @generated
	 */
	EAttribute getArtist_Img_url();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.Artist#getNum_of_listeners <em>Num of listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num of listeners</em>'.
	 * @see MusicStreamingService.Artist#getNum_of_listeners()
	 * @see #getArtist()
	 * @generated
	 */
	EAttribute getArtist_Num_of_listeners();

	/**
	 * Returns the meta object for the containment reference list '{@link MusicStreamingService.Artist#getOwned_albums <em>Owned albums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned albums</em>'.
	 * @see MusicStreamingService.Artist#getOwned_albums()
	 * @see #getArtist()
	 * @generated
	 */
	EReference getArtist_Owned_albums();

	/**
	 * Returns the meta object for the containment reference list '{@link MusicStreamingService.Artist#getOwned_solos <em>Owned solos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned solos</em>'.
	 * @see MusicStreamingService.Artist#getOwned_solos()
	 * @see #getArtist()
	 * @generated
	 */
	EReference getArtist_Owned_solos();

	/**
	 * Returns the meta object for the reference '{@link MusicStreamingService.Artist#getFeatured_in <em>Featured in</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Featured in</em>'.
	 * @see MusicStreamingService.Artist#getFeatured_in()
	 * @see #getArtist()
	 * @generated
	 */
	EReference getArtist_Featured_in();

	/**
	 * Returns the meta object for class '{@link MusicStreamingService.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track</em>'.
	 * @see MusicStreamingService.Track
	 * @generated
	 */
	EClass getTrack();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.Track#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see MusicStreamingService.Track#getDuration()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_Duration();

	/**
	 * Returns the meta object for class '{@link MusicStreamingService.MusicTrack <em>Music Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Music Track</em>'.
	 * @see MusicStreamingService.MusicTrack
	 * @generated
	 */
	EClass getMusicTrack();

	/**
	 * Returns the meta object for the attribute list '{@link MusicStreamingService.MusicTrack#getGenre <em>Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Genre</em>'.
	 * @see MusicStreamingService.MusicTrack#getGenre()
	 * @see #getMusicTrack()
	 * @generated
	 */
	EAttribute getMusicTrack_Genre();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.MusicTrack#getLyrics <em>Lyrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lyrics</em>'.
	 * @see MusicStreamingService.MusicTrack#getLyrics()
	 * @see #getMusicTrack()
	 * @generated
	 */
	EAttribute getMusicTrack_Lyrics();

	/**
	 * Returns the meta object for the reference list '{@link MusicStreamingService.MusicTrack#getFeatured_artist <em>Featured artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Featured artist</em>'.
	 * @see MusicStreamingService.MusicTrack#getFeatured_artist()
	 * @see #getMusicTrack()
	 * @generated
	 */
	EReference getMusicTrack_Featured_artist();

	/**
	 * Returns the meta object for class '{@link MusicStreamingService.SingleTrack <em>Single Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Track</em>'.
	 * @see MusicStreamingService.SingleTrack
	 * @generated
	 */
	EClass getSingleTrack();

	/**
	 * Returns the meta object for the container reference '{@link MusicStreamingService.SingleTrack#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see MusicStreamingService.SingleTrack#getOwner()
	 * @see #getSingleTrack()
	 * @generated
	 */
	EReference getSingleTrack_Owner();

	/**
	 * Returns the meta object for class '{@link MusicStreamingService.Album <em>Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Album</em>'.
	 * @see MusicStreamingService.Album
	 * @generated
	 */
	EClass getAlbum();

	/**
	 * Returns the meta object for the containment reference list '{@link MusicStreamingService.Album#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracks</em>'.
	 * @see MusicStreamingService.Album#getTracks()
	 * @see #getAlbum()
	 * @generated
	 */
	EReference getAlbum_Tracks();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.Album#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see MusicStreamingService.Album#getDuration()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Duration();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.Album#getImg_url <em>Img url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Img url</em>'.
	 * @see MusicStreamingService.Album#getImg_url()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Img_url();

	/**
	 * Returns the meta object for the container reference '{@link MusicStreamingService.Album#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see MusicStreamingService.Album#getOwner()
	 * @see #getAlbum()
	 * @generated
	 */
	EReference getAlbum_Owner();

	/**
	 * Returns the meta object for class '{@link MusicStreamingService.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see MusicStreamingService.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see MusicStreamingService.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Username();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see MusicStreamingService.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see MusicStreamingService.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the meta object for the reference '{@link MusicStreamingService.User#getFollowed_artist <em>Followed artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Followed artist</em>'.
	 * @see MusicStreamingService.User#getFollowed_artist()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Followed_artist();

	/**
	 * Returns the meta object for the reference '{@link MusicStreamingService.User#getOwned_playlist <em>Owned playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned playlist</em>'.
	 * @see MusicStreamingService.User#getOwned_playlist()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Owned_playlist();

	/**
	 * Returns the meta object for the reference list '{@link MusicStreamingService.User#getSubscribed_podcast <em>Subscribed podcast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscribed podcast</em>'.
	 * @see MusicStreamingService.User#getSubscribed_podcast()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Subscribed_podcast();

	/**
	 * Returns the meta object for class '{@link MusicStreamingService.Playlist <em>Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Playlist</em>'.
	 * @see MusicStreamingService.Playlist
	 * @generated
	 */
	EClass getPlaylist();

	/**
	 * Returns the meta object for the reference list '{@link MusicStreamingService.Playlist#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tracks</em>'.
	 * @see MusicStreamingService.Playlist#getTracks()
	 * @see #getPlaylist()
	 * @generated
	 */
	EReference getPlaylist_Tracks();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.Playlist#getNum_of_tracks <em>Num of tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num of tracks</em>'.
	 * @see MusicStreamingService.Playlist#getNum_of_tracks()
	 * @see #getPlaylist()
	 * @generated
	 */
	EAttribute getPlaylist_Num_of_tracks();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.Playlist#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see MusicStreamingService.Playlist#getDuration()
	 * @see #getPlaylist()
	 * @generated
	 */
	EAttribute getPlaylist_Duration();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.Playlist#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see MusicStreamingService.Playlist#getOrder()
	 * @see #getPlaylist()
	 * @generated
	 */
	EAttribute getPlaylist_Order();

	/**
	 * Returns the meta object for the reference list '{@link MusicStreamingService.Playlist#getOwners <em>Owners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owners</em>'.
	 * @see MusicStreamingService.Playlist#getOwners()
	 * @see #getPlaylist()
	 * @generated
	 */
	EReference getPlaylist_Owners();

	/**
	 * Returns the meta object for class '{@link MusicStreamingService.Podcast <em>Podcast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Podcast</em>'.
	 * @see MusicStreamingService.Podcast
	 * @generated
	 */
	EClass getPodcast();

	/**
	 * Returns the meta object for the attribute list '{@link MusicStreamingService.Podcast#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tag</em>'.
	 * @see MusicStreamingService.Podcast#getTag()
	 * @see #getPodcast()
	 * @generated
	 */
	EAttribute getPodcast_Tag();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.Podcast#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rating</em>'.
	 * @see MusicStreamingService.Podcast#getRating()
	 * @see #getPodcast()
	 * @generated
	 */
	EAttribute getPodcast_Rating();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.Podcast#getImg_url <em>Img url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Img url</em>'.
	 * @see MusicStreamingService.Podcast#getImg_url()
	 * @see #getPodcast()
	 * @generated
	 */
	EAttribute getPodcast_Img_url();

	/**
	 * Returns the meta object for the containment reference list '{@link MusicStreamingService.Podcast#getEpisodes <em>Episodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Episodes</em>'.
	 * @see MusicStreamingService.Podcast#getEpisodes()
	 * @see #getPodcast()
	 * @generated
	 */
	EReference getPodcast_Episodes();

	/**
	 * Returns the meta object for the reference list '{@link MusicStreamingService.Podcast#getFollowers <em>Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Followers</em>'.
	 * @see MusicStreamingService.Podcast#getFollowers()
	 * @see #getPodcast()
	 * @generated
	 */
	EReference getPodcast_Followers();

	/**
	 * Returns the meta object for class '{@link MusicStreamingService.Episodes <em>Episodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Episodes</em>'.
	 * @see MusicStreamingService.Episodes
	 * @generated
	 */
	EClass getEpisodes();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.Episodes#getDate_created <em>Date created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date created</em>'.
	 * @see MusicStreamingService.Episodes#getDate_created()
	 * @see #getEpisodes()
	 * @generated
	 */
	EAttribute getEpisodes_Date_created();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.Episodes#getTranscript <em>Transcript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transcript</em>'.
	 * @see MusicStreamingService.Episodes#getTranscript()
	 * @see #getEpisodes()
	 * @generated
	 */
	EAttribute getEpisodes_Transcript();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.Episodes#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MusicStreamingService.Episodes#getDescription()
	 * @see #getEpisodes()
	 * @generated
	 */
	EAttribute getEpisodes_Description();

	/**
	 * Returns the meta object for class '{@link MusicStreamingService.AlbumTrack <em>Album Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Album Track</em>'.
	 * @see MusicStreamingService.AlbumTrack
	 * @generated
	 */
	EClass getAlbumTrack();

	/**
	 * Returns the meta object for the attribute '{@link MusicStreamingService.AlbumTrack#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see MusicStreamingService.AlbumTrack#getPosition()
	 * @see #getAlbumTrack()
	 * @generated
	 */
	EAttribute getAlbumTrack_Position();

	/**
	 * Returns the meta object for enum '{@link MusicStreamingService.PodcastTag <em>Podcast Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Podcast Tag</em>'.
	 * @see MusicStreamingService.PodcastTag
	 * @generated
	 */
	EEnum getPodcastTag();

	/**
	 * Returns the meta object for enum '{@link MusicStreamingService.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order</em>'.
	 * @see MusicStreamingService.Order
	 * @generated
	 */
	EEnum getOrder();

	/**
	 * Returns the meta object for enum '{@link MusicStreamingService.MusicGenre <em>Music Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Music Genre</em>'.
	 * @see MusicStreamingService.MusicGenre
	 * @generated
	 */
	EEnum getMusicGenre();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MusicStreamingServiceFactory getMusicStreamingServiceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MusicStreamingService.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MusicStreamingService.impl.NamedElementImpl
		 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link MusicStreamingService.impl.StreamingServiceImpl <em>Streaming Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MusicStreamingService.impl.StreamingServiceImpl
		 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getStreamingService()
		 * @generated
		 */
		EClass STREAMING_SERVICE = eINSTANCE.getStreamingService();

		/**
		 * The meta object literal for the '<em><b>Listeners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAMING_SERVICE__LISTENERS = eINSTANCE.getStreamingService_Listeners();

		/**
		 * The meta object literal for the '<em><b>Artist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAMING_SERVICE__ARTIST = eINSTANCE.getStreamingService_Artist();

		/**
		 * The meta object literal for the '<em><b>Podcasts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAMING_SERVICE__PODCASTS = eINSTANCE.getStreamingService_Podcasts();

		/**
		 * The meta object literal for the '<em><b>Playlist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAMING_SERVICE__PLAYLIST = eINSTANCE.getStreamingService_Playlist();

		/**
		 * The meta object literal for the '{@link MusicStreamingService.impl.ComposerImpl <em>Composer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MusicStreamingService.impl.ComposerImpl
		 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getComposer()
		 * @generated
		 */
		EClass COMPOSER = eINSTANCE.getComposer();

		/**
		 * The meta object literal for the '{@link MusicStreamingService.impl.ArtistImpl <em>Artist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MusicStreamingService.impl.ArtistImpl
		 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getArtist()
		 * @generated
		 */
		EClass ARTIST = eINSTANCE.getArtist();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIST__ABOUT = eINSTANCE.getArtist_About();

		/**
		 * The meta object literal for the '<em><b>Followers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIST__FOLLOWERS = eINSTANCE.getArtist_Followers();

		/**
		 * The meta object literal for the '<em><b>Img url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIST__IMG_URL = eINSTANCE.getArtist_Img_url();

		/**
		 * The meta object literal for the '<em><b>Num of listeners</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIST__NUM_OF_LISTENERS = eINSTANCE.getArtist_Num_of_listeners();

		/**
		 * The meta object literal for the '<em><b>Owned albums</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIST__OWNED_ALBUMS = eINSTANCE.getArtist_Owned_albums();

		/**
		 * The meta object literal for the '<em><b>Owned solos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIST__OWNED_SOLOS = eINSTANCE.getArtist_Owned_solos();

		/**
		 * The meta object literal for the '<em><b>Featured in</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIST__FEATURED_IN = eINSTANCE.getArtist_Featured_in();

		/**
		 * The meta object literal for the '{@link MusicStreamingService.impl.TrackImpl <em>Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MusicStreamingService.impl.TrackImpl
		 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getTrack()
		 * @generated
		 */
		EClass TRACK = eINSTANCE.getTrack();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__DURATION = eINSTANCE.getTrack_Duration();

		/**
		 * The meta object literal for the '{@link MusicStreamingService.impl.MusicTrackImpl <em>Music Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MusicStreamingService.impl.MusicTrackImpl
		 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getMusicTrack()
		 * @generated
		 */
		EClass MUSIC_TRACK = eINSTANCE.getMusicTrack();

		/**
		 * The meta object literal for the '<em><b>Genre</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUSIC_TRACK__GENRE = eINSTANCE.getMusicTrack_Genre();

		/**
		 * The meta object literal for the '<em><b>Lyrics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUSIC_TRACK__LYRICS = eINSTANCE.getMusicTrack_Lyrics();

		/**
		 * The meta object literal for the '<em><b>Featured artist</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUSIC_TRACK__FEATURED_ARTIST = eINSTANCE.getMusicTrack_Featured_artist();

		/**
		 * The meta object literal for the '{@link MusicStreamingService.impl.SingleTrackImpl <em>Single Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MusicStreamingService.impl.SingleTrackImpl
		 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getSingleTrack()
		 * @generated
		 */
		EClass SINGLE_TRACK = eINSTANCE.getSingleTrack();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_TRACK__OWNER = eINSTANCE.getSingleTrack_Owner();

		/**
		 * The meta object literal for the '{@link MusicStreamingService.impl.AlbumImpl <em>Album</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MusicStreamingService.impl.AlbumImpl
		 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getAlbum()
		 * @generated
		 */
		EClass ALBUM = eINSTANCE.getAlbum();

		/**
		 * The meta object literal for the '<em><b>Tracks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALBUM__TRACKS = eINSTANCE.getAlbum_Tracks();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__DURATION = eINSTANCE.getAlbum_Duration();

		/**
		 * The meta object literal for the '<em><b>Img url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__IMG_URL = eINSTANCE.getAlbum_Img_url();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALBUM__OWNER = eINSTANCE.getAlbum_Owner();

		/**
		 * The meta object literal for the '{@link MusicStreamingService.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MusicStreamingService.impl.UserImpl
		 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USERNAME = eINSTANCE.getUser_Username();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

		/**
		 * The meta object literal for the '<em><b>Followed artist</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__FOLLOWED_ARTIST = eINSTANCE.getUser_Followed_artist();

		/**
		 * The meta object literal for the '<em><b>Owned playlist</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__OWNED_PLAYLIST = eINSTANCE.getUser_Owned_playlist();

		/**
		 * The meta object literal for the '<em><b>Subscribed podcast</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__SUBSCRIBED_PODCAST = eINSTANCE.getUser_Subscribed_podcast();

		/**
		 * The meta object literal for the '{@link MusicStreamingService.impl.PlaylistImpl <em>Playlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MusicStreamingService.impl.PlaylistImpl
		 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getPlaylist()
		 * @generated
		 */
		EClass PLAYLIST = eINSTANCE.getPlaylist();

		/**
		 * The meta object literal for the '<em><b>Tracks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYLIST__TRACKS = eINSTANCE.getPlaylist_Tracks();

		/**
		 * The meta object literal for the '<em><b>Num of tracks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYLIST__NUM_OF_TRACKS = eINSTANCE.getPlaylist_Num_of_tracks();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYLIST__DURATION = eINSTANCE.getPlaylist_Duration();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYLIST__ORDER = eINSTANCE.getPlaylist_Order();

		/**
		 * The meta object literal for the '<em><b>Owners</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYLIST__OWNERS = eINSTANCE.getPlaylist_Owners();

		/**
		 * The meta object literal for the '{@link MusicStreamingService.impl.PodcastImpl <em>Podcast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MusicStreamingService.impl.PodcastImpl
		 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getPodcast()
		 * @generated
		 */
		EClass PODCAST = eINSTANCE.getPodcast();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PODCAST__TAG = eINSTANCE.getPodcast_Tag();

		/**
		 * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PODCAST__RATING = eINSTANCE.getPodcast_Rating();

		/**
		 * The meta object literal for the '<em><b>Img url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PODCAST__IMG_URL = eINSTANCE.getPodcast_Img_url();

		/**
		 * The meta object literal for the '<em><b>Episodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PODCAST__EPISODES = eINSTANCE.getPodcast_Episodes();

		/**
		 * The meta object literal for the '<em><b>Followers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PODCAST__FOLLOWERS = eINSTANCE.getPodcast_Followers();

		/**
		 * The meta object literal for the '{@link MusicStreamingService.impl.EpisodesImpl <em>Episodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MusicStreamingService.impl.EpisodesImpl
		 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getEpisodes()
		 * @generated
		 */
		EClass EPISODES = eINSTANCE.getEpisodes();

		/**
		 * The meta object literal for the '<em><b>Date created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPISODES__DATE_CREATED = eINSTANCE.getEpisodes_Date_created();

		/**
		 * The meta object literal for the '<em><b>Transcript</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPISODES__TRANSCRIPT = eINSTANCE.getEpisodes_Transcript();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPISODES__DESCRIPTION = eINSTANCE.getEpisodes_Description();

		/**
		 * The meta object literal for the '{@link MusicStreamingService.impl.AlbumTrackImpl <em>Album Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MusicStreamingService.impl.AlbumTrackImpl
		 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getAlbumTrack()
		 * @generated
		 */
		EClass ALBUM_TRACK = eINSTANCE.getAlbumTrack();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM_TRACK__POSITION = eINSTANCE.getAlbumTrack_Position();

		/**
		 * The meta object literal for the '{@link MusicStreamingService.PodcastTag <em>Podcast Tag</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MusicStreamingService.PodcastTag
		 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getPodcastTag()
		 * @generated
		 */
		EEnum PODCAST_TAG = eINSTANCE.getPodcastTag();

		/**
		 * The meta object literal for the '{@link MusicStreamingService.Order <em>Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MusicStreamingService.Order
		 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getOrder()
		 * @generated
		 */
		EEnum ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '{@link MusicStreamingService.MusicGenre <em>Music Genre</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MusicStreamingService.MusicGenre
		 * @see MusicStreamingService.impl.MusicStreamingServicePackageImpl#getMusicGenre()
		 * @generated
		 */
		EEnum MUSIC_GENRE = eINSTANCE.getMusicGenre();

	}

} //MusicStreamingServicePackage
