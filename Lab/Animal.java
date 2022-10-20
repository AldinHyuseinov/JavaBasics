package Lab;

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();
        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "tortoise":
            case "crocodile":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
