package ExamExercises;

import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player1Eggs = Integer.parseInt(scanner.nextLine());
        int player2Eggs = Integer.parseInt(scanner.nextLine());
        String winner = scanner.nextLine();
        boolean withEggs = true;
        while (!winner.equals("End of battle")) {
            if (winner.equals("one")) {
                player2Eggs--;
            } else {
                player1Eggs--;
            }
            if (player1Eggs < 1) {
                withEggs = false;
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", player2Eggs);
                break;
            } else if (player2Eggs < 1) {
                withEggs = false;
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", player1Eggs);
                break;
            }
            winner = scanner.nextLine();
        }
        if (withEggs) {
            System.out.printf("Player one has %d eggs left.%n", player1Eggs);
            System.out.printf("Player two has %d eggs left.", player2Eggs);
        }
    }
}