package MoreExercises;

import java.util.Scanner;

public class HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double forDay = 0;
        for (int i = 1; i <= days; i++) {
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    sum += 2.50;
                    forDay += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    sum += 1.25;
                    forDay += 1.25;
                } else {
                    sum += 1;
                    forDay += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", i, forDay);
            forDay = 0;
        }
        System.out.printf("Total: %.2f leva", sum);
    }
}