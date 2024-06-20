class Base {
    public Base() {
        System.out.println ("Base::Base()");
    }
    public Base(int a) {
        System.out.println ("Base::Base(a)");
    }
}

class Derived extends Base {
    public Derived() {
        System.out.println ("Derived::Derived()");
    }
    public Derived(int a) {
        System.out.println ("Derived::Derived(a)");
    }
    public Derived(int a, int b) {
        super(a);
        System.out.println ("Derived::Derived(a, b)");
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
    }
    public void HelloWorld() {
        System.out.println("Hello from Inheritance class");
    }
}
