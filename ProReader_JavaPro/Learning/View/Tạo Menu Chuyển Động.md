# Tạo menu chuyển động
## B1: Tạo 1 Panel lớn
## B2: Tạo Panel cho menu, có nút bấm và các Label
- Trang chủ, tải khoản, hóa đơn... hình như là Label.
- ![alt text](image.png)
- Nhớ lưu lại chiều dài, rộng.
- Kéo nó vào trong:
- ![alt text](image-1.png)
## B3: Tạo 1 Label cho trang chủ.
- ![alt text](image-2.png)
## B4: Sử dụng MouseClicked Event của JLabel để gọi vào phương thức mở Menu Panel
- ![alt text](image-3.png)
## B5: Sử dụng tính chất đa luồng để tạo:
- Thực chất khi ta mở Menu cho nó chạy là nó đang chạy trên 1 luồng khác.
- ![alt text](image-5.png)
- (Cái bên trên kiểu Anonymus Class)
- thay đổi cái run thôi.
- ![alt text](image-6.png)
- Cái luồng chạy thì ko cần chạy for cũm đc, nhưng chạy for thì sẽ có hiệu ứng mở.