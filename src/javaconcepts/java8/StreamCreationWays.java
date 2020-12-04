package javaconcepts.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamCreationWays {

	public static void main(String[] args) {

		// ways of creating a stream

		// Method 1

		Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5);

		// Method 2

		LongStream s2 = Arrays.stream(new long[] { 1, 2, 3, 4 });

		// Method 3

		String s = "Hello";

		IntStream s3 = s.chars();

		// Method 4

		// the return value is a new infinite sequential unordered Stream.
		Stream<Object> s4 = Stream.generate(new Random()::nextInt);

		s4.limit(10).forEach(ele -> System.out.println(ele));

		// Method 5

		Stream.iterate(0, n -> n + 1).limit(10).forEach(x -> System.out.println(x));

		// Lambda Expression and Method Reference explained

		String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon" };

		MyComparator myComparator = new MyComparator();

		Comparator<String> myComparator1 = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}

		};

		Comparator<String> myComparator2 = (o1, o2) -> {
			return o1.compareToIgnoreCase(o2);
		};

		Comparator<String> myComparator3 = new MyComparator()::compare;

		Arrays.sort(stringArray, myComparator3);

	}

}

class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareToIgnoreCase(o2);

	}

}
