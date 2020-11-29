package javaconcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) throws Exception {
		// Create a sorted set of Integers
		LinkedHashSet<Integer> setWithNaturalOrdering = new LinkedHashSet<>();
		setWithNaturalOrdering.add(5);
		setWithNaturalOrdering.add(9);
		setWithNaturalOrdering.add(4);
		setWithNaturalOrdering.add(21);
		setWithNaturalOrdering.forEach(System.out::println);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(null);
		al.add(null);
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(null);
		ll.add(null);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(null);
		hs.add(null);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(al);
		System.out.println(ll);
		System.out.println(hs);
		System.out.println(lhs);
		
		
//		TreeSet<Integer> a = new TreeSet<Integer>();
//		a.add(null);
		

	}

}