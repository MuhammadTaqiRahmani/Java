package Lab3_prc_byuser;

import java.util.Arrays;

public class Swapping {
    public static void swappingOfArray(int arr1[], int arr2[]){
        if(arr1.length != arr2.length){
            System.out.println("Length of Arrays must be equal");
        }else{
            for(int i = 0; i < arr1.length; i++){
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {10, 20, 30, 40};
        System.out.println("Arrays before swapping");
        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
        System.out.println("\n");
        for(int j = 0; j < arr2.length; j++){
            System.out.println(arr2[j]);
        }
        System.out.println("Arrays after swapping");
        swappingOfArray(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
