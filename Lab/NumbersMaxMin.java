package Lab;

import java.util.Scanner;

public class NumbersMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stop = scanner.nextLine();
        int min = Integer.MAX_VALUE;
        while (!stop.equals("Stop")) {
            int num = Integer.parseInt(stop);
            if (num < min) {
                min = num;
            }
            stop = scanner.nextLine();
        }
        System.out.println(min);
    }
}