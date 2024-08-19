package Collection;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class QueueClass {
    private void QueueUsingArrayDeque() {
        System.out.println("Queue using ArrayDeque");

        // Create a Queue using LinkedList
        Queue<Integer> queue = new ArrayDeque<>();

        // Enqueue elements (add elements to the queue)
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("Original Queue: " + queue);

        // Peek at the front of the queue without removing it
        System.out.println("Front of the queue: " + queue.peek());  // Output: 10

        // Dequeue elements (remove elements from the queue)
        System.out.println("Dequeued: " + queue.poll());  // Output: 10
        System.out.println("Dequeued: " + queue.poll());  // Output: 20

        // Check the queue after dequeuing
        System.out.println("Queue after dequeuing: " + queue);  // Output: [30,40,50]
    }

    private void QueueUsingLinkedList() {
        System.out.println("Queue using LinkedList");

        // Create a Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements (add elements to the queue)
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("Original Queue: " + queue);

        // Peek at the front of the queue without removing it
        System.out.println("Front of the queue: " + queue.peek());  // Output: 10

        // Dequeue elements (remove elements from the queue)
        System.out.println("Dequeued: " + queue.poll());  // Output: 10
        System.out.println("Dequeued: " + queue.poll());  // Output: 20

        // Check the queue after dequeuing
        System.out.println("Queue after dequeuing: " + queue);  // Output: [30,40,50]
    }

    public static void main(String[] args) {
        QueueClass obj = new QueueClass();
        obj.QueueUsingArrayDeque();
        obj.QueueUsingLinkedList();
    }
}
