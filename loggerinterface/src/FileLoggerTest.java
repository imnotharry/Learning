import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileLoggerTest {

    @Test
    void testLogCreatesFile() {
        String filePath = "simple_log.txt";
        Logger logger = new FileLogger(filePath);
        logger.log("Hello file!");

        File file = new File(filePath);
        assertTrue(file.exists(), "Log file should exist");
        assertTrue(file.length() > 0, "Log file should not be empty");

    }
}

