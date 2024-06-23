package Lab3_prc_byuser;

import java.util.Arrays;
import java.util.Scanner;

public class MergingArrays {
    public static int[] merge(int[] arr1){
//        creating an array
        int[] emptyArray = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < emptyArray.length; i++){
            System.out.print("Enter an element:: ");
            int element = input.nextInt();
            emptyArray[i] = element;
        }
//        declaring the size of empty array(which is ultra array)
        int sizeOfEmpty = emptyArray.length;
        int sizeOfNew = arr1.length;
        int ultra = sizeOfNew + sizeOfEmpty;
        int[] ultraArray = new int[ultra];

//        copy elements of arr1 from main to ultra array
        for(int i = 0; i < sizeOfNew; i++){
            ultraArray[i] = arr1[i];
        }

//        copy elements of empty array which has elements from user input in ultra array
        for(int i = 0; i < sizeOfEmpty; i++){
            ultraArray[sizeOfNew + i] = emptyArray[i];
        }
        return ultraArray;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Array 1");
        System.out.println(Arrays.toString(arr1));
//       for printing the ultra array
        int[] mergedArray = merge(arr1);
        System.out.println(Arrays.toString(mergedArray));
    }
}

//package Lab3_prc_byuser;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class MergingArrays {
//    public static int[] merge(int[] arr1) {
//        int[] emptyArray = new int[5];
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < emptyArray.length; i++) {
//            System.out.print("Enter an element:: ");
//            int element = input.nextInt();
//            emptyArray[i] = element;
//        }
//
//        int sizeOfEmpty = emptyArray.length;
//        int sizeOfNew = arr1.length;
//        int ultra = sizeOfNew + sizeOfEmpty;
//        int[] ultraArray = new int[ultra];
//
//        for (int i = 0; i < sizeOfNew; i++) {
//            ultraArray[i] = arr1[i];
//        }
//        for (int i = 0; i < sizeOfEmpty; i++) {
//            ultraArray[sizeOfNew + i] = emptyArray[i];
//        }
//
//        return ultraArray;
//    }
//
//    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 4, 5};
//        System.out.println("Array 1");
//        System.out.println(Arrays.toString(arr1));
//
//        int[] mergedArray = merge(arr1);
//        System.out.println("Merged Array");
//        System.out.println(Arrays.toString(mergedArray));
//    }
//}
