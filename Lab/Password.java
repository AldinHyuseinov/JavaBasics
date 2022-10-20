package Lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String pass = scanner.nextLine();
        String entered = scanner.nextLine();
        while (!entered.equals(pass)) {
            entered = scanner.nextLine();
        }
        System.out.println("Welcome " + name + "!");
    }
}