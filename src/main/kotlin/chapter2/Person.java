package chapter2;

import org.jetbrains.annotations.Nullable;

public class Person {

	private String name;
	private int age;

	public Person(final String name) {
		this.name = name;
	}

	public Person(final String name, final int age) {
		this.name = name;
		this.age = age;
	}

	@Nullable
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
