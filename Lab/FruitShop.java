package Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double sum;
        switch (fruit) {
            case "banana":
                sum = amount * 2.50;
                if (day.equals("Saturday") || day.equals("Sunday")) {
                    sum = amount * 2.70;
                }
                System.out.printf("%.2f", sum);
                break;
            case "apple":
                if (day.equals("Workday")) {
                    System.out.println("error");
                } else if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
                    sum = amount * 1.20;
                    System.out.printf("%.2f", sum);
                }
                if (day.equals("Saturday") || day.equals("Sunday")) {
                    sum = amount * 1.25;
                    System.out.printf("%.2f", sum);
                }
                break;
            case "orange":
                sum = amount * 0.85;
                if (day.equals("Saturday") || day.equals("Sunday")) {
                    sum = amount * 0.90;
                }
                System.out.printf("%.2f", sum);
                break;
            case "grapefruit":
                sum = amount * 1.45;
                if (day.equals("Saturday") || day.equals("Sunday")) {
                    sum = amount * 1.60;
                }
                System.out.printf("%.2f", sum);
                break;
            case "kiwi":
                sum = amount * 2.70;
                if (day.equals("Saturday") || day.equals("Sunday")) {
                    sum = amount * 3.00;
                }
                System.out.printf("%.2f", sum);
                break;
            case "pineapple":
                sum = amount * 5.50;
                if (day.equals("Saturday") || day.equals("Sunday")) {
                    sum = amount * 5.60;
                }
                System.out.printf("%.2f", sum);
                break;
            case "grapes":
                sum = amount * 3.85;
                if (day.equals("Saturday") || day.equals("Sunday")) {
                    sum = amount * 4.20;
                }
                System.out.printf("%.2f", sum);
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}