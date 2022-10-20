import java.util.Scanner;

public class DepositCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int deadLine = Integer.parseInt(scanner.nextLine());
        double yearlyPercent = Double.parseDouble(scanner.nextLine());
        double yearlyPercentCalc = yearlyPercent / 100;
        double interest = depositSum * yearlyPercentCalc;
        double interestFor1Month = interest / 12;
        double totalSum = depositSum + deadLine * interestFor1Month;
        System.out.println(totalSum);



    }
}
