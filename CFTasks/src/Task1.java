import java.util.*;

public class Task1 {

    public static <T> List<T> intersection(List<T> a, List<T> b) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);

        Set<T> bSet = new HashSet<>(b);
        Set<T> added = new HashSet<>();
        List<T> result = new ArrayList<>();

        for (T item : a) {
            if (bSet.contains(item) && added.add(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
