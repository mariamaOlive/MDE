/**
 */
package MusicStreamingService;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Music Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.MusicTrack#getGenre <em>Genre</em>}</li>
 *   <li>{@link MusicStreamingService.MusicTrack#getLyrics <em>Lyrics</em>}</li>
 *   <li>{@link MusicStreamingService.MusicTrack#getFeatured_artist <em>Featured artist</em>}</li>
 * </ul>
 *
 * @see MusicStreamingService.MusicStreamingServicePackage#getMusicTrack()
 * @model abstract="true"
 * @generated
 */
public interface MusicTrack extends AudioTrack {
	/**
	 * Returns the value of the '<em><b>Genre</b></em>' attribute list.
	 * The list contents are of type {@link MusicStreamingService.MusicGenre}.
	 * The literals are from the enumeration {@link MusicStreamingService.MusicGenre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genre</em>' attribute list.
	 * @see MusicStreamingService.MusicGenre
	 * @see MusicStreamingService.MusicStreamingServicePackage#getMusicTrack_Genre()
	 * @model required="true"
	 * @generated
	 */
	EList<MusicGenre> getGenre();

	/**
	 * Returns the value of the '<em><b>Lyrics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lyrics</em>' attribute.
	 * @see #setLyrics(String)
	 * @see MusicStreamingService.MusicStreamingServicePackage#getMusicTrack_Lyrics()
	 * @model
	 * @generated
	 */
	String getLyrics();

	/**
	 * Sets the value of the '{@link MusicStreamingService.MusicTrack#getLyrics <em>Lyrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lyrics</em>' attribute.
	 * @see #getLyrics()
	 * @generated
	 */
	void setLyrics(String value);

	/**
	 * Returns the value of the '<em><b>Featured artist</b></em>' reference list.
	 * The list contents are of type {@link MusicStreamingService.Artist}.
	 * It is bidirectional and its opposite is '{@link MusicStreamingService.Artist#getFeatured_in <em>Featured in</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featured artist</em>' reference list.
	 * @see MusicStreamingService.MusicStreamingServicePackage#getMusicTrack_Featured_artist()
	 * @see MusicStreamingService.Artist#getFeatured_in
	 * @model opposite="featured_in"
	 * @generated
	 */
	EList<Artist> getFeatured_artist();

} // MusicTrack
