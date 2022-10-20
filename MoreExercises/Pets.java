package MoreExercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtleFood = Double.parseDouble(scanner.nextLine());
        double neededFoodDog = days * dogFood;
        double neededFoodCat = days * catFood;
        double neededFoodTurtle = days * turtleFood / 1000;
        double total = neededFoodDog + neededFoodCat + neededFoodTurtle;
        if (total <= foodLeft) {
            double left = Math.floor(foodLeft - total);
            System.out.printf("%.0f kilos of food left.", left);
        } else {
            double left = Math.ceil(total - foodLeft);
            System.out.printf("%.0f more kilos of food are needed.", left);
        }
    }
}