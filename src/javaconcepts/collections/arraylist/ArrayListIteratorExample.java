package javaconcepts.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorExample {

	public static void main(String[] args) {

		List<Integer> ints = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			ints.add(i);

		Iterator<Integer> it = ints.iterator();

		// simple iteration
		while (it.hasNext()) {
			int x = it.next();
			System.out.print(x + ", ");
		}
		System.out.println("\n" + ints);

		// modification of list through iterator
		it = ints.iterator();
		while (it.hasNext()) {
			int x = it.next();
			if (x % 2 == 0)
				it.remove();
		}
		System.out.println(ints);

		// changing list structure while iterating
		it = ints.iterator();
		while (it.hasNext()) {
			int x = it.next(); // ConcurrentModificationException here
			if (x == 5)
				ints.add(20);
		}
	}

}
