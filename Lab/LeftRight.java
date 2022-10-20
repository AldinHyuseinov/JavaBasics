package Lab;

import java.util.Scanner;

public class LeftRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int left = 0;
        int right = 0;
        for (int i = 0; i < 2 * n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i < n) {
                left += number;
            } else {
                right += number;
            }
        }
        if (left == right) {
            System.out.println("Yes, sum = " + right);
        } else {
            System.out.println("No, diff = " + Math.abs(left - right));
        }
    }
}