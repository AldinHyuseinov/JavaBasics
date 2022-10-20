package Exercises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double sum = points;
        for (int i = 1; i <= n; i++) {
            String ratingPerson = scanner.nextLine();
            double rate = Double.parseDouble(scanner.nextLine());
            int nameLength = ratingPerson.length();
            sum += ((nameLength * rate) / 2);
            if (sum >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, sum);
                break;
            }
        }
        if (sum < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.5 - sum);
        }
    }
}