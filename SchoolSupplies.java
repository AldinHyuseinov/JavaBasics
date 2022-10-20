import java.util.Scanner;

public class SchoolSupplies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaner = Integer.parseInt(scanner.nextLine());
        double discount = Integer.parseInt(scanner.nextLine());
        double penPrice = pens * 5.80;
        double markersPrice = markers * 7.20;
        double cleanerPrice = cleaner * 1.20;
        double total = penPrice + markersPrice + cleanerPrice;
        double Percentage = discount / 100;
        double discountPrice = total - (total * Percentage);
        System.out.println(discountPrice);
    }
}
