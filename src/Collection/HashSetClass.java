package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetClass {
    private void HashSet() {
        System.out.println("-----------------> HashSet <-----------------");
        // Create a HashSet
        Set<String> hashSet = new HashSet<>();

        // Add elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Mango");
        hashSet.add("Guava");
        System.out.println("HashSet after additions: " + hashSet);

        // Check if an element is in the set
        System.out.println("Contains 'Banana': " + hashSet.contains("Banana")); // true

        // Remove an element
        // Removing an Element Not Present: The set remains unchanged, and the method returns false.
        hashSet.remove("Banana");
        System.out.println("HashSet after removal: " + hashSet);

        // Check size of the set
        System.out.println("Size of HashSet: " + hashSet.size()); // 2

        // Check if the set is empty
        System.out.println("Is HashSet empty? " + hashSet.isEmpty()); // false

        // Clear all elements
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);

        Set<String> set2 = new HashSet<>();
        set2.add("Three");
        set2.add("Four");
        set2.add("Five");

        // Add all elements from set2 to set1
        hashSet.addAll(set2);
        System.out.println("hashSet after addAll: " + hashSet);

        // Remove all elements of set2 from set1
        hashSet.removeAll(set2);
        System.out.println("hashSet after removeAll: " + hashSet);

        // Retain only elements of set1 that are in set2
        hashSet.add("Three");
        hashSet.retainAll(set2);
        System.out.println("hashSet after retainAll: " + hashSet);

        // Check if set1 contains all elements of set2
        System.out.println("hashSet contains all elements of set2: " + hashSet.containsAll(set2));   // false

    }

    private void HashSetLinkedList() {
        System.out.println("-----------------> LinkedHashSet <-----------------");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");

        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Using iterator
        Iterator<String> iterator = linkedHashSet.iterator();
        System.out.println("Elements in HashSet using iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using toArray
        Object[] array = linkedHashSet.toArray();
        System.out.println("Elements in HashSet using toArray:");
        for (Object element : array) {
            System.out.println(element);
        }
    }

    private void TreeSet() {
        System.out.println("-----------------> TreeSet <-----------------");

        // Create a TreeSet with natural ordering
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);

        // Print the TreeSet
        System.out.println("TreeSet: " + treeSet); // Output: [5, 10, 15, 20]

        // Check if an element is in the set
        System.out.println("Contains 10: " + treeSet.contains(10)); // true

        // Remove an element
        treeSet.remove(15);
        System.out.println("TreeSet after removing 15: " + treeSet); // Output: [5, 10, 20]

        // Get the first and last elements
        System.out.println("First element: " + treeSet.first()); // Output: 5
        System.out.println("Last element: " + treeSet.last()); // Output: 20
    }

    public static void main(String[] args) {
        HashSetClass obj = new HashSetClass();
        obj.HashSet();
        obj.HashSetLinkedList();
        obj.TreeSet();
    }
}
