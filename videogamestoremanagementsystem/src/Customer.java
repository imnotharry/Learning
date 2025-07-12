import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private double walletBalance;
    private List<Game> ownedGames;

    public Customer(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
        this.ownedGames = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFunds(double amount) {
        if (amount > 0) {
            walletBalance += amount;
        }
    }

    public void purchaseGame(Game game) {
        if (game == null) {
            System.out.println("Error: Game not found.");
        } else if (!game.isInStock()) {
            System.out.println("Error: Game '" + game.getTitle() + "' is out of stock.");
        } else if (walletBalance < game.getPrice()) {
            System.out.println("Error: Insufficient funds to purchase '" + game.getTitle() + "'.");
        } else {
            walletBalance -= game.getPrice();
            ownedGames.add(game);
            game.setInStock(false);
            System.out.println(name + " successfully purchased '" + game.getTitle() + "'.");
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
               "name='" + name + '\'' +
               ", walletBalance=$" + walletBalance +
               ", ownedGames=" + ownedGames.stream().map(Game::getTitle).toList() +
               '}';
    }
}