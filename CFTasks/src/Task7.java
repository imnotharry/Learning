import java.util.*;

public class Task7 {
    private final Set<String> emails = new LinkedHashSet<>();

    public void addEmail(String email) {
        String normalized = normalize(email);
        if (!emails.add(normalized)) {
            throw new IllegalArgumentException("Email already exists: " + normalized);
        }
    }

    public List<String> getEmails() {
        return new ArrayList<>(emails);
    }

    public void updateEmail(String oldEmail, String newEmail) {
        String oldN = normalize(oldEmail);
        String newN = normalize(newEmail);

        if (!emails.contains(oldN)) {
            throw new NoSuchElementException("Email not found: " + oldN);
        }
        if (!oldN.equals(newN) && emails.contains(newN)) {
            throw new IllegalArgumentException("New email already exists: " + newN);
        }

        emails.remove(oldN);
        emails.add(newN);
    }

    public void deleteEmail(String email) {
        String normalized = normalize(email);
        if (!emails.remove(normalized)) {
            throw new NoSuchElementException("Email not found: " + normalized);
        }
    }

    private String normalize(String email) {
        if (email == null) throw new IllegalArgumentException("Email must not be null");
        String trimmed = email.trim().toLowerCase(Locale.ROOT);
        if (trimmed.isEmpty()) throw new IllegalArgumentException("Email must not be empty");
        return trimmed;
    }

    //Task tests (1-9)
    public static void main(String[] args) {
        System.out.println(" Task 1-9 test ");

        // Task 1
        System.out.println("Task 1:");
        System.out.println(Task1.intersection(
                List.of(1, 2, 2, 3, 4), List.of(2, 4, 4, 6)
        ));
        System.out.println();
        // Task 2
        System.out.println("Task 2:");
        System.out.println(Task2.reverseWords(List.of("hello", "abc", "")));
        System.out.println();
        // Task 3
        System.out.println("Task 3:");
        System.out.println(Task3.palindromes(List.of("racecar", "abba", "abc", "a")));
        System.out.println();
        // Task 4
        System.out.println("Task 4:");
        System.out.println(Task4.uniqueCharCount("aabcc"));
        System.out.println();
        // Task 5
        System.out.println("Task 5:");
        System.out.println(Task5.hasDuplicates(List.of(1, 2, 3, 3)));
        System.out.println();
        // Task 6
        System.out.println("Task 6:");
        System.out.println(Task6.compareUniqueCounts(
                List.of(1, 2, 2, 3), List.of(7, 7, 8)
        ));
        System.out.println();
        // Task 7
        System.out.println("Task 7:");
        Task7 mgr = new Task7();
        mgr.addEmail("Test@Example.com");
        mgr.addEmail("hello@site.com");
        System.out.println("Emails: " + mgr.getEmails());
        mgr.updateEmail("test@example.com", "new@example.com");
        System.out.println("After update: " + mgr.getEmails());
        mgr.deleteEmail("hello@site.com");
        System.out.println("After delete: " + mgr.getEmails());
        System.out.println();
        // Task 8
        System.out.println("Task 8:");
        Task8<Integer> sll = new Task8<>();
        sll.addLast(10);
        sll.addLast(20);
        sll.addFirst(5);
        System.out.println("size=" + sll.size() + ", get(0)=" + sll.get(0) + ", get(2)=" + sll.get(2));
        sll.remove(10);
        System.out.println("After remove(10): size=" + sll.size() + ", get(1)=" + sll.get(1));
        System.out.println();
        // Task 9
        System.out.println("Task 9:");
        Task9<String> dll = new Task9<>();
        dll.addLast("a");
        dll.addLast("b");
        dll.addFirst("start");
        System.out.println("size=" + dll.size() + ", get(0)=" + dll.get(0) + ", get(2)=" + dll.get(2));
        System.out.println("removeLast=" + dll.removeLast());
        System.out.println("After removeLast: size=" + dll.size() + ", get(1)=" + dll.get(1));

    }
}
