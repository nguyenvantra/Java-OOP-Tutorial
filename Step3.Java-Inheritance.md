# Inheritance in Java
## Inheritance (Tính kế thừa)
Inheritance (Tính kế thừa) là một tính chất quan trọng trong OOP. Nó là cơ chế mà cho phép một class được phép **thừa hưởng** các tính năng **(fields and method)** của một class khác.  Điều này cho phép các object chia sẻ hay mở rộng các đặc tính sẵn có mà không phải tiến hành định nghĩa lại.

## Syntax of Java Inheritance

```java
class Subclass-name extends Superclass-name  {  
   //methods and fields  
}
```

Sử dụng từ khoá **extends** để thực hiện việc kế thừa trong Java. Trong Java class được kế thừa được gọi là **parent** hoặc **super class**, class kế thừa được gọi là **subclass**.

Example:
Ta có class ```Animal``` có 3 attributes là **color, age, weight**

```java
public class Animal {
	private String color;
	private int age;
	private int weight;

	public Animal(String color, int age, int weight) {
		this.color = color;
		this.age = age;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public int getAge() {
		return age;
	}

	public int getWeight() {
		return weight;
	}

}
```

Class ```Dog``` và ```Cat``` sẻ kế thừa class ```Animal``` thông qua từ khoá ```extends```.

```java 
public class Dog extends Animal {

	public Dog(String color, int age, int weight) {
		super(color, age, weight);
	}

}
```

```java
public class Cat extends Animal {

	public Cat(String color, int age, int weight) {
		super(color, age, weight);
	}

}
```

Class ```Dog``` và ```Cat``` sẻ được thừa hưởng các thuộc tính và phương thức mà ```Animal``` đã khai báo.

```java
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

```

## Types of inheritance in java
Trong Java có 3 kiểu kế thừa: **single**, **multilevel** and **hierarchical**. Đa kế thừa chỉ được Java hổ trợ cho **interface**.

## Code example: 
[Code example constructor](https://github.com/nguyenvantra/Java-OOP-Tutorial/tree/master/src/com/darkness/step3)