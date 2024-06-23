package Lab_10_Queue_Implementation_283;
import java.util.LinkedList;
import java.util.Queue;
class StackUsingQueue {
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();
    public void push(int item) {
        queue1.offer(item);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        int poppedElement = queue1.poll();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return poppedElement;
    }

    public boolean isEmpty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}

