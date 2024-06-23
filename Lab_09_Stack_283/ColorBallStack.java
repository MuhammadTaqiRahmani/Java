package Lab_09_Stack_283;

import java.util.Scanner;
import java.util.Stack;

public class ColorBallStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> colorStack = new Stack<>();
        System.out.println("Enter color balls, separated by ',': ");
        String input = scanner.nextLine();
        String[] colors = input.split(",");
        for (String color : colors) {
            colorStack.push(color.toLowerCase());
        }
        System.out.println("Original stack: " + colorStack);

        System.out.println("Enter your preferred color: ");
        String preferredColor = scanner.nextLine().toLowerCase();
        Stack<String> updatedStack = new Stack<>();
        while (!colorStack.isEmpty()) {
            String currentColor = colorStack.pop();
            if (!currentColor.equals(preferredColor)) {
                updatedStack.push(currentColor);
            }
        }
        System.out.println("Updated stack: " + updatedStack);

        scanner.close();
    }
}
