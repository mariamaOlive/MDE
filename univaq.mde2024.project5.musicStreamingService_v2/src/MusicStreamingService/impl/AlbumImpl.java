/**
 */
package MusicStreamingService.impl;

import MusicStreamingService.Album;
import MusicStreamingService.AlbumTrack;
import MusicStreamingService.Artist;
import MusicStreamingService.MusicStreamingServicePackage;
import MusicStreamingService.MusicStreamingServiceTables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;

import org.eclipse.ocl.pivot.library.collection.CollectionSumOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.impl.AlbumImpl#getTracks <em>Tracks</em>}</li>
 *   <li>{@link MusicStreamingService.impl.AlbumImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link MusicStreamingService.impl.AlbumImpl#getImg_url <em>Img url</em>}</li>
 *   <li>{@link MusicStreamingService.impl.AlbumImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AlbumImpl extends NamedElementImpl implements Album {
	/**
	 * The cached value of the '{@link #getTracks() <em>Tracks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracks()
	 * @generated
	 * @ordered
	 */
	protected EList<AlbumTrack> tracks;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getImg_url() <em>Img url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImg_url()
	 * @generated
	 * @ordered
	 */
	protected static final String IMG_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImg_url() <em>Img url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImg_url()
	 * @generated
	 * @ordered
	 */
	protected String img_url = IMG_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlbumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicStreamingServicePackage.Literals.ALBUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlbumTrack> getTracks() {
		if (tracks == null) {
			tracks = new EObjectContainmentEList<AlbumTrack>(AlbumTrack.class, this, MusicStreamingServicePackage.ALBUM__TRACKS);
		}
		return tracks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.ALBUM__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImg_url() {
		return img_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImg_url(String newImg_url) {
		String oldImg_url = img_url;
		img_url = newImg_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.ALBUM__IMG_URL, oldImg_url, img_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artist getOwner() {
		if (eContainerFeatureID() != MusicStreamingServicePackage.ALBUM__OWNER) return null;
		return (Artist)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Artist newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, MusicStreamingServicePackage.ALBUM__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Artist newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != MusicStreamingServicePackage.ALBUM__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, MusicStreamingServicePackage.ARTIST__OWNED_ALBUMS, Artist.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.ALBUM__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int calculateTotalDuration() {
		/**
		 * tracks->collect(duration)->sum()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<AlbumTrack> tracks = this.getTracks();
		final /*@NonInvalid*/ OrderedSetValue BOXED_tracks = idResolver.createOrderedSetOfAll(MusicStreamingServiceTables.ORD_CLSSid_AlbumTrack, tracks);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(MusicStreamingServiceTables.SEQ_DATAid_EInt);
		Iterator<Object> ITERATOR__1 = BOXED_tracks.iterator();
		/*@NonInvalid*/ SequenceValue collect;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				collect = accumulator;
				break;
			}
			/*@NonInvalid*/ AlbumTrack _1 = (AlbumTrack)ITERATOR__1.next();
			/**
			 * duration
			 */
			final /*@NonInvalid*/ int duration = _1.getDuration();
			final /*@NonInvalid*/ IntegerValue BOXED_duration = ValueUtil.integerValueOf(duration);
			//
			accumulator.add(BOXED_duration);
		}
		final /*@NonInvalid*/ IntegerValue sum = (IntegerValue)CollectionSumOperation.INSTANCE.evaluate(executor, MusicStreamingServiceTables.DATAid_EInt, collect);
		final /*@NonInvalid*/ int ECORE_sum = ValueUtil.intValueOf(sum);
		return ECORE_sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MusicStreamingServicePackage.ALBUM__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Artist)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MusicStreamingServicePackage.ALBUM__TRACKS:
				return ((InternalEList<?>)getTracks()).basicRemove(otherEnd, msgs);
			case MusicStreamingServicePackage.ALBUM__OWNER:
				return basicSetOwner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MusicStreamingServicePackage.ALBUM__OWNER:
				return eInternalContainer().eInverseRemove(this, MusicStreamingServicePackage.ARTIST__OWNED_ALBUMS, Artist.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MusicStreamingServicePackage.ALBUM__TRACKS:
				return getTracks();
			case MusicStreamingServicePackage.ALBUM__DURATION:
				return getDuration();
			case MusicStreamingServicePackage.ALBUM__IMG_URL:
				return getImg_url();
			case MusicStreamingServicePackage.ALBUM__OWNER:
				return getOwner();
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
			case MusicStreamingServicePackage.ALBUM__TRACKS:
				getTracks().clear();
				getTracks().addAll((Collection<? extends AlbumTrack>)newValue);
				return;
			case MusicStreamingServicePackage.ALBUM__DURATION:
				setDuration((Integer)newValue);
				return;
			case MusicStreamingServicePackage.ALBUM__IMG_URL:
				setImg_url((String)newValue);
				return;
			case MusicStreamingServicePackage.ALBUM__OWNER:
				setOwner((Artist)newValue);
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
			case MusicStreamingServicePackage.ALBUM__TRACKS:
				getTracks().clear();
				return;
			case MusicStreamingServicePackage.ALBUM__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case MusicStreamingServicePackage.ALBUM__IMG_URL:
				setImg_url(IMG_URL_EDEFAULT);
				return;
			case MusicStreamingServicePackage.ALBUM__OWNER:
				setOwner((Artist)null);
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
			case MusicStreamingServicePackage.ALBUM__TRACKS:
				return tracks != null && !tracks.isEmpty();
			case MusicStreamingServicePackage.ALBUM__DURATION:
				return duration != DURATION_EDEFAULT;
			case MusicStreamingServicePackage.ALBUM__IMG_URL:
				return IMG_URL_EDEFAULT == null ? img_url != null : !IMG_URL_EDEFAULT.equals(img_url);
			case MusicStreamingServicePackage.ALBUM__OWNER:
				return getOwner() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MusicStreamingServicePackage.ALBUM___CALCULATE_TOTAL_DURATION:
				return calculateTotalDuration();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(", img_url: ");
		result.append(img_url);
		result.append(')');
		return result.toString();
	}

} //AlbumImpl
