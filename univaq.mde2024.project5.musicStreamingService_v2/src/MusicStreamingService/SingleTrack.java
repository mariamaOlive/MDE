/**
 */
package MusicStreamingService;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.SingleTrack#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see MusicStreamingService.MusicStreamingServicePackage#getSingleTrack()
 * @model
 * @generated
 */
public interface SingleTrack extends MusicTrack {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MusicStreamingService.Artist#getOwned_solos <em>Owned solos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Artist)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getSingleTrack_Owner()
	 * @see MusicStreamingService.Artist#getOwned_solos
	 * @model opposite="owned_solos" required="true" transient="false"
	 * @generated
	 */
	Artist getOwner();

	/**
	 * Sets the value of the '{@link MusicStreamingService.SingleTrack#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Artist value);

} // SingleTrack
