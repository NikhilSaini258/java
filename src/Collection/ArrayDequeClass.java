package Collection;

import java.util.ArrayDeque;

public class ArrayDequeClass {
    private void ArrayDequeImpl() {
        // Create an ArrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Add elements to both ends
        deque.addFirst(1);   // Adds 1 to the front
        deque.addLast(2);    // Adds 2 to the rear
        deque.addFirst(0);   // Adds 0 to the front

        // Print elements
        System.out.println("Deque after additions: " + deque); // Output: [0, 1, 2]

        // Remove elements from both ends
        System.out.println("Removed from front: " + deque.removeFirst()); // Output: 0
        System.out.println("Removed from rear: " + deque.removeLast());  // Output: 2

        // Peek at the remaining elements
        System.out.println("Front element: " + deque.peekFirst()); // Output: 1
        System.out.println("Rear element: " + deque.peekLast());  // Output: 1
    }
    public static void main(String[] args) {
        ArrayDequeClass obj = new ArrayDequeClass();
        obj.ArrayDequeImpl();
    }
}
