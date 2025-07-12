import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StoreTest {

    @Test
    public void testAddAndFindGameByTitle() {
        Store store = new Store();
        Game game = new Game("Cyberpunk 2077", "Action", 49.99, true);

        store.addGame(game);
        Game found = store.findGameByTitle("Cyberpunk 2077");

        assertNotNull(found);
        assertEquals("Cyberpunk 2077", found.getTitle());
    }

    @Test
    public void testAddAndFindCustomerByName() {
        Store store = new Store();
        Customer customer = new Customer("Alice", 100.0);

        store.addCustomer(customer);
        Customer found = store.findCustomerByName("Alice");

        assertNotNull(found);
        assertEquals("Alice", found.getName());
    }

    @Test
    public void testSellGameSuccessful() {
        Store store = new Store();
        Game game = new Game("Minecraft", "Sandbox", 29.99, true);
        Customer customer = new Customer("Alice", 100.0);

        store.addGame(game);
        store.addCustomer(customer);
        store.sellGame("Minecraft", "Alice");

        assertTrue(customer.toString().contains("Minecraft"));
        assertFalse(game.isInStock());
    }

}