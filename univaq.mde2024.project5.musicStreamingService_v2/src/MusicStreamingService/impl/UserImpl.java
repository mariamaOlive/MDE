/**
 */
package MusicStreamingService.impl;

import MusicStreamingService.Artist;
import MusicStreamingService.MusicStreamingServicePackage;
import MusicStreamingService.Playlist;
import MusicStreamingService.Podcast;
import MusicStreamingService.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.impl.UserImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link MusicStreamingService.impl.UserImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link MusicStreamingService.impl.UserImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link MusicStreamingService.impl.UserImpl#getFollowed_artist <em>Followed artist</em>}</li>
 *   <li>{@link MusicStreamingService.impl.UserImpl#getOwned_playlist <em>Owned playlist</em>}</li>
 *   <li>{@link MusicStreamingService.impl.UserImpl#getSubscribed_podcast <em>Subscribed podcast</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends NamedElementImpl implements User {
	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFollowed_artist() <em>Followed artist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowed_artist()
	 * @generated
	 * @ordered
	 */
	protected Artist followed_artist;

	/**
	 * The cached value of the '{@link #getOwned_playlist() <em>Owned playlist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwned_playlist()
	 * @generated
	 * @ordered
	 */
	protected Playlist owned_playlist;

	/**
	 * The cached value of the '{@link #getSubscribed_podcast() <em>Subscribed podcast</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribed_podcast()
	 * @generated
	 * @ordered
	 */
	protected EList<Podcast> subscribed_podcast;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicStreamingServicePackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.USER__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.USER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.USER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artist getFollowed_artist() {
		if (followed_artist != null && followed_artist.eIsProxy()) {
			InternalEObject oldFollowed_artist = (InternalEObject)followed_artist;
			followed_artist = (Artist)eResolveProxy(oldFollowed_artist);
			if (followed_artist != oldFollowed_artist) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MusicStreamingServicePackage.USER__FOLLOWED_ARTIST, oldFollowed_artist, followed_artist));
			}
		}
		return followed_artist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artist basicGetFollowed_artist() {
		return followed_artist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFollowed_artist(Artist newFollowed_artist, NotificationChain msgs) {
		Artist oldFollowed_artist = followed_artist;
		followed_artist = newFollowed_artist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.USER__FOLLOWED_ARTIST, oldFollowed_artist, newFollowed_artist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFollowed_artist(Artist newFollowed_artist) {
		if (newFollowed_artist != followed_artist) {
			NotificationChain msgs = null;
			if (followed_artist != null)
				msgs = ((InternalEObject)followed_artist).eInverseRemove(this, MusicStreamingServicePackage.ARTIST__FOLLOWERS, Artist.class, msgs);
			if (newFollowed_artist != null)
				msgs = ((InternalEObject)newFollowed_artist).eInverseAdd(this, MusicStreamingServicePackage.ARTIST__FOLLOWERS, Artist.class, msgs);
			msgs = basicSetFollowed_artist(newFollowed_artist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.USER__FOLLOWED_ARTIST, newFollowed_artist, newFollowed_artist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Playlist getOwned_playlist() {
		if (owned_playlist != null && owned_playlist.eIsProxy()) {
			InternalEObject oldOwned_playlist = (InternalEObject)owned_playlist;
			owned_playlist = (Playlist)eResolveProxy(oldOwned_playlist);
			if (owned_playlist != oldOwned_playlist) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MusicStreamingServicePackage.USER__OWNED_PLAYLIST, oldOwned_playlist, owned_playlist));
			}
		}
		return owned_playlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Playlist basicGetOwned_playlist() {
		return owned_playlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwned_playlist(Playlist newOwned_playlist, NotificationChain msgs) {
		Playlist oldOwned_playlist = owned_playlist;
		owned_playlist = newOwned_playlist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.USER__OWNED_PLAYLIST, oldOwned_playlist, newOwned_playlist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwned_playlist(Playlist newOwned_playlist) {
		if (newOwned_playlist != owned_playlist) {
			NotificationChain msgs = null;
			if (owned_playlist != null)
				msgs = ((InternalEObject)owned_playlist).eInverseRemove(this, MusicStreamingServicePackage.PLAYLIST__OWNERS, Playlist.class, msgs);
			if (newOwned_playlist != null)
				msgs = ((InternalEObject)newOwned_playlist).eInverseAdd(this, MusicStreamingServicePackage.PLAYLIST__OWNERS, Playlist.class, msgs);
			msgs = basicSetOwned_playlist(newOwned_playlist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.USER__OWNED_PLAYLIST, newOwned_playlist, newOwned_playlist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Podcast> getSubscribed_podcast() {
		if (subscribed_podcast == null) {
			subscribed_podcast = new EObjectWithInverseResolvingEList.ManyInverse<Podcast>(Podcast.class, this, MusicStreamingServicePackage.USER__SUBSCRIBED_PODCAST, MusicStreamingServicePackage.PODCAST__FOLLOWERS);
		}
		return subscribed_podcast;
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
			case MusicStreamingServicePackage.USER__FOLLOWED_ARTIST:
				if (followed_artist != null)
					msgs = ((InternalEObject)followed_artist).eInverseRemove(this, MusicStreamingServicePackage.ARTIST__FOLLOWERS, Artist.class, msgs);
				return basicSetFollowed_artist((Artist)otherEnd, msgs);
			case MusicStreamingServicePackage.USER__OWNED_PLAYLIST:
				if (owned_playlist != null)
					msgs = ((InternalEObject)owned_playlist).eInverseRemove(this, MusicStreamingServicePackage.PLAYLIST__OWNERS, Playlist.class, msgs);
				return basicSetOwned_playlist((Playlist)otherEnd, msgs);
			case MusicStreamingServicePackage.USER__SUBSCRIBED_PODCAST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubscribed_podcast()).basicAdd(otherEnd, msgs);
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
			case MusicStreamingServicePackage.USER__FOLLOWED_ARTIST:
				return basicSetFollowed_artist(null, msgs);
			case MusicStreamingServicePackage.USER__OWNED_PLAYLIST:
				return basicSetOwned_playlist(null, msgs);
			case MusicStreamingServicePackage.USER__SUBSCRIBED_PODCAST:
				return ((InternalEList<?>)getSubscribed_podcast()).basicRemove(otherEnd, msgs);
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
			case MusicStreamingServicePackage.USER__USERNAME:
				return getUsername();
			case MusicStreamingServicePackage.USER__EMAIL:
				return getEmail();
			case MusicStreamingServicePackage.USER__PASSWORD:
				return getPassword();
			case MusicStreamingServicePackage.USER__FOLLOWED_ARTIST:
				if (resolve) return getFollowed_artist();
				return basicGetFollowed_artist();
			case MusicStreamingServicePackage.USER__OWNED_PLAYLIST:
				if (resolve) return getOwned_playlist();
				return basicGetOwned_playlist();
			case MusicStreamingServicePackage.USER__SUBSCRIBED_PODCAST:
				return getSubscribed_podcast();
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
			case MusicStreamingServicePackage.USER__USERNAME:
				setUsername((String)newValue);
				return;
			case MusicStreamingServicePackage.USER__EMAIL:
				setEmail((String)newValue);
				return;
			case MusicStreamingServicePackage.USER__PASSWORD:
				setPassword((String)newValue);
				return;
			case MusicStreamingServicePackage.USER__FOLLOWED_ARTIST:
				setFollowed_artist((Artist)newValue);
				return;
			case MusicStreamingServicePackage.USER__OWNED_PLAYLIST:
				setOwned_playlist((Playlist)newValue);
				return;
			case MusicStreamingServicePackage.USER__SUBSCRIBED_PODCAST:
				getSubscribed_podcast().clear();
				getSubscribed_podcast().addAll((Collection<? extends Podcast>)newValue);
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
			case MusicStreamingServicePackage.USER__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case MusicStreamingServicePackage.USER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case MusicStreamingServicePackage.USER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case MusicStreamingServicePackage.USER__FOLLOWED_ARTIST:
				setFollowed_artist((Artist)null);
				return;
			case MusicStreamingServicePackage.USER__OWNED_PLAYLIST:
				setOwned_playlist((Playlist)null);
				return;
			case MusicStreamingServicePackage.USER__SUBSCRIBED_PODCAST:
				getSubscribed_podcast().clear();
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
			case MusicStreamingServicePackage.USER__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case MusicStreamingServicePackage.USER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case MusicStreamingServicePackage.USER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case MusicStreamingServicePackage.USER__FOLLOWED_ARTIST:
				return followed_artist != null;
			case MusicStreamingServicePackage.USER__OWNED_PLAYLIST:
				return owned_playlist != null;
			case MusicStreamingServicePackage.USER__SUBSCRIBED_PODCAST:
				return subscribed_podcast != null && !subscribed_podcast.isEmpty();
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
		result.append(" (username: ");
		result.append(username);
		result.append(", email: ");
		result.append(email);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //UserImpl
