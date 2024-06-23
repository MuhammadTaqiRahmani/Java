package Lab_08_DoublyLinkedList_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.Scanner;
class Employee {
    String name;
    String designation;
    String department;
    String companyName;
    Employee(String name, String designation, String department, String companyName) {
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.companyName = companyName;
    }
}
class Node {
    Employee data;
    Node next;

    Node(Employee data) {
        this.data = data;
        this.next = null;
    }
}
class EmployeeLinkedList {
    private Node head;
    void insertFirst(Employee data) {
        Node newNode2 = new Node(data);
        newNode2.next = head;
        head = newNode2;
    }
    void insertLast(Employee data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }
    void insertMiddle(Employee data, String afterEmployeeName) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current != null && !current.data.name.equals(afterEmployeeName)) {
            current = current.next;
        }
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Employee not found to insert after.");
        }
    }
    void search(String employeeName) {
        Node current = head;
        while (current != null) {
            if (current.data.name.equals(employeeName)) {
                System.out.println("Employee found:");
                System.out.println("Name: " + current.data.name);
                System.out.println("Designation: " + current.data.designation);
                System.out.println("Department: " + current.data.department);
                System.out.println("Company Name: " + current.data.companyName);
                return;
            }
            current = current.next;
        }

        System.out.println("Employee not found.");
    }
    void displayAll() {
        Node current = head;
        while (current != null) {
            System.out.println("Name: " + current.data.name);
            System.out.println("Designation: " + current.data.designation);
            System.out.println("Department: " + current.data.department);
            System.out.println("Company Name: " + current.data.companyName);
            System.out.println("------------------------");
            current = current.next;
        }
    }
}

public class EmployeeLinkedListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeLinkedList employeeList = new EmployeeLinkedList();

        while (true) {
            System.out.println("\n1. Insert at the beginning");
            System.out.println("2. Insert at the end");
            System.out.println("3. Insert at the middle");
            System.out.println("4. Search for an employee");
            System.out.println("5. Display all data");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    employeeList.insertFirst(getEmployeeDetails(scanner));
                    break;
                case 2:
                    employeeList.insertLast(getEmployeeDetails(scanner));
                    break;
                case 3:
                    System.out.print("Enter the name of the employee after which you want to insert: ");
                    String afterEmployeeName = scanner.nextLine();
                    employeeList.insertMiddle(getEmployeeDetails(scanner), afterEmployeeName);
                    break;
                case 4:
                    System.out.print("Enter the name of the employee to search: ");
                    String searchEmployeeName = scanner.nextLine();
                    employeeList.search(searchEmployeeName);
                    break;
                case 5:
                    employeeList.displayAll();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static Employee getEmployeeDetails(Scanner scanner) {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter designation: ");
        String designation = scanner.nextLine();
        System.out.print("Enter department: ");
        String department = scanner.nextLine();
        System.out.print("Enter company name: ");
        String companyName = scanner.nextLine();

        return new Employee(name, designation, department, companyName);
    }
}
