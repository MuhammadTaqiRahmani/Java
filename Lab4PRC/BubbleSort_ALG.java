package Lab4PRC;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort_ALG {
    public static void bubbleSorting(int[] array){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < (array.length - 1); j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array:: ");
        int size = input.nextInt();
        int[] data = new int[size];
        for(int i = 0; i < data.length; i++){
            System.out.print("Enter an element:: ");
            int element = input.nextInt();
            data[i] = element;
        }bubbleSorting(data);

    }
}
