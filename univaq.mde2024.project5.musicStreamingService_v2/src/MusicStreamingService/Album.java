/**
 */
package MusicStreamingService;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.Album#getTracks <em>Tracks</em>}</li>
 *   <li>{@link MusicStreamingService.Album#getDuration <em>Duration</em>}</li>
 *   <li>{@link MusicStreamingService.Album#getImg_url <em>Img url</em>}</li>
 *   <li>{@link MusicStreamingService.Album#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see MusicStreamingService.MusicStreamingServicePackage#getAlbum()
 * @model
 * @generated
 */
public interface Album extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' containment reference list.
	 * The list contents are of type {@link MusicStreamingService.AlbumTrack}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' containment reference list.
	 * @see MusicStreamingService.MusicStreamingServicePackage#getAlbum_Tracks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AlbumTrack> getTracks();

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getAlbum_Duration()
	 * @model unique="false" required="true" derived="true" ordered="false"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link MusicStreamingService.Album#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Img url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Img url</em>' attribute.
	 * @see #setImg_url(String)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getAlbum_Img_url()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getImg_url();

	/**
	 * Sets the value of the '{@link MusicStreamingService.Album#getImg_url <em>Img url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Img url</em>' attribute.
	 * @see #getImg_url()
	 * @generated
	 */
	void setImg_url(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MusicStreamingService.Artist#getOwned_albums <em>Owned albums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Artist)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getAlbum_Owner()
	 * @see MusicStreamingService.Artist#getOwned_albums
	 * @model opposite="owned_albums" required="true" transient="false"
	 * @generated
	 */
	Artist getOwner();

	/**
	 * Sets the value of the '{@link MusicStreamingService.Album#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Artist value);

} // Album
