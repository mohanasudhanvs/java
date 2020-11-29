package javaconcepts.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {
	public static void main(String[] args) {

		String[] vowels = { "a", "e", "i", "o", "u" };

		Set<String> vowelsSet = new HashSet<>(Arrays.asList(vowels));
		System.out.println(vowelsSet);

		/**
		 * Unlike List, Set is NOt backed by array, so we can do structural modification
		 * without any issues.
		 */
		vowelsSet.remove("e");
		System.out.println(vowelsSet);
		vowelsSet.clear();
		System.out.println(vowelsSet);
	}
}
