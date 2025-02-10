public class PrefixSumCalculator {

    public static int[] calculatePrefixSum(int[] sales) {
        int n = sales.length;
        int[] prefixSum = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                prefixSum[i] = sales[i]; 
            } else {
                prefixSum[i] = prefixSum[i - 1] + sales[i]; 
            }
        }

        return prefixSum;
    }
    
    public static void main(String[] args) {
        int[] sales = {10, 20, 15, 30, 25};
        int[] prefixSum = calculatePrefixSum(sales);
        System.out.print("PrefixSum[] = [");
        for (int i = 0; i < prefixSum.length; i++) {
            System.out.print(prefixSum[i]);
            if (i < prefixSum.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}