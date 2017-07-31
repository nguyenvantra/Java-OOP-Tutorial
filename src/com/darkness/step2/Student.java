package com.darkness.step2;

public class Student {
	private String idStudent;
	private String name;
	private int age;
	private String address;

	// No-argument constructor
	// Nếu class Student không khai báo constructor nào thì mặc địn Java sẻ gọi
	// No-argument constructor
	public Student() {

	}

	// Parameterized Constructor
	// Ví dụ đối tượng Student có 2 parameter
	public Student(String idStudent, String name) {
		this.idStudent = idStudent;
		this.name = name;
	}

	// Đối tượng Student có đầy đủ parameter
	public Student(String idStudent, String name, int age, String address) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.age = age;
		this.address = address;
	}

}
