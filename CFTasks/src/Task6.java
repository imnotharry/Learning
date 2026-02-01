import java.util.*;

public class Task6 {

    public static <T> int compareUniqueCounts(List<T> a, List<T> b) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);

        int uniqueA = new HashSet<>(a).size();
        int uniqueB = new HashSet<>(b).size();

        if (uniqueA > uniqueB) return 1;
        if (uniqueB > uniqueA) return 2;
        return 0;
    }
}
