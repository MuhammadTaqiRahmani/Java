package Lab4_BSE_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.Scanner;
public class BinarySearch {
    public static int binarySearch(int[] arr, int value) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = arr[mid];

            if (midValue == value) {
                return mid;
            } else if (midValue < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array:: ");
        int size = input.nextInt();
        int[] data = new int[size];

        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter an element:: ");
            int element = input.nextInt();
            data[i] = element;
        }

        System.out.print("Enter the target value to search:: ");
        int targetValue = input.nextInt();

        int result = binarySearch(data, targetValue);

        if (result != -1) {
            System.out.println("Target " + targetValue + " found at index " + result + ".");
        } else {
            System.out.println("Target " + targetValue + " not found.");
        }
    }
}

