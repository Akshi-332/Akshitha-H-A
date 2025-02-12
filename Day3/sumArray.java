public class sumArray{
    public static double findSum(double[] arr,int index,int sum){
        if(index==arr.length){
            return sum;
        }else{
            sum+=arr[index];
            index++;
            return findSum(arr,index,sum);
    }
}
public static void main(String[] args) {
    double[] arr={25.8,56.8,1.2,3.1,2.7,22.7,9.8};
    findSum(arr,0,0);
    System.out.println("sum:"+findSum(arr,0,0));
}
}