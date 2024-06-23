package Lab3_prc_byuser;

import java.util.Arrays;

public class Swapping_2 {
    public static void swappingOfArray(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            System.out.println("Swapping not possible,\n length of both arrays must be equal");
        }else{
            for(int i = 0; i < arr1.length; i++){
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {10, 20, 30, 40, 50};

        System.out.println("Arrays before swapping");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        swappingOfArray(arr1, arr2);
        System.out.println("Arrays after swapping");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
