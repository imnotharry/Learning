import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringExercisesTest {
    @Test
    void shouldReturnTheNumberOfB() {
        Assertions.assertEquals(2, StringExercises.countOfB("bombardier,Benz,biscuit, Banana"));
    }

    @Test
    void shouldReturnTheNumberOfHello() {
        Assertions.assertEquals(5, StringExercises.countHello("helloIhellodon'thelloknowhellobdak,dba,jdhello"));
    }

    @Test
    void shouldReturnNothingBecauseLesserThan5Character() {
        Assertions.assertEquals(0, StringExercises.countHello("abc"));
    }

    @Test
    void shouldReturnHelloFromTheBeginning() {
        Assertions.assertEquals(1, StringExercises.countHello("hello world"));
    }

    @Test
    void shouldReturnHelloFromTheEnd() {
        Assertions.assertEquals(1, StringExercises.countHello("Okay, hello!"));
    }

}
