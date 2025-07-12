import java.util.*;

public class Employee {
    private String name;
    private String department;
    private List<Integer> dailyHours;

    public Employee(String name, String department, List<Integer> dailyHours) {
        this.name = name;
        this.department = department;
        this.dailyHours = new ArrayList<>(dailyHours);
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public List<Integer> getDailyHours() {
        return dailyHours;
    }

    public int getTotalHours() {
        return dailyHours.stream().mapToInt(Integer::intValue).sum();
    }

    public double getAverageDailyHours() {
        return getTotalHours() / (double) dailyHours.size();
    }

    @Override
    public String toString() {
        return name + " (" + department + "): " + getTotalHours() + " hrs/week, Avg: " + getAverageDailyHours();
    }
}