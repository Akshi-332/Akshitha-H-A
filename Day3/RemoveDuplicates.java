import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class RemoveDuplicates{
    public static String removeDuplicateCharacters(String input) {
        Set<Character> uniqueChars = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (uniqueChars.add(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        String output = removeDuplicateCharacters(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}