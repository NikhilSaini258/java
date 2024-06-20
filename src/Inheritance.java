// We can have only one base class to any derived class
// Means we can only inherit one class
class Base {
    public int a;
    public Base() {
        System.out.println ("Base::Base()");
    }
    public Base(int a) {
        this.a = a;
        System.out.println ("Base::Base(a)");
    }
    public void Hello() {
        System.out.println("Base::Hello()");
    }
}

class Derived extends Base {
    private int a, b;
    public Derived() {
        System.out.println ("Derived::Derived()");
    }
    public Derived(int a) {
        this.a = a;
        System.out.println ("Derived::Derived(a)");
    }
    public Derived(int a, int b) {
        super(a);
        this.a = a;
        this.b = b;
        System.out.println ("Derived::Derived(a, b)");
    }
    public void print() {
        // Accessing base class variables using "super".
        // "super" represents the Base class part in a current object.
        // If we use "this" here & we have name conflict, then "this" will pick the Derived class member/variable.
        System.out.println (super.a);       // Base class

        // Below will pick "a" from Derived class
        System.out.println (this.a);        // Derived class

        // "this" refer to current object
        System.out.println (this.b);
    }
    // Function Overriding
    @Override
    public void Hello() {
        System.out.println("Derived::Hello()");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // First Base class constructor is called, then constructor of Derived class
        // Base::Base()
        // Derived::Derived()
        Derived obj1 = new Derived();

        // Base::Base()
        // Derived::Derived(a)
        Derived obj2 = new Derived(2);

        // Base::Base(a)
        // Derived::Derived(a, b)
        Derived obj3 = new Derived (2, 3);
        obj3.print();

        // "Base" class reference pointing to a "Derived" class object,
        // But it will only call methods present in Base class, since reference doesn't know about what else present in an object, it is pointing to.
        // But "Base" class reference always calls overridden method (It is different in c++)
        // In Java, methods are virtual by default.
        Base obj4 = new Derived();
        obj4.Hello();       // Derived::Hello()
        obj1.Hello();       // Derived::Hello()
    }
    public void HelloWorld() {
        System.out.println("Hello from Inheritance class");
    }
}
