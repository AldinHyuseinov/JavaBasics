package MoreExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double totalGrapes = x * y;
        double wine = 0.4 * totalGrapes / 2.5;
        if (wine >= z) {
            double left = Math.ceil(wine - z);
            double each = Math.ceil(left / workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters. %n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", left, each);
        } else {
            double need = Math.floor(z - wine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", need);
        }
    }
}