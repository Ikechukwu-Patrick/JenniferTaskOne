package firedrill2;

import java.util.Scanner;

public class ValidScoresZeroToHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfScores = 0;

        for (int counter = 1; counter <= 10; counter++){
            System.out.println("Enter scores from 0 - 100: " + counter);
            int scores = scanner.nextInt();

            if (scores < 0 || scores > 100){
                System.out.println("Enter a positive number from 0 - 100");
                scores = scanner.nextInt();
            }else {
                sumOfScores += scores;
            }

        }
        System.out.println("The sum of scores is " + sumOfScores);



    }
}
