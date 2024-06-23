//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
package Lab3_Recursion;
import java.util.Scanner;

public class Sum_Of_Numbers {
    public static int sumOfNumbers(int n){
        if(n <= 0){
            return 0;
        }
        else{
            return n + sumOfNumbers(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range:: ");
        int n = input.nextInt();
        int sum = sumOfNumbers(n);
        System.out.println("The sum of the total number is "+sum);
    }
}

