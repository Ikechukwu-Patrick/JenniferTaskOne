package firedrill2;

import java.util.Scanner;

public class ScoreAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfScores = 0;
        double average = 0.0;

        for (int counter = 1; counter <= 10; counter++) {
            System.out.println("Enter Score " + counter );
            int scores = scanner.nextInt();
            sumOfScores += scores;

            average = (double) sumOfScores / 10;

            System.out.println(scores < 0 && scores < 1 ?"Enter a positive number from 1 - 10" : "Keeping entering scores");
            scores = scanner.nextInt();
        }
        System.out.println("The average of scores collected is " + average);
    }
}
