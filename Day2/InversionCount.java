public class InversionCount {
    public static int countInversions(int[] arr) {
        int count = 0;
        int n = arr.length;
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
        int[] processingTimes = {30,45,60,20,25};

        int inversionCount = countInversions(processingTimes);
        System.out.println("The inversion count is " + inversionCount);
    }
}