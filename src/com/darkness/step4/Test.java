package com.darkness.step4;

public class Test {
	public static void main(String[] args) {
		Person person = new Person();
		
		//setting values of the variables 
		person.setName("NguyenVanTra");
		person.setAge(22);
		person.setSex("male");
		
		//Displaying values of the variables
		System.out.println("Name: "+person.getName()); // NguyenVanTra
		System.out.println("Age: "+person.getAge()); // 22
		System.out.println("Sex: "+person.getSex()); // male
		
		
	}
}
