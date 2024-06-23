package Lab_10_Queue_Implementation_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(4543);
        queue.offer(2212);
        queue.offer(3464);
        System.out.println("Queue elements: " + queue);
        System.out.println("Removed from the front: " + queue.poll());
        System.out.println("Removed from the front: " + queue.poll());
        System.out.println("Queue elements after removal: " + queue);
        System.out.println("Is queue empty? " + queue.isEmpty());
        queue.offer(421);
        queue.offer(511);
        System.out.println("Updated queue elements: " + queue);
        System.out.println("Front element (peek): " + queue.peek());
        System.out.println("Queue size: " + queue.size());
    }
}
