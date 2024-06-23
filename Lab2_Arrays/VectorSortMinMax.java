package Lab2_Arrays;
import java.util.Vector;
import java.util.Collections;
public class VectorSortMinMax {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        // Add integer objects to the vector
        numbers.add(45);
        numbers.add(12);
        numbers.add(67);
        numbers.add(32);
        numbers.add(88);
        numbers.add(5);
        numbers.add(23);

        // Sort the vector
        Collections.sort(numbers);

        // Display the sorted vector
        System.out.println("Sorted Vector: " + numbers);

        // Display the largest and smallest numbers
        int smallest = numbers.firstElement();
        int largest = numbers.lastElement();

        System.out.println("Smallest Number: " + smallest);
        System.out.println("Largest Number: " + largest);
    }
}
