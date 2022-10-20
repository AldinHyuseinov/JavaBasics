package MoreExercises;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f1 = Integer.parseInt(scanner.nextLine());
        int f2 = Integer.parseInt(scanner.nextLine());
        int f3 = Integer.parseInt(scanner.nextLine());
        int f4 = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());
        double sum = f1 * 3.25 + f2 * 4 + f3 * 3.5 + f4 * 8;
        double debt = 0.5 * sum / 10;
        double debt2 = sum - debt;
        double needed = Math.ceil(giftPrice - debt2);
        if (debt2 < giftPrice) {
            System.out.printf("She will have to borrow %.0f leva.", needed);
        } else {
            double left = Math.floor(debt2 - giftPrice);
            System.out.printf("She is left with %.0f leva.", left);
        }
    }
}