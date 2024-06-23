//Muhammad Taqi Rahmani - 283 - F - BSE
//Shafin ALam - 252 - F - BSE
package Lab2_Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee implements Comparable<Employee>{
    private int empId;
    private String empName;
    private String empGender;
    private int yearOfJoining;
    public Employee(int empId, String empName, String empGender, int yearOfJoining) {
        this.empId = empId;
        this.empName = empName;
        this.empGender = empGender;
        this.yearOfJoining = yearOfJoining;
    }
    public int getEmpId() {
        return empId;
    }
    public String getEmpName() {
        return empName;
    }
    public String getEmpGender() {
        return empGender;
    }
    public int getYearOfJoining() {
        return yearOfJoining;
    }
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.yearOfJoining, other.yearOfJoining);
    }
    @Override
    public String toString() {
        return "Employee ID: " + empId +
                ", Name: " + empName +
                ", Gender: " + empGender +
                ", Year of Joining: " + yearOfJoining;
    }
}

