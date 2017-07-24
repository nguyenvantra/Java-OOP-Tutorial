# OOP-Tutorial
OOP là **object-oriented programming** hay còn gọi là **lập trình định hướng đối tượng** là một trong những kỹ thuật lập trình rất quan trọng và phổ biến hiện nay. Hầu hết các ngôn ngữ lập trình phổ biến hiện nay như Java, Ruby, C# kể cả JavaScript đều hỗ trợ lập trình hướng đối tượng.

Lập trình hướng đối tượng là một kỹ thuật lập trình cho phép lập trình viên tạo ra các đối tượng trong code **trừu tượng hóa** các đối tượng thực tế trong cuộc sống.

OOP được xem là giúp tăng năng suất, đơn giản hóa độ phức tạp khi bảo trì cũng như mở rộng phần mềm bằng cách cho phép lập trình viên tập trung vào các đối tượng phần mềm ở bậc cao hơn. Ngoài ra, nhiều người còn cho rằng OOP dễ tiếp thu hơn cho những người mới học về lập trình hơn là các phương pháp trước đó.

Có thể đọc chi tiết tại: [wikipedia](https://vi.wikipedia.org/wiki/Lập_trình_hướng_đối_tượng)

## Class, Object, Intance
**Class** được xem như là bản thiết kế```(blueprint)``` hoặc có thể xem là khuôn mẫu```(prototype)``` từ đó tạo ra các **object(đối tượng)**, là tập hợp các **object(đối tượng)** có cùng phương thức và thuộc tính.

**Object** là **entity(thực thể)** mang tính vật lý cũng như mang tính logic. Mỗi **object(đối tượng)** bao gồm:
- **State(Trạng thái)**: Nó được đại diện bởi các **attributes(thuộc tính)** của một đối tượng(Object).
- **Behavior(Hành vi)**: Nó được đại diện bởi các **method(phương thức)** của một đối tượng(Object).
- **Identity(Danh tính)**: Nó đưa ra một tên duy nhất cho một object(đối tượng) và cho phép một object(đối tượng) tương tác với các object(đối tượng) khác.

Example: Một object(đối tượng) Dog.

State | Behavior | Identity
------------ | ------------- | -------------
age, color, breed | eat, run, sleep | Name of Dog

**Instance** được hiểu là **thể hiện** của lớp đối tượng nào đó, nó được khai báo thông qua từ khoá ```new``` lúc này nó có giá trị thuộc tính cụ thể.

Example:
```java
//Tạo instance husky từ object Dog
Dog husky = new Dog();
``` 

## Các nguyên lý cơ bản trong OOP
### Abstraction (Tính trừu tượng)
### Encapsulation (Tính bao đóng)
Trước khi tìm hiểu **Encapsulation** là gì. Chúng ta sẻ tìm hiểu sơ qua về **Access Modifier** trong ```java``` 

Access Modifier | Phạm vi truy cập
---------------- | -----------------
```private``` | Chỉ truy cập được từ class khai báo
```protected``` | Truy cập được từ trong class khai báo, class con của class khai báo và các class cùng gói với class khai báo
```public``` | Truy cập được từ mọi nơi
```default``` | Truy cập được từ trong class khai báo và các class cùng gói với class khai báo

Encapsulation là *a process of wrapping code and data together into a single unit* có thể hiểu *là quá trình bao đóng, đóng gói code và dữ liệu thành một đơn vị duy nhất*. Một cách hiểu khác là nó giống như một lá chắn bảo vệ để ngăn ngừa dữ liệu bị truy cập bởi mã bên ngoài.

Về mặt kỹ thuật trong **Encapsulation** các variables(biến) hoặc data(dữ liệu) sẻ được bị ẩn đi, các class khác sẻ không nhìn thấy và các class khác chỉ có thể được truy cập thông qua một số function(hàm) mà class đó cung cấp.

Để thực hiện Encapsulation thì phải định nghĩa tất cả các variables(biến) trong class là ```private``` và viết các ```public``` method(phương thức) để ```get``` và ```set``` giá trị cho variable.

Example:
```java
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
``` 

Kết quả khi chạy:

```java
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
```

### Inheritance (Tính kế thừa)
Inheritance (Tính kế thừa) là một tính chất quan trọng trong OOP. Nó là cơ chế mà cho phép một class được phép **thừa hưởng** các tính năng **(fields and method)** của một class khác.  Điều này cho phép các object chia sẻ hay mở rộng các đặc tính sẵn có mà không phải tiến hành định nghĩa lại.

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


### Polymophirsm (Tính đa hình)


