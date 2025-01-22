/**
 */
package MusicStreamingService;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Studio Album</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.StudioAlbum#getRecordingStudio <em>Recording Studio</em>}</li>
 * </ul>
 *
 * @see MusicStreamingService.MusicStreamingServicePackage#getStudioAlbum()
 * @model
 * @generated
 */
public interface StudioAlbum extends Album {
	/**
	 * Returns the value of the '<em><b>Recording Studio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording Studio</em>' attribute.
	 * @see #setRecordingStudio(String)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getStudioAlbum_RecordingStudio()
	 * @model required="true"
	 * @generated
	 */
	String getRecordingStudio();

	/**
	 * Sets the value of the '{@link MusicStreamingService.StudioAlbum#getRecordingStudio <em>Recording Studio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recording Studio</em>' attribute.
	 * @see #getRecordingStudio()
	 * @generated
	 */
	void setRecordingStudio(String value);

} // StudioAlbum
