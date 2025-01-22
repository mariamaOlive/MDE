/**
 */
package MusicStreamingService.util;

import MusicStreamingService.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see MusicStreamingService.MusicStreamingServicePackage
 * @generated
 */
public class MusicStreamingServiceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MusicStreamingServiceValidator INSTANCE = new MusicStreamingServiceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "MusicStreamingService";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Have Album Or Solo' of 'Artist'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARTIST__MUST_HAVE_ALBUM_OR_SOLO = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Playlist Must Have Tracks' of 'Playlist'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAYLIST__PLAYLIST_MUST_HAVE_TRACKS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Podcast Must Have Episodes' of 'Podcast'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PODCAST__PODCAST_MUST_HAVE_EPISODES = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicStreamingServiceValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MusicStreamingServicePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MusicStreamingServicePackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case MusicStreamingServicePackage.STREAMING_SERVICE:
				return validateStreamingService((StreamingService)value, diagnostics, context);
			case MusicStreamingServicePackage.ARTIST:
				return validateArtist((Artist)value, diagnostics, context);
			case MusicStreamingServicePackage.AUDIO_TRACK:
				return validateAudioTrack((AudioTrack)value, diagnostics, context);
			case MusicStreamingServicePackage.MUSIC_TRACK:
				return validateMusicTrack((MusicTrack)value, diagnostics, context);
			case MusicStreamingServicePackage.SINGLE_TRACK:
				return validateSingleTrack((SingleTrack)value, diagnostics, context);
			case MusicStreamingServicePackage.ALBUM:
				return validateAlbum((Album)value, diagnostics, context);
			case MusicStreamingServicePackage.USER:
				return validateUser((User)value, diagnostics, context);
			case MusicStreamingServicePackage.PLAYLIST:
				return validatePlaylist((Playlist)value, diagnostics, context);
			case MusicStreamingServicePackage.PODCAST:
				return validatePodcast((Podcast)value, diagnostics, context);
			case MusicStreamingServicePackage.PODCAST_EPISODE:
				return validatePodcastEpisode((PodcastEpisode)value, diagnostics, context);
			case MusicStreamingServicePackage.ALBUM_TRACK:
				return validateAlbumTrack((AlbumTrack)value, diagnostics, context);
			case MusicStreamingServicePackage.STUDIO_ALBUM:
				return validateStudioAlbum((StudioAlbum)value, diagnostics, context);
			case MusicStreamingServicePackage.LIVE_ALBUM:
				return validateLiveAlbum((LiveAlbum)value, diagnostics, context);
			case MusicStreamingServicePackage.CONCERT:
				return validateConcert((Concert)value, diagnostics, context);
			case MusicStreamingServicePackage.PODCAST_CATEGORY:
				return validatePodcastCategory((PodcastCategory)value, diagnostics, context);
			case MusicStreamingServicePackage.ORDER:
				return validateOrder((Order)value, diagnostics, context);
			case MusicStreamingServicePackage.MUSIC_GENRE:
				return validateMusicGenre((MusicGenre)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreamingService(StreamingService streamingService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(streamingService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtist(Artist artist, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(artist, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(artist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(artist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(artist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(artist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(artist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(artist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(artist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(artist, diagnostics, context);
		if (result || diagnostics != null) result &= validateArtist_MustHaveAlbumOrSolo(artist, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MustHaveAlbumOrSolo constraint of '<em>Artist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtist_MustHaveAlbumOrSolo(Artist artist, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return artist.MustHaveAlbumOrSolo(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAudioTrack(AudioTrack audioTrack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(audioTrack, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMusicTrack(MusicTrack musicTrack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(musicTrack, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleTrack(SingleTrack singleTrack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleTrack, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlbum(Album album, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(album, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(user, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlaylist(Playlist playlist, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(playlist, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(playlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(playlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(playlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(playlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(playlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(playlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(playlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(playlist, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlaylist_PlaylistMustHaveTracks(playlist, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PlaylistMustHaveTracks constraint of '<em>Playlist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlaylist_PlaylistMustHaveTracks(Playlist playlist, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return playlist.PlaylistMustHaveTracks(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePodcast(Podcast podcast, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(podcast, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(podcast, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(podcast, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(podcast, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(podcast, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(podcast, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(podcast, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(podcast, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(podcast, diagnostics, context);
		if (result || diagnostics != null) result &= validatePodcast_PodcastMustHaveEpisodes(podcast, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PodcastMustHaveEpisodes constraint of '<em>Podcast</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePodcast_PodcastMustHaveEpisodes(Podcast podcast, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return podcast.PodcastMustHaveEpisodes(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePodcastEpisode(PodcastEpisode podcastEpisode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(podcastEpisode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlbumTrack(AlbumTrack albumTrack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(albumTrack, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudioAlbum(StudioAlbum studioAlbum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studioAlbum, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiveAlbum(LiveAlbum liveAlbum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(liveAlbum, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcert(Concert concert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(concert, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePodcastCategory(PodcastCategory podcastCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMusicGenre(MusicGenre musicGenre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MusicStreamingServiceValidator
