package javaconcepts.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * This test program compares performance of Vector versus ArrayList
 *
 * @author www.codejava.net
 *
 */
public class CollectionsPerformanceTest {

	public void testVector() {
		long startTime = System.currentTimeMillis();

		Vector<Integer> vector = new Vector<>();

		for (int i = 0; i < 10_000_000; i++) {
			vector.addElement(i);
		}

		long endTime = System.currentTimeMillis();

		long totalTime = endTime - startTime;

		System.out.println("Test Vector: " + totalTime + " ms");

	}

	public void testArrayList() {
		long startTime = System.currentTimeMillis();

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10_000_000; i++) {
			list.add(i);
		}

		long endTime = System.currentTimeMillis();

		long totalTime = endTime - startTime;

		System.out.println("Test ArrayList: " + totalTime + " ms");

	}

	public static void main(String[] args) {
		CollectionsPerformanceTest tester = new CollectionsPerformanceTest();

		tester.testVector();

		tester.testArrayList();

	}

}
