package javaconcepts.generics;

public class GenericsTypeOld {

	private Object t;

	public Object get() {
		return t;
	}

	public void set(Object t) {
		this.t = t;
	}

	public static void main(String args[]) {
		GenericsTypeOld type = new GenericsTypeOld();
		type.set("Pankaj");
		String str = (String) type.get(); // type casting, error prone and can cause ClassCastException
		System.out.println(str);

		type.set(6);
		String str1 = (String) type.get(); // java.lang.ClassCastException
	}
}
