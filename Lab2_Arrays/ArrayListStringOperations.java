//Muhammad Taqi Rahmani - 283 - F - BSE
package Lab2_Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListStringOperations {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a string to the list");
            System.out.println("2. Display all elements");
            System.out.println("3. Display the largest string");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a string to add: ");
                    String newString = scanner.nextLine();
                    stringList.add(newString);
                    break;
                case 2:
                    System.out.println("Elements in the list:");
                    for (String str : stringList) {
                        System.out.println(str);
                    }
                    break;
                case 3:
                    if (!stringList.isEmpty()) {
                        String largestString = findLargestString(stringList);
                        System.out.println("The largest string is: " + largestString);
                    } else {
                        System.out.println("The list is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }

    // Method to find the largest string in the list
    public static String findLargestString(ArrayList<String> list) {
        String largestString = list.get(0);

        for (String str : list) {
            if (str.length() > largestString.length()) {
                largestString = str;
            }
        }

        return largestString;
    }
}
