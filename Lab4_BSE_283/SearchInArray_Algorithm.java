package Lab4_BSE_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.Arrays;
import java.util.Scanner;

public class SearchInArray_Algorithm {
    public static void linearSearch(int[] array){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an element for searching:: ");
        int search = input.nextInt();
        for(int i = 0; i < array.length; i++){
            if(array[i] == search){
                System.out.print("Found "+array[i]+" at index ");
                System.out.println(i);
            }
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
        }
        System.out.println(Arrays.toString(data));
        linearSearch(data);

    }
}
