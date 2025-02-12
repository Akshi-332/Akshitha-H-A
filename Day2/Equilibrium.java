public class Equilibrium{
    public static void main(String[] args){
        //int[] myStatement = {10,20,30,10,10,10,30,20,10,10};
        int[] myStatement = {-7, 1, 5, 2, -4, 3, 0};
        int sum =0;
        for(int index =0; index < myStatement.length; index++){
            sum += myStatement[index];
        }
        System.out.println("sum is " + sum);
        int partialSum = 0;
        for(int index =0; index < myStatement.length; index++){
            sum -= myStatement[index];
            if(partialSum == sum){
                System.out.println("Equilibrium is at " + index);
                break;
            }
            partialSum += myStatement[index];
            }
}
}