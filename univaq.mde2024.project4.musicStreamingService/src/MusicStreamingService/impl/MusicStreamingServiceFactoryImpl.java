/**
 */
package MusicStreamingService.impl;

import MusicStreamingService.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MusicStreamingServiceFactoryImpl extends EFactoryImpl implements MusicStreamingServiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MusicStreamingServiceFactory init() {
		try {
			MusicStreamingServiceFactory theMusicStreamingServiceFactory = (MusicStreamingServiceFactory)EPackage.Registry.INSTANCE.getEFactory(MusicStreamingServicePackage.eNS_URI);
			if (theMusicStreamingServiceFactory != null) {
				return theMusicStreamingServiceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MusicStreamingServiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicStreamingServiceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MusicStreamingServicePackage.STREAMING_SERVICE: return createStreamingService();
			case MusicStreamingServicePackage.COMPOSER: return createComposer();
			case MusicStreamingServicePackage.ARTIST: return createArtist();
			case MusicStreamingServicePackage.SINGLE_TRACK: return createSingleTrack();
			case MusicStreamingServicePackage.ALBUM: return createAlbum();
			case MusicStreamingServicePackage.USER: return createUser();
			case MusicStreamingServicePackage.PLAYLIST: return createPlaylist();
			case MusicStreamingServicePackage.PODCAST: return createPodcast();
			case MusicStreamingServicePackage.EPISODES: return createEpisodes();
			case MusicStreamingServicePackage.ALBUM_TRACK: return createAlbumTrack();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MusicStreamingServicePackage.PODCAST_TAG:
				return createPodcastTagFromString(eDataType, initialValue);
			case MusicStreamingServicePackage.ORDER:
				return createOrderFromString(eDataType, initialValue);
			case MusicStreamingServicePackage.MUSIC_GENRE:
				return createMusicGenreFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MusicStreamingServicePackage.PODCAST_TAG:
				return convertPodcastTagToString(eDataType, instanceValue);
			case MusicStreamingServicePackage.ORDER:
				return convertOrderToString(eDataType, instanceValue);
			case MusicStreamingServicePackage.MUSIC_GENRE:
				return convertMusicGenreToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamingService createStreamingService() {
		StreamingServiceImpl streamingService = new StreamingServiceImpl();
		return streamingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composer createComposer() {
		ComposerImpl composer = new ComposerImpl();
		return composer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artist createArtist() {
		ArtistImpl artist = new ArtistImpl();
		return artist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleTrack createSingleTrack() {
		SingleTrackImpl singleTrack = new SingleTrackImpl();
		return singleTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Album createAlbum() {
		AlbumImpl album = new AlbumImpl();
		return album;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Playlist createPlaylist() {
		PlaylistImpl playlist = new PlaylistImpl();
		return playlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Podcast createPodcast() {
		PodcastImpl podcast = new PodcastImpl();
		return podcast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Episodes createEpisodes() {
		EpisodesImpl episodes = new EpisodesImpl();
		return episodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlbumTrack createAlbumTrack() {
		AlbumTrackImpl albumTrack = new AlbumTrackImpl();
		return albumTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PodcastTag createPodcastTagFromString(EDataType eDataType, String initialValue) {
		PodcastTag result = PodcastTag.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPodcastTagToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrderFromString(EDataType eDataType, String initialValue) {
		Order result = Order.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicGenre createMusicGenreFromString(EDataType eDataType, String initialValue) {
		MusicGenre result = MusicGenre.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMusicGenreToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MusicStreamingServicePackage getMusicStreamingServicePackage() {
		return (MusicStreamingServicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MusicStreamingServicePackage getPackage() {
		return MusicStreamingServicePackage.eINSTANCE;
	}

} //MusicStreamingServiceFactoryImpl