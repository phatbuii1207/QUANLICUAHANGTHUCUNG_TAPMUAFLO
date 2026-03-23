📄 PROPOSAL – PET STORE MANAGEMENT SYSTEM
📄 ĐỀ XUẤT – HỆ THỐNG QUẢN LÝ CỬA HÀNG THÚ CƯNG
1. Introduction / Giới thiệu

EN:
The Pet Store Management System is a Java console application designed to manage pet information in a store. It allows users to perform basic operations such as adding, displaying, searching, and saving pet data.

VI:
Hệ thống quản lý cửa hàng thú cưng là một ứng dụng Java chạy trên console, dùng để quản lý thông tin thú cưng trong cửa hàng. Hệ thống cho phép người dùng thêm, hiển thị, tìm kiếm và lưu dữ liệu thú cưng.

2. Objectives / Mục tiêu

EN:

Manage pet information effectively
Apply Object-Oriented Programming (OOP) concepts
Practice file handling in Java

VI:

Quản lý thông tin thú cưng hiệu quả
Áp dụng các nguyên lý lập trình hướng đối tượng (OOP)
Thực hành đọc/ghi file trong Java
3. System Features / Chức năng hệ thống

EN:

Add new pets (Dog or Cat)
Display all pets
Search pets by ID
Save and load data from file

VI:

Thêm thú cưng mới (Chó hoặc Mèo)
Hiển thị danh sách thú cưng
Tìm kiếm theo ID
Lưu và đọc dữ liệu từ file
4. System Design / Thiết kế hệ thống
4.1 Class Structure / Cấu trúc lớp

EN:

Pet (Abstract Class)
Stores common attributes and defines shared behavior.
Dog (Subclass)
Extends Pet and adds dog-specific properties.
Cat (Subclass)
Extends Pet and adds cat-specific properties.
ISellable (Interface)
Defines method for discount calculation.
Main Class
Handles program execution and user interaction.

VI:

Pet (Lớp trừu tượng)
Lưu các thuộc tính chung và định nghĩa hành vi chung.
Dog (Lớp con)
Kế thừa từ Pet và bổ sung thuộc tính riêng của chó.
Cat (Lớp con)
Kế thừa từ Pet và bổ sung thuộc tính riêng của mèo.
ISellable (Interface)
Định nghĩa phương thức tính giá giảm.
Main (Lớp chính)
Điều khiển chương trình và tương tác với người dùng.
4.2 OOP Concepts / Các nguyên lý OOP

EN:

Encapsulation: using private fields and getters
Inheritance: Dog and Cat extend Pet
Polymorphism: using ArrayList<Pet>
Abstraction: abstract class and method
Interface: ISellable implementation

VI:

Đóng gói: sử dụng biến private và getter
Kế thừa: Dog và Cat kế thừa Pet
Đa hình: sử dụng ArrayList<Pet>
Trừu tượng: lớp và phương thức abstract
Interface: triển khai ISellable
5. Program Flow / Luồng chương trình

EN:

Start program
Load data from file (if exists)
Display menu
Execute user choice
Save data and exit

VI:

Khởi động chương trình
Đọc dữ liệu từ file (nếu có)
Hiển thị menu
Thực hiện lựa chọn của người dùng
Lưu dữ liệu và thoát
6. File Structure / Cấu trúc file

EN:
Data is stored in a text file pets.txt with format:

id,name,age,price,type,extra,flag

VI:
Dữ liệu được lưu trong file pets.txt với định dạng:

id,name,age,price,type,extra,flag

Example / Ví dụ:

D01,Buddy,3,150.0,Dog,Husky,true
C01,Mimi,2,120.0,Cat,White,true
7. Conclusion / Kết luận

EN:
This project demonstrates the application of core OOP principles and file handling in Java, providing a simple yet effective management system.

VI:
Dự án thể hiện việc áp dụng các nguyên lý OOP và xử lý file trong Java, cung cấp một hệ thống quản lý đơn giản nhưng hiệu quả.
