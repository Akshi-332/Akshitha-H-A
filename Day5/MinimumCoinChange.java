public class MinimumCoinChange {
    public static int minCoins(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        int[] coinCount = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
            coinCount[i] = 0; 
        }
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (dp[i] > dp[i - coin] + 1) {
                    dp[i] = dp[i - coin] + 1;
                    coinCount[i] = coin;
                }
            }
        }

        if (dp[amount] > amount) {
            return -1;
        } else {
            printCoins(coinCount, amount);
            return dp[amount];
        }
    }

    private static void printCoins(int[] coinCount, int amount) {
        int[] count = new int[coinCount.length];
        while (amount > 0) {
            int coin = coinCount[amount];
            if (coin == 0) break; 
            count[coin]++;
            amount -= coin;
        }

        System.out.println("Coins used:");
        for (int i = 1; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println("Coin: " + i + ", Count: " + count[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = minCoins(coins, amount);
        System.out.println("Minimum number of coins required: " + result);
    }
}