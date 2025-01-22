/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /univaq.mde2024.project5.musicStreamingService_v2/model/MusicStreamingService.ecore
 * using:
 *   /univaq.mde2024.project5.musicStreamingService_v2/model/Spotify_v3.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package MusicStreamingService;

// import MusicStreamingService.MusicStreamingServicePackage;
// import MusicStreamingService.MusicStreamingServiceTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * MusicStreamingServiceTables provides the dispatch tables for the MusicStreamingService for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class MusicStreamingServiceTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(MusicStreamingServicePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_univaq_disim_mde_course_project5_s_MSS = IdManager.getNsURIPackageId("https://it.univaq.disim.mde.course.project5/MSS", null, MusicStreamingServicePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Album = MusicStreamingServiceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_project5_s_MSS.getClassId("Album", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AlbumTrack = MusicStreamingServiceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_project5_s_MSS.getClassId("AlbumTrack", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Artist = MusicStreamingServiceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_project5_s_MSS.getClassId("Artist", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AudioTrack = MusicStreamingServiceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_project5_s_MSS.getClassId("AudioTrack", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Concert = MusicStreamingServiceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_project5_s_MSS.getClassId("Concert", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_MusicTrack = MusicStreamingServiceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_project5_s_MSS.getClassId("MusicTrack", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Playlist = MusicStreamingServiceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_project5_s_MSS.getClassId("Playlist", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Podcast = MusicStreamingServiceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_project5_s_MSS.getClassId("Podcast", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PodcastEpisode = MusicStreamingServiceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_project5_s_MSS.getClassId("PodcastEpisode", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SingleTrack = MusicStreamingServiceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_project5_s_MSS.getClassId("SingleTrack", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_StreamingService = MusicStreamingServiceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_project5_s_MSS.getClassId("StreamingService", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_User = MusicStreamingServiceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_project5_s_MSS.getClassId("User", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = MusicStreamingServiceTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = MusicStreamingServiceTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = MusicStreamingServiceTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_MusicGenre = MusicStreamingServiceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_project5_s_MSS.getEnumerationId("MusicGenre");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Order = MusicStreamingServiceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_project5_s_MSS.getEnumerationId("Order");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PodcastCategory = MusicStreamingServiceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_project5_s_MSS.getEnumerationId("PodcastCategory");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Concert = TypeId.BAG.getSpecializedId(MusicStreamingServiceTables.CLSSid_Concert, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Playlist = TypeId.BAG.getSpecializedId(MusicStreamingServiceTables.CLSSid_Playlist, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Album = TypeId.ORDERED_SET.getSpecializedId(MusicStreamingServiceTables.CLSSid_Album, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AlbumTrack = TypeId.ORDERED_SET.getSpecializedId(MusicStreamingServiceTables.CLSSid_AlbumTrack, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Artist = TypeId.ORDERED_SET.getSpecializedId(MusicStreamingServiceTables.CLSSid_Artist, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Artist_0 = TypeId.ORDERED_SET.getSpecializedId(MusicStreamingServiceTables.CLSSid_Artist, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AudioTrack = TypeId.ORDERED_SET.getSpecializedId(MusicStreamingServiceTables.CLSSid_AudioTrack, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Concert = TypeId.ORDERED_SET.getSpecializedId(MusicStreamingServiceTables.CLSSid_Concert, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Playlist = TypeId.ORDERED_SET.getSpecializedId(MusicStreamingServiceTables.CLSSid_Playlist, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Podcast = TypeId.ORDERED_SET.getSpecializedId(MusicStreamingServiceTables.CLSSid_Podcast, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_PodcastEpisode = TypeId.ORDERED_SET.getSpecializedId(MusicStreamingServiceTables.CLSSid_PodcastEpisode, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_SingleTrack = TypeId.ORDERED_SET.getSpecializedId(MusicStreamingServiceTables.CLSSid_SingleTrack, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_User = TypeId.ORDERED_SET.getSpecializedId(MusicStreamingServiceTables.CLSSid_User, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_User_0 = TypeId.ORDERED_SET.getSpecializedId(MusicStreamingServiceTables.CLSSid_User, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_ENUMid_MusicGenre = TypeId.ORDERED_SET.getSpecializedId(MusicStreamingServiceTables.ENUMid_MusicGenre, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_ENUMid_PodcastCategory = TypeId.ORDERED_SET.getSpecializedId(MusicStreamingServiceTables.ENUMid_PodcastCategory, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_DATAid_EInt = TypeId.SEQUENCE.getSpecializedId(MusicStreamingServiceTables.DATAid_EInt, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_User = TypeId.SET.getSpecializedId(MusicStreamingServiceTables.CLSSid_User, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			MusicStreamingServiceTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MusicStreamingServiceTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Album = new EcoreExecutorType(MusicStreamingServicePackage.Literals.ALBUM, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _AlbumTrack = new EcoreExecutorType(MusicStreamingServicePackage.Literals.ALBUM_TRACK, PACKAGE, 0);
		public static final EcoreExecutorType _Artist = new EcoreExecutorType(MusicStreamingServicePackage.Literals.ARTIST, PACKAGE, 0);
		public static final EcoreExecutorType _AudioTrack = new EcoreExecutorType(MusicStreamingServicePackage.Literals.AUDIO_TRACK, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Concert = new EcoreExecutorType(MusicStreamingServicePackage.Literals.CONCERT, PACKAGE, 0);
		public static final EcoreExecutorType _LiveAlbum = new EcoreExecutorType(MusicStreamingServicePackage.Literals.LIVE_ALBUM, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _MusicGenre = new EcoreExecutorEnumeration(MusicStreamingServicePackage.Literals.MUSIC_GENRE, PACKAGE, 0);
		public static final EcoreExecutorType _MusicTrack = new EcoreExecutorType(MusicStreamingServicePackage.Literals.MUSIC_TRACK, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(MusicStreamingServicePackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _Order = new EcoreExecutorEnumeration(MusicStreamingServicePackage.Literals.ORDER, PACKAGE, 0);
		public static final EcoreExecutorType _Playlist = new EcoreExecutorType(MusicStreamingServicePackage.Literals.PLAYLIST, PACKAGE, 0);
		public static final EcoreExecutorType _Podcast = new EcoreExecutorType(MusicStreamingServicePackage.Literals.PODCAST, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PodcastCategory = new EcoreExecutorEnumeration(MusicStreamingServicePackage.Literals.PODCAST_CATEGORY, PACKAGE, 0);
		public static final EcoreExecutorType _PodcastEpisode = new EcoreExecutorType(MusicStreamingServicePackage.Literals.PODCAST_EPISODE, PACKAGE, 0);
		public static final EcoreExecutorType _SingleTrack = new EcoreExecutorType(MusicStreamingServicePackage.Literals.SINGLE_TRACK, PACKAGE, 0);
		public static final EcoreExecutorType _StreamingService = new EcoreExecutorType(MusicStreamingServicePackage.Literals.STREAMING_SERVICE, PACKAGE, 0);
		public static final EcoreExecutorType _StudioAlbum = new EcoreExecutorType(MusicStreamingServicePackage.Literals.STUDIO_ALBUM, PACKAGE, 0);
		public static final EcoreExecutorType _User = new EcoreExecutorType(MusicStreamingServicePackage.Literals.USER, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Album,
			_AlbumTrack,
			_Artist,
			_AudioTrack,
			_Concert,
			_LiveAlbum,
			_MusicGenre,
			_MusicTrack,
			_NamedElement,
			_Order,
			_Playlist,
			_Podcast,
			_PodcastCategory,
			_PodcastEpisode,
			_SingleTrack,
			_StreamingService,
			_StudioAlbum,
			_User
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MusicStreamingServiceTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Album__Album = new ExecutorFragment(Types._Album, MusicStreamingServiceTables.Types._Album);
		private static final ExecutorFragment _Album__NamedElement = new ExecutorFragment(Types._Album, MusicStreamingServiceTables.Types._NamedElement);
		private static final ExecutorFragment _Album__OclAny = new ExecutorFragment(Types._Album, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Album__OclElement = new ExecutorFragment(Types._Album, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AlbumTrack__AlbumTrack = new ExecutorFragment(Types._AlbumTrack, MusicStreamingServiceTables.Types._AlbumTrack);
		private static final ExecutorFragment _AlbumTrack__AudioTrack = new ExecutorFragment(Types._AlbumTrack, MusicStreamingServiceTables.Types._AudioTrack);
		private static final ExecutorFragment _AlbumTrack__MusicTrack = new ExecutorFragment(Types._AlbumTrack, MusicStreamingServiceTables.Types._MusicTrack);
		private static final ExecutorFragment _AlbumTrack__NamedElement = new ExecutorFragment(Types._AlbumTrack, MusicStreamingServiceTables.Types._NamedElement);
		private static final ExecutorFragment _AlbumTrack__OclAny = new ExecutorFragment(Types._AlbumTrack, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AlbumTrack__OclElement = new ExecutorFragment(Types._AlbumTrack, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Artist__Artist = new ExecutorFragment(Types._Artist, MusicStreamingServiceTables.Types._Artist);
		private static final ExecutorFragment _Artist__NamedElement = new ExecutorFragment(Types._Artist, MusicStreamingServiceTables.Types._NamedElement);
		private static final ExecutorFragment _Artist__OclAny = new ExecutorFragment(Types._Artist, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Artist__OclElement = new ExecutorFragment(Types._Artist, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AudioTrack__AudioTrack = new ExecutorFragment(Types._AudioTrack, MusicStreamingServiceTables.Types._AudioTrack);
		private static final ExecutorFragment _AudioTrack__NamedElement = new ExecutorFragment(Types._AudioTrack, MusicStreamingServiceTables.Types._NamedElement);
		private static final ExecutorFragment _AudioTrack__OclAny = new ExecutorFragment(Types._AudioTrack, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AudioTrack__OclElement = new ExecutorFragment(Types._AudioTrack, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Concert__Concert = new ExecutorFragment(Types._Concert, MusicStreamingServiceTables.Types._Concert);
		private static final ExecutorFragment _Concert__NamedElement = new ExecutorFragment(Types._Concert, MusicStreamingServiceTables.Types._NamedElement);
		private static final ExecutorFragment _Concert__OclAny = new ExecutorFragment(Types._Concert, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Concert__OclElement = new ExecutorFragment(Types._Concert, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LiveAlbum__Album = new ExecutorFragment(Types._LiveAlbum, MusicStreamingServiceTables.Types._Album);
		private static final ExecutorFragment _LiveAlbum__LiveAlbum = new ExecutorFragment(Types._LiveAlbum, MusicStreamingServiceTables.Types._LiveAlbum);
		private static final ExecutorFragment _LiveAlbum__NamedElement = new ExecutorFragment(Types._LiveAlbum, MusicStreamingServiceTables.Types._NamedElement);
		private static final ExecutorFragment _LiveAlbum__OclAny = new ExecutorFragment(Types._LiveAlbum, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LiveAlbum__OclElement = new ExecutorFragment(Types._LiveAlbum, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MusicGenre__MusicGenre = new ExecutorFragment(Types._MusicGenre, MusicStreamingServiceTables.Types._MusicGenre);
		private static final ExecutorFragment _MusicGenre__OclAny = new ExecutorFragment(Types._MusicGenre, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MusicGenre__OclElement = new ExecutorFragment(Types._MusicGenre, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MusicGenre__OclEnumeration = new ExecutorFragment(Types._MusicGenre, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _MusicGenre__OclType = new ExecutorFragment(Types._MusicGenre, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _MusicTrack__AudioTrack = new ExecutorFragment(Types._MusicTrack, MusicStreamingServiceTables.Types._AudioTrack);
		private static final ExecutorFragment _MusicTrack__MusicTrack = new ExecutorFragment(Types._MusicTrack, MusicStreamingServiceTables.Types._MusicTrack);
		private static final ExecutorFragment _MusicTrack__NamedElement = new ExecutorFragment(Types._MusicTrack, MusicStreamingServiceTables.Types._NamedElement);
		private static final ExecutorFragment _MusicTrack__OclAny = new ExecutorFragment(Types._MusicTrack, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MusicTrack__OclElement = new ExecutorFragment(Types._MusicTrack, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, MusicStreamingServiceTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Order__OclAny = new ExecutorFragment(Types._Order, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Order__OclElement = new ExecutorFragment(Types._Order, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Order__OclEnumeration = new ExecutorFragment(Types._Order, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Order__OclType = new ExecutorFragment(Types._Order, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Order__Order = new ExecutorFragment(Types._Order, MusicStreamingServiceTables.Types._Order);

		private static final ExecutorFragment _Playlist__NamedElement = new ExecutorFragment(Types._Playlist, MusicStreamingServiceTables.Types._NamedElement);
		private static final ExecutorFragment _Playlist__OclAny = new ExecutorFragment(Types._Playlist, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Playlist__OclElement = new ExecutorFragment(Types._Playlist, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Playlist__Playlist = new ExecutorFragment(Types._Playlist, MusicStreamingServiceTables.Types._Playlist);

		private static final ExecutorFragment _Podcast__NamedElement = new ExecutorFragment(Types._Podcast, MusicStreamingServiceTables.Types._NamedElement);
		private static final ExecutorFragment _Podcast__OclAny = new ExecutorFragment(Types._Podcast, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Podcast__OclElement = new ExecutorFragment(Types._Podcast, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Podcast__Podcast = new ExecutorFragment(Types._Podcast, MusicStreamingServiceTables.Types._Podcast);

		private static final ExecutorFragment _PodcastCategory__OclAny = new ExecutorFragment(Types._PodcastCategory, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PodcastCategory__OclElement = new ExecutorFragment(Types._PodcastCategory, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PodcastCategory__OclEnumeration = new ExecutorFragment(Types._PodcastCategory, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PodcastCategory__OclType = new ExecutorFragment(Types._PodcastCategory, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PodcastCategory__PodcastCategory = new ExecutorFragment(Types._PodcastCategory, MusicStreamingServiceTables.Types._PodcastCategory);

		private static final ExecutorFragment _PodcastEpisode__AudioTrack = new ExecutorFragment(Types._PodcastEpisode, MusicStreamingServiceTables.Types._AudioTrack);
		private static final ExecutorFragment _PodcastEpisode__NamedElement = new ExecutorFragment(Types._PodcastEpisode, MusicStreamingServiceTables.Types._NamedElement);
		private static final ExecutorFragment _PodcastEpisode__OclAny = new ExecutorFragment(Types._PodcastEpisode, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PodcastEpisode__OclElement = new ExecutorFragment(Types._PodcastEpisode, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PodcastEpisode__PodcastEpisode = new ExecutorFragment(Types._PodcastEpisode, MusicStreamingServiceTables.Types._PodcastEpisode);

		private static final ExecutorFragment _SingleTrack__AudioTrack = new ExecutorFragment(Types._SingleTrack, MusicStreamingServiceTables.Types._AudioTrack);
		private static final ExecutorFragment _SingleTrack__MusicTrack = new ExecutorFragment(Types._SingleTrack, MusicStreamingServiceTables.Types._MusicTrack);
		private static final ExecutorFragment _SingleTrack__NamedElement = new ExecutorFragment(Types._SingleTrack, MusicStreamingServiceTables.Types._NamedElement);
		private static final ExecutorFragment _SingleTrack__OclAny = new ExecutorFragment(Types._SingleTrack, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SingleTrack__OclElement = new ExecutorFragment(Types._SingleTrack, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SingleTrack__SingleTrack = new ExecutorFragment(Types._SingleTrack, MusicStreamingServiceTables.Types._SingleTrack);

		private static final ExecutorFragment _StreamingService__NamedElement = new ExecutorFragment(Types._StreamingService, MusicStreamingServiceTables.Types._NamedElement);
		private static final ExecutorFragment _StreamingService__OclAny = new ExecutorFragment(Types._StreamingService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StreamingService__OclElement = new ExecutorFragment(Types._StreamingService, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StreamingService__StreamingService = new ExecutorFragment(Types._StreamingService, MusicStreamingServiceTables.Types._StreamingService);

		private static final ExecutorFragment _StudioAlbum__Album = new ExecutorFragment(Types._StudioAlbum, MusicStreamingServiceTables.Types._Album);
		private static final ExecutorFragment _StudioAlbum__NamedElement = new ExecutorFragment(Types._StudioAlbum, MusicStreamingServiceTables.Types._NamedElement);
		private static final ExecutorFragment _StudioAlbum__OclAny = new ExecutorFragment(Types._StudioAlbum, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StudioAlbum__OclElement = new ExecutorFragment(Types._StudioAlbum, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StudioAlbum__StudioAlbum = new ExecutorFragment(Types._StudioAlbum, MusicStreamingServiceTables.Types._StudioAlbum);

		private static final ExecutorFragment _User__NamedElement = new ExecutorFragment(Types._User, MusicStreamingServiceTables.Types._NamedElement);
		private static final ExecutorFragment _User__OclAny = new ExecutorFragment(Types._User, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _User__OclElement = new ExecutorFragment(Types._User, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _User__User = new ExecutorFragment(Types._User, MusicStreamingServiceTables.Types._User);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MusicStreamingServiceTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final ParameterTypes _PodcastCategory = TypeUtil.createParameterTypes(MusicStreamingServiceTables.Types._PodcastCategory);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MusicStreamingServiceTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Album__calculateTotalDuration = new ExecutorOperation("calculateTotalDuration", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Album,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _User__getPodcastsByTag = new ExecutorOperation("getPodcastsByTag", Parameters._PodcastCategory, Types._User,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MusicStreamingServiceTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Album__duration = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.ALBUM__DURATION, Types._Album, 0);
		public static final ExecutorProperty _Album__img_url = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.ALBUM__IMG_URL, Types._Album, 1);
		public static final ExecutorProperty _Album__owner = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.ALBUM__OWNER, Types._Album, 2);
		public static final ExecutorProperty _Album__tracks = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.ALBUM__TRACKS, Types._Album, 3);

		public static final ExecutorProperty _AlbumTrack__position = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.ALBUM_TRACK__POSITION, Types._AlbumTrack, 0);
		public static final ExecutorProperty _AlbumTrack__Album__tracks = new ExecutorPropertyWithImplementation("Album", Types._AlbumTrack, 1, new EcoreLibraryOppositeProperty(MusicStreamingServicePackage.Literals.ALBUM__TRACKS));

		public static final ExecutorProperty _Artist__about = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.ARTIST__ABOUT, Types._Artist, 0);
		public static final ExecutorProperty _Artist__featured_in = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.ARTIST__FEATURED_IN, Types._Artist, 1);
		public static final ExecutorProperty _Artist__followers = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.ARTIST__FOLLOWERS, Types._Artist, 2);
		public static final ExecutorProperty _Artist__img_url = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.ARTIST__IMG_URL, Types._Artist, 3);
		public static final ExecutorProperty _Artist__num_of_listeners = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.ARTIST__NUM_OF_LISTENERS, Types._Artist, 4);
		public static final ExecutorProperty _Artist__owned_albums = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.ARTIST__OWNED_ALBUMS, Types._Artist, 5);
		public static final ExecutorProperty _Artist__owned_solos = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.ARTIST__OWNED_SOLOS, Types._Artist, 6);
		public static final ExecutorProperty _Artist__Concert__Artists = new ExecutorPropertyWithImplementation("Concert", Types._Artist, 7, new EcoreLibraryOppositeProperty(MusicStreamingServicePackage.Literals.CONCERT__ARTISTS));
		public static final ExecutorProperty _Artist__StreamingService__Artist = new ExecutorPropertyWithImplementation("StreamingService", Types._Artist, 8, new EcoreLibraryOppositeProperty(MusicStreamingServicePackage.Literals.STREAMING_SERVICE__ARTIST));

		public static final ExecutorProperty _AudioTrack__duration = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.AUDIO_TRACK__DURATION, Types._AudioTrack, 0);
		public static final ExecutorProperty _AudioTrack__Playlist__tracks = new ExecutorPropertyWithImplementation("Playlist", Types._AudioTrack, 1, new EcoreLibraryOppositeProperty(MusicStreamingServicePackage.Literals.PLAYLIST__TRACKS));

		public static final ExecutorProperty _Concert__Artists = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.CONCERT__ARTISTS, Types._Concert, 0);
		public static final ExecutorProperty _Concert__date = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.CONCERT__DATE, Types._Concert, 1);
		public static final ExecutorProperty _Concert__location = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.CONCERT__LOCATION, Types._Concert, 2);
		public static final ExecutorProperty _Concert__StreamingService__Concert = new ExecutorPropertyWithImplementation("StreamingService", Types._Concert, 3, new EcoreLibraryOppositeProperty(MusicStreamingServicePackage.Literals.STREAMING_SERVICE__CONCERT));

		public static final ExecutorProperty _LiveAlbum__eventLocation = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.LIVE_ALBUM__EVENT_LOCATION, Types._LiveAlbum, 0);

		public static final ExecutorProperty _MusicTrack__featured_artist = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.MUSIC_TRACK__FEATURED_ARTIST, Types._MusicTrack, 0);
		public static final ExecutorProperty _MusicTrack__genre = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.MUSIC_TRACK__GENRE, Types._MusicTrack, 1);
		public static final ExecutorProperty _MusicTrack__lyrics = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.MUSIC_TRACK__LYRICS, Types._MusicTrack, 2);

		public static final ExecutorProperty _NamedElement__Name = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _Playlist__duration = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.PLAYLIST__DURATION, Types._Playlist, 0);
		public static final ExecutorProperty _Playlist__num_of_tracks = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.PLAYLIST__NUM_OF_TRACKS, Types._Playlist, 1);
		public static final ExecutorProperty _Playlist__order = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.PLAYLIST__ORDER, Types._Playlist, 2);
		public static final ExecutorProperty _Playlist__owners = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.PLAYLIST__OWNERS, Types._Playlist, 3);
		public static final ExecutorProperty _Playlist__tracks = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.PLAYLIST__TRACKS, Types._Playlist, 4);
		public static final ExecutorProperty _Playlist__StreamingService__Playlist = new ExecutorPropertyWithImplementation("StreamingService", Types._Playlist, 5, new EcoreLibraryOppositeProperty(MusicStreamingServicePackage.Literals.STREAMING_SERVICE__PLAYLIST));

		public static final ExecutorProperty _Podcast__category = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.PODCAST__CATEGORY, Types._Podcast, 0);
		public static final ExecutorProperty _Podcast__episodes = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.PODCAST__EPISODES, Types._Podcast, 1);
		public static final ExecutorProperty _Podcast__followers = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.PODCAST__FOLLOWERS, Types._Podcast, 2);
		public static final ExecutorProperty _Podcast__img_url = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.PODCAST__IMG_URL, Types._Podcast, 3);
		public static final ExecutorProperty _Podcast__rating = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.PODCAST__RATING, Types._Podcast, 4);
		public static final ExecutorProperty _Podcast__StreamingService__podcasts = new ExecutorPropertyWithImplementation("StreamingService", Types._Podcast, 5, new EcoreLibraryOppositeProperty(MusicStreamingServicePackage.Literals.STREAMING_SERVICE__PODCASTS));

		public static final ExecutorProperty _PodcastEpisode__date_created = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.PODCAST_EPISODE__DATE_CREATED, Types._PodcastEpisode, 0);
		public static final ExecutorProperty _PodcastEpisode__description = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.PODCAST_EPISODE__DESCRIPTION, Types._PodcastEpisode, 1);
		public static final ExecutorProperty _PodcastEpisode__transcript = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.PODCAST_EPISODE__TRANSCRIPT, Types._PodcastEpisode, 2);
		public static final ExecutorProperty _PodcastEpisode__Podcast__episodes = new ExecutorPropertyWithImplementation("Podcast", Types._PodcastEpisode, 3, new EcoreLibraryOppositeProperty(MusicStreamingServicePackage.Literals.PODCAST__EPISODES));

		public static final ExecutorProperty _SingleTrack__owner = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.SINGLE_TRACK__OWNER, Types._SingleTrack, 0);

		public static final ExecutorProperty _StreamingService__Artist = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.STREAMING_SERVICE__ARTIST, Types._StreamingService, 0);
		public static final ExecutorProperty _StreamingService__Concert = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.STREAMING_SERVICE__CONCERT, Types._StreamingService, 1);
		public static final ExecutorProperty _StreamingService__Playlist = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.STREAMING_SERVICE__PLAYLIST, Types._StreamingService, 2);
		public static final ExecutorProperty _StreamingService__listeners = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.STREAMING_SERVICE__LISTENERS, Types._StreamingService, 3);
		public static final ExecutorProperty _StreamingService__podcasts = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.STREAMING_SERVICE__PODCASTS, Types._StreamingService, 4);

		public static final ExecutorProperty _StudioAlbum__recordingStudio = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.STUDIO_ALBUM__RECORDING_STUDIO, Types._StudioAlbum, 0);

		public static final ExecutorProperty _User__email = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.USER__EMAIL, Types._User, 0);
		public static final ExecutorProperty _User__followed_artist = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.USER__FOLLOWED_ARTIST, Types._User, 1);
		public static final ExecutorProperty _User__owned_playlist = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.USER__OWNED_PLAYLIST, Types._User, 2);
		public static final ExecutorProperty _User__password = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.USER__PASSWORD, Types._User, 3);
		public static final ExecutorProperty _User__subscribed_podcast = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.USER__SUBSCRIBED_PODCAST, Types._User, 4);
		public static final ExecutorProperty _User__username = new EcoreExecutorProperty(MusicStreamingServicePackage.Literals.USER__USERNAME, Types._User, 5);
		public static final ExecutorProperty _User__StreamingService__listeners = new ExecutorPropertyWithImplementation("StreamingService", Types._User, 6, new EcoreLibraryOppositeProperty(MusicStreamingServicePackage.Literals.STREAMING_SERVICE__LISTENERS));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MusicStreamingServiceTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Album =
			{
				Fragments._Album__OclAny /* 0 */,
				Fragments._Album__OclElement /* 1 */,
				Fragments._Album__NamedElement /* 2 */,
				Fragments._Album__Album /* 3 */
			};
		private static final int /*@NonNull*/ [] __Album = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AlbumTrack =
			{
				Fragments._AlbumTrack__OclAny /* 0 */,
				Fragments._AlbumTrack__OclElement /* 1 */,
				Fragments._AlbumTrack__NamedElement /* 2 */,
				Fragments._AlbumTrack__AudioTrack /* 3 */,
				Fragments._AlbumTrack__MusicTrack /* 4 */,
				Fragments._AlbumTrack__AlbumTrack /* 5 */
			};
		private static final int /*@NonNull*/ [] __AlbumTrack = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Artist =
			{
				Fragments._Artist__OclAny /* 0 */,
				Fragments._Artist__OclElement /* 1 */,
				Fragments._Artist__NamedElement /* 2 */,
				Fragments._Artist__Artist /* 3 */
			};
		private static final int /*@NonNull*/ [] __Artist = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AudioTrack =
			{
				Fragments._AudioTrack__OclAny /* 0 */,
				Fragments._AudioTrack__OclElement /* 1 */,
				Fragments._AudioTrack__NamedElement /* 2 */,
				Fragments._AudioTrack__AudioTrack /* 3 */
			};
		private static final int /*@NonNull*/ [] __AudioTrack = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Concert =
			{
				Fragments._Concert__OclAny /* 0 */,
				Fragments._Concert__OclElement /* 1 */,
				Fragments._Concert__NamedElement /* 2 */,
				Fragments._Concert__Concert /* 3 */
			};
		private static final int /*@NonNull*/ [] __Concert = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LiveAlbum =
			{
				Fragments._LiveAlbum__OclAny /* 0 */,
				Fragments._LiveAlbum__OclElement /* 1 */,
				Fragments._LiveAlbum__NamedElement /* 2 */,
				Fragments._LiveAlbum__Album /* 3 */,
				Fragments._LiveAlbum__LiveAlbum /* 4 */
			};
		private static final int /*@NonNull*/ [] __LiveAlbum = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MusicGenre =
			{
				Fragments._MusicGenre__OclAny /* 0 */,
				Fragments._MusicGenre__OclElement /* 1 */,
				Fragments._MusicGenre__OclType /* 2 */,
				Fragments._MusicGenre__OclEnumeration /* 3 */,
				Fragments._MusicGenre__MusicGenre /* 4 */
			};
		private static final int /*@NonNull*/ [] __MusicGenre = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MusicTrack =
			{
				Fragments._MusicTrack__OclAny /* 0 */,
				Fragments._MusicTrack__OclElement /* 1 */,
				Fragments._MusicTrack__NamedElement /* 2 */,
				Fragments._MusicTrack__AudioTrack /* 3 */,
				Fragments._MusicTrack__MusicTrack /* 4 */
			};
		private static final int /*@NonNull*/ [] __MusicTrack = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Order =
			{
				Fragments._Order__OclAny /* 0 */,
				Fragments._Order__OclElement /* 1 */,
				Fragments._Order__OclType /* 2 */,
				Fragments._Order__OclEnumeration /* 3 */,
				Fragments._Order__Order /* 4 */
			};
		private static final int /*@NonNull*/ [] __Order = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Playlist =
			{
				Fragments._Playlist__OclAny /* 0 */,
				Fragments._Playlist__OclElement /* 1 */,
				Fragments._Playlist__NamedElement /* 2 */,
				Fragments._Playlist__Playlist /* 3 */
			};
		private static final int /*@NonNull*/ [] __Playlist = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Podcast =
			{
				Fragments._Podcast__OclAny /* 0 */,
				Fragments._Podcast__OclElement /* 1 */,
				Fragments._Podcast__NamedElement /* 2 */,
				Fragments._Podcast__Podcast /* 3 */
			};
		private static final int /*@NonNull*/ [] __Podcast = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PodcastCategory =
			{
				Fragments._PodcastCategory__OclAny /* 0 */,
				Fragments._PodcastCategory__OclElement /* 1 */,
				Fragments._PodcastCategory__OclType /* 2 */,
				Fragments._PodcastCategory__OclEnumeration /* 3 */,
				Fragments._PodcastCategory__PodcastCategory /* 4 */
			};
		private static final int /*@NonNull*/ [] __PodcastCategory = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PodcastEpisode =
			{
				Fragments._PodcastEpisode__OclAny /* 0 */,
				Fragments._PodcastEpisode__OclElement /* 1 */,
				Fragments._PodcastEpisode__NamedElement /* 2 */,
				Fragments._PodcastEpisode__AudioTrack /* 3 */,
				Fragments._PodcastEpisode__PodcastEpisode /* 4 */
			};
		private static final int /*@NonNull*/ [] __PodcastEpisode = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SingleTrack =
			{
				Fragments._SingleTrack__OclAny /* 0 */,
				Fragments._SingleTrack__OclElement /* 1 */,
				Fragments._SingleTrack__NamedElement /* 2 */,
				Fragments._SingleTrack__AudioTrack /* 3 */,
				Fragments._SingleTrack__MusicTrack /* 4 */,
				Fragments._SingleTrack__SingleTrack /* 5 */
			};
		private static final int /*@NonNull*/ [] __SingleTrack = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StreamingService =
			{
				Fragments._StreamingService__OclAny /* 0 */,
				Fragments._StreamingService__OclElement /* 1 */,
				Fragments._StreamingService__NamedElement /* 2 */,
				Fragments._StreamingService__StreamingService /* 3 */
			};
		private static final int /*@NonNull*/ [] __StreamingService = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StudioAlbum =
			{
				Fragments._StudioAlbum__OclAny /* 0 */,
				Fragments._StudioAlbum__OclElement /* 1 */,
				Fragments._StudioAlbum__NamedElement /* 2 */,
				Fragments._StudioAlbum__Album /* 3 */,
				Fragments._StudioAlbum__StudioAlbum /* 4 */
			};
		private static final int /*@NonNull*/ [] __StudioAlbum = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _User =
			{
				Fragments._User__OclAny /* 0 */,
				Fragments._User__OclElement /* 1 */,
				Fragments._User__NamedElement /* 2 */,
				Fragments._User__User /* 3 */
			};
		private static final int /*@NonNull*/ [] __User = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Album.initFragments(_Album, __Album);
			Types._AlbumTrack.initFragments(_AlbumTrack, __AlbumTrack);
			Types._Artist.initFragments(_Artist, __Artist);
			Types._AudioTrack.initFragments(_AudioTrack, __AudioTrack);
			Types._Concert.initFragments(_Concert, __Concert);
			Types._LiveAlbum.initFragments(_LiveAlbum, __LiveAlbum);
			Types._MusicGenre.initFragments(_MusicGenre, __MusicGenre);
			Types._MusicTrack.initFragments(_MusicTrack, __MusicTrack);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._Order.initFragments(_Order, __Order);
			Types._Playlist.initFragments(_Playlist, __Playlist);
			Types._Podcast.initFragments(_Podcast, __Podcast);
			Types._PodcastCategory.initFragments(_PodcastCategory, __PodcastCategory);
			Types._PodcastEpisode.initFragments(_PodcastEpisode, __PodcastEpisode);
			Types._SingleTrack.initFragments(_SingleTrack, __SingleTrack);
			Types._StreamingService.initFragments(_StreamingService, __StreamingService);
			Types._StudioAlbum.initFragments(_StudioAlbum, __StudioAlbum);
			Types._User.initFragments(_User, __User);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MusicStreamingServiceTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Album__Album = {
			MusicStreamingServiceTables.Operations._Album__calculateTotalDuration /* calculateTotalDuration() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Album__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Album__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Album__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AlbumTrack__AlbumTrack = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AlbumTrack__AudioTrack = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AlbumTrack__MusicTrack = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AlbumTrack__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AlbumTrack__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AlbumTrack__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Artist__Artist = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Artist__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Artist__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Artist__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AudioTrack__AudioTrack = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AudioTrack__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AudioTrack__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AudioTrack__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Concert__Concert = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Concert__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Concert__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Concert__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LiveAlbum__LiveAlbum = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LiveAlbum__Album = {
			MusicStreamingServiceTables.Operations._Album__calculateTotalDuration /* calculateTotalDuration() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LiveAlbum__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LiveAlbum__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LiveAlbum__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MusicGenre__MusicGenre = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MusicGenre__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MusicGenre__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MusicGenre__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MusicGenre__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MusicTrack__MusicTrack = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MusicTrack__AudioTrack = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MusicTrack__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MusicTrack__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MusicTrack__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Order__Order = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Order__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Order__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Order__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Order__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Playlist__Playlist = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Playlist__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Playlist__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Playlist__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Podcast__Podcast = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Podcast__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Podcast__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Podcast__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PodcastCategory__PodcastCategory = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PodcastCategory__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PodcastCategory__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PodcastCategory__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PodcastCategory__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PodcastEpisode__PodcastEpisode = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PodcastEpisode__AudioTrack = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PodcastEpisode__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PodcastEpisode__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PodcastEpisode__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SingleTrack__SingleTrack = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SingleTrack__AudioTrack = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SingleTrack__MusicTrack = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SingleTrack__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SingleTrack__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SingleTrack__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StreamingService__StreamingService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamingService__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamingService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamingService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StudioAlbum__StudioAlbum = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StudioAlbum__Album = {
			MusicStreamingServiceTables.Operations._Album__calculateTotalDuration /* calculateTotalDuration() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StudioAlbum__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StudioAlbum__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StudioAlbum__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _User__User = {
			MusicStreamingServiceTables.Operations._User__getPodcastsByTag /* getPodcastsByTag(PodcastCategory[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _User__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _User__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _User__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Album__Album.initOperations(_Album__Album);
			Fragments._Album__NamedElement.initOperations(_Album__NamedElement);
			Fragments._Album__OclAny.initOperations(_Album__OclAny);
			Fragments._Album__OclElement.initOperations(_Album__OclElement);

			Fragments._AlbumTrack__AlbumTrack.initOperations(_AlbumTrack__AlbumTrack);
			Fragments._AlbumTrack__AudioTrack.initOperations(_AlbumTrack__AudioTrack);
			Fragments._AlbumTrack__MusicTrack.initOperations(_AlbumTrack__MusicTrack);
			Fragments._AlbumTrack__NamedElement.initOperations(_AlbumTrack__NamedElement);
			Fragments._AlbumTrack__OclAny.initOperations(_AlbumTrack__OclAny);
			Fragments._AlbumTrack__OclElement.initOperations(_AlbumTrack__OclElement);

			Fragments._Artist__Artist.initOperations(_Artist__Artist);
			Fragments._Artist__NamedElement.initOperations(_Artist__NamedElement);
			Fragments._Artist__OclAny.initOperations(_Artist__OclAny);
			Fragments._Artist__OclElement.initOperations(_Artist__OclElement);

			Fragments._AudioTrack__AudioTrack.initOperations(_AudioTrack__AudioTrack);
			Fragments._AudioTrack__NamedElement.initOperations(_AudioTrack__NamedElement);
			Fragments._AudioTrack__OclAny.initOperations(_AudioTrack__OclAny);
			Fragments._AudioTrack__OclElement.initOperations(_AudioTrack__OclElement);

			Fragments._Concert__Concert.initOperations(_Concert__Concert);
			Fragments._Concert__NamedElement.initOperations(_Concert__NamedElement);
			Fragments._Concert__OclAny.initOperations(_Concert__OclAny);
			Fragments._Concert__OclElement.initOperations(_Concert__OclElement);

			Fragments._LiveAlbum__Album.initOperations(_LiveAlbum__Album);
			Fragments._LiveAlbum__LiveAlbum.initOperations(_LiveAlbum__LiveAlbum);
			Fragments._LiveAlbum__NamedElement.initOperations(_LiveAlbum__NamedElement);
			Fragments._LiveAlbum__OclAny.initOperations(_LiveAlbum__OclAny);
			Fragments._LiveAlbum__OclElement.initOperations(_LiveAlbum__OclElement);

			Fragments._MusicGenre__MusicGenre.initOperations(_MusicGenre__MusicGenre);
			Fragments._MusicGenre__OclAny.initOperations(_MusicGenre__OclAny);
			Fragments._MusicGenre__OclElement.initOperations(_MusicGenre__OclElement);
			Fragments._MusicGenre__OclEnumeration.initOperations(_MusicGenre__OclEnumeration);
			Fragments._MusicGenre__OclType.initOperations(_MusicGenre__OclType);

			Fragments._MusicTrack__AudioTrack.initOperations(_MusicTrack__AudioTrack);
			Fragments._MusicTrack__MusicTrack.initOperations(_MusicTrack__MusicTrack);
			Fragments._MusicTrack__NamedElement.initOperations(_MusicTrack__NamedElement);
			Fragments._MusicTrack__OclAny.initOperations(_MusicTrack__OclAny);
			Fragments._MusicTrack__OclElement.initOperations(_MusicTrack__OclElement);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._Order__OclAny.initOperations(_Order__OclAny);
			Fragments._Order__OclElement.initOperations(_Order__OclElement);
			Fragments._Order__OclEnumeration.initOperations(_Order__OclEnumeration);
			Fragments._Order__OclType.initOperations(_Order__OclType);
			Fragments._Order__Order.initOperations(_Order__Order);

			Fragments._Playlist__NamedElement.initOperations(_Playlist__NamedElement);
			Fragments._Playlist__OclAny.initOperations(_Playlist__OclAny);
			Fragments._Playlist__OclElement.initOperations(_Playlist__OclElement);
			Fragments._Playlist__Playlist.initOperations(_Playlist__Playlist);

			Fragments._Podcast__NamedElement.initOperations(_Podcast__NamedElement);
			Fragments._Podcast__OclAny.initOperations(_Podcast__OclAny);
			Fragments._Podcast__OclElement.initOperations(_Podcast__OclElement);
			Fragments._Podcast__Podcast.initOperations(_Podcast__Podcast);

			Fragments._PodcastCategory__OclAny.initOperations(_PodcastCategory__OclAny);
			Fragments._PodcastCategory__OclElement.initOperations(_PodcastCategory__OclElement);
			Fragments._PodcastCategory__OclEnumeration.initOperations(_PodcastCategory__OclEnumeration);
			Fragments._PodcastCategory__OclType.initOperations(_PodcastCategory__OclType);
			Fragments._PodcastCategory__PodcastCategory.initOperations(_PodcastCategory__PodcastCategory);

			Fragments._PodcastEpisode__AudioTrack.initOperations(_PodcastEpisode__AudioTrack);
			Fragments._PodcastEpisode__NamedElement.initOperations(_PodcastEpisode__NamedElement);
			Fragments._PodcastEpisode__OclAny.initOperations(_PodcastEpisode__OclAny);
			Fragments._PodcastEpisode__OclElement.initOperations(_PodcastEpisode__OclElement);
			Fragments._PodcastEpisode__PodcastEpisode.initOperations(_PodcastEpisode__PodcastEpisode);

			Fragments._SingleTrack__AudioTrack.initOperations(_SingleTrack__AudioTrack);
			Fragments._SingleTrack__MusicTrack.initOperations(_SingleTrack__MusicTrack);
			Fragments._SingleTrack__NamedElement.initOperations(_SingleTrack__NamedElement);
			Fragments._SingleTrack__OclAny.initOperations(_SingleTrack__OclAny);
			Fragments._SingleTrack__OclElement.initOperations(_SingleTrack__OclElement);
			Fragments._SingleTrack__SingleTrack.initOperations(_SingleTrack__SingleTrack);

			Fragments._StreamingService__NamedElement.initOperations(_StreamingService__NamedElement);
			Fragments._StreamingService__OclAny.initOperations(_StreamingService__OclAny);
			Fragments._StreamingService__OclElement.initOperations(_StreamingService__OclElement);
			Fragments._StreamingService__StreamingService.initOperations(_StreamingService__StreamingService);

			Fragments._StudioAlbum__Album.initOperations(_StudioAlbum__Album);
			Fragments._StudioAlbum__NamedElement.initOperations(_StudioAlbum__NamedElement);
			Fragments._StudioAlbum__OclAny.initOperations(_StudioAlbum__OclAny);
			Fragments._StudioAlbum__OclElement.initOperations(_StudioAlbum__OclElement);
			Fragments._StudioAlbum__StudioAlbum.initOperations(_StudioAlbum__StudioAlbum);

			Fragments._User__NamedElement.initOperations(_User__NamedElement);
			Fragments._User__OclAny.initOperations(_User__OclAny);
			Fragments._User__OclElement.initOperations(_User__OclElement);
			Fragments._User__User.initOperations(_User__User);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MusicStreamingServiceTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Album = {
			MusicStreamingServiceTables.Properties._NamedElement__Name,
			MusicStreamingServiceTables.Properties._Album__duration,
			MusicStreamingServiceTables.Properties._Album__img_url,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MusicStreamingServiceTables.Properties._Album__owner,
			MusicStreamingServiceTables.Properties._Album__tracks
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AlbumTrack = {
			MusicStreamingServiceTables.Properties._NamedElement__Name,
			MusicStreamingServiceTables.Properties._AudioTrack__duration,
			MusicStreamingServiceTables.Properties._MusicTrack__featured_artist,
			MusicStreamingServiceTables.Properties._MusicTrack__genre,
			MusicStreamingServiceTables.Properties._MusicTrack__lyrics,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MusicStreamingServiceTables.Properties._AlbumTrack__position
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Artist = {
			MusicStreamingServiceTables.Properties._NamedElement__Name,
			MusicStreamingServiceTables.Properties._Artist__about,
			MusicStreamingServiceTables.Properties._Artist__featured_in,
			MusicStreamingServiceTables.Properties._Artist__followers,
			MusicStreamingServiceTables.Properties._Artist__img_url,
			MusicStreamingServiceTables.Properties._Artist__num_of_listeners,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MusicStreamingServiceTables.Properties._Artist__owned_albums,
			MusicStreamingServiceTables.Properties._Artist__owned_solos
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AudioTrack = {
			MusicStreamingServiceTables.Properties._NamedElement__Name,
			MusicStreamingServiceTables.Properties._AudioTrack__duration,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Concert = {
			MusicStreamingServiceTables.Properties._Concert__Artists,
			MusicStreamingServiceTables.Properties._NamedElement__Name,
			MusicStreamingServiceTables.Properties._Concert__date,
			MusicStreamingServiceTables.Properties._Concert__location,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LiveAlbum = {
			MusicStreamingServiceTables.Properties._NamedElement__Name,
			MusicStreamingServiceTables.Properties._Album__duration,
			MusicStreamingServiceTables.Properties._LiveAlbum__eventLocation,
			MusicStreamingServiceTables.Properties._Album__img_url,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MusicStreamingServiceTables.Properties._Album__owner,
			MusicStreamingServiceTables.Properties._Album__tracks
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MusicGenre = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MusicTrack = {
			MusicStreamingServiceTables.Properties._NamedElement__Name,
			MusicStreamingServiceTables.Properties._AudioTrack__duration,
			MusicStreamingServiceTables.Properties._MusicTrack__featured_artist,
			MusicStreamingServiceTables.Properties._MusicTrack__genre,
			MusicStreamingServiceTables.Properties._MusicTrack__lyrics,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			MusicStreamingServiceTables.Properties._NamedElement__Name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Order = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Playlist = {
			MusicStreamingServiceTables.Properties._NamedElement__Name,
			MusicStreamingServiceTables.Properties._Playlist__duration,
			MusicStreamingServiceTables.Properties._Playlist__num_of_tracks,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MusicStreamingServiceTables.Properties._Playlist__order,
			MusicStreamingServiceTables.Properties._Playlist__owners,
			MusicStreamingServiceTables.Properties._Playlist__tracks
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Podcast = {
			MusicStreamingServiceTables.Properties._NamedElement__Name,
			MusicStreamingServiceTables.Properties._Podcast__category,
			MusicStreamingServiceTables.Properties._Podcast__episodes,
			MusicStreamingServiceTables.Properties._Podcast__followers,
			MusicStreamingServiceTables.Properties._Podcast__img_url,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MusicStreamingServiceTables.Properties._Podcast__rating
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PodcastCategory = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PodcastEpisode = {
			MusicStreamingServiceTables.Properties._NamedElement__Name,
			MusicStreamingServiceTables.Properties._PodcastEpisode__date_created,
			MusicStreamingServiceTables.Properties._PodcastEpisode__description,
			MusicStreamingServiceTables.Properties._AudioTrack__duration,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MusicStreamingServiceTables.Properties._PodcastEpisode__transcript
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SingleTrack = {
			MusicStreamingServiceTables.Properties._NamedElement__Name,
			MusicStreamingServiceTables.Properties._AudioTrack__duration,
			MusicStreamingServiceTables.Properties._MusicTrack__featured_artist,
			MusicStreamingServiceTables.Properties._MusicTrack__genre,
			MusicStreamingServiceTables.Properties._MusicTrack__lyrics,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MusicStreamingServiceTables.Properties._SingleTrack__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StreamingService = {
			MusicStreamingServiceTables.Properties._StreamingService__Artist,
			MusicStreamingServiceTables.Properties._StreamingService__Concert,
			MusicStreamingServiceTables.Properties._NamedElement__Name,
			MusicStreamingServiceTables.Properties._StreamingService__Playlist,
			MusicStreamingServiceTables.Properties._StreamingService__listeners,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MusicStreamingServiceTables.Properties._StreamingService__podcasts
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StudioAlbum = {
			MusicStreamingServiceTables.Properties._NamedElement__Name,
			MusicStreamingServiceTables.Properties._Album__duration,
			MusicStreamingServiceTables.Properties._Album__img_url,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MusicStreamingServiceTables.Properties._Album__owner,
			MusicStreamingServiceTables.Properties._StudioAlbum__recordingStudio,
			MusicStreamingServiceTables.Properties._Album__tracks
		};

		private static final ExecutorProperty /*@NonNull*/ [] _User = {
			MusicStreamingServiceTables.Properties._NamedElement__Name,
			MusicStreamingServiceTables.Properties._User__email,
			MusicStreamingServiceTables.Properties._User__followed_artist,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MusicStreamingServiceTables.Properties._User__owned_playlist,
			MusicStreamingServiceTables.Properties._User__password,
			MusicStreamingServiceTables.Properties._User__subscribed_podcast,
			MusicStreamingServiceTables.Properties._User__username
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Album__Album.initProperties(_Album);
			Fragments._AlbumTrack__AlbumTrack.initProperties(_AlbumTrack);
			Fragments._Artist__Artist.initProperties(_Artist);
			Fragments._AudioTrack__AudioTrack.initProperties(_AudioTrack);
			Fragments._Concert__Concert.initProperties(_Concert);
			Fragments._LiveAlbum__LiveAlbum.initProperties(_LiveAlbum);
			Fragments._MusicGenre__MusicGenre.initProperties(_MusicGenre);
			Fragments._MusicTrack__MusicTrack.initProperties(_MusicTrack);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._Order__Order.initProperties(_Order);
			Fragments._Playlist__Playlist.initProperties(_Playlist);
			Fragments._Podcast__Podcast.initProperties(_Podcast);
			Fragments._PodcastCategory__PodcastCategory.initProperties(_PodcastCategory);
			Fragments._PodcastEpisode__PodcastEpisode.initProperties(_PodcastEpisode);
			Fragments._SingleTrack__SingleTrack.initProperties(_SingleTrack);
			Fragments._StreamingService__StreamingService.initProperties(_StreamingService);
			Fragments._StudioAlbum__StudioAlbum.initProperties(_StudioAlbum);
			Fragments._User__User.initProperties(_User);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MusicStreamingServiceTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _MusicGenre__Reggae = new EcoreExecutorEnumerationLiteral(MusicStreamingServicePackage.Literals.MUSIC_GENRE.getEEnumLiteral("Reggae"), Types._MusicGenre, 0);
		public static final EcoreExecutorEnumerationLiteral _MusicGenre__HipHop = new EcoreExecutorEnumerationLiteral(MusicStreamingServicePackage.Literals.MUSIC_GENRE.getEEnumLiteral("HipHop"), Types._MusicGenre, 1);
		public static final EcoreExecutorEnumerationLiteral _MusicGenre__Rock = new EcoreExecutorEnumerationLiteral(MusicStreamingServicePackage.Literals.MUSIC_GENRE.getEEnumLiteral("Rock"), Types._MusicGenre, 2);
		public static final EcoreExecutorEnumerationLiteral _MusicGenre__Afrobeat = new EcoreExecutorEnumerationLiteral(MusicStreamingServicePackage.Literals.MUSIC_GENRE.getEEnumLiteral("Afrobeat"), Types._MusicGenre, 3);
		public static final EcoreExecutorEnumerationLiteral _MusicGenre__Pop = new EcoreExecutorEnumerationLiteral(MusicStreamingServicePackage.Literals.MUSIC_GENRE.getEEnumLiteral("Pop"), Types._MusicGenre, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _MusicGenre = {
			_MusicGenre__Reggae,
			_MusicGenre__HipHop,
			_MusicGenre__Rock,
			_MusicGenre__Afrobeat,
			_MusicGenre__Pop
		};

		public static final EcoreExecutorEnumerationLiteral _Order__Default = new EcoreExecutorEnumerationLiteral(MusicStreamingServicePackage.Literals.ORDER.getEEnumLiteral("Default"), Types._Order, 0);
		public static final EcoreExecutorEnumerationLiteral _Order__trackLength = new EcoreExecutorEnumerationLiteral(MusicStreamingServicePackage.Literals.ORDER.getEEnumLiteral("trackLength"), Types._Order, 1);
		public static final EcoreExecutorEnumerationLiteral _Order__DateAdded = new EcoreExecutorEnumerationLiteral(MusicStreamingServicePackage.Literals.ORDER.getEEnumLiteral("DateAdded"), Types._Order, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Order = {
			_Order__Default,
			_Order__trackLength,
			_Order__DateAdded
		};

		public static final EcoreExecutorEnumerationLiteral _PodcastCategory__Film = new EcoreExecutorEnumerationLiteral(MusicStreamingServicePackage.Literals.PODCAST_CATEGORY.getEEnumLiteral("Film"), Types._PodcastCategory, 0);
		public static final EcoreExecutorEnumerationLiteral _PodcastCategory__Lifestyle = new EcoreExecutorEnumerationLiteral(MusicStreamingServicePackage.Literals.PODCAST_CATEGORY.getEEnumLiteral("Lifestyle"), Types._PodcastCategory, 1);
		public static final EcoreExecutorEnumerationLiteral _PodcastCategory__Education = new EcoreExecutorEnumerationLiteral(MusicStreamingServicePackage.Literals.PODCAST_CATEGORY.getEEnumLiteral("Education"), Types._PodcastCategory, 2);
		public static final EcoreExecutorEnumerationLiteral _PodcastCategory__politics = new EcoreExecutorEnumerationLiteral(MusicStreamingServicePackage.Literals.PODCAST_CATEGORY.getEEnumLiteral("politics"), Types._PodcastCategory, 3);
		public static final EcoreExecutorEnumerationLiteral _PodcastCategory__Science = new EcoreExecutorEnumerationLiteral(MusicStreamingServicePackage.Literals.PODCAST_CATEGORY.getEEnumLiteral("Science"), Types._PodcastCategory, 4);
		public static final EcoreExecutorEnumerationLiteral _PodcastCategory__Technology = new EcoreExecutorEnumerationLiteral(MusicStreamingServicePackage.Literals.PODCAST_CATEGORY.getEEnumLiteral("Technology"), Types._PodcastCategory, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PodcastCategory = {
			_PodcastCategory__Film,
			_PodcastCategory__Lifestyle,
			_PodcastCategory__Education,
			_PodcastCategory__politics,
			_PodcastCategory__Science,
			_PodcastCategory__Technology
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._MusicGenre.initLiterals(_MusicGenre);
			Types._Order.initLiterals(_Order);
			Types._PodcastCategory.initLiterals(_PodcastCategory);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MusicStreamingServiceTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new MusicStreamingServiceTables();
	}

	private MusicStreamingServiceTables() {
		super(MusicStreamingServicePackage.eNS_URI);
	}
}
