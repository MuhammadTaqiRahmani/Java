package Lab_10_Queue_Implementation_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.LinkedList;

class DoubleEndedQueue {
    private LinkedList<Integer> deque = new LinkedList<>();
    public void addToFront(int item) {
        deque.addFirst(item);
    }
    public void addToRear(int item) {
        deque.addLast(item);
    }
    public int removeFromFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return deque.removeFirst();
    }
    public int removeFromRear() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return deque.removeLast();
    }
    public boolean isEmpty() {
        return deque.isEmpty();
    }
    public int size() {
        return deque.size();
    }
}

