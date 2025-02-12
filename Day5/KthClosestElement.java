import java.util.*;

public class KthClosestElement {
    static class ReadingDistance {
        int reading;
        int distance;
        ReadingDistance(int reading, int distance) {
            this.reading = reading;
            this.distance = distance;
        }
    }
    public static int findKthClosest(int[] readings, int target, int k) {
        List<ReadingDistance> distances = new ArrayList<>();
        for (int reading : readings) {
            distances.add(new ReadingDistance(reading, Math.abs(reading - target)));
        }
        quickselect(distances, 0, distances.size() - 1, k - 1);
        return distances.get(k - 1).reading;
    }
    private static void quickselect(List<ReadingDistance> distances, int left, int right, int k) {
        if (left >= right) return;
        int pivotIndex = partition(distances, left, right);
        if (pivotIndex == k) {
            return;
        }
        else if (k < pivotIndex) {
            quickselect(distances, left, pivotIndex - 1, k);
        }
        else {
            quickselect(distances, pivotIndex + 1, right, k);
        }
    }
    private static int partition(List<ReadingDistance> distances, int left, int right) {
        int pivotDistance = distances.get(right).distance;
        int i = left;
        for (int j = left; j < right; j++) {
            if (distances.get(j).distance < pivotDistance) {
                swap(distances, i, j);
                i++;
            }
        }
        swap(distances, i, right);
        return i;
    }
    private static void swap(List<ReadingDistance> distances, int i, int j) {
        ReadingDistance temp = distances.get(i);
        distances.set(i, distances.get(j));
        distances.set(j, temp);
    }
    public static void main(String[] args) {
        int[] readings = {72, 75, 68, 80, 74};
        int target = 73;
        int k = 2;
        int result = findKthClosest(readings, target, k);
        System.out.println("The " + k + "-th closest reading is: " + result);
    }
}