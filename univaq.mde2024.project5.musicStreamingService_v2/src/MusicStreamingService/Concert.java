/**
 */
package MusicStreamingService;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.Concert#getDate <em>Date</em>}</li>
 *   <li>{@link MusicStreamingService.Concert#getLocation <em>Location</em>}</li>
 *   <li>{@link MusicStreamingService.Concert#getArtists <em>Artists</em>}</li>
 * </ul>
 *
 * @see MusicStreamingService.MusicStreamingServicePackage#getConcert()
 * @model
 * @generated
 */
public interface Concert extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getConcert_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link MusicStreamingService.Concert#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getConcert_Location()
	 * @model required="true"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link MusicStreamingService.Concert#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Artists</b></em>' reference list.
	 * The list contents are of type {@link MusicStreamingService.Artist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artists</em>' reference list.
	 * @see MusicStreamingService.MusicStreamingServicePackage#getConcert_Artists()
	 * @model required="true"
	 * @generated
	 */
	EList<Artist> getArtists();

} // Concert
