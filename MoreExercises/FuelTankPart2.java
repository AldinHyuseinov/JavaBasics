package MoreExercises;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double fuelAmount = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();
        double sum;
        double gasoline = 2.22;
        double diesel = 2.33;
        double gas = 0.93;
        if (clubCard.equals("Yes")) {
            gasoline = 2.04;
            diesel = 2.21;
            gas = 0.85;
        }
        if (fuel.equals("Gas")) {
            sum = fuelAmount * gas;
        } else if (fuel.equals("Gasoline")) {
            sum = fuelAmount * gasoline;
        } else {
            sum = fuelAmount * diesel;
        }
        if (fuelAmount <= 20) {
            sum += 0;
        } else if (fuelAmount > 25) {
            sum = sum - sum * 0.10;
        } else if (fuelAmount <= 25) {
            sum = sum - sum * 0.08;
        }
        System.out.printf("%.2f lv.", sum);
    }
}