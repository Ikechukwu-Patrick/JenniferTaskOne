import java.util.Scanner;
public class UsingJavaStatementToAccomplishTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int z = 0;
        int counter = 0;
        int divisor = 0;
        int q = 0;
        while (counter != -1){
            System.out.println("Enter first integer");
            int x = scanner.nextInt();

            System.out.println("Enter second integer");
            int y = scanner.nextInt();

            z = x + y;
            x++;
            System.out.println(counter > 10 ? "Counter is greater than 10" : "Counter is yet to be greater than 10");
            x--;

            z = z - x;

            System.out.println(q % divisor != 0 ? "q" : "The result is equal to zero ");

        }


    }
}