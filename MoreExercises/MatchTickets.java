package MoreExercises;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String categories = scanner.nextLine();
        int amountOfPeople = Integer.parseInt(scanner.nextLine());
        double VIP;
        double normal;
        double sum;
        double transport;
          switch (amountOfPeople) {
              case 1: case 2: case 3: case 4: transport = budget - budget * 0.75; break;
              case 5: case 6: case 7: case 8: case 9: transport = budget - budget * 0.60; break;
              case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23: case 24: transport = budget - budget * 0.50; break;
              case 25: case 26: case 27: case 28: case 29: case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49: transport = budget - budget * 0.40; break;
              default: transport = budget - budget * 0.25; break;
        }
        if (categories.equals("VIP")) {
            VIP = 499.99;
            sum = VIP * amountOfPeople;
        } else {
            normal = 249.99;
            sum = normal * amountOfPeople;
        }
        if (sum < transport) {
            System.out.printf("Yes! You have %.2f leva left.", transport - sum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", sum - transport);
        }
    }
}