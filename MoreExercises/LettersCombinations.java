package MoreExercises;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter1 = scanner.next().charAt(0);
        char letter2 = scanner.next().charAt(0);
        char letter3 = scanner.next().charAt(0);
        int count = 0;
        for (char i = letter1; i <= letter2; i++) {
            for (char j = letter1; j <= letter2; j++) {
                for (char k = letter1; k <= letter2; k++) {
                    if (i != letter3 && j != letter3 && k != letter3) {
                        System.out.print("" + i + j + k + " ");
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}