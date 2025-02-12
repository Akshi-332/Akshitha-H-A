public class secmin_dbl{
    public static void main(String[] args) { 
        double[] originalArray = {12.5, 9.2,4.5,19.5,2.5,56.8};
        double[] newArray = new double[10];
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        for (int i = originalArray.length; i < newArray.length; i++) {
            newArray[i] = Double.MAX_VALUE; 
        }
        double firstMin = Double.MAX_VALUE;
        double secondMin = Double.MAX_VALUE;
        for (double num : newArray) {
            if (num < firstMin) {
                secondMin = firstMin; 
                firstMin = num;       
            } else if (num < secondMin && num != firstMin) {
                secondMin = num;     
            }
        }
        System.out.println("First minimum value: " + firstMin);
        System.out.println("Second minimum value: " + (secondMin == Double.MAX_VALUE ? "Not found" : secondMin));
    }
}
