package javaconcepts.collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ArrayListReplaceAllExample {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			ints.add(i);

		// multiply all elements by 10
		UnaryOperator<Integer> operator = new ArrayListReplaceAllExample().new MyUnaryOperator();
		ints.replaceAll(operator);
		System.out.println(ints);

		// lambda expression example, multiply by 5
		ints.replaceAll(x -> {
			return x * 5;
		});
		System.out.println(ints);
	}

	class MyUnaryOperator implements UnaryOperator<Integer> {

		@Override
		public Integer apply(Integer t) {
			return t * 10;
		}

	}
}
