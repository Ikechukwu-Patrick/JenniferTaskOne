package firedrill2;

import java.util.Scanner;

public class ScoreCollector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfScores = 0;

        for (int counter = 1; counter <= 10; counter++){
            System.out.println("Enter scores " + counter);
            int scores = scanner.nextInt();
            System.out.println(scores < 0 && scores < 1 ?"Enter a positive number from 1 - 10" : "Keeping entering scores");
            scores = scanner.nextInt();
            sumOfScores += scores;
        }
        System.out.println("The sum of all scores collected is:" + sumOfScores);


    }
}
