import java.util.Arrays;

public class QucikSort{
    public static int getPivotPoint(int[] arr, int start, int end){
        int init = start-1;
        int pivotData = arr[end];
        for(int j=start;j<end;j++){
            if(arr[j]<pivotData){
                init++;
                int temp = arr[j];
                arr[j]=arr[init];
                arr[init]=temp;
            }
        }
        int temp = arr[end];
        arr[end] = arr[init+1];
        arr[init+1] = temp;
        return init+1;
    }
    public static void sort(int[] arr, int start, int end){
        if(start<end){
            int piPoint = getPivotPoint(arr, start, end);
            sort(arr,start,piPoint-1);
            sort(arr,piPoint+1, end);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,9,6,4,5};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
