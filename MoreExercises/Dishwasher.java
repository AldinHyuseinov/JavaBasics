package MoreExercises;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottles = Integer.parseInt(scanner.nextLine());
        int amount = bottles * 750;
        String command = scanner.nextLine();
        int pots = 0;
        int used;
        boolean isEnough = true;
        int totalDishes = 0;
        int totalPots = 0;
        while (!command.equals("End")) {
            int dishes = Integer.parseInt(command);
            pots++;
            if (pots % 3 == 0) {
                used = dishes * 15;
                totalPots += dishes;
            } else {
                used = dishes * 5;
                totalDishes += dishes;
            }
            amount -= used;
            if (amount < 0) {
                isEnough = false;
                break;
            }
            command = scanner.nextLine();
        }
        if (isEnough) {
            System.out.println("Detergent was enough!");
            System.out.println(totalDishes + " dishes and " + totalPots + " pots were washed.");
            System.out.println("Leftover detergent " + amount + " ml.");
        } else {
            System.out.println("Not enough detergent, " + Math.abs(amount) + " ml. more necessary!");
        }
    }
}