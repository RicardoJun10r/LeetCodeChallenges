package FindTheIndexOfTheFirstOccurrenceInAString;

public class FirstOccurrence {

    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "leeto"));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }

        if (needle.isEmpty()) {
            return 0;
        }

        return haystack.replace(needle, "*").indexOf("*");
    }
}