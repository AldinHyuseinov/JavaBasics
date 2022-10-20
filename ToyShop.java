import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacation = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int toyTrucks = Integer.parseInt(scanner.nextLine());
        double sum = puzzle * 2.60 + dolls * 3 + teddyBears * 4.10 + minions * 8.20 + toyTrucks * 2;
        int toyAmount = puzzle + dolls + teddyBears + minions + toyTrucks;
        if (toyAmount >= 50) {
            sum = sum - sum * 0.25;
        }
        sum = sum - sum * 0.10;
        if (sum >= vacation) {
            System.out.printf("Yes! %.2f lv left.", sum - vacation);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(sum - vacation));
        }
    }
}