package Lab5_BSE_283;
import java.util.LinkedList;
import java.util.Scanner;
public class OperationsInLinkedList {
    public static int view(LinkedList link){
        for(int i = 0; i < link.size(); i++){
            System.out.println(link.get(i));

        }
        return -1;
    }
    public static void searching(LinkedList<Integer> link){
        System.out.print("Element for searching:: ");
        Scanner input = new Scanner(System.in);
        int element = input.nextInt();
        boolean found = false;
        for(int j = 0; j < link.size(); j++){
            if(link.get(j)==element){
                System.out.println("Found at index no "+j);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in the linked list.");
        }
    }

    public static void insertion(LinkedList<Integer> link){
        view(link);
        link.add(5,44);
        System.out.println("_______");
        view(link);
    }
    public static void deletion(LinkedList<Integer> link){
        view(link);
        link.remove(3);
        System.out.println("___________");
        view(link);
    }


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> data = new LinkedList<Integer>();
        for(int i= 0; i < 20; i++){
            data.add(i);
        }
        System.out.println("1_view\n2_insertion\n3_deletion\n4_searching");
        System.out.print("Enter the decision:: ");
        int dec = input.nextInt();
        if(dec == 1){
            System.out.println("Viewing the linkedlist");
            view(data);
        }
        else if(dec == 4){
            view(data);
            searching(data);
        }
        else if(dec == 2){
            insertion(data);
        }
        else if(dec == 3){
            deletion(data);
        }

    }
}
