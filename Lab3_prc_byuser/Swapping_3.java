package Lab3_prc_byuser;

import java.util.Arrays;

public class Swapping_3 {
    public static void swappingOfArrays(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            System.out.println("Length of both arrays must be equal");
        }else{
            for(int i = 0; i < arr1.length; i++){
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] students_data = {1, 2, 3, 4, 5, 6};
        int[] teachers_data = {10, 20, 30, 40, 50, 60};
        System.out.println("Arrays before swapping");
        System.out.println(Arrays.toString(students_data));
        System.out.println(Arrays.toString(teachers_data));

        swappingOfArrays(students_data, teachers_data);

        System.out.println("Arrays after swapping");
        System.out.println(Arrays.toString(students_data));
        System.out.println(Arrays.toString(teachers_data));
    }
}
