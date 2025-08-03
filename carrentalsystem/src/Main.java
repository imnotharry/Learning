public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();

        Car car1 = new Car("ABC-123", 5000, Brand.TRABANT, "601");
        Car car2 = new Car("XYZ-456", 15000, Brand.BMW, "X5");
        Car car3 = new Car("MRC-789", 12000, Brand.MERCEDES, "E220");

        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        rentalSystem.displayAvailableCars();

        System.out.println("\n--- Car rental ---");
        Car carToRent = rentalSystem.findCarByPlateNumber("XYZ-456");
        rentalSystem.rentCar(carToRent, 3);

        System.out.println("\n--- Available cars after renting ---");
        rentalSystem.displayAvailableCars();
    }
}

