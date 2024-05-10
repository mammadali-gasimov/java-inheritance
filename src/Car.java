public class Car extends Vehicle {
    public double fuelCapacity;

    public Car(String brand, String model, double millage, double fuelCapacity) {
        super(brand, model, millage);
        this.fuelCapacity = fuelCapacity;
    }

    public void addFuel(double fuel) {
        if (fuel <= fuelCapacity) {
            System.out.println("Fuel was added!");
        }
    }
}
