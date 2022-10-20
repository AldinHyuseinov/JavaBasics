package ExamExercises;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double total = 0.0;
        int buy = 0;
        String item = scanner.nextLine();
        boolean isStop = true;
        while (!item.equals("Stop")) {
            double itemPrice = Double.parseDouble(scanner.nextLine());
            buy++;
            if (buy % 3 == 0) {
                itemPrice /= 2;
            }
            if (budget >= itemPrice) {
                budget -= itemPrice;
                total += itemPrice;
            } else {
                isStop = false;
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", Math.abs(itemPrice - budget));
                break;
            }
            item = scanner.nextLine();
        }
        if (isStop) {
            System.out.printf("You bought %d products for %.2f leva.", buy, total);
        }
    }
}