package ExamExercises;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String agreementTime = scanner.nextLine();
        String type = scanner.nextLine();
        String mobileInternet = scanner.nextLine();
        int monthsToPay = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;
        switch (type) {
            case "Small":
                if (agreementTime.equals("one")) {
                    sum = 9.98;
                } else {
                    sum = 8.58;
                }
                if (mobileInternet.equals("yes")) {
                    sum += 5.50;
                }
                break;
            case "Middle":
                if (agreementTime.equals("one")) {
                    sum = 18.99;
                } else {
                    sum = 17.09;
                }
                if (mobileInternet.equals("yes")) {
                    sum += 4.35;
                }
                break;
            case "Large":
                if (agreementTime.equals("one")) {
                    sum = 25.98;
                } else {
                    sum = 23.59;
                }
                if (mobileInternet.equals("yes")) {
                    sum += 4.35;
                }
                break;
            case "ExtraLarge":
                if (agreementTime.equals("one")) {
                    sum = 35.99;
                } else {
                    sum = 31.79;
                }
                if (mobileInternet.equals("yes")) {
                    sum += 3.85;
                }
                break;
        }
        if (agreementTime.equals("two")) {
            sum -= sum * 0.0375;
        }
        System.out.printf("%.2f lv.", sum * monthsToPay);
    }
}