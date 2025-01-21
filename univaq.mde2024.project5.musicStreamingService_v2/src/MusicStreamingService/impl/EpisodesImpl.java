/**
 */
package MusicStreamingService.impl;

import MusicStreamingService.Episodes;
import MusicStreamingService.MusicStreamingServicePackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Episodes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.impl.EpisodesImpl#getDate_created <em>Date created</em>}</li>
 *   <li>{@link MusicStreamingService.impl.EpisodesImpl#getTranscript <em>Transcript</em>}</li>
 *   <li>{@link MusicStreamingService.impl.EpisodesImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EpisodesImpl extends TrackImpl implements Episodes {
	/**
	 * The default value of the '{@link #getDate_created() <em>Date created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_created()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_CREATED_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2024-06-17T10:15:30");

	/**
	 * The cached value of the '{@link #getDate_created() <em>Date created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_created()
	 * @generated
	 * @ordered
	 */
	protected Date date_created = DATE_CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTranscript() <em>Transcript</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranscript()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSCRIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTranscript() <em>Transcript</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranscript()
	 * @generated
	 * @ordered
	 */
	protected String transcript = TRANSCRIPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpisodesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicStreamingServicePackage.Literals.EPISODES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate_created() {
		return date_created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate_created(Date newDate_created) {
		Date oldDate_created = date_created;
		date_created = newDate_created;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.EPISODES__DATE_CREATED, oldDate_created, date_created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTranscript() {
		return transcript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTranscript(String newTranscript) {
		String oldTranscript = transcript;
		transcript = newTranscript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.EPISODES__TRANSCRIPT, oldTranscript, transcript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.EPISODES__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MusicStreamingServicePackage.EPISODES__DATE_CREATED:
				return getDate_created();
			case MusicStreamingServicePackage.EPISODES__TRANSCRIPT:
				return getTranscript();
			case MusicStreamingServicePackage.EPISODES__DESCRIPTION:
				return getDescription();
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
			case MusicStreamingServicePackage.EPISODES__DATE_CREATED:
				setDate_created((Date)newValue);
				return;
			case MusicStreamingServicePackage.EPISODES__TRANSCRIPT:
				setTranscript((String)newValue);
				return;
			case MusicStreamingServicePackage.EPISODES__DESCRIPTION:
				setDescription((String)newValue);
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
			case MusicStreamingServicePackage.EPISODES__DATE_CREATED:
				setDate_created(DATE_CREATED_EDEFAULT);
				return;
			case MusicStreamingServicePackage.EPISODES__TRANSCRIPT:
				setTranscript(TRANSCRIPT_EDEFAULT);
				return;
			case MusicStreamingServicePackage.EPISODES__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case MusicStreamingServicePackage.EPISODES__DATE_CREATED:
				return DATE_CREATED_EDEFAULT == null ? date_created != null : !DATE_CREATED_EDEFAULT.equals(date_created);
			case MusicStreamingServicePackage.EPISODES__TRANSCRIPT:
				return TRANSCRIPT_EDEFAULT == null ? transcript != null : !TRANSCRIPT_EDEFAULT.equals(transcript);
			case MusicStreamingServicePackage.EPISODES__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (date_created: ");
		result.append(date_created);
		result.append(", transcript: ");
		result.append(transcript);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //EpisodesImpl
