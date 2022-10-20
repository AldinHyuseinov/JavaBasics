package ExamExercises;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangeKg = Double.parseDouble(scanner.nextLine());
        double berriesKg = Double.parseDouble(scanner.nextLine());
        double strawberryKg = Double.parseDouble(scanner.nextLine());
        double strawSum = strawberryPrice * strawberryKg;
        double berriesPrice = strawberryPrice / 2;
        double orangePrice = berriesPrice - (0.4 * berriesPrice);
        double bananaPrice = berriesPrice - (0.8 * berriesPrice);
        double berriesSum = berriesKg * berriesPrice;
        double orangeSum = orangeKg * orangePrice;
        double bananaSum = bananasKg * bananaPrice;
        double total = strawSum + berriesSum + orangeSum + bananaSum;
        System.out.printf("%.2f", total);
    }
}