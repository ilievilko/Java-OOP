package foodshortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Buyer> buyers = new ArrayList<>();

        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        while (numberOfPeople-- > 0) {

            String[] information = scanner.nextLine().split("\\s+");

            if (information.length == 4) {
                Citizen citizen = new Citizen(information[0],
                        Integer.parseInt(information[1]), information[2], information[3]);
                buyers.add(citizen);

            } else if (information.length == 3) {
                Rebel rebel = new Rebel(information[0], Integer.parseInt(information[1]), information[2]);
                buyers.add(rebel);
            }
        }

        String namesOfPeople = scanner.nextLine();
        while (!namesOfPeople.equals("End")) {
            for (Buyer buyer : buyers) {
                if (buyer.getName().equals(namesOfPeople)) {
                    buyer.buyFood();
                }
            }

            namesOfPeople = scanner.nextLine();
        }

        int totalFood = 0;
        for (Buyer buyer : buyers) {
            totalFood += buyer.getFood();
        }

        System.out.println(totalFood);

    }
}
