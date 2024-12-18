/**
 */
package MusicStreamingService;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Podcast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.Podcast#getTag <em>Tag</em>}</li>
 *   <li>{@link MusicStreamingService.Podcast#getRating <em>Rating</em>}</li>
 *   <li>{@link MusicStreamingService.Podcast#getImg_url <em>Img url</em>}</li>
 *   <li>{@link MusicStreamingService.Podcast#getEpisodes <em>Episodes</em>}</li>
 *   <li>{@link MusicStreamingService.Podcast#getFollowers <em>Followers</em>}</li>
 * </ul>
 *
 * @see MusicStreamingService.MusicStreamingServicePackage#getPodcast()
 * @model
 * @generated
 */
public interface Podcast extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute list.
	 * The list contents are of type {@link MusicStreamingService.PodcastTag}.
	 * The literals are from the enumeration {@link MusicStreamingService.PodcastTag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute list.
	 * @see MusicStreamingService.PodcastTag
	 * @see MusicStreamingService.MusicStreamingServicePackage#getPodcast_Tag()
	 * @model required="true"
	 * @generated
	 */
	EList<PodcastTag> getTag();

	/**
	 * Returns the value of the '<em><b>Rating</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating</em>' attribute.
	 * @see #setRating(float)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getPodcast_Rating()
	 * @model default="0" required="true"
	 * @generated
	 */
	float getRating();

	/**
	 * Sets the value of the '{@link MusicStreamingService.Podcast#getRating <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating</em>' attribute.
	 * @see #getRating()
	 * @generated
	 */
	void setRating(float value);

	/**
	 * Returns the value of the '<em><b>Img url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Img url</em>' attribute.
	 * @see #setImg_url(String)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getPodcast_Img_url()
	 * @model
	 * @generated
	 */
	String getImg_url();

	/**
	 * Sets the value of the '{@link MusicStreamingService.Podcast#getImg_url <em>Img url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Img url</em>' attribute.
	 * @see #getImg_url()
	 * @generated
	 */
	void setImg_url(String value);

	/**
	 * Returns the value of the '<em><b>Episodes</b></em>' containment reference list.
	 * The list contents are of type {@link MusicStreamingService.Episodes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Episodes</em>' containment reference list.
	 * @see MusicStreamingService.MusicStreamingServicePackage#getPodcast_Episodes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Episodes> getEpisodes();

	/**
	 * Returns the value of the '<em><b>Followers</b></em>' reference list.
	 * The list contents are of type {@link MusicStreamingService.User}.
	 * It is bidirectional and its opposite is '{@link MusicStreamingService.User#getSubscribed_podcast <em>Subscribed podcast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Followers</em>' reference list.
	 * @see MusicStreamingService.MusicStreamingServicePackage#getPodcast_Followers()
	 * @see MusicStreamingService.User#getSubscribed_podcast
	 * @model opposite="subscribed_podcast"
	 * @generated
	 */
	EList<User> getFollowers();

} // Podcast
