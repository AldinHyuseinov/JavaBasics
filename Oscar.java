import java.util.Scanner;

public class Oscar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rent = Integer.parseInt(scanner.nextLine());
        double statue = rent - 0.30 * rent;
        double catering = statue - 0.15 * statue;
        double sum = 0.5 * catering;
        double total = rent + statue + catering + sum;
        System.out.printf("%.2f%n%n", total);
    }
}
