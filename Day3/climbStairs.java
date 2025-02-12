public class climbStairs{
    public static int findPossibility(int total){
        if(total<=0) return 0;
        else if(total==1) return 1;
        else if(total==2) return 2;
        else return findPossibility(total-1)+findPossibility(total-2);
    }
    public static void main(String[] args) {
        int total=5;
        System.out.println("Possibility: "+findPossibility(total));
    }
}
