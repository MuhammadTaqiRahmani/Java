//Muhammad Taqi Rahmani - 283 - F - BSE
package Lab2_Arrays;
import java.util.Arrays;
public class Swapping_of_Arrays_1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        System.out.println("Original Array 1: " + Arrays.toString(array1));
        System.out.println("Original Array 2: " + Arrays.toString(array2));
        swapArrays(array1, array2);
        System.out.println("Array 1 after swapping: " + Arrays.toString(array1));
        System.out.println("Array 2 after swapping: " + Arrays.toString(array2));
    }
    public static void swapArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Arrays must be of the same length for swapping.");
            return;
        }
        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
    }
}

