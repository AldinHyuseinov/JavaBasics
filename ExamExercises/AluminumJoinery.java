package ExamExercises;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();
        double sum = 0.0;
        boolean valid = true;
        if (amount <= 10) {
            valid = false;
            System.out.println("Invalid order");
        }
        switch (type) {
            case "90X130":
                sum = amount * 110;
                if (amount >= 30 && amount <= 60) {
                    sum -= sum * 0.05;
                }
                if (amount > 60) {
                    sum -= sum * 0.08;
                }
                break;
            case "100X150":
                sum = amount * 140;
                if (amount >= 40 && amount <= 80) {
                    sum -= sum * 0.06;
                }
                if (amount > 80) {
                    sum -= sum * 0.10;
                }
                break;
            case "130X180":
                sum = amount * 190;
                if (amount >= 20 && amount <= 50) {
                    sum -= sum * 0.07;
                }
                if (amount > 50) {
                    sum -= sum * 0.12;
                }
                break;
            case "200X300":
                sum = amount * 250;
                if (amount >= 25 && amount <= 50) {
                    sum -= sum * 0.09;
                }
                if (amount > 50) {
                    sum -= sum * 0.14;
                }
                break;
        }
        if (delivery.equals("With delivery")) {
            sum += 60;
        }
        if (amount >= 99) {
            sum -= sum * 0.04;
        }
        if (valid) {
            System.out.printf("%.2f BGN", sum);
        }
    }
}