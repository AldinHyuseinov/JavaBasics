package ExamExercises;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double neededBread = Math.ceil(guests / 3.00);
        int eggsNeeded = guests * 2;
        double breadPrice = neededBread * 4;
        double eggPrice = eggsNeeded * 0.45;
        double total = breadPrice + eggPrice;
        if (total <= budget) {
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n", neededBread, eggsNeeded);
            System.out.printf("He has %.2f lv. left.", budget - total);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", total - budget);
        }
    }
}