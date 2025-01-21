/**
 */
package MusicStreamingService.impl;

import MusicStreamingService.MusicStreamingServicePackage;
import MusicStreamingService.Order;
import MusicStreamingService.Playlist;
import MusicStreamingService.Track;
import MusicStreamingService.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.impl.PlaylistImpl#getTracks <em>Tracks</em>}</li>
 *   <li>{@link MusicStreamingService.impl.PlaylistImpl#getNum_of_tracks <em>Num of tracks</em>}</li>
 *   <li>{@link MusicStreamingService.impl.PlaylistImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link MusicStreamingService.impl.PlaylistImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link MusicStreamingService.impl.PlaylistImpl#getOwners <em>Owners</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaylistImpl extends NamedElementImpl implements Playlist {
	/**
	 * The cached value of the '{@link #getTracks() <em>Tracks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracks()
	 * @generated
	 * @ordered
	 */
	protected EList<Track> tracks;

	/**
	 * The default value of the '{@link #getNum_of_tracks() <em>Num of tracks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_of_tracks()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_OF_TRACKS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNum_of_tracks() <em>Num of tracks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_of_tracks()
	 * @generated
	 * @ordered
	 */
	protected int num_of_tracks = NUM_OF_TRACKS_EDEFAULT;

	/**
	 * This is true if the Num of tracks attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean num_of_tracksESet;

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
	 * This is true if the Duration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean durationESet;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final Order ORDER_EDEFAULT = Order.DEFAULT;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected Order order = ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwners() <em>Owners</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwners()
	 * @generated
	 * @ordered
	 */
	protected EList<User> owners;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaylistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicStreamingServicePackage.Literals.PLAYLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Track> getTracks() {
		if (tracks == null) {
			tracks = new EObjectResolvingEList<Track>(Track.class, this, MusicStreamingServicePackage.PLAYLIST__TRACKS);
		}
		return tracks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNum_of_tracks() {
		return num_of_tracks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNum_of_tracks(int newNum_of_tracks) {
		int oldNum_of_tracks = num_of_tracks;
		num_of_tracks = newNum_of_tracks;
		boolean oldNum_of_tracksESet = num_of_tracksESet;
		num_of_tracksESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.PLAYLIST__NUM_OF_TRACKS, oldNum_of_tracks, num_of_tracks, !oldNum_of_tracksESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNum_of_tracks() {
		int oldNum_of_tracks = num_of_tracks;
		boolean oldNum_of_tracksESet = num_of_tracksESet;
		num_of_tracks = NUM_OF_TRACKS_EDEFAULT;
		num_of_tracksESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MusicStreamingServicePackage.PLAYLIST__NUM_OF_TRACKS, oldNum_of_tracks, NUM_OF_TRACKS_EDEFAULT, oldNum_of_tracksESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNum_of_tracks() {
		return num_of_tracksESet;
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
		boolean oldDurationESet = durationESet;
		durationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.PLAYLIST__DURATION, oldDuration, duration, !oldDurationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDuration() {
		int oldDuration = duration;
		boolean oldDurationESet = durationESet;
		duration = DURATION_EDEFAULT;
		durationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MusicStreamingServicePackage.PLAYLIST__DURATION, oldDuration, DURATION_EDEFAULT, oldDurationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDuration() {
		return durationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Order getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(Order newOrder) {
		Order oldOrder = order;
		order = newOrder == null ? ORDER_EDEFAULT : newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.PLAYLIST__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getOwners() {
		if (owners == null) {
			owners = new EObjectWithInverseResolvingEList<User>(User.class, this, MusicStreamingServicePackage.PLAYLIST__OWNERS, MusicStreamingServicePackage.USER__OWNED_PLAYLIST);
		}
		return owners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MusicStreamingServicePackage.PLAYLIST__OWNERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwners()).basicAdd(otherEnd, msgs);
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
			case MusicStreamingServicePackage.PLAYLIST__OWNERS:
				return ((InternalEList<?>)getOwners()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MusicStreamingServicePackage.PLAYLIST__TRACKS:
				return getTracks();
			case MusicStreamingServicePackage.PLAYLIST__NUM_OF_TRACKS:
				return getNum_of_tracks();
			case MusicStreamingServicePackage.PLAYLIST__DURATION:
				return getDuration();
			case MusicStreamingServicePackage.PLAYLIST__ORDER:
				return getOrder();
			case MusicStreamingServicePackage.PLAYLIST__OWNERS:
				return getOwners();
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
			case MusicStreamingServicePackage.PLAYLIST__TRACKS:
				getTracks().clear();
				getTracks().addAll((Collection<? extends Track>)newValue);
				return;
			case MusicStreamingServicePackage.PLAYLIST__NUM_OF_TRACKS:
				setNum_of_tracks((Integer)newValue);
				return;
			case MusicStreamingServicePackage.PLAYLIST__DURATION:
				setDuration((Integer)newValue);
				return;
			case MusicStreamingServicePackage.PLAYLIST__ORDER:
				setOrder((Order)newValue);
				return;
			case MusicStreamingServicePackage.PLAYLIST__OWNERS:
				getOwners().clear();
				getOwners().addAll((Collection<? extends User>)newValue);
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
			case MusicStreamingServicePackage.PLAYLIST__TRACKS:
				getTracks().clear();
				return;
			case MusicStreamingServicePackage.PLAYLIST__NUM_OF_TRACKS:
				unsetNum_of_tracks();
				return;
			case MusicStreamingServicePackage.PLAYLIST__DURATION:
				unsetDuration();
				return;
			case MusicStreamingServicePackage.PLAYLIST__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case MusicStreamingServicePackage.PLAYLIST__OWNERS:
				getOwners().clear();
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
			case MusicStreamingServicePackage.PLAYLIST__TRACKS:
				return tracks != null && !tracks.isEmpty();
			case MusicStreamingServicePackage.PLAYLIST__NUM_OF_TRACKS:
				return isSetNum_of_tracks();
			case MusicStreamingServicePackage.PLAYLIST__DURATION:
				return isSetDuration();
			case MusicStreamingServicePackage.PLAYLIST__ORDER:
				return order != ORDER_EDEFAULT;
			case MusicStreamingServicePackage.PLAYLIST__OWNERS:
				return owners != null && !owners.isEmpty();
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
		result.append(" (num_of_tracks: ");
		if (num_of_tracksESet) result.append(num_of_tracks); else result.append("<unset>");
		result.append(", duration: ");
		if (durationESet) result.append(duration); else result.append("<unset>");
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //PlaylistImpl
