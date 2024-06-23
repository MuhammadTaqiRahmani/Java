package Lab4_SortingOfLinearArray_ROLLNO_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.Scanner;
import java.util.Arrays;
public class MergeSort_LastProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int size = scanner.nextInt();
        int[] data = new int[size];
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }
        System.out.println("Original List: " + Arrays.toString(data));
        mergeSort(data, 0, size - 1);
        System.out.println("Sorted List: " + Arrays.toString(data));
    }
    static void mergeSort(int[] data, int left, int right) {
        if (left < right) {
            int midpoint = (left + right) / 2;
            mergeSort(data, left, midpoint);
            mergeSort(data, midpoint + 1, right);
            merge(data, left, midpoint, right);
        }
    }
    static void merge(int[] data, int left, int midpoint, int right) {
        int var1 = midpoint - left + 1;
        int var2 = right - midpoint;

        int[] leftArray = new int[var1];
        int[] rightArray = new int[var2];

        for (int i = 0; i < var1; i++) {
            leftArray[i] = data[left + i];
        }
        for (int j = 0; j < var2; j++) {
            rightArray[j] = data[midpoint + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < var1 && j < var2) {
            if (leftArray[i] <= rightArray[j]) {
                data[k] = leftArray[i];
                i++;
            } else {
                data[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < var1) {
            data[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < var2) {
            data[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
