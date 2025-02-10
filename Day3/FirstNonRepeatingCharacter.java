public class FirstNonRepeatingCharacter{
    public static void main(String[] args) {
        String input1 = "aabcc";
        String input2 = "akshi";

        System.out.println(findFirstNonRepeatingCharacter(input1));
        System.out.println(findFirstNonRepeatingCharacter(input2));
    }

    public static String findFirstNonRepeatingCharacter(String input) {
        int[] count = new int[256];
        for (char c : input.toCharArray()) {
            count[c]++;
        }
        for (char c : input.toCharArray()) {
            if (count[c] == 1) {
                return String.valueOf(c);
            }
        }
        return "1";
    }
}