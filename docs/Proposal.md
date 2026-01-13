# 🐾 PROJECT PROPOSAL  
## HỆ THỐNG QUẢN LÝ CỬA HÀNG THÚ CƯNG  
*(Pet Shop Management System)*

---
## 4. Danh sách 10 Class chức năng

### 4.1 Pet
Quản lý thông tin thú cưng trong cửa hàng.  
**Thuộc tính:** petId, name, species, breed, age, gender, price, status  
**Phương thức:** displayInfo(), updateStatus()

---

### 4.2 Product
Quản lý các sản phẩm bán trong cửa hàng.  
**Thuộc tính:** productId, productName, category, price, quantity  
**Phương thức:** updateQuantity(), displayProduct()

---

### 4.3 Customer
Quản lý thông tin khách hàng.  
**Thuộc tính:** customerId, fullName, phone, email  
**Phương thức:** displayCustomer(), updateContact()

---

### 4.4 Employee
Quản lý thông tin nhân viên.  
**Thuộc tính:** employeeId, name, role, salary  
**Phương thức:** displayEmployee(), calculateSalary()

---

### 4.5 Service
Quản lý các dịch vụ chăm sóc thú cưng.  
**Thuộc tính:** serviceId, serviceName, price, duration  
**Phương thức:** displayService(), updatePrice()

---

### 4.6 Appointment
Quản lý lịch hẹn dịch vụ.  
**Thuộc tính:** appointmentId, pet, customer, service, date, status  
**Phương thức:** confirm(), cancel()

---

### 4.7 Invoice
Quản lý hóa đơn thanh toán.  
**Thuộc tính:** invoiceId, customer, totalAmount, date  
**Phương thức:** calculateTotal(), printInvoice()

---

### 4.8 OrderItem
Quản lý chi tiết sản phẩm trong hóa đơn.  
**Thuộc tính:** itemId, product, quantity, price  
**Phương thức:** getSubTotal()

---

### 4.9 Boarding
Quản lý dịch vụ lưu chuồng thú cưng.  
**Thuộc tính:** boardingId, pet, cageNumber, startDate, endDate  
**Phương thức:** assignCage(), calculateFee()

---

### 4.10 Report
Tổng hợp và thống kê dữ liệu.  
**Thuộc tính:** reportId, reportType, startDate, endDate  
**Phương thức:** generateReport(), exportFile()

---

📌 **Tên dự án:** Pet Shop Management System  
📌 **Nhóm thực hiện:** Group_SEPaTun
