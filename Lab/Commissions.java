package Lab;

import java.util.Scanner;

public class Commissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());
        double sum = 0.0;
        if (city.equals("Sofia")) {
            if (0 <= sells && sells <= 500) {
                sum = sells * 5 / 100;
            } else if (500 < sells && sells <= 1000) {
                sum = sells * 7 / 100;
            } else if (1000 < sells && sells <= 10000) {
                sum = sells * 8 / 100;
            } else if (sells > 10000) {
                sum = sells * 12 / 100;
            } else {
                System.out.println("error");
            }
        } else if (city.equals("Varna")) {
            if (0 <= sells && sells <= 500) {
                sum = sells * 4.5 / 100;
            } else if (500 < sells && sells <= 1000) {
                sum = sells * 7.5 / 100;
            } else if (1000 < sells && sells <= 10000) {
                sum = sells * 10 / 100;
            } else if (sells > 10000) {
                sum = sells * 13 / 100;
            } else {
                System.out.println("error");
            }
        } else if (city.equals("Plovdiv")) {
            if (0 <= sells && sells <= 500) {
                sum = sells * 5.5 / 100;
            } else if (500 < sells && sells <= 1000) {
                sum = sells * 8 / 100;
            } else if (1000 < sells && sells <= 10000) {
                sum = sells * 12 / 100;
            } else if (sells > 10000) {
                sum = sells * 14.5 / 100;
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
        if (sum != 0.0) {
            System.out.printf("%.2f", sum);
        }
    }
}