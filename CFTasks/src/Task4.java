import java.util.*;

public class Task4 {

    public static int uniqueCharCount(String s) {
        Objects.requireNonNull(s);

        Set<Character> unique = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            unique.add(s.charAt(i));
        }
        return unique.size();
    }
}
