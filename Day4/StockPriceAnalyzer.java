import java.util.Arrays;

public class StockPriceAnalyzer{
    
    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        findNextGreater(arr, result, n - 1);
        return result;
    }

    private static void findNextGreater(int[] arr, int[] result, int index) {
        if (index < 0) {
            return;
        }

        int nextGreater = -1;
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] > arr[index]) {
                nextGreater = arr[i];
                break;
            }
        }
        
        result[index] = nextGreater;
        findNextGreater(arr, result, index - 1);
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        System.out.println(Arrays.toString(nextGreater(arr)));
    }
}