import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class heartRateViadequeue {
    public static int[] findMax(int[] heartRate, int window) {
        if (heartRate.length == 0 || window <= 0 || window > heartRate.length) {
            return new int[0];
        }

        int[] result = new int[heartRate.length - window + 1];
        Deque<Integer> myDeque = new LinkedList<>();

        for (int index = 0; index < heartRate.length; index++) {
            if (!myDeque.isEmpty() && myDeque.peekFirst() < index - window + 1) {
                myDeque.pollFirst();
            }
            while (!myDeque.isEmpty() && heartRate[index] >= heartRate[myDeque.peekLast()]) {
                myDeque.pollLast();
            }
            myDeque.offerLast(index);

            if (index >= window - 1) {
                result[index - window + 1] = heartRate[myDeque.peekFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] heartRate = {72, 80, 75, 90, 85, 92, 88};
        int window = 3;
        int[] received = findMax(heartRate, window);
        System.out.println("Maximum heart rate for each window: " + Arrays.toString(received));
    }
}