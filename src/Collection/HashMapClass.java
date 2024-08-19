package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapClass {
    private void HashMap() {
        System.out.println("-----------------> HashMap <-----------------");
        
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // 1. put(K key, V value) - Insert key-value pairs into the HashMap
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // 2. get(Object key) - Retrieve the value associated with a key
        System.out.println("Value for 'Apple': " + map.get("Apple")); // Output: 10

        // 3. containsKey(Object key) - Check if a key exists in the HashMap
        System.out.println("Contains key 'Banana'? " + map.containsKey("Banana")); // Output: true

        // 4. containsValue(Object value) - Check if a value exists in the HashMap
        System.out.println("Contains value 30? " + map.containsValue(30)); // Output: true

        // 5. remove(Object key) - Remove a key-value pair from the HashMap
        map.remove("Orange");
        System.out.println("Map after removing 'Orange': " + map); // Output: {Apple=10, Banana=20}

        // 6. size() - Get the number of key-value pairs in the HashMap
        System.out.println("Size of the map: " + map.size()); // Output: 2

        // 7. isEmpty() - Check if the HashMap is empty
        System.out.println("Is the map empty? " + map.isEmpty()); // Output: false

        // 8. keySet() - Get a Set of all keys in the HashMap
        System.out.println("Keys: " + map.keySet()); // Output: [Apple, Banana]

        // 9. values() - Get a Collection of all values in the HashMap
        System.out.println("Values: " + map.values()); // Output: [10, 20]

        // 10. entrySet() - Get a Set of all key-value pairs in the HashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 11. putIfAbsent(K key, V value) - Insert the key-value pair if the key is not already present
        map.putIfAbsent("Banana", 50); // Won't replace the existing value
        map.putIfAbsent("Grapes", 40); // Will add a new key-value pair
        System.out.println("Map after putIfAbsent: " + map); // Output: {Apple=10, Banana=20, Grapes=40}

        // 12. replace(K key, V value) - Replace the value for a given key
        map.replace("Banana", 25);
        System.out.println("Map after replace: " + map); // Output: {Apple=10, Banana=25, Grapes=40}

        // 13. clear() - Remove all key-value pairs from the HashMap
        map.clear();
        System.out.println("Map after clear: " + map); // Output: {}
    }

    private void HashLinkedList() {
        System.out.println("-----------------> HashLinkedList <-----------------");

        // Create a LinkedHashMap
        Map<String, Integer> map = new LinkedHashMap<>();

        // 1. put(K key, V value) - Insert key-value pairs into the LinkedHashMap
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // 2. get(Object key) - Retrieve the value associated with a key
        System.out.println("Value for 'Apple': " + map.get("Apple")); // Output: 10

        // 3. containsKey(Object key) - Check if a key exists in the LinkedHashMap
        System.out.println("Contains key 'Banana'? " + map.containsKey("Banana")); // Output: true

        // 4. containsValue(Object value) - Check if a value exists in the LinkedHashMap
        System.out.println("Contains value 30? " + map.containsValue(30)); // Output: true

        // 5. remove(Object key) - Remove a key-value pair from the LinkedHashMap
        map.remove("Orange");
        System.out.println("Map after removing 'Orange': " + map); // Output: {Apple=10, Banana=20}

        // 6. size() - Get the number of key-value pairs in the LinkedHashMap
        System.out.println("Size of the map: " + map.size()); // Output: 2

        // 7. isEmpty() - Check if the LinkedHashMap is empty
        System.out.println("Is the map empty? " + map.isEmpty()); // Output: false

        // 8. keySet() - Get a Set of all keys in the LinkedHashMap
        System.out.println("Keys: " + map.keySet()); // Output: [Apple, Banana]

        // 9. values() - Get a Collection of all values in the LinkedHashMap
        System.out.println("Values: " + map.values()); // Output: [10, 20]

        // 10. entrySet() - Get a Set of all key-value pairs in the LinkedHashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 11. putIfAbsent(K key, V value) - Insert the key-value pair if the key is not already present
        map.putIfAbsent("Banana", 50); // Won't replace the existing value
        map.putIfAbsent("Grapes", 40); // Will add a new key-value pair
        System.out.println("Map after putIfAbsent: " + map); // Output: {Apple=10, Banana=20, Grapes=40}

        // 12. replace(K key, V value) - Replace the value for a given key
        map.replace("Banana", 25);
        System.out.println("Map after replace: " + map); // Output: {Apple=10, Banana=25, Grapes=40}

        // 13. clear() - Remove all key-value pairs from the LinkedHashMap
        map.clear();
        System.out.println("Map after clear: " + map); // Output: {}
    }

    public static void main(String[] args) {
        HashMapClass obj = new HashMapClass();
        obj.HashMap();
        obj.HashLinkedList();
    }
}
