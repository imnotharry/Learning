import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "c:/docs/employee_hours.csv";
        try {
            List<Employee> employees = EmployeeRepository.loadFromCSV(path);
            EmployeeAnalyzer.analyze(employees);
        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}
