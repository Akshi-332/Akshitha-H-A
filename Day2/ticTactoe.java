public class ticTactoe{
    public static void main(String[] args) {
        String initial = "XX00X";
        int move=0;
        for(int index=0;index<initial.length();){
            if(initial.charAt(index)=='X'){
                index+=3;
                move++;
            }
            else
                index++;
        }
        System.out.println(move);
    }
}