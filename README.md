# Report for Project: Music Streaming Service

## Task 1: Metamodel Definition

The metamodel was defined in the `StreamingService.xmi` file located in the `univaq.mde2024.project4.musicStreamingService/model/` directory. It consists of:

- **Features**:
  - Inheritance relationships between abstract and concrete classes (e.g., `Streaming Service` as a parent class of `Artist`, `Podcast`, etc.).
  - Relations:
    - Containment: For example, `Playlist` contains `Track`, `Artist` contains `Album`, and `Podcast` contains `Episode`.
    - Non-containment: For example, `User` references `Playlist` and `Podcast`.
  - Attributes for each metaclass: Every metaclass includes at least one attribute, ensuring there are no isolated classes.
  - Enumeration types: Used for fields like `Genre` and `PodcastTag`.
- Technological Coverage: Includes containment, bi-directional references, inheritance, enumeration types, and custom data types.

The metamodel ensures completeness, consistency, and homogeneity, allowing for the seamless representation of a music streaming service.

## Task 2: Java API Generation

The `genmodel` file was created to define the generation settings for the model. Using this file:

- Java APIs were successfully generated for interacting with the metamodel.
- Corresponding `.edit`, `.editor`, and `.tests` projects were generated to facilitate the creation, validation, and management of the model instances.

All related files can be found in the folders ending with `.edit/.editor/.tests`.

## Task 3: Plugin Implementation and Model Instantiation
### Plugin Functionalities

A plugin project was developed to interact with the model APIs (See file in path `streamingLive/src/streamingLive/ModelUtils.java`. It provides the following functionalities:
1. **Create**: Instances of the metamodel were created programmatically.
2. **Serialize**: Instances were serialized into `.xmi` files for persistence.
3. **Load**: Models were deserialized and loaded into memory for manipulation.
4. **Validate**: Model instances were validated against the metamodel constraints.

### Model Instantiations

Two concrete instances were created:
1. `StreamingService.xmi`: Represents the first example instance of the metamodel.
2. `StreamingService1.xmi`: Represents the second example instance.

Both instances ensure that each metaclass at the metamodel level has at least one instantiation in the models.

## Task 4: Metamodel Constraints, Operations, and Derived Fields

### Constraints
1. An Artist must have at least one album or solo track:
```ocl
invariant MustHaveAlbumOrSolo: 
    not owned_albums->isEmpty() or not owned_solos->isEmpty()
```
2. A Playlist must have at least one track:
```ocl
invariant PlaylistMustHaveTracks:
    not tracks->isEmpty();
```
3. A Podcast must have at least one episode:
```ocl
invariant PodcastMustHaveEpisodes:
    not episodes->isEmpty();
```

### Operations
1. Calculate the total duration of an album:
```ocl
operation calculateTotalDuration() : ecore::EInt { 
    body: tracks->collect(duration)->sum();
}
```
2. Get all podcasts of a certain genre followed by a user:
```ocl
operation getPodcastsByTag(tag : PodcastTag[1]) : Podcast[*|1] { ordered } {
    body: subscribed_podcast->select(p | p.tag->includes(tag))->asOrderedSet();
}
```
### Derived Fields
1. Duration of an Album:
```ocl
attribute num_of_tracks : ecore::EInt[1] { derived unsettable } {
	derivation : tracks->size();
}
```
2. Total number of tracks in a Playlist:
```ocl
property Playlist::num_of_tracks : ecore::EInt { derived } {
  derive: tracks->size();
}
```






