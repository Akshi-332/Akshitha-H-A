public class debit {
    public static void main(String[] args) {
       // Initialize an array of transactions, where negative values represent debit transactions
        int[] transactions = {900, -1500, 600, -1200, 400};
        // Initialize a counter to keep track of the number of debit transactions
        int debitCount = 0;
        // Iterate through each transaction in the transactions array
        for (int transaction : transactions) {
            // Check if the transaction is a debit (negative value)
            if (transaction < 0) { 
                // Increment the debit count if the transaction is negative
                debitCount++;
            }
        }
        // Print the total number
        System.out.println("Number of debit transactions: " + debitCount);
    }
}
