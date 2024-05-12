package firedrill1;

public class OldNumbersFromOneToTen {
    public static void main(String[] args) {
        for (int oldCounter = 1; oldCounter <= 10; oldCounter++){
            if (oldCounter % 2 != 0) {
                System.out.print(oldCounter + " ");
            }
        }
    }
}
