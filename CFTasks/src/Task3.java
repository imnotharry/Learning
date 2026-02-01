import java.util.*;

public class Task3 {

    public static List<String> palindromes(List<String> words) {
        Objects.requireNonNull(words);

        List<String> result = new ArrayList<>();
        for (String w : words) {
            if (w != null && isPalindrome(w)) {
                result.add(w);
            }
        }
        return result;
    }

    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
