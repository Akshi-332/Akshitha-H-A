import java.util.Arrays;

public class CountTriplets {
    public static int countTriplets(int[] arr, int T) {
        int count = 0;
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            for (int j = i + 1, k = n - 1; j < k; ) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == T) {
                    count++;
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                } else if (sum < T) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 3, 1, 1, 4, 2};
        int T = 6;
        System.out.println(countTriplets(arr, T));
    }
}