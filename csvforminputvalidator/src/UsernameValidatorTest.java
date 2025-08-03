import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UsernameValidatorTest {

    private final UsernameValidator validator = new UsernameValidator();

    @Test
    void validUsernames() {
        assertTrue(validator.isValid("user123"));
        assertTrue(validator.isValid("JohnDoe"));
        assertTrue(validator.isValid("admin_001"));
    }

    @Test
    void invalidUsernames() {
        assertFalse(validator.isValid("john doe"));
        assertFalse(validator.isValid("!@#admin"));
        assertFalse(validator.isValid(null));
    }
}

