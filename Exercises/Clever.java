package Exercises;

import java.util.Scanner;

public class Clever {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        int money = 0;
        int brother = 0;
        int savedCash = 0;
        int soldToys = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                brother++;
                money += 10;
                savedCash += money;
            } else {
                int toy = 0;
                toy++;
                soldToys += toy * priceToy;
            }
        }
        double total = savedCash + soldToys - brother;
        if (total >= priceWashingMachine) {
            total -= priceWashingMachine;
            System.out.printf("Yes! %.2f", total);
        } else {
            priceWashingMachine -= total;
            System.out.printf("No! %.2f", priceWashingMachine);
        }
    }
}