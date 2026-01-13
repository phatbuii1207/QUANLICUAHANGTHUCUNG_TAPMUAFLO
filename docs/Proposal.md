# 🐾 HỆ THỐNG QUẢN LÝ CỬA HÀNG THÚ CƯNG

---

## 1. Lớp Thú Cưng (Pet)

### Mô tả
Lớp cơ sở lưu trữ thông tin về các cá thể động vật đang có mặt tại cửa hàng.

### Thuộc tính
- `petID`: Mã thú cưng
- `species`: Loài
- `breed`: Giống
- `age`: Tuổi
- `gender`: Giới tính
- `price`: Giá bán
- `status`: Trạng thái (sẵn sàng / đã bán / đang điều trị)

### Phương thức
- `updateHealthStatus()`: Cập nhật tình trạng sức khỏe
- `getPetDetails()`: Lấy thông tin chi tiết thú cưng

---

## 2. Lớp Sản Phẩm (Product)

### Mô tả
Quản lý các mặt hàng bán lẻ như thức ăn, phụ kiện, đồ chơi.

### Thuộc tính
- `productID`: Mã sản phẩm
- `name`: Tên sản phẩm
- `category`: Danh mục
- `price`: Giá bán
- `stockQuantity`: Số lượng tồn kho
- `expiryDate`: Ngày hết hạn

### Phương thức
- `updateStock()`: Cập nhật tồn kho
- `checkExpiry()`: Kiểm tra hạn sử dụng
- `applyDiscount()`: Áp dụng giảm giá

---

## 3. Lớp Khách Hàng (Customer)

### Mô tả
Lưu trữ thông tin định danh và hành vi mua sắm của khách hàng.

### Thuộc tính
- `customerID`: Mã khách hàng
- `fullName`: Họ và tên
- `phoneNumber`: Số điện thoại
- `email`: Email
- `loyaltyPoints`: Điểm tích lũy

### Phương thức
- `viewPurchaseHistory()`: Xem lịch sử mua hàng
- `addLoyaltyPoints()`: Cộng điểm tích lũy

---

## 4. Lớp Nhân Viên (Employee)

### Mô tả
Quản lý thông tin nhân sự và phân quyền trong hệ thống.

### Thuộc tính
- `employeeID`: Mã nhân viên
- `name`: Tên nhân viên
- `role`: Vai trò (bán hàng / kỹ thuật / quản lý)
- `shift`: Ca làm việc
- `salary`: Lương

### Phương thức
- `checkIn()`: Chấm công vào ca
- `checkOut()`: Chấm công ra ca
- `processOrder()`: Xử lý đơn hàng

---

## 5. Lớp Dịch Vụ (Service)

### Mô tả
Định nghĩa các dịch vụ chăm sóc thú cưng có thu phí.

### Thuộc tính
- `serviceID`: Mã dịch vụ
- `serviceName`: Tên dịch vụ
- `description`: Mô tả
- `duration`: Thời gian thực hiện
- `cost`: Chi phí

### Phương thức
- `updatePrice()`: Cập nhật giá dịch vụ
- `getServiceInfo()`: Lấy thông tin dịch vụ

---

## 6. Lớp Đặt Lịch (Appointment)

### Mô tả
Quản lý lịch hẹn cho các dịch vụ spa, grooming hoặc thăm khám.

### Thuộc tính
- `appointmentID`: Mã lịch hẹn
- `customerID`: Mã khách hàng
- `petID`: Mã thú cưng
- `serviceID`: Mã dịch vụ
- `dateTime`: Thời gian hẹn
- `status`: Trạng thái (đã đặt / hoàn thành / hủy)

### Phương thức
- `reschedule()`: Đổi lịch hẹn
- `confirmAppointment()`: Xác nhận lịch hẹn

---

## 7. Lớp Hóa Đơn (Invoice)

### Mô tả
Ghi lại chi tiết giao dịch tài chính giữa cửa hàng và khách hàng.

### Thuộc tính
- `invoiceID`: Mã hóa đơn
- `customerID`: Mã khách hàng
- `itemList`: Danh sách sản phẩm/dịch vụ
- `totalAmount`: Tổng tiền
- `paymentMethod`: Phương thức thanh toán
- `createdAt`: Ngày tạo

### Phương thức
- `calculateTax()`: Tính thuế
- `generateReceipt()`: Tạo hóa đơn

---

## 8. Lớp Lưu Chuồng (Boarding)

### Mô tả
Quản lý dịch vụ lưu trú cho thú cưng khi chủ vắng nhà.

### Thuộc tính
- `boardingID`: Mã lưu chuồng
- `petID`: Mã thú cưng
- `cageNumber`: Số lồng
- `checkInDate`: Ngày nhận
- `checkOutDate`: Ngày trả
- `dailyRoutine`: Chế độ sinh hoạt hằng ngày

### Phương thức
- `assignCage()`: Phân lồng
- `trackFeeding()`: Theo dõi việc cho ăn

---

## 9. Lớp Nhà Cung Cấp (Supplier)

### Mô tả
Quản lý thông tin các đơn vị cung cấp hàng hóa hoặc con giống.

### Thuộc tính
- `supplierID`: Mã nhà cung cấp
- `companyName`: Tên công ty
- `contactPerson`: Người liên hệ
- `supplyCategory`: Loại hàng cung cấp
- `contractStatus`: Trạng thái hợp đồng

### Phương thức
- `createPurchaseOrder()`: Tạo đơn nhập hàng
- `evaluateSupplier()`: Đánh giá nhà cung cấp

---

## 10. Lớp Báo Cáo (Report)

### Mô tả
Tổng hợp dữ liệu để phân tích hiệu quả kinh doanh.

### Thuộc tính
- `reportID`: Mã báo cáo
- `reportType`: Loại báo cáo (doanh thu / tồn kho / hiệu suất)
- `startDate`: Ngày bắt đầu
- `endDate`: Ngày kết thúc

### Phương thức
- `generateChart()`: Tạo biểu đồ
- `exportPDF()`: Xuất file PDF

---
