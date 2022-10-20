package Exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        switch (season) {
            case "Spring":
                price = 3000.0;
                break;
            case "Summer":
            case "Autumn":
                price = 4200.0;
                break;
            case "Winter":
                price = 2600.0;
                break;
        }
        if (fishermen <= 6) {
            price = price - (0.1 * price);
        } else if (fishermen > 7 && fishermen <= 11) {
            price = price - (0.15 * price);
        } else if (fishermen > 12) {
            price = price - (0.25 * price);
        }
        if (fishermen % 2 == 0 && !(season.equals("Autumn"))) {
            price *= 0.95;
        }
        double result = budget - price;
        if (result >= 0) {
            System.out.printf("Yes! You have %.2f leva left.", result);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", -result);
        }
    }
}