package MoreExercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = Integer.parseInt(scanner.nextLine());
        double sum;
        double sumPerTonne = 0.0;
        int tonnes;
        int totalTonnes = 0;
        double bus = 0.0;
        double truck = 0.0;
        double train = 0.0;
        for (int i = 1; i <= amount; i++) {
            tonnes = Integer.parseInt(scanner.nextLine());
            totalTonnes += tonnes;
            if (tonnes <= 3) {
                sumPerTonne += tonnes * 200;
                bus += tonnes * 100;
            } else if (tonnes <= 11) {
                sumPerTonne += tonnes * 175;
                truck += tonnes * 100;
            } else {
                sumPerTonne += tonnes * 120;
                train += tonnes * 100;
            }
        }
        sum = sumPerTonne / totalTonnes;
        bus /= totalTonnes;
        truck /= totalTonnes;
        train /= totalTonnes;
        System.out.printf("%.2f%n", sum);
        System.out.println(String.format("%.2f", bus) + "%");
        System.out.println(String.format("%.2f", truck) + "%");
        System.out.println(String.format("%.2f", train) + "%");
    }
}