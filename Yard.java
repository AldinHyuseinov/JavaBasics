import java.util.Scanner;

public class Yard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sqM = Double.parseDouble(scanner.nextLine());
        double sum = sqM * 7.61;
        double sum2 = 0.18 * sum;
        double sum3 = sum - sum2;
        System.out.println("The final price is: " + sum3 + " lv.");
        System.out.println("The discount is: " + sum2 + " lv.");
    }
}