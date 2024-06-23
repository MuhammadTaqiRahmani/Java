package Lab_08_DoublyLinkedList_283_P_2;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.Scanner;
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedListDemo {
    private Node head;
    void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println(data + " inserted at the beginning.");
    }
    void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        System.out.println(data + " inserted at the end.");
    }
    void delete(int data) {
        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current != null) {
            if (current.prev != null) {
                current.prev.next = current.next;
            } else {
                head = current.next;
            }

            if (current.next != null) {
                current.next.prev = current.prev;
            }

            System.out.println(data + " deleted from the list.");
        } else {
            System.out.println(data + " not found in the list.");
        }
    }
    void search(int data) {
        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current != null) {
            System.out.println(data + " found in the list.");
        } else {
            System.out.println(data + " not found in the list.");
        }
    }
    void displayAll() {
        Node current = head;
        System.out.println("\nDisplaying all elements in the list:");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedListDemo doublyLinkedList = new DoublyLinkedListDemo();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Insert at the beginning");
            System.out.println("2. Insert at the end");
            System.out.println("3. Delete element");
            System.out.println("4. Search for an element");
            System.out.println("5. Display all elements");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert at the beginning: ");
                    int elementAtBeginning = scanner.nextInt();
                    doublyLinkedList.insertFirst(elementAtBeginning);
                    break;
                case 2:
                    System.out.print("Enter the element to insert at the end: ");
                    int elementAtEnd = scanner.nextInt();
                    doublyLinkedList.insertLast(elementAtEnd);
                    break;
                case 3:
                    System.out.print("Enter the element to delete: ");
                    int elementToDelete = scanner.nextInt();
                    doublyLinkedList.delete(elementToDelete);
                    break;
                case 4:
                    System.out.print("Enter the element to search: ");
                    int elementToSearch = scanner.nextInt();
                    doublyLinkedList.search(elementToSearch);
                    break;
                case 5:
                    doublyLinkedList.displayAll();
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
}
