/**
 */
package MusicStreamingService.impl;

import MusicStreamingService.Artist;
import MusicStreamingService.Concert;
import MusicStreamingService.MusicStreamingServicePackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.impl.ConcertImpl#getDate <em>Date</em>}</li>
 *   <li>{@link MusicStreamingService.impl.ConcertImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link MusicStreamingService.impl.ConcertImpl#getArtists <em>Artists</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcertImpl extends NamedElementImpl implements Concert {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArtists() <em>Artists</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtists()
	 * @generated
	 * @ordered
	 */
	protected EList<Artist> artists;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicStreamingServicePackage.Literals.CONCERT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.CONCERT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.CONCERT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artist> getArtists() {
		if (artists == null) {
			artists = new EObjectResolvingEList<Artist>(Artist.class, this, MusicStreamingServicePackage.CONCERT__ARTISTS);
		}
		return artists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MusicStreamingServicePackage.CONCERT__DATE:
				return getDate();
			case MusicStreamingServicePackage.CONCERT__LOCATION:
				return getLocation();
			case MusicStreamingServicePackage.CONCERT__ARTISTS:
				return getArtists();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MusicStreamingServicePackage.CONCERT__DATE:
				setDate((Date)newValue);
				return;
			case MusicStreamingServicePackage.CONCERT__LOCATION:
				setLocation((String)newValue);
				return;
			case MusicStreamingServicePackage.CONCERT__ARTISTS:
				getArtists().clear();
				getArtists().addAll((Collection<? extends Artist>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MusicStreamingServicePackage.CONCERT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case MusicStreamingServicePackage.CONCERT__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case MusicStreamingServicePackage.CONCERT__ARTISTS:
				getArtists().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MusicStreamingServicePackage.CONCERT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case MusicStreamingServicePackage.CONCERT__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case MusicStreamingServicePackage.CONCERT__ARTISTS:
				return artists != null && !artists.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (date: ");
		result.append(date);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //ConcertImpl
