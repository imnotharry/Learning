import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPersonAndChef {

    @Test
    void shouldIntroduceThemselvesAsChef() {
        Chef chef = new Chef("Sarah", 35, Gender.WOMAN);
        chef.introduce();
        String expectedOutput = "Hi, my name is Sarah. I am 35. I am a WOMAN and a chef.";
    }

    @Test
    void shouldIntroduceThePerson() {
        String expectedName = "Alice";
        int expectedAge = 30;
        Gender expectedGender = Gender.WOMAN;
        Person person = new Person(expectedName, expectedAge, expectedGender);
        assertEquals(expectedName, person.getName());
        assertEquals(expectedAge, person.getAge());
        assertEquals(expectedGender, person.getGender());
    }
}
