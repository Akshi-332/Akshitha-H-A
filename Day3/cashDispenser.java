public class cashDispenser{
    public static int currentCount(int[] arr,int requested,int index,int count){
        if(requested<=0 || index<0)
        return requested > 0 ? -1 : count;
        else {
            if(requested>=arr[index]){
                requested-=arr[index];
                count++;
            }
            else{
                index--;
            }
            return currentCount(arr,requested,index,count);
        }
    }
        public static void main(String[] args) {
        int[] arr={100,200,500};
        int requested=8700;
        System.out.println("Number of notes: "+currentCount(arr,requested,arr.length-1,0));
    }
}
