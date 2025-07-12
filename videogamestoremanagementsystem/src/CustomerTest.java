import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {




    @Test
    public void testPurchaseGameInsufficientFunds() {
        Game game = new Game("Elden Ring", "RPG", 59.99, true);
        Customer customer = new Customer("Bob", 20.0);

        customer.purchaseGame(game);

        assertFalse(customer.toString().contains("Elden Ring"));
        assertTrue(game.isInStock());
    }

    @Test
    public void testPurchaseOutOfStockGame() {
        Game game = new Game("Minecraft", "Sandbox", 29.99, false);
        Customer customer = new Customer("Alice", 100.0);

        customer.purchaseGame(game);

        assertFalse(customer.toString().contains("Minecraft"));
        assertFalse(game.isInStock());
    }

}
