import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    void testEmployeeTotalHours() {
        Employee e = new Employee("John Doe", "IT", Arrays.asList(8, 8, 8, 8, 8));
        assertEquals(40, e.getTotalHours());
    }

    @Test
    void testEmployeeAverageHours() {
        Employee e = new Employee("John Doe", "IT", Arrays.asList(8, 8, 8, 8, 8));
        assertEquals(8.0, e.getAverageDailyHours(), 0.01);
    }

    @Test
    void testDepartmentAverage() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering", Arrays.asList(8, 8, 8, 8, 8)),
                new Employee("Bob", "Engineering", Arrays.asList(6, 6, 6, 6, 6))
        );
        double avg = employees.stream().mapToInt(Employee::getTotalHours).average().orElse(0);
        assertEquals(35.0, avg, 0.01);
    }

    @Test
    void testHighestTotalHours() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering", Arrays.asList(8, 8, 8, 8, 8)),
                new Employee("Bob", "Engineering", Arrays.asList(10, 10, 10, 10, 10))
        );
        Employee max = employees.stream().max(Comparator.comparing(Employee::getTotalHours)).orElse(null);
        assertNotNull(max);
        assertEquals("Bob", max.getName());
    }
}