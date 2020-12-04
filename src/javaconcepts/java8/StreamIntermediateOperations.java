package javaconcepts.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediateOperations {

	public static void main(String[] args) {

		// filter()

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 100; i++)
			myList.add(i);
		Stream<Integer> sequentialStream = myList.stream();

		Stream<Integer> highNums = sequentialStream.filter(p -> p > 90); // filter numbers greater than 90
		System.out.print("High Nums greater than 90=");
		highNums.forEach(p -> System.out.print(p + " "));
//prints "High Nums greater than 90=91 92 93 94 95 96 97 98 99 "

		// map()

		Stream<String> names = Stream.of("aBc", "d", "ef");
		System.out.println(names.map(s -> {
			return s.toUpperCase();
		}).collect(Collectors.toList()));
//prints [ABC, D, EF]

		// Sorted()

		Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
		List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseSorted); // [ef, d, aBc, 123456]

		Stream<String> names3 = Stream.of("aBc", "d", "ef", "123456");
		List<String> naturalSorted = names3.sorted().collect(Collectors.toList());
		System.out.println(naturalSorted); // [123456, aBc, d, ef]

		Stream<List<String>> namesOriginalList = Stream.of(Arrays.asList("Pankaj"), Arrays.asList("David", "Lisa"),
				Arrays.asList("Amit"));
//flat the stream from List<String> to String stream
		Stream<String> flatStream = namesOriginalList.flatMap(strList -> strList.stream());

		flatStream.forEach(System.out::println);

	}

}