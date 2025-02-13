import java.util.*;

public class AnagramGrouper{
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();
        
        for (String s : strs) {
            String key = sortString(s);
            anagramsMap.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        
        return new ArrayList<>(anagramsMap.values());
    }

    private static String sortString(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> output = groupAnagrams(strs);
        System.out.println(output);
    }
}