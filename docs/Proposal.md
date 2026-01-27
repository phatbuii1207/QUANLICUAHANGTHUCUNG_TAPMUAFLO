# Thiết kế hệ thống quản lý cửa hàng thú cưng (Pet Store Management)

2️⃣ Mục tiêu

Áp dụng 4 tính chất của OOP: Đóng gói, Kế thừa, Đa hình, Trừu tượng.

Rèn luyện kỹ năng thiết kế class và tương tác giữa các đối tượng.

Xây dựng chương trình có menu và kiểm tra dữ liệu đầu vào (validation).

Quản lý dữ liệu bằng ArrayList.

3️⃣ Chức năng chính của hệ thống

Thêm thú mới (Dog, Cat).

Xóa thú khỏi hệ thống.

Tìm thú theo tên.

Hiển thị toàn bộ thú.

Tạo hóa đơn cho khách hàng.

Tính tổng tiền hóa đơn.

Thoát chương trình an toàn.

4️⃣ Thiết kế các lớp (Class Design)
🔹 1. Lớp Pet (Lớp cha)

Vai trò: Đại diện cho một con thú chung.

Thuộc tính:

id, name, age, price, type

Phương thức:

input(): Nhập thông tin thú.

display(): Hiển thị thông tin thú.

getId(), getPrice(): Truy cập dữ liệu an toàn.

Áp dụng OOP:
Đóng gói, Trừu tượng, Lớp cha cho kế thừa.

🔹 2. Lớp Dog (Lớp con)

Vai trò: Đại diện cho chó, kế thừa từ Pet.

Thuộc tính:

breed (giống chó)

Phương thức:

Ghi đè input() và display().

Áp dụng OOP:
Kế thừa, Đa hình.

🔹 3. Lớp Cat (Lớp con)

Vai trò: Đại diện cho mèo, kế thừa từ Pet.

Thuộc tính:

color (màu lông)

Phương thức:

Ghi đè input() và display().

Áp dụng OOP:
Kế thừa, Đa hình.

🔹 4. Lớp Customer

Vai trò: Lưu thông tin khách hàng.

Thuộc tính:

id, name, phone

Phương thức:

input(), display()

Áp dụng OOP:
Đóng gói, Trừu tượng.

🔹 5. Lớp Order

Vai trò: Đại diện cho một hóa đơn mua hàng.

Thuộc tính:

orderId, customer, petList, totalAmount

Phương thức:

addPet(Pet p): Thêm thú vào hóa đơn.

calculateTotal(): Tính tổng tiền.

display(): Hiển thị hóa đơn.

Áp dụng OOP:
Đa hình (danh sách Pet), Đóng gói.

🔹 6. Lớp PetStoreManagement

Vai trò: Quản lý toàn bộ hệ thống.

Thuộc tính:

ArrayList<Pet> pets

ArrayList<Order> orders

Scanner sc

Phương thức:

addPet()

removePet()

searchPetByName()

displayAllPets()

createOrder()

Áp dụng OOP:
Trừu tượng, Đa hình.

🔹 7. Lớp Main

Vai trò: Điểm bắt đầu chương trình và điều khiển menu.

Phương thức:

main(): Hiển thị menu, nhận lựa chọn và gọi các chức năng từ PetStoreManagement.

Áp dụng OOP:
Trừu tượng.

5️⃣ Áp dụng 4 tính chất OOP
Tính chất	Thể hiện trong bài
Đóng gói	Thuộc tính private/protected, truy cập qua method
Kế thừa	Dog và Cat kế thừa từ Pet
Đa hình	Pet p = new Dog(); p.display();
Trừu tượng	Người dùng chỉ gọi menu, không biết logic bên trong
