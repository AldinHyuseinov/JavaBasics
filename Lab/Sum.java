package Lab;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int total = 0;
        while (total < n) {
            int n2 = Integer.parseInt(scanner.nextLine());
            total += n2;
        }
        System.out.println(total);
    }
}