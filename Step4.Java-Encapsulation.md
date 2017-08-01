# Encapsulation
## Encapsulation (Tính bao đóng)
Trước khi tìm hiểu **Encapsulation** là gì. Chúng ta sẻ tìm hiểu sơ qua về **Access Modifier** trong ```java``` 

Access Modifier | Phạm vi truy cập
---------------- | -----------------
```private``` | Chỉ truy cập được từ class khai báo
```protected``` | Truy cập được từ trong class khai báo, class con của class khai báo và các class cùng gói với class khai báo
```public``` | Truy cập được từ mọi nơi
```default``` | Truy cập được từ trong class khai báo và các class cùng gói với class khai báo

Encapsulation là **a process of wrapping code and data together into a single unit** có thể hiểu **là quá trình bao đóng, đóng gói code và dữ liệu thành một đơn vị duy nhất**. Một cách hiểu khác là nó giống như một lá chắn bảo vệ để ngăn ngừa dữ liệu bị truy cập bởi mã bên ngoài.

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
## Code example: 
[Code example constructor](https://github.com/nguyenvantra/Java-OOP-Tutorial/tree/master/src/com/darkness/step4)