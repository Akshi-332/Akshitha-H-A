import java.util.Arrays;

public class BiddingQuickSelect{
    
    public static int findKthLargest(int[] arr, int users){
        int selected = arr.length-users;
        return quickSelect(arr, 0, arr.length-1, selected);
    }
    public static int quickSelect(int[] arr, int start, int end, int k){
        if(start==end)
            return arr[start];
        int pivot = getPivotal(arr, start, end);
        if(pivot==k)
            return arr[pivot];
        else if(pivot<k)
            return quickSelect(arr, pivot+1, end, k);
        else
            return quickSelect(arr, start, pivot, k);
    }
    public static int getPivotal(int[] arr, int start, int end){
        int init = start;
        int pivotData = arr[end];
        for(int j=start;j<end;j++){
            if(arr[j]<pivotData){
                int temp = arr[j];
                arr[j]=arr[init];
                arr[init]=temp;
                init++;
            }
        }
        int temp = arr[end];
        arr[end]=arr[init];
        arr[init]=temp;
        return init;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 3;
        System.out.println("Kth Largest Element: " + findKthLargest(nums, k));
        System.out.println(Arrays.toString(nums));
    }

}