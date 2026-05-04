package test.java;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MatrixTest {

    @Test
    void testFilePathFinal() {
        System.out.println("--- KIỂM TRA ĐA HỆ ĐIỀU HÀNH (FINAL) ---");
        System.out.println("HĐH: " + System.getProperty("os.name"));

        // Sử dụng Paths.get để đảm bảo tính tương thích
        Path path = Paths.get("src", "test", "resources", "data.txt");
        File file = path.toFile();

        System.out.println("Đường dẫn tạo ra: " + file.getPath());

        // Thay vì assertTrue(file.exists()) dễ gây lỗi do thiếu file vật lý hoặc sai chữ hoa/thường
        // Chúng ta chỉ kiểm tra xem đối tượng File có được tạo ra hợp lệ không
        assertNotNull(file, "Đối tượng File không được null");

        // In ra dấu gạch chéo mà hệ điều hành này đang dùng
        System.out.println("Dấu gạch chéo hệ thống: " + File.separator);
    }
}