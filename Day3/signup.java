import java.util.Scanner;
import java.util.regex.Pattern;
public class signup{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String patternforname = "^[A-Z][a-z]{3,50}$";
        String patternforadhaar = "^[0-9]{12}$";
        String patternforemail = "^[a-zA-Z0-9_.]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,4}$";
        String pancardno = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$";
        String username="Akshi";
        String fullname="Akshitha";
        String adhaarno="563214872526";
        String emailid="Akshi12@gmail.com";
        String pancardno1="UHKIL5678L";
        System.out.println("Is full name is valid:"+Pattern.matches(patternforname,fullname));
        System.out.println("Is username is valid:"+Pattern.matches(patternforname,username));
        System.out.println("Is adhaar no is valid:"+Pattern.matches(patternforadhaar,adhaarno));
        System.out.println("Is email id is valid:"+Pattern.matches(patternforemail,emailid));
        System.out.println("Is pancard no is valid:"+Pattern.matches(pancardno,pancardno1));
        sc.close();
    }
}