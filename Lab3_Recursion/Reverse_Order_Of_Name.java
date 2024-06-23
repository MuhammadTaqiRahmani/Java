//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
package Lab3_Recursion;
import java.util.Scanner;

public class Reverse_Order_Of_Name {
    public static String reverseFullName(String name) {
        if (name.length() <= 1) {
            return name;
        } else {
            return reverseFullName(name.substring(1)) + name.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Full Name:: ");
        String fullName = input.nextLine();
        String reversedName = reverseFullName(fullName);
        System.out.println("Original Name: " + fullName);
        System.out.println("Reversed Name: " + reversedName);
    }
}



//public class Reverse_Of_Name {
//    public static reverseOrderOfName(String name){
//        if (name.length() <= 1) {
//            return name;
//        } else {
//            // Recursive case: reverse the substring after the first character and
//            // concatenate the first character at the end
//            return reverseFullName(name.substring(1)) + name.charAt(0);
//        }
//    }
//
//    public static void main(String[] args) {
//        String name = "John Doe"; // Replace with your full name
//        String reversedName = reverseOrderOfName(name);
//        System.out.println("Original Name: " + name);
//        System.out.println("Reversed Name: " + reversedName);
//    }
//}