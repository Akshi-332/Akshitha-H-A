public class InversionCount {

    // Function to count inversions in the array
    public static int countInversions(int[] arr) {
        int count = 0;
        int n = arr.length;

        // Nested loop to count inversions
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] processingTimes = {1, 9, 6, 4, 5};

        int inversionCount = countInversions(processingTimes);
        System.out.println("The inversion count is " + inversionCount);
    }
}