//Muhammad Taqi Rahmani - 283 - F - BSE
package Lab2_Arrays;
import java.util.Scanner;
public class HashCodeExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Calculate the hash code of the user input
        int hashCode = input.hashCode();

        System.out.println("Hash code for '" + input + "': " + hashCode);

        scanner.close();
    }
}
