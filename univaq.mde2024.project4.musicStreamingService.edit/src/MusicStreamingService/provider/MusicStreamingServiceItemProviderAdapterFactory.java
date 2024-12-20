/**
 */
package MusicStreamingService.provider;

import MusicStreamingService.util.MusicStreamingServiceAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MusicStreamingServiceItemProviderAdapterFactory extends MusicStreamingServiceAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicStreamingServiceItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link MusicStreamingService.StreamingService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamingServiceItemProvider streamingServiceItemProvider;

	/**
	 * This creates an adapter for a {@link MusicStreamingService.StreamingService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStreamingServiceAdapter() {
		if (streamingServiceItemProvider == null) {
			streamingServiceItemProvider = new StreamingServiceItemProvider(this);
		}

		return streamingServiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MusicStreamingService.Composer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposerItemProvider composerItemProvider;

	/**
	 * This creates an adapter for a {@link MusicStreamingService.Composer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComposerAdapter() {
		if (composerItemProvider == null) {
			composerItemProvider = new ComposerItemProvider(this);
		}

		return composerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MusicStreamingService.Artist} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtistItemProvider artistItemProvider;

	/**
	 * This creates an adapter for a {@link MusicStreamingService.Artist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArtistAdapter() {
		if (artistItemProvider == null) {
			artistItemProvider = new ArtistItemProvider(this);
		}

		return artistItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MusicStreamingService.SingleTrack} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleTrackItemProvider singleTrackItemProvider;

	/**
	 * This creates an adapter for a {@link MusicStreamingService.SingleTrack}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSingleTrackAdapter() {
		if (singleTrackItemProvider == null) {
			singleTrackItemProvider = new SingleTrackItemProvider(this);
		}

		return singleTrackItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MusicStreamingService.Album} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlbumItemProvider albumItemProvider;

	/**
	 * This creates an adapter for a {@link MusicStreamingService.Album}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAlbumAdapter() {
		if (albumItemProvider == null) {
			albumItemProvider = new AlbumItemProvider(this);
		}

		return albumItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MusicStreamingService.User} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserItemProvider userItemProvider;

	/**
	 * This creates an adapter for a {@link MusicStreamingService.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUserAdapter() {
		if (userItemProvider == null) {
			userItemProvider = new UserItemProvider(this);
		}

		return userItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MusicStreamingService.Playlist} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaylistItemProvider playlistItemProvider;

	/**
	 * This creates an adapter for a {@link MusicStreamingService.Playlist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlaylistAdapter() {
		if (playlistItemProvider == null) {
			playlistItemProvider = new PlaylistItemProvider(this);
		}

		return playlistItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MusicStreamingService.Podcast} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PodcastItemProvider podcastItemProvider;

	/**
	 * This creates an adapter for a {@link MusicStreamingService.Podcast}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPodcastAdapter() {
		if (podcastItemProvider == null) {
			podcastItemProvider = new PodcastItemProvider(this);
		}

		return podcastItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MusicStreamingService.Episodes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpisodesItemProvider episodesItemProvider;

	/**
	 * This creates an adapter for a {@link MusicStreamingService.Episodes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEpisodesAdapter() {
		if (episodesItemProvider == null) {
			episodesItemProvider = new EpisodesItemProvider(this);
		}

		return episodesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MusicStreamingService.AlbumTrack} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlbumTrackItemProvider albumTrackItemProvider;

	/**
	 * This creates an adapter for a {@link MusicStreamingService.AlbumTrack}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAlbumTrackAdapter() {
		if (albumTrackItemProvider == null) {
			albumTrackItemProvider = new AlbumTrackItemProvider(this);
		}

		return albumTrackItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (streamingServiceItemProvider != null) streamingServiceItemProvider.dispose();
		if (composerItemProvider != null) composerItemProvider.dispose();
		if (artistItemProvider != null) artistItemProvider.dispose();
		if (singleTrackItemProvider != null) singleTrackItemProvider.dispose();
		if (albumItemProvider != null) albumItemProvider.dispose();
		if (userItemProvider != null) userItemProvider.dispose();
		if (playlistItemProvider != null) playlistItemProvider.dispose();
		if (podcastItemProvider != null) podcastItemProvider.dispose();
		if (episodesItemProvider != null) episodesItemProvider.dispose();
		if (albumTrackItemProvider != null) albumTrackItemProvider.dispose();
	}

}
