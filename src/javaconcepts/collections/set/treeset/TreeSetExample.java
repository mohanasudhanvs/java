package javaconcepts.collections.set.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) throws Exception {
		// Create a sorted set of Integers
		SortedSet<Integer> setWithNaturalOrdering = new TreeSet<>();
		setWithNaturalOrdering.add(5);
		setWithNaturalOrdering.add(9);
		setWithNaturalOrdering.add(4);
		setWithNaturalOrdering.add(21);
		setWithNaturalOrdering.forEach(System.out::println);

		// Create a sorted set with user defined class
		SortedSet<Person> sortedSet = new TreeSet<>();
		sortedSet.add(new Person(1, "Mark"));
		sortedSet.add(new Person(2, "Vispi"));
		sortedSet.add(new Person(3, "Harmony"));
		sortedSet.forEach(System.out::println);

		// we can also provide instance of Comparator implementation instead of lambda
		SortedSet<Person> customOrderedSet = new TreeSet<>((p1, p2) -> p1.id - p2.id);
		customOrderedSet.addAll(sortedSet);
		customOrderedSet.forEach(System.out::println);

	}

}

class Person implements Comparable<Person> {
	int id;
	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Person p) {
		return this.name.compareTo(p.name);
	}

	@Override
	public String toString() {
		return this.name;
	}
}
