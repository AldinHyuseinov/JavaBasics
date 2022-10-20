package ActualExam;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int num1 = num.charAt(0);
        int num2 = num.charAt(1);
        int num3 = num.charAt(2);
        int actNum1 = num1 - '0';
        int actNum2 = num2 - '0';
        int actNum3 = num3 - '0';
        for (int i = 1; i <= actNum3; i++) {
            for (int j = 1; j <= actNum2; j++) {
                for (int k = 1; k <= actNum1; k++) {
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, i * j * k);
                }
            }
        }
    }
}