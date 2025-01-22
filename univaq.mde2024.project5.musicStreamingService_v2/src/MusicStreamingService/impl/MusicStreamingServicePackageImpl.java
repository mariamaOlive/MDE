/**
 */
package MusicStreamingService.impl;

import MusicStreamingService.Album;
import MusicStreamingService.AlbumTrack;
import MusicStreamingService.Artist;
import MusicStreamingService.AudioTrack;
import MusicStreamingService.Concert;
import MusicStreamingService.LiveAlbum;
import MusicStreamingService.MusicGenre;
import MusicStreamingService.MusicStreamingServiceFactory;
import MusicStreamingService.MusicStreamingServicePackage;
import MusicStreamingService.MusicTrack;
import MusicStreamingService.NamedElement;
import MusicStreamingService.Order;
import MusicStreamingService.Playlist;
import MusicStreamingService.Podcast;
import MusicStreamingService.PodcastCategory;
import MusicStreamingService.PodcastEpisode;
import MusicStreamingService.SingleTrack;
import MusicStreamingService.StreamingService;
import MusicStreamingService.StudioAlbum;
import MusicStreamingService.User;

import MusicStreamingService.util.MusicStreamingServiceValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MusicStreamingServicePackageImpl extends EPackageImpl implements MusicStreamingServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamingServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioTrackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass musicTrackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleTrackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass albumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playlistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass podcastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass podcastEpisodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass albumTrackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studioAlbumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveAlbumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum podcastCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum musicGenreEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see MusicStreamingService.MusicStreamingServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MusicStreamingServicePackageImpl() {
		super(eNS_URI, MusicStreamingServiceFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MusicStreamingServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MusicStreamingServicePackage init() {
		if (isInited) return (MusicStreamingServicePackage)EPackage.Registry.INSTANCE.getEPackage(MusicStreamingServicePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMusicStreamingServicePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MusicStreamingServicePackageImpl theMusicStreamingServicePackage = registeredMusicStreamingServicePackage instanceof MusicStreamingServicePackageImpl ? (MusicStreamingServicePackageImpl)registeredMusicStreamingServicePackage : new MusicStreamingServicePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMusicStreamingServicePackage.createPackageContents();

		// Initialize created meta-data
		theMusicStreamingServicePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMusicStreamingServicePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return MusicStreamingServiceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMusicStreamingServicePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MusicStreamingServicePackage.eNS_URI, theMusicStreamingServicePackage);
		return theMusicStreamingServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStreamingService() {
		return streamingServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStreamingService_Listeners() {
		return (EReference)streamingServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStreamingService_Artist() {
		return (EReference)streamingServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStreamingService_Podcasts() {
		return (EReference)streamingServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStreamingService_Playlist() {
		return (EReference)streamingServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStreamingService_Concert() {
		return (EReference)streamingServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtist() {
		return artistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtist_About() {
		return (EAttribute)artistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtist_Followers() {
		return (EReference)artistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtist_Img_url() {
		return (EAttribute)artistEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtist_Num_of_listeners() {
		return (EAttribute)artistEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtist_Owned_albums() {
		return (EReference)artistEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtist_Owned_solos() {
		return (EReference)artistEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtist_Featured_in() {
		return (EReference)artistEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArtist__MustHaveAlbumOrSolo__DiagnosticChain_Map() {
		return artistEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAudioTrack() {
		return audioTrackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioTrack_Duration() {
		return (EAttribute)audioTrackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMusicTrack() {
		return musicTrackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMusicTrack_Genre() {
		return (EAttribute)musicTrackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMusicTrack_Lyrics() {
		return (EAttribute)musicTrackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMusicTrack_Featured_artist() {
		return (EReference)musicTrackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleTrack() {
		return singleTrackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleTrack_Owner() {
		return (EReference)singleTrackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlbum() {
		return albumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlbum_Tracks() {
		return (EReference)albumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlbum_Duration() {
		return (EAttribute)albumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlbum_Img_url() {
		return (EAttribute)albumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlbum_Owner() {
		return (EReference)albumEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAlbum__CalculateTotalDuration() {
		return albumEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Username() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Email() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Password() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Followed_artist() {
		return (EReference)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Owned_playlist() {
		return (EReference)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Subscribed_podcast() {
		return (EReference)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__GetPodcastsByTag__PodcastCategory() {
		return userEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlaylist() {
		return playlistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlaylist_Tracks() {
		return (EReference)playlistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaylist_Num_of_tracks() {
		return (EAttribute)playlistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaylist_Duration() {
		return (EAttribute)playlistEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaylist_Order() {
		return (EAttribute)playlistEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlaylist_Owners() {
		return (EReference)playlistEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPlaylist__PlaylistMustHaveTracks__DiagnosticChain_Map() {
		return playlistEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPodcast() {
		return podcastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPodcast_Category() {
		return (EAttribute)podcastEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPodcast_Rating() {
		return (EAttribute)podcastEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPodcast_Img_url() {
		return (EAttribute)podcastEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPodcast_Episodes() {
		return (EReference)podcastEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPodcast_Followers() {
		return (EReference)podcastEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPodcast__PodcastMustHaveEpisodes__DiagnosticChain_Map() {
		return podcastEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPodcastEpisode() {
		return podcastEpisodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPodcastEpisode_Date_created() {
		return (EAttribute)podcastEpisodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPodcastEpisode_Transcript() {
		return (EAttribute)podcastEpisodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPodcastEpisode_Description() {
		return (EAttribute)podcastEpisodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlbumTrack() {
		return albumTrackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlbumTrack_Position() {
		return (EAttribute)albumTrackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStudioAlbum() {
		return studioAlbumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStudioAlbum_RecordingStudio() {
		return (EAttribute)studioAlbumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiveAlbum() {
		return liveAlbumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiveAlbum_EventLocation() {
		return (EAttribute)liveAlbumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcert() {
		return concertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcert_Date() {
		return (EAttribute)concertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcert_Location() {
		return (EAttribute)concertEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcert_Artists() {
		return (EReference)concertEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPodcastCategory() {
		return podcastCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrder() {
		return orderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMusicGenre() {
		return musicGenreEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MusicStreamingServiceFactory getMusicStreamingServiceFactory() {
		return (MusicStreamingServiceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		streamingServiceEClass = createEClass(STREAMING_SERVICE);
		createEReference(streamingServiceEClass, STREAMING_SERVICE__LISTENERS);
		createEReference(streamingServiceEClass, STREAMING_SERVICE__ARTIST);
		createEReference(streamingServiceEClass, STREAMING_SERVICE__PODCASTS);
		createEReference(streamingServiceEClass, STREAMING_SERVICE__PLAYLIST);
		createEReference(streamingServiceEClass, STREAMING_SERVICE__CONCERT);

		artistEClass = createEClass(ARTIST);
		createEAttribute(artistEClass, ARTIST__ABOUT);
		createEReference(artistEClass, ARTIST__FOLLOWERS);
		createEAttribute(artistEClass, ARTIST__IMG_URL);
		createEAttribute(artistEClass, ARTIST__NUM_OF_LISTENERS);
		createEReference(artistEClass, ARTIST__OWNED_ALBUMS);
		createEReference(artistEClass, ARTIST__OWNED_SOLOS);
		createEReference(artistEClass, ARTIST__FEATURED_IN);
		createEOperation(artistEClass, ARTIST___MUST_HAVE_ALBUM_OR_SOLO__DIAGNOSTICCHAIN_MAP);

		audioTrackEClass = createEClass(AUDIO_TRACK);
		createEAttribute(audioTrackEClass, AUDIO_TRACK__DURATION);

		musicTrackEClass = createEClass(MUSIC_TRACK);
		createEAttribute(musicTrackEClass, MUSIC_TRACK__GENRE);
		createEAttribute(musicTrackEClass, MUSIC_TRACK__LYRICS);
		createEReference(musicTrackEClass, MUSIC_TRACK__FEATURED_ARTIST);

		singleTrackEClass = createEClass(SINGLE_TRACK);
		createEReference(singleTrackEClass, SINGLE_TRACK__OWNER);

		albumEClass = createEClass(ALBUM);
		createEReference(albumEClass, ALBUM__TRACKS);
		createEAttribute(albumEClass, ALBUM__DURATION);
		createEAttribute(albumEClass, ALBUM__IMG_URL);
		createEReference(albumEClass, ALBUM__OWNER);
		createEOperation(albumEClass, ALBUM___CALCULATE_TOTAL_DURATION);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__USERNAME);
		createEAttribute(userEClass, USER__EMAIL);
		createEAttribute(userEClass, USER__PASSWORD);
		createEReference(userEClass, USER__FOLLOWED_ARTIST);
		createEReference(userEClass, USER__OWNED_PLAYLIST);
		createEReference(userEClass, USER__SUBSCRIBED_PODCAST);
		createEOperation(userEClass, USER___GET_PODCASTS_BY_TAG__PODCASTCATEGORY);

		playlistEClass = createEClass(PLAYLIST);
		createEReference(playlistEClass, PLAYLIST__TRACKS);
		createEAttribute(playlistEClass, PLAYLIST__NUM_OF_TRACKS);
		createEAttribute(playlistEClass, PLAYLIST__DURATION);
		createEAttribute(playlistEClass, PLAYLIST__ORDER);
		createEReference(playlistEClass, PLAYLIST__OWNERS);
		createEOperation(playlistEClass, PLAYLIST___PLAYLIST_MUST_HAVE_TRACKS__DIAGNOSTICCHAIN_MAP);

		podcastEClass = createEClass(PODCAST);
		createEAttribute(podcastEClass, PODCAST__CATEGORY);
		createEAttribute(podcastEClass, PODCAST__RATING);
		createEAttribute(podcastEClass, PODCAST__IMG_URL);
		createEReference(podcastEClass, PODCAST__EPISODES);
		createEReference(podcastEClass, PODCAST__FOLLOWERS);
		createEOperation(podcastEClass, PODCAST___PODCAST_MUST_HAVE_EPISODES__DIAGNOSTICCHAIN_MAP);

		podcastEpisodeEClass = createEClass(PODCAST_EPISODE);
		createEAttribute(podcastEpisodeEClass, PODCAST_EPISODE__DATE_CREATED);
		createEAttribute(podcastEpisodeEClass, PODCAST_EPISODE__TRANSCRIPT);
		createEAttribute(podcastEpisodeEClass, PODCAST_EPISODE__DESCRIPTION);

		albumTrackEClass = createEClass(ALBUM_TRACK);
		createEAttribute(albumTrackEClass, ALBUM_TRACK__POSITION);

		studioAlbumEClass = createEClass(STUDIO_ALBUM);
		createEAttribute(studioAlbumEClass, STUDIO_ALBUM__RECORDING_STUDIO);

		liveAlbumEClass = createEClass(LIVE_ALBUM);
		createEAttribute(liveAlbumEClass, LIVE_ALBUM__EVENT_LOCATION);

		concertEClass = createEClass(CONCERT);
		createEAttribute(concertEClass, CONCERT__DATE);
		createEAttribute(concertEClass, CONCERT__LOCATION);
		createEReference(concertEClass, CONCERT__ARTISTS);

		// Create enums
		podcastCategoryEEnum = createEEnum(PODCAST_CATEGORY);
		orderEEnum = createEEnum(ORDER);
		musicGenreEEnum = createEEnum(MUSIC_GENRE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		streamingServiceEClass.getESuperTypes().add(this.getNamedElement());
		artistEClass.getESuperTypes().add(this.getNamedElement());
		audioTrackEClass.getESuperTypes().add(this.getNamedElement());
		musicTrackEClass.getESuperTypes().add(this.getAudioTrack());
		singleTrackEClass.getESuperTypes().add(this.getMusicTrack());
		albumEClass.getESuperTypes().add(this.getNamedElement());
		userEClass.getESuperTypes().add(this.getNamedElement());
		playlistEClass.getESuperTypes().add(this.getNamedElement());
		podcastEClass.getESuperTypes().add(this.getNamedElement());
		podcastEpisodeEClass.getESuperTypes().add(this.getAudioTrack());
		albumTrackEClass.getESuperTypes().add(this.getMusicTrack());
		studioAlbumEClass.getESuperTypes().add(this.getAlbum());
		liveAlbumEClass.getESuperTypes().add(this.getAlbum());
		concertEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "Name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(streamingServiceEClass, StreamingService.class, "StreamingService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStreamingService_Listeners(), this.getUser(), null, "listeners", null, 0, -1, StreamingService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStreamingService_Artist(), this.getArtist(), null, "Artist", null, 1, -1, StreamingService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStreamingService_Podcasts(), this.getPodcast(), null, "podcasts", null, 0, -1, StreamingService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStreamingService_Playlist(), this.getPlaylist(), null, "Playlist", null, 0, -1, StreamingService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStreamingService_Concert(), this.getConcert(), null, "Concert", null, 0, -1, StreamingService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artistEClass, Artist.class, "Artist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtist_About(), ecorePackage.getEString(), "about", "About the artist", 1, 1, Artist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtist_Followers(), this.getUser(), this.getUser_Followed_artist(), "followers", null, 0, -1, Artist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArtist_Img_url(), ecorePackage.getEString(), "img_url", null, 0, 1, Artist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtist_Num_of_listeners(), ecorePackage.getEInt(), "num_of_listeners", null, 0, 1, Artist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtist_Owned_albums(), this.getAlbum(), this.getAlbum_Owner(), "owned_albums", null, 0, -1, Artist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtist_Owned_solos(), this.getSingleTrack(), this.getSingleTrack_Owner(), "owned_solos", null, 0, -1, Artist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtist_Featured_in(), this.getMusicTrack(), this.getMusicTrack_Featured_artist(), "featured_in", null, 0, 1, Artist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getArtist__MustHaveAlbumOrSolo__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "MustHaveAlbumOrSolo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(audioTrackEClass, AudioTrack.class, "AudioTrack", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudioTrack_Duration(), ecorePackage.getEInt(), "duration", "1", 1, 1, AudioTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(musicTrackEClass, MusicTrack.class, "MusicTrack", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMusicTrack_Genre(), this.getMusicGenre(), "genre", null, 1, -1, MusicTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMusicTrack_Lyrics(), ecorePackage.getEString(), "lyrics", null, 0, 1, MusicTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMusicTrack_Featured_artist(), this.getArtist(), this.getArtist_Featured_in(), "featured_artist", null, 0, -1, MusicTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleTrackEClass, SingleTrack.class, "SingleTrack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleTrack_Owner(), this.getArtist(), this.getArtist_Owned_solos(), "owner", null, 1, 1, SingleTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(albumEClass, Album.class, "Album", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlbum_Tracks(), this.getAlbumTrack(), null, "tracks", null, 1, -1, Album.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlbum_Duration(), ecorePackage.getEInt(), "duration", null, 1, 1, Album.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlbum_Img_url(), ecorePackage.getEString(), "img_url", null, 1, 1, Album.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlbum_Owner(), this.getArtist(), this.getArtist_Owned_albums(), "owner", null, 1, 1, Album.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAlbum__CalculateTotalDuration(), ecorePackage.getEInt(), "calculateTotalDuration", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Username(), ecorePackage.getEString(), "username", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Email(), ecorePackage.getEString(), "email", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Password(), ecorePackage.getEString(), "password", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Followed_artist(), this.getArtist(), this.getArtist_Followers(), "followed_artist", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Owned_playlist(), this.getPlaylist(), this.getPlaylist_Owners(), "owned_playlist", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Subscribed_podcast(), this.getPodcast(), this.getPodcast_Followers(), "subscribed_podcast", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getUser__GetPodcastsByTag__PodcastCategory(), this.getPodcast(), "getPodcastsByTag", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPodcastCategory(), "tag", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(playlistEClass, Playlist.class, "Playlist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaylist_Tracks(), this.getAudioTrack(), null, "tracks", null, 1, -1, Playlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaylist_Num_of_tracks(), ecorePackage.getEInt(), "num_of_tracks", null, 1, 1, Playlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaylist_Duration(), ecorePackage.getEInt(), "duration", null, 1, 1, Playlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaylist_Order(), this.getOrder(), "order", null, 1, 1, Playlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaylist_Owners(), this.getUser(), this.getUser_Owned_playlist(), "owners", null, 1, -1, Playlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPlaylist__PlaylistMustHaveTracks__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "PlaylistMustHaveTracks", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(podcastEClass, Podcast.class, "Podcast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPodcast_Category(), this.getPodcastCategory(), "category", null, 1, -1, Podcast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPodcast_Rating(), ecorePackage.getEFloat(), "rating", "0", 1, 1, Podcast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPodcast_Img_url(), ecorePackage.getEString(), "img_url", null, 0, 1, Podcast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPodcast_Episodes(), this.getPodcastEpisode(), null, "episodes", null, 1, -1, Podcast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPodcast_Followers(), this.getUser(), this.getUser_Subscribed_podcast(), "followers", null, 0, -1, Podcast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPodcast__PodcastMustHaveEpisodes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "PodcastMustHaveEpisodes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(podcastEpisodeEClass, PodcastEpisode.class, "PodcastEpisode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPodcastEpisode_Date_created(), ecorePackage.getEDate(), "date_created", "2024-06-17T10:15:30", 1, 1, PodcastEpisode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPodcastEpisode_Transcript(), ecorePackage.getEString(), "transcript", null, 0, 1, PodcastEpisode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPodcastEpisode_Description(), ecorePackage.getEString(), "description", null, 1, 1, PodcastEpisode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(albumTrackEClass, AlbumTrack.class, "AlbumTrack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlbumTrack_Position(), ecorePackage.getEInt(), "position", null, 1, 1, AlbumTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studioAlbumEClass, StudioAlbum.class, "StudioAlbum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStudioAlbum_RecordingStudio(), ecorePackage.getEString(), "recordingStudio", null, 1, 1, StudioAlbum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveAlbumEClass, LiveAlbum.class, "LiveAlbum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveAlbum_EventLocation(), ecorePackage.getEString(), "eventLocation", null, 1, 1, LiveAlbum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concertEClass, Concert.class, "Concert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcert_Date(), ecorePackage.getEDate(), "date", null, 1, 1, Concert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcert_Location(), ecorePackage.getEString(), "location", null, 1, 1, Concert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcert_Artists(), this.getArtist(), null, "Artists", null, 1, -1, Concert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(podcastCategoryEEnum, PodcastCategory.class, "PodcastCategory");
		addEEnumLiteral(podcastCategoryEEnum, PodcastCategory.FILM);
		addEEnumLiteral(podcastCategoryEEnum, PodcastCategory.LIFESTYLE);
		addEEnumLiteral(podcastCategoryEEnum, PodcastCategory.EDUCATION);
		addEEnumLiteral(podcastCategoryEEnum, PodcastCategory.POLITICS);
		addEEnumLiteral(podcastCategoryEEnum, PodcastCategory.SCIENCE);
		addEEnumLiteral(podcastCategoryEEnum, PodcastCategory.TECHNOLOGY);

		initEEnum(orderEEnum, Order.class, "Order");
		addEEnumLiteral(orderEEnum, Order.DEFAULT);
		addEEnumLiteral(orderEEnum, Order.TRACK_LENGTH);
		addEEnumLiteral(orderEEnum, Order.DATE_ADDED);

		initEEnum(musicGenreEEnum, MusicGenre.class, "MusicGenre");
		addEEnumLiteral(musicGenreEEnum, MusicGenre.REGGAE);
		addEEnumLiteral(musicGenreEEnum, MusicGenre.HIP_HOP);
		addEEnumLiteral(musicGenreEEnum, MusicGenre.ROCK);
		addEEnumLiteral(musicGenreEEnum, MusicGenre.AFROBEAT);
		addEEnumLiteral(musicGenreEEnum, MusicGenre.POP);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (artistEClass,
		   source,
		   new String[] {
			   "constraints", "MustHaveAlbumOrSolo"
		   });
		addAnnotation
		  (playlistEClass,
		   source,
		   new String[] {
			   "constraints", "PlaylistMustHaveTracks"
		   });
		addAnnotation
		  (podcastEClass,
		   source,
		   new String[] {
			   "constraints", "PodcastMustHaveEpisodes"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getArtist__MustHaveAlbumOrSolo__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n            owned_albums->size()>0 or owned_solos->size()>0"
		   });
		addAnnotation
		  (getAlbum__CalculateTotalDuration(),
		   source,
		   new String[] {
			   "body", "tracks->collect(duration)->sum()"
		   });
		addAnnotation
		  (getUser__GetPodcastsByTag__PodcastCategory(),
		   source,
		   new String[] {
			   "body", "subscribed_podcast->select(p | p.category->includes(tag))->asOrderedSet()"
		   });
		addAnnotation
		  (getPlaylist__PlaylistMustHaveTracks__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n            not tracks->isEmpty()"
		   });
		addAnnotation
		  (getPodcast__PodcastMustHaveEpisodes__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \t\tnot episodes->isEmpty()"
		   });
	}

} //MusicStreamingServicePackageImpl
