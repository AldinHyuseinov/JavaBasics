import java.util.Scanner;

public class CatWalk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = Integer.parseInt(scanner.nextLine());
        int walk = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());
        int total = minutes * walk;
        int burnedCalories = total * 5;
        if (burnedCalories >= calories / 2) {
            System.out.println("Yes, the walk for your cat is enough. Burned calories per day: " + burnedCalories + ".");
        }
            else
            System.out.println("No, the walk for your cat is not enough. Burned calories per day: " + burnedCalories + ".");

    }
}
