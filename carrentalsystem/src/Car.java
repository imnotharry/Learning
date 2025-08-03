public class Car extends Vehicle {
    private Brand brand;
    private String model;

    public Car(String plateNumber, double rentPrice, Brand brand, String model) {
        super(plateNumber, rentPrice);
        this.brand = brand;
        this.model = model;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Plate number: " + getPlateNumber());
        System.out.println("Rent price / day: " + getRentPrice() + " Ft");
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentPrice() * days;
    }
}

