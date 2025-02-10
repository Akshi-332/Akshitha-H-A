public class PostfixSumCalculator {
    public static int[] calculatePostfixSum(int[] fuel) {
        int m = fuel.length;
        int[] postfixSum = new int[m];
        for (int i = m - 1; i >= 0; i--) {
            if (i == m - 1) {
                postfixSum[i] = fuel[i];
            } else {
                postfixSum[i] = fuel[i] + postfixSum[i + 1];
            }
        }
        return postfixSum;
    }

    public static void main(String[] args) {
        int[] fuel = {5, 10, 3, 7, 8};

        int[] postfixSum = calculatePostfixSum(fuel);
        
        System.out.print("PostfixSum[] = [");
        for (int i = 0; i < postfixSum.length; i++) {
            System.out.print(postfixSum[i]);
            if (i < postfixSum.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}