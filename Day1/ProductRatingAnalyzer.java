public class ProductRatingAnalyzer {
    public static void main(String[] args) {
        // Example product ratings
        int[] ratings = {5, 3, 4, 5, 2, 5, 4, 3, 2, 4, 3};

        // Call the method to find the most frequent rating
        int mostFrequentRating = findMostFrequentRating(ratings);

        // Output the result
        System.out.println("The rating that appears most frequently is: " + mostFrequentRating);
    }

    public static int findMostFrequentRating(int[] ratings) {
        int mostFrequentRating = ratings[0];
        int maxCount = 0;

        // Iterate through each rating
        for (int i = 0; i < ratings.length; i++) {
            int count = 0;

            // Count how many times ratings[i] appears in the array
            for (int j = 0; j < ratings.length; j++) {
                if (ratings[i] == ratings[j]) {
                    count++;
                }
            }

            // Update most frequent rating if the current count is greater
            if (count > maxCount) {
                maxCount = count;
                mostFrequentRating = ratings[i];
            }
        }

        return mostFrequentRating; // Return the most frequent rating
    }
}