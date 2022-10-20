package MoreExercises;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String track = scanner.nextLine();
        int totalPart = juniors + seniors;
        double juniorsSum = 0.0;
        double seniorsSum = 0.0;
        switch (track) {
            case "trail":
                juniorsSum = juniors * 5.50;
                seniorsSum = seniors * 7;
                break;
            case "cross-country":
                juniorsSum = juniors * 8;
                seniorsSum = seniors * 9.50;
                break;
            case "downhill":
                juniorsSum = juniors * 12.25;
                seniorsSum = seniors * 13.75;
                break;
            case "road":
                juniorsSum = juniors * 20;
                seniorsSum = seniors * 21.50;
                break;
        }
        if (track.equals("cross-country") && (totalPart >= 50)) {
            juniorsSum = juniorsSum - juniorsSum * 0.25;
            seniorsSum = seniorsSum - seniorsSum * 0.25;
        }
        double total = juniorsSum + seniorsSum;
        double left = total * 0.05;
        System.out.printf("%.2f", total - left);
    }
}