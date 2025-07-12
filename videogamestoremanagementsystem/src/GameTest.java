import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {
    @Test
    void testSetInStock() {
        Game game = new Game("Test Game", "Action", 19.99, true);
        assertTrue(game.isInStock());

        game.setInStock(false);
        assertFalse(game.isInStock());
    }

    @Test
    void testToString() {
        Game game = new Game("Test Game", "Action", 19.99, true);
        String str = game.toString();
        assertTrue(str.contains("Test Game"));
        assertTrue(str.contains("19.99"));
        assertTrue(str.contains("inStock=true"));
    }
}