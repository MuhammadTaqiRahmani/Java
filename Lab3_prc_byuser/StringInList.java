package Lab3_prc_byuser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringInList {
    private static List<String> stringList = new ArrayList<>();
    public static List<String> listOfString(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range of the list:: ");
        int range = input.nextInt();
        input.nextLine();
        for(int i = 0; i < range; i++){
            System.out.print("Enter an element:: ");
            String element = input.nextLine();
            stringList.add(element);
        }
        return stringList;

    }
    public void displayResult(){
        System.out.println("Result");
        System.out.println(stringList);
    }
    public static String largestString(){
        String largestOne = "";
        for(int i = 0; i < stringList.size(); i++){
            String str = stringList.get(i);
            if(str.length() > largestOne.length()){
                largestOne = str;
            }
        }
        return largestOne;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i <= 10; i++){
            System.out.println("Menu\n1- Add strings to the list\n2- Display all the elements\n3- Display the largest string\n4- Exit");
            System.out.print("Decision:: ");
            int decision = input.nextInt();
            if(decision == 1){
                listOfString();
            } else if (decision == 2) {
                StringInList a = new StringInList();
                a.displayResult();
            }else if (decision == 3){
                System.out.println(largestString());
            }else if (decision == 4){
                break;
            }else{
                System.out.println("Sorry,\npick the number according to the Menu!");
            }
        }

    }
}


