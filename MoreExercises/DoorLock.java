package MoreExercises;

import java.util.Scanner;

public class DoorLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int sec = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= first; i++) {
            if (i % 2 == 0) {

            } else continue;
            for (int j = 1; j <= sec; j++) {
                if (j == 1 || j == 4 || j == 6) {
                    continue;
                }
                for (int k = 1; k <= third; k++) {
                    if (k % 2 == 0) {
                        if (j == 2 || j == 3 || j == 5 || j == 7) {
                            System.out.printf("%d %d %d%n", i, j, k);
                        }
                    }
                }
            }
        }
    }
}