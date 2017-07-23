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

**Instance** được hiểu là **thể hiện** của lớp đối tượng nào đó, nó được khai báo thông qua từ khoá ```**new**``` lúc này nó có giá trị thuộc tính cụ thể.

Example:
```java
//Tạo instance husky từ object Dog
Dog husky = new Dog();
``` 

## Các nguyên lý cơ bản trong OOP
### Abstraction (Tính trừu tượng)
### Encapsulation (Tính bao đóng)
### Inheritance (Tính kế thừa)
### Polymophirsm (Tính đa hình)


