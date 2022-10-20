import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());
        double sum = dogFood * 2.50;
        int sum2 = catFood * 4;
        double sum3 = sum + sum2;
        System.out.println(sum3 + " lv.");
    }
}
