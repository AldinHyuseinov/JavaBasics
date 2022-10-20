import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int plastic = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());
        double plasticSum = (plastic + 2) * 1.50;
        double paintSum = paint * 1.10 * 14.50;
        double thinnerPrice = thinner * 5.00;
        double bagPrice = 0.40;
        double total = plasticSum + paintSum + thinnerPrice + bagPrice;
        double bonus = 0.30;
        double workerSalary = total * bonus * workHours;
        double finalPrice = total + workerSalary;
        System.out.println(finalPrice + " сумата на всички разходи");


    }
}
