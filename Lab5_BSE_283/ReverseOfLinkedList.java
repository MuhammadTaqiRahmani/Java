package Lab5_BSE_283;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseOfLinkedList {
    public static void main(String[] args) {
        LinkedList<String> mylist = new LinkedList<>();
        mylist.add("Welcome ");
        mylist.add("in the ");
        mylist.add("world of ");
        mylist.add("programming ");
        for(int i = 0; i < mylist.size(); i++){
            System.out.println(mylist.get(i));
        }
        System.out.println("_______________________");
        System.out.println("In Reverse Order");
        System.out.println("_______________________");
        Collections.reverse(mylist);
        for(int i = 0; i < mylist.size(); i++){
            System.out.println(mylist.get(i));
        }
    }
}
