public class debit {
    public static void main(String[] args) {
       
        int[] transactions = {900, -1500, 600, -1200, 400};

        int debitCount = 0;
        for (int transaction : transactions) {
            if (transaction < 0) { 
                debitCount++;
            }
        }
        System.out.println("Number of debit transactions: " + debitCount);
    }
}
