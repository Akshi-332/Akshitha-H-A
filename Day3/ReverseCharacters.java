public class ReverseCharacters {
    public static void main(String[] args) {
        String message = "aabbc";
        String reversedMessage = reverse(message);
        System.out.println(reversedMessage);
    }

    public static String reverse(String message) {
        if (message.length() <= 1) {
            return message;
        }
        return reverse(message.substring(1)) + message.charAt(0);
    }
}
