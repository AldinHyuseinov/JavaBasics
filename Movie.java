import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double statistSum = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;
        double clothes = statists * statistSum;
        if (statists >= 150) {
            clothes *= 0.9;
        }
        double total = decor + clothes;
        if (total <= budget) {
            System.out.println("Action!");
            System.out.println("Wingard starts filming with " + String.format("%.2f", budget - total) + " leva left.");
        } else {
            System.out.println("Not enough money!");
            System.out.println("Wingard needs " + String.format("%.2f", total - budget) + " leva more.");
        }
    }
}

