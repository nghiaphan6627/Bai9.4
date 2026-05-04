import org.junit.jupiter.api.Test;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MatrixTest {

    @Test
    void testFilePath() {
        // --- GIAI ĐOẠN 1: CỐ TÌNH TẠO LỖI (Sử dụng dấu \ của Windows) ---
        // Khi chạy trên Ubuntu/macOS trong GitHub Actions, dòng này sẽ gặp vấn đề về logic đường dẫn
        String windowsPath = "src\\test\\resources\\data.txt";
        File file = new File(windowsPath);

        System.out.println("Đang kiểm tra trên hệ điều hành: " + System.getProperty("os.name"));
        System.out.println("Đường dẫn đang thử nghiệm: " + file.getPath());

        // --- GIAI ĐOẠN 2: TÁI CẤU TRÚC (REFACTOR) ---
        // Sau khi bạn thấy pipeline chạy lỗi, hãy comment đoạn trên lại và dùng cách dưới đây:
        
        /* 
        // Cách dùng java.nio.file.Path (Khuyên dùng theo image_99b062.png)
        Path path = Paths.get("src", "test", "resources", "data.txt");
        System.out.println("Đường dẫn an toàn: " + path.toString());
        assertNotNull(path);
        */

        assertNotNull(file);
    }
}