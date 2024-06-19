public class Arrays {
    public static void main (String[] args) {
        // Array is always created on HEAP, as it is treated as object in java
        // Array is created for a single data-type. Arrays CANNOT be created for homogeneous data-type.

        // size should not be given on left side of equal operator, while declaring arrays in JAVA
        // arr1 below is just a reference created on STACK and actual memory is allocated over HEAP
        int arr1[] = new int[5];
        int len1 = arr1.length;

        int arr2[] = {1,2,3,4,5};
        int len2 = arr2.length;

        // using classic for loop to access array element
        for (int i = 0; i < len2; i++) {
            System.out.print (arr2[i] + " ");
        }

        // using for-each loop
        for (int each: arr2) {
            // here "each" is copy of array2 element. NOT reference
            System.out.print(each + " ");
        }
        System.out.println();

        // different ways to create an array
        int arr3[];
        arr3 = new int[5];

        int arr4[] = new int[5];
        int[] arr5 = new int[5];

        // 2D array
        int arr6[][] = new int[3][4];   // 3-rows, 4-columns
        int arr7[][] = {{1,2},{3,4},{5,6}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr7[i][j] + " ");
            }
            System.out.println();
        }

        // for-each loop for printing 2-D array
        for (int row[]: arr7) {
            for (int each: row) {
                System.out.print(each + " ");
            }
            System.out.println();
        }

        // we can have rows of different sizes in 2D array
        int arr8[][];
        arr8 = new int[3][];
        arr8[0] = new int[3];
        arr8[1] = new int[5];

        // sorting array
        java.util.Arrays.sort (arr2);
    }
    public void HelloWorld() {
        System.out.println("Hello from Arrays class");
    }
}
