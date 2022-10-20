import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String agencyName = scanner.nextLine();
        int adults = Integer.parseInt(scanner.nextLine());
        int kid = Integer.parseInt(scanner.nextLine());
        double net = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());
        double netKids = net - net * 0.70;
        double adult = net + tax;
        double kidTicket = netKids + tax;
        double total = (kid * kidTicket) + (adults * adult);
        double acProfit = total * 0.20;
        System.out.println("The profit of your agency from " + agencyName + " tickets is " + String.format("%.2f", acProfit) + " lv.");
    }
}
