public class Vowels{
    public static void main(String[] args) {
        String message="Hello AI";
        int countvow=0;
        int countcon=0;
        message=message.toLowerCase();
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)=='a'||message.charAt(i)=='e'||message.charAt(i)=='i'||message.charAt(i)=='o'||message.charAt(i)=='u'){
                countvow++;
            }else if(message.charAt(i)!=' ')
                countcon++;
            }
            System.out.println("Number of vowels:"+countvow);
            System.out.println("Number of consonants:"+countcon);
    }
}
