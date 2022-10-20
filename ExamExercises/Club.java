package ExamExercises;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wantedMoney = Double.parseDouble(scanner.nextLine());
        String cocktail = scanner.nextLine();
        double total = 0.0;
        boolean party = true;
        while (!cocktail.equals("Party!")) {
            int amount = Integer.parseInt(scanner.nextLine());
            int length = cocktail.length();
            double sum = length * amount;
            if (sum % 2 != 0) {
                sum -= sum * 0.25;
            }
            total += sum;
            if (total >= wantedMoney) {
                party = false;
                System.out.println("Target acquired.");
                System.out.printf("Club income - %.2f leva.", total);
                break;
            }
            cocktail = scanner.nextLine();
        }
        if (party) {
            System.out.printf("We need %.2f leva more.%n", wantedMoney - total);
            System.out.printf("Club income - %.2f leva.", total);
        }
    }
}