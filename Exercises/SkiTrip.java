package Exercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String grade = scanner.nextLine();
        int nights = days - 1;
        double sum = 0.0;
        switch (room) {
            case "room for one person":
                sum = nights * 18;
                break;
            case "apartment":
                sum = nights * 25;
                if (nights < 10) {
                    sum = sum - sum * 0.30;
                } else if (10 < nights && nights < 15) {
                    sum = sum - sum * 0.35;
                } else {
                    sum = sum - sum * 0.50;
                }
                break;
            case "president apartment":
                sum = nights * 35;
                if (nights < 10) {
                    sum = sum - sum * 0.10;
                } else if (10 < nights && nights < 15) {
                    sum = sum - sum * 0.15;
                } else {
                    sum = sum - sum * 0.20;
                }
                break;
        }
        if (grade.equals("positive")) {
            sum = sum + sum * 0.25;
        } else {
            sum = sum - sum * 0.10;
        }
        System.out.printf("%.2f", sum);
    }
}