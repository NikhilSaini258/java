package Collection;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueClass {
    private void MinHeap() {
        // A PriorityQueue is a min-heap by default.
        System.out.println("Min-Heap");

        // Create a PriorityQueue (min-heap)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add elements to the priority queue
        minHeap.add(30);
        minHeap.add(10);
        minHeap.add(20);

        System.out.println("Top element: " + minHeap.peek());

        // Print and remove elements from the heap
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());  // Output: 10, 20, 30
        }
    }

    private void MaxHeap() {
        // A PriorityQueue is a min-heap by default.
        System.out.println("Max-Heap");

        // Create a PriorityQueue with a custom comparator for max-heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add elements to the priority queue
        maxHeap.add(30);
        maxHeap.add(10);
        maxHeap.add(20);

        System.out.println("Top element: " + maxHeap.peek());

        // Print and remove elements from the heap
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());  // Output: 30, 20, 10
        }
    }

    public static void main(String[] args) {
        PriorityQueueClass obj = new PriorityQueueClass();
        obj.MinHeap();
        obj.MaxHeap();
    }
}
