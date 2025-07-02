import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPersonAndChef {
    @Test
    void testConstructorAndInheritance() {
        Chef chef = new Chef("Bob", 40, Gender.MAN);

        assertEquals("Bob", chef.getName());
        assertEquals(40, chef.getAge());
        assertEquals(Gender.MAN, chef.getGender());
    }

    @Test
    void testCookMethod() {
        Chef chef = new Chef("Clara", 28, Gender.WOMAN);

        String result = chef.cook("pasta");
        assertEquals("Clara has cooked some pasta.", result);
    }
}
