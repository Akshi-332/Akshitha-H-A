public class SalesAnalyzer {
    public static void main(String[] args) {
        // Example sales data for 7 days
        int[] sales = {150, 200, 300, 250, 400, 350, 450};

        // Call the method to find the day with the highest sales
        int dayWithHighestSales = findDayWithHighestSales(sales);

        // Output the result
        System.out.println("The day with the highest sales is: Day " + (dayWithHighestSales + 1));
    }

    public static int findDayWithHighestSales(int[] sales) {
        int maxSales = sales[0];
        int dayIndex = 0;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                dayIndex = i;
            }
        }

        return dayIndex; // Return the index of the day with the highest sales
    }
}