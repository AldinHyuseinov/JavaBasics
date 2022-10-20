package ExamExercises;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int spotCount = 0;
        boolean flag = false;
        int totalTickets = 0;
        int studentCount = 0;
        int stCount = 0;
        int kidsCount = 0;
        while (!movie.equals("Finish")) {
            int freeSpots = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")) {
                spotCount++;
                if (ticketType.equals("student")) {
                    studentCount++;
                } else if (ticketType.equals("standard")) {
                    stCount++;
                } else {
                    kidsCount++;
                }
                if (spotCount >= freeSpots) {
                    break;
                }
                ticketType = scanner.nextLine();
            }
            double roomFilled = spotCount * 100.00 / freeSpots;
            System.out.printf("%s - %.2f%% full.%n", movie, roomFilled);
            totalTickets += spotCount;
            spotCount = 0;
            movie = scanner.nextLine();
            if (movie.equals("Finish")) {
                flag = true;
            }
        }
        double studentTickets = studentCount * 100.00 / totalTickets;
        double standardTickets = stCount * 100.00 / totalTickets;
        double kidsTickets = kidsCount * 100.00 / totalTickets;
        if (flag) {
            System.out.println("Total tickets: " + totalTickets);
            System.out.printf("%.2f%% student tickets.%n", studentTickets);
            System.out.printf("%.2f%% standard tickets.%n", standardTickets);
            System.out.printf("%.2f%% kids tickets.", kidsTickets);
        }
    }
}