package ExamExercises;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String team = scanner.nextLine();
        int games = Integer.parseInt(scanner.nextLine());
        if (games < 1) {
            System.out.printf("%s hasn't played any games during this season.", team);
            return;
        }
        int points = 0;
        int wins = 0;
        int draws = 0;
        int losses = 0;
        for (int i = 1; i <= games; i++) {
            String result = scanner.nextLine();
            switch (result) {
                case "W":
                    wins++;
                    points += 3;
                    break;
                case "D":
                    draws++;
                    points += 1;
                    break;
                case "L":
                    losses++;
                    points += 0;
                    break;
            }
        }
        double winRate = wins * 100.00 / games;
        System.out.printf("%s has won %d points during this season.%n", team, points);
        System.out.println("Total stats:");
        System.out.println("## W: " + wins);
        System.out.println("## D: " + draws);
        System.out.println("## L: " + losses);
        System.out.printf("Win rate: %.2f%%", winRate);
    }
}