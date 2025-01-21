/**
 */
package MusicStreamingService;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.User#getUsername <em>Username</em>}</li>
 *   <li>{@link MusicStreamingService.User#getEmail <em>Email</em>}</li>
 *   <li>{@link MusicStreamingService.User#getPassword <em>Password</em>}</li>
 *   <li>{@link MusicStreamingService.User#getFollowed_artist <em>Followed artist</em>}</li>
 *   <li>{@link MusicStreamingService.User#getOwned_playlist <em>Owned playlist</em>}</li>
 *   <li>{@link MusicStreamingService.User#getSubscribed_podcast <em>Subscribed podcast</em>}</li>
 * </ul>
 *
 * @see MusicStreamingService.MusicStreamingServicePackage#getUser()
 * @model
 * @generated
 */
public interface User extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getUser_Username()
	 * @model required="true"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link MusicStreamingService.User#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getUser_Email()
	 * @model required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link MusicStreamingService.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getUser_Password()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link MusicStreamingService.User#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Followed artist</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MusicStreamingService.Artist#getFollowers <em>Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Followed artist</em>' reference.
	 * @see #setFollowed_artist(Artist)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getUser_Followed_artist()
	 * @see MusicStreamingService.Artist#getFollowers
	 * @model opposite="followers"
	 * @generated
	 */
	Artist getFollowed_artist();

	/**
	 * Sets the value of the '{@link MusicStreamingService.User#getFollowed_artist <em>Followed artist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Followed artist</em>' reference.
	 * @see #getFollowed_artist()
	 * @generated
	 */
	void setFollowed_artist(Artist value);

	/**
	 * Returns the value of the '<em><b>Owned playlist</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MusicStreamingService.Playlist#getOwners <em>Owners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned playlist</em>' reference.
	 * @see #setOwned_playlist(Playlist)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getUser_Owned_playlist()
	 * @see MusicStreamingService.Playlist#getOwners
	 * @model opposite="owners"
	 * @generated
	 */
	Playlist getOwned_playlist();

	/**
	 * Sets the value of the '{@link MusicStreamingService.User#getOwned_playlist <em>Owned playlist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned playlist</em>' reference.
	 * @see #getOwned_playlist()
	 * @generated
	 */
	void setOwned_playlist(Playlist value);

	/**
	 * Returns the value of the '<em><b>Subscribed podcast</b></em>' reference list.
	 * The list contents are of type {@link MusicStreamingService.Podcast}.
	 * It is bidirectional and its opposite is '{@link MusicStreamingService.Podcast#getFollowers <em>Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribed podcast</em>' reference list.
	 * @see MusicStreamingService.MusicStreamingServicePackage#getUser_Subscribed_podcast()
	 * @see MusicStreamingService.Podcast#getFollowers
	 * @model opposite="followers"
	 * @generated
	 */
	EList<Podcast> getSubscribed_podcast();

} // User
