// Static data is shared by all objects. Therefore, it can be accessed either using className or objects.
// Static variable/methods are stored in the method area, not stack nor heap
// Static members can access only static members
// We can also have static block inside class, which will be executed in the sequence in which it is declared in class

class StaticClass {
    int x = 10;
    static int y = 50;

    static {
        // This is a static block. It is used to initialize the static or final-static variables of the class
        // It is only called when class is loaded -> when an object is created
        System.out.println("Static block 1");
    }
    static {
        System.out.println("Static block 2");
    }

    static void print() {
        System.out.println(y);
        // System.out.println(x);       // Compilation error since static methods can access only static variables
    }
}

// final -> they are constant in Java
// 1. Final variables: constant variables, they can be initialized when we declare them or inside static blocks of the class (only final-static variables).
// 2. Final methods: We cannot override final methods in derived classes.
// 3. Final classes: We cannot extend final class in derived classes.


public class StaticAndFinalClasses {
    public static void main(String[] args) {
        StaticClass obj1 = new StaticClass();
    }
}
