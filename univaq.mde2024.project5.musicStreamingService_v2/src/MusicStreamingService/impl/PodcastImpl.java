/**
 */
package MusicStreamingService.impl;

import MusicStreamingService.Episodes;
import MusicStreamingService.MusicStreamingServicePackage;
import MusicStreamingService.Podcast;
import MusicStreamingService.PodcastTag;
import MusicStreamingService.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Podcast</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MusicStreamingService.impl.PodcastImpl#getTag <em>Tag</em>}</li>
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
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected EList<PodcastTag> tag;

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
	protected EList<Episodes> episodes;

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
	public EList<PodcastTag> getTag() {
		if (tag == null) {
			tag = new EDataTypeUniqueEList<PodcastTag>(PodcastTag.class, this, MusicStreamingServicePackage.PODCAST__TAG);
		}
		return tag;
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
	public EList<Episodes> getEpisodes() {
		if (episodes == null) {
			episodes = new EObjectContainmentEList<Episodes>(Episodes.class, this, MusicStreamingServicePackage.PODCAST__EPISODES);
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
			case MusicStreamingServicePackage.PODCAST__TAG:
				return getTag();
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
			case MusicStreamingServicePackage.PODCAST__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends PodcastTag>)newValue);
				return;
			case MusicStreamingServicePackage.PODCAST__RATING:
				setRating((Float)newValue);
				return;
			case MusicStreamingServicePackage.PODCAST__IMG_URL:
				setImg_url((String)newValue);
				return;
			case MusicStreamingServicePackage.PODCAST__EPISODES:
				getEpisodes().clear();
				getEpisodes().addAll((Collection<? extends Episodes>)newValue);
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
			case MusicStreamingServicePackage.PODCAST__TAG:
				getTag().clear();
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
			case MusicStreamingServicePackage.PODCAST__TAG:
				return tag != null && !tag.isEmpty();
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (tag: ");
		result.append(tag);
		result.append(", rating: ");
		result.append(rating);
		result.append(", img_url: ");
		result.append(img_url);
		result.append(')');
		return result.toString();
	}

} //PodcastImpl
