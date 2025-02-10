public class CountDuplicates {
    public static void main(String[] args) {
        // Sample array with some duplicate values
        int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 3, 7, 1};
        // Call the method to count duplicates
        int duplicateCount = countDuplicates(array);
        // Print the result
        System.out.println("Number of duplicate elements: " + duplicateCount);
    }
    // Method to count duplicates in the array
    public static int countDuplicates(int[] array) {
        int count = 0; // Variable to count duplicates
        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            // Check for duplicates of array[i]
            for (int j = i + 1; j < array.length; j++) {
                // If a duplicate is found
                if (array[i] == array[j]) {
                    count++; // Increment the duplicate count
                    break; // Break to avoid counting the same duplicate multiple times
                }
            }
        }
        return count; // Return the total count of duplicates
    }
}
