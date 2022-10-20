package Lab;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char a = text.charAt(i);
            System.out.println(a);
        }
    }
}