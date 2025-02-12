import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoPairsSumViaHT {
    public static List<Integer> findTwoPairs(int[] arr, int target) {
        List<Integer> pairs = new ArrayList<>();
        Map<Integer, Integer> myTable = new HashMap<>();

        for (int index = 0; index < arr.length; index++) {
            int currentValue = arr[index];
            int key = target - currentValue;

            if (myTable.containsKey(key) && myTable.get(key) > 0) {
                pairs.add(key);
                pairs.add(currentValue);
                break;
            }

            myTable.put(currentValue, myTable.getOrDefault(currentValue, 0) + 1);
        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] transactions = {800, 1200, 4500, 320, 600, 800, 560, 4500, 12000, 320};
        int target = 1400; 
        System.out.println(findTwoPairs(transactions, target));
    }
}