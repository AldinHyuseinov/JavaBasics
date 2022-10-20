package MoreExercises;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String classCar;
        String type = "IDK";
        double price = 0.0;
        if (budget <= 100) {
            classCar = "Economy class";
            if (season.equals("Summer")) {
                type = "Cabrio";
                price = budget * 0.35;
            } else {
                type = "Jeep";
                price = budget * 0.65;
            }
        } else if ((budget > 100) && (budget <= 500)) {
            classCar = "Compact class";
            if (season.equals("Summer")) {
                type = "Cabrio";
                price = budget * 0.45;
            } else {
                type = "Jeep";
                price = budget * 0.80;
            }
        } else {
            classCar = "Luxury class";
            if ((season.equals("Summer")) || (season.equals("Winter"))) {
                type = "Jeep";
                price = budget * 0.90;
            }
        }
        System.out.println(classCar);
        System.out.printf("%s - %.2f", type, price);
    }
}