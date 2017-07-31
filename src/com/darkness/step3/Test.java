package com.darkness.step3;

public class Test {
	public static void main(String[] args) {
		Cat cat = new Cat("black", 2, 15);
		System.out.println(
				String.format("Color: %s, Age: %d, Weight: %d",
				cat.getColor(), cat.getAge(), cat.getWeight()));
		//Color: black, Age: 2, Weight: 15

		Dog dog = new Dog("yellow", 1, 25);
		System.out.println(
				String.format("Color: %s, Age: %d, Weight: %d",
				dog.getColor(), dog.getAge(), dog.getWeight()));
		//Color: yellow, Age: 1, Weight: 25

	}
}
