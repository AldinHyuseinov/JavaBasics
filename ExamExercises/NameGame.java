package ExamExercises;

import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int points = 0;
        int max = Integer.MIN_VALUE;
        String winner = null;
        while (!name.equals("Stop")) {
            int n = name.length();
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(scanner.nextLine());
                int letterPoints = name.charAt(i);
                if (letterPoints == num) {
                    points += 10;
                } else {
                    points += 2;
                }
            }
            if (points >= max) {
                max = points;
                winner = name;
            }
            points = 0;
            name = scanner.nextLine();
        }
        System.out.println("The winner is " + winner + " with " + max + " points!");
    }
}