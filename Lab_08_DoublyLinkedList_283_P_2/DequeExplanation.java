package Lab_08_DoublyLinkedList_283_P_2;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeExplanation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> linkedList = new LinkedList<>();
        while (true) {
            System.out.println("\n1. Add element at the beginning");
            System.out.println("2. Add element at the end");
            System.out.println("3. Remove element from the beginning");
            System.out.println("4. Remove element from the end");
            System.out.println("5. Display all elements");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add at the beginning: ");
                    String elementAtBeginning = scanner.nextLine();
                    addAtBeginning(linkedList, elementAtBeginning);
                    break;
                case 2:
                    System.out.print("Enter the element to add at the end: ");
                    String elementAtEnd = scanner.nextLine();
                    addAtEnd(linkedList, elementAtEnd);
                    break;
                case 3:
                    removeAtBeginning(linkedList);
                    break;
                case 4:
                    removeAtEnd(linkedList);
                    break;
                case 5:
                    displayAll(linkedList);
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
    private static void addAtBeginning(Deque<String> deque, String element) {
        deque.addFirst(element);
        System.out.println(element + " added at the beginning.");
    }
    private static void addAtEnd(Deque<String> deque, String element) {
        deque.addLast(element);
        System.out.println(element + " added at the end.");
    }
    private static void removeAtBeginning(Deque<String> deque) {
        if (!deque.isEmpty()) {
            String removedElement = deque.removeFirst();
            System.out.println(removedElement + " removed from the beginning.");
        } else {
            System.out.println("Deque is empty. No element to remove.");
        }
    }
    private static void removeAtEnd(Deque<String> deque) {
        if (!deque.isEmpty()) {
            String removedElement = deque.removeLast();
            System.out.println(removedElement + " removed from the end.");
        } else {
            System.out.println("Deque is empty. No element to remove.");
        }
    }
    private static void displayAll(Deque<String> deque) {
        System.out.println("\nDisplaying all elements in the deque:");
        for (String element : deque) {
            System.out.print(element + " <-> ");
        }
        System.out.println("null");
    }
}
