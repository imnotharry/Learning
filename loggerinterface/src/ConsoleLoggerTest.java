import org.junit.jupiter.api.Test;

public class ConsoleLoggerTest {

    @Test
    void testLogDoesNotThrow() {
        Logger logger = new ConsoleLogger();
        logger.log("Test message to console");
    }
}
