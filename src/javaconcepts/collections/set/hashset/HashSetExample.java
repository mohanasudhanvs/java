package javaconcepts.collections.set.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> fruits = new HashSet<>();

		// add example
		fruits.add("Apple");
		fruits.add("Banana");

		// isEmpty example
		System.out.println("fruits set is empty = " + fruits.isEmpty());

		// contains example
		System.out.println("fruits contains Apple = " + fruits.contains("Apple"));
		System.out.println("fruits contains Mango = " + fruits.contains("Mango"));

		// remove example
		System.out.println("Apple removed from fruits set = " + fruits.remove("Apple"));
		System.out.println("Mango removed from fruits set = " + fruits.remove("Mango"));

		// size example
		System.out.println("fruits set size = " + fruits.size());

		// addAll example
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");

		System.out.println("fruits set before addAll = " + fruits);
		System.out.println("list = " + list);
		fruits.addAll(list);
		System.out.println("fruits set after addAll = " + fruits);

		// iterator example
		Iterator<String> iterator = fruits.iterator();
		while (iterator.hasNext()) {
			System.out.println("Consuming fruit " + iterator.next());
		}

		// removeAll example
		fruits.add("Orange");
		System.out.println("fruits set before removeAll = " + fruits);
		System.out.println("list = " + list);
		fruits.removeAll(list);
		System.out.println("fruits set after removeAll = " + fruits);

		// clear example
		fruits.clear();
		System.out.println("fruits set is empty = " + fruits.isEmpty());

	}

}
