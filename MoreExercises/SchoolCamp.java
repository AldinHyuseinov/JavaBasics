package MoreExercises;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int overnight = Integer.parseInt(scanner.nextLine());
        String sports = "";
        double sum = 0.0;

        switch (season) {
            case "Winter":
                if (group.equals("girls")) {
                    sum = students * 9.60;
                    sports = "Gymnastics";
                } else if (group.equals("boys")) {
                    sum = students * 9.60;
                    sports = "Judo";
                } else {
                    sum = students * 10;
                    sports = "Ski";
                }
                break;
            case "Spring":
                if (group.equals("girls")) {
                    sum = students * 7.20;
                    sports = "Athletics";
                } else if (group.equals("boys")) {
                    sum = students * 7.20;
                    sports = "Tennis";
                } else {
                    sum = students * 9.50;
                    sports = "Cycling";
                }
                break;
            case "Summer":
                if (group.equals("girls")) {
                    sum = students * 15;
                    sports = "Volleyball";
                } else if (group.equals("boys")) {
                    sum = students * 15;
                    sports = "Football";
                } else {
                    sum = students * 20;
                    sports = "Swimming";
                }
                break;
        }
        if (students > 50) {
            sum = sum - sum * 0.50;
        } else if ((students >= 20) && (students < 50)) {
            sum = sum - sum * 0.15;
        } else if ((students >= 10) && (students <= 20)) {
            sum = sum - sum * 0.05;
        } else {
            sum += 0;
        }
        System.out.printf("%s %.2f lv.", sports, sum * overnight);
    }
}