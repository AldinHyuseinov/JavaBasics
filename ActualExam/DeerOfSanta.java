package ActualExam;

import java.util.Scanner;

public class DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysGone = Integer.parseInt(scanner.nextLine());
        int foodLeftKg = Integer.parseInt(scanner.nextLine());
        double foodFirst = Double.parseDouble(scanner.nextLine());
        double foodSecond = Double.parseDouble(scanner.nextLine());
        double foodThird = Double.parseDouble(scanner.nextLine());
        double needed1 = daysGone * foodFirst;
        double needed2 = daysGone * foodSecond;
        double needed3 = daysGone * foodThird;
        double total = needed1 + needed2 + needed3;
        if (total < foodLeftKg) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodLeftKg - total));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(total - foodLeftKg));
        }
    }
}
