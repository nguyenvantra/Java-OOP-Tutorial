# Constructor
**Constructor** trong Java là một phương thức đặc biệt được sử dụng để **initialize(khởi tạo) object(đối tượng)**. Mỗi lần đối tượng được tạo ra bằng cách sử dụng từ khoá **new** thì ít nhất một **constructor** được gọi để gán giá trị ban đầu cho class. 

Example:
```java
public class Student {
	
	// Constructor trong Java
	public Student() {

	}
}

```

## Quy tắc tạo một **constructor** trong Java
- Tên constructor phải giống với tên của class 
- Một constructor không thể khai báo abstract, final, static and Synchronized.
- Có thể sử dụng **access modifiers** trong khai báo để kiểm soát được việc truy cập của nó.

## Types of constructor
Có 2 loại constructor trong java
- **No-argument constructor**: Một constructor **không có parameter** được gọi là **default constructor**. Nếu trong class chúng ta không khai báo constructor nào thì trình biên dịch sẽ tạo ra **default constructor (with no arguments)** cho class.

- **Parameterized Constructor**: Một constructor **có parameter** được gọi là **parameterized constructor**. Chúng ta có thể tạo constructor với các fields của class là các giá trị mà chúng ta muốn, sau đó có thể sử dụng **parameterized constructor** vừa tạo một cách bình thường.


Example:
```java
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
	public Student(String idStudent, String name, int age, String address) {
		this.idStudent = idStudent;
		this.name = name;
		this.age = age;
		this.address = address;
	}

}
``` 

## Constructor Overloading in Java
Giống như phương thức chúng ta có thể tạo ra nhiều **constructor** từ số lượng **parameter** của class đó, trong Java kỹ thuật này được gọi là **constructor overloading**. Trình biên dịch sẻ phân biệt các **constructor** thông qua sô lượng, loại, thứ tự **parameters**. 

Example:
```java
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
		this.idStudent = idStudent;
		this.name = name;
		this.age = age;
		this.address = address;
	}

}
```

