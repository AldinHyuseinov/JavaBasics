import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSec = Double.parseDouble(scanner.nextLine());
        double climb = (distance * timeInSec);
        double add = Math.floor(distance / 50);
        double add2 = (add * 30);
        double totalTime = climb + add2;
        if (record < totalTime){
            double slow = totalTime - record;
            System.out.println ("No! He was " + String.format("%.2f", slow) + " seconds slower.");
        }
        else if (record == totalTime){
            System.out.println ("No! He was " + "0.00" + " seconds slower.");
        }

        else
            System.out.println ("Yes! The new record is " + String.format("%.2f", totalTime) + " seconds.");
    }
}
