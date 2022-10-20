package MoreExercises;

import java.util.Scanner;

public class Flowers02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f1 = Integer.parseInt(scanner.nextLine());
        int f2 = Integer.parseInt(scanner.nextLine());
        int f3 = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String isHoliday = scanner.nextLine();
        int totalFlowers = f1 + f2 + f3;
        double flowerPrice = 0.0;
        switch (season) {
            case "Spring":
            case "Summer":
                flowerPrice = f1 * 2 + f2 * 4.10 + f3 * 2.50;
                break;
            case "Autumn":
            case "Winter":
                flowerPrice = f1 * 3.75 + f2 * 4.50 + f3 * 4.15;
                break;
        }
        if (isHoliday.equals("Y")) {
            flowerPrice = flowerPrice + flowerPrice * 0.15;
        }
        if (season.equals("Spring") && (f3 > 7)) {
            flowerPrice = flowerPrice - flowerPrice * 0.05;
        } else if (season.equals("Winter") && (f2 >= 10)) {
            flowerPrice = flowerPrice - flowerPrice * 0.10;
        }
        if (totalFlowers > 20) {
            flowerPrice = flowerPrice - flowerPrice * 0.20;
        }
        System.out.printf("%.2f", flowerPrice + 2);
    }
}