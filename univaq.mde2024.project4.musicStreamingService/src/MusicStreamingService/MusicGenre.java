/**
 */
package MusicStreamingService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Music Genre</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MusicStreamingService.MusicStreamingServicePackage#getMusicGenre()
 * @model
 * @generated
 */
public enum MusicGenre implements Enumerator {
	/**
	 * The '<em><b>Pop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POP_VALUE
	 * @generated
	 * @ordered
	 */
	POP(0, "Pop", "Pop"),

	/**
	 * The '<em><b>Reggae</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGGAE_VALUE
	 * @generated
	 * @ordered
	 */
	REGGAE(0, "Reggae", "Reggae"),

	/**
	 * The '<em><b>Hip Hop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIP_HOP_VALUE
	 * @generated
	 * @ordered
	 */
	HIP_HOP(0, "HipHop", "HipHop"),

	/**
	 * The '<em><b>Rock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROCK_VALUE
	 * @generated
	 * @ordered
	 */
	ROCK(0, "Rock", "Rock"),

	/**
	 * The '<em><b>Afrobeat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFROBEAT_VALUE
	 * @generated
	 * @ordered
	 */
	AFROBEAT(0, "Afrobeat", "Afrobeat");

	/**
	 * The '<em><b>Pop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POP
	 * @model name="Pop"
	 * @generated
	 * @ordered
	 */
	public static final int POP_VALUE = 0;

	/**
	 * The '<em><b>Reggae</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGGAE
	 * @model name="Reggae"
	 * @generated
	 * @ordered
	 */
	public static final int REGGAE_VALUE = 0;

	/**
	 * The '<em><b>Hip Hop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIP_HOP
	 * @model name="HipHop"
	 * @generated
	 * @ordered
	 */
	public static final int HIP_HOP_VALUE = 0;

	/**
	 * The '<em><b>Rock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROCK
	 * @model name="Rock"
	 * @generated
	 * @ordered
	 */
	public static final int ROCK_VALUE = 0;

	/**
	 * The '<em><b>Afrobeat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFROBEAT
	 * @model name="Afrobeat"
	 * @generated
	 * @ordered
	 */
	public static final int AFROBEAT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Music Genre</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MusicGenre[] VALUES_ARRAY =
		new MusicGenre[] {
			POP,
			REGGAE,
			HIP_HOP,
			ROCK,
			AFROBEAT,
		};

	/**
	 * A public read-only list of all the '<em><b>Music Genre</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MusicGenre> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Music Genre</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MusicGenre get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MusicGenre result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Music Genre</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MusicGenre getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MusicGenre result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Music Genre</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MusicGenre get(int value) {
		switch (value) {
			case POP_VALUE: return POP;
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
	private MusicGenre(int value, String name, String literal) {
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
	
} //MusicGenre
