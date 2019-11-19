package vehicles;

import java.text.DecimalFormat;

public abstract class VehiclesImpl implements Vehicles {
    private static final DecimalFormat format = new DecimalFormat("#.##");
    private double fuelQuantity;
    private double fuelConsumption;
    private final double tankCapacity;

    protected VehiclesImpl(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    public void drive(double distance) {
        if (canDrive(distance)) {
            this.fuelQuantity -= this.fuelConsumption * distance;
            System.out.println(String.format("travelled %s km", format.format(distance)));
        } else {
            System.out.println("needs refueling");
        }
    }

    void addFuelConsumption(double addFuelConsumption) {
        this.fuelConsumption += addFuelConsumption;
    }

    private boolean canDrive(double distance) {
        return this.fuelQuantity >= this.fuelConsumption * distance;
    }

    public void refuel(double liters) {
        if (liters <= 0) {
            System.out.println("Fuel must be a positive number");
            return;
        }
        if (liters > this.tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
            return;
        }
        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format("%.2f", this.fuelQuantity);
    }
}
