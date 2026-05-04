package test.java;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MatrixTest {

    @Test
    void testFilePathWithHardcodedSeparator() {
        System.out.println("--- GIAI ĐOẠN: CỐ TÌNH TẠO LỖI (Yêu cầu 2) ---");
        System.out.println("Hệ điều hành hiện tại: " + System.getProperty("os.name"));

        // Sử dụng dấu gạch chéo ngược (\) đặc trưng của Windows
        // Trên Linux (Ubuntu) và macOS, dấu này không được coi là phân cách thư mục
        String windowsPath = "src\\test\\resources\\data.txt";
        File file = new File(windowsPath);

        System.out.println("Đường dẫn đang kiểm tra: " + windowsPath);

        // Lệnh này sẽ kiểm tra xem file có thực sự tồn tại không.
        // Vì dấu \ sai định dạng trên Linux/macOS, file.exists() sẽ trả về false
        // Điều này sẽ làm Pipeline bị lỗi (hiện dấu X đỏ) trên Ubuntu và Mac
        assertTrue(file.exists(), "LỖI: Không tìm thấy tệp tin do sai định dạng đường dẫn trên OS này!");
    }
}