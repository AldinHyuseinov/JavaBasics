package Exercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int sec = Integer.parseInt(scanner.nextLine());
        for (int i = first; i <= sec; i++) {
            String current = "" + i;
            int odd = 0;
            int even = 0;
            for (int j = 0; j < current.length(); j++) {
                int digit = Integer.parseInt("" + current.charAt(j));
                if (j % 2 == 0) {
                    even += digit;
                } else {
                    odd += digit;
                }
            }
            if (odd == even) {
                System.out.print(i + " ");
            }
        }
    }
}