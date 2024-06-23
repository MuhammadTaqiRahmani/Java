package Student;

import java.util.Scanner;

public class StudentLinkedListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentLinkedList studentList = new StudentLinkedList();


        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter details for student " + i + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            Student student = new Student(name, rollNumber);
            studentList.insert(student);
        }

        // View the list
        System.out.println("List of Students:");
        studentList.viewList();

        // Insert at a specific position
        System.out.println("Enter details for a new student to insert:");
        System.out.print("Name: ");
        String newName = scanner.nextLine();
        System.out.print("Roll Number: ");
        int newRollNumber = scanner.nextInt();
        System.out.print("Enter the position to insert (1-11): ");
        int position = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Student newStudent = new Student(newName, newRollNumber);
        studentList.insertAtPosition(position, newStudent);

        // View the updated list
        System.out.println("List after insertion:");
        studentList.viewList();

        // Search for a student
        System.out.print("Enter the name to search: ");
        String searchName = scanner.nextLine();
        if (studentList.search(searchName)) {
            System.out.println("Student found.");
        } else {
            System.out.println("Student not found.");
        }

        // Delete a student
        System.out.print("Enter the name to delete: ");
        String deleteName = scanner.nextLine();
        studentList.delete(deleteName);

        // View the list after deletion
        System.out.println("List after deletion:");
        studentList.viewList();

        scanner.close();
    }
}