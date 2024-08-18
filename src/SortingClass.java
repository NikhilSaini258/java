import java.util.*;
import java.util.Arrays;

public class SortingClass {
    private void SortPrimitiveType (){
        System.out.println("SortPrimitiveType");
        int[] arr = {2,1,4,3,6,5,8,7,9,0};
        System.out.println("Original Arr (int): " + Arrays.toString(arr));

        Arrays.sort (arr);
        System.out.println("Arrays.sort() [Default]: " + Arrays.toString(arr));


        // Sorting partial range
        int[] arr2 = {2,1,4,3,6,5,8,7,9,0};
        System.out.println("Original Arr2: " + Arrays.toString(arr2));
        Arrays.sort (arr2, 2, 7);        // sort range [fromIndex, toIndex)
        System.out.println("Arrays.sort (arr2, 2, 7): " + Arrays.toString(arr2));

        // We can't directly use the Arrays.sort() method for DESC order, as it sorts in ascending order by default.
        // However, you can achieve descending order by first sorting the array in ascending order and then reversing it.
        // Or, we can use collections
        Integer[] arr3 = {2,1,4,3,6,5,8,7,9,0};
        System.out.println("Original Arr (Integer): " + Arrays.toString(arr));

        Arrays.sort (arr3);
        System.out.println("Arrays.sort() [Default]: " + Arrays.toString(arr3));

        Arrays.sort (arr3, Collections.reverseOrder());
        System.out.println("Arrays.sort() [DESC]: " + Arrays.toString(arr3));
    }

    private void SortArrayList() {
        System.out.println("SortArrayList");
        List<Integer> arr = new ArrayList<>(Arrays.asList(2,1,4,3,6,5,8,7,9,0));
        System.out.println("Original Array: " + arr);

        Collections.sort (arr);
        System.out.println("ASC sorting (Default): " + arr);

        Collections.sort (arr, Collections.reverseOrder());
        System.out.println("DESC sorting: " + arr);
    }

    private void SortLinkedList() {
        System.out.println("SortLinkedList");
        List<Integer> arr = new LinkedList<>(Arrays.asList(2,1,4,3,6,5,8,7,9,0));
        System.out.println("Original Array: " + arr);

        Collections.sort (arr);
        System.out.println("ASC sorting (Default): " + arr);

        Collections.sort (arr, Collections.reverseOrder());
        System.out.println("DESC sorting: " + arr);
    }

    public static void main(String[] args) {
        SortingClass obj = new SortingClass();
        obj.SortPrimitiveType();
        obj.SortArrayList();
        obj.SortLinkedList();
    }
}
