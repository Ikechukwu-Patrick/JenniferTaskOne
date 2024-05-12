package firedrill2;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumOfScores = 0;
        double sumAverage = 0.0;
        for (int counter = 1; counter <= 10; counter++) {
            System.out.println("Enter scores " + counter);
            int scores = input.nextInt();
            sumOfScores = sumOfScores + scores;
            sumAverage = (double) sumOfScores / counter;
        }
        System.out.println("The sum of all scores collected is:" + sumOfScores);
        System.out.println("The average of all scores collected is:" + sumAverage);
    }
}
