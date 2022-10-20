package MoreExercises;

import java.util.Scanner;

public class GameIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int turn = Integer.parseInt(scanner.nextLine());
        int numbers;
        double points = 0.0;
        double from1 = 0.0;
        double from2 = 0.0;
        double from3 = 0.0;
        double from4 = 0.0;
        double from5 = 0.0;
        double invalid = 0.0;
        for (int i = 1; i <= turn; i++) {
            numbers = Integer.parseInt(scanner.nextLine());
            if (numbers >= 0 && numbers <= 9) {
                points += 0.20 * numbers;
                from1++;
            } else if (numbers >= 10 && numbers <= 19) {
                points += 0.30 * numbers;
                from2++;
            } else if (numbers >= 20 && numbers <= 29) {
                points += 0.40 * numbers;
                from3++;
            } else if (numbers >= 30 && numbers <= 39) {
                points += 50;
                from4++;
            } else if (numbers >= 40 && numbers <= 50) {
                points += 100;
                from5++;
            } else {
                points /= 2;
                invalid++;
            }
        }
        double per1 = 100 * from1 / turn;
        double per2 = 100 * from2 / turn;
        double per3 = 100 * from3 / turn;
        double per4 = 100 * from4 / turn;
        double per5 = 100 * from5 / turn;
        double per6 = 100 * invalid / turn;
        System.out.printf("%.2f%n", points);
        System.out.printf("From 0 to 9: %.2f%%%n", per1);
        System.out.printf("From 10 to 19: %.2f%%%n", per2);
        System.out.printf("From 20 to 29: %.2f%%%n", per3);
        System.out.printf("From 30 to 39: %.2f%%%n", per4);
        System.out.printf("From 40 to 50: %.2f%%%n", per5);
        System.out.printf("Invalid numbers: %.2f%%%n", per6);
    }
}