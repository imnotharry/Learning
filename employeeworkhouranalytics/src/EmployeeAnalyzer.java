import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class EmployeeAnalyzer {
    public static void analyze(List<Employee> employees) {
        System.out.println("\n--- Total and Average Hours per Employee ---");
        employees.forEach(System.out::println);

        System.out.println("\n--- Average Weekly Hours per Department ---");
        Map<String, List<Employee>> byDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        byDept.forEach((dept, empList) -> {
            double avg = empList.stream().mapToInt(Employee::getTotalHours).average().orElse(0);
            System.out.println(dept + ": " + avg + " hrs/week");
        });

        System.out.println("\n--- Highest Total Hours (Global) ---");
        employees.stream().max(Comparator.comparing(Employee::getTotalHours))
                .ifPresent(e -> System.out.println(e.getName() + " with " + e.getTotalHours() + " hrs"));

        System.out.println("\n--- Highest Total Hours per Department ---");
        byDept.forEach((dept, empList) -> {
            empList.stream().max(Comparator.comparing(Employee::getTotalHours))
                    .ifPresent(e -> System.out.println(dept + ": " + e.getName() + " with " + e.getTotalHours() + " hrs"));
        });
    }
}