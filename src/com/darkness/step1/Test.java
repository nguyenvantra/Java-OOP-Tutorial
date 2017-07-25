package com.darkness.step1;

public class Test {
	public static void main(String[] args) {
		//Tạo instance husky từ object Dog
		Dog husky = new Dog();
		
		// Husky có đầy đủ các thuộc tính của Dog
		String name = husky.name;
		int age = husky.age;
		
		// Husky có đầy đủ method của Dog
		husky.eat();
		husky.run();
		husky.sleep();
	}
}
