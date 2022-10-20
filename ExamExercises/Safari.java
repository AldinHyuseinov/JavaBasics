package ExamExercises;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double litersFuel = Double.parseDouble(scanner.nextLine());
        String weekDay = scanner.nextLine();
        double total = litersFuel * 2.10 + 100;
        if (weekDay.equals("Sunday")) {
            total -= total * 0.2;
        } else {
            total -= total * 0.1;
        }
        if (budget >= total) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - total);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", total - budget);
        }
    }
}