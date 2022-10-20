package ActualExam;

import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatsPer = Integer.parseInt(scanner.nextLine());
        int proteinPer = Integer.parseInt(scanner.nextLine());
        int carbsPer = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());
        int waterPer = Integer.parseInt(scanner.nextLine());
        double totalGramsFat = calories * fatsPer / 100.00 / 9;
        double totalProteinGrams = calories * proteinPer / 100.00 / 4;
        double totalCarbsGrams = calories * carbsPer / 100.00 / 4;
        double food = totalGramsFat + totalProteinGrams + totalCarbsGrams;
        double gramFood = calories / food;
        int water = 100 - waterPer;
        double calories1Gram = gramFood * water / 100;
        System.out.printf("%.4f", calories1Gram);
    }
}