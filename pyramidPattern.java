public class pyramidPattern {
    public static void main(String[] args) {
        // Define the number of rows for the pyramid
        int rows = 5; // You can change this value to increase or decrease the size of the pyramid
        // Call the method to print the asterisk pyramid
        printPyramid(rows);
    }

    // Method to print the asterisk pyramid
    public static void printPyramid(int rows) {
        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print leading spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); // Print a space
            }
            // Inner loop to print asterisks for the current row
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); // Print an asterisk
            }
            // Move to the next line after printing all asterisks for the current row
            System.out.println();
        }
    }
}