package vehicles;

public class Bus extends VehiclesImpl {
    private static final double EXTRA_CONSUMPTION = 1.4;
    private boolean occupied;

    protected Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.occupied = true;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    @Override
    public void drive(double distance) {
        if (this.occupied){
            super.addFuelConsumption(EXTRA_CONSUMPTION);
        }
        System.out.print("Bus ");
        super.drive(distance);
        setOccupied(false);
    }


    @Override
    public String toString() {
        return "Bus: " + super.toString();
    }
}
