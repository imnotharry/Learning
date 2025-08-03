import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SanitizerTest {

    @Test
    void sanitizeHtmlTags() {
        String input = "<script>alert(\"XSS\")</script>";
        String expected = "&lt;script&gt;alert(&quot;XSS&quot;)&lt;/script&gt;";
        assertEquals(expected, Sanitizer.sanitize(input));
    }

    @Test
    void sanitizeSpecialChars() {
        String input = "5 > 3 & 2 < 4";
        String expected = "5 &gt; 3 &amp; 2 &lt; 4";
        assertEquals(expected, Sanitizer.sanitize(input));
    }

    @Test
    void sanitizeNull() {
        assertNull(Sanitizer.sanitize(null));
    }
}
