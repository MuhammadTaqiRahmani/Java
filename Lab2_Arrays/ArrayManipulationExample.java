//Muhammad Taqi Rahmani - 283 - F - BSE
package Lab2_Arrays;
import java.util.Arrays;
public class ArrayManipulationExample {
    private int[] array;
    public ArrayManipulationExample(int[] initialArray) {
        this.array = initialArray;
    }
    public void displayArray() {
        System.out.println("Array: " + Arrays.toString(array));
    }
    public void swapArrays(int[] arr1, int[] arr2) {
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
    public void mergeArrays(int[] arrToMerge) {
        int mergedLength = array.length + arrToMerge.length;
        int[] mergedArray = new int[mergedLength];

        for (int i = 0; i < array.length; i++) {
            mergedArray[i] = array[i];
        }

        for (int i = 0; i < arrToMerge.length; i++) {
            mergedArray[array.length + i] = arrToMerge[i];
        }
        array = mergedArray;
    }
    public static void main(String[] args) {
        int[] initialArray = {1, 2, 3, 4};
        int[] arrayToMerge = {5, 6, 7, 8};

        ArrayManipulationExample example = new ArrayManipulationExample(initialArray);

        example.displayArray();

        example.swapArrays(initialArray, arrayToMerge);
        System.out.println("Arrays after swapping:");
        example.displayArray();

        example.mergeArrays(arrayToMerge);
        System.out.println("Arrays after merging:");
        example.displayArray();
    }
}
