package Lab_10_Queue_Implementation_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section FA
public class StackUsingQueueExample {
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(555);
        stack.push(123);
        stack.push(322);
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
