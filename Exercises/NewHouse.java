package Exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        int amountOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double total = 0.0;
        switch (flowerType) {
            case "Roses":
                total = amountOfFlowers * 5;
                if (amountOfFlowers > 80) {
                    total = total - total * 0.10;
                }
                break;
            case "Dahlias":
                total = amountOfFlowers * 3.80;
                if (amountOfFlowers > 90) {
                    total = total - total * 0.15;
                }
                break;
            case "Tulips":
                total = amountOfFlowers * 2.80;
                if (amountOfFlowers > 80) {
                    total = total - total * 0.15;
                }
                break;
            case "Narcissus":
                total = amountOfFlowers * 3;
                if (amountOfFlowers < 120) {
                    total = total + total * 0.15;
                }
                break;
            case "Gladiolus":
                total = amountOfFlowers * 2.50;
                if (amountOfFlowers < 80) {
                    total = total + total * 0.20;
                }
                break;
        }
        if (total > budget) {
            System.out.printf("Not enough money, you need %.2f leva more.", total - budget);
        } else {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amountOfFlowers, flowerType, budget - total);
        }
    }
}