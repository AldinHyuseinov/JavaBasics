package ExamExercises;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int points = 0;
        String winner = "";
        for (int i = 1; i <= amount; i++) {
            String baker = scanner.nextLine();
            String command = scanner.nextLine();
            while (!command.equals("Stop")) {
                int grade = Integer.parseInt(command);
                points += grade;
                command = scanner.nextLine();
            }
            System.out.println(baker + " has " + points + " points.");
            if (points > max) {
                winner = baker;
                max = points;
                System.out.println(baker + " is the new number 1!");
            }
            points = 0;
        }
        System.out.println(winner + " won competition with " + max + " points!");
    }
}