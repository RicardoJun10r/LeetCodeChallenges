package ValidAnagram;

public class Anagram {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        String s = "anagram";
        String t = "nagaram";
        boolean result = anagram.isAnagram(s, t);
        System.out.println("Is \"" + s + "\" an anagram of \"" + t + "\"? " + result);

        s = "rat";
        t = "car";
        result = anagram.isAnagram(s, t);
        System.out.println("Is \"" + s + "\" an anagram of \"" + t + "\"? " + result);
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (t.indexOf(c) == -1) {
                    return false;
                } else {
                    t = t.replaceFirst(String.valueOf(c), "");
                }
            }
            return t.isEmpty();
        }
    }
}