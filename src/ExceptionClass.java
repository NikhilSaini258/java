// Exception is of two types:
// 1. Unchecked exception: These are not forced by JVM. Users can use them based on requirement
// 2. Checked Exception: These exceptions are forced by JVM. Example: when we open a file, then we need to add exceptional handling for a case if file is not found

import java.io.FileReader;

// We can declare our own exception class
class MyException extends Exception {
    @Override
    public String toString() {
        return "MyException class exception is raised";
    }

    @Override
    public String getMessage() {
        return "MyException class exception is raised";
    }
}

public class ExceptionClass {
    // throw -> actually throwing exception
    // throws -> added to fun signature representing that fun can throw exception, &
    //           calling function must add try-catch block for calling this function OR
    //           calling function need to add throws in its own fun signature
    public static int calculateAreaOfRectangle(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            // instead of throwing base class "Exception", we can also throw User defined exception
            throw new Exception("Sides cannot be negative");
        }
        return a * b;
    }

    // try with resources
    public static int readFile (String filename) throws Exception {
        // below is the try block for resources. If exception is throws, try will automatically call the fd.close()
        // There is an interface "Autocloseable". We need to implement this class and provide close() fun for automatically closing user defined resources.
        try (FileReader fd = new FileReader(filename)) {
            throw new Exception("Error reading file");
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;
        int[] arr = {1,2,3,4,5};

        try {
            c = a/b;
            System.out.println(c);
            System.out.println(arr[10]);
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException: " + ex);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("IndexOutOfBoundsException: " + ex);
        } catch (Exception ex) {
            // Base class should be written in the end, since it will catch all base classes.
            // If we write a base class catch statement above, it will catch all an exception.
            System.out.println("Exception: " + ex);
        } finally {
            System.out.println("Compulsory execute");
        }

        // calculateAreaOfRectangle (2,3); // Compilation error, need to add try-catch block for calling this method
        System.out.println("Last statement");
    }
}
