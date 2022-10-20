package ExamExercises;

import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        switch (size) {
            case "Large":
                if (color.equals("Red")) {
                    sum = 16;
                } else if (color.equals("Green")) {
                    sum = 12;
                } else {
                    sum = 9;
                }
                break;
            case "Medium":
                if (color.equals("Red")) {
                    sum = 13;
                } else if (color.equals("Green")) {
                    sum = 9;
                } else {
                    sum = 7;
                }
                break;
            case "Small":
                if (color.equals("Red")) {
                    sum = 9;
                } else if (color.equals("Green")) {
                    sum = 8;
                } else {
                    sum = 5;
                }
                break;
        }
        sum *= amount;
        double bills = sum * 35 / 100.00;
        System.out.printf("%.2f leva.", sum - bills);
    }
}