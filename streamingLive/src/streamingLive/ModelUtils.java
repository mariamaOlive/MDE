package streamingLive;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import MusicStreamingService.*;
//import MusicStreamingService.Artist;
//import MusicStreamingService.MusicStreamingServiceFactory;
//import MusicStreamingService.Order;
//import MusicStreamingService.Playlist;
//import MusicStreamingService.SingleTrack;
//import MusicStreamingService.StreamingService;
//import MusicStreamingService.User;

public class ModelUtils {

	
	public static StreamingService create() {
		StreamingService model = MusicStreamingServiceFactory.eINSTANCE.createStreamingService();
		model.setName("Spotify");
		
		Artist artist1 = MusicStreamingServiceFactory.eINSTANCE.createArtist();
		artist1.setName("Taylor Swift");
		artist1.setAbout("Taylor Alison Swift is an American singer-songwriter.");
		artist1.setImg_url("https://i.scdn.co/image/ab6761610000e5ebe672b5f553298dcdccb0e676");
		artist1.setNum_of_listeners(10000);
		
		SingleTrack singleTrack1 = MusicStreamingServiceFactory.eINSTANCE.createSingleTrack();
		singleTrack1.setName("Lover");
		singleTrack1.setDuration(300);
		singleTrack1.setLyrics("I love u...");
		singleTrack1.setOwner(artist1);
		singleTrack1.getGenre().add(MusicGenre.POP);
		artist1.getOwned_solos().add(singleTrack1);
		
		
		Album album1 = MusicStreamingServiceFactory.eINSTANCE.createAlbum();
		album1.setName("Lover");
		album1.setImg_url("https://i.scdn.co/image/ab6761adfadf5ebe672b5f553298dasdfasdf6");
		album1.setDuration(1000);
		album1.setOwner(artist1);
		artist1.getOwned_albums().add(album1);
		
		
		AlbumTrack albumTrack1 = MusicStreamingServiceFactory.eINSTANCE.createAlbumTrack();
		albumTrack1.setName("Cruel Summer");
		albumTrack1.setDuration(400);
		albumTrack1.setPosition(1);
		albumTrack1.setLyrics("I love summer...");
		albumTrack1.getGenre().add(MusicGenre.POP);
		album1.getTracks().add(albumTrack1);
		
		
		Playlist playlist1 = MusicStreamingServiceFactory.eINSTANCE.createPlaylist();
		playlist1.setName("Favourites");
		playlist1.setDuration(30000);
		playlist1.setNum_of_tracks(2);
		playlist1.setOrder(Order.TRACK_LENGTH);
		playlist1.getTracks().add(singleTrack1);
		
		
		User user1 = MusicStreamingServiceFactory.eINSTANCE.createUser();
		user1.setName("Mariama");
		user1.setEmail("mariama@gmail.com");
		user1.setFollowed_artist(artist1);
		user1.setPassword("password1234");
		user1.setUsername("Maria");
		
		
		Podcast podcast1 = MusicStreamingServiceFactory.eINSTANCE.createPodcast();
		podcast1.setName("Harry Potter eBook");
		podcast1.setImg_url("http://harrypotter-ebook.png");
		podcast1.setRating(4.9f);
		podcast1.getTag().add(PodcastTag.FILM);
		
		Episodes episode1 = MusicStreamingServiceFactory.eINSTANCE.createEpisodes();
		episode1.setName("Secret Chamber");
		episode1.setDate_created(new Date());
		episode1.setDescription("Harry potter book");
		episode1.setDuration(3000);
		episode1.setTranscript("Hello, ...");
		podcast1.getEpisodes().add(episode1);
		
		
		model.getArtist().add(artist1);
		model.getPodcasts().add(podcast1);
		model.getListeners().add(user1);
		model.getPlaylist().add(playlist1);
		
		return model;
	}

	
	public final static String FILENAME = "testSpotify.xmi";
	
	public static Diagnostic validate(StreamingService spotify) {
		return Diagnostician.INSTANCE.validate(spotify);
	}
	
	public static void main(String[] args) {
	    StreamingService app = create();
	    serializeModel(app, FILENAME);
	    StreamingService spotify = load(FILENAME);
	    
	    Diagnostic d = validate(spotify);
	    if(d.getSeverity() != Diagnostic.ERROR)
	        System.out.println("the model is valid");
	    else
	        System.out.println("The model is not invalid");
	    System.out.println(app.getArtist().size());
	    app.getArtist().forEach(z -> System.out.println(z.getName()));
	}

	public static StreamingService load(String fileName) {
	    EPackage.Registry.INSTANCE.put(MusicStreamingServicePackage.eNS_URI, MusicStreamingServicePackage.eINSTANCE);
	    ResourceSet resSet = new ResourceSetImpl();
	    Resource resource = resSet.getResource(URI.createURI(fileName), true);
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    StreamingService myWeb = (StreamingService) resource.getContents().get(0);
	    System.out.println(myWeb);
	    return myWeb;
	}

	public static void serializeModel(StreamingService spotify, String fileName) {
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();

	    // create a resource
	    Resource resource = resSet.createResource(URI.createURI(fileName));
	    resource.getContents().add(spotify);

	    // now save the content.
	    try {
	        resource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
	
	
	
}
