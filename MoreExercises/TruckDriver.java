package MoreExercises;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());
        double sum;
        if (km <= 5000) {
            if ((season.equals("Spring")) || (season.equals("Autumn"))) {
                sum = km * 0.75;
            } else if (season.equals("Summer")) {
                sum = km * 0.90;
            } else {
                sum = km * 1.05;
            }
        } else if ((500 < km) && (km <= 10000)) {
            if ((season.equals("Spring")) || (season.equals("Autumn"))) {
                sum = km * 0.95;
            } else if (season.equals("Summer")) {
                sum = km * 1.10;
            } else {
                sum = km * 1.25;
            }
        } else {
            sum = km * 1.45;
        }
        double tax = sum - sum * 0.10;
        System.out.printf("%.2f", tax * 4);
    }
}