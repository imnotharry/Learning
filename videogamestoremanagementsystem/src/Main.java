public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addGame(new Game("Elden Ring", "RPG", 59.99, true));
        store.addGame(new Game("Minecraft", "Sandbox", 29.99, true));
        store.addGame(new Game("Cyberpunk 2077", "Action", 49.99, true));
        Customer alice = new Customer("Alice", 100.00);
        Customer bob = new Customer("Bob", 20.00);
        store.addCustomer(alice);
        store.addCustomer(bob);
        store.listAvailableGames();
        store.sellGame("Minecraft", "Alice");
        store.sellGame("Elden Ring", "Bob");
        store.sellGame("Minecraft", "Bob");
        store.sellGame("Unknown Game", "Alice");
        store.listCustomers();
    }
}
