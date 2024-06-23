package Lab3_prc_byuser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringInList_2 {
    private static List<String> stringList = new ArrayList<>();
//    Creating a List by user input
    public static List<String> listOfString(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range of List:: ");
        int range = input.nextInt();
        input.nextLine();
        for(int i = 0; i < range; i++){
            System.out.print("Enter an element:: ");
            String element = input.nextLine();

            stringList.add(element);
        }
        return stringList;
    }
//    Creating a method to display result
     public static void displayResult(){
         System.out.println("Result");
         System.out.println(stringList);
     }
//     Creating a method to find the largest string
    public static String largestString(){
        String largestString = "";
        for(int i = 0; i < stringList.size(); i++){
            String str = stringList.get(i);
            if(largestString.length() < str.length()){
                largestString = str;
            }
        }
        return largestString;
    }
//    Main method
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1_ Add string to List\n2_ Display the result\n3_ Largest String\n4_ Exit");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i <= 10; i++){
            System.out.print("Decision::");
            int decision = input.nextInt();
            if(decision == 1){
                System.out.println(listOfString());
            }else if(decision == 2){
                StringInList_2 obj = new StringInList_2();
                obj.displayResult();
            }else if(decision == 3){
                System.out.println("Largest String");
                System.out.println(largestString());
            }else if(decision == 4){
                break;
            }else{
                System.out.println("Sorry,\nPlease choose a number according to the Menu");
            }
        }

    }

}
