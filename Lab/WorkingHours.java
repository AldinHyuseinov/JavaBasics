package Lab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String week = scanner.nextLine();
        switch (week) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (hour <= 18 && hour >= 10) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
                break;
            default:
                System.out.println("closed");
                break;
        }
    }
}