package Lab_10_Queue_Implementation_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
public class DoubleEndedQueueExample {
    public static void main(String[] args) {
        DoubleEndedQueue deque = new DoubleEndedQueue();
        deque.addToFront(12);
        deque.addToRear(21);
        deque.addToFront(33);
        System.out.println("Removed from front: " + deque.removeFromFront());
        System.out.println("Removed from rear: " + deque.removeFromRear());
        System.out.println("-----------------------------------------");
        System.out.println("Deque size: " + deque.size());
        System.out.println("Is deque empty? " + deque.isEmpty());
    }
}
