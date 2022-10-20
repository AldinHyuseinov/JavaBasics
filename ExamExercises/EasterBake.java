package ExamExercises;

import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bread = Integer.parseInt(scanner.nextLine());
        int neededSugar = 0;
        int neededFlour = 0;
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 1; i <= bread; i++) {
            int sugarGrams = Integer.parseInt(scanner.nextLine());
            int flourGrams = Integer.parseInt(scanner.nextLine());
            neededSugar += sugarGrams;
            neededFlour += flourGrams;
            if (flourGrams > max) {
                max = flourGrams;
            }
            if (sugarGrams > max2) {
                max2 = sugarGrams;
            }
        }
        double packetsSugar = Math.ceil(neededSugar / 950.00);
        double packetsFlour = Math.ceil(neededFlour / 750.00);
        System.out.printf("Sugar: %.0f%n", packetsSugar);
        System.out.printf("Flour: %.0f%n", packetsFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", max, max2);
    }
}