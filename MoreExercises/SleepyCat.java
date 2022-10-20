package MoreExercises;

import java.util.Scanner;

public class SleepyCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int offDay = Integer.parseInt(scanner.nextLine());
        int offDaySum = offDay * 127;
        int workDay = (365 - offDay) * 63;
        int total = offDaySum + workDay;
        if (30000 > total) {
            int minutes = 30000 - total;
            int hour = minutes / 60;
            int min = minutes % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hour, min);
        } else {
            int minutes = 30000 - total;
            int hour = Math.abs(minutes / 60);
            int min = Math.abs(minutes % 60);
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hour, min);
        }
    }
}
