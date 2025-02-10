public class sec_min {
    public static void main(String[] args) { 
        int[] originalArray = {20, 5, 1, 24, 29};
        int[] newArray = new int[10];
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        for (int i = originalArray.length; i < newArray.length; i++) {
            newArray[i] = Integer.MAX_VALUE; 
        }
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : newArray) {
            if (num < firstMin) {
                secondMin = firstMin; 
                firstMin = num;       
            } else if (num < secondMin && num != firstMin) {
                secondMin = num;     
            }
        }
        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("There is no second minimum value.");
        } else{
            System.out.println("First minimum value: " + firstMin);
            System.out.println("Second minimum value: " + secondMin);
        }
    }
}
