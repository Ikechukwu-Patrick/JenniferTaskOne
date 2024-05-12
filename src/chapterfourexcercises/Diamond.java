package chapterfourexcercises;
    public class Diamond {
        public static void main(String[] args) {
            int size = 9; // You can adjust the size as needed
            int odd = 1;
            int nos = size / 2; // nos = number of spaces

            for (int i = 1; i <= size; i++) {
                // Print spaces
                for (int k = nos; k >= 1; k--) {
                    System.out.print(" ");
                }

                // Print stars
                for (int j = 1; j <= odd; j++) {
                    System.out.print("*");
                }

                System.out.println();

                if (i < size / 2 + 1) {
                    odd += 2; // Columns increase until the center row
                    nos -= 1; // Spaces decrease until the center row
                } else {
                    odd -= 2; // Columns decrease after the center row
                    nos += 1; // Spaces increase after the center row
                }
            }
        }
    }


