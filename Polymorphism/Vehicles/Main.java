package vehicles;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Vehicles> vehiclesMap = new HashMap<>();

        String[] inputCar = scanner.nextLine().split("\\s+");
        Vehicles car = new Car(Double.parseDouble(inputCar[1]), Double.parseDouble(inputCar[2]));
        vehiclesMap.put("Car", car);

        String[] inputTruck = scanner.nextLine().split("\\s+");
        Vehicles truck = new Truck(Double.parseDouble(inputTruck[1]), Double.parseDouble(inputTruck[2]));
        vehiclesMap.put("Truck", truck);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String type = tokens[1];
            double value = Double.parseDouble(tokens[2]);

            if (command.equals("Drive")){
                vehiclesMap.get(type).drive(value);
            }else if (command.equals("Refuel")){
                vehiclesMap.get(type).refuel(value);
            }
        }
        for (Map.Entry<String, Vehicles> entry : vehiclesMap.entrySet()) {
            System.out.println(entry.getValue());
        }


    }

}
