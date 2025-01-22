/**
 */
package MusicStreamingService.util;

import MusicStreamingService.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see MusicStreamingService.MusicStreamingServicePackage
 * @generated
 */
public class MusicStreamingServiceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MusicStreamingServicePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicStreamingServiceSwitch() {
		if (modelPackage == null) {
			modelPackage = MusicStreamingServicePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MusicStreamingServicePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MusicStreamingServicePackage.STREAMING_SERVICE: {
				StreamingService streamingService = (StreamingService)theEObject;
				T result = caseStreamingService(streamingService);
				if (result == null) result = caseNamedElement(streamingService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MusicStreamingServicePackage.ARTIST: {
				Artist artist = (Artist)theEObject;
				T result = caseArtist(artist);
				if (result == null) result = caseNamedElement(artist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MusicStreamingServicePackage.AUDIO_TRACK: {
				AudioTrack audioTrack = (AudioTrack)theEObject;
				T result = caseAudioTrack(audioTrack);
				if (result == null) result = caseNamedElement(audioTrack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MusicStreamingServicePackage.MUSIC_TRACK: {
				MusicTrack musicTrack = (MusicTrack)theEObject;
				T result = caseMusicTrack(musicTrack);
				if (result == null) result = caseAudioTrack(musicTrack);
				if (result == null) result = caseNamedElement(musicTrack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MusicStreamingServicePackage.SINGLE_TRACK: {
				SingleTrack singleTrack = (SingleTrack)theEObject;
				T result = caseSingleTrack(singleTrack);
				if (result == null) result = caseMusicTrack(singleTrack);
				if (result == null) result = caseAudioTrack(singleTrack);
				if (result == null) result = caseNamedElement(singleTrack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MusicStreamingServicePackage.ALBUM: {
				Album album = (Album)theEObject;
				T result = caseAlbum(album);
				if (result == null) result = caseNamedElement(album);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MusicStreamingServicePackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseNamedElement(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MusicStreamingServicePackage.PLAYLIST: {
				Playlist playlist = (Playlist)theEObject;
				T result = casePlaylist(playlist);
				if (result == null) result = caseNamedElement(playlist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MusicStreamingServicePackage.PODCAST: {
				Podcast podcast = (Podcast)theEObject;
				T result = casePodcast(podcast);
				if (result == null) result = caseNamedElement(podcast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MusicStreamingServicePackage.PODCAST_EPISODE: {
				PodcastEpisode podcastEpisode = (PodcastEpisode)theEObject;
				T result = casePodcastEpisode(podcastEpisode);
				if (result == null) result = caseAudioTrack(podcastEpisode);
				if (result == null) result = caseNamedElement(podcastEpisode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MusicStreamingServicePackage.ALBUM_TRACK: {
				AlbumTrack albumTrack = (AlbumTrack)theEObject;
				T result = caseAlbumTrack(albumTrack);
				if (result == null) result = caseMusicTrack(albumTrack);
				if (result == null) result = caseAudioTrack(albumTrack);
				if (result == null) result = caseNamedElement(albumTrack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MusicStreamingServicePackage.STUDIO_ALBUM: {
				StudioAlbum studioAlbum = (StudioAlbum)theEObject;
				T result = caseStudioAlbum(studioAlbum);
				if (result == null) result = caseAlbum(studioAlbum);
				if (result == null) result = caseNamedElement(studioAlbum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MusicStreamingServicePackage.LIVE_ALBUM: {
				LiveAlbum liveAlbum = (LiveAlbum)theEObject;
				T result = caseLiveAlbum(liveAlbum);
				if (result == null) result = caseAlbum(liveAlbum);
				if (result == null) result = caseNamedElement(liveAlbum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MusicStreamingServicePackage.CONCERT: {
				Concert concert = (Concert)theEObject;
				T result = caseConcert(concert);
				if (result == null) result = caseNamedElement(concert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Streaming Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Streaming Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreamingService(StreamingService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtist(Artist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Track</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Track</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioTrack(AudioTrack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Music Track</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Music Track</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMusicTrack(MusicTrack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Track</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Track</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleTrack(SingleTrack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Album</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Album</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlbum(Album object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Playlist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Playlist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaylist(Playlist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Podcast</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Podcast</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePodcast(Podcast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Podcast Episode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Podcast Episode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePodcastEpisode(PodcastEpisode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Album Track</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Album Track</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlbumTrack(AlbumTrack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Studio Album</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Studio Album</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudioAlbum(StudioAlbum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Album</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Album</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveAlbum(LiveAlbum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcert(Concert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MusicStreamingServiceSwitch
