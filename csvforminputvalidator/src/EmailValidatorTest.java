import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailValidatorTest {

    private final EmailValidator validator = new EmailValidator();

    @Test
    void validEmails() {
        assertTrue(validator.isValid("john@example.com"));
        assertTrue(validator.isValid("user.name@domain.co.uk"));
    }

    @Test
    void invalidEmails() {
        assertFalse(validator.isValid("no-at-symbol.com"));
        assertFalse(validator.isValid("no-domain@"));
        assertFalse(validator.isValid(null));
        assertFalse(validator.isValid("justtext"));
    }
}

