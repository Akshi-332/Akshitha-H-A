public class FirstDuplicate {
    public static void main(String[] args) {
        // Initialize an array of integers 
        int[] originalArray = {12, 9, 5, 8, 4, 5, 10};
        // Variable to hold the first duplicate value found, initialized to null
        Integer firstDuplicate = null;
        // Outer loop to iterate through each element in original array
        for (int i = 0; i < originalArray.length; i++) {
            // Inner loop to compare current element with subsequent elements
            for (int j = i + 1; j < originalArray.length; j++) {
                // Check if the current element = any of the subsequent elements
                if (originalArray[i] == originalArray[j]) {
                    // If a duplicate is found, store it in firstDuplicate
                    firstDuplicate = originalArray[i]; 
                    break;// Exit the inner loop as we found a duplicate
                }
            }
            // If a duplicate has been found, exit the outer loop as well
            if (firstDuplicate != null) {
                break; 
            }
        }
        // Check if a duplicate was found and print the result
        if (firstDuplicate != null) {
            System.out.println("First duplicate value: " + firstDuplicate);
        } else {
            // If no duplicates were found, print a corresponding message
            System.out.println("No duplicates found.");
        }
    }
}
