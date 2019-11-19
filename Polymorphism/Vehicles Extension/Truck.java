package vehicles;

public class Truck extends VehiclesImpl {
    public static final double EXTRA_CONSUMPTION = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + EXTRA_CONSUMPTION, tankCapacity);
    }

    @Override
    public void drive(double distance) {
        System.out.print("Truck ");
        super.drive(distance);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * 0.95);
    }

    @Override
    public String toString() {
        return "Truck: " + super.toString();
    }
}
