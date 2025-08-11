package WordPattern;

import java.util.HashMap;
import java.util.Map;

public class WordPatternInString {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean result = wordPattern(pattern, s);
        System.out.println("Does the string follow the pattern? " + result);

        pattern = "abba";
        s = "dog cat cat fish";
        result = wordPattern(pattern, s);
        System.out.println("Does the string follow the pattern? " + result);

        pattern = "aaaa";
        s = "dog dog dog dog";
        result = wordPattern(pattern, s);
        System.out.println("Does the string follow the pattern? " + result);
    }

    static boolean wordPattern(String pattern, String s) {
        if (pattern.length() != s.split(" ").length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        int index = 0;
        for (String word : s.split(" ")) {
            char c = pattern.charAt(index);
            if (!map.containsKey(c)) {
                if (map.containsValue(word)) {
                    return false;
                }
                map.put(c, word);
            } else {
                if (!map.get(c).equals(word)) {
                    return false;
                }
            }
            index++;
        }
        return true;
    }
}
