public class Methods {
    // In Java, all parameters in Methods are passed by value. It is the only method supported
    // When Objects (which are on heap) are passed, only address is passed to methods. Now it act as pass by reference of C++
    // But if you carefully see, it is still pass by value, here value is address is copied to Methods arguments

    // Making below method static since it is called from static main method
    // Static methods will call only static methods
    static int maxStatic (int a, int b) {
        // a & b are passed by value
        return a > b ? a : b;
    }
    int max (int a, int b) {
        // a & b are passed by value
        return a > b ? a : b;
    }
    /* Method OverLoading. There are two ways to overload the method in java
        1. By changing number of arguments
        2. By changing the data-type of arguments
        3. By changing the sequence of arguments data-types
    */
    float max (float a, float b) {
        return a > b ? a : b;
    }
    // -----------------------------------------------------------------------------------------------------------------
    // Static methods will call only static methods
    static void PrintStatic(int[] arr) {
        // arr is reference (since arr is object), which is holding the address of actual array created on heap
        // So, any changes make here for arr, those changes will be reflected in calling function also.
        arr[0] = 25;
        for (int it: arr) {
            System.out.print(it + " ");
        }
        System.out.println();
    }
    void Print(int[] arr) {
        // arr is reference, which is holding the address of actual array created on heap
        // So, any changes make here for arr, those changes will be reflected in calling function also.
        for (int it: arr) {
            System.out.print(it + " ");
        }
        System.out.println();
    }
    // -----------------------------------------------------------------------------------------------------------------

    // Variable no of arguments
    void printVariableArguments (int ... arr) {
        // Here both are similar but different also, "int ... arr" & "int[] arr"
        // We can catch variable arguments & array in syntax "int ... arr"
        // But syntax "int[] arr" is only used when array is passed

        // But all variable arguments data-type should be same. We cannot have different data-types for different argument
        for (int it: arr) {
            System.out.print(it + " ");
        }
        System.out.println();
    }
    public static void main (String[] args) {
        int a = 10, b = 15;

        System.out.println("Static Method: " + maxStatic(a, b));        // calling static method from static method

        Methods obj = new Methods();
        System.out.println("Non-Static Method: " + obj.max(a, b));      // calling non-static method using class object

        int[] arr = {1,2,3,4,5};
        PrintStatic(arr);
        obj.Print(arr);

        obj.printVariableArguments(1,2,3,4,5);                      // Syntax "int ... arr"
        obj.printVariableArguments(new int[] {6,7,8,9,10});             // Syntax "int[] arr"

    }
    public void HelloWorld() {
        System.out.println("Hello from Methods class");
    }
}
