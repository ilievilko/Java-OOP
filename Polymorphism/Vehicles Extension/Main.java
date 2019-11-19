package vehicles;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Vehicles> vehiclesMap = new HashMap<>();

        String[] inputCar = scanner.nextLine().split("\\s+");
        Vehicles car = new Car(Double.parseDouble(inputCar[1]), Double.parseDouble(inputCar[2]), Double.parseDouble(inputCar[3]));
        vehiclesMap.put("Car", car);

        String[] inputTruck = scanner.nextLine().split("\\s+");
        Vehicles truck = new Truck(Double.parseDouble(inputTruck[1]), Double.parseDouble(inputTruck[2]), Double.parseDouble(inputCar[3]));
        vehiclesMap.put("Truck", truck);

        String[] inputBus = scanner.nextLine().split("\\s+");
        Bus bus = new Bus(Double.parseDouble(inputBus[1]), Double.parseDouble(inputBus[2]), Double.parseDouble(inputCar[3]));
        vehiclesMap.put("Bus", bus);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String type = tokens[1];
            double value = Double.parseDouble(tokens[2]);

            if (command.equals("Drive")){
                vehiclesMap.get(type).drive(value);
            }else if (command.equals("DriveEmpty")) {

                vehiclesMap.get(type).drive(value);
            }else if (command.equals("Refuel")){
                vehiclesMap.get(type).refuel(value);
            }
        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);

    }

}
