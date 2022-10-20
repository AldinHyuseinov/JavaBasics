package MoreExercises;

import java.util.Scanner;

public class PassGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());
        int count = 0;
        char i = 35;
        char j = 64;
        for (int k = 1; k <= a; k++) {
            for (int l = 1; l <= b; l++) {
                count++;
                if (count <= max) {
                    System.out.printf("%c%c%d%d%c%c|", i, j, k, l, j, i);
                    i++;
                    j++;
                }
                if (i > 55) {
                    i = 35;
                }
                if (j > 96) {
                    j = 64;
                }
            }
        }
    }
}