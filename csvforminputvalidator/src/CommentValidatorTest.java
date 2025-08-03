import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommentValidatorTest {

    private final CommentValidator validator = new CommentValidator();

    @Test
    void validComments() {
        assertTrue(validator.isValid("Hello world!"));
        assertFalse(validator.isValid("What's up?"));
        assertTrue(validator.isValid("Price is $99.99"));
    }

    @Test
    void invalidComments() {
        assertFalse(validator.isValid("<script>alert('XSS')</script>"));
        assertFalse(validator.isValid("Bad <b>tag</b>"));
        assertFalse(validator.isValid(null));
    }
}
