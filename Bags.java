import java.util.Scanner;

public class Bags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bagOver20Kg = Double.parseDouble(scanner.nextLine());
        double bagKg = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());
        double bagPrice;
        double dayPrice;
        if (days > 30){
            dayPrice = 1.10;
        }
        else if (days < 7){
            dayPrice = 1.40;
        }
        else
            dayPrice = 1.15;
        if (bagKg <= 10) {
             bagPrice = 0.20 * bagOver20Kg;
             double total = bagPrice * dayPrice * count;
            System.out.println("The total price of bags is: " + String.format("%.2f",total) + " lv.");
        }
        else if (bagKg <= 20) {
             bagPrice = bagOver20Kg / 2;
             double total = bagPrice * dayPrice * count;
            System.out.println("The total price of bags is: " + String.format("%.2f" ,total) + " lv.");
        }
        else
            System.out.println("The total price of bags is: " + String.format("%.2f" ,bagOver20Kg * dayPrice * count) + " lv.");
    }
}