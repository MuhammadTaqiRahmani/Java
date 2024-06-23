package Lab6_BSE_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
class Node {
    int data;
    Node2 next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MergeLinkedLists {
    public static Node2 mergeLists(Node2 head1, Node2 head2) {
        Node2 d = new Node2(0);
        Node2 current = d;

        Node2 runner1 = head1;
        Node2 runner2 = head2;

        while (runner1 != null && runner2 != null) {
            // Attach the smaller node to the merged list
            if (runner1.data < runner2.data) {
                current.next = runner1;
                runner1 = runner1.next;
            } else {
                current.next = runner2;
                runner2 = runner2.next;
            }
            current = current.next;
        }
        if (runner1 != null) {
            current.next = runner1;
        } else if (runner2 != null) {
            current.next = runner2;
        }

        return d.next;
    }

    public static void printList(Node2 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node2 data1 = new Node2(15);
        data1.next = new Node2(34);
        data1.next.next = new Node2(53);

        Node2 data2 = new Node2(21);
        data2.next = new Node2(42);
        data2.next.next = new Node2(63);

        System.out.println("List 1:");
        printList(data1);
        System.out.println("____________________");

        System.out.println("List 2:");
        printList(data2);
        System.out.println("____________________");

        Node2 mergedList = mergeLists(data1, data2);

        System.out.println("Merged List:");
        printList(mergedList);
    }
}

