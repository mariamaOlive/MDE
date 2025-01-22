/**
 */
package MusicStreamingService;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.Playlist#getTracks <em>Tracks</em>}</li>
 *   <li>{@link MusicStreamingService.Playlist#getNum_of_tracks <em>Num of tracks</em>}</li>
 *   <li>{@link MusicStreamingService.Playlist#getDuration <em>Duration</em>}</li>
 *   <li>{@link MusicStreamingService.Playlist#getOrder <em>Order</em>}</li>
 *   <li>{@link MusicStreamingService.Playlist#getOwners <em>Owners</em>}</li>
 * </ul>
 *
 * @see MusicStreamingService.MusicStreamingServicePackage#getPlaylist()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PlaylistMustHaveTracks'"
 * @generated
 */
public interface Playlist extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' reference list.
	 * The list contents are of type {@link MusicStreamingService.AudioTrack}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' reference list.
	 * @see MusicStreamingService.MusicStreamingServicePackage#getPlaylist_Tracks()
	 * @model required="true"
	 * @generated
	 */
	EList<AudioTrack> getTracks();

	/**
	 * Returns the value of the '<em><b>Num of tracks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num of tracks</em>' attribute.
	 * @see #isSetNum_of_tracks()
	 * @see #unsetNum_of_tracks()
	 * @see #setNum_of_tracks(int)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getPlaylist_Num_of_tracks()
	 * @model unsettable="true" required="true" derived="true"
	 * @generated
	 */
	int getNum_of_tracks();

	/**
	 * Sets the value of the '{@link MusicStreamingService.Playlist#getNum_of_tracks <em>Num of tracks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num of tracks</em>' attribute.
	 * @see #isSetNum_of_tracks()
	 * @see #unsetNum_of_tracks()
	 * @see #getNum_of_tracks()
	 * @generated
	 */
	void setNum_of_tracks(int value);

	/**
	 * Unsets the value of the '{@link MusicStreamingService.Playlist#getNum_of_tracks <em>Num of tracks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNum_of_tracks()
	 * @see #getNum_of_tracks()
	 * @see #setNum_of_tracks(int)
	 * @generated
	 */
	void unsetNum_of_tracks();

	/**
	 * Returns whether the value of the '{@link MusicStreamingService.Playlist#getNum_of_tracks <em>Num of tracks</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Num of tracks</em>' attribute is set.
	 * @see #unsetNum_of_tracks()
	 * @see #getNum_of_tracks()
	 * @see #setNum_of_tracks(int)
	 * @generated
	 */
	boolean isSetNum_of_tracks();

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #isSetDuration()
	 * @see #unsetDuration()
	 * @see #setDuration(int)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getPlaylist_Duration()
	 * @model unsettable="true" required="true" derived="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link MusicStreamingService.Playlist#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #isSetDuration()
	 * @see #unsetDuration()
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Unsets the value of the '{@link MusicStreamingService.Playlist#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDuration()
	 * @see #getDuration()
	 * @see #setDuration(int)
	 * @generated
	 */
	void unsetDuration();

	/**
	 * Returns whether the value of the '{@link MusicStreamingService.Playlist#getDuration <em>Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Duration</em>' attribute is set.
	 * @see #unsetDuration()
	 * @see #getDuration()
	 * @see #setDuration(int)
	 * @generated
	 */
	boolean isSetDuration();

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The literals are from the enumeration {@link MusicStreamingService.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see MusicStreamingService.Order
	 * @see #setOrder(Order)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getPlaylist_Order()
	 * @model required="true"
	 * @generated
	 */
	Order getOrder();

	/**
	 * Sets the value of the '{@link MusicStreamingService.Playlist#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see MusicStreamingService.Order
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Order value);

	/**
	 * Returns the value of the '<em><b>Owners</b></em>' reference list.
	 * The list contents are of type {@link MusicStreamingService.User}.
	 * It is bidirectional and its opposite is '{@link MusicStreamingService.User#getOwned_playlist <em>Owned playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owners</em>' reference list.
	 * @see MusicStreamingService.MusicStreamingServicePackage#getPlaylist_Owners()
	 * @see MusicStreamingService.User#getOwned_playlist
	 * @model opposite="owned_playlist" required="true"
	 * @generated
	 */
	EList<User> getOwners();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n            not tracks-&gt;isEmpty()'"
	 * @generated
	 */
	boolean PlaylistMustHaveTracks(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Playlist
