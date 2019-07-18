public class constructor {
	int age;
	String name;

	public constructor() {
		System.out.println(" welcome");

	}

	public constructor(int age) {
		System.out
				.println("I m a parametrised constructor having only one parameter");
		this.age = age;
	}

	public constructor(int age, String name) {
		System.out
				.println("I m a parametrised constructor having only two parameter");
		this.age = age;
		this.name = name;
	}

	public int getage() {
		return age;
	}

	public String getname() {
		return name;
	}

}
