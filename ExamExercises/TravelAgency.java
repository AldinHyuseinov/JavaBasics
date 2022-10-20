package ExamExercises;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        String pack = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;
        boolean notInvalid = true;
        if (days < 1) {
            notInvalid = false;
            System.out.println("Days must be positive number!");
        }
        switch (city) {
            case "Bansko":
            case "Borovets":
                if (pack.equals("withEquipment")) {
                    sum = 100;
                    if (vip.equals("yes")) {
                        sum -= sum * 0.10;
                    }
                } else if (pack.equals("noEquipment")) {
                    sum = 80;
                    if (vip.equals("yes")) {
                        sum -= sum * 0.05;
                    }
                } else {
                    notInvalid = false;
                    System.out.println("Invalid input!");
                }
                break;
            case "Varna":
            case "Burgas":
                if (pack.equals("withBreakfast")) {
                    sum = 130;
                    if (vip.equals("yes")) {
                        sum -= sum * 0.12;
                    }
                } else if (pack.equals("noBreakfast")) {
                    sum = 100;
                    if (vip.equals("yes")) {
                        sum -= sum * 0.07;
                    }
                } else {
                    notInvalid = false;
                    System.out.println("Invalid input!");
                }
                break;
            default:
                notInvalid = false;
                System.out.println("Invalid input!");
                break;
        }
        if (days > 7) {
            days--;
        }
        double endSum = sum * days;
        if (notInvalid) {
            System.out.printf("The price is %.2flv! Have a nice time!", endSum);
        }
    }
}