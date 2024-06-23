//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
package Lab3_Recursion;
import java.util.Scanner;
public class Descending_order {
    public static void descendingOrder(int k){
        if(k == 0){
            System.out.println("Program Completed");
        }
        else{
            System.out.println(k);
            descendingOrder(k-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for K:: ");
        int k = input.nextInt();
        descendingOrder(k);
    }

}
