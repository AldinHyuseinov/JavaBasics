package ExamExercises;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = Integer.parseInt(scanner.nextLine());
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double total = 0;
        String movies;
        String best = null;
        String worst = null;
        for (int i = 1; i <= amount; i++) {
            movies = scanner.nextLine();
            double movieRating = Double.parseDouble(scanner.nextLine());
            if (movieRating > max) {
                max = movieRating;
                best = movies;
            }
            if (movieRating < min) {
                min = movieRating;
                worst = movies;
            }
            total += movieRating;
        }
        total /= amount;
        System.out.printf("%s is with highest rating: %.1f%n", best, max);
        System.out.printf("%s is with lowest rating: %.1f%n", worst, min);
        System.out.printf("Average rating: %.1f", total);
    }
}