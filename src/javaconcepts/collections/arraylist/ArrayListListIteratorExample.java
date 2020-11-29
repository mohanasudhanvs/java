package javaconcepts.collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListListIteratorExample {

	public static void main(String[] args) {

		List<Integer> ints = new ArrayList<>();
		List<Integer> ints2 = new ArrayList<>();

		for (int i = 0; i < 10; i++)
			ints.add(i);
		for (int i = 0; i < 10; i++)
			ints2.add(i);

		ListIterator<Integer> lit = ints.listIterator(ints.size());

		while (lit.hasPrevious()) {
			int x = lit.previous();
			System.out.print(x + ", ");
			if (x == 5) {
				lit.remove();
				lit.add(20);
			}
		}
		System.out.println("\n" + ints);

		ListIterator<Integer> lit1 = ints2.listIterator();

		while (lit1.hasNext()) {
			int x = lit1.next();
			System.out.print(x + ", ");
			if (x == 5) {
				lit1.remove();
				lit1.add(20);
			}
		}

		System.out.println("\n" + ints2);

	}
}
