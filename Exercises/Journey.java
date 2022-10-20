package Exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination;
        String place;
        double sum;
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                place = "Camp";
                sum = budget / 100 * 30;
            } else {
                place = "Hotel";
                sum = budget / 100 * 70;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                place = "Camp";
                sum = budget / 100 * 40;
            } else {
                place = "Hotel";
                sum = budget / 100 * 80;
            }
        } else {
            destination = "Europe";
            place = "Hotel";
            sum = budget / 100 * 90;
        }
        System.out.println("Somewhere in " + destination);
        System.out.printf("%s - %.2f", place, sum);
    }
}
