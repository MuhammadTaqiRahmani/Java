//Muhammad Taqi Rahmani - 283 - F - BSE
package Lab2_Arrays;
import java.util.Vector;
public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector to store integers
        Vector<Integer> vector = new Vector<>();

        // Initialize the vector with 10 integers
        for (int i = 1; i <= 10; i++) {
            vector.add(i);
        }

        // Display all the integers in the vector
        System.out.println("Integers in the vector:");
        for (int value : vector) {
            System.out.print(value + " ");
        }

        // Calculate the sum of the integers
        int sum = 0;
        for (int value : vector) {
            sum += value;
        }

        System.out.println("\nSum of the integers: " + sum);
    }
}
