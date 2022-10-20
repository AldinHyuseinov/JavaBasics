package ExamExercises;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player = scanner.nextLine();
        int goalsScored;
        int max = Integer.MIN_VALUE;
        boolean not10 = true;
        String playerDisplayed = null;
        while (!player.equals("END")) {
            goalsScored = Integer.parseInt(scanner.nextLine());
            if (goalsScored >= 10) {
                not10 = false;
                System.out.println(player + " is the best player!");
                System.out.println("He has scored " + goalsScored + " goals and made a hat-trick !!!");
                break;
            }
            if (goalsScored > max) {
                max = goalsScored;
                playerDisplayed = player;
            }
            player = scanner.nextLine();
        }
        if (not10) {
            System.out.println(playerDisplayed + " is the best player!");
            if (max >= 3) {
                System.out.println("He has scored " + max + " goals and made a hat-trick !!!");
            } else {
                System.out.println("He has scored " + max + " goals.");
            }
        }
    }
}