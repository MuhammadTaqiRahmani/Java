package Lab_09_Stack_283;

import java.util.Scanner;
import java.util.Stack;

public class ColoredBallStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a stack to store colored balls
        Stack<String> ballStack = new Stack<>();

        // Input colored balls into the stack
        System.out.print("Enter colored balls separated by '->' (e.g., Yellow->Green->Red): ");
        String input = scanner.nextLine();
        String[] balls = input.split("->");

        // Push balls onto the stack in reverse order
        for (int i = balls.length - 1; i >= 0; i--) {
            ballStack.push(balls[i]);
        }

        // Display the original stack
        System.out.print("Original stack: ");
        displayStack(ballStack);

        // Ask the user for the chosen color
        System.out.print("Enter the chosen color: ");
        String chosenColor = scanner.next();

        // Create a temporary stack to store the balls without the chosen color
        Stack<String> tempStack = new Stack<>();

        // Remove the chosen color from the original stack
        while (!ballStack.isEmpty()) {
            String ball = ballStack.pop();
            if (!ball.equals(chosenColor)) {
                tempStack.push(ball);
            }
        }

        // Display the updated stack without the chosen color
        System.out.print("Updated stack: ");
        displayStack(tempStack);

        scanner.close();
    }

    // Helper method to display the contents of the stack
    private static void displayStack(Stack<String> stack) {
        for (String ball : stack) {
            System.out.print(ball + "->");
        }
        System.out.println(" (end)");
    }
}
