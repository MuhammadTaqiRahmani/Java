//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
package Lab3_Recursion;
public class Count_Of_Digits {
    public static int countDigits(int n) {
//        setting base case
        if (n < 10) {
            return 1;
        }
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 12345;
        int digitCount = countDigits(number);

        System.out.println("Number of digits in " + number + " is " + digitCount);
    }
}



//import java.util.Scanner;
//
//public class Count_Of_Digits {
//    public static int countingOfDigits(int n){
//        String number_in_string = Integer.toString(n);
//
//        if(n <= 0){
//            return 0;
//        }else{
//            return countingOfDigits(number_in_string.charAt(0)+number_in_string.charAt(number_in_string.length()-1));
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the range:: ");
//        int n = input.nextInt();
//        int sum = countingOfDigits(n);
//        System.out.println(sum);
//
//    }
//}
