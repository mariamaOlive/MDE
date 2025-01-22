/**
 */
package MusicStreamingService.impl;

import MusicStreamingService.Album;
import MusicStreamingService.Artist;
import MusicStreamingService.MusicStreamingServicePackage;
import MusicStreamingService.MusicStreamingServiceTables;
import MusicStreamingService.MusicTrack;
import MusicStreamingService.SingleTrack;
import MusicStreamingService.User;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.impl.ArtistImpl#getAbout <em>About</em>}</li>
 *   <li>{@link MusicStreamingService.impl.ArtistImpl#getFollowers <em>Followers</em>}</li>
 *   <li>{@link MusicStreamingService.impl.ArtistImpl#getImg_url <em>Img url</em>}</li>
 *   <li>{@link MusicStreamingService.impl.ArtistImpl#getNum_of_listeners <em>Num of listeners</em>}</li>
 *   <li>{@link MusicStreamingService.impl.ArtistImpl#getOwned_albums <em>Owned albums</em>}</li>
 *   <li>{@link MusicStreamingService.impl.ArtistImpl#getOwned_solos <em>Owned solos</em>}</li>
 *   <li>{@link MusicStreamingService.impl.ArtistImpl#getFeatured_in <em>Featured in</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtistImpl extends NamedElementImpl implements Artist {
	/**
	 * The default value of the '{@link #getAbout() <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected static final String ABOUT_EDEFAULT = "About the artist";

	/**
	 * The cached value of the '{@link #getAbout() <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected String about = ABOUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFollowers() <em>Followers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> followers;

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
	 * The default value of the '{@link #getNum_of_listeners() <em>Num of listeners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_of_listeners()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_OF_LISTENERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNum_of_listeners() <em>Num of listeners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_of_listeners()
	 * @generated
	 * @ordered
	 */
	protected int num_of_listeners = NUM_OF_LISTENERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwned_albums() <em>Owned albums</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwned_albums()
	 * @generated
	 * @ordered
	 */
	protected EList<Album> owned_albums;

	/**
	 * The cached value of the '{@link #getOwned_solos() <em>Owned solos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwned_solos()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleTrack> owned_solos;

	/**
	 * The cached value of the '{@link #getFeatured_in() <em>Featured in</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatured_in()
	 * @generated
	 * @ordered
	 */
	protected MusicTrack featured_in;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicStreamingServicePackage.Literals.ARTIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbout() {
		return about;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbout(String newAbout) {
		String oldAbout = about;
		about = newAbout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.ARTIST__ABOUT, oldAbout, about));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getFollowers() {
		if (followers == null) {
			followers = new EObjectWithInverseResolvingEList<User>(User.class, this, MusicStreamingServicePackage.ARTIST__FOLLOWERS, MusicStreamingServicePackage.USER__FOLLOWED_ARTIST);
		}
		return followers;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.ARTIST__IMG_URL, oldImg_url, img_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNum_of_listeners() {
		return num_of_listeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNum_of_listeners(int newNum_of_listeners) {
		int oldNum_of_listeners = num_of_listeners;
		num_of_listeners = newNum_of_listeners;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.ARTIST__NUM_OF_LISTENERS, oldNum_of_listeners, num_of_listeners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Album> getOwned_albums() {
		if (owned_albums == null) {
			owned_albums = new EObjectContainmentWithInverseEList<Album>(Album.class, this, MusicStreamingServicePackage.ARTIST__OWNED_ALBUMS, MusicStreamingServicePackage.ALBUM__OWNER);
		}
		return owned_albums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleTrack> getOwned_solos() {
		if (owned_solos == null) {
			owned_solos = new EObjectContainmentWithInverseEList<SingleTrack>(SingleTrack.class, this, MusicStreamingServicePackage.ARTIST__OWNED_SOLOS, MusicStreamingServicePackage.SINGLE_TRACK__OWNER);
		}
		return owned_solos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MusicTrack getFeatured_in() {
		if (featured_in != null && featured_in.eIsProxy()) {
			InternalEObject oldFeatured_in = (InternalEObject)featured_in;
			featured_in = (MusicTrack)eResolveProxy(oldFeatured_in);
			if (featured_in != oldFeatured_in) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MusicStreamingServicePackage.ARTIST__FEATURED_IN, oldFeatured_in, featured_in));
			}
		}
		return featured_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicTrack basicGetFeatured_in() {
		return featured_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatured_in(MusicTrack newFeatured_in, NotificationChain msgs) {
		MusicTrack oldFeatured_in = featured_in;
		featured_in = newFeatured_in;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.ARTIST__FEATURED_IN, oldFeatured_in, newFeatured_in);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatured_in(MusicTrack newFeatured_in) {
		if (newFeatured_in != featured_in) {
			NotificationChain msgs = null;
			if (featured_in != null)
				msgs = ((InternalEObject)featured_in).eInverseRemove(this, MusicStreamingServicePackage.MUSIC_TRACK__FEATURED_ARTIST, MusicTrack.class, msgs);
			if (newFeatured_in != null)
				msgs = ((InternalEObject)newFeatured_in).eInverseAdd(this, MusicStreamingServicePackage.MUSIC_TRACK__FEATURED_ARTIST, MusicTrack.class, msgs);
			msgs = basicSetFeatured_in(newFeatured_in, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.ARTIST__FEATURED_IN, newFeatured_in, newFeatured_in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean MustHaveAlbumOrSolo(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Artist::MustHaveAlbumOrSolo";
		try {
			/**
			 *
			 * inv MustHaveAlbumOrSolo:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = owned_albums->size() > 0 or
			 *         owned_solos->size() > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MusicStreamingServicePackage.Literals.ARTIST___MUST_HAVE_ALBUM_OR_SOLO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MusicStreamingServiceTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<Album> owned_albums = this.getOwned_albums();
				final /*@NonInvalid*/ OrderedSetValue BOXED_owned_albums = idResolver.createOrderedSetOfAll(MusicStreamingServiceTables.ORD_CLSSid_Album, owned_albums);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_owned_albums);
				final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, MusicStreamingServiceTables.INT_0).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (gt) {
					result = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ List<SingleTrack> owned_solos = this.getOwned_solos();
					final /*@NonInvalid*/ OrderedSetValue BOXED_owned_solos = idResolver.createOrderedSetOfAll(MusicStreamingServiceTables.ORD_CLSSid_SingleTrack, owned_solos);
					final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_owned_solos);
					final /*@NonInvalid*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size_0, MusicStreamingServiceTables.INT_0).booleanValue();
					if (gt_0) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, MusicStreamingServiceTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
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
			case MusicStreamingServicePackage.ARTIST__FOLLOWERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFollowers()).basicAdd(otherEnd, msgs);
			case MusicStreamingServicePackage.ARTIST__OWNED_ALBUMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwned_albums()).basicAdd(otherEnd, msgs);
			case MusicStreamingServicePackage.ARTIST__OWNED_SOLOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwned_solos()).basicAdd(otherEnd, msgs);
			case MusicStreamingServicePackage.ARTIST__FEATURED_IN:
				if (featured_in != null)
					msgs = ((InternalEObject)featured_in).eInverseRemove(this, MusicStreamingServicePackage.MUSIC_TRACK__FEATURED_ARTIST, MusicTrack.class, msgs);
				return basicSetFeatured_in((MusicTrack)otherEnd, msgs);
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
			case MusicStreamingServicePackage.ARTIST__FOLLOWERS:
				return ((InternalEList<?>)getFollowers()).basicRemove(otherEnd, msgs);
			case MusicStreamingServicePackage.ARTIST__OWNED_ALBUMS:
				return ((InternalEList<?>)getOwned_albums()).basicRemove(otherEnd, msgs);
			case MusicStreamingServicePackage.ARTIST__OWNED_SOLOS:
				return ((InternalEList<?>)getOwned_solos()).basicRemove(otherEnd, msgs);
			case MusicStreamingServicePackage.ARTIST__FEATURED_IN:
				return basicSetFeatured_in(null, msgs);
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
			case MusicStreamingServicePackage.ARTIST__ABOUT:
				return getAbout();
			case MusicStreamingServicePackage.ARTIST__FOLLOWERS:
				return getFollowers();
			case MusicStreamingServicePackage.ARTIST__IMG_URL:
				return getImg_url();
			case MusicStreamingServicePackage.ARTIST__NUM_OF_LISTENERS:
				return getNum_of_listeners();
			case MusicStreamingServicePackage.ARTIST__OWNED_ALBUMS:
				return getOwned_albums();
			case MusicStreamingServicePackage.ARTIST__OWNED_SOLOS:
				return getOwned_solos();
			case MusicStreamingServicePackage.ARTIST__FEATURED_IN:
				if (resolve) return getFeatured_in();
				return basicGetFeatured_in();
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
			case MusicStreamingServicePackage.ARTIST__ABOUT:
				setAbout((String)newValue);
				return;
			case MusicStreamingServicePackage.ARTIST__FOLLOWERS:
				getFollowers().clear();
				getFollowers().addAll((Collection<? extends User>)newValue);
				return;
			case MusicStreamingServicePackage.ARTIST__IMG_URL:
				setImg_url((String)newValue);
				return;
			case MusicStreamingServicePackage.ARTIST__NUM_OF_LISTENERS:
				setNum_of_listeners((Integer)newValue);
				return;
			case MusicStreamingServicePackage.ARTIST__OWNED_ALBUMS:
				getOwned_albums().clear();
				getOwned_albums().addAll((Collection<? extends Album>)newValue);
				return;
			case MusicStreamingServicePackage.ARTIST__OWNED_SOLOS:
				getOwned_solos().clear();
				getOwned_solos().addAll((Collection<? extends SingleTrack>)newValue);
				return;
			case MusicStreamingServicePackage.ARTIST__FEATURED_IN:
				setFeatured_in((MusicTrack)newValue);
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
			case MusicStreamingServicePackage.ARTIST__ABOUT:
				setAbout(ABOUT_EDEFAULT);
				return;
			case MusicStreamingServicePackage.ARTIST__FOLLOWERS:
				getFollowers().clear();
				return;
			case MusicStreamingServicePackage.ARTIST__IMG_URL:
				setImg_url(IMG_URL_EDEFAULT);
				return;
			case MusicStreamingServicePackage.ARTIST__NUM_OF_LISTENERS:
				setNum_of_listeners(NUM_OF_LISTENERS_EDEFAULT);
				return;
			case MusicStreamingServicePackage.ARTIST__OWNED_ALBUMS:
				getOwned_albums().clear();
				return;
			case MusicStreamingServicePackage.ARTIST__OWNED_SOLOS:
				getOwned_solos().clear();
				return;
			case MusicStreamingServicePackage.ARTIST__FEATURED_IN:
				setFeatured_in((MusicTrack)null);
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
			case MusicStreamingServicePackage.ARTIST__ABOUT:
				return ABOUT_EDEFAULT == null ? about != null : !ABOUT_EDEFAULT.equals(about);
			case MusicStreamingServicePackage.ARTIST__FOLLOWERS:
				return followers != null && !followers.isEmpty();
			case MusicStreamingServicePackage.ARTIST__IMG_URL:
				return IMG_URL_EDEFAULT == null ? img_url != null : !IMG_URL_EDEFAULT.equals(img_url);
			case MusicStreamingServicePackage.ARTIST__NUM_OF_LISTENERS:
				return num_of_listeners != NUM_OF_LISTENERS_EDEFAULT;
			case MusicStreamingServicePackage.ARTIST__OWNED_ALBUMS:
				return owned_albums != null && !owned_albums.isEmpty();
			case MusicStreamingServicePackage.ARTIST__OWNED_SOLOS:
				return owned_solos != null && !owned_solos.isEmpty();
			case MusicStreamingServicePackage.ARTIST__FEATURED_IN:
				return featured_in != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MusicStreamingServicePackage.ARTIST___MUST_HAVE_ALBUM_OR_SOLO__DIAGNOSTICCHAIN_MAP:
				return MustHaveAlbumOrSolo((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (about: ");
		result.append(about);
		result.append(", img_url: ");
		result.append(img_url);
		result.append(", num_of_listeners: ");
		result.append(num_of_listeners);
		result.append(')');
		return result.toString();
	}

} //ArtistImpl
