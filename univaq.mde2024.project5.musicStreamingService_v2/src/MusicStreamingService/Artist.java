/**
 */
package MusicStreamingService;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.Artist#getAbout <em>About</em>}</li>
 *   <li>{@link MusicStreamingService.Artist#getFollowers <em>Followers</em>}</li>
 *   <li>{@link MusicStreamingService.Artist#getImg_url <em>Img url</em>}</li>
 *   <li>{@link MusicStreamingService.Artist#getNum_of_listeners <em>Num of listeners</em>}</li>
 *   <li>{@link MusicStreamingService.Artist#getOwned_albums <em>Owned albums</em>}</li>
 *   <li>{@link MusicStreamingService.Artist#getOwned_solos <em>Owned solos</em>}</li>
 *   <li>{@link MusicStreamingService.Artist#getFeatured_in <em>Featured in</em>}</li>
 * </ul>
 *
 * @see MusicStreamingService.MusicStreamingServicePackage#getArtist()
 * @model
 * @generated
 */
public interface Artist extends NamedElement {
	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * The default value is <code>"About the artist"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getArtist_About()
	 * @model default="About the artist" unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link MusicStreamingService.Artist#getAbout <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>About</em>' attribute.
	 * @see #getAbout()
	 * @generated
	 */
	void setAbout(String value);

	/**
	 * Returns the value of the '<em><b>Followers</b></em>' reference list.
	 * The list contents are of type {@link MusicStreamingService.User}.
	 * It is bidirectional and its opposite is '{@link MusicStreamingService.User#getFollowed_artist <em>Followed artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Followers</em>' reference list.
	 * @see MusicStreamingService.MusicStreamingServicePackage#getArtist_Followers()
	 * @see MusicStreamingService.User#getFollowed_artist
	 * @model opposite="followed_artist" ordered="false"
	 * @generated
	 */
	EList<User> getFollowers();

	/**
	 * Returns the value of the '<em><b>Img url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Img url</em>' attribute.
	 * @see #setImg_url(String)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getArtist_Img_url()
	 * @model
	 * @generated
	 */
	String getImg_url();

	/**
	 * Sets the value of the '{@link MusicStreamingService.Artist#getImg_url <em>Img url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Img url</em>' attribute.
	 * @see #getImg_url()
	 * @generated
	 */
	void setImg_url(String value);

	/**
	 * Returns the value of the '<em><b>Num of listeners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num of listeners</em>' attribute.
	 * @see #setNum_of_listeners(int)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getArtist_Num_of_listeners()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getNum_of_listeners();

	/**
	 * Sets the value of the '{@link MusicStreamingService.Artist#getNum_of_listeners <em>Num of listeners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num of listeners</em>' attribute.
	 * @see #getNum_of_listeners()
	 * @generated
	 */
	void setNum_of_listeners(int value);

	/**
	 * Returns the value of the '<em><b>Owned albums</b></em>' containment reference list.
	 * The list contents are of type {@link MusicStreamingService.Album}.
	 * It is bidirectional and its opposite is '{@link MusicStreamingService.Album#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned albums</em>' containment reference list.
	 * @see MusicStreamingService.MusicStreamingServicePackage#getArtist_Owned_albums()
	 * @see MusicStreamingService.Album#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Album> getOwned_albums();

	/**
	 * Returns the value of the '<em><b>Owned solos</b></em>' containment reference list.
	 * The list contents are of type {@link MusicStreamingService.SingleTrack}.
	 * It is bidirectional and its opposite is '{@link MusicStreamingService.SingleTrack#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned solos</em>' containment reference list.
	 * @see MusicStreamingService.MusicStreamingServicePackage#getArtist_Owned_solos()
	 * @see MusicStreamingService.SingleTrack#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<SingleTrack> getOwned_solos();

	/**
	 * Returns the value of the '<em><b>Featured in</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MusicStreamingService.MusicTrack#getFeatured_artist <em>Featured artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featured in</em>' reference.
	 * @see #setFeatured_in(MusicTrack)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getArtist_Featured_in()
	 * @see MusicStreamingService.MusicTrack#getFeatured_artist
	 * @model opposite="featured_artist"
	 * @generated
	 */
	MusicTrack getFeatured_in();

	/**
	 * Sets the value of the '{@link MusicStreamingService.Artist#getFeatured_in <em>Featured in</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Featured in</em>' reference.
	 * @see #getFeatured_in()
	 * @generated
	 */
	void setFeatured_in(MusicTrack value);

} // Artist
