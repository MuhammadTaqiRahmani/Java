package Lab4_BSE_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.Arrays;
import java.util.Scanner;

public class ConditionalArraySearch_Algorithm {
    public static void linearSearch(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] < 10000){
                System.out.println(array[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array:: ");
        int size = input.nextInt();
        int[] data = new int[size];
        for(int i = 0; i < data.length; i++){
            data[i] = (int) (Math.random()*1000000);
        }
        System.out.println(Arrays.toString(data));
        System.out.println("Balance less than 10000");
        linearSearch(data);
    }
}
