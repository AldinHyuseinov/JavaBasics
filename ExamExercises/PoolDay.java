package ExamExercises;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        double fee = Double.parseDouble(scanner.nextLine());
        double chairPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());
        double totalFee = people * fee;
        double totalChair = Math.ceil(people * 0.75);
        double chairSum = totalChair * chairPrice;
        double totalUmbrella = Math.ceil(people / 2.00);
        double umbrellaSum = totalUmbrella * umbrellaPrice;
        double total = totalFee + chairSum + umbrellaSum;
        System.out.printf("%.2f lv.", total);
    }
}