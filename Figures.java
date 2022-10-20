import java.util.Scanner;

public class Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        if (figure.equals("square")){
            double length = Double.parseDouble(scanner.nextLine());
            double sum = length * length;
            System.out.printf("%.3f",sum);
        } else if (figure.equals("rectangle")){
            double side = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            double sum = side * side2;
            System.out.printf("%.3f" ,sum);
        } else if (figure.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * Math.pow(radius, 2);
            System.out.printf("%.3f" ,area);
        } else if (figure.equals("triangle")){
            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double area = side * height / 2;
            System.out.printf("%.3f" ,area);
        }
    }
}