package Lab_08_DoublyLinkedList_283_P_2;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class UnsortedAndSortedLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> unsortedList = new LinkedList<>();
        List<Integer> sortedList = new LinkedList<>();
        while (true) {
            System.out.println("\n1. Insert into Unsorted List");
            System.out.println("2. Insert into Sorted List");
            System.out.println("3. Display Unsorted List");
            System.out.println("4. Display Sorted List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert into the Unsorted List: ");
                    int unsortedElement = scanner.nextInt();
                    insertIntoUnsortedList(unsortedList, unsortedElement);
                    break;
                case 2:
                    System.out.print("Enter the element to insert into the Sorted List: ");
                    int sortedElement = scanner.nextInt();
                    insertIntoSortedList(sortedList, sortedElement);
                    break;
                case 3:
                    displayList("Unsorted List", unsortedList);
                    break;
                case 4:
                    displayList("Sorted List", sortedList);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void insertIntoUnsortedList(List<Integer> unsortedList, int element) {
        unsortedList.add(element);
        System.out.println(element + " inserted into the Unsorted List.");
    }
    private static void insertIntoSortedList(List<Integer> sortedList, int element) {
        int index = Collections.binarySearch(sortedList, element);
        if (index < 0) {
            index = -index - 1;
        }
        sortedList.add(index, element);
        System.out.println(element + " inserted into the Sorted List.");
    }
    private static void displayList(String listName, List<Integer> list) {
        System.out.println("\nDisplaying " + listName + ":");
        for (Integer element : list) {
            System.out.print(element + " -> ");
        }
        System.out.println("null");
    }
}
