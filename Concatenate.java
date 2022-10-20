import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String last = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();
        System.out.print("You are " + first + " " + last + ", a " + age + "-years old person from " + town + ".");

    }
}
