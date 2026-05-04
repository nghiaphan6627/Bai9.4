package test.java;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MatrixTest {

    @Test
    void testFilePathRefactored() {
        System.out.println("--- BƯỚC 3: TÁI CẤU TRÚC (REFACTOR) THÀNH CÔNG ---");
        System.out.println("Hệ điều hành: " + System.getProperty("os.name"));

        // Sử dụng Paths.get thay vì viết dấu gạch chéo thủ công
        // API này sẽ tự động hỏi OS để dùng dấu gạch phù hợp
        Path safePath = Paths.get("src", "test", "resources", "data.txt");
        File file = safePath.toFile();

        System.out.println("Đường dẫn đã chuẩn hóa: " + file.getPath());

        // Kiểm tra xem file có tồn tại thực tế không
        // Lúc này, cả 3 OS đều sẽ tìm thấy file và trả về True ✅
        assertTrue(file.exists(), "LỖI: Vẫn không tìm thấy file dù đã refactor!");
    }
}