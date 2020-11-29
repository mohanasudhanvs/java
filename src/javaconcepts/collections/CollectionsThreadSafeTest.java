package javaconcepts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsThreadSafeTest {

	public static void main(String[] args) throws InterruptedException {

		List<Integer> list = new ArrayList<Integer>();
		Vector<Integer> vectorList = new Vector();
		List<Integer> copyArraylist = new CopyOnWriteArrayList<Integer>();
		List<Integer> synchronizedArraylist = Collections.synchronizedList(new ArrayList<>());

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10_000; i++) {
					list.add(i);
					vectorList.add(i);
					copyArraylist.add(i);
					synchronizedArraylist.add(i);
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10_000; i++) {
					list.add(i);
					vectorList.add(i);
					copyArraylist.add(i);
					synchronizedArraylist.add(i);
				}
			}
		});

		thread1.start();
		thread2.start();

		Thread.sleep(10000);

		System.out.println(list.size());
		System.out.println(vectorList.size());
		System.out.println(copyArraylist.size());
		System.out.println(synchronizedArraylist.size());

	}
}
