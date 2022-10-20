package ExamExercises;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        String date = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;
        switch (destination) {
            case "France":
                if (date.equals("21-23")) {
                    sum = 30;
                } else if (date.equals("24-27")) {
                    sum = 35;
                } else {
                    sum = 40;
                }
                break;
            case "Italy":
                if (date.equals("21-23")) {
                    sum = 28;
                } else if (date.equals("24-27")) {
                    sum = 32;
                } else {
                    sum = 39;
                }
                break;
            case "Germany":
                if (date.equals("21-23")) {
                    sum = 32;
                } else if (date.equals("24-27")) {
                    sum = 37;
                } else {
                    sum = 43;
                }
                break;
        }
        sum *= nights;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, sum);
    }
}