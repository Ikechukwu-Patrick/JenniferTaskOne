package firedrill2;

import java.util.Scanner;

public class ScoreSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumOfScores = 0;
        for (int counter = 1; counter <= 10; counter++) {
            System.out.println("Enter scores " + counter);
            int scores = input.nextInt();
            sumOfScores = sumOfScores + scores;
        }
        System.out.println("The sum of all scores collected is:" + sumOfScores);
    }
}
