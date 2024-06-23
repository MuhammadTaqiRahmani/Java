package Lab3_prc_byuser;

import java.util.Arrays;
import java.util.Scanner;

public class MergingArrays_3 {
    public static int[] merge(int[] oldArray){
        Scanner input = new Scanner(System.in);
        int[] newArray = new int[5];
        for(int i = 0; i < newArray.length; i++){
            System.out.print("Enter an element:: ");
            int element = input.nextInt();
            newArray[i] = element;
        }
        int oldSize = oldArray.length;
        int newSize = newArray.length;
        int mergedSize = oldSize + newSize;
        int[] mergedArray = new int[mergedSize];
        for(int i = 0; i < oldSize; i++){
            mergedArray[i] = oldArray[i];
        }
        for(int i = 0; i < newSize; i++){
            mergedArray[oldSize + i] = newArray[i];
        }
        return mergedArray;
    }
    public static void main(String[] args) {
        int[] oldArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(oldArray));
        int[] ultraArray = merge(oldArray);
        System.out.println(Arrays.toString(ultraArray));
    }
}
