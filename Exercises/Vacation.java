package Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int spendCount = 0;
        int dayCounter = 0;
        while (availableMoney < moneyNeeded && spendCount < 5) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            dayCounter++;
            if (action.equals("spend")) {
                spendCount++;
                availableMoney -= money;
                if (availableMoney < 0) {
                    availableMoney = 0;
                }
            } else {
                spendCount = 0;
                availableMoney += money;
            }
        }
        if (spendCount == 5) {
            System.out.println("You can't save the money.");
            System.out.println(dayCounter);
        }
        if (availableMoney >= moneyNeeded) {
            System.out.printf("You saved the money for %d days.", dayCounter);
        }
    }
}