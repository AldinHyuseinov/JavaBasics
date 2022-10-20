package MoreExercises;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double electricityBill;
        double water = months * 20;
        double internet = months * 15;
        double totalPowerBill = 0.0;
        double total = 0.0;
        for (int i = 1; i <= months; i++) {
            electricityBill = Double.parseDouble(scanner.nextLine());
            totalPowerBill += electricityBill;
            double others = 0.0;
            others += electricityBill + 20 + 15;
            double percent = 0.0;
            percent += others + others * 0.20;
            total += percent;
        }
        double average = (totalPowerBill + water + internet + total) / months;
        System.out.printf("Electricity: %.2f lv%n", totalPowerBill);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", total);
        System.out.printf("Average: %.2f lv%n", average);
    }
}