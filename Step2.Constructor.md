# Constructor
**Constructor** trong Java là một phương thức đặc biệt được sử dụng để **initialize(khởi tạo) object(đối tượng)**. Mỗi lần đối tượng được tạo ra bằng cách sử dụng từ khoá **new** thì ít nhất một **constructor** được gọi để gán giá trị ban đầu cho class. 

## Quy tắc tạo một **constructor** trong Java
- Tên constructor phải giống với tên của class 
- Một constructor không thể khai báo abstract, final, static and Synchronized.
- Có thể sử dụng **access modifiers** trong khai báo để kiểm soát được việc truy cập của nó.

## Types of constructor
Có 2 loại constructor trong java
- **No-argument constructor**: Một constructor **không có parameter** được gọi là **default constructor**. Nếu trong class chúng ta không khai báo constructor nào thì trình biên dịch sẽ tạo ra **default constructor (with no arguments)** cho class.

- **Parameterized Constructor**: Một constructor **có parameter** được gọi là **parameterized constructor**. Chúng ta có thể tạo constructor với các fields của class là các giá trị mà chúng ta muốn, sau đó có thể sử dụng **parameterized constructor** vừa tạo một cách bình thường. 
