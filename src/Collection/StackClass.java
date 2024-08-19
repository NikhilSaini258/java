package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class StackClass {
    private void StackUsingArrayDeque() {
        System.out.println("Stack using ArrayDeque");
        // Create a stack using ArrayDeque
        Deque<Integer> stack = new ArrayDeque<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Stack Original: " + stack);

        // Peek the top element
        System.out.println("Top element: " + stack.peek());  // Output: 50

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop());  // Output: 50
        System.out.println("Popped: " + stack.pop());  // Output: 40

        // Check the stack after popping elements
        System.out.println("Stack after pops: " + stack);
    }

    private void StackUsingLinkedList() {
        System.out.println("Stack using LinkedList");
        // Create a stack using ArrayDeque
        Deque<Integer> stack = new LinkedList<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Stack Original: " + stack);

        // Peek the top element
        System.out.println("Top element: " + stack.peek());  // Output: 50

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop());  // Output: 50
        System.out.println("Popped: " + stack.pop());  // Output: 40

        // Check the stack after popping elements
        System.out.println("Stack after pops: " + stack);
    }

    public static void main(String[] args) {
        StackClass obj = new StackClass();
        obj.StackUsingArrayDeque();
        obj.StackUsingLinkedList();
    }
}
