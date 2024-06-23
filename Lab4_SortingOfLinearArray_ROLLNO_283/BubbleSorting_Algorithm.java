package Lab4_SortingOfLinearArray_ROLLNO_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.Scanner;

public class BubbleSorting_Algorithm {
    public static void sorting(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 1; j < array.length - i - 1; j++){
                if(array[i] > array[j]){
                    //            swapping
                    int temp_var = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp_var;
                }
            }
        }
        System.out.println("Sorted Array");
        for(int k = 0; k < array.length; k++){
            System.out.println(array[k]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Size of Array:: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter an element:: ");
            int element = input.nextInt();
            array[i] = element;
        }
        for(int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }
        BubbleSorting_Algorithm obj = new BubbleSorting_Algorithm();
        obj.sorting(array);
    }
}
