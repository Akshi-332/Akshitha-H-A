import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class ECommereceViaHT{
    public static void main(String[] args) {
        Amazon myAmazon = new Amazon();
        myAmazon.placeOrder("2021-09-01", "Laptop");
        myAmazon.placeOrder("2021-09-01", "Mobile");
        myAmazon.placeOrder("2021-09-02", "Tablet");

        System.out.println("My Orders: " + myAmazon.myOrders);
        String specificDate = "2021-09-01";
        myAmazon.displayItemsForDate(specificDate);
    }
}

class Amazon {
    Map<String, List<String>> myOrders = new Hashtable<>();

    public void placeOrder(String date, String item) {
        List<String> currentItem = myOrders.getOrDefault(date, new ArrayList<>());
        currentItem.add(item);
        myOrders.put(date, currentItem);
    }

    public void displayItemsForDate(String date) {
        List<String> items = myOrders.get(date);
        if (items != null && !items.isEmpty()) {
            System.out.println("Items ordered on " + date + ": " + items);
        } else {
            System.out.println("No items ordered on " + date);
        }
    }
}