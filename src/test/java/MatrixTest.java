package test.java;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MatrixTest {

    @Test
    void testFilePathRequirementsStep2() {
        System.out.println("--- THỰC HIỆN YÊU CẦU 2: CỐ TÌNH TẠO LỖI ---");
        System.out.println("Hệ điều hành hiện tại: " + System.getProperty("os.name"));

        // Sử dụng định dạng gạch chéo ngược (\) cứng của Windows
        // Windows sẽ hiểu đây là đường dẫn thư mục.
        // Ubuntu và macOS sẽ hiểu đây là một tên file bình thường (và không tìm thấy).
        String hardcodedWindowsPath = "src\\test\\resources\\data.txt";
        File file = new File(hardcodedWindowsPath);

        System.out.println("Đường dẫn đang kiểm tra: " + hardcodedWindowsPath);

        // Lệnh này bắt buộc hệ thống phải kiểm tra tệp có tồn tại thực sự không
        // Kết quả: Windows -> True (Xanh), Ubuntu/macOS -> False (Đỏ)
        assertTrue(file.exists(), "LỖI: Không tìm thấy tệp tin do sai định dạng đường dẫn trên hệ điều hành này!");
    }
}