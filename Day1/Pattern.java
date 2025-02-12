public class Pattern {
    public static void main(String[] args) {
        // Create an instance of the StarPattern class
        StarPattern starPattern = new StarPattern(); 
        // Define the number of rows for the star pattern
        int rows = 5; 
        // Call the printPattern method to print the star pattern with the specified number of rows
        starPattern.printPattern(rows); 
    }
}
// Class to handle the printing of the star pattern
class StarPattern {
    // Method to print the star pattern based on the number of rows
    public void printPattern(int rows) {
        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print leading spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); // Print a space
            }
            // Inner loop to print stars for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print a star
            }
            // Move to the next line after printing all stars for the current row
            System.out.println();
        }
    }
}
