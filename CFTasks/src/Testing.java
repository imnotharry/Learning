import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Testing {
    //Task 1 test
    @Test
    void intersection_basicCase() {
        assertEquals(List.of(2, 3),
                Task1.intersection(List.of(1, 2, 3), List.of(2, 3, 4)));
    }

    @Test
    void intersection_removesDuplicatesInResult() {
        assertEquals(List.of(2),
                Task1.intersection(List.of(2, 2, 2), List.of(2, 3)));
    }

    //Task 2 test
    @Test
    void reverseWords_reversesEachWord() {
        assertEquals(List.of("olleh", "cba"),
                Task2.reverseWords(List.of("hello", "abc")));
    }

    @Test
    void reverseWords_keepsNullAsNull() {
        assertEquals(Arrays.asList(null, "ba"),
                Task2.reverseWords(Arrays.asList(null, "ab")));
    }

    //Task 3 test
    @Test
    void palindromes_filtersCorrectly() {
        assertEquals(List.of("abba", "racecar"),
                Task3.palindromes(List.of("abba", "abc", "racecar")));
    }

    @Test
    void palindromes_ignoresNulls() {
        assertEquals(List.of("a"),
                Task3.palindromes(Arrays.asList(null, "a", null, "ab")));
    }

    //Task 4 test
    @Test
    void uniqueCharCount_countsDistinctCharacters() {
        assertEquals(3, Task4.uniqueCharCount("aabcc")); // a,b,c
    }

    @Test
    void uniqueCharCount_emptyStringIsZero() {
        assertEquals(0, Task4.uniqueCharCount(""));
    }

    //Task 5 test
    @Test
    void hasDuplicates_trueWhenDuplicateExists() {
        assertTrue(Task5.hasDuplicates(List.of(1, 2, 2, 3)));
    }

    @Test
    void hasDuplicates_falseWhenAllUnique() {
        assertFalse(Task5.hasDuplicates(List.of(1, 2, 3)));
    }

    //Task 6 test
    @Test
    void compareUniqueCounts_firstHasMoreUnique_returns1() {
        assertEquals(1,
                Task6.compareUniqueCounts(List.of(1, 2, 3), List.of(1, 1)));
    }

    @Test
    void compareUniqueCounts_equalUnique_returns0() {
        assertEquals(0,
                Task6.compareUniqueCounts(List.of(1, 2, 2), List.of(3, 3, 4)));
    }

    //Task 7 test
    @Test
    void addEmail_addsAndNormalizes() {
        Task7 mgr = new Task7();
        mgr.addEmail("  Test@Example.com ");
        assertEquals(List.of("test@example.com"), mgr.getEmails());
    }

    @Test
    void updateEmail_changesAddress() {
        Task7 mgr = new Task7();
        mgr.addEmail("a@b.com");
        mgr.updateEmail("a@b.com", "c@d.com");
        assertEquals(List.of("c@d.com"), mgr.getEmails());
    }

    //Task 8 test
    @Test
    void addLastAndGet_returnsCorrectOrder() {
        Task8<Integer> list = new Task8<>();
        list.addLast(10);
        list.addLast(20);
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
    }

    @Test
    void remove_existingValue_returnsTrueAndShrinks() {
        Task8<Integer> list = new Task8<>();
        list.addLast(1);
        list.addLast(2);
        assertTrue(list.remove(1));
        assertEquals(1, list.size());
        assertEquals(2, list.get(0));
    }

    //Task 9 test
    @Test
    void addFirstAddLast_getWorks() {
        Task9<String> list = new Task9<>();
        list.addFirst("b");
        list.addFirst("a");
        list.addLast("c");
        assertEquals("a", list.get(0));
        assertEquals("c", list.get(2));
    }

    @Test
    void removeLast_returnsLastElement() {
        Task9<Integer> list = new Task9<>();
        list.addLast(1);
        list.addLast(2);
        assertEquals(2, list.removeLast());
        assertEquals(1, list.size());
        assertEquals(1, list.get(0));
    }
}
