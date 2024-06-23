package Lab6_BSE_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
class Node2 {
    int data;
    Node2 next;

    public Node2(int data) {
        this.data = data;
        this.next = null;
    }
}
public class CheckEmptyLinkedList {
    public static boolean isLinkedListEmpty(Node2 head) {
        return head == null;
    }

    public static void main(String[] args) {
        Node2 head = null;

        if (isLinkedListEmpty(head)) {
            System.out.println("The linked list is empty.");
        } else {
            System.out.println("The linked list is not empty.");
        }

        head = new Node2(1);
        head.next = new Node2(2);

        if (isLinkedListEmpty(head)) {
            System.out.println("The linked list is empty.");
        } else {
            System.out.println("The linked list is not empty.");
        }
    }
}

