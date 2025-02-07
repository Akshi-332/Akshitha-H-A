public class FirstDuplicate {
    public static void main(String[] args) {
        int[] originalArray = {12, 9, 5, 8, 4, 5, 10};
        Integer firstDuplicate = null;
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = i + 1; j < originalArray.length; j++) {
                if (originalArray[i] == originalArray[j]) {
                    firstDuplicate = originalArray[i]; 
                    break;
                }
            }
            if (firstDuplicate != null) {
                break; 
            }
        }
        if (firstDuplicate != null) {
            System.out.println("First duplicate value: " + firstDuplicate);
        } else {
            System.out.println("No duplicates found.");
        }
    }
}