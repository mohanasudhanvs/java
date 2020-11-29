package javaconcepts.collections.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetEqualsMethodImportance {

	public static void main(String[] args) {

		Set<Emp> emps = new HashSet<>();
		emps.add(new Emp(1, "Pankaj"));
		emps.add(new Emp(2, "David"));
		emps.add(new Emp(1, "Pankaj"));

		System.out.println(emps);

		Emp e = new Emp(3, "Lisa");
		emps.add(e);
		System.out.println(emps);

		// set values to make it duplicate
		e.setId(1);
		System.out.println(emps);
		e.setName("Pankaj");
		System.out.println(emps);
	}

}

class Emp {
	private String name;
	private int id;

	public Emp(int i, String n) {
		this.setId(i);
		this.setName(n);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Emp))
			return false;
		Emp e = (Emp) obj;
		if (e.getId() == this.getId() && this.getName().equals(e.getName()))
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return getId();
	}

	@Override
	public String toString() {
		return "{" + getId() + "," + getName() + "}";
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

}
