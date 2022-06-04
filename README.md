# Hướng dẫn tạo và sử dụng AnimatedVectorDrawable
// Design
1. Tìm kiếm hoặc thiết kế icon svg bắt đầu và icon svg kết thúc (Tuỳ vào hiệu ứng mong muốn có thể cần svg kết thúc hoặc không)
   * Lưu ý icon svg bắt đầu và kết thúc phải:
       - Cấu tạo từ những hình khối nằm cạnh hoặc chồng lên nhau
       - Có số lượng object bằng nhau
       - Có một màu duy nhất cho tất cả các object
2. Mở trang https://shapeshifter.design/ bằng trình duyệt web, upload icon svg lên và chỉnh sửa.
    * Làm theo các hướng dẫn trên youtube, ví dụ: https://www.youtube.com/watch?v=P35hQOsW0xU&t=826s
3. Export file và gửi cho dev
    * Chọn Export -> Animated Vector Drawable

// Dev
Nhận file Animated Vector Drawable export từ design và thêm vào code
* Để reverse hiệu ứng cần có 2 Animated Vector Drawable nhận từ design cho 2 trường hợp
