package MoreExercises;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int amount = Integer.parseInt(scanner.nextLine());
        double workTime = days - days * 0.10;
        double workTime2 = workTime * 8;
        int day = days * 24;
        int overTime = amount * day / 2 / 6;
        double total = Math.floor(workTime2 + overTime);
        if (total >= hours) {
            System.out.printf("Yes!%.0f hours left.", total - hours);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", hours - total);
        }
    }
}
