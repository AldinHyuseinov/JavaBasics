package ExamExercises;

import java.util.Scanner;

public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int sum = 0;
        boolean vowel = true;
        int max = Integer.MIN_VALUE;
        String powerfulWord = "";
        while (!word.equals("End of words")) {
            int length = word.length();
            for (int i = 0; i < length; i++) {
                int letter = word.charAt(i);
                sum += letter;
            }
            switch (word.charAt(0)) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                case 'y':
                case 'Y':
                    vowel = false;
                    sum *= length;
                    break;
            }
            if (vowel) {
                sum /= Math.floor(length);
            }
            if (sum > max) {
                max = sum;
                powerfulWord = word;
            }
            sum = 0;
            word = scanner.nextLine();
        }
        System.out.printf("The most powerful weapon is %s - %d", powerfulWord, max);
    }
}