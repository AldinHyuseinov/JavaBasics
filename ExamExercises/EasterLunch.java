package ExamExercises;

import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bread = Integer.parseInt(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int cookiesKg = Integer.parseInt(scanner.nextLine());
        double breadPrice = bread * 3.20;
        double eggPrice = eggs * 4.35;
        double cookiesPrice = cookiesKg * 5.40;
        double paintPrice = eggs * 12 * 0.15;
        double total = breadPrice + eggPrice + cookiesPrice + paintPrice;
        System.out.printf("%.2f", total);
    }
}