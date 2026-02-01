import java.util.*;

public class Task2 {

    public static List<String> reverseWords(List<String> words) {
        Objects.requireNonNull(words);

        List<String> result = new ArrayList<>(words.size());
        for (String w : words) {
            if (w == null) result.add(null);
            else result.add(new StringBuilder(w).reverse().toString());
        }
        return result;
    }
}
