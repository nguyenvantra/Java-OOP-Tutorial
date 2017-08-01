package com.darkness.step4;

public class Person {
	// private variables declared
	// these can only be accessed by
	// public methods of class
	private String name;
	private int age;
	private String sex;
	
	//get method for name to access 
	public String getName() {
		return name;
	}
	
	//set method for name to access 
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
