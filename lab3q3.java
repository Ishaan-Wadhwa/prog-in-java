import java.util.*;

public class lab3q3 
{
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop elements off the stack
        while (!stack.empty()) {
            int element = stack.pop();
            System.out.println("Popped from stack: " + element);
        }

        // Create a queue
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Remove elements from the queue
        while (!queue.isEmpty()) {
            int element = queue.remove();
            System.out.println("Removed from queue: " + element);
        }
    }
}
