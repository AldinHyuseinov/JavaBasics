import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        int vcSum = videoCards * 250;
        double processorSum = vcSum * 0.35 * processors;
        double ramSum = vcSum * 0.10 * ram;
        double totalSum = vcSum + processorSum + ramSum;
        if (videoCards >= processors) {
            totalSum = totalSum - totalSum * 0.15;
        }
        if (totalSum <= budget) {
            System.out.printf("You have %.2f leva left!", budget - totalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalSum - budget);
        }
    }
}