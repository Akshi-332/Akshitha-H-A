public class secmin_dbl{
    public static void main(String[] args) { 
        // Initialize an array
        double[] originalArray = {12.5, 9.2,4.5,19.5,2.5,56.8};
        // Create a new array with size
        double[] newArray = new double[10];
        // Copy values from original to new array
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
         // Fill remaining elements of new array with Double.MAX_VALUE
        for (int i = originalArray.length; i < newArray.length; i++) {
            newArray[i] = Double.MAX_VALUE; 
        }
         // Initialize variables to hold first & second minimum values
        double firstMin = Double.MAX_VALUE;
        double secondMin = Double.MAX_VALUE;
        // Iterate new array to find first & second minimum values
        for (double num : newArray) {
            if (num < firstMin) {
                // Update second minimum before updating first minimum
                secondMin = firstMin; 
                firstMin = num;       
            } else if (num < secondMin && num != firstMin) {
                // Update second minimum if current number < secondMin and != firstMin
                secondMin = num;     
            }
        }
        // Print first minimum value
        System.out.println("First minimum value: " + firstMin);        
        // Print second minimum value, or indicate that it was not found
        System.out.println("Second minimum value: " + (secondMin == Double.MAX_VALUE ? "Not found" : secondMin));
    }
}
