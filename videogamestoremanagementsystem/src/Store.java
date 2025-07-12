import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Game> availableGames;
    private List<Customer> registeredCustomers;

    public Store() {
        availableGames = new ArrayList<>();
        registeredCustomers = new ArrayList<>();
    }

    public void addGame(Game game) {
        availableGames.add(game);
    }

    public void addCustomer(Customer customer) {
        registeredCustomers.add(customer);
    }

    public void listAvailableGames() {
        System.out.println("Available Games:");
        for (Game game : availableGames) {
            if (game.isInStock()) {
                System.out.println(game);
            }
        }
    }

    public void listCustomers() {
        System.out.println("Registered Customers:");
        for (Customer customer : registeredCustomers) {
            System.out.println(customer);
        }
    }

    public Game findGameByTitle(String title) {
        for (Game game : availableGames) {
            if (game.getTitle().equalsIgnoreCase(title)) {
                return game;
            }
        }
        return null;
    }

    public Customer findCustomerByName(String name) {
        for (Customer customer : registeredCustomers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;
    }

    public void sellGame(String gameTitle, String customerName) {
        Game game = findGameByTitle(gameTitle);
        Customer customer = findCustomerByName(customerName);

        if (customer == null) {
            System.out.println("Error: Customer not found.");
            return;
        }

        customer.purchaseGame(game);
    }
}
