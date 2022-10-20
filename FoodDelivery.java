import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());
        double chickenPrice = chickenMenu * 10.35;
        double fishPrice = fishMenu * 12.40;
        double vegetarianPrice = vegetarianMenu * 8.15;
        double totalMenuPrice = chickenPrice + fishPrice + vegetarianPrice;
        double dessertPrice = 0.20 * totalMenuPrice;
        double totalOrderPrice = totalMenuPrice + dessertPrice + 2.50;
        System.out.println(totalOrderPrice + " цена на поръчката");
    }
}
