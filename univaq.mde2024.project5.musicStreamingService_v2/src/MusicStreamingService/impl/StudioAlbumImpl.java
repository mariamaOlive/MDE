/**
 */
package MusicStreamingService.impl;

import MusicStreamingService.MusicStreamingServicePackage;
import MusicStreamingService.StudioAlbum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Studio Album</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.impl.StudioAlbumImpl#getRecordingStudio <em>Recording Studio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudioAlbumImpl extends AlbumImpl implements StudioAlbum {
	/**
	 * The default value of the '{@link #getRecordingStudio() <em>Recording Studio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingStudio()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORDING_STUDIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecordingStudio() <em>Recording Studio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingStudio()
	 * @generated
	 * @ordered
	 */
	protected String recordingStudio = RECORDING_STUDIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudioAlbumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicStreamingServicePackage.Literals.STUDIO_ALBUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecordingStudio() {
		return recordingStudio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecordingStudio(String newRecordingStudio) {
		String oldRecordingStudio = recordingStudio;
		recordingStudio = newRecordingStudio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.STUDIO_ALBUM__RECORDING_STUDIO, oldRecordingStudio, recordingStudio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MusicStreamingServicePackage.STUDIO_ALBUM__RECORDING_STUDIO:
				return getRecordingStudio();
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
			case MusicStreamingServicePackage.STUDIO_ALBUM__RECORDING_STUDIO:
				setRecordingStudio((String)newValue);
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
			case MusicStreamingServicePackage.STUDIO_ALBUM__RECORDING_STUDIO:
				setRecordingStudio(RECORDING_STUDIO_EDEFAULT);
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
			case MusicStreamingServicePackage.STUDIO_ALBUM__RECORDING_STUDIO:
				return RECORDING_STUDIO_EDEFAULT == null ? recordingStudio != null : !RECORDING_STUDIO_EDEFAULT.equals(recordingStudio);
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
		result.append(" (recordingStudio: ");
		result.append(recordingStudio);
		result.append(')');
		return result.toString();
	}

} //StudioAlbumImpl
