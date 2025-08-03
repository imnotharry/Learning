import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Car> availableCars = new ArrayList<>();

    public void addCar(Car car) {
        availableCars.add(car);
    }

    public void displayAvailableCars() {
        if (availableCars.isEmpty()) {
            System.out.println("Not available car.");
            return;
        }
        System.out.println("Available cars:");
        for (Car car : availableCars) {
            System.out.println("---------------");
            car.displayInfo();
        }
    }

    public Car findCarByPlateNumber(String plateNumber) {
        for (Car car : availableCars) {
            if (car.getPlateNumber().equalsIgnoreCase(plateNumber)) {
                return car;
            }
        }
        return null;
    }

    public void rentCar(Car car, int days) {
        if (car == null) {
            System.out.println("The car is not available.");
            return;
        }

        double cost = car.calculateRentalCost(days);
        System.out.println("The " + car.getPlateNumber() + " plate numbered car's rent " + days + " for a day: " + cost + " Ft");

        availableCars.remove(car);
    }
}

