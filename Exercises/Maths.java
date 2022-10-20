package Exercises;

import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = Integer.parseInt(scanner.nextLine());
        double n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        String oddOrEven;
        double sum;

        switch (operator) {
            case "+":
                sum = n1 + n2;
                if (sum % 2 == 0) {
                    oddOrEven = "even";
                } else {
                    oddOrEven = "odd";
                }
                System.out.printf("%.0f + %.0f = %.0f - %s", n1, n2, sum, oddOrEven);
                break;
            case "-":
                sum = n1 - n2;
                if (sum % 2 == 0) {
                    oddOrEven = "even";
                } else {
                    oddOrEven = "odd";
                }
                System.out.printf("%.0f - %.0f = %.0f - %s", n1, n2, sum, oddOrEven);
                break;
            case "*":
                sum = n1 * n2;
                if (sum % 2 == 0) {
                    oddOrEven = "even";
                } else {
                    oddOrEven = "odd";
                }
                System.out.printf("%.0f * %.0f = %.0f - %s", n1, n2, sum, oddOrEven);
                break;
            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero", n1);
                } else {
                    sum = n1 / n2;
                    System.out.printf("%.0f / %.0f = %.2f", n1, n2, sum);
                }
                break;
            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero", n1);
                } else {
                    sum = n1 % n2;
                    System.out.println(String.format("%.0f", n1) + " % " + String.format("%.0f", n2) + " = " + String.format("%.0f", sum));
                }
                break;
        }
    }
}