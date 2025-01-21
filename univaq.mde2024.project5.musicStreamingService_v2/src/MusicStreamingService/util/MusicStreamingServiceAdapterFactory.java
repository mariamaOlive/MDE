/**
 */
package MusicStreamingService.util;

import MusicStreamingService.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MusicStreamingService.MusicStreamingServicePackage
 * @generated
 */
public class MusicStreamingServiceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MusicStreamingServicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicStreamingServiceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MusicStreamingServicePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MusicStreamingServiceSwitch<Adapter> modelSwitch =
		new MusicStreamingServiceSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseStreamingService(StreamingService object) {
				return createStreamingServiceAdapter();
			}
			@Override
			public Adapter caseComposer(Composer object) {
				return createComposerAdapter();
			}
			@Override
			public Adapter caseArtist(Artist object) {
				return createArtistAdapter();
			}
			@Override
			public Adapter caseTrack(Track object) {
				return createTrackAdapter();
			}
			@Override
			public Adapter caseMusicTrack(MusicTrack object) {
				return createMusicTrackAdapter();
			}
			@Override
			public Adapter caseSingleTrack(SingleTrack object) {
				return createSingleTrackAdapter();
			}
			@Override
			public Adapter caseAlbum(Album object) {
				return createAlbumAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter casePlaylist(Playlist object) {
				return createPlaylistAdapter();
			}
			@Override
			public Adapter casePodcast(Podcast object) {
				return createPodcastAdapter();
			}
			@Override
			public Adapter caseEpisodes(Episodes object) {
				return createEpisodesAdapter();
			}
			@Override
			public Adapter caseAlbumTrack(AlbumTrack object) {
				return createAlbumTrackAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link MusicStreamingService.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MusicStreamingService.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MusicStreamingService.StreamingService <em>Streaming Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MusicStreamingService.StreamingService
	 * @generated
	 */
	public Adapter createStreamingServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MusicStreamingService.Composer <em>Composer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MusicStreamingService.Composer
	 * @generated
	 */
	public Adapter createComposerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MusicStreamingService.Artist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MusicStreamingService.Artist
	 * @generated
	 */
	public Adapter createArtistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MusicStreamingService.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MusicStreamingService.Track
	 * @generated
	 */
	public Adapter createTrackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MusicStreamingService.MusicTrack <em>Music Track</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MusicStreamingService.MusicTrack
	 * @generated
	 */
	public Adapter createMusicTrackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MusicStreamingService.SingleTrack <em>Single Track</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MusicStreamingService.SingleTrack
	 * @generated
	 */
	public Adapter createSingleTrackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MusicStreamingService.Album <em>Album</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MusicStreamingService.Album
	 * @generated
	 */
	public Adapter createAlbumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MusicStreamingService.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MusicStreamingService.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MusicStreamingService.Playlist <em>Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MusicStreamingService.Playlist
	 * @generated
	 */
	public Adapter createPlaylistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MusicStreamingService.Podcast <em>Podcast</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MusicStreamingService.Podcast
	 * @generated
	 */
	public Adapter createPodcastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MusicStreamingService.Episodes <em>Episodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MusicStreamingService.Episodes
	 * @generated
	 */
	public Adapter createEpisodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MusicStreamingService.AlbumTrack <em>Album Track</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MusicStreamingService.AlbumTrack
	 * @generated
	 */
	public Adapter createAlbumTrackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MusicStreamingServiceAdapterFactory
