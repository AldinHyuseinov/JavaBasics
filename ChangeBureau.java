import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoin = Integer.parseInt(scanner.nextLine());
        double yuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());
        int sum = bitcoin * 1168;
        double sum2 = yuan * 0.15;
        double sum3 = sum2 * 1.76;
        double sum4 = sum + sum3;
        double sum5 = sum4 / 1.95;
        double com = (commission / 100) * sum5;
        double result = sum5 - com;
        System.out.printf("%.2f%n", result);
    }
}
