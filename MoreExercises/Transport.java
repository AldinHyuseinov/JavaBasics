package MoreExercises;

import java.util.Scanner;

public class Transport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        double taxi = 0.0d;
        double sum = 0.0d;
        if (timeOfDay.equals("day")) {
            taxi = 0.79;
        } else {
            taxi = 0.90;
        }
        if (n < 20) {
            sum = 0.70 + n * taxi;

        } else if (n < 100) {
            sum = n * 0.09;

        } else {
            sum = n * 0.06;
        }
        System.out.printf("%.2f", sum);
    }
}