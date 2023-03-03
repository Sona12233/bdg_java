package inheritance.aggregation.example1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Employee em1 = new Employee("Sona", 20);
        Employee em2 = new Employee("Lusine", 24);

        List<Employee> employees = new ArrayList<>();
        employees.add(em1);
        employees.add(em2);

        Bank b = new Bank();
        b.setEmployees(employees);
        for (Employee emp: b.getEmployees()) {
            System.out.println(emp.getName() + " " + emp.getAge());
        }
    }

}
