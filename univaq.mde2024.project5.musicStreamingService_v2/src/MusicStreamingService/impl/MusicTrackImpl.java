/**
 */
package MusicStreamingService.impl;

import MusicStreamingService.Artist;
import MusicStreamingService.MusicGenre;
import MusicStreamingService.MusicStreamingServicePackage;
import MusicStreamingService.MusicTrack;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Music Track</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.impl.MusicTrackImpl#getGenre <em>Genre</em>}</li>
 *   <li>{@link MusicStreamingService.impl.MusicTrackImpl#getLyrics <em>Lyrics</em>}</li>
 *   <li>{@link MusicStreamingService.impl.MusicTrackImpl#getFeatured_artist <em>Featured artist</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MusicTrackImpl extends AudioTrackImpl implements MusicTrack {
	/**
	 * The cached value of the '{@link #getGenre() <em>Genre</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenre()
	 * @generated
	 * @ordered
	 */
	protected EList<MusicGenre> genre;

	/**
	 * The default value of the '{@link #getLyrics() <em>Lyrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLyrics()
	 * @generated
	 * @ordered
	 */
	protected static final String LYRICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLyrics() <em>Lyrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLyrics()
	 * @generated
	 * @ordered
	 */
	protected String lyrics = LYRICS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatured_artist() <em>Featured artist</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatured_artist()
	 * @generated
	 * @ordered
	 */
	protected EList<Artist> featured_artist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MusicTrackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicStreamingServicePackage.Literals.MUSIC_TRACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MusicGenre> getGenre() {
		if (genre == null) {
			genre = new EDataTypeUniqueEList<MusicGenre>(MusicGenre.class, this, MusicStreamingServicePackage.MUSIC_TRACK__GENRE);
		}
		return genre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLyrics() {
		return lyrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLyrics(String newLyrics) {
		String oldLyrics = lyrics;
		lyrics = newLyrics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.MUSIC_TRACK__LYRICS, oldLyrics, lyrics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artist> getFeatured_artist() {
		if (featured_artist == null) {
			featured_artist = new EObjectWithInverseResolvingEList<Artist>(Artist.class, this, MusicStreamingServicePackage.MUSIC_TRACK__FEATURED_ARTIST, MusicStreamingServicePackage.ARTIST__FEATURED_IN);
		}
		return featured_artist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MusicStreamingServicePackage.MUSIC_TRACK__FEATURED_ARTIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatured_artist()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MusicStreamingServicePackage.MUSIC_TRACK__FEATURED_ARTIST:
				return ((InternalEList<?>)getFeatured_artist()).basicRemove(otherEnd, msgs);
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
			case MusicStreamingServicePackage.MUSIC_TRACK__GENRE:
				return getGenre();
			case MusicStreamingServicePackage.MUSIC_TRACK__LYRICS:
				return getLyrics();
			case MusicStreamingServicePackage.MUSIC_TRACK__FEATURED_ARTIST:
				return getFeatured_artist();
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
			case MusicStreamingServicePackage.MUSIC_TRACK__GENRE:
				getGenre().clear();
				getGenre().addAll((Collection<? extends MusicGenre>)newValue);
				return;
			case MusicStreamingServicePackage.MUSIC_TRACK__LYRICS:
				setLyrics((String)newValue);
				return;
			case MusicStreamingServicePackage.MUSIC_TRACK__FEATURED_ARTIST:
				getFeatured_artist().clear();
				getFeatured_artist().addAll((Collection<? extends Artist>)newValue);
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
			case MusicStreamingServicePackage.MUSIC_TRACK__GENRE:
				getGenre().clear();
				return;
			case MusicStreamingServicePackage.MUSIC_TRACK__LYRICS:
				setLyrics(LYRICS_EDEFAULT);
				return;
			case MusicStreamingServicePackage.MUSIC_TRACK__FEATURED_ARTIST:
				getFeatured_artist().clear();
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
			case MusicStreamingServicePackage.MUSIC_TRACK__GENRE:
				return genre != null && !genre.isEmpty();
			case MusicStreamingServicePackage.MUSIC_TRACK__LYRICS:
				return LYRICS_EDEFAULT == null ? lyrics != null : !LYRICS_EDEFAULT.equals(lyrics);
			case MusicStreamingServicePackage.MUSIC_TRACK__FEATURED_ARTIST:
				return featured_artist != null && !featured_artist.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (genre: ");
		result.append(genre);
		result.append(", lyrics: ");
		result.append(lyrics);
		result.append(')');
		return result.toString();
	}

} //MusicTrackImpl
