package MoreExercises;

import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        int total1 = i + j;
                        int total2 = k + l;
                        if (total1 == total2) {
                            if (n % total1 == 0 && n % total2 == 0) {
                                System.out.print("" + i + j + k + l + " ");
                            }
                        }
                    }
                }
            }
        }
    }
}