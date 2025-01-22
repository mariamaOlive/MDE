/**
 */
package MusicStreamingService.impl;

import MusicStreamingService.MusicStreamingServicePackage;
import MusicStreamingService.MusicStreamingServiceTables;
import MusicStreamingService.Podcast;
import MusicStreamingService.PodcastCategory;
import MusicStreamingService.PodcastEpisode;
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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Podcast</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.impl.PodcastImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link MusicStreamingService.impl.PodcastImpl#getRating <em>Rating</em>}</li>
 *   <li>{@link MusicStreamingService.impl.PodcastImpl#getImg_url <em>Img url</em>}</li>
 *   <li>{@link MusicStreamingService.impl.PodcastImpl#getEpisodes <em>Episodes</em>}</li>
 *   <li>{@link MusicStreamingService.impl.PodcastImpl#getFollowers <em>Followers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PodcastImpl extends NamedElementImpl implements Podcast {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<PodcastCategory> category;

	/**
	 * The default value of the '{@link #getRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected static final float RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected float rating = RATING_EDEFAULT;

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
	 * The cached value of the '{@link #getEpisodes() <em>Episodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodes()
	 * @generated
	 * @ordered
	 */
	protected EList<PodcastEpisode> episodes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PodcastImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicStreamingServicePackage.Literals.PODCAST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PodcastCategory> getCategory() {
		if (category == null) {
			category = new EDataTypeUniqueEList<PodcastCategory>(PodcastCategory.class, this, MusicStreamingServicePackage.PODCAST__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getRating() {
		return rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRating(float newRating) {
		float oldRating = rating;
		rating = newRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.PODCAST__RATING, oldRating, rating));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MusicStreamingServicePackage.PODCAST__IMG_URL, oldImg_url, img_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PodcastEpisode> getEpisodes() {
		if (episodes == null) {
			episodes = new EObjectContainmentEList<PodcastEpisode>(PodcastEpisode.class, this, MusicStreamingServicePackage.PODCAST__EPISODES);
		}
		return episodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getFollowers() {
		if (followers == null) {
			followers = new EObjectWithInverseResolvingEList.ManyInverse<User>(User.class, this, MusicStreamingServicePackage.PODCAST__FOLLOWERS, MusicStreamingServicePackage.USER__SUBSCRIBED_PODCAST);
		}
		return followers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean PodcastMustHaveEpisodes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Podcast::PodcastMustHaveEpisodes";
		try {
			/**
			 *
			 * inv PodcastMustHaveEpisodes:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = not episodes->isEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MusicStreamingServicePackage.Literals.PODCAST___PODCAST_MUST_HAVE_EPISODES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MusicStreamingServiceTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<PodcastEpisode> episodes = this.getEpisodes();
				final /*@NonInvalid*/ OrderedSetValue BOXED_episodes = idResolver.createOrderedSetOfAll(MusicStreamingServiceTables.ORD_CLSSid_PodcastEpisode, episodes);
				final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(BOXED_episodes).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!isEmpty) {
					result = ValueUtil.TRUE_VALUE;
				}
				else {
					if (isEmpty) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						result = null;
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
			case MusicStreamingServicePackage.PODCAST__FOLLOWERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFollowers()).basicAdd(otherEnd, msgs);
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
			case MusicStreamingServicePackage.PODCAST__EPISODES:
				return ((InternalEList<?>)getEpisodes()).basicRemove(otherEnd, msgs);
			case MusicStreamingServicePackage.PODCAST__FOLLOWERS:
				return ((InternalEList<?>)getFollowers()).basicRemove(otherEnd, msgs);
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
			case MusicStreamingServicePackage.PODCAST__CATEGORY:
				return getCategory();
			case MusicStreamingServicePackage.PODCAST__RATING:
				return getRating();
			case MusicStreamingServicePackage.PODCAST__IMG_URL:
				return getImg_url();
			case MusicStreamingServicePackage.PODCAST__EPISODES:
				return getEpisodes();
			case MusicStreamingServicePackage.PODCAST__FOLLOWERS:
				return getFollowers();
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
			case MusicStreamingServicePackage.PODCAST__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends PodcastCategory>)newValue);
				return;
			case MusicStreamingServicePackage.PODCAST__RATING:
				setRating((Float)newValue);
				return;
			case MusicStreamingServicePackage.PODCAST__IMG_URL:
				setImg_url((String)newValue);
				return;
			case MusicStreamingServicePackage.PODCAST__EPISODES:
				getEpisodes().clear();
				getEpisodes().addAll((Collection<? extends PodcastEpisode>)newValue);
				return;
			case MusicStreamingServicePackage.PODCAST__FOLLOWERS:
				getFollowers().clear();
				getFollowers().addAll((Collection<? extends User>)newValue);
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
			case MusicStreamingServicePackage.PODCAST__CATEGORY:
				getCategory().clear();
				return;
			case MusicStreamingServicePackage.PODCAST__RATING:
				setRating(RATING_EDEFAULT);
				return;
			case MusicStreamingServicePackage.PODCAST__IMG_URL:
				setImg_url(IMG_URL_EDEFAULT);
				return;
			case MusicStreamingServicePackage.PODCAST__EPISODES:
				getEpisodes().clear();
				return;
			case MusicStreamingServicePackage.PODCAST__FOLLOWERS:
				getFollowers().clear();
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
			case MusicStreamingServicePackage.PODCAST__CATEGORY:
				return category != null && !category.isEmpty();
			case MusicStreamingServicePackage.PODCAST__RATING:
				return rating != RATING_EDEFAULT;
			case MusicStreamingServicePackage.PODCAST__IMG_URL:
				return IMG_URL_EDEFAULT == null ? img_url != null : !IMG_URL_EDEFAULT.equals(img_url);
			case MusicStreamingServicePackage.PODCAST__EPISODES:
				return episodes != null && !episodes.isEmpty();
			case MusicStreamingServicePackage.PODCAST__FOLLOWERS:
				return followers != null && !followers.isEmpty();
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
			case MusicStreamingServicePackage.PODCAST___PODCAST_MUST_HAVE_EPISODES__DIAGNOSTICCHAIN_MAP:
				return PodcastMustHaveEpisodes((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (category: ");
		result.append(category);
		result.append(", rating: ");
		result.append(rating);
		result.append(", img_url: ");
		result.append(img_url);
		result.append(')');
		return result.toString();
	}

} //PodcastImpl
