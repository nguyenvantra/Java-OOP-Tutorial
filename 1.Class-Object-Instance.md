# Class, Object, Instance
Ba khái niệm này rất quan trọng cần hiểu rõ và hình dung được để có thể vận dụng vào cách lập trình OOP.

## Class
**Class** được xem như là bản thiết kế```(blueprint)``` hoặc có thể xem là khuôn mẫu```(prototype)``` từ đó tạo ra các **object(đối tượng)**, là tập hợp các **object(đối tượng)** có cùng phương thức và thuộc tính.

Example: Tạo một đối tượng ```Animal```.

```java
public class Animal {

}
```

## Object
**Object** là **entity(thực thể)** mang tính vật lý cũng như mang tính logic. Mỗi **object(đối tượng)** bao gồm:
- **State(Trạng thái)**: Những gì đối tượng có, nó được đại diện bởi các **attributes(thuộc tính)** của một object(đối tượng).
- **Behavior(Hành vi)**: Những gì đối tượng làm, nó được đại diện bởi các **method(phương thức)** của một object(đối tượng).
- **Identity(Danh tính)**: Điều gì làm cho chúng trở nên độc nhất và khác biệt, cho phép một object(đối tượng) tương tác với các object(đối tượng) khác.

Example: Một object(đối tượng) Animal.

State | Behavior | Identity
------------ | ------------- | -------------
age, color, breed | eat, run, sleep | Name of Animal

```java
public class Animal {
	//Thuộc tính của Animal
	String name;
	int age;
	
	//Hành vi của Animal
	public void eat() {
	
	}
	
	//Hành vi của Animal
	public void run() {
	
	}
	
	//Hành vi của Animal
	public void sleep() {
	
	} 
}
```

## Instance
**Instance** được hiểu là **thể hiện** của lớp đối tượng nào đó, nó được khai báo thông qua từ khoá ```new``` lúc này nó có giá trị thuộc tính cụ thể.

Example:
```java
public class Animal {
	public static void main(String[] args) {
		//Tạo instance husky từ object Animal
		Animal husky = new Animal();
		
		//husky có đầy đủ các giá trị thuộc cụ thể
		String name = husky.name;
		int age = husky.age;
		husky.eat();
		husky.run();
		husky.sleep();
	}
}
``` 