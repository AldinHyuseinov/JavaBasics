package MoreExercises;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        for (int num1 = 2; num1 <= a; num1 += 2) {
            for (int num2 = 2; num2 <= b; num2++) {
                for (int num3 = 2; num3 <= c; num3 += 2) {
                    if (num2 != 4 && num2 != 6) {
                        System.out.printf("%d %d %d%n", num1, num2, num3);
                    }
                }
            }
        }
    }
}