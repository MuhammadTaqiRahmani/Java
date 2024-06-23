package Lab2_Arrays;
//Shafin ALam - 252 - F - BSE
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeSortingExample {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Rashid", "Male", 2015));
        employeeList.add(new Employee(102, "Alishba", "Female", 2016));
        employeeList.add(new Employee(103, "Hamza", "Male", 2016));
        employeeList.add(new Employee(104, "Shafin", "Male", 2017));

        // Sorting employees by year of joining using Comparable
        Collections.sort(employeeList);

        System.out.println("Employees sorted by year of joining (Comparable):");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        // Sorting employees by year of joining using a custom Comparator
        Collections.sort(employeeList, new JoiningYearComparator());

        System.out.println("\nEmployees sorted by year of joining (Comparator):");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }

    static class JoiningYearComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return Integer.compare(emp1.getYearOfJoining(), emp2.getYearOfJoining());
        }
    }
}
