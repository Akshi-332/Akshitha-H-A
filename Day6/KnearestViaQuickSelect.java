import java.util.Random;

public class KnearestViaQuickSelect{
    public static int findKthClosest(int[] readings, int left, int right, int k, int target) {
        if (left <= right) {
            int pivotIndex = partition(readings, left, right, target);
            if (pivotIndex == k) {
                return readings[pivotIndex];
            }
            if (pivotIndex > k) {
                return findKthClosest(readings, left, pivotIndex - 1, k, target );
            }
            return findKthClosest(readings, pivotIndex + 1, right, k, target);
        }
        throw new IllegalArgumentException("k is out of bounds");
    }

    public static int partition(int[] readings, int left, int right, int target) {
        int pivotIndex = new Random().nextInt(right - left + 1) + left;
        int pivot = readings[pivotIndex];
        int i = left;
        int j = right;

        while (i <= j) {
            while (i <= j && Math.abs(readings[i] - target) < Math.abs(pivot - target)) {
                i++;
            }
            while (i <= j && Math.abs(readings[j] - target) > Math.abs(pivot - target)) {
                j--;
            }
            if (i <= j) {
                int temp = readings[i];
                readings[i] = readings[j];
                readings[j] = temp;
                i++;
                j--;
            }
        }
        return i; // Return the partition index
    }

    public static void main(String[] args) {
        int[] readings = {72,75,80,68,74};
        int k = 2;
        int target = 73;
        System.out.println(findKthClosest(readings, 0, readings.length - 1, k - 1, target));
    }
}