package Exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int pieces = length * width;
        String input = scanner.nextLine();
        int take;
        while (pieces > 0) {
            if (input.equals("STOP")) {
                System.out.println(pieces + " pieces are left.");
                break;
            }
            take = Integer.parseInt(input);
            pieces -= take;
            if (pieces <= 0) {
                System.out.println("No more cake left! You need " + Math.abs(pieces) + " pieces more.");
            } else {
                input = scanner.nextLine();
            }
        }
    }
}