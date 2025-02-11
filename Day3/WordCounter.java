import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class WordCounter{
    public static Map<String, Integer> countWords(String paragraph) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = paragraph.split("\\s+");
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        return wordCountMap;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String input = scanner.nextLine();
        scanner.close();
        Map<String, Integer> result = countWords(input);
        System.out.println(result);
    }
}