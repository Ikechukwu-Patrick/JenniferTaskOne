package chapterfourexcercises;
    import java.util.Scanner;

    public class GasMileageCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double totalMiles = 0.0;
            double totalGallons = 0.0;

            int tripCount = 0;

            while (true) {
                System.out.print("Enter miles driven (or -1 to quit): ");
                int milesDriven = scanner.nextInt();

                if (milesDriven == -1) {
                    break;
                }

                System.out.print("Enter gallons used: ");
                double gallonsUsed = scanner.nextDouble();


                double milesPerGallon = milesDriven / gallonsUsed;

                totalMiles += milesDriven;
                totalGallons += gallonsUsed;

                System.out.printf("Trip %d - miles per gallon: %.2f%n", ++tripCount, milesPerGallon);
            }

            double combinedMpg = totalMiles / totalGallons;

            System.out.printf("Combined MPG for all trips: %.2f%n", combinedMpg);

        }
    }


