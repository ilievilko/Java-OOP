package vehicles;

import java.text.DecimalFormat;

public abstract class VehiclesImpl implements Vehicles {
    private static final DecimalFormat format = new DecimalFormat("#.##");
    private double fuelQuantity;
    private double fuelConsumption;

    protected VehiclesImpl(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public void drive(double distance) {
        if (canDrive(distance)){
            this.fuelQuantity -= this.fuelConsumption * distance;
            System.out.println(String.format("travelled %s km", format.format(distance)));
        }else {
            System.out.println("needs refueling");
        }
    }

    private boolean canDrive(double distance) {
        return this.fuelQuantity >= this.fuelConsumption * distance;
    }

    public void refuel(double liters) {
        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format("%.2f", this.fuelQuantity);
    }
}
