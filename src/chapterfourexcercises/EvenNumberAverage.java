package chapterfourexcercises;

import java.util.Scanner;

public class EvenNumberAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double evenNumberAverage = 0.0;
        int evenNumberCounter = 0;
        double evenNumber = 0.0;

        for (int counter = 1; counter <= 10; counter++){
            System.out.println("Enter numbers " + counter);
            int numbers = scanner.nextInt();
            if (numbers % 2 == 0){
                evenNumberAverage = evenNumberAverage + numbers;
            }
            evenNumber = evenNumberAverage / evenNumberCounter;
            evenNumberCounter++;
        }
        System.out.printf("The average of  task five is:%.2f ", evenNumber);


    }
}
