/**
 */
package MusicStreamingService.impl;

import MusicStreamingService.Artist;
import MusicStreamingService.MusicStreamingServicePackage;
import MusicStreamingService.Playlist;
import MusicStreamingService.Podcast;
import MusicStreamingService.StreamingService;
import MusicStreamingService.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Streaming Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.impl.StreamingServiceImpl#getListeners <em>Listeners</em>}</li>
 *   <li>{@link MusicStreamingService.impl.StreamingServiceImpl#getArtist <em>Artist</em>}</li>
 *   <li>{@link MusicStreamingService.impl.StreamingServiceImpl#getPodcasts <em>Podcasts</em>}</li>
 *   <li>{@link MusicStreamingService.impl.StreamingServiceImpl#getPlaylist <em>Playlist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreamingServiceImpl extends NamedElementImpl implements StreamingService {
	/**
	 * The cached value of the '{@link #getListeners() <em>Listeners</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeners()
	 * @generated
	 * @ordered
	 */
	protected EList<User> listeners;

	/**
	 * The cached value of the '{@link #getArtist() <em>Artist</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtist()
	 * @generated
	 * @ordered
	 */
	protected EList<Artist> artist;

	/**
	 * The cached value of the '{@link #getPodcasts() <em>Podcasts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcasts()
	 * @generated
	 * @ordered
	 */
	protected EList<Podcast> podcasts;

	/**
	 * The cached value of the '{@link #getPlaylist() <em>Playlist</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaylist()
	 * @generated
	 * @ordered
	 */
	protected EList<Playlist> playlist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamingServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicStreamingServicePackage.Literals.STREAMING_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getListeners() {
		if (listeners == null) {
			listeners = new EObjectContainmentEList<User>(User.class, this, MusicStreamingServicePackage.STREAMING_SERVICE__LISTENERS);
		}
		return listeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artist> getArtist() {
		if (artist == null) {
			artist = new EObjectContainmentEList<Artist>(Artist.class, this, MusicStreamingServicePackage.STREAMING_SERVICE__ARTIST);
		}
		return artist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Podcast> getPodcasts() {
		if (podcasts == null) {
			podcasts = new EObjectContainmentEList<Podcast>(Podcast.class, this, MusicStreamingServicePackage.STREAMING_SERVICE__PODCASTS);
		}
		return podcasts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Playlist> getPlaylist() {
		if (playlist == null) {
			playlist = new EObjectContainmentEList<Playlist>(Playlist.class, this, MusicStreamingServicePackage.STREAMING_SERVICE__PLAYLIST);
		}
		return playlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MusicStreamingServicePackage.STREAMING_SERVICE__LISTENERS:
				return ((InternalEList<?>)getListeners()).basicRemove(otherEnd, msgs);
			case MusicStreamingServicePackage.STREAMING_SERVICE__ARTIST:
				return ((InternalEList<?>)getArtist()).basicRemove(otherEnd, msgs);
			case MusicStreamingServicePackage.STREAMING_SERVICE__PODCASTS:
				return ((InternalEList<?>)getPodcasts()).basicRemove(otherEnd, msgs);
			case MusicStreamingServicePackage.STREAMING_SERVICE__PLAYLIST:
				return ((InternalEList<?>)getPlaylist()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MusicStreamingServicePackage.STREAMING_SERVICE__LISTENERS:
				return getListeners();
			case MusicStreamingServicePackage.STREAMING_SERVICE__ARTIST:
				return getArtist();
			case MusicStreamingServicePackage.STREAMING_SERVICE__PODCASTS:
				return getPodcasts();
			case MusicStreamingServicePackage.STREAMING_SERVICE__PLAYLIST:
				return getPlaylist();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MusicStreamingServicePackage.STREAMING_SERVICE__LISTENERS:
				getListeners().clear();
				getListeners().addAll((Collection<? extends User>)newValue);
				return;
			case MusicStreamingServicePackage.STREAMING_SERVICE__ARTIST:
				getArtist().clear();
				getArtist().addAll((Collection<? extends Artist>)newValue);
				return;
			case MusicStreamingServicePackage.STREAMING_SERVICE__PODCASTS:
				getPodcasts().clear();
				getPodcasts().addAll((Collection<? extends Podcast>)newValue);
				return;
			case MusicStreamingServicePackage.STREAMING_SERVICE__PLAYLIST:
				getPlaylist().clear();
				getPlaylist().addAll((Collection<? extends Playlist>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MusicStreamingServicePackage.STREAMING_SERVICE__LISTENERS:
				getListeners().clear();
				return;
			case MusicStreamingServicePackage.STREAMING_SERVICE__ARTIST:
				getArtist().clear();
				return;
			case MusicStreamingServicePackage.STREAMING_SERVICE__PODCASTS:
				getPodcasts().clear();
				return;
			case MusicStreamingServicePackage.STREAMING_SERVICE__PLAYLIST:
				getPlaylist().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MusicStreamingServicePackage.STREAMING_SERVICE__LISTENERS:
				return listeners != null && !listeners.isEmpty();
			case MusicStreamingServicePackage.STREAMING_SERVICE__ARTIST:
				return artist != null && !artist.isEmpty();
			case MusicStreamingServicePackage.STREAMING_SERVICE__PODCASTS:
				return podcasts != null && !podcasts.isEmpty();
			case MusicStreamingServicePackage.STREAMING_SERVICE__PLAYLIST:
				return playlist != null && !playlist.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StreamingServiceImpl
