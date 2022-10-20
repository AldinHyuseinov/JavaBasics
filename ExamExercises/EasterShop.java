package ExamExercises;

import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eggs = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int soldEggs = 0;
        boolean isClosed = true;
        while (!command.equals("Close")) {
            int buyFill = Integer.parseInt(scanner.nextLine());
            if (command.equals("Buy")) {
                if (buyFill > eggs) {
                    isClosed = false;
                    System.out.println("Not enough eggs in store!");
                    System.out.println("You can buy only " + eggs + ".");
                    break;
                }
                eggs -= buyFill;
                soldEggs += buyFill;
            } else {
                eggs += buyFill;
            }
            command = scanner.nextLine();
        }
        if (isClosed) {
            System.out.println("Store is closed!");
            System.out.println(soldEggs + " eggs sold.");
        }
    }
}