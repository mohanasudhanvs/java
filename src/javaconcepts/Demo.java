package javaconcepts;

public class Demo {

	public static void main(String[] args) {

		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("hello");

	}

}
