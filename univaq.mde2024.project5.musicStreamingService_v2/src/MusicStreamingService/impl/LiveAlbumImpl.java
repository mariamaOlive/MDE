/**
 */
package MusicStreamingService.impl;

import MusicStreamingService.LiveAlbum;
import MusicStreamingService.MusicStreamingServicePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Album</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.impl.LiveAlbumImpl#getEventLocation <em>Event Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiveAlbumImpl extends AlbumImpl implements LiveAlbum {
	/**
	 * The default value of the '{@link #getEventLocation() <em>Event Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventLocation() <em>Event Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventLocation()
	 * @generated
	 * @ordered
	 */
	protected String eventLocation = EVENT_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveAlbumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicStreamingServicePackage.Literals.LIVE_ALBUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEventLocation() {
		return eventLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventLocation(String newEventLocation) {
		String oldEventLocation = eventLocation;
		eventLocation = newEventLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.LIVE_ALBUM__EVENT_LOCATION, oldEventLocation, eventLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MusicStreamingServicePackage.LIVE_ALBUM__EVENT_LOCATION:
				return getEventLocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MusicStreamingServicePackage.LIVE_ALBUM__EVENT_LOCATION:
				setEventLocation((String)newValue);
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
			case MusicStreamingServicePackage.LIVE_ALBUM__EVENT_LOCATION:
				setEventLocation(EVENT_LOCATION_EDEFAULT);
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
			case MusicStreamingServicePackage.LIVE_ALBUM__EVENT_LOCATION:
				return EVENT_LOCATION_EDEFAULT == null ? eventLocation != null : !EVENT_LOCATION_EDEFAULT.equals(eventLocation);
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
		result.append(" (eventLocation: ");
		result.append(eventLocation);
		result.append(')');
		return result.toString();
	}

} //LiveAlbumImpl
