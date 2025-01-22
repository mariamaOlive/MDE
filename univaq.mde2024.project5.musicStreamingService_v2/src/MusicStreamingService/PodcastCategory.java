/**
 */
package MusicStreamingService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Podcast Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MusicStreamingService.MusicStreamingServicePackage#getPodcastCategory()
 * @model
 * @generated
 */
public enum PodcastCategory implements Enumerator {
	/**
	 * The '<em><b>Film</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILM_VALUE
	 * @generated
	 * @ordered
	 */
	FILM(0, "Film", "Film"),

	/**
	 * The '<em><b>Lifestyle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFESTYLE_VALUE
	 * @generated
	 * @ordered
	 */
	LIFESTYLE(0, "Lifestyle", "Lifestyle"),

	/**
	 * The '<em><b>Education</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDUCATION_VALUE
	 * @generated
	 * @ordered
	 */
	EDUCATION(0, "Education", "Education"),

	/**
	 * The '<em><b>Politics</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLITICS_VALUE
	 * @generated
	 * @ordered
	 */
	POLITICS(0, "politics", "politics"),

	/**
	 * The '<em><b>Science</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCIENCE_VALUE
	 * @generated
	 * @ordered
	 */
	SCIENCE(0, "Science", "Science"),

	/**
	 * The '<em><b>Technology</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNOLOGY_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNOLOGY(0, "Technology", "Technology");

	/**
	 * The '<em><b>Film</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILM
	 * @model name="Film"
	 * @generated
	 * @ordered
	 */
	public static final int FILM_VALUE = 0;

	/**
	 * The '<em><b>Lifestyle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFESTYLE
	 * @model name="Lifestyle"
	 * @generated
	 * @ordered
	 */
	public static final int LIFESTYLE_VALUE = 0;

	/**
	 * The '<em><b>Education</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDUCATION
	 * @model name="Education"
	 * @generated
	 * @ordered
	 */
	public static final int EDUCATION_VALUE = 0;

	/**
	 * The '<em><b>Politics</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLITICS
	 * @model name="politics"
	 * @generated
	 * @ordered
	 */
	public static final int POLITICS_VALUE = 0;

	/**
	 * The '<em><b>Science</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCIENCE
	 * @model name="Science"
	 * @generated
	 * @ordered
	 */
	public static final int SCIENCE_VALUE = 0;

	/**
	 * The '<em><b>Technology</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNOLOGY
	 * @model name="Technology"
	 * @generated
	 * @ordered
	 */
	public static final int TECHNOLOGY_VALUE = 0;

	/**
	 * An array of all the '<em><b>Podcast Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PodcastCategory[] VALUES_ARRAY =
		new PodcastCategory[] {
			FILM,
			LIFESTYLE,
			EDUCATION,
			POLITICS,
			SCIENCE,
			TECHNOLOGY,
		};

	/**
	 * A public read-only list of all the '<em><b>Podcast Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PodcastCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Podcast Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PodcastCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PodcastCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Podcast Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PodcastCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PodcastCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Podcast Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PodcastCategory get(int value) {
		switch (value) {
			case FILM_VALUE: return FILM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PodcastCategory(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PodcastCategory
