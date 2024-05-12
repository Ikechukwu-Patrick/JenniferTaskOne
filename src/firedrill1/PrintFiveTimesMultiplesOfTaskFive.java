package firedrill1;

public class PrintFiveTimesMultiplesOfTaskFive {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int y = i * 4;
            for (int s = y; s <= 10; s++) {
                int t = s * 4;
                System.out.print(t + " ");
            }
        }
    }
}