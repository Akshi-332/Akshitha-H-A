import java.util.Scanner;
public class FiboViaDP{
    public static int series(int n){
        if(n<=1)
            return 1;
        int[] poss = new int[n+1];
        poss[0]=0;poss[1]=1;
        for(int index = 2; index<=n; index++){
            poss[index] = poss[index-1]+poss[index-2];
        }

        return poss[n];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonnaci series till ");
        int n = scanner.nextInt();
        System.out.println(series(n));
        scanner.close();
    }
}