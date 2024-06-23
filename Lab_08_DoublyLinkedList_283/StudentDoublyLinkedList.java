package Lab_08_DoublyLinkedList_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
class Student {
    String name;
    int rollNumber;
    String department;

    Student(String name, int rollNumber, String department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
    }
}

public class StudentDoublyLinkedList {
    public static void main(String[] args) {
        Deque<Student> studentList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Insert at the beginning");
            System.out.println("2. Insert at the end");
            System.out.println("3. Display all data");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    insertFirst(studentList, getStudentDetails(scanner));
                    break;
                case 2:
                    insertLast(studentList, getStudentDetails(scanner));
                    break;
                case 3:
                    displayAll(studentList);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void insertFirst(Deque<Student> studentList, Student student) {
        studentList.addFirst(student);
        System.out.println("Student record inserted at the beginning.");
    }

    private static void insertLast(Deque<Student> studentList, Student student) {
        studentList.addLast(student);
        System.out.println("Student record inserted at the end.");
    }

    private static void displayAll(Deque<Student> studentList) {
        System.out.println("\nDisplaying all student records:");
        for (Student student : studentList) {
            System.out.println("Name: " + student.name);
            System.out.println("Roll Number: " + student.rollNumber);
            System.out.println("Department: " + student.department);
            System.out.println("------------------------");
        }
    }

    private static Student getStudentDetails(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        return new Student(name, rollNumber, department);
    }
}
