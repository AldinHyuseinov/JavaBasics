package MoreExercises;

import java.util.Scanner;

public class BackToPast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        int old = 18;
        for (int i = 1800; i <= year; i++, old++) {
            if (i % 2 == 0) {
                money -= 12000;
            } else {
                money -= 12000 + old * 50;
            }
        }
        if (money >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }
    }
}