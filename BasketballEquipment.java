import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearlyTrainTax = Integer.parseInt(scanner.nextLine());
        double shoePrice = yearlyTrainTax - yearlyTrainTax * 0.40;
        double jerseyPrice = shoePrice - shoePrice * 0.20;
        double basketball = 1.0 / 4 * jerseyPrice;
        double accessories = 1.0 / 5 * basketball;
        double total = yearlyTrainTax + shoePrice + jerseyPrice + basketball + accessories;
        System.out.println(total);
    }
}
