package Exercises;

import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());
        int hours = examHour * 60 + examMinutes;
        int hours2 = arriveHour * 60 + arriveMinutes;
        int difference = hours - hours2;
        if (difference > 30) {
            System.out.println("Early");

            if (difference > 59) {
                int hour3 = difference / 60;
                int minutes = difference % 60;
                System.out.printf("%d:%02d hours before the start", hour3, minutes);
            } else {
                System.out.printf("%d minutes before the start", difference);
            }
        } else if (difference < 0) {
            System.out.println("Late");
            int minsLate = Math.abs(difference);
            if (minsLate > 59) {
                int hour4 = minsLate / 60;
                int mins = minsLate % 60;
                System.out.printf("%d:%02d hours after the start", hour4, mins);
            } else {
                System.out.printf("%d minutes after the start", minsLate);
            }
        } else {
            System.out.println("On time");
            if (difference > 0) {
                System.out.printf("%d minutes before the start", difference);
            }
        }
    }
}