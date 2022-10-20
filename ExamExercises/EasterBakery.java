package ExamExercises;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int yeast = Integer.parseInt(scanner.nextLine());
        double sugarPrice = flourPrice * 0.75;
        double eggPrice = flourPrice * 1.1;
        double yeastPrice = sugarPrice * 0.2;
        double flourSum = flourPrice * flourKg;
        double sugarSum = sugarPrice * sugarKg;
        double eggSum = eggPrice * eggs;
        double yeastSum = yeastPrice * yeast;
        double total = flourSum + sugarSum + eggSum + yeastSum;
        System.out.printf("%.2f", total);
    }
}