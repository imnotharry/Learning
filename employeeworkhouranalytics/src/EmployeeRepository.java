import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

class EmployeeRepository {
    public static List<Employee> loadFromCSV(String filePath) throws IOException {
        List<Employee> employees = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get(filePath));

        for (int i = 1; i < lines.size(); i++) { // Skip header
            String[] parts = lines.get(i).split(",");
            String name = parts[0];
            String department = parts[1];
            List<Integer> hours = Arrays.stream(Arrays.copyOfRange(parts, 2, parts.length))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            employees.add(new Employee(name, department, hours));
        }

        return employees;
    }
}