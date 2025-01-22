/**
 */
package MusicStreamingService;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.AudioTrack#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see MusicStreamingService.MusicStreamingServicePackage#getAudioTrack()
 * @model abstract="true"
 * @generated
 */
public interface AudioTrack extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getAudioTrack_Duration()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link MusicStreamingService.AudioTrack#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

} // AudioTrack
