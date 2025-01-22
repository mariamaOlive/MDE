/**
 */
package MusicStreamingService;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Live Album</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.LiveAlbum#getEventLocation <em>Event Location</em>}</li>
 * </ul>
 *
 * @see MusicStreamingService.MusicStreamingServicePackage#getLiveAlbum()
 * @model
 * @generated
 */
public interface LiveAlbum extends Album {
	/**
	 * Returns the value of the '<em><b>Event Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Location</em>' attribute.
	 * @see #setEventLocation(String)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getLiveAlbum_EventLocation()
	 * @model required="true"
	 * @generated
	 */
	String getEventLocation();

	/**
	 * Sets the value of the '{@link MusicStreamingService.LiveAlbum#getEventLocation <em>Event Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Location</em>' attribute.
	 * @see #getEventLocation()
	 * @generated
	 */
	void setEventLocation(String value);

} // LiveAlbum
