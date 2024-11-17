package labs.lab5;

public abstract class Person implements Comparable {

	private String name;
	private int age;

	/**
	 * 
	 * @param name no validity checks necessary -- assume all valid input
	 * @param age  no validity checks necessary -- assume all valid input
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	/**
	 * compares first by name (use String.compareTo), then by age
	 */
	@Override
	public int compareTo(Object otherPerson) {
		int val;
		val = this.name.compareTo(((Person) otherPerson).getName());
		if (val ==0) {
			val = age - ((Person) otherPerson).getAge();
		}
		return val;
	}


	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age;
	}

}