public class InversionCountRecursion {

    public static int countInversions(int[] arr) {
        return countInversionsRecursive(arr, 0, arr.length - 1);
    }

    private static int countInversionsRecursive(int[] arr, int left, int right) {
        if (left >= right) {
            return 0;
        }
        int count = 0;
        for (int i = left; i < right; i++) {
            for (int j = i + 1; j <= right; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        count += countInversionsRecursive(arr, left, (left + right) / 2);
        count += countInversionsRecursive(arr, (left + right) / 2 + 1, right);
        return count;
    }
    public static void main(String[] args) {
        int[] processingTimes = {30, 45, 60, 20, 25};
        int inversionCount = countInversions(processingTimes);
        System.out.println("The inversion count is " + inversionCount);
    }
}