package ExamExercises;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        if (nights > 7) {
            pricePerNight = Math.abs(pricePerNight * 0.05 - pricePerNight);
        }
        double total = nights * pricePerNight;
        double budgetSum = budget * percent / 100;
        double totalSum = total + budgetSum;
        if (totalSum <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalSum);
        } else {
            System.out.printf("%.2f leva needed.", totalSum - budget);
        }
    }
}