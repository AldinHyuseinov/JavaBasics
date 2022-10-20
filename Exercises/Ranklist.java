package Exercises;

import java.util.Scanner;

public class Ranklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tourneys = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        int pointsAfter = 0;
        double w = 0.0;
        for (int i = 1; i <= tourneys; i++) {
            String stage = scanner.nextLine();
            switch (stage) {
                case "W":
                    points += 2000;
                    pointsAfter += 2000;
                    w++;
                    break;
                case "F":
                    points += 1200;
                    pointsAfter += 1200;
                    break;
                case "SF":
                    points += 720;
                    pointsAfter += 720;
                    break;
            }
        }
        int average = pointsAfter / tourneys;
        double wonTourneys = (w / tourneys) * 100;
        System.out.println("Final points: " + points);
        System.out.printf("Average points: %.0f%n", Math.floor(average));
        System.out.printf("%.2f%%", wonTourneys);
    }
}