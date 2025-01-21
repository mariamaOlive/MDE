/**
 */
package MusicStreamingService;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Episodes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.Episodes#getDate_created <em>Date created</em>}</li>
 *   <li>{@link MusicStreamingService.Episodes#getTranscript <em>Transcript</em>}</li>
 *   <li>{@link MusicStreamingService.Episodes#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see MusicStreamingService.MusicStreamingServicePackage#getEpisodes()
 * @model
 * @generated
 */
public interface Episodes extends Track {
	/**
	 * Returns the value of the '<em><b>Date created</b></em>' attribute.
	 * The default value is <code>"2024-06-17T10:15:30"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date created</em>' attribute.
	 * @see #setDate_created(Date)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getEpisodes_Date_created()
	 * @model default="2024-06-17T10:15:30" unique="false" required="true"
	 * @generated
	 */
	Date getDate_created();

	/**
	 * Sets the value of the '{@link MusicStreamingService.Episodes#getDate_created <em>Date created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date created</em>' attribute.
	 * @see #getDate_created()
	 * @generated
	 */
	void setDate_created(Date value);

	/**
	 * Returns the value of the '<em><b>Transcript</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transcript</em>' attribute.
	 * @see #setTranscript(String)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getEpisodes_Transcript()
	 * @model
	 * @generated
	 */
	String getTranscript();

	/**
	 * Sets the value of the '{@link MusicStreamingService.Episodes#getTranscript <em>Transcript</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transcript</em>' attribute.
	 * @see #getTranscript()
	 * @generated
	 */
	void setTranscript(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getEpisodes_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link MusicStreamingService.Episodes#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Episodes
