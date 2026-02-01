import java.util.*;

public class Task5 {

    public static <T> boolean hasDuplicates(List<T> list) {
        Objects.requireNonNull(list);

        Set<T> seen = new HashSet<>();
        for (T item : list) {
            if (!seen.add(item)) return true;
        }
        return false;
    }
}
