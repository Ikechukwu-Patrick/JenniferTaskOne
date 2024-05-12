package firedrill2;

import java.util.Scanner;

public class ScoreEvenIndexes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenIndexSum = 0;
        for (int counter = 1; counter <= 10; counter++) {
            System.out.println("Enter score :" + counter);
            int score = scanner.nextInt();

            if(score % 2 == 0){
                evenIndexSum += score;
            }
            evenIndexSum++;

        }
        System.out.println("The sum of all even index scores collected is:" + evenIndexSum);


    }
}
