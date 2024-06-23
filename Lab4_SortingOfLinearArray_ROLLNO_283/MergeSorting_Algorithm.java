package Lab4_SortingOfLinearArray_ROLLNO_283;
import java.util.Arrays;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.Random;
public class MergeSorting_Algorithm {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("_______________________________________________________");
        System.out.println("Original Array: " + Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println("_______________________________________________________");
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
            System.out.println("Iteration: " + Arrays.toString(arr));
        }
    }

    static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[middle + 1 + j];
        }
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
