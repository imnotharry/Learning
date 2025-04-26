import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringExercisesTest {
    @Test
    void shouldReturnTheNumberOfB() {
        Assertions.assertEquals(2, StringExercises.countOfB("bombardier,Benz,biscuit, Banana"));
    }

    @Test
    void shouldReturnTheNumberOfHello() {
        Assertions.assertEquals(10, StringExercises.countHello("HelloIHellodon'tHelloknowHellobdak,dba,jdHello", "helloIhellodon'thelloknowhellobdak,dba,jdhello"));
    }
}
