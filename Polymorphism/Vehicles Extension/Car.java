package vehicles;

public class Car extends VehiclesImpl {
    public static final double EXTRA_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + EXTRA_CONSUMPTION, tankCapacity);
    }

    @Override
    public void drive(double distance) {
        System.out.print("Car ");
        super.drive(distance);
    }

    @Override
    public String toString() {
        return "Car: " + super.toString();
    }
}
